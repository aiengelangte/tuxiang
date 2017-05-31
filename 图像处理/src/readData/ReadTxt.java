package readData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import util.CaluteLegth;
import util.StringTodouble;

import cern.colt.list.IntArrayList;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.impl.DenseDoubleMatrix1D;
import cern.colt.matrix.impl.DenseDoubleMatrix2D;
import cern.colt.matrix.linalg.Algebra;
import cern.jet.random.Normal;
import entity.Edge;
import entity.Face;
import entity.FaceVertex;
import entity.FaceVertexNum;
import entity.Vertex;

public class ReadTxt {
	public static void main(String[] args) throws IOException {
		String read;
		String readStr = "";
		
		DoubleMatrix2D matrix;
		matrix = new DenseDoubleMatrix2D(113059,3);
		
		double[][] vertexDouble =new double[113059][3];//存储点
		int[][]   faceInt =new int[81248][3]; //存储脸
		
		String[] tem =new String[]{};
		
		int num=0;
		int numface=0;
		String faceStr="face";
		System.out.println(faceStr=="face");
		
		
		URL url = new URL("file:/D:/portion1.m");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
	
		Vector<Vertex> aVertexs =new Vector<Vertex>();
		Vertex aVertex =new Vertex();
		Vector<FaceVertexNum> aFaceVertexNums =new Vector<FaceVertexNum>();
		FaceVertexNum aFaceVertexNum =new FaceVertexNum();
	
		while ((read = br.readLine()) != null) {			
			
		
			if(read.substring(0, 6).equals("Vertex")){
				read=read.substring(0, 40);
			    tem=read.split(" ");
			    aVertex.setNumVertex(num+1);
				vertexDouble[num][0]=StringTodouble.StringToDouble(tem[2]);
				aVertex.setX(vertexDouble[num][0]);
				vertexDouble[num][1]=StringTodouble.StringToDouble(tem[3]);
				aVertex.setX(vertexDouble[num][1]);
				vertexDouble[num][2]=StringTodouble.StringToDouble(tem[4]);
				aVertex.setX(vertexDouble[num][2]);
				System.out.println(vertexDouble[num][0]);
				num++;
				aVertexs.add(aVertex);
			}
			else {
				if(read.substring(0, 4).equals("Face"))
				{
					tem=read.split(" ");					
					aFaceVertexNum.setFacenum(Integer.parseInt(tem[1]));
					faceInt[numface][0]=Integer.parseInt(tem[2]);
					aFaceVertexNum.setVertexNum01(faceInt[numface][0]);
					faceInt[numface][1]=Integer.parseInt(tem[3]);
					aFaceVertexNum.setVertexNum01(faceInt[numface][1]);
					faceInt[numface][2]=Integer.parseInt(tem[4]);
					aFaceVertexNum.setVertexNum01(faceInt[numface][2]);
					//faceInt[numface][3]=Integer.parseInt(tem[4]);
					//System.out.println(faceInt[numface][0]);
					numface++;
					//System.out.println(faceInt.toString());
					aFaceVertexNums.add(aFaceVertexNum);
				}				
			}
			//System.out.println(read);
		}
		System.out.println(vertexDouble[vertexDouble.length-1][0]);
		//System.out.println(numface);
		System.out.println(faceInt[faceInt.length-1][0]+" "+faceInt[faceInt.length-1][1]+" "+faceInt[faceInt.length-1][2]);
		
				
		matrix.assign(vertexDouble);
		Algebra algebra =new Algebra();
		
		algebra.norm2(matrix);
		System.out.println("sss"+algebra.norm1(matrix));
		double result=0;
		double tem2=0;
		for (int i = 0; i < vertexDouble.length; i++) {
			result = Math.sqrt(Math.pow(vertexDouble[i][0], 2)+Math.pow(vertexDouble[i][1], 2)+Math.pow(vertexDouble[i][2], 2));					
			if(tem2<=result){
				tem2=result;
			}
			}
		System.out.println(tem2);
		
		//vertexDouble=vertexDouble/tem2/2;
		double[][] vertexDoubleChu =new double[113059][3];//存储点
		
		for (int i = 0; i < vertexDouble.length; i++) {
			for (int j = 0; j < 3; j++) {
				vertexDoubleChu[i][j]=vertexDouble[i][j]/tem2/2;
			}
		}	
		
		//把点赋给脸
		Vector<FaceVertex> aFaces =new Vector<FaceVertex>();
		FaceVertex aFaceVertex =new FaceVertex();
		for (int i = 0; i < faceInt.length; i++) {	
		aFaceVertex.setaVertex(aVertexs.get(aFaceVertexNum.getVertexNum01()-1));
		aFaceVertex.setbVertex(aVertexs.get(aFaceVertexNum.getVertexNum02()-1));
		aFaceVertex.setcVertex(aVertexs.get(aFaceVertexNum.getVertexNum03()-1));
		aFaces.add(aFaceVertex);
		}
		
		Face aFace =new Face();
		Edge aEdge =new Edge();
		Vector<Face> aFaceEdgeAll =new Vector<Face>();
		//把点转化为边，赋给脸
		for (int i = 0; i < faceInt.length; i++) {		
			aEdge.setStartVertex(aFaceVertex.getaVertex());
			aEdge.setEndVertex(aFaceVertex.getbVertex());
			aEdge.setLength(CaluteLegth.edgeLengh(aEdge.getStartVertex(),aEdge.getEndVertex()));
			aFace.setEdge01(aEdge);
			
			aEdge.setStartVertex(aFaceVertex.getbVertex());
			aEdge.setEndVertex(aFaceVertex.getcVertex());
			aEdge.setLength(CaluteLegth.edgeLengh(aEdge.getStartVertex(),aEdge.getEndVertex()));		
			aFace.setEdge02(aEdge);
			
			aEdge.setStartVertex(aFaceVertex.getcVertex());
			aEdge.setEndVertex(aFaceVertex.getaVertex());
			aEdge.setLength(CaluteLegth.edgeLengh(aEdge.getStartVertex(),aEdge.getEndVertex()));
			aFace.setEdge03(aEdge);
			aFaceEdgeAll.add(aFace);			
		}
		
		Vector<Edge> 
		
	}
}
