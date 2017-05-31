package entity;

import java.util.ArrayList;
import java.util.List;

public class Face {

	private int facenum;
	private Edge edge01;
	private Edge edge02;
	private Edge edge03;
	
	public Face() {
		super();
	}

	public Face(int facenum, Edge edge01, Edge edge02, Edge edge03) {
		super();
		this.facenum = facenum;
		this.edge01 = edge01;
		this.edge02 = edge02;
		this.edge03 = edge03;
	}

	public int getFacenum() {
		return facenum;
	}

	public void setFacenum(int facenum) {
		this.facenum = facenum;
	}

	public Edge getEdge01() {
		return edge01;
	}

	public void setEdge01(Edge edge01) {
		this.edge01 = edge01;
	}

	public Edge getEdge02() {
		return edge02;
	}

	public void setEdge02(Edge edge02) {
		this.edge02 = edge02;
	}

	public Edge getEdge03() {
		return edge03;
	}

	public void setEdge03(Edge edge03) {
		this.edge03 = edge03;
	}
	
	
	
}
