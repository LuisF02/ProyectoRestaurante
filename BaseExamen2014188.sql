create database DBRestaurante2014188;
use DBRestaurante2014188;

create table cliente(
	idcliente int not null primary key auto_increment,
    nombre varchar(50) not null,
    apellido varchar(50) not null, 
    observaciones varchar (50) not null
    );

create table camarero(
	idcamarero int not null primary key auto_increment, 
    nombre varchar(50) not null, 
	apellido varchar(50) not null);

create table cocinero(
	idcocinero int not null primary key auto_increment,
    nombre varchar(50) not null, 
	apellido varchar(50) not null);
    
    
create table plato(
	idplato int not null primary Key auto_increment,
    descripcion varchar (50) not null,
    precio double not null
    );
    
create table areas(
	idareas int not null primary key auto_increment ,
    descripcion varchar(50) not null);

create table mesa(
	idmesa int not null primary key auto_increment,
    numeromaximodeconmensales varchar(50) not null,
    ubicacion varchar(50) not null,
    idAreas int,
    foreign key fk_idareas(idareas) references Areas(idareas)
    );


create table factura(
	idfactura int not null primary Key auto_increment,
    fechaFactura Date,
    idcliente int,
    idcamarero int,
    idmesa int,
    foreign key fk_idcliente(idcliente) references cliente(idcliente),
    foreign key fk_idcamarero(idcamarero) references Camarero(idcamarero),
    foreign key fk_idmesa(idmesa) references Mesa(idmesa)
     
    );


create table detallefactura(
	iddetalle int not null primary key auto_increment,
	cantidad double not null,
    precio double not null,
    importe double not null, 
    idfactura int,
    idcocinero int, 
    idplato int,
    foreign key fk_idPlato(idplato) references Plato(idplato),
    foreign key fk_idCocinero(idcocinero) references cocinero(idcocinero),
    foreign key fk_idFactura(idfactura) references Factura(idfactura)
    
);	
	
    
    


    
    


    