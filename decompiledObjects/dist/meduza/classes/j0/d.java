package j0;

import a4.r;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import e0.h0;

public final class d
{
  public static float a(EdgeEffect paramEdgeEffect)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return b.b(paramEdgeEffect);
    }
    return 0.0F;
  }
  
  public static float b(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return b.c(paramEdgeEffect, paramFloat1, paramFloat2);
    }
    a.a(paramEdgeEffect, paramFloat1, paramFloat2);
    return paramFloat1;
  }
  
  public static final class a
  {
    public static void a(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
    {
      paramEdgeEffect.onPull(paramFloat1, paramFloat2);
    }
  }
  
  public static final class b
  {
    public static EdgeEffect a(Context paramContext, AttributeSet paramAttributeSet)
    {
      try
      {
        paramAttributeSet = new EdgeEffect(paramContext, paramAttributeSet);
        return paramAttributeSet;
      }
      finally {}
      return new EdgeEffect(paramContext);
    }
    
    public static float b(EdgeEffect paramEdgeEffect)
    {
      try
      {
        float f = h0.a(paramEdgeEffect);
        return f;
      }
      finally {}
      return 0.0F;
    }
    
    public static float c(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
    {
      try
      {
        float f = r.a(paramEdgeEffect, paramFloat1, paramFloat2);
        return f;
      }
      finally
      {
        paramEdgeEffect.onPull(paramFloat1, paramFloat2);
      }
      return 0.0F;
    }
  }
}

/* Location:
 * Qualified Name:     j0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */