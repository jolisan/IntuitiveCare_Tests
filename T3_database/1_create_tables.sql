-- DROP TABLE IF EXISTS `DEMONSTRACOES_CONTABEIS`;
CREATE TABLE IF NOT EXISTS `DEMONSTRACOES_CONTABEIS` (  -- CREATING TABLE DEMONSTRACOES_CONTABEIS
  `ID` int(11) NOT NULL auto_increment,
  `DATAS` date,
  `REG_ANS` varchar(50) NOT NULL,
  `CD_CONTA_CONTABIL` varchar(50),
  `DESCRICAO` varchar(100),
  `VL_SALDO_FINAL` varchar(50),
   PRIMARY KEY  (`ID`)
)DEFAULT CHARSET=latin1;

-- DROP TABLE IF EXISTS `OPERADORAS`;
CREATE TABLE IF NOT EXISTS `OPERADORAS` (  -- CREATING TABLE OPERADORAS
    `ID` int(11) NOT NULL auto_increment,
	`REG_ANS` varchar(25) NOT NULL,
    `CNPJ` varchar(25),
    `RAZAO_SOCIAL` varchar(100),
    `NOME_FANTASIA` varchar(100),
    `MODALIDADE` varchar(25),
    `LOGRADOURO` varchar(100),
    `NUMERO` varchar(25),
    `COMPLEMENTO` varchar(100),
    `BAIRRO` varchar(25),
    `CIDADE` varchar(25),
    `UF` varchar(2),
    `CEP` varchar(25),
    `DDD` varchar(3),
    `TELEFONE` varchar(25),
    `FAX` varchar(25),
    `ENDERECO_ELETRONICO` varchar(100),
    `REPRESENTANTE` varchar(100),
    `CARGO_REPRESENTANTE` varchar(25),
    `DATA_REG_ANS` varchar(25),
    PRIMARY KEY (`ID`, `REG_ANS`)
);