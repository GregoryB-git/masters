package y1;

import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;

public final class d$a
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
  
  public d$a()
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

/* Location:
 * Qualified Name:     y1.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */