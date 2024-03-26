create tablespace Cetrad datafile 'C:\tbs\Cetrad.dat' size 500 M autoextend on;
Create temporary tablespace Cetrad_TempTBS tempfile 'C:\tbs\Cetrad_TempTBS.dat' size 100M autoextend on;
create user cet identified by password213# default tablespace Cetrad temporary tablespace Cetrad_tempTBS;
connect cet/password213#;
Create table arriverstock (
Designation varchar(50),
Origine varchar(90),
DateArriver Date,
Unite varchar(40),
quantite int,
Dateperemption Date,
numerofacture Varchar(45),
numerodelot varchar(45),
observation varchar(200),
lieuxstockage varchar(100),
constraint pk_arriverstock PRIMARY KEY(Designation,Origine,DateArriver)
);
create table bonlivraison(
codebnlivraison varchar(14) ,
client varchar(45),
RM varchar(3),
datebl Date,
numerocontract int,
Datecontract Date,
numeroboncomande varchar(45),
dateboncommande Date,
Designation varchar(50),
unitemesure varchar(45),
quantitecolise int,
quantite int,
puht varchar(45),
montant int,
constraint pk_bonlivraison Primary key(codebnlivraison)
);
create table login(
username varchar(40),
mdp varchar(80),
type varchar(20),
constraint pk_login Primary key(username,type)
);
create table stock(
designation varchar(50),
unite varchar(40),
quantite int ,
 lieux varchar(100),
constraint pk_stock Primary key(designation)
);
insert into login values('test1','mdp1','stock');
insert into login values('test2','mdp2','livraison');
create table facture(
nfacture varchar(14),
Dfacture date,
codebnlivraison varchar(14),
datebl Date,
numerocontract int,
Datecontract Date,
RM varchar(3),
client varchar(45),
Designation varchar(50),
quantite int,
puht varchar(45),
montant int,
montanttva int,
MontantTTC int,
accrecep int,
nbbn int,
constraint pk_fac Primary key(nfacture,codebnlivraison)
);

insert into facture values ('58648'
, to_date('12-10-2022','dd-mm-yyyy'),
'45824',
 to_date('2022-10-08','dd-mm-yyyy'),
'56569', to_date('2022-10-01','dd-mm-yyyy'),
'RM2','geege','test2','400','test2','40000','8','43200','0','1');