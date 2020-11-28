package com.exam.practice.designpatterns.abstractdesign;
class MAC extends Laptop{
	private String ram;
	private String processor;
	private String gpu;
	public MAC(String ram, String processor, String gpu) {
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}
	
	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
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
		return "MAC Config is ram size:"+this.ram + " and processorType: "+this.processor  + " and gpu: "+this.gpu;
	}
	@Override
	public String toString() {
		return "MAC [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}
	
}