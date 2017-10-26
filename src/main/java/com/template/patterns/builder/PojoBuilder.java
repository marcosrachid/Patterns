package com.template.patterns.builder;

/**
 * 
 * @author marcos
 *
 */
public class PojoBuilder {

	Pojo pojo = null;
	
	public PojoBuilder() {
		pojo = new Pojo();
	}
	
	public PojoBuilder withA(String a) {
		pojo.setA(a);
		return this;
	}
	
	public PojoBuilder withB(String b) {
		pojo.setB(b);
		return this;
	}
	
	public PojoBuilder withC(String c) {
		pojo.setC(c);
		return this;
	}
	
	public PojoBuilder withD(Integer d) {
		pojo.setD(d);
		return this;
	}
	
	public PojoBuilder withE(Long e) {
		pojo.setE(e);
		return this;
	}
	
	public Pojo build() {
		return pojo;
	}
}
