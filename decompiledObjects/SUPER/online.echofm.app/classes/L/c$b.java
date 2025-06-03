package L;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class c$b
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

/* Location:
 * Qualified Name:     L.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */