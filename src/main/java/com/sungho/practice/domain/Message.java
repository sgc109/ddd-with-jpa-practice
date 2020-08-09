package com.sungho.practice.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Message {
	@Id
	@GeneratedValue
	private Long id;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	private Date sentDate;

	@ManyToOne
	private ChatRoom chatRoomIn;

	@ManyToOne
	private Member sender;
}
