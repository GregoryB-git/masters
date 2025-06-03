package x5;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public final class k
  extends GestureDetector.SimpleOnGestureListener
  implements View.OnTouchListener, d.a
{
  public final PointF a = new PointF();
  public final PointF b = new PointF();
  public final a c;
  public final float d;
  public final GestureDetector e;
  public volatile float f;
  
  public k(Context paramContext, j.a parama)
  {
    c = parama;
    d = 25.0F;
    e = new GestureDetector(paramContext, this);
    f = 3.1415927F;
  }
  
  public final void a(float[] paramArrayOfFloat, float paramFloat)
  {
    f = (-paramFloat);
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    a.set(paramMotionEvent.getX(), paramMotionEvent.getY());
    return true;
  }
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent arg2, float paramFloat1, float paramFloat2)
  {
    paramFloat1 = (???.getX() - a.x) / d;
    paramFloat2 = ???.getY();
    paramMotionEvent1 = a;
    float f1 = (paramFloat2 - y) / d;
    paramMotionEvent1.set(???.getX(), ???.getY());
    double d1 = f;
    float f2 = (float)Math.cos(d1);
    paramFloat2 = (float)Math.sin(d1);
    paramMotionEvent1 = b;
    x -= f2 * paramFloat1 - paramFloat2 * f1;
    paramFloat1 = f2 * f1 + paramFloat2 * paramFloat1 + y;
    y = paramFloat1;
    y = Math.max(-45.0F, Math.min(45.0F, paramFloat1));
    ??? = c;
    paramMotionEvent1 = b;
    synchronized ((j.a)???)
    {
      paramFloat1 = y;
      o = paramFloat1;
      Matrix.setRotateM(e, 0, -paramFloat1, (float)Math.cos(p), (float)Math.sin(p), 0.0F);
      Matrix.setRotateM(f, 0, -x, 0.0F, 1.0F, 0.0F);
      return true;
    }
  }
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return c).s.performClick();
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    return e.onTouchEvent(paramMotionEvent);
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     x5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */