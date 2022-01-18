package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="COURSE")
	public class M2MCourse {

		private long courseId;
		private String courseName;

		public M2MCourse() {
		}

		public M2MCourse(String courseName) {
			this.courseName = courseName;
		}

		@Id
		@GeneratedValue
		@Column(name="COURSE_ID")
		public long getCourseId() {
			return this.courseId;
		}

		public void setCourseId(long courseId) {
			this.courseId = courseId;
		}

		@Column(name="COURSE_NAME", nullable=false)
		public String getCourseName() {
			return this.courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

	}