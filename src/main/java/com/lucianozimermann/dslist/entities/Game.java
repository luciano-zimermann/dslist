package com.lucianozimermann.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tile;
	
	@Column( name = "game_year")
	private Integer year;
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;

	public Game() 
	{
	}

	public Long getIdLong() 
	{
		return id;
	}

	public void setIdLong(Long idLong) 
	{
		this.id = idLong;
	}

	public String getTile() 
	{
		return tile;
	}

	public void setTile(String tile) 
	{
		this.tile = tile;
	}

	public Integer getYear() 
	{
		return year;
	}

	public void setYear(Integer year) 
	{
		this.year = year;
	}

	public String getGenre() 
	{
		return genre;
	}

	public void setGenre(String genre) 
	{
		this.genre = genre;
	}

	public String getPlatform() 
	{
		return platform;
	}

	public void setPlatform(String platform) 
	{
		this.platform = platform;
	}

	public String getImgUrl() 
	{
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) 
	{
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() 
	{
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) 
	{
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() 
	{
		return longDescription;
	}

	public void setLongDescription(String longDescription) 
	{
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
		{
			return true;
		}
		
		if (obj == null)
		{
			return false;
		}
		
		if (getClass() != obj.getClass())
		{
			return false;
		}
		
		Game other = (Game) obj;
		
		return Objects.equals(id, other.id);
	}
}