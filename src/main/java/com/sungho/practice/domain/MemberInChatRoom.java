package com.sungho.practice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MemberInChatRoom {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(targetEntity = Member.class)
	private Member member;

	@ManyToOne(targetEntity = ChatRoom.class)
	private ChatRoom chatRoom;
}
