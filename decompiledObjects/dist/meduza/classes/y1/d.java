package y1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.LinearInterpolator;
import z0.a;

public final class d
  extends Drawable
  implements Animatable
{
  public static final LinearInterpolator o = new LinearInterpolator();
  public static final a p = new a();
  public static final int[] q = { -16777216 };
  public final a a;
  public float b;
  public Resources c;
  public ValueAnimator d;
  public float e;
  public boolean f;
  
  public d(Context paramContext)
  {
    paramContext.getClass();
    c = paramContext.getResources();
    paramContext = new a();
    a = paramContext;
    i = q;
    paramContext.a(0);
    h = 2.5F;
    b.setStrokeWidth(2.5F);
    invalidateSelf();
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator.addUpdateListener(new b(this, paramContext));
    localValueAnimator.setRepeatCount(-1);
    localValueAnimator.setRepeatMode(1);
    localValueAnimator.setInterpolator(o);
    localValueAnimator.addListener(new c(this, paramContext));
    d = localValueAnimator;
  }
  
  public static void c(float paramFloat, a parama)
  {
    int i;
    if (paramFloat > 0.75F)
    {
      paramFloat = (paramFloat - 0.75F) / 0.25F;
      int[] arrayOfInt = i;
      i = j;
      int j = arrayOfInt[i];
      int k = arrayOfInt[((i + 1) % arrayOfInt.length)];
      int m = j >> 24 & 0xFF;
      i = j >> 16 & 0xFF;
      int n = j >> 8 & 0xFF;
      j &= 0xFF;
      i = m + (int)(((k >> 24 & 0xFF) - m) * paramFloat) << 24 | i + (int)(((k >> 16 & 0xFF) - i) * paramFloat) << 16 | n + (int)(((k >> 8 & 0xFF) - n) * paramFloat) << 8 | j + (int)(paramFloat * ((k & 0xFF) - j));
    }
    else
    {
      i = i[j];
    }
    u = i;
  }
  
  public final void a(float paramFloat, a parama, boolean paramBoolean)
  {
    float f1;
    float f2;
    float f3;
    if (f)
    {
      c(paramFloat, parama);
      f1 = (float)(Math.floor(m / 0.8F) + 1.0D);
      f2 = k;
      f3 = l;
      e = ((f3 - 0.01F - f2) * paramFloat + f2);
      f = f3;
      f2 = m;
      g = ((f1 - f2) * paramFloat + f2);
    }
    else if ((paramFloat != 1.0F) || (paramBoolean))
    {
      f3 = m;
      if (paramFloat < 0.5F)
      {
        f2 = paramFloat / 0.5F;
        f1 = k;
        f2 = p.getInterpolation(f2) * 0.79F + 0.01F + f1;
      }
      else
      {
        f1 = (paramFloat - 0.5F) / 0.5F;
        f2 = k + 0.79F;
        f1 = f2 - ((1.0F - p.getInterpolation(f1)) * 0.79F + 0.01F);
      }
      float f4 = e;
      e = f1;
      f = f2;
      g = (0.20999998F * paramFloat + f3);
      b = ((paramFloat + f4) * 216.0F);
    }
  }
  
  public final void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a locala = a;
    float f1 = c.getDisplayMetrics().density;
    paramFloat2 *= f1;
    h = paramFloat2;
    b.setStrokeWidth(paramFloat2);
    q = (paramFloat1 * f1);
    locala.a(0);
    r = ((int)(paramFloat3 * f1));
    s = ((int)(paramFloat4 * f1));
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Object localObject = getBounds();
    paramCanvas.save();
    paramCanvas.rotate(b, ((Rect)localObject).exactCenterX(), ((Rect)localObject).exactCenterY());
    a locala = a;
    RectF localRectF = a;
    float f1 = q;
    float f2 = h / 2.0F + f1;
    if (f1 <= 0.0F) {
      f2 = Math.min(((Rect)localObject).width(), ((Rect)localObject).height()) / 2.0F - Math.max(r * p / 2.0F, h / 2.0F);
    }
    localRectF.set(((Rect)localObject).centerX() - f2, ((Rect)localObject).centerY() - f2, ((Rect)localObject).centerX() + f2, ((Rect)localObject).centerY() + f2);
    f2 = e;
    f1 = g;
    f2 = (f2 + f1) * 360.0F;
    f1 = (f + f1) * 360.0F - f2;
    b.setColor(u);
    b.setAlpha(t);
    float f3 = h / 2.0F;
    localRectF.inset(f3, f3);
    paramCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(), localRectF.width() / 2.0F, d);
    f3 = -f3;
    localRectF.inset(f3, f3);
    paramCanvas.drawArc(localRectF, f2, f1, false, b);
    if (n)
    {
      localObject = o;
      if (localObject == null)
      {
        localObject = new Path();
        o = ((Path)localObject);
        ((Path)localObject).setFillType(Path.FillType.EVEN_ODD);
      }
      else
      {
        ((Path)localObject).reset();
      }
      float f4 = Math.min(localRectF.width(), localRectF.height()) / 2.0F;
      f3 = r * p / 2.0F;
      o.moveTo(0.0F, 0.0F);
      o.lineTo(r * p, 0.0F);
      localObject = o;
      float f5 = r;
      float f6 = p;
      ((Path)localObject).lineTo(f5 * f6 / 2.0F, s * f6);
      localObject = o;
      f6 = localRectF.centerX();
      f5 = localRectF.centerY();
      ((Path)localObject).offset(f6 + f4 - f3, h / 2.0F + f5);
      o.close();
      c.setColor(u);
      c.setAlpha(t);
      paramCanvas.save();
      paramCanvas.rotate(f2 + f1, localRectF.centerX(), localRectF.centerY());
      paramCanvas.drawPath(o, c);
      paramCanvas.restore();
    }
    paramCanvas.restore();
  }
  
  public final int getAlpha()
  {
    return a.t;
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean isRunning()
  {
    return d.isRunning();
  }
  
  public final void setAlpha(int paramInt)
  {
    a.t = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    a.b.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public final void start()
  {
    d.cancel();
    Object localObject = a;
    float f1 = e;
    k = f1;
    float f2 = f;
    l = f2;
    m = g;
    long l;
    if (f2 != f1)
    {
      f = true;
      localObject = d;
      l = 666L;
    }
    else
    {
      ((a)localObject).a(0);
      localObject = a;
      k = 0.0F;
      l = 0.0F;
      m = 0.0F;
      e = 0.0F;
      f = 0.0F;
      g = 0.0F;
      localObject = d;
      l = 1332L;
    }
    ((Animator)localObject).setDuration(l);
    d.start();
  }
  
  public final void stop()
  {
    d.cancel();
    b = 0.0F;
    a locala = a;
    if (n) {
      n = false;
    }
    locala.a(0);
    locala = a;
    k = 0.0F;
    l = 0.0F;
    m = 0.0F;
    e = 0.0F;
    f = 0.0F;
    g = 0.0F;
    invalidateSelf();
  }
  
  public static final class a
  {
    public final RectF a = new RectF();
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int[] i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public Path o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    
    public a()
    {
      Paint localPaint1 = new Paint();
      b = localPaint1;
      Paint localPaint2 = new Paint();
      c = localPaint2;
      Paint localPaint3 = new Paint();
      d = localPaint3;
      e = 0.0F;
      f = 0.0F;
      g = 0.0F;
      h = 5.0F;
      p = 1.0F;
      t = 255;
      localPaint1.setStrokeCap(Paint.Cap.SQUARE);
      localPaint1.setAntiAlias(true);
      localPaint1.setStyle(Paint.Style.STROKE);
      localPaint2.setStyle(Paint.Style.FILL);
      localPaint2.setAntiAlias(true);
      localPaint3.setColor(0);
    }
    
    public final void a(int paramInt)
    {
      j = paramInt;
      u = i[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     y1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */