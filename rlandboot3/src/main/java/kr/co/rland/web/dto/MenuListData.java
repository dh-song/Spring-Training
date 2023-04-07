package kr.co.rland.web.dto;

import java.util.List;

import kr.co.rland.web.entity.MenuView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MenuListData {
	private List<MenuView> list;
	private List<MenuView> newMenuList; 
}
