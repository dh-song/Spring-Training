package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.RcmdMenuView;
import kr.co.rland.web.repository.RcmdMenuRepository;

@Service
public class DefaultRcmdMenuService implements RcmdMenuService {

	@Autowired
	RcmdMenuRepository repository;
	
	@Override
	public List<RcmdMenuView> getViewListMenuId(long menuId) {
		
		return repository.findViewAllByMenuId(menuId);
	}

}
