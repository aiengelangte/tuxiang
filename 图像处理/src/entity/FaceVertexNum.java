package entity;

public class FaceVertexNum {

	private int facenum;
	private int vertexNum01;
	private int vertexNum02;
	private int vertexNum03;
	
		
	public FaceVertexNum() {
		super();
	}
	public FaceVertexNum(int facenum, int vertexNum01, int vertexNum02,
			int vertexNum03) {
		super();
		this.facenum = facenum;
		this.vertexNum01 = vertexNum01;
		this.vertexNum02 = vertexNum02;
		this.vertexNum03 = vertexNum03;
	}
	public int getFacenum() {
		return facenum;
	}
	public void setFacenum(int facenum) {
		this.facenum = facenum;
	}
	public int getVertexNum01() {
		return vertexNum01;
	}
	public void setVertexNum01(int vertexNum01) {
		this.vertexNum01 = vertexNum01;
	}
	public int getVertexNum02() {
		return vertexNum02;
	}
	public void setVertexNum02(int vertexNum02) {
		this.vertexNum02 = vertexNum02;
	}
	public int getVertexNum03() {
		return vertexNum03;
	}
	public void setVertexNum03(int vertexNum03) {
		this.vertexNum03 = vertexNum03;
	}
	
	
}
