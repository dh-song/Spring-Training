package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.entity.RcmdMenuView;

@Mapper
public interface RcmdMenuRepository {

	List<RcmdMenuView> findViewAllByMenuId(long menuId);
	int insert(RcmdMenuView rcmdMenu);
	int delete(RcmdMenuView rcmdMenu);
	

}
	
