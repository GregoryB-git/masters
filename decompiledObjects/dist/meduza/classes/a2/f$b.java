package a2;

import android.content.res.ColorStateList;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import w.c;

public final class f$b
  extends f.e
{
  public c e;
  public float f = 0.0F;
  public c g;
  public float h = 1.0F;
  public float i = 1.0F;
  public float j = 0.0F;
  public float k = 1.0F;
  public float l = 0.0F;
  public Paint.Cap m = Paint.Cap.BUTT;
  public Paint.Join n = Paint.Join.MITER;
  public float o = 4.0F;
  
  public f$b() {}
  
  public f$b(b paramb)
  {
    super(paramb);
    e = e;
    f = f;
    h = h;
    g = g;
    c = c;
    i = i;
    j = j;
    k = k;
    l = l;
    m = m;
    n = n;
    o = o;
  }
  
  public final boolean a()
  {
    boolean bool;
    if ((!g.b()) && (!e.b())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean b(int[] paramArrayOfInt)
  {
    c localc = g;
    boolean bool = localc.b();
    int i1 = 1;
    ColorStateList localColorStateList;
    if (bool)
    {
      localColorStateList = b;
      i2 = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
      if (i2 != c)
      {
        c = i2;
        i2 = 1;
        break label60;
      }
    }
    int i2 = 0;
    label60:
    localc = e;
    if (localc.b())
    {
      localColorStateList = b;
      int i3 = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
      if (i3 != c)
      {
        c = i3;
        break label112;
      }
    }
    i1 = 0;
    label112:
    return i1 | i2;
  }
  
  public float getFillAlpha()
  {
    return i;
  }
  
  public int getFillColor()
  {
    return g.c;
  }
  
  public float getStrokeAlpha()
  {
    return h;
  }
  
  public int getStrokeColor()
  {
    return e.c;
  }
  
  public float getStrokeWidth()
  {
    return f;
  }
  
  public float getTrimPathEnd()
  {
    return k;
  }
  
  public float getTrimPathOffset()
  {
    return l;
  }
  
  public float getTrimPathStart()
  {
    return j;
  }
  
  public void setFillAlpha(float paramFloat)
  {
    i = paramFloat;
  }
  
  public void setFillColor(int paramInt)
  {
    g.c = paramInt;
  }
  
  public void setStrokeAlpha(float paramFloat)
  {
    h = paramFloat;
  }
  
  public void setStrokeColor(int paramInt)
  {
    e.c = paramInt;
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    f = paramFloat;
  }
  
  public void setTrimPathEnd(float paramFloat)
  {
    k = paramFloat;
  }
  
  public void setTrimPathOffset(float paramFloat)
  {
    l = paramFloat;
  }
  
  public void setTrimPathStart(float paramFloat)
  {
    j = paramFloat;
  }
}

/* Location:
 * Qualified Name:     a2.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */