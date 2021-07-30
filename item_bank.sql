/*
 Navicat Premium Data Transfer

 Source Server         : ggboy
 Source Server Type    : MySQL
 Source Server Version : 50711
 Source Host           : localhost:3306
 Source Schema         : item_bank

 Target Server Type    : MySQL
 Target Server Version : 50711
 File Encoding         : 65001

 Date: 30/07/2021 16:33:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bigqstioninfo
-- ----------------------------
DROP TABLE IF EXISTS `bigqstioninfo`;
CREATE TABLE `bigqstioninfo`  (
  `Big_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `Big_question` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Big_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Big_answ` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Big_id`) USING BTREE,
  INDEX `Big_question`(`Big_question`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bigqstioninfo
-- ----------------------------
INSERT INTO `bigqstioninfo` VALUES (8, '20200510221138', '证明1+1=2', '不知道');
INSERT INTO `bigqstioninfo` VALUES (9, '20200510221159', '证明1+9=10', '不知道');
INSERT INTO `bigqstioninfo` VALUES (10, '20200510221216', '证明4*9=90', '不知道');
INSERT INTO `bigqstioninfo` VALUES (11, '20200510221229', '证明9*0=0', '不知道');
INSERT INTO `bigqstioninfo` VALUES (12, '20200512155913', '测试1', '测试1');
INSERT INTO `bigqstioninfo` VALUES (13, '20200512155926', '测试2', '测试2');
INSERT INTO `bigqstioninfo` VALUES (14, '20200512155936', '测试3', '测试3');
INSERT INTO `bigqstioninfo` VALUES (15, '20200512155946', '测试4', '测试4');
INSERT INTO `bigqstioninfo` VALUES (16, '20210118150150', '撒旦撒旦撒打赏的撒旦', '的撒的啊的');
INSERT INTO `bigqstioninfo` VALUES (17, '20210118150159', 'u要让她545 ', '54 45  ');
INSERT INTO `bigqstioninfo` VALUES (18, '20210118150635', '打撒十大大多数阿达阿达啊', '倒萨大苏打');
INSERT INTO `bigqstioninfo` VALUES (19, '20210118150643', '的撒旦啊倒萨大苏打阿斯顿a', '阿达撒旦撒阿达啊');
INSERT INTO `bigqstioninfo` VALUES (20, '20210118150652', '的撒旦撒旦撒打赏啊', '231434324324');
INSERT INTO `bigqstioninfo` VALUES (21, '20210118150701', '43244三千四百四十二万三千四百二十三42 ', '23434  42 24 ');
INSERT INTO `bigqstioninfo` VALUES (22, '20210118150710', '324324 23432 二五rwe', ' 微软为认为热望');
INSERT INTO `bigqstioninfo` VALUES (23, '20210118150718', '惹人44 24 ', '432 4234 热舞认为');

-- ----------------------------
-- Table structure for choiceqstinfo
-- ----------------------------
DROP TABLE IF EXISTS `choiceqstinfo`;
CREATE TABLE `choiceqstinfo`  (
  `ChoiceQst_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `ChoiceQst_question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ChoiceQst_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ChoiceQst_op1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ChoiceQst_op2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ChoiceQst_op3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ChoiceQst_op4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ChoiceQst_answ` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ChoiceQst_id`) USING BTREE,
  INDEX `ChoiceQst_question`(`ChoiceQst_question`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of choiceqstinfo
-- ----------------------------
INSERT INTO `choiceqstinfo` VALUES (8, '20200504214640', '饿我去的', '撒大大', '大苏打', '大大', '阿达', 'B');
INSERT INTO `choiceqstinfo` VALUES (10, '20200510210606', '测试', '1', '2', '3', '4', 'B');
INSERT INTO `choiceqstinfo` VALUES (11, '20200510210626', '测试2', '1', '2', '3', '4', 'B');
INSERT INTO `choiceqstinfo` VALUES (12, '20200510210638', '测试3', '1', '2', '3', '4', 'C');
INSERT INTO `choiceqstinfo` VALUES (13, '20200510210648', '测试4', '1', '2', '3', '4', 'B');
INSERT INTO `choiceqstinfo` VALUES (14, '20200510210703', '测试5', '1', '2', '3', '4', 'D');
INSERT INTO `choiceqstinfo` VALUES (15, '20200510214544', 'dsad s打赏的大事范德萨发士大夫规范广泛的给大哥', '够覆盖', '给对方给定', '古典风格的', '给对方给定', 'C');
INSERT INTO `choiceqstinfo` VALUES (16, '20200512155353', '测试10', '1', '2', '3', '4', 'A');
INSERT INTO `choiceqstinfo` VALUES (17, '20200512155418', '测试11', '1', '2', '3', '4', 'B');
INSERT INTO `choiceqstinfo` VALUES (18, '20200512155434', '测试12', '1', '2', '3', '4', 'B');
INSERT INTO `choiceqstinfo` VALUES (19, '20200512155454', '测试13', '1', '2', '3', '4', 'D');
INSERT INTO `choiceqstinfo` VALUES (20, '20200512155511', '测试14', '1', '23', '3', '4', 'A');
INSERT INTO `choiceqstinfo` VALUES (21, '20200512155523', '测试15', '1', '2', '3', '4', 'C');
INSERT INTO `choiceqstinfo` VALUES (22, '20200512160423', '李志强的测试1', '1', '2', '3', '4', 'B');
INSERT INTO `choiceqstinfo` VALUES (23, '20200512212359', '测试16', '1', '2', '3', '4', 'B');
INSERT INTO `choiceqstinfo` VALUES (24, '20210118145202', '大苏打撒旦撒', '地方大师傅', 'f地方s', '是否是', '方式是 ', 'A');
INSERT INTO `choiceqstinfo` VALUES (25, '20210118145220', '大撒大撒大苏打', '反对法地方', '反对法第三方', '反对是', '发生的是', 'B');
INSERT INTO `choiceqstinfo` VALUES (26, '20210118145356', '库uik天涯舆 ', '的非官方d', '反对观点', '广泛的得到', '更多', 'D');
INSERT INTO `choiceqstinfo` VALUES (27, '20210118145419', '飞洒发顺丰发发反反复复烦烦烦烦烦烦烦烦烦烦烦烦烦烦烦', '范德萨f\'fsd', ' 发生的是否', ' 发生的是', '否是士大夫', 'C');
INSERT INTO `choiceqstinfo` VALUES (28, '20210118145431', '也同样太容易怀疑他合同', '和挺好他', '皇太后他', '和他和他', '和他', 'C');
INSERT INTO `choiceqstinfo` VALUES (29, '20210118145446', '会更好皇太后和体会人和人和', '和体会', '和他', '和体会', '和他谈话', 'D');
INSERT INTO `choiceqstinfo` VALUES (30, '20210118145501', '二分反对发士大夫撒士大夫士大夫发无法无法我f', '发反对法方式都是', '方式地方', '发稍等 ', '的方式是否', 'A');
INSERT INTO `choiceqstinfo` VALUES (31, '20210118145514', '范德萨范德萨发', 'f的房贷首付s', ' 范德萨是否是', '发生的稍等发f', '发生的范德萨', 'B');
INSERT INTO `choiceqstinfo` VALUES (32, '20210118145541', '但是发生的发士大夫所发生的反对', '反对f', '发', ' 反对啊', '啊大是', 'C');
INSERT INTO `choiceqstinfo` VALUES (33, '20210118145558', '大苏打撒旦阿斯顿', '的啊个体户拒绝', '就', '苦于', '就与', 'D');
INSERT INTO `choiceqstinfo` VALUES (34, '20210118145614', '就已经研究院哈哈', '建议就已经', '就', '就说', '一句有就', 'B');
INSERT INTO `choiceqstinfo` VALUES (35, '20210118145638', '2131243四万四千三百二十四', '4 34 53', '3454242', '2414', '4 热更多反对', 'B');
INSERT INTO `choiceqstinfo` VALUES (36, '20210118145653', '图让他一头热儿童', '服务而非我fsd', '发是发士大夫', '2314 34', '423 23', 'C');
INSERT INTO `choiceqstinfo` VALUES (37, '20210118145710', '恶趣味恶趣味恶趣味请问请问', '恶趣味我去饿', '额企鹅q', ' 恶趣味恶趣味', '恶气请问q', 'D');
INSERT INTO `choiceqstinfo` VALUES (38, '20210118145734', '打赏撒旦阿三', 'd是啊是大', '多数打赏大', '的撒大是', '打赏阿斯顿啊', 'D');

-- ----------------------------
-- Table structure for designtestinfo
-- ----------------------------
DROP TABLE IF EXISTS `designtestinfo`;
CREATE TABLE `designtestinfo`  (
  `Design_id` tinyint(32) NOT NULL AUTO_INCREMENT,
  `Design_question` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Design_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Design_answ` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Design_id`) USING BTREE,
  INDEX `Design_question`(`Design_question`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of designtestinfo
-- ----------------------------
INSERT INTO `designtestinfo` VALUES (10, '20200510220452', '简述1+2为什么等于3', '不知道');
INSERT INTO `designtestinfo` VALUES (11, '20200510220514', '简述5+5为什么等于7？', '不知道');
INSERT INTO `designtestinfo` VALUES (12, '20200510220540', '简述9*0为什么等于56', '不知道');
INSERT INTO `designtestinfo` VALUES (13, '20200510220600', '简述4+9为什么等于29', '不知道');
INSERT INTO `designtestinfo` VALUES (14, '20200512155807', '测试9', '测试9');
INSERT INTO `designtestinfo` VALUES (15, '20200512155818', '测试2', '测试2');
INSERT INTO `designtestinfo` VALUES (16, '20200512155835', '测试3', '3测试');
INSERT INTO `designtestinfo` VALUES (17, '20200512155900', '测试6', '测试6');
INSERT INTO `designtestinfo` VALUES (18, '20210118150007', 'D SAFSF SDFDSF SDFDS FDSFS D', 'DSADSA AD A');
INSERT INTO `designtestinfo` VALUES (19, '20210118150016', '31231434发射点发生打发士大夫士大夫稍等', '发生的发生的');
INSERT INTO `designtestinfo` VALUES (20, '20210118150024', '发生的撒旦发射点第三方', '范德萨士大夫打赏');
INSERT INTO `designtestinfo` VALUES (21, '20210118150032', '范德萨发的顺丰特惠规划国土 ', '官方梵蒂冈反对');
INSERT INTO `designtestinfo` VALUES (22, '20210118150042', '广泛的郭德纲梵蒂冈反对梵蒂冈fd', '广泛的广泛的一看就空间 ');
INSERT INTO `designtestinfo` VALUES (23, '20210118150050', '脚后跟激活工具韩国建国后', '脚后跟脚后跟给 ');
INSERT INTO `designtestinfo` VALUES (24, '20210118150059', '可以将已经特瑞tergiversation额', '给而太热它4太3他3 ');
INSERT INTO `designtestinfo` VALUES (25, '20210118150125', '范德萨撒旦发射点sdfs', ' 胜多负少发生的 ');
INSERT INTO `designtestinfo` VALUES (26, '20210118150133', '阿斯顿啊实打实大苏打', '倒萨阿德a');
INSERT INTO `designtestinfo` VALUES (27, '20210118150141', '稍等啊实打实ad', '的撒啊大');

-- ----------------------------
-- Table structure for exam_info
-- ----------------------------
DROP TABLE IF EXISTS `exam_info`;
CREATE TABLE `exam_info`  (
  `id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `course_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `start_time` datetime(0) NULL DEFAULT NULL,
  `end_time` datetime(0) NULL DEFAULT NULL,
  `paper_id` int(10) NULL DEFAULT NULL,
  `status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `teacher_id` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of exam_info
-- ----------------------------
INSERT INTO `exam_info` VALUES ('0d7db5dcfad848349a55ab02087d4268', '1001', '2021-01-20 00:00:00', '2021-01-21 00:00:00', 11, 'end', 1);
INSERT INTO `exam_info` VALUES ('17697cc0235644ac956faf70d96ef606', '1001', '2021-01-14 18:00:00', '2021-01-14 20:00:00', 11, 'end', 1);
INSERT INTO `exam_info` VALUES ('3941ceb307214f5fbc52d222adf636b3', '1001', '2020-11-24 15:10:00', '2020-11-24 16:50:00', 12, 'end', 1);
INSERT INTO `exam_info` VALUES ('44ac205975bf4abda5fdaf0babb57f2f', '1002', '2021-01-18 15:30:00', '2021-01-18 17:00:00', 16, 'end', 1);
INSERT INTO `exam_info` VALUES ('46c8685d8623485a9a53079472982a9f', '1001', '2021-01-11 16:50:00', '2021-01-11 17:50:00', 9, 'end', 1);
INSERT INTO `exam_info` VALUES ('48c47c5f-04cd-478f-ab1d-aac52d70cfeb', '1001', '2020-11-19 08:10:00', '2020-11-19 10:35:00', 10, 'end', 1);
INSERT INTO `exam_info` VALUES ('52c27047773b4c24a958cdb4bbddc35a', '1001', '2021-01-15 15:20:00', '2021-01-15 17:00:00', 13, 'end', 1);
INSERT INTO `exam_info` VALUES ('95307340343f4a79b0022713b5778f17', '1001', '2021-01-21 09:45:00', '2021-01-22 00:00:00', 12, 'end', 1);
INSERT INTO `exam_info` VALUES ('9b10830f-7615-4a72-bed6-408a2a560d01', '1001', '2020-11-21 03:30:00', '2020-11-21 01:30:00', 11, 'end', 1);
INSERT INTO `exam_info` VALUES ('ad02fc5dff2a40968686326784b7f475', '1001', '2021-01-06 16:10:00', '2021-01-06 17:20:00', 9, 'end', NULL);
INSERT INTO `exam_info` VALUES ('c9db5158-817c-48c9-8294-bde34586f0fd', '1001', '2020-11-20 19:00:00', '2020-11-20 17:00:00', 13, 'end', 1);
INSERT INTO `exam_info` VALUES ('d600ea0b1e36469690f86c42d47207ff', '1001', '2021-01-15 20:00:00', '2021-01-15 23:00:00', 15, 'end', 1);
INSERT INTO `exam_info` VALUES ('e716f49cd17946daa7c3e1eef7ad9ff1', '1001', '2021-01-06 16:10:00', '2021-01-06 17:00:00', 9, 'end', NULL);
INSERT INTO `exam_info` VALUES ('ff394aaca83a4ff18337868c4bd3f962', '1002', '2021-01-19 11:00:00', '2021-01-20 11:00:00', 16, 'end', 1);

-- ----------------------------
-- Table structure for questiontypeinfo
-- ----------------------------
DROP TABLE IF EXISTS `questiontypeinfo`;
CREATE TABLE `questiontypeinfo`  (
  `Question_id` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Question_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Question_level` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Question_course` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Question_teacher` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Question_id`) USING BTREE,
  INDEX `Question_course`(`Question_course`) USING BTREE,
  INDEX `Question_teacher`(`Question_teacher`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of questiontypeinfo
-- ----------------------------
INSERT INTO `questiontypeinfo` VALUES ('20200504214640', '选择题', '2', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200505204415', '判断题', '4', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510210606', '选择题', '3', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510210626', '选择题', '4', '1004', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510210638', '选择题', '3', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510210648', '选择题', '4', '1004', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510210703', '选择题', '3', '1004', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510214544', '选择题', '2', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510215642', '判断题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510215709', '判断题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510215735', '判断题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510215749', '判断题', '1', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510215801', '判断题', '2', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510220452', '简答题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510220514', '简答题', '2', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510220540', '简答题', '2', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510220600', '简答题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510221138', '应用题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510221159', '应用题', '4', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510221216', '应用题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200510221229', '应用题', '3', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155353', '选择题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155418', '选择题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155434', '选择题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155454', '选择题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155511', '选择题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155523', '选择题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155643', '判断题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155651', '判断题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155701', '判断题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155723', '判断题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155734', '判断题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155807', '简答题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155818', '简答题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155835', '简答题', '2', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155845', '判断题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155900', '简答题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155913', '应用题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155926', '应用题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155936', '应用题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512155946', '应用题', '5', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20200512160423', '选择题', '5', '1001', '20200428150354');
INSERT INTO `questiontypeinfo` VALUES ('20200512212359', '选择题', '4', '1001', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145202', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145220', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145356', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145419', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145431', '选择题', '', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145446', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145501', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145514', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145541', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145558', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145614', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145638', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145653', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145710', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145734', '选择题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145744', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145754', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145801', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145819', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145829', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145838', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145848', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145857', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145932', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145942', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145951', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118145957', '判断题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150007', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150016', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150024', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150032', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150042', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150050', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150059', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150125', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150133', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150141', '简答题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150150', '应用题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150159', '应用题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150635', '应用题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150643', '应用题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150652', '应用题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150701', '应用题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150710', '应用题', '5', '1002', '1');
INSERT INTO `questiontypeinfo` VALUES ('20210118150718', '应用题', '5', '1002', '1');

-- ----------------------------
-- Table structure for roles_permissions
-- ----------------------------
DROP TABLE IF EXISTS `roles_permissions`;
CREATE TABLE `roles_permissions`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `permission` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roles_permissions
-- ----------------------------
INSERT INTO `roles_permissions` VALUES (1, 'admin', 'sys:kmanager');
INSERT INTO `roles_permissions` VALUES (3, 'teacher', 'tea:tadd');

-- ----------------------------
-- Table structure for specialtyinfo
-- ----------------------------
DROP TABLE IF EXISTS `specialtyinfo`;
CREATE TABLE `specialtyinfo`  (
  `Specialty_id` int(4) NOT NULL AUTO_INCREMENT,
  `Specialty_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Specialty_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of specialtyinfo
-- ----------------------------
INSERT INTO `specialtyinfo` VALUES (1, '理学院');
INSERT INTO `specialtyinfo` VALUES (2, '计科院');
INSERT INTO `specialtyinfo` VALUES (6, '马克思主义学院');

-- ----------------------------
-- Table structure for stu_exam_answ
-- ----------------------------
DROP TABLE IF EXISTS `stu_exam_answ`;
CREATE TABLE `stu_exam_answ`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `stu_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `paper_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `question_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `answ` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `exam_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `is_correct` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu_exam_answ
-- ----------------------------
INSERT INTO `stu_exam_answ` VALUES ('07e747c8c51f4fd6b301807bb7fb47de', '1459a1a214734d8a82f35b462d821515', '12', '20200512155434', 'C', '95307340343f4a79b0022713b5778f17', '0');
INSERT INTO `stu_exam_answ` VALUES ('14a9870b19564853be439abf2dc8906d', '1459a1a214734d8a82f35b462d821515', '12', '20200512155418', 'B', '95307340343f4a79b0022713b5778f17', '1');
INSERT INTO `stu_exam_answ` VALUES ('21ca10630af948ccbb9437e76b4fc3ce', '1459a1a214734d8a82f35b462d821515', '12', '20200512155454', 'B', '95307340343f4a79b0022713b5778f17', '0');
INSERT INTO `stu_exam_answ` VALUES ('21fe3d36c7e1422d901037fc2b6f10ac', '1459a1a214734d8a82f35b462d821515', '12', '20200512155643', 'F', '95307340343f4a79b0022713b5778f17', '1');
INSERT INTO `stu_exam_answ` VALUES ('93b2afffe50942909b5b51aa3fbb6f4d', '1459a1a214734d8a82f35b462d821515', '12', '20200512155723', 'T', '95307340343f4a79b0022713b5778f17', '1');
INSERT INTO `stu_exam_answ` VALUES ('a11d3715d112441385e83e9dd69e874f', '1459a1a214734d8a82f35b462d821515', '12', '20200512155807', '所发生的士大夫发生的 ', '95307340343f4a79b0022713b5778f17', NULL);
INSERT INTO `stu_exam_answ` VALUES ('b1d8af39a6d742bf9d1578a84a9b1ef3', '1459a1a214734d8a82f35b462d821515', '12', '20200512155353', 'C', '95307340343f4a79b0022713b5778f17', '0');
INSERT INTO `stu_exam_answ` VALUES ('b750894ef6dc444490bf300edad538fd', '1459a1a214734d8a82f35b462d821515', '12', '20200512155946', '范德萨方式发是', '95307340343f4a79b0022713b5778f17', NULL);
INSERT INTO `stu_exam_answ` VALUES ('b8041ce2deed4c818f819df39adf42b6', '1459a1a214734d8a82f35b462d821515', '12', '20200512155900', 'dsda ', '95307340343f4a79b0022713b5778f17', NULL);
INSERT INTO `stu_exam_answ` VALUES ('c07fc30808e746c0ae69a0a18fe8e9b2', '1459a1a214734d8a82f35b462d821515', '12', '20200512155523', 'A', '95307340343f4a79b0022713b5778f17', '0');
INSERT INTO `stu_exam_answ` VALUES ('dc4d27f41bd249a29949f720e87863c3', '1459a1a214734d8a82f35b462d821515', '12', '20200512155818', 'DSDAD', '95307340343f4a79b0022713b5778f17', NULL);
INSERT INTO `stu_exam_answ` VALUES ('eab367044d1e47f99edb50cf2915e590', '1459a1a214734d8a82f35b462d821515', '12', '20200512155936', '范德萨发士大夫发生的', '95307340343f4a79b0022713b5778f17', NULL);
INSERT INTO `stu_exam_answ` VALUES ('f25a24bc2f5c441cafb4686c2835aee5', '1459a1a214734d8a82f35b462d821515', '12', '20200512155845', 'T', '95307340343f4a79b0022713b5778f17', '1');

-- ----------------------------
-- Table structure for stu_exam_link
-- ----------------------------
DROP TABLE IF EXISTS `stu_exam_link`;
CREATE TABLE `stu_exam_link`  (
  `id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `stu_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `exam_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `choice_count` float(255, 0) NULL DEFAULT NULL,
  `tof_count` float(255, 0) NULL DEFAULT NULL,
  `design_count` float(255, 0) NULL DEFAULT NULL,
  `big_count` float(255, 0) NULL DEFAULT NULL,
  `sum_count` float(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for stu_info
-- ----------------------------
DROP TABLE IF EXISTS `stu_info`;
CREATE TABLE `stu_info`  (
  `id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `status` int(10) NOT NULL,
  `salt` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `image_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu_info
-- ----------------------------
INSERT INTO `stu_info` VALUES ('1459a1a214734d8a82f35b462d821515', '强大爷的', '18080259326', 'F00C39934A0F1D44C002FA44AC58574D', 1, '8222', 'D:/我的文档/Documents/HBuilderProjects/exam/static/img/head/1459a1a214734d8a82f35b462d821515/16105242606291459a1a214734d8a82f35b462d821515.jpg');

-- ----------------------------
-- Table structure for stu_specialty_link
-- ----------------------------
DROP TABLE IF EXISTS `stu_specialty_link`;
CREATE TABLE `stu_specialty_link`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `stu_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `specialty_id` int(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu_specialty_link
-- ----------------------------
INSERT INTO `stu_specialty_link` VALUES ('0eed6f452f3d4358a01030642ea8229a', '1459a1a214734d8a82f35b462d821515', 1);

-- ----------------------------
-- Table structure for stu_tea_course_link
-- ----------------------------
DROP TABLE IF EXISTS `stu_tea_course_link`;
CREATE TABLE `stu_tea_course_link`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `stu_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `course_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tea_id` int(20) NOT NULL,
  `delete_flag` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu_tea_course_link
-- ----------------------------
INSERT INTO `stu_tea_course_link` VALUES ('45fb91a9c3d84d9b95fe077b0a0ce4fa', '1459a1a214734d8a82f35b462d821515', '1003', 1, 0);
INSERT INTO `stu_tea_course_link` VALUES ('4f966c852ec345f38fb2245a25fe3222', '1459a1a214734d8a82f35b462d821515', '1001', 1, 0);
INSERT INTO `stu_tea_course_link` VALUES ('5612692915454375bc39a687390ad335', '1459a1a214734d8a82f35b462d821515', '1002', 1, 1);
INSERT INTO `stu_tea_course_link` VALUES ('9dc15f9fc3e1475eab4dd8a75949da93', '1459a1a214734d8a82f35b462d821515', '1001', 1, 1);
INSERT INTO `stu_tea_course_link` VALUES ('c0b184c44aa0492abcb1ceb76c67510d', '1459a1a214734d8a82f35b462d821515', '1002', 1, 0);
INSERT INTO `stu_tea_course_link` VALUES ('fe915cf9017543cdbe055474bf41517e', '1459a1a214734d8a82f35b462d821515', '1001', 1, 0);

-- ----------------------------
-- Table structure for subjectinfo
-- ----------------------------
DROP TABLE IF EXISTS `subjectinfo`;
CREATE TABLE `subjectinfo`  (
  `Course_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科目信息表',
  `Course_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Course_Specialty` int(4) NOT NULL,
  PRIMARY KEY (`Course_id`, `Course_Specialty`) USING BTREE,
  INDEX `Course_Specialty`(`Course_Specialty`) USING BTREE,
  INDEX `Course_id`(`Course_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of subjectinfo
-- ----------------------------
INSERT INTO `subjectinfo` VALUES ('1001', '概率论', 1);
INSERT INTO `subjectinfo` VALUES ('1002', '数学分析', 1);
INSERT INTO `subjectinfo` VALUES ('1003', '数值分析', 1);
INSERT INTO `subjectinfo` VALUES ('1004', '常微分方程', 1);
INSERT INTO `subjectinfo` VALUES ('1005', '算法分析与设计', 1);
INSERT INTO `subjectinfo` VALUES ('1006', '上网', 1);
INSERT INTO `subjectinfo` VALUES ('1007', 'java从入门到放弃', 2);
INSERT INTO `subjectinfo` VALUES ('1008', 'c++从入门到入土', 2);
INSERT INTO `subjectinfo` VALUES ('1009', '马原', 6);
INSERT INTO `subjectinfo` VALUES ('1010', 'python从入门到入狱', 2);

-- ----------------------------
-- Table structure for tea_access
-- ----------------------------
DROP TABLE IF EXISTS `tea_access`;
CREATE TABLE `tea_access`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `course_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `stu_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tea_id` int(20) NOT NULL,
  `access` tinyint(2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tea_access
-- ----------------------------
INSERT INTO `tea_access` VALUES ('00d74ece7a7044028f0aad3b8af32818', '1003', '1459a1a214734d8a82f35b462d821515', 1, 1);
INSERT INTO `tea_access` VALUES ('0dbb29a365a44357a7aedc86838147df', '1003', '1459a1a214734d8a82f35b462d821515', 1, 0);
INSERT INTO `tea_access` VALUES ('1c49427e197848888defd03c830b71f5', '1002', '1459a1a214734d8a82f35b462d821515', 1, 1);
INSERT INTO `tea_access` VALUES ('2721e1515e8e4e0a85c211337a198966', '1001', '1459a1a214734d8a82f35b462d821515', 1, 1);
INSERT INTO `tea_access` VALUES ('60e160698cd2481eb165bd2d99bee841', '1001', '1459a1a214734d8a82f35b462d821515', 1, 1);
INSERT INTO `tea_access` VALUES ('8caa37f8a64049aaa398de3101301ffd', '1004', '1459a1a214734d8a82f35b462d821515', 1, 0);
INSERT INTO `tea_access` VALUES ('944f17096aa440cb97ee99e2ff442385', '1003', '1459a1a214734d8a82f35b462d821515', 1, 0);
INSERT INTO `tea_access` VALUES ('a147bd09a5a544b692ca363330eb29d6', '1002', '1459a1a214734d8a82f35b462d821515', 1, 1);

-- ----------------------------
-- Table structure for tea_course_link
-- ----------------------------
DROP TABLE IF EXISTS `tea_course_link`;
CREATE TABLE `tea_course_link`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tea_id` int(10) NOT NULL,
  `course_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tea_course_link
-- ----------------------------
INSERT INTO `tea_course_link` VALUES ('3a64f0c675804338a7c37c71edbb932b', 1, '1003', '1');
INSERT INTO `tea_course_link` VALUES ('72f3d5294bfe4c5dba0dfc5c85e4068b', 1, '1006', '1');
INSERT INTO `tea_course_link` VALUES ('87bc4b86f5a744bdb04bb91a03421353', 1, '1001', '1');
INSERT INTO `tea_course_link` VALUES ('905ef426397044d5a35e3d0e2dce0858', 1, '1002', '1');
INSERT INTO `tea_course_link` VALUES ('ae30c05dc9064c47b0cf129dbeb9c9b4', 1, '1005', '0');
INSERT INTO `tea_course_link` VALUES ('bdfa3f8023f34613b48e49d672e15d26', 1, '1004', '1');

-- ----------------------------
-- Table structure for testpaperinfo
-- ----------------------------
DROP TABLE IF EXISTS `testpaperinfo`;
CREATE TABLE `testpaperinfo`  (
  `Paper_id` int(20) NOT NULL AUTO_INCREMENT,
  `Paper_course` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Paper_madedate` datetime(0) NOT NULL,
  `Paper_teacher` char(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Paper_choiceInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Paper_TOFInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Paper_DesignInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Paper_BigInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Paper_level` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Paper_id`) USING BTREE,
  INDEX `Paper_course`(`Paper_course`) USING BTREE,
  INDEX `Paper_teacher`(`Paper_teacher`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of testpaperinfo
-- ----------------------------
INSERT INTO `testpaperinfo` VALUES (9, '1001', '2020-05-12 18:09:55', '1', '20200504214640,20200510214544,20200512155353,20200512155418', '20200510215642,20200510215709,20200510215735', '20200510220452,20200510220540,20200510220600', '20200510221138,20200510221159,20200510221216', '自定义');
INSERT INTO `testpaperinfo` VALUES (10, '1001', '2020-05-12 18:13:09', '1', '20200504214640,20200510214544', '20200510215642,20200510215709,20200510215735', '20200510220452,20200510220514', '20200510221138,20200510221159', '自定义');
INSERT INTO `testpaperinfo` VALUES (11, '1001', '2020-05-12 18:27:27', '1', '20200512160423,20200512155511,20200512155523,20200512155353,20200512155418', '20200512155701,20200512155723,20200512155651,20200512155734,20200512155845', '20200512155807,20200512155818', '20200512155946,20200512155913', '5');
INSERT INTO `testpaperinfo` VALUES (12, '1001', '2020-05-12 18:33:32', '1', '20200512155454,20200512155434,20200512155523,20200512155418,20200512155353', '20200512155845,20200512155643,20200512155723', '20200512155900,20200512155818,20200512155807', '20200512155936,20200512155946', '5');
INSERT INTO `testpaperinfo` VALUES (13, '1001', '2020-05-12 19:55:58', '1', '20200512155454,20200512155353,20200512155418,20200512155523,20200512160423', '20200512155734,20200512155845,20200512155701,20200512155723', '20200512155900,20200512155807,20200512155818', '20200512155946,20200512155926', '5');
INSERT INTO `testpaperinfo` VALUES (14, '1001', '2020-05-12 21:33:29', '1', '20200512155418,20200512160423,20200512155454,20200512155353', '20200512155643,20200512155845', '20200512155900,20200512155807,20200512155818', '20200512155946,20200512155926', '5');
INSERT INTO `testpaperinfo` VALUES (15, '1001', '2020-09-04 20:54:11', '1', '20200504214640,20200510214544,20200512155353', '20200510215642,20200510215709,20200510215735,20200510215749', '20200510220452,20200510220540,20200510220600,20200512155807,20200512155818', '20200510221138,20200510221159,20200510221216,20200512155913', '自定义');
INSERT INTO `testpaperinfo` VALUES (16, '1002', '2021-01-18 15:07:48', '1', '20210118145541,20210118145356,20210118145446,20210118145220,20210118145202,20210118145558,20210118145514,20210118145614,20210118145638,20210118145653', '20210118145744,20210118145754,20210118145951,20210118145857,20210118145942', '20210118150141,20210118150024,20210118150007', '20210118150635,20210118150643,20210118150718', '5');
INSERT INTO `testpaperinfo` VALUES (17, '1002', '2021-01-18 15:17:40', '1', '20210118145558,20210118145419,20210118145734,20210118145501,20210118145220,20210118145653,20210118145202,20210118145710,20210118145446,20210118145638', '20210118145857,20210118145744,20210118145819,20210118145957,20210118145951,20210118145801,20210118145942', '20210118150032,20210118150133,20210118150016,20210118150141', '20210118150701,20210118150643,20210118150718,20210118150150,20210118150159', '5');

-- ----------------------------
-- Table structure for tofinfo
-- ----------------------------
DROP TABLE IF EXISTS `tofinfo`;
CREATE TABLE `tofinfo`  (
  `TOrF_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `TOF_question` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TOF_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TOF_answ` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`TOrF_id`) USING BTREE,
  INDEX `TOF_question`(`TOF_question`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tofinfo
-- ----------------------------
INSERT INTO `tofinfo` VALUES (9, '20200505204415', 'ssdad', 'F');
INSERT INTO `tofinfo` VALUES (10, '20200510215642', '1+2=1', 'F');
INSERT INTO `tofinfo` VALUES (11, '20200510215709', '1+10=11', 'T');
INSERT INTO `tofinfo` VALUES (12, '20200510215735', '1*59954894=∞', 'F');
INSERT INTO `tofinfo` VALUES (13, '20200510215749', '13434+4578295=1', 'F');
INSERT INTO `tofinfo` VALUES (14, '20200510215801', '5+9=2', 'F');
INSERT INTO `tofinfo` VALUES (15, '20200512155643', '测试1', 'F');
INSERT INTO `tofinfo` VALUES (16, '20200512155651', '测试2', 'T');
INSERT INTO `tofinfo` VALUES (17, '20200512155701', '测试3', 'T');
INSERT INTO `tofinfo` VALUES (18, '20200512155723', '测试5', 'T');
INSERT INTO `tofinfo` VALUES (19, '20200512155734', '测试6', 'T');
INSERT INTO `tofinfo` VALUES (20, '20200512155845', '测试5', 'T');
INSERT INTO `tofinfo` VALUES (21, '20210118145744', '撒大大撒旦', 'F');
INSERT INTO `tofinfo` VALUES (22, '20210118145754', '啊实打实打算打赏啊', 'F');
INSERT INTO `tofinfo` VALUES (23, '20210118145801', '的撒旦阿斯顿阿三', 'T');
INSERT INTO `tofinfo` VALUES (24, '20210118145819', '撒旦啊实打实阿达啊', 'T');
INSERT INTO `tofinfo` VALUES (25, '20210118145829', '2131343223234324324', 'T');
INSERT INTO `tofinfo` VALUES (26, '20210118145838', '554644453534', 'F');
INSERT INTO `tofinfo` VALUES (27, '20210118145848', '阿萨ASADSA DSD A DA A', 'F');
INSERT INTO `tofinfo` VALUES (28, '20210118145857', 'DSAD ASDAS DAD ASD A', 'F');
INSERT INTO `tofinfo` VALUES (29, '20210118145932', 'SADASDSAD ASDASD D SAA D', 'T');
INSERT INTO `tofinfo` VALUES (30, '20210118145942', 'E E3RWE RWERE WER  S', 'F');
INSERT INTO `tofinfo` VALUES (31, '20210118145951', 'EE E E32 4343 23', 'F');
INSERT INTO `tofinfo` VALUES (32, '20210118145957', 'WERWE RR23R 23R R2R', 'T');

-- ----------------------------
-- Table structure for user_roles
-- ----------------------------
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE `user_roles`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_roles
-- ----------------------------
INSERT INTO `user_roles` VALUES (1, 'zhangsan', 'teacher');
INSERT INTO `user_roles` VALUES (2, 'admin', 'admin');
INSERT INTO `user_roles` VALUES (3, '18080259326', 'teacher');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Teacher_id` char(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Teacher_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Teacher_Specialty` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `flag` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'zhangsan', '123456', '1', '张三爷', '1', '1', 'D:/我的文档/Documents/HBuilderProjects/exam/static/img/head/1/16093131519181.jpg');
INSERT INTO `users` VALUES (2, 'admin', '123456', '2', '超级管理员', '1', '1', NULL);
INSERT INTO `users` VALUES (6, '110', '123456', '202004282250', '帅哥', '2', '0', NULL);

SET FOREIGN_KEY_CHECKS = 1;
