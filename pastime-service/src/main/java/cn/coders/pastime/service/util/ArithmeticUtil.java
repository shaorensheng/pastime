package cn.coders.pastime.service.util;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.Arrays.sort;

/**
 * @author shaorensheng
 * @date 2018/12/20 11:03
 */
public class ArithmeticUtil {

    private static final Logger log = LoggerFactory.getLogger(ArithmeticUtil.class);


    /**
     * 递归二分查找
     * @param key   待查找的值
     * @param a     有序数组
     * @param start 开始下标
     * @param end 结束下标
     * @return
     */
    public static int binarySearch(int key, int[]a, int start, int end){
        //start不可能大于end
        if (start > end){
            return -1;
        }
        //获取中间位置的下标
        int index = start + (end - start) / 2;
        if (a[index] > key){
            //中间位置的值大于待查找的值，则从前区接着找，因为当前位置的值已经比较过，所以-1
            return binarySearch(key, a, start, index -1);
        } else if (a[index] < key){
            //中间位置的值小于待查找的值，则从后区接着找，因为当前位置的值已经比较过，所以+1
            return binarySearch(key, a, index + 1, end);
        }
        //值相等，返回
        return index;
    }
    public static void main(String[] args) {
        int[] a = {5,10,15,20,25,30,35,40};
        int key = 40;
        System.out.println(JSONObject.toJSONString(a));
        int index = binarySearch(key, a, 0, a.length - 1);
        log.info("key：{}，在数组中的下标为：{}",key,index);
    }
}
