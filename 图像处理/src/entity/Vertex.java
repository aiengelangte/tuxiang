package entity;

public class Vertex {

	private int numVertex;
	private double x;
	private double y;
	private double z;
	
	
	
	public Vertex() {
		super();
	}
	public Vertex(int numVertex, double x, double y, double z) {
		super();
		this.numVertex = numVertex;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getNumVertex() {
		return numVertex;
	}
	public void setNumVertex(int numVertex) {
		this.numVertex = numVertex;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
}
