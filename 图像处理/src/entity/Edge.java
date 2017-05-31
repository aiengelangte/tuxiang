package entity;

public class Edge {

	private Vertex startVertex;		
	private Vertex endVertex;	
	private double length;
	
	public Edge() {
		super();
	}

	public Edge(Vertex startVertex, Vertex endVertex, double length) {
		super();
		this.startVertex = startVertex;
		this.endVertex = endVertex;
		this.length = length;
	}


	public Vertex getStartVertex() {
		return startVertex;
	}


	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}


	public Vertex getEndVertex() {
		return endVertex;
	}


	public void setEndVertex(Vertex endVertex) {
		this.endVertex = endVertex;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}	
	
}
