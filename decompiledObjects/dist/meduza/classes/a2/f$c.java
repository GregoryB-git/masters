package a2;

import android.graphics.Matrix;
import java.util.ArrayList;
import r.b;
import r.h;

public final class f$c
  extends f.d
{
  public final Matrix a = new Matrix();
  public final ArrayList<f.d> b = new ArrayList();
  public float c = 0.0F;
  public float d = 0.0F;
  public float e = 0.0F;
  public float f = 1.0F;
  public float g = 1.0F;
  public float h = 0.0F;
  public float i = 0.0F;
  public final Matrix j;
  public int k;
  public String l;
  
  public f$c()
  {
    j = new Matrix();
    l = null;
  }
  
  public f$c(c paramc, b<String, Object> paramb)
  {
    Object localObject1 = new Matrix();
    j = ((Matrix)localObject1);
    l = null;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
    h = h;
    i = i;
    Object localObject2 = l;
    l = ((String)localObject2);
    k = k;
    if (localObject2 != null) {
      paramb.put(localObject2, this);
    }
    ((Matrix)localObject1).set(j);
    localObject2 = b;
    int m = 0;
    while (m < ((ArrayList)localObject2).size())
    {
      paramc = ((ArrayList)localObject2).get(m);
      if ((paramc instanceof c))
      {
        paramc = (c)paramc;
        b.add(new c(paramc, paramb));
      }
      else
      {
        if ((paramc instanceof f.b))
        {
          paramc = new f.b((f.b)paramc);
        }
        else
        {
          if (!(paramc instanceof f.a)) {
            break label307;
          }
          paramc = new f.a((f.a)paramc);
        }
        b.add(paramc);
        localObject1 = b;
        if (localObject1 != null) {
          paramb.put(localObject1, paramc);
        }
      }
      m++;
      continue;
      label307:
      throw new IllegalStateException("Unknown object in the tree!");
    }
  }
  
  public final boolean a()
  {
    for (int m = 0; m < b.size(); m++) {
      if (((f.d)b.get(m)).a()) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean b(int[] paramArrayOfInt)
  {
    int m = 0;
    boolean bool = false;
    while (m < b.size())
    {
      bool |= ((f.d)b.get(m)).b(paramArrayOfInt);
      m++;
    }
    return bool;
  }
  
  public final void c()
  {
    j.reset();
    j.postTranslate(-d, -e);
    j.postScale(f, g);
    j.postRotate(c, 0.0F, 0.0F);
    j.postTranslate(h + d, i + e);
  }
  
  public String getGroupName()
  {
    return l;
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
      c();
    }
  }
  
  public void setPivotY(float paramFloat)
  {
    if (paramFloat != e)
    {
      e = paramFloat;
      c();
    }
  }
  
  public void setRotation(float paramFloat)
  {
    if (paramFloat != c)
    {
      c = paramFloat;
      c();
    }
  }
  
  public void setScaleX(float paramFloat)
  {
    if (paramFloat != f)
    {
      f = paramFloat;
      c();
    }
  }
  
  public void setScaleY(float paramFloat)
  {
    if (paramFloat != g)
    {
      g = paramFloat;
      c();
    }
  }
  
  public void setTranslateX(float paramFloat)
  {
    if (paramFloat != h)
    {
      h = paramFloat;
      c();
    }
  }
  
  public void setTranslateY(float paramFloat)
  {
    if (paramFloat != i)
    {
      i = paramFloat;
      c();
    }
  }
}

/* Location:
 * Qualified Name:     a2.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */