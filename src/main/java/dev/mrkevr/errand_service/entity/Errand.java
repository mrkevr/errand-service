package dev.mrkevr.errand_service.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "errands")
@Entity(name = "Errand")
public class Errand {
	
	@Id
	@Column(name = "errand_id")
	UUID id;
	
	@Column(name = "user_id")
	UUID userId;
	
	@Column(name = "title")
	String title;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "location")
	String location;
	
	@Column(name = "phone")
	String phone;
	
	@Column(name = "compensation")
	double compensation;
	
	@Column(name = "date_due")
	LocalDate dateDue;
	
	@Column(name = "time_due")
	LocalTime timeDue;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	Category category;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "image_file_id", referencedColumnName = "image_file_id")
	ImageFile imageFile;
}