package com.exam.practice.designpatterns.abstractdesign;
class HP extends Laptop{
	private String ram;
	private String processor;
	public HP(String ram, String processor) {
		this.ram = ram;
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	String getConfiguration() {
		return "Hp Config is ram size:"+this.ram + " and processorType: "+this.processor;
	}
	@Override
	public String toString() {
		return "HP [ram=" + ram + ", processor=" + processor + "]";
	}
	
}