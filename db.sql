-- use rlanddb;
select * from menu where name like '%a%' and price > 3000 and categoryId = 1 order by regDate desc limit 10 offset 0;
select id, name, price, regdate, categoryid, regMemberid from menu;
update menu set name='hiii', price=2000, img='' where id=745;
select * from menu where id=745;
select * from member;
select count(id) from menu where price > 0 and category_id = 1;
select * from menu;

