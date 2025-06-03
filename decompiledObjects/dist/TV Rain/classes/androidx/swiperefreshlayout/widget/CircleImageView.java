package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

class CircleImageView
  extends ImageView
{
  private static final int FILL_SHADOW_COLOR = 1023410176;
  private static final int KEY_SHADOW_COLOR = 503316480;
  private static final int SHADOW_ELEVATION = 4;
  private static final float SHADOW_RADIUS = 3.5F;
  private static final float X_OFFSET = 0.0F;
  private static final float Y_OFFSET = 1.75F;
  private Animation.AnimationListener mListener;
  public int mShadowRadius;
  
  public CircleImageView(Context paramContext, int paramInt)
  {
    super(paramContext);
    float f = getContextgetResourcesgetDisplayMetricsdensity;
    int i = (int)(1.75F * f);
    int j = (int)(0.0F * f);
    mShadowRadius = ((int)(3.5F * f));
    if (elevationSupported())
    {
      paramContext = new ShapeDrawable(new OvalShape());
      ViewCompat.setElevation(this, f * 4.0F);
    }
    else
    {
      paramContext = new ShapeDrawable(new OvalShadow(mShadowRadius));
      setLayerType(1, paramContext.getPaint());
      paramContext.getPaint().setShadowLayer(mShadowRadius, j, i, 503316480);
      j = mShadowRadius;
      setPadding(j, j, j, j);
    }
    paramContext.getPaint().setColor(paramInt);
    ViewCompat.setBackground(this, paramContext);
  }
  
  private boolean elevationSupported()
  {
    return true;
  }
  
  public void onAnimationEnd()
  {
    super.onAnimationEnd();
    Animation.AnimationListener localAnimationListener = mListener;
    if (localAnimationListener != null) {
      localAnimationListener.onAnimationEnd(getAnimation());
    }
  }
  
  public void onAnimationStart()
  {
    super.onAnimationStart();
    Animation.AnimationListener localAnimationListener = mListener;
    if (localAnimationListener != null) {
      localAnimationListener.onAnimationStart(getAnimation());
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!elevationSupported())
    {
      paramInt1 = getMeasuredWidth();
      int i = mShadowRadius;
      paramInt2 = getMeasuredHeight();
      setMeasuredDimension(i * 2 + paramInt1, mShadowRadius * 2 + paramInt2);
    }
  }
  
  public void setAnimationListener(Animation.AnimationListener paramAnimationListener)
  {
    mListener = paramAnimationListener;
  }
  
  public void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable)) {
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt);
    }
  }
  
  public void setBackgroundColorRes(int paramInt)
  {
    setBackgroundColor(ContextCompat.getColor(getContext(), paramInt));
  }
  
  public class OvalShadow
    extends OvalShape
  {
    private RadialGradient mRadialGradient;
    private Paint mShadowPaint = new Paint();
    
    public OvalShadow(int paramInt)
    {
      mShadowRadius = paramInt;
      updateRadialGradient((int)rect().width());
    }
    
    private void updateRadialGradient(int paramInt)
    {
      float f1 = paramInt / 2;
      float f2 = mShadowRadius;
      Object localObject = Shader.TileMode.CLAMP;
      localObject = new RadialGradient(f1, f1, f2, new int[] { 1023410176, 0 }, null, (Shader.TileMode)localObject);
      mRadialGradient = ((RadialGradient)localObject);
      mShadowPaint.setShader((Shader)localObject);
    }
    
    public void draw(Canvas paramCanvas, Paint paramPaint)
    {
      int i = getWidth();
      int j = getHeight();
      i /= 2;
      float f1 = i;
      float f2 = j / 2;
      paramCanvas.drawCircle(f1, f2, f1, mShadowPaint);
      paramCanvas.drawCircle(f1, f2, i - mShadowRadius, paramPaint);
    }
    
    public void onResize(float paramFloat1, float paramFloat2)
    {
      super.onResize(paramFloat1, paramFloat2);
      updateRadialGradient((int)paramFloat1);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircleImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */