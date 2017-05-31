package entity;

import java.util.Vector;

import javax.naming.spi.DirStateFactory.Result;

public class TriangleMesh {
	
	private Vector<Vertex> allVertex;
	private Vector<Face> allFace;
	private Vector<Edge> allEdges;
	private String bg_geom = "euclidean";
	
	public TriangleMesh(Vector<Vertex> allVertex, Vector<Edge> allEdges, Vector<Face> allFace, String bg_geom)
	{
		this.allVertex = allVertex;
		this.allEdges = allEdges;
		this.allFace = allFace;
		this.bg_geom = bg_geom;
	}
	
	//返回某个顶点所在的所有边
	public Vector<Edge> adjacent_edges(Vertex vertex)
	{
		Vector<Edge> inEdgesVertex = new Vector<Edge>();
		for (Edge edge : this.allEdges) {
			if (edge.getStartVertex() == vertex || edge.getEndVertex() == vertex)
			{
				inEdgesVertex.add(edge);
			}
		}
		return inEdgesVertex;
	
	}
	
	public Integer chi()
	{
		Integer result = allVertex.size() + allFace.size() - allEdges.size();
		return result;
	}
	
	public static void main(String[] args)
	{
		
	}

}
