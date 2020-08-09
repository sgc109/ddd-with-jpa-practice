package com.sungho.practice.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ChatRoom {
	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(mappedBy = "chatRoom")
	private List<MemberInChatRoom> membersJoining;

	@OneToMany(mappedBy = "chatRoomIn")
	private List<Message> messages;
}
