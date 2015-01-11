create table bid (
        id BIGINT UNSIGNED not null auto_increment,
        bidPrice bigint,
        buyer_id BIGINT UNSIGNED,
        product_id BIGINT UNSIGNED,
        primary key (id)
    );

    create table buyer (
        id BIGINT UNSIGNED not null auto_increment,
        name varchar(255),
        primary key (id)
    );

    create table product (
        id BIGINT UNSIGNED not null auto_increment,
        intialBid bigint,
        name varchar(255),
        primary key (id)
    );

    create table seller (
        id BIGINT UNSIGNED not null auto_increment,
        name varchar(255),
        primary key (id)
    );

    create table seller_products (
        seller_id BIGINT UNSIGNED not null,
        product_id BIGINT UNSIGNED not null
    );

    alter table seller_products 
        add constraint UK_gacdp0docvr47p96bcboxg6ib  unique (product_id);

    alter table bid 
        add constraint FK_1q5dxipldi5lwrj1iddl5g2pe 
        foreign key (buyer_id) 
        references buyer (id);

    alter table bid 
        add constraint FK_dbxsomhovg6w6ygrliq3eix9j 
        foreign key (product_id) 
        references product (id);

    alter table seller_products 
        add constraint FK_gacdp0docvr47p96bcboxg6ib 
        foreign key (product_id) 
        references product (id);

    alter table seller_products 
        add constraint FK_l7keqdkj6gs1ko8l2g40tk7wt 
        foreign key (seller_id) 
        references seller (id);
