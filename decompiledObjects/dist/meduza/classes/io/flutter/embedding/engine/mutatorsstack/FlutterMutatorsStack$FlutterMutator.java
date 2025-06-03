package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;

public class FlutterMutatorsStack$FlutterMutator
{
  private Matrix matrix;
  private Path path;
  private float[] radiis;
  private Rect rect;
  private FlutterMutatorsStack.FlutterMutatorType type = FlutterMutatorsStack.FlutterMutatorType.CLIP_RRECT;
  
  public FlutterMutatorsStack$FlutterMutator(FlutterMutatorsStack paramFlutterMutatorsStack, Matrix paramMatrix)
  {
    matrix = paramMatrix;
  }
  
  public FlutterMutatorsStack$FlutterMutator(FlutterMutatorsStack paramFlutterMutatorsStack, Path paramPath)
  {
    path = paramPath;
  }
  
  public FlutterMutatorsStack$FlutterMutator(FlutterMutatorsStack paramFlutterMutatorsStack, Rect paramRect)
  {
    rect = paramRect;
  }
  
  public FlutterMutatorsStack$FlutterMutator(FlutterMutatorsStack paramFlutterMutatorsStack, Rect paramRect, float[] paramArrayOfFloat)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */