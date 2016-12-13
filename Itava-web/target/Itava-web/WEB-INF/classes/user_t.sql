DROP TABLE IF EXISTS `user_t`;  
  
CREATE TABLE `user_t` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(40) NOT NULL,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/*Data for the table `user_t` */  
  
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (1,'测试','sfasgfaf',24); 
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (2,'测试2','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (3,'测试3','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (4,'测试4','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (5,'测试5','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (6,'测试6','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (7,'测试7','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (8,'测试8','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (9,'测试9','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (10,'测试10','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (11,'测试11','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (12,'测试12','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (13,'测试13','sfasgfaf',24);
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (14,'测试14','sfasgfaf',24);
