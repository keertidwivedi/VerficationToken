package com.example.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	
	@ManyToMany
	@JoinTable(name = "role_permission", joinColumns =   @JoinColumn (name = "role_id" , referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn (name = "perm_id ", referencedColumnName = "id"))
	private List<Permission> permission;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY ,mappedBy = "role")
	private List<User> users;
	
	

}
