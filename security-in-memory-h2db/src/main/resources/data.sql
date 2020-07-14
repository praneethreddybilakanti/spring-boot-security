INSERT INTO USERS(  username,password,enabled)
values(
"user",
"user",
true
);
INSERT INTO USERS(  username,password,enabled)
values(
"admin",
"admin",
true
);
INSERT INTO authorities(username,authority)
values("user","role_user");
INSERT INTO authorities(username,authority)
values("admin","role_admin");