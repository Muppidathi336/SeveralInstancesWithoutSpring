package com.mb.SeveralInstancesWithoutSpring;

public class CyanCylinder extends ColoredShape{
	

	 protected String color = "cyan";

	 // default shape
	 protected String type = "cylinder";

	 public CyanCylinder() {
	 }

	 public CyanCylinder(final String color, final String type) {

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
