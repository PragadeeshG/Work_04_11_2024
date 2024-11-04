create table if not exists ember_source_category(
ember_source_cat_code varchar(255) not null,
ember_source_cat_name varchar(255) null,
ember_source_cat_description varchar(255) null,
ember_source_cat_definition varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
ps_ids varchar(255) null,
service_name_id bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint ember_source_category_pk primary key(ember_source_cat_code));