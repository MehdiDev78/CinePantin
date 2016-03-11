package fr.cinepantin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Autorisation {
	@Id
	@GeneratedValue
	private Long autorisationId;
	private String username;
	private String role;

	public Autorisation() {
		// TODO Auto-generated constructor stub
	}

	public Long getAutorisationId() {
		return autorisationId;
	}

	public void setAutorisationId(Long autorisationId) {
		this.autorisationId = autorisationId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
