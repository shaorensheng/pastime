CREATE TABLE `doubleball` (
  `id` int(11) NOT NULL COMMENT '期号',
  `red1` int(4) DEFAULT NULL COMMENT '红球1',
  `red2` int(4) DEFAULT NULL COMMENT '红球2',
  `red3` int(4) DEFAULT NULL COMMENT '红球3',
  `red4` int(4) DEFAULT NULL COMMENT '红球4',
  `red5` int(4) DEFAULT NULL COMMENT '红球5',
  `red6` int(4) DEFAULT NULL COMMENT '红球6',
  `blue` int(4) DEFAULT NULL COMMENT '篮球',
  `sales` bigint(20) DEFAULT NULL COMMENT '销量',
  `accumulatedSales` double(20,4) DEFAULT NULL COMMENT '滚存',
  `oneNum` bigint(20) DEFAULT NULL COMMENT '一等奖人数',
  `oneBonus` bigint(20) DEFAULT NULL COMMENT '一等奖奖金',
  `twoNum` bigint(20) DEFAULT NULL COMMENT '二等奖人数',
  `twoBonus` bigint(20) DEFAULT NULL COMMENT '二等奖奖金',
  `threeNum` bigint(20) DEFAULT NULL COMMENT '三等奖人数',
  `fourNum` bigint(20) DEFAULT NULL COMMENT '四等奖人数',
  `fiveNum` bigint(20) DEFAULT NULL COMMENT '五等奖人数',
  `sixNum` bigint(20) DEFAULT NULL COMMENT '六等奖人数',
  `year` int(4) DEFAULT NULL COMMENT '年份',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

