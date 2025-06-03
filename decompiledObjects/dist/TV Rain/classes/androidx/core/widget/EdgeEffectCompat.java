package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import g;

public final class EdgeEffectCompat
{
  private final EdgeEffect mEdgeEffect;
  
  @Deprecated
  public EdgeEffectCompat(Context paramContext)
  {
    mEdgeEffect = new EdgeEffect(paramContext);
  }
  
  @NonNull
  public static EdgeEffect create(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return Api31Impl.create(paramContext, paramAttributeSet);
    }
    return new EdgeEffect(paramContext);
  }
  
  public static float getDistance(@NonNull EdgeEffect paramEdgeEffect)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return Api31Impl.getDistance(paramEdgeEffect);
    }
    return 0.0F;
  }
  
  public static void onPull(@NonNull EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    Api21Impl.onPull(paramEdgeEffect, paramFloat1, paramFloat2);
  }
  
  public static float onPullDistance(@NonNull EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return Api31Impl.onPullDistance(paramEdgeEffect, paramFloat1, paramFloat2);
    }
    onPull(paramEdgeEffect, paramFloat1, paramFloat2);
    return paramFloat1;
  }
  
  @Deprecated
  public boolean draw(Canvas paramCanvas)
  {
    return mEdgeEffect.draw(paramCanvas);
  }
  
  @Deprecated
  public void finish()
  {
    mEdgeEffect.finish();
  }
  
  @Deprecated
  public boolean isFinished()
  {
    return mEdgeEffect.isFinished();
  }
  
  @Deprecated
  public boolean onAbsorb(int paramInt)
  {
    mEdgeEffect.onAbsorb(paramInt);
    return true;
  }
  
  @Deprecated
  public boolean onPull(float paramFloat)
  {
    mEdgeEffect.onPull(paramFloat);
    return true;
  }
  
  @Deprecated
  public boolean onPull(float paramFloat1, float paramFloat2)
  {
    onPull(mEdgeEffect, paramFloat1, paramFloat2);
    return true;
  }
  
  @Deprecated
  public boolean onRelease()
  {
    mEdgeEffect.onRelease();
    return mEdgeEffect.isFinished();
  }
  
  @Deprecated
  public void setSize(int paramInt1, int paramInt2)
  {
    mEdgeEffect.setSize(paramInt1, paramInt2);
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void onPull(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
    {
      paramEdgeEffect.onPull(paramFloat1, paramFloat2);
    }
  }
  
  @RequiresApi(31)
  public static class Api31Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.widget.EdgeEffectCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */