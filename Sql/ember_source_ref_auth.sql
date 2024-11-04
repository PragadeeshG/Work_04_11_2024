create table if not exists ember_source_ref_auth(
authorizer_id bigint not null,
ember_source_cat_code varchar(255) null,
ember_source_sub_cat_code varchar(255) null,
version_owner varchar(255) null,
version_verifier varchar(255) null,
version_completion_team varchar(255) null,
email_group varchar(255) null,
ref_data_id bigint null,
sequence Integer null,
modular_data varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint ember_source_ref_auth_pk primary key(authorizer_id));