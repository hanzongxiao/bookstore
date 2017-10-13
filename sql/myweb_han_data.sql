-- 初始化数据
use bookstore;

-- 以下是图书分类
insert into types values('T001','计算机类','计算机类');
insert into types values('T002','管理类','管理类');
insert into types values('T003','医学类','医学类');

-- 以下是图书信息
insert into books values('B001','计算机基础',34.12,'张三','a.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'计算机基础教学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B002','管理学基础',34.12,'张三','b.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'一本关于政治的图书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B003','大家风范',34.12,'李四','c.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'小学语言学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B004','小学语言学',34.12,'王五','d.jpg',0.87,100,'传智播客出版社','2011-01-09',344,16,1,1,'最基础的学习方法教学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B005','Java基础',34.12,'马七','e.jpg',0.77,100,'传智播客出版社','2011-01-09',344,16,1,1,'人海战术','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B006','数据库入门',34.12,'那六','f.jpg',0.30,100,'传智播客出版社','2011-01-09',344,16,1,1,'网络的配置说明','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B007','SqlServer',34.12,'小胡','g.jpg',0.9,100,'传智播客出版社','2011-01-09',344,16,1,1,'大家都说说这是为什么','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B008','JavaEE',34.12,'老江','h.jpg',0.5,100,'传智播客出版社','2011-01-09',344,16,1,1,'海关总说明书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');

-- 以下是分类与图书关系数据
insert into booktype values('B001','T001');
insert into booktype values('B002','T002');
insert into booktype values('B003','T003');
insert into booktype values('B004','T001');
insert into booktype values('B005','T002');
insert into booktype values('B006','T003');
insert into booktype values('B007','T002');
insert into booktype values('B008','T001');

-- 以下是管理员信息
INSERT INTO admins(id,NAME,PASSWORD) VALUES('A001','eric','6046aa19f0c57731b4afe5647694b2bb');
INSERT INTO admins(id,NAME,PASSWORD) VALUES('A002','jacky','78f8c66288137831f4f7fc799e5b8a4d');
INSERT INTO admins(id,NAME,PASSWORD) VALUES('A003','rose','ff4407b06bd3896aa293937a1603770d');

















-- 初始化数据
use bookstore;

-- 以下是图书分类
insert into types values('T001','计算机类','计算机类');
insert into types values('T002','管理类','管理类');
insert into types values('T003','医学类','医学类');

-- 以下是图书信息
insert into books values('B001','计算机基础',34.12,'张三','a.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'计算机基础教学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B002','管理学基础',34.12,'张三','b.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'一本关于政治的图书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B003','大家风范',34.12,'李四','c.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'小学语言学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B004','小学语言学',34.12,'王五','d.jpg',0.87,100,'传智播客出版社','2011-01-09',344,16,1,1,'最基础的学习方法教学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B005','Java基础',34.12,'马七','e.jpg',0.77,100,'传智播客出版社','2011-01-09',344,16,1,1,'人海战术','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B006','数据库入门',34.12,'那六','f.jpg',0.30,100,'传智播客出版社','2011-01-09',344,16,1,1,'网络的配置说明','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B007','SqlServer',34.12,'小胡','g.jpg',0.9,100,'传智播客出版社','2011-01-09',344,16,1,1,'大家都说说这是为什么','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B008','JavaEE',34.12,'老江','h.jpg',0.5,100,'传智播客出版社','2011-01-09',344,16,1,1,'海关总说明书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B009','数学之美(第二版)',34.12,'张三','1.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'计算机基础教学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B010','计算机应用基础（第2版）',34.12,'张三','2.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'一本关于政治的图书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B011','编译原理（第2版）——计算机科学丛书',34.12,'李四','3.jpg',1.0,100,'传智播客出版社','2011-01-09',344,16,1,1,'小学语言学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B012','云计算与分布式系统：从并行处理到物联网',34.12,'王五','4.jpg',0.87,100,'传智播客出版社','2011-01-09',344,16,1,1,'最基础的学习方法教学','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B013','深入理解计算机系统（英文版·第2版）',34.12,'马七','5.jpg',0.77,100,'传智播客出版社','2011-01-09',344,16,1,1,'人海战术','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B014','数据库入门',34.12,'那六','6.jpg',0.30,100,'传智播客出版社','2011-01-09',344,16,1,1,'网络的配置说明','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B015','算法谜题',34.12,'小胡','7.jpg',0.9,100,'传智播客出版社','2011-01-09',344,16,1,1,'大家都说说这是为什么','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B016','云计算（第二版）',34.12,'老江','8.jpg',0.5,100,'传智播客出版社','2011-01-09',344,16,1,1,'海关总说明书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B017','爱上单片机(第3版)',34.12,'小胡','9.jpg',0.9,100,'传智播客出版社','2011-01-09',344,16,1,1,'大家都说说这是为什么','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B018','中文版Photoshop CS4实例与操作',34.12,'老江','10.jpg',0.5,100,'传智播客出版社','2011-01-09',344,16,1,1,'海关总说明书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B019','数据结构与算法分析（C++语言描述）（第2版）',34.12,'小胡','11.jpg',0.9,100,'传智播客出版社','2011-01-09',344,16,1,1,'大家都说说这是为什么','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');
insert into books values('B020','计算机建模与仿真技术',34.12,'老江','12.jpg',0.5,100,'传智播客出版社','2011-01-09',344,16,1,1,'海关总说明书','第一章：计算机入门<br/>第二章：计算机管理','2009-09-08');

-- 以下是分类与图书关系数据
insert into booktype values('B001','T001');
insert into booktype values('B002','T002');
insert into booktype values('B003','T003');
insert into booktype values('B004','T001');
insert into booktype values('B005','T002');
insert into booktype values('B006','T003');
insert into booktype values('B007','T002');
insert into booktype values('B008','T001');
insert into booktype values('B009','T001');
insert into booktype values('B010','T001');
insert into booktype values('B011','T001');
insert into booktype values('B012','T001');
insert into booktype values('B013','T001');
insert into booktype values('B014','T001');
insert into booktype values('B015','T001');
insert into booktype values('B016','T001');
insert into booktype values('B017','T001');
insert into booktype values('B018','T001');
insert into booktype values('B019','T001');
insert into booktype values('B020','T001');
-- 以下是管理员信息
INSERT INTO admins(id,NAME,PASSWORD) VALUES('A001','eric','6046aa19f0c57731b4afe5647694b2bb');
INSERT INTO admins(id,NAME,PASSWORD) VALUES('A002','jacky','78f8c66288137831f4f7fc799e5b8a4d');
INSERT INTO admins(id,NAME,PASSWORD) VALUES('A003','rose','ff4407b06bd3896aa293937a1603770d');









