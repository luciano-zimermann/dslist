package com.lucianozimermann.dslist.projections;

public interface GameMinProjection 
{
	public Long getId();
	public String getTitle();
	public Integer getGameYear();
	public String getImgUrl();
	public String getShortDescription();
	public Integer getPosition();
}