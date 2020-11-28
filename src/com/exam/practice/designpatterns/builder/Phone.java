package com.exam.practice.designpatterns.builder;
public class Phone{
	private String frontpanel;
	private String backpanel;
	private String processor;
	private String camera;
	static class Builder{
		private String frontpanel;
		private String backpanel;
		private String processor;
		private String camera;
		public Builder() {
			
		}
		public Phone build() {
			return new Phone(this);
		}
		public Builder backpanel(String backpanel) {
			this.backpanel=backpanel;
			return this;
		}
		
		public Builder processor(String processor) {
			this.processor=processor;
			return this;
		}
		public Builder frontpanel(String frontpanel) {
			this.frontpanel=frontpanel;
			return this;
		}
		public Builder camera(String camera) {
			this.camera=camera;
			return this;
		}
	}
	public Phone(Builder builder) {
		this.frontpanel=builder.frontpanel;
		this.backpanel=builder.backpanel;
		this.processor=builder.processor;
		this.camera=builder.camera;
	}
	public String getFrontpanel() {
		return frontpanel;
	}
	public void setFrontpanel(String frontpanel) {
		this.frontpanel = frontpanel;
	}
	public String getBackpanel() {
		return backpanel;
	}
	public void setBackpanel(String backpanel) {
		this.backpanel = backpanel;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	@Override
	public String toString() {
		return "Phone [frontpanel=" + frontpanel + ", backpanel=" + backpanel + ", processor=" + processor + ", camera="
				+ camera + "]";
	}
	
	
}