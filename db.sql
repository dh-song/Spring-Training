-- use rlanddb;
select * from menu where name like '%a%' and price > 3000 and categoryId = 1 order by regDate desc limit 10 offset 0;
select id, name, price, regdate, categoryid, regMemberid from menu;