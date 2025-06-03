package u1;

import A.g;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import z.d;
import z.k;

public class g$c
  extends g.f
{
  public int[] e;
  public d f;
  public float g = 0.0F;
  public d h;
  public float i = 1.0F;
  public float j = 1.0F;
  public float k = 0.0F;
  public float l = 1.0F;
  public float m = 0.0F;
  public Paint.Cap n = Paint.Cap.BUTT;
  public Paint.Join o = Paint.Join.MITER;
  public float p = 4.0F;
  
  public g$c() {}
  
  public g$c(c paramc)
  {
    super(paramc);
    e = e;
    f = f;
    g = g;
    i = i;
    h = h;
    c = c;
    j = j;
    k = k;
    l = l;
    m = m;
    n = n;
    o = o;
    p = p;
  }
  
  public boolean a()
  {
    boolean bool;
    if ((!h.i()) && (!f.i())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean b(int[] paramArrayOfInt)
  {
    boolean bool = h.j(paramArrayOfInt);
    return f.j(paramArrayOfInt) | bool;
  }
  
  public final Paint.Cap e(int paramInt, Paint.Cap paramCap)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return paramCap;
        }
        return Paint.Cap.SQUARE;
      }
      return Paint.Cap.ROUND;
    }
    return Paint.Cap.BUTT;
  }
  
  public final Paint.Join f(int paramInt, Paint.Join paramJoin)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return paramJoin;
        }
        return Paint.Join.BEVEL;
      }
      return Paint.Join.ROUND;
    }
    return Paint.Join.MITER;
  }
  
  public void g(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = k.k(paramResources, paramTheme, paramAttributeSet, a.c);
    h(paramResources, paramXmlPullParser, paramTheme);
    paramResources.recycle();
  }
  
  public float getFillAlpha()
  {
    return j;
  }
  
  public int getFillColor()
  {
    return h.e();
  }
  
  public float getStrokeAlpha()
  {
    return i;
  }
  
  public int getStrokeColor()
  {
    return f.e();
  }
  
  public float getStrokeWidth()
  {
    return g;
  }
  
  public float getTrimPathEnd()
  {
    return l;
  }
  
  public float getTrimPathOffset()
  {
    return m;
  }
  
  public float getTrimPathStart()
  {
    return k;
  }
  
  public final void h(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    e = null;
    if (!k.j(paramXmlPullParser, "pathData")) {
      return;
    }
    String str = paramTypedArray.getString(0);
    if (str != null) {
      b = str;
    }
    str = paramTypedArray.getString(2);
    if (str != null) {
      a = g.d(str);
    }
    h = k.e(paramTypedArray, paramXmlPullParser, paramTheme, "fillColor", 1, 0);
    j = k.f(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, j);
    n = e(k.g(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1), n);
    o = f(k.g(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1), o);
    p = k.f(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, p);
    f = k.e(paramTypedArray, paramXmlPullParser, paramTheme, "strokeColor", 3, 0);
    i = k.f(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, i);
    g = k.f(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, g);
    l = k.f(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, l);
    m = k.f(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, m);
    k = k.f(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, k);
    c = k.g(paramTypedArray, paramXmlPullParser, "fillType", 13, c);
  }
  
  public void setFillAlpha(float paramFloat)
  {
    j = paramFloat;
  }
  
  public void setFillColor(int paramInt)
  {
    h.k(paramInt);
  }
  
  public void setStrokeAlpha(float paramFloat)
  {
    i = paramFloat;
  }
  
  public void setStrokeColor(int paramInt)
  {
    f.k(paramInt);
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    g = paramFloat;
  }
  
  public void setTrimPathEnd(float paramFloat)
  {
    l = paramFloat;
  }
  
  public void setTrimPathOffset(float paramFloat)
  {
    m = paramFloat;
  }
  
  public void setTrimPathStart(float paramFloat)
  {
    k = paramFloat;
  }
}

/* Location:
 * Qualified Name:     u1.g.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */