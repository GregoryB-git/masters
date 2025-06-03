package L;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class c
{
  public static EdgeEffect a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return b.a(paramContext, paramAttributeSet);
    }
    return new EdgeEffect(paramContext);
  }
  
  public static float b(EdgeEffect paramEdgeEffect)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return b.b(paramEdgeEffect);
    }
    return 0.0F;
  }
  
  public static void c(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    a.a(paramEdgeEffect, paramFloat1, paramFloat2);
  }
  
  public static float d(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return b.c(paramEdgeEffect, paramFloat1, paramFloat2);
    }
    c(paramEdgeEffect, paramFloat1, paramFloat2);
    return paramFloat1;
  }
  
  public static abstract class a
  {
    public static void a(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
    {
      paramEdgeEffect.onPull(paramFloat1, paramFloat2);
    }
  }
  
  public static abstract class b
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
        float f = paramEdgeEffect.getDistance();
        return f;
      }
      finally {}
      return 0.0F;
    }
    
    public static float c(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
    {
      try
      {
        float f = paramEdgeEffect.onPullDistance(paramFloat1, paramFloat2);
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
 * Qualified Name:     L.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */