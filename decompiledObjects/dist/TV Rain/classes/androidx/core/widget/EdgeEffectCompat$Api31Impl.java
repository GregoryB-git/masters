package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import g;

@RequiresApi(31)
class EdgeEffectCompat$Api31Impl
{
  @DoNotInline
  public static EdgeEffect create(Context paramContext, AttributeSet paramAttributeSet)
  {
    try
    {
      paramAttributeSet = new EdgeEffect(paramContext, paramAttributeSet);
      return paramAttributeSet;
    }
    finally {}
    return new EdgeEffect(paramContext);
  }
  
  @DoNotInline
  public static float getDistance(EdgeEffect paramEdgeEffect)
  {
    try
    {
      float f = g.a(paramEdgeEffect);
      return f;
    }
    finally {}
    return 0.0F;
  }
  
  @DoNotInline
  public static float onPullDistance(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    try
    {
      float f = g.b(paramEdgeEffect, paramFloat1, paramFloat2);
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
 * Qualified Name:     androidx.core.widget.EdgeEffectCompat.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */