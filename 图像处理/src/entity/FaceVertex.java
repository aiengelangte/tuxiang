package entity;

public class FaceVertex {

	private Vertex aVertex;
	private Vertex bVertex;
	private Vertex cVertex;
	
	
	
	public FaceVertex() {
		super();
	}
	public FaceVertex(Vertex aVertex, Vertex bVertex, Vertex cVertex) {
		super();
		this.aVertex = aVertex;
		this.bVertex = bVertex;
		this.cVertex = cVertex;
	}
	public Vertex getaVertex() {
		return aVertex;
	}
	public void setaVertex(Vertex aVertex) {
		this.aVertex = aVertex;
	}
	public Vertex getbVertex() {
		return bVertex;
	}
	public void setbVertex(Vertex bVertex) {
		this.bVertex = bVertex;
	}
	public Vertex getcVertex() {
		return cVertex;
	}
	public void setcVertex(Vertex cVertex) {
		this.cVertex = cVertex;
	}
	
}
