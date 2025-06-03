package u1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;
import t.a;
import t.h;
import z.d;

public class g$g
{
  public static final Matrix q = new Matrix();
  public final Path a;
  public final Path b;
  public final Matrix c = new Matrix();
  public Paint d;
  public Paint e;
  public PathMeasure f;
  public int g;
  public final g.d h;
  public float i = 0.0F;
  public float j = 0.0F;
  public float k = 0.0F;
  public float l = 0.0F;
  public int m = 255;
  public String n = null;
  public Boolean o = null;
  public final a p;
  
  public g$g()
  {
    p = new a();
    h = new g.d();
    a = new Path();
    b = new Path();
  }
  
  public g$g(g paramg)
  {
    a locala = new a();
    p = locala;
    h = new g.d(h, locala);
    a = new Path(a);
    b = new Path(b);
    i = i;
    j = j;
    k = k;
    l = l;
    g = g;
    m = m;
    n = n;
    String str = n;
    if (str != null) {
      locala.put(str, this);
    }
    o = o;
  }
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return paramFloat1 * paramFloat4 - paramFloat2 * paramFloat3;
  }
  
  public void b(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    c(h, q, paramCanvas, paramInt1, paramInt2, paramColorFilter);
  }
  
  public final void c(g.d paramd, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    a.set(paramMatrix);
    a.preConcat(j);
    paramCanvas.save();
    for (int i1 = 0; i1 < b.size(); i1++)
    {
      paramMatrix = (g.e)b.get(i1);
      if ((paramMatrix instanceof g.d)) {
        c((g.d)paramMatrix, a, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      } else if ((paramMatrix instanceof g.f)) {
        d(paramd, (g.f)paramMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
    }
    paramCanvas.restore();
  }
  
  public final void d(g.d paramd, g.f paramf, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    float f1 = paramInt1 / k;
    float f2 = paramInt2 / l;
    float f3 = Math.min(f1, f2);
    paramd = a;
    c.set(paramd);
    c.postScale(f1, f2);
    f1 = e(paramd);
    if (f1 == 0.0F) {
      return;
    }
    paramf.d(a);
    Object localObject1 = a;
    b.reset();
    if (paramf.c())
    {
      paramColorFilter = b;
      if (c == 0) {
        paramd = Path.FillType.WINDING;
      } else {
        paramd = Path.FillType.EVEN_ODD;
      }
      paramColorFilter.setFillType(paramd);
      b.addPath((Path)localObject1, c);
      paramCanvas.clipPath(b);
    }
    else
    {
      paramf = (g.c)paramf;
      float f4 = k;
      if ((f4 != 0.0F) || (l != 1.0F))
      {
        float f5 = m;
        float f6 = l;
        if (f == null) {
          f = new PathMeasure();
        }
        f.setPath(a, false);
        f2 = f.getLength();
        f4 = (f4 + f5) % 1.0F * f2;
        f5 = (f6 + f5) % 1.0F * f2;
        ((Path)localObject1).reset();
        if (f4 > f5)
        {
          f.getSegment(f4, f2, (Path)localObject1, true);
          f.getSegment(0.0F, f5, (Path)localObject1, true);
        }
        else
        {
          f.getSegment(f4, f5, (Path)localObject1, true);
        }
        ((Path)localObject1).rLineTo(0.0F, 0.0F);
      }
      b.addPath((Path)localObject1, c);
      Object localObject2;
      if (h.l())
      {
        paramd = h;
        if (e == null)
        {
          localObject1 = new Paint(1);
          e = ((Paint)localObject1);
          ((Paint)localObject1).setStyle(Paint.Style.FILL);
        }
        localObject1 = e;
        if (paramd.h())
        {
          paramd = paramd.f();
          paramd.setLocalMatrix(c);
          ((Paint)localObject1).setShader(paramd);
          ((Paint)localObject1).setAlpha(Math.round(j * 255.0F));
        }
        else
        {
          ((Paint)localObject1).setShader(null);
          ((Paint)localObject1).setAlpha(255);
          ((Paint)localObject1).setColor(g.a(paramd.e(), j));
        }
        ((Paint)localObject1).setColorFilter(paramColorFilter);
        localObject2 = b;
        if (c == 0) {
          paramd = Path.FillType.WINDING;
        } else {
          paramd = Path.FillType.EVEN_ODD;
        }
        ((Path)localObject2).setFillType(paramd);
        paramCanvas.drawPath(b, (Paint)localObject1);
      }
      if (f.l())
      {
        paramd = f;
        if (d == null)
        {
          localObject1 = new Paint(1);
          d = ((Paint)localObject1);
          ((Paint)localObject1).setStyle(Paint.Style.STROKE);
        }
        localObject1 = d;
        localObject2 = o;
        if (localObject2 != null) {
          ((Paint)localObject1).setStrokeJoin((Paint.Join)localObject2);
        }
        localObject2 = n;
        if (localObject2 != null) {
          ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
        }
        ((Paint)localObject1).setStrokeMiter(p);
        if (paramd.h())
        {
          paramd = paramd.f();
          paramd.setLocalMatrix(c);
          ((Paint)localObject1).setShader(paramd);
          ((Paint)localObject1).setAlpha(Math.round(i * 255.0F));
        }
        else
        {
          ((Paint)localObject1).setShader(null);
          ((Paint)localObject1).setAlpha(255);
          ((Paint)localObject1).setColor(g.a(paramd.e(), i));
        }
        ((Paint)localObject1).setColorFilter(paramColorFilter);
        ((Paint)localObject1).setStrokeWidth(g * (f3 * f1));
        paramCanvas.drawPath(b, (Paint)localObject1);
      }
    }
  }
  
  public final float e(Matrix paramMatrix)
  {
    float f1 = 0.0F;
    float[] arrayOfFloat = new float[4];
    float[] tmp7_6 = arrayOfFloat;
    tmp7_6[0] = 0.0F;
    float[] tmp11_7 = tmp7_6;
    tmp11_7[1] = 1.0F;
    float[] tmp15_11 = tmp11_7;
    tmp15_11[2] = 1.0F;
    float[] tmp19_15 = tmp15_11;
    tmp19_15[3] = 0.0F;
    tmp19_15;
    paramMatrix.mapVectors(arrayOfFloat);
    float f2 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
    float f3 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
    float f4 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
    f3 = Math.max(f2, f3);
    if (f3 > 0.0F) {
      f1 = Math.abs(f4) / f3;
    }
    return f1;
  }
  
  public boolean f()
  {
    if (o == null) {
      o = Boolean.valueOf(h.a());
    }
    return o.booleanValue();
  }
  
  public boolean g(int[] paramArrayOfInt)
  {
    return h.b(paramArrayOfInt);
  }
  
  public float getAlpha()
  {
    return getRootAlpha() / 255.0F;
  }
  
  public int getRootAlpha()
  {
    return m;
  }
  
  public void setAlpha(float paramFloat)
  {
    setRootAlpha((int)(paramFloat * 255.0F));
  }
  
  public void setRootAlpha(int paramInt)
  {
    m = paramInt;
  }
}

/* Location:
 * Qualified Name:     u1.g.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */