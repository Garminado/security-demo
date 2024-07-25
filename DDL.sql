create table user
(
    id        bigint auto_increment comment '用户ID'
        primary key,
    user_name varchar(30)              not null comment '用户账号',
    password  varchar(100) default ''  null comment '密码',
    email     varchar(50)  default ''  null comment '用户邮箱',
    phone     varchar(11)  default ''  null comment '手机号码',
    sex       char         default '0' null comment '用户性别（0男 1女 2未知）',
    avatar    varchar(100) default ''  null comment '头像地址',
    status    tinyint      default 1   null comment '帐号状态',
    unique (user_name)
)
    comment '用户信息表';