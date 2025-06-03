package u1;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import t.h;
import z.k;

public class g$d
  extends g.e
{
  public final Matrix a = new Matrix();
  public final ArrayList b = new ArrayList();
  public float c = 0.0F;
  public float d = 0.0F;
  public float e = 0.0F;
  public float f = 1.0F;
  public float g = 1.0F;
  public float h = 0.0F;
  public float i = 0.0F;
  public final Matrix j;
  public int k;
  public int[] l;
  public String m;
  
  public g$d()
  {
    super(null);
    j = new Matrix();
    m = null;
  }
  
  public g$d(d paramd, t.a parama)
  {
    super(null);
    Object localObject1 = new Matrix();
    j = ((Matrix)localObject1);
    m = null;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
    h = h;
    i = i;
    l = l;
    Object localObject2 = m;
    m = ((String)localObject2);
    k = k;
    if (localObject2 != null) {
      parama.put(localObject2, this);
    }
    ((Matrix)localObject1).set(j);
    localObject2 = b;
    int n = 0;
    while (n < ((ArrayList)localObject2).size())
    {
      paramd = ((ArrayList)localObject2).get(n);
      if ((paramd instanceof d))
      {
        paramd = (d)paramd;
        b.add(new d(paramd, parama));
      }
      else
      {
        if ((paramd instanceof g.c))
        {
          paramd = new g.c((g.c)paramd);
        }
        else
        {
          if (!(paramd instanceof g.b)) {
            break label316;
          }
          paramd = new g.b((g.b)paramd);
        }
        b.add(paramd);
        localObject1 = b;
        if (localObject1 != null) {
          parama.put(localObject1, paramd);
        }
      }
      n++;
      continue;
      label316:
      throw new IllegalStateException("Unknown object in the tree!");
    }
  }
  
  public boolean a()
  {
    for (int n = 0; n < b.size(); n++) {
      if (((g.e)b.get(n)).a()) {
        return true;
      }
    }
    return false;
  }
  
  public boolean b(int[] paramArrayOfInt)
  {
    int n = 0;
    boolean bool = false;
    while (n < b.size())
    {
      bool |= ((g.e)b.get(n)).b(paramArrayOfInt);
      n++;
    }
    return bool;
  }
  
  public void c(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = k.k(paramResources, paramTheme, paramAttributeSet, a.b);
    e(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
  
  public final void d()
  {
    j.reset();
    j.postTranslate(-d, -e);
    j.postScale(f, g);
    j.postRotate(c, 0.0F, 0.0F);
    j.postTranslate(h + d, i + e);
  }
  
  public final void e(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    l = null;
    c = k.f(paramTypedArray, paramXmlPullParser, "rotation", 5, c);
    d = paramTypedArray.getFloat(1, d);
    e = paramTypedArray.getFloat(2, e);
    f = k.f(paramTypedArray, paramXmlPullParser, "scaleX", 3, f);
    g = k.f(paramTypedArray, paramXmlPullParser, "scaleY", 4, g);
    h = k.f(paramTypedArray, paramXmlPullParser, "translateX", 6, h);
    i = k.f(paramTypedArray, paramXmlPullParser, "translateY", 7, i);
    paramTypedArray = paramTypedArray.getString(0);
    if (paramTypedArray != null) {
      m = paramTypedArray;
    }
    d();
  }
  
  public String getGroupName()
  {
    return m;
  }
  
  public Matrix getLocalMatrix()
  {
    return j;
  }
  
  public float getPivotX()
  {
    return d;
  }
  
  public float getPivotY()
  {
    return e;
  }
  
  public float getRotation()
  {
    return c;
  }
  
  public float getScaleX()
  {
    return f;
  }
  
  public float getScaleY()
  {
    return g;
  }
  
  public float getTranslateX()
  {
    return h;
  }
  
  public float getTranslateY()
  {
    return i;
  }
  
  public void setPivotX(float paramFloat)
  {
    if (paramFloat != d)
    {
      d = paramFloat;
      d();
    }
  }
  
  public void setPivotY(float paramFloat)
  {
    if (paramFloat != e)
    {
      e = paramFloat;
      d();
    }
  }
  
  public void setRotation(float paramFloat)
  {
    if (paramFloat != c)
    {
      c = paramFloat;
      d();
    }
  }
  
  public void setScaleX(float paramFloat)
  {
    if (paramFloat != f)
    {
      f = paramFloat;
      d();
    }
  }
  
  public void setScaleY(float paramFloat)
  {
    if (paramFloat != g)
    {
      g = paramFloat;
      d();
    }
  }
  
  public void setTranslateX(float paramFloat)
  {
    if (paramFloat != h)
    {
      h = paramFloat;
      d();
    }
  }
  
  public void setTranslateY(float paramFloat)
  {
    if (paramFloat != i)
    {
      i = paramFloat;
      d();
    }
  }
}

/* Location:
 * Qualified Name:     u1.g.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */