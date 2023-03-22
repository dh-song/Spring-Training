package kr.co.rland.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RcmdMenuView extends RcmdMenu{
	private String img;
	private String name;
}
