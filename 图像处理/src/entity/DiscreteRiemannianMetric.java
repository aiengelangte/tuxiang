package entity;

import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;
import org.apache.commons.math3.ml.neuralnet.UpdateAction;

import cern.colt.matrix.impl.SparseDoubleMatrix2D;

public class DiscreteRiemannianMetric {
	
	private Integer vertexSum;
	private TriangleMesh mesh;
	private SparseDoubleMatrix2D lMatrix2d = new SparseDoubleMatrix2D(vertexSum, vertexSum);
	
	public void update()
	{
		lMatrix2d.
	}
	
	

}
