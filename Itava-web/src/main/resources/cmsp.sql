/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : cmsp

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-05-21 22:23:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bs_department
-- ----------------------------
DROP TABLE IF EXISTS `bs_department`;
CREATE TABLE `bs_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `departName` varchar(64) DEFAULT NULL COMMENT '部门名称',
  `departCode` varchar(64) DEFAULT NULL COMMENT '部门编码',
  `departLevel` int(11) DEFAULT NULL COMMENT '0根1一级2二级  部门等级',
  `isLeafNode` int(11) DEFAULT NULL COMMENT '是否叶子节点 0否1是',
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(11) DEFAULT NULL COMMENT '创建人',
  `updated` date DEFAULT NULL COMMENT '更新时间',
  `updatedby` int(11) DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT '状态 0正常1删除2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bs_function
-- ----------------------------
DROP TABLE IF EXISTS `bs_function`;
CREATE TABLE `bs_function` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `funName` varchar(64) DEFAULT NULL COMMENT '功能名称',
  `funCode` varchar(64) DEFAULT NULL,
  `funDesc` varchar(1024) DEFAULT NULL COMMENT '功能描述',
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(11) DEFAULT NULL COMMENT '创建人',
  `updated` date DEFAULT NULL COMMENT '更新时间',
  `updatedby` int(11) DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT '状态 0正常1删除2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bs_resource
-- ----------------------------
DROP TABLE IF EXISTS `bs_resource`;
CREATE TABLE `bs_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `menuCode` varchar(128) DEFAULT NULL COMMENT '菜单代码',
  `menuUrl` varchar(512) DEFAULT NULL COMMENT '菜单URL',
  `menuName` varchar(128) DEFAULT NULL COMMENT '菜单名称',
  `menuLevel` int(11) DEFAULT NULL COMMENT '菜单等级 0根1一级2二级',
  `isLeafNode` int(11) DEFAULT NULL COMMENT '是否叶子节点 0否1是',
  `parentId` int(11) DEFAULT NULL COMMENT '父级菜单id',
  `menuImgPath` varchar(255) DEFAULT NULL COMMENT '菜单图片',
  `menuDesc` varchar(1024) DEFAULT NULL COMMENT '菜单描述',
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(10) unsigned zerofill DEFAULT NULL COMMENT '创建人',
  `updated` date DEFAULT NULL COMMENT '更新时间',
  `updatedby` int(11) DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT '状态 0正常1删除2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bs_resource_fun
-- ----------------------------
DROP TABLE IF EXISTS `bs_resource_fun`;
CREATE TABLE `bs_resource_fun` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `resourceId` int(11) DEFAULT NULL COMMENT '资源id 关联bs_resource的主键id',
  `funcId` int(11) DEFAULT NULL COMMENT '功能id 关联bs_function的主键id',
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(11) DEFAULT NULL COMMENT '创建人',
  `updated` date DEFAULT NULL COMMENT '更新时间',
  `updatedby` int(11) DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT '状态 0正常1删除2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bs_role
-- ----------------------------
DROP TABLE IF EXISTS `bs_role`;
CREATE TABLE `bs_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `roleName` varchar(64) DEFAULT NULL COMMENT '角色名称',
  `roleDesc` varchar(1024) DEFAULT NULL COMMENT '角色描述',
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(11) DEFAULT NULL COMMENT '创建人',
  `updated` date DEFAULT NULL COMMENT '更新时间',
  `updatedby` int(11) DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT '状态 0正常1删除2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

-- ----------------------------
-- Table structure for bs_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `bs_role_resource`;
CREATE TABLE `bs_role_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `resourceId` int(11) DEFAULT NULL COMMENT '资源id 关联bs_resource的主键id',
  `roleId` int(11) DEFAULT NULL COMMENT '关联bs_role的主键id',
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(11) DEFAULT NULL COMMENT '创建人',
  `updated` int(11) DEFAULT NULL COMMENT '更新时间',
  `updatedby` date DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT '状态 0正常1删除2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bs_user
-- ----------------------------
DROP TABLE IF EXISTS `bs_user`;
CREATE TABLE `bs_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(64) DEFAULT NULL COMMENT '登录名',
  `passWord` varchar(128) DEFAULT NULL COMMENT '密码',
  `trueName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `sex` int(11) DEFAULT NULL COMMENT '性别 0女1男',
  `age` int(11) DEFAULT NULL COMMENT '年龄 0<age<150',
  `telephone` varchar(30) DEFAULT NULL COMMENT '手机号码',
  `departId` int(11) DEFAULT NULL COMMENT '部门id',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `remark` varchar(1024) DEFAULT NULL COMMENT '备注',
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(11) DEFAULT NULL COMMENT '创建人',
  `updated` date DEFAULT NULL COMMENT '更新时间',
  `updatedby` int(11) DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT ' 状态 0正常1删除2无效',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bs_user_role
-- ----------------------------
DROP TABLE IF EXISTS `bs_user_role`;
CREATE TABLE `bs_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userId` int(11) NOT NULL COMMENT '关联bs_user的主键id',
  `roleId` int(11) NOT NULL,
  `created` date DEFAULT NULL COMMENT '创建时间',
  `createdby` int(11) DEFAULT NULL COMMENT '创建人',
  `updated` date DEFAULT NULL COMMENT '更新时间',
  `updatedby` int(11) DEFAULT NULL COMMENT '更新人',
  `status` int(11) DEFAULT NULL COMMENT '状态 0正常1删除2无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
