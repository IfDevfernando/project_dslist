package com.intensivo.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_belonging")
public class Belongoing {
	
	@EmbeddedId
	private BelongoingPk id=new BelongoingPk();
	
	private Integer position;
	
	public Belongoing() {
		
	}

	public Belongoing(Game game, GameList list,Integer position) {
		
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BelongoingPk getId() {
		return id;
	}

	public void setId(BelongoingPk id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belongoing other = (Belongoing) obj;
		return Objects.equals(id, other.id) && Objects.equals(position, other.position);
	}
	

}
