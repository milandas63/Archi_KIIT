DROP DATABASE IF EXISTS invoice;
CREATE DATABASE IF NOT EXISTS invoice;
USE invoice;

SELECT 'PRODUCT';
CREATE TABLE IF NOT EXISTS product_tab( 
    slno            INT(6) NOT NULL AUTO_INCREMENT,
    product_id      INT(6) UNIQUE, 
    product_desc    VARCHAR(30),
    product_pack    VARCHAR(30),
    product_mfg_id  INT(6),
    PRIMARY KEY(slno)
);

INSERT INTO product_tab (product_id, product_desc, product_pack, product_mfg_id) VALUES
    (1, 'Matchstick', 'Box', 1005),
    (2, 'Candies', 'Box', 1231),
    (3, 'Broom', 'Bundle', 1231),
    (4, 'Candles', 'Box', 1236),
    (5, 'Chocolates', 'Box', 1250),
    (6, 'Socks', 'Pair', 1262),
    (7, 'Jam', 'Jar', 1525),
    (8, 'Tissues', 'Box', 2000);

SELECT 'MANUFACTURER';
CREATE TABLE IF NOT EXISTS manufacturer_tab(
    mfg_id      INT(6),
    mfg_desc    VARCHAR(50),
    PRIMARY KEY(mfg_id)
);
INSERT INTO manufacturer_tab (mfg_id, mfg_desc) VALUES
    (1005, 'ABC Corp'),
    (1231, 'XYZ Ltd.'),
    (1236, 'TATA Industries'),
    (1250, 'Monginis Foods'),
    (1262, 'STU Ltd.'),
    (1525, 'Wholesome Foods'),
    (2000, 'JKL Paper Co.');


SELECT 'RATE';
CREATE TABLE IF NOT EXISTS rate (
    rate_id       INT(6) AUTO_INCREMENT,
    product_id    INT(6), 
    rate_value    DECIMAL(10,2),
    currency      VARCHAR(10) DEFAULT 'INR',
     PRIMARY KEY(rate_id)
);
INSERT INTO rate (product_id, rate_value, currency) VALUES
    (1, 10.50, 'INR'),
    (2, 5.75, 'INR'),
    (3, 20.00, 'INR'),
    (4, 8.99, 'INR'),
    (5, 15.25, 'INR'),
    (6, 7.49, 'INR'),
    (7, 6.00, 'INR'),
    (8, 21.00, 'INR');

SELECT 'HEADER';
CREATE TABLE IF NOT EXISTS invoice_header_tab (
    header_id       INT(6) AUTO_INCREMENT,
    customer_name            VARCHAR(30),
    customer_address         VARCHAR(30),
    invoice_no                INT(6),
    invoice_dt                DATE,
    invoice_amt               DOUBLE(12,2),
   
);

INSERT INTO invoice_header_tab(header_id, customer_name, customer_address, invoice_no, invoice_dt, invoice_amt) VALUES 
                            ('1', 'Olivia',                                           ),

