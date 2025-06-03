package a2;

import android.graphics.Canvas;
import android.graphics.Color;
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
import r.b;
import r.h;
import w.c;
import x.d.a;

public final class f$f
{
  public static final Matrix p = new Matrix();
  public final Path a;
  public final Path b;
  public final Matrix c = new Matrix();
  public Paint d;
  public Paint e;
  public PathMeasure f;
  public final f.c g;
  public float h = 0.0F;
  public float i = 0.0F;
  public float j = 0.0F;
  public float k = 0.0F;
  public int l = 255;
  public String m = null;
  public Boolean n = null;
  public final b<String, Object> o;
  
  public f$f()
  {
    o = new b();
    g = new f.c();
    a = new Path();
    b = new Path();
  }
  
  public f$f(f paramf)
  {
    b localb = new b();
    o = localb;
    g = new f.c(g, localb);
    a = new Path(a);
    b = new Path(b);
    h = h;
    i = i;
    j = j;
    k = k;
    l = l;
    m = m;
    String str = m;
    if (str != null) {
      localb.put(str, this);
    }
    n = n;
  }
  
  public final void a(f.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    a.set(paramMatrix);
    a.preConcat(j);
    paramCanvas.save();
    paramMatrix = this;
    for (int i1 = 0; i1 < b.size(); i1++)
    {
      Object localObject1 = (f.d)b.get(i1);
      if ((localObject1 instanceof f.c))
      {
        a((f.c)localObject1, a, paramCanvas, paramInt1, paramInt2);
      }
      else if ((localObject1 instanceof f.e))
      {
        localObject1 = (f.e)localObject1;
        float f1 = paramInt1 / j;
        float f2 = paramInt2 / k;
        float f3 = Math.min(f1, f2);
        Object localObject2 = a;
        c.set((Matrix)localObject2);
        c.postScale(f1, f2);
        paramMatrix = new float[4];
        Matrix tmp161_160 = paramMatrix;
        tmp161_160[0] = 0.0F;
        Matrix tmp165_161 = tmp161_160;
        tmp165_161[1] = 1.0F;
        Matrix tmp169_165 = tmp165_161;
        tmp169_165[2] = 1.0F;
        Matrix tmp173_169 = tmp169_165;
        tmp173_169[3] = 0.0F;
        tmp173_169;
        ((Matrix)localObject2).mapVectors(paramMatrix);
        float f4 = (float)Math.hypot(paramMatrix[0], paramMatrix[1]);
        float f5 = (float)Math.hypot(paramMatrix[2], paramMatrix[3]);
        f1 = paramMatrix[0];
        float f6 = paramMatrix[1];
        f2 = paramMatrix[2];
        float f7 = paramMatrix[3];
        f5 = Math.max(f4, f5);
        if (f5 > 0.0F) {
          f1 = Math.abs(f1 * f7 - f6 * f2) / f5;
        } else {
          f1 = 0.0F;
        }
        if (f1 != 0.0F)
        {
          paramMatrix = a;
          localObject1.getClass();
          paramMatrix.reset();
          localObject2 = a;
          if (localObject2 != null) {
            d.a.b((d.a[])localObject2, paramMatrix);
          }
          localObject2 = a;
          b.reset();
          Object localObject3;
          if ((localObject1 instanceof f.a))
          {
            localObject3 = b;
            if (c == 0) {
              paramMatrix = Path.FillType.WINDING;
            } else {
              paramMatrix = Path.FillType.EVEN_ODD;
            }
            ((Path)localObject3).setFillType(paramMatrix);
            b.addPath((Path)localObject2, c);
            paramCanvas.clipPath(b);
          }
          else
          {
            localObject1 = (f.b)localObject1;
            f5 = j;
            if ((f5 != 0.0F) || (k != 1.0F))
            {
              f6 = l;
              f7 = k;
              if (f == null) {
                f = new PathMeasure();
              }
              f.setPath(a, false);
              f2 = f.getLength();
              f5 = (f5 + f6) % 1.0F * f2;
              f7 = (f7 + f6) % 1.0F * f2;
              ((Path)localObject2).reset();
              if (f5 > f7)
              {
                f.getSegment(f5, f2, (Path)localObject2, true);
                f.getSegment(0.0F, f7, (Path)localObject2, true);
              }
              else
              {
                f.getSegment(f5, f7, (Path)localObject2, true);
              }
              ((Path)localObject2).rLineTo(0.0F, 0.0F);
            }
            b.addPath((Path)localObject2, c);
            paramMatrix = g;
            int i2;
            if (a != null) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            if ((i2 == 0) && (c == 0)) {
              i2 = 0;
            } else {
              i2 = 1;
            }
            if (i2 != 0)
            {
              if (e == null)
              {
                localObject2 = new Paint(1);
                e = ((Paint)localObject2);
                ((Paint)localObject2).setStyle(Paint.Style.FILL);
              }
              localObject2 = e;
              localObject3 = a;
              if (localObject3 != null) {
                i2 = 1;
              } else {
                i2 = 0;
              }
              if (i2 != 0)
              {
                ((Shader)localObject3).setLocalMatrix(c);
                ((Paint)localObject2).setShader((Shader)localObject3);
                ((Paint)localObject2).setAlpha(Math.round(i * 255.0F));
              }
              else
              {
                ((Paint)localObject2).setShader(null);
                ((Paint)localObject2).setAlpha(255);
                i2 = c;
                f2 = i;
                paramMatrix = f.r;
                ((Paint)localObject2).setColor(i2 & 0xFFFFFF | (int)(Color.alpha(i2) * f2) << 24);
              }
              ((Paint)localObject2).setColorFilter(null);
              localObject3 = b;
              if (c == 0) {
                paramMatrix = Path.FillType.WINDING;
              } else {
                paramMatrix = Path.FillType.EVEN_ODD;
              }
              ((Path)localObject3).setFillType(paramMatrix);
              paramCanvas.drawPath(b, (Paint)localObject2);
            }
            paramMatrix = e;
            if (a != null) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            if ((i2 == 0) && (c == 0)) {
              i2 = 0;
            } else {
              i2 = 1;
            }
            if (i2 != 0)
            {
              if (d == null)
              {
                localObject2 = new Paint(1);
                d = ((Paint)localObject2);
                ((Paint)localObject2).setStyle(Paint.Style.STROKE);
              }
              i2 = 1;
              localObject2 = d;
              localObject3 = n;
              if (localObject3 != null) {
                ((Paint)localObject2).setStrokeJoin((Paint.Join)localObject3);
              }
              localObject3 = m;
              if (localObject3 != null) {
                ((Paint)localObject2).setStrokeCap((Paint.Cap)localObject3);
              }
              ((Paint)localObject2).setStrokeMiter(o);
              localObject3 = a;
              if (localObject3 == null) {
                i2 = 0;
              }
              if (i2 != 0)
              {
                ((Shader)localObject3).setLocalMatrix(c);
                ((Paint)localObject2).setShader((Shader)localObject3);
                ((Paint)localObject2).setAlpha(Math.round(h * 255.0F));
              }
              else
              {
                ((Paint)localObject2).setShader(null);
                ((Paint)localObject2).setAlpha(255);
                i2 = c;
                f2 = h;
                paramMatrix = f.r;
                ((Paint)localObject2).setColor(i2 & 0xFFFFFF | (int)(Color.alpha(i2) * f2) << 24);
              }
              ((Paint)localObject2).setColorFilter(null);
              ((Paint)localObject2).setStrokeWidth(f * (f1 * f3));
              paramCanvas.drawPath(b, (Paint)localObject2);
            }
          }
        }
        paramMatrix = this;
      }
    }
    paramCanvas.restore();
  }
  
  public float getAlpha()
  {
    return getRootAlpha() / 255.0F;
  }
  
  public int getRootAlpha()
  {
    return l;
  }
  
  public void setAlpha(float paramFloat)
  {
    setRootAlpha((int)(paramFloat * 255.0F));
  }
  
  public void setRootAlpha(int paramInt)
  {
    l = paramInt;
  }
}

/* Location:
 * Qualified Name:     a2.f.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */