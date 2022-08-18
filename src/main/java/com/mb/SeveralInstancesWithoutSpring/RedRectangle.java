package com.mb.SeveralInstancesWithoutSpring;

public class RedRectangle extends ColoredShape{
	

	 protected String color = "red";

	 // default shape
	 protected String type = "rectangle";

	 public RedRectangle() {
	 }

	 public RedRectangle(final String color, final String type) {

	     if (color != null) {
	         this.color = color;
	     }
	     if (type != null) {
	         this.type = type;
	     }
	 }

	 public String getColor() {

	     return color;
	 }

	 public void setColor(final String color) {

	     this.color = color;
	 }

	 public String getType() {

	     return type;
	 }

	 public void setType(final String type) {

	     this.type = type;
	 }

	 public String toString() {

	     return color + ' ' + type;
	 }
	

}
