package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.PathParser.PathDataNode;

class AnimatorInflaterCompat$PathDataEvaluator
  implements TypeEvaluator<PathParser.PathDataNode[]>
{
  private PathParser.PathDataNode[] mNodeArray;
  
  public AnimatorInflaterCompat$PathDataEvaluator() {}
  
  public AnimatorInflaterCompat$PathDataEvaluator(PathParser.PathDataNode[] paramArrayOfPathDataNode)
  {
    mNodeArray = paramArrayOfPathDataNode;
  }
  
  public PathParser.PathDataNode[] evaluate(float paramFloat, PathParser.PathDataNode[] paramArrayOfPathDataNode1, PathParser.PathDataNode[] paramArrayOfPathDataNode2)
  {
    if (PathParser.canMorph(paramArrayOfPathDataNode1, paramArrayOfPathDataNode2))
    {
      if (!PathParser.canMorph(mNodeArray, paramArrayOfPathDataNode1)) {
        mNodeArray = PathParser.deepCopyNodes(paramArrayOfPathDataNode1);
      }
      for (int i = 0; i < paramArrayOfPathDataNode1.length; i++) {
        mNodeArray[i].interpolatePathDataNode(paramArrayOfPathDataNode1[i], paramArrayOfPathDataNode2[i], paramFloat);
      }
      return mNodeArray;
    }
    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.PathDataEvaluator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */