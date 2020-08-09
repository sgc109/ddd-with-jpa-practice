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
public class Comment {
	@Id
	@GeneratedValue
	private Long id;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateWritten;

	@ManyToOne
	private Post postBelongingTo;

	@ManyToOne
	private Member author;

	// List<Comment> subComments;
}
