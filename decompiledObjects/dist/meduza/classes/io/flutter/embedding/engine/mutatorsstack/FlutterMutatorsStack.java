package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class FlutterMutatorsStack
{
  private List<Path> finalClippingPaths = new ArrayList();
  private Matrix finalMatrix = new Matrix();
  private List<FlutterMutator> mutators = new ArrayList();
  
  public List<Path> getFinalClippingPaths()
  {
    return finalClippingPaths;
  }
  
  public Matrix getFinalMatrix()
  {
    return finalMatrix;
  }
  
  public List<FlutterMutator> getMutators()
  {
    return mutators;
  }
  
  public void pushClipRRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat)
  {
    Rect localRect = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = new FlutterMutator(localRect, paramArrayOfFloat);
    mutators.add(localObject);
    localObject = new Path();
    ((Path)localObject).addRoundRect(new RectF(localRect), paramArrayOfFloat, Path.Direction.CCW);
    ((Path)localObject).transform(finalMatrix);
    finalClippingPaths.add(localObject);
  }
  
  public void pushClipRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = new FlutterMutator(localRect);
    mutators.add(localObject);
    localObject = new Path();
    ((Path)localObject).addRect(new RectF(localRect), Path.Direction.CCW);
    ((Path)localObject).transform(finalMatrix);
    finalClippingPaths.add(localObject);
  }
  
  public void pushTransform(float[] paramArrayOfFloat)
  {
    Matrix localMatrix = new Matrix();
    localMatrix.setValues(paramArrayOfFloat);
    paramArrayOfFloat = new FlutterMutator(localMatrix);
    mutators.add(paramArrayOfFloat);
    finalMatrix.preConcat(paramArrayOfFloat.getMatrix());
  }
  
  public class FlutterMutator
  {
    private Matrix matrix;
    private Path path;
    private float[] radiis;
    private Rect rect;
    private FlutterMutatorsStack.FlutterMutatorType type = FlutterMutatorsStack.FlutterMutatorType.CLIP_RRECT;
    
    public FlutterMutator(Matrix paramMatrix)
    {
      matrix = paramMatrix;
    }
    
    public FlutterMutator(Path paramPath)
    {
      path = paramPath;
    }
    
    public FlutterMutator(Rect paramRect)
    {
      rect = paramRect;
    }
    
    public FlutterMutator(Rect paramRect, float[] paramArrayOfFloat)
    {
      rect = paramRect;
      radiis = paramArrayOfFloat;
    }
    
    public Matrix getMatrix()
    {
      return matrix;
    }
    
    public Path getPath()
    {
      return path;
    }
    
    public Rect getRect()
    {
      return rect;
    }
    
    public FlutterMutatorsStack.FlutterMutatorType getType()
    {
      return type;
    }
  }
  
  public static enum FlutterMutatorType
  {
    static
    {
      CLIP_PATH = new FlutterMutatorType("CLIP_PATH", 2);
      TRANSFORM = new FlutterMutatorType("TRANSFORM", 3);
      OPACITY = new FlutterMutatorType("OPACITY", 4);
    }
    
    private FlutterMutatorType() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */