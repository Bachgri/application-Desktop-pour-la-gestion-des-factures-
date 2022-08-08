CREATE TABLE   facture   (
    numFact   int NOT NULL primary key ,
    RelFact   double NOT NULL DEFAULT 0,
    Quantite   double NOT NULL,
    DateFact   date NOT NULL,
    NumCpt   int DEFAULT NULL,
    Status   varchar(64) NOT NULL DEFAULT 'NP',
    Livred   smallint NOT NULL DEFAULT 0,
    constraint Cc foreign key (NumCpt) references clients(numcpt)
)