package com.sungho.practice.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Member {
	@Id
	@GeneratedValue
	private Long id;

	private String nickName;

	private String email;

	@OneToMany(mappedBy = "member")
	private List<MemberInChatRoom> chatRoomsIn;

	@OneToMany(mappedBy = "sender")
	private List<Message> messagesSent;

	@ManyToOne
	private UserGroup userGroup;

	@OneToMany(mappedBy = "author")
	private List<Post> postsWrote;

	@OneToMany(mappedBy = "author")
	private List<Comment> commentsWrote;
}
