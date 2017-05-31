package util;

import entity.Vertex;

public class CaluteLegth {

	public static double edgeLengh(Vertex aVertex,Vertex bVertex){
		double length = NormUtil.norm((aVertex.getX()-bVertex.getX()),(aVertex.getY()-bVertex.getY()), 
				(aVertex.getZ()-bVertex.getZ()));	
		return length;
	}
}
