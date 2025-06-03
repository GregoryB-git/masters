package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FlutterMutatorsStack
{
  private List<Path> finalClippingPaths = new ArrayList();
  private Matrix finalMatrix = new Matrix();
  @NonNull
  private List<a> mutators = new ArrayList();
  
  public List<Path> getFinalClippingPaths()
  {
    return finalClippingPaths;
  }
  
  public Matrix getFinalMatrix()
  {
    return finalMatrix;
  }
  
  public List<a> getMutators()
  {
    return mutators;
  }
  
  public void pushClipRRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat)
  {
    Rect localRect = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = new a(localRect, paramArrayOfFloat);
    mutators.add(localObject);
    localObject = new Path();
    ((Path)localObject).addRoundRect(new RectF(localRect), paramArrayOfFloat, Path.Direction.CCW);
    ((Path)localObject).transform(finalMatrix);
    finalClippingPaths.add(localObject);
  }
  
  public void pushClipRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = new a(localRect);
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
    paramArrayOfFloat = new a(localMatrix);
    mutators.add(paramArrayOfFloat);
    finalMatrix.preConcat(paramArrayOfFloat.a());
  }
  
  public class a
  {
    public Matrix a;
    public Rect b;
    public float[] c;
    public FlutterMutatorsStack.b d = FlutterMutatorsStack.b.p;
    
    public a(Matrix paramMatrix)
    {
      a = paramMatrix;
    }
    
    public a(Rect paramRect)
    {
      b = paramRect;
    }
    
    public a(Rect paramRect, float[] paramArrayOfFloat)
    {
      b = paramRect;
      c = paramArrayOfFloat;
    }
    
    public Matrix a()
    {
      return a;
    }
  }
  
  public static enum b {}
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */