package one.digitalinovattion.padroesdeprojetospring.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Address {
	
	@Id
	private String cep;
	private String publicPlace;
	private String complement;
	private String district;
	private String locality;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getPublicPlace() {
		return publicPlace;
	}
	
	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}
	
	public String getComplement() {
		return complement;
	}
	
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getLocality() {
		return locality;
	}
	
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getIbge() {
		return ibge;
	}
	
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}
	public String getGia() {
		return gia;
	}
	
	public void setGia(String gia) {
		this.gia = gia;
	}
	public String getDdd() {
		return ddd;
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	public String getSiafi() {
		return siafi;
	}
	
	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}
	

}
