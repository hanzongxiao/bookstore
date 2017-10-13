-- 初始化所有表
CREATE DATABASE bookstore CHARACTER SET UTF8;
USE bookstore;
-- 图书分类表
CREATE TABLE TYPES(
  id VARCHAR(32) PRIMARY KEY, -- 编号
  NAME VARCHAR(50),  -- 分类名称
  descr VARCHAR(200)  -- 备注
);

-- 图书信息表
CREATE TABLE books(
	id VARCHAR(32) PRIMARY KEY, -- 编号
	NAME VARCHAR(50),  -- 图书名称
	price NUMERIC(10,2), -- 价格
	auth VARCHAR(30), -- 作者
	img VARCHAR(100), -- 图片地址
	rebate NUMERIC(3,2), -- 折扣
	stock INT,   -- 库存
	publisher VARCHAR(100), -- 出版社
	publishdate VARCHAR(19), -- 出版日期
	pages INT,   -- 页码
	size INT,     -- 开本（如16开）
	printtimes INT, -- 印刷次数
	versions INT,  -- 版本
	brief TEXT,   -- 简介
	content TEXT,   -- 目录
	onlinetime varchar(19) -- 上线时间
);

-- 图书 -分类 关系表
create table booktype(
   bookid varchar(32) not null,  -- 图书编号（外键）
   typeid varchar(32) not null,  -- 分类编号（外键）
   CONSTRAINT btpk primary key(bookid,typeid), -- 设置主键
   constraint btfk1 foreign key(bookid) references books(id), -- 设置外键
   constraint btfk2 foreign key(typeid) references types(id)  -- 设置外键
);

-- 管理员信息表
CREATE TABLE admins(
  id VARCHAR(32) PRIMARY KEY, -- 编号
  NAME VARCHAR(30), -- 用户名
  PASSWORD VARCHAR(32), -- 密码
  sex CHAR(1),  -- 性别
  email VARCHAR(50),  -- 邮箱
  descr VARCHAR(200)  -- 备注
);

-- 前台用户表
CREATE TABLE users(
	id VARCHAR(32) PRIMARY KEY, -- 编号
	NAME VARCHAR(50), -- 用户名
	PASSWORD VARCHAR(32), -- 密码
	phone VARCHAR(50), -- 手机
	email VARCHAR(50) --  邮箱
);

-- 发货地址表
CREATE TABLE address(
	id VARCHAR(32) PRIMARY KEY, -- 编号
	NAME VARCHAR(50), -- 发货地址
	phone VARCHAR(50), -- 联系电话
	zip VARCHAR(50), -- 邮编
	dft CHAR(1) default '0', -- 是否设置为默认
	userid VARCHAR(32),  -- 用户编号（外键）
	mktime varchar(19), -- 创建时间
	CONSTRAINT addr_fk1 FOREIGN KEY(userid) REFERENCES users(id) -- 设置外键
);

-- 订单表
CREATE TABLE orders(
	id VARCHAR(32) PRIMARY 	KEY, -- 编号
	userid VARCHAR(32), -- 用户编号（外键）
	consignee VARCHAR(300), -- 收货人
	paytype CHAR(1), -- 付款方式
	amt NUMERIC(10,2), -- 总金额
	state CHAR(1), -- 订单状态（0：等待发货;1:商家已发货;2:交易已经完成;3:交易已取消;4:商户已退货）
	orderdate VARCHAR(19), -- 下订单时间
	CONSTRAINT orders_fk FOREIGN KEY(userid) REFERENCES users(id) -- 设置外键
);

-- 订单明细表
CREATE TABLE orderline(
	id VARCHAR(32) PRIMARY KEY, -- 编号
	orderid VARCHAR(32), -- 订单编号（外键）
	bookid VARCHAR(32), -- 图书编号（外键）
	Amt  INT, -- 合计
	price NUMERIC(10,2), -- 价格
	CONSTRAINT orderline_fk FOREIGN KEY(orderid) REFERENCES orders(id), -- 设置外键
	CONSTRAINT orderline_fk2 FOREIGN KEY(bookid) REFERENCES books(id) -- 设置外键
);
