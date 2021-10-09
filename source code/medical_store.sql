SQL*Plus:  Release 10.2.0.1.0 - Production on Sat Nov 10  12:34:47  2018

Copyright <c> 1982, 2005, Oracle.  All rights reserved.

SQL>connect
Enter user-name:system
Enter password:*****
Connected.

SQL> create table SUPPLIER(sid integer primary key ,sname varchar(50),saddress varchar(50),sphoneno integer,semailid varchar(30));

Table created.

SQL>desc SUPPLIER;
Name                                                 Null?              Type
-------------------------------------- --------------- ---------------------
SID                                                   NOT NULL     NUMBER(38)
SNAME                                                                    VARCHAR2(50)
SADDRESS                                                              VARCHAR2(50)
SPHONENO                                                              NUMBER(38)
SEMAILID                                                               VARCHAR2(30)

SQL>create table MEDICINE(mbno varchar(10) primary key,mname varchar(25),mcompany varchar(50),mqty integer,mexpdate date,mpurdate date,mtype varchar(30),mpurprice integer,msaleprice integer,mrackno varchar(10),sid references SUPPLIER(sid) on delete cascade,sname references SUPPLIER(sname) on delete cascade);

Table created.

SQL>desc MEDICINE;
Name                                                 Null?              Type
-------------------------------------- --------------- ---------------------
MBNO                                                NOT NULL     VARCHAR2(10)
MNAME                                                                    VARCHAR2(50)
MCOMPANY                                                             VARCHAR2(50)
MQTY                                                                       NUMBER(38)
MEXPDATE                                                              DATE
MPURDATE                                                              DATE
MTYPE                                                                      VARCHAR2(30)
MPURPRICE                                                              NUMBER(38)
MSALEPRICE                                                           NUMBER(38)
MRACKNO                                                                VARCHAR2(10)
SID                                                                           NUMBER(38)
SNAME                                                                     VARCHAR2(50)

SQL>insert into SUPPLIER values(1,'ashish karkera','konankunte,bangalore',9967866000,'ashish99@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(2,sohan naik','jp nagar,bangalore',7666889912,'sohan129@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(3,'subhashini','ks layout,bangalore',8897903421,'neha98@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(4,'suresh joshi','btm layout,bangalore',8310944823,'joshisuresh@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(5,'tamanna sethia','sahara,rajasthan',9987650023,'tanuseth@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(6,'harish nanda','rr nagar,bangalore',8876789200,'harish123@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(7,'pavan hari','yelahanka',9987600342,'pavan_hari09@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(8,'manvitha harish','vasanthpura,bangalore',8090712998','manvi0123@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(9,'mayur shasthri','isro layout,bangalore',9908712990,'mayur1998@gmail.com');
1 row created.

SQL>insert into SUPPLIER values(10'surya kiran','kabaka,puttur',9908712657,'suryakiran98@gmail.com');
1 row created.

SQL>insert into MEDICINE values('mb01','crocin','crocin pharma',60,'06-sep-18','01-jan-19','Tablet',40,50,'c',2,'sohan naik');
1 row created.

SQL>insert into MEDICINE values('mb02','parachute','med pharma',70,'09-sep-20','02-feb-17','Oil',100,140,'p',1,'ashish karkera');
1 row created.

SQL>insert into MEDICINE values('mb04','saridon','sj companies',50,'09-sep-20','01-jan-19,'Tablet',90,140,'s',4,'suresh joshi');
1 row created.

SQL>insert into MEDICINE values('mb06','benadryl','bg pharmaceuticals',30,'08-sep-19','09-aug-18','Syrup',75,95,'b',3,'subhashini');
1 row created.

SQL>insert into MEDICINE values('mb08','mentho plus balm','mm companies',100,'09-jul-19','01-jan-19','Balm',500,600,'m',5,'tamanna sethia');
1 row created.

SQL>insert into MEDICINE values('mb09','nph(n)','med pharma',45,'09-nov-18','09-jun-16','Insulin',400,600,'n',10,'surya kiran');
1 row created.

SQL>insert into MEDICINE values('mb10','johnson's baby powder','johnson's baby care ltd',55,'09-sep-17','09-nov-20','Powder',500,780,'j',9,'mayur shasthri');
1 row created.

SQL>insert into MEDICINE values('mb11','mozapt','chethana pharma',45,'12-jun-18','12-jan-18','Drop',2000,3000,'m',4,'suresh joshi');
1 row created.

SQL>insert into MEDICINE values('mb12','cystone','med pharma',80,'23-nov-20','01-jan-19','Tablet',1020,1120,'c',1,'ashish karkera');
1 row created.

SQL>insert into MEDICINE values('mb13','OFLOX-D','mico pharma',50,'11-jan-17','11-dec-18','Drop',2500,3800,'o',1,'ashish karkera');
1 row created.

SQL>insert into MEDICINE values('mb14','supradin','cipla',70,'11-nov-19','11-nov-18','Tablet',270,350,'s',1,'ashish karkera);
1 row created.

SQL>insert into MEDICINE values('mb15','sinerest','cipla',50,'01-dec-20','01-jan-19','Tablet',560,760,'s',1,ashish karkera);
1 row created.











