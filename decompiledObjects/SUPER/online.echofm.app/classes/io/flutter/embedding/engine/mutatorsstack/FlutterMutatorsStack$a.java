package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Rect;

public class FlutterMutatorsStack$a
{
  public Matrix a;
  public Rect b;
  public float[] c;
  public FlutterMutatorsStack.b d = FlutterMutatorsStack.b.p;
  
  public FlutterMutatorsStack$a(FlutterMutatorsStack paramFlutterMutatorsStack, Matrix paramMatrix)
  {
    a = paramMatrix;
  }
  
  public FlutterMutatorsStack$a(FlutterMutatorsStack paramFlutterMutatorsStack, Rect paramRect)
  {
    b = paramRect;
  }
  
  public FlutterMutatorsStack$a(FlutterMutatorsStack paramFlutterMutatorsStack, Rect paramRect, float[] paramArrayOfFloat)
  {
    b = paramRect;
    c = paramArrayOfFloat;
  }
  
  public Matrix a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */