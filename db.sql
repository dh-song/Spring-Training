-- use rlanddb;
select * from menu where name like '%a%' and price > 3000 and categoryId = 1 order by regDate desc limit 10 offset 0;
select id, name, price, regdate, categoryid, regMemberid from menu;
update menu set name='hiii', price=2000, img='' where id=745;
select * from menu where id=745;
select * from member;
select count(id) from menu where price > 0 and category_id = 1;
select * from menu;
select * from category;

create view menu_view
as
select m.*, c.name category_name from menu m join Category c on m.category_id = c.id;

select * from menu_view;
select * from menu_view where 617;
select * from category;

select rm.*,
       m.name,
       m.img
from rcmd_menu rm join menu m
                    on rm.id = m.id;