package s5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;

public final class d
{
  public int A;
  public int B;
  public int C;
  public int D;
  public StaticLayout E;
  public StaticLayout F;
  public int G;
  public int H;
  public int I;
  public Rect J;
  public final float a;
  public final float b;
  public final float c;
  public final float d;
  public final float e;
  public final TextPaint f;
  public final Paint g;
  public final Paint h;
  public CharSequence i;
  public Layout.Alignment j;
  public Bitmap k;
  public float l;
  public int m;
  public int n;
  public float o;
  public int p;
  public float q;
  public float r;
  public int s;
  public int t;
  public int u;
  public int v;
  public int w;
  public float x;
  public float y;
  public float z;
  
  public d(Context paramContext)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, new int[] { 16843287, 16843288 }, 0, 0);
    e = localTypedArray.getDimensionPixelSize(0, 0);
    d = localTypedArray.getFloat(1, 1.0F);
    localTypedArray.recycle();
    float f1 = Math.round(getResourcesgetDisplayMetricsdensityDpi * 2.0F / 160.0F);
    a = f1;
    b = f1;
    c = f1;
    paramContext = new TextPaint();
    f = paramContext;
    paramContext.setAntiAlias(true);
    paramContext.setSubpixelText(true);
    paramContext = new Paint();
    g = paramContext;
    paramContext.setAntiAlias(true);
    paramContext.setStyle(Paint.Style.FILL);
    paramContext = new Paint();
    h = paramContext;
    paramContext.setAntiAlias(true);
    paramContext.setFilterBitmap(true);
  }
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      StaticLayout localStaticLayout1 = E;
      StaticLayout localStaticLayout2 = F;
      if ((localStaticLayout1 != null) && (localStaticLayout2 != null))
      {
        int i1 = paramCanvas.save();
        paramCanvas.translate(G, H);
        if (Color.alpha(u) > 0)
        {
          g.setColor(u);
          paramCanvas.drawRect(-I, 0.0F, localStaticLayout1.getWidth() + I, localStaticLayout1.getHeight(), g);
        }
        int i2 = w;
        int i3 = 1;
        if (i2 == 1)
        {
          f.setStrokeJoin(Paint.Join.ROUND);
          f.setStrokeWidth(a);
          f.setColor(v);
          f.setStyle(Paint.Style.FILL_AND_STROKE);
          localStaticLayout2.draw(paramCanvas);
        }
        else
        {
          TextPaint localTextPaint;
          float f1;
          float f2;
          if (i2 == 2)
          {
            localTextPaint = f;
            f1 = b;
            f2 = c;
            localTextPaint.setShadowLayer(f1, f2, f2, v);
          }
          else if ((i2 == 3) || (i2 == 4))
          {
            if (i2 != 3) {
              i3 = 0;
            }
            int i4 = -1;
            if (i3 != 0) {
              i2 = -1;
            } else {
              i2 = v;
            }
            if (i3 != 0) {
              i4 = v;
            }
            f2 = b / 2.0F;
            f.setColor(s);
            f.setStyle(Paint.Style.FILL);
            localTextPaint = f;
            f1 = b;
            float f3 = -f2;
            localTextPaint.setShadowLayer(f1, f3, f3, i2);
            localStaticLayout2.draw(paramCanvas);
            f.setShadowLayer(b, f2, f2, i4);
          }
        }
        f.setColor(s);
        f.setStyle(Paint.Style.FILL);
        localStaticLayout1.draw(paramCanvas);
        f.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
        paramCanvas.restoreToCount(i1);
      }
    }
    else
    {
      J.getClass();
      k.getClass();
      paramCanvas.drawBitmap(k, null, J, h);
    }
  }
}

/* Location:
 * Qualified Name:     s5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */