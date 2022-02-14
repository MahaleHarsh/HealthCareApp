package in.nareshit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:RAGHU SIR 
 *  Generated F/w:SHWR-Framework 
 */
@Entity
@Table(name = "appoinment_tab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appoinment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "app_dte_col")
	private String appDate;
	@Column(name = "app_slots_col")
	private Integer noOfSlots;
	@Column(name = "app_details_col")
	private String details;
	@Column(name = "app_fee_col")
	private Double appFee;
}
