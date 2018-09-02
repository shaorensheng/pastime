package cn.coders.pastime.service.controller;

import cn.coders.pastime.entity.Doubleball;
//import cn.coders.pastime.service.service.HelloService;
import cn.coders.pastime.entity.highcharts.Container;
import cn.coders.pastime.entity.highcharts.chart.*;
import cn.coders.pastime.entity.highcharts.chart.plotOptions.Scatter;
import cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter.Hover;
import cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter.MarkerOne;
import cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter.States;
import cn.coders.pastime.entity.highcharts.chart.plotOptions.scatter.Tooltip;
import cn.coders.pastime.entity.highcharts.chart.xAxis.Title;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * service
 *
 * @author shaorensheng
 * @date 2018/8/22 12:10
 */
@Controller
@RequestMapping("/hi")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

//    @Autowired
//    HelloService helloService;
    @GetMapping("/say")
    String say(@RequestParam(value = "name") String name){
        return "view/demo";
    }

    @RequestMapping("/take")
    String take(Model model){
        Container container = new Container();
        //chart
        Chart chart = new Chart();
        chart.setType("scatter");
        chart.setZoomType("xy");
        //title
        Title title = new Title();
        title.setText("XXX分布图");
        //subtitle
        Subtitle subtitle = new Subtitle();
        subtitle.setText("数据来源：XXX");
        //X
        XAxis xAxis = new XAxis();
        Title xTitle = new Title();
        xTitle.setEnabled(true);
        xTitle.setText("身高（cm）");
        xAxis.setTitle(xTitle);
        xAxis.setStartOnTick(true);
        xAxis.setEndOnTick(true);
        xAxis.setShowLastLabel(true);
        //Y
        YAxis yAxis = new YAxis();
        Title yTitle = new Title();
        yTitle.setText("体重（kg）");
        yAxis.setTitle(yTitle);
        //legend
        Legend legend = new Legend();
        legend.setLayout("vertical");
        legend.setAlign("left");
        legend.setVerticalAlign("top");
        legend.setX(100);
        legend.setY(70);
        legend.setFloating(true);
        legend.setBackgroundColor("#FFFFFF");
        legend.setBorderWidth(1);
        //plotOptions
        PlotOptions plotOptions = new PlotOptions();
        //scatter
        Scatter scatter = new Scatter();
        MarkerOne marker = new MarkerOne();
        States states = new States();
        Hover hover = new Hover();
        hover.setEnabled(true);
        hover.setLineColor("rgb(100,100,100)");
        states.setHover(hover);
        marker.setRadius(5);
        marker.setStates(states);
        //states
        States states1 = new States();
        Hover hover1 = new Hover();
        MarkerOne marker1 = new MarkerOne();
        marker1.setEnabled(true);
        hover1.setMarker(marker1);
        states1.setHover(hover1);
        //tooltip
        Tooltip tooltip = new Tooltip();
        tooltip.setHeaderFormat("<b>{series.name}</b><br>");
        tooltip.setPointFormat("{point.x} cm, {point.y} kg");
        plotOptions.setScatter(scatter);
        //series
        List<Series> series = new ArrayList<>();
        //女
        Series women = new Series();
        women.setName("女");
        women.setColor("rgba(223,83,83,.5)");
        List<List> womens = new ArrayList<>();
        List womenList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            womenList.add(random.nextDouble() * 100);
            womenList.add(random.nextDouble() * 100);
            womens.add(womenList);
        }
        women.setData(womens);
        //男
        Series men = new Series();
        men.setName("女");
        men.setColor("rgba(223,83,83,.5)");
        List<List> mens = new ArrayList<>();
        List menList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            menList.add(random.nextDouble() * 100);
            menList.add(random.nextDouble() * 100);
            mens.add(menList);
        }
        men.setData(mens);
        series.add(women);
        series.add(men);
        container.setChart(chart);
        container.setTitle(title);
        container.setSubtitle(subtitle);
        container.setXAxis(xAxis);
        container.setYAxis(yAxis);
        container.setLegend(legend);
        container.setPlotOptions(plotOptions);
        container.setSeries(series);
        String s = JSONObject.toJSONString(container);
        log.info(s);
        model.addAttribute("container",container);
        return "view/demo";
    }
}
