package y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import b.z;
import e0.d0;
import e0.d0.d;
import java.util.WeakHashMap;

public final class a
  extends ImageView
{
  public Animation.AnimationListener a;
  public int b;
  
  public a(Context paramContext)
  {
    super(paramContext);
    float f = getContextgetResourcesgetDisplayMetricsdensity;
    paramContext = getContext().obtainStyledAttributes(z.q);
    b = paramContext.getColor(0, -328966);
    paramContext.recycle();
    paramContext = new ShapeDrawable(new OvalShape());
    WeakHashMap localWeakHashMap = d0.a;
    d0.d.s(this, f * 4.0F);
    paramContext.getPaint().setColor(b);
    setBackground(paramContext);
  }
  
  public final void onAnimationEnd()
  {
    super.onAnimationEnd();
    Animation.AnimationListener localAnimationListener = a;
    if (localAnimationListener != null) {
      localAnimationListener.onAnimationEnd(getAnimation());
    }
  }
  
  public final void onAnimationStart()
  {
    super.onAnimationStart();
    Animation.AnimationListener localAnimationListener = a;
    if (localAnimationListener != null) {
      localAnimationListener.onAnimationStart(getAnimation());
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable))
    {
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt);
      b = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     y1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */