package com.sungho.practice.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserGroup {
	@Id
	@GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	private UserGroupType type;

	@OneToMany(mappedBy = "userGroup")
	private List<Member> members;
}
