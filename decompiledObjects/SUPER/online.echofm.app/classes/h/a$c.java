package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import t.f;
import t.i;

public class a$c
  extends d.a
{
  public f K;
  public i L;
  
  public a$c(c paramc, a parama, Resources paramResources)
  {
    super(paramc, parama, paramResources);
    if (paramc != null) {
      K = K;
    }
    for (paramc = L;; paramc = new i())
    {
      L = paramc;
      break;
      K = new f();
    }
  }
  
  public static long D(int paramInt1, int paramInt2)
  {
    long l = paramInt1;
    return paramInt2 | l << 32;
  }
  
  public int B(int[] paramArrayOfInt, Drawable paramDrawable, int paramInt)
  {
    int i = super.z(paramArrayOfInt, paramDrawable);
    L.n(i, Integer.valueOf(paramInt));
    return i;
  }
  
  public int C(int paramInt1, int paramInt2, Drawable paramDrawable, boolean paramBoolean)
  {
    int i = super.a(paramDrawable);
    long l1 = D(paramInt1, paramInt2);
    long l2;
    if (paramBoolean) {
      l2 = 8589934592L;
    } else {
      l2 = 0L;
    }
    paramDrawable = K;
    long l3 = i;
    paramDrawable.a(l1, Long.valueOf(l3 | l2));
    if (paramBoolean)
    {
      l1 = D(paramInt2, paramInt1);
      K.a(l1, Long.valueOf(0x100000000 | l3 | l2));
    }
    return i;
  }
  
  public int E(int paramInt)
  {
    int i = 0;
    if (paramInt < 0) {
      paramInt = i;
    } else {
      paramInt = ((Integer)L.j(paramInt, Integer.valueOf(0))).intValue();
    }
    return paramInt;
  }
  
  public int F(int[] paramArrayOfInt)
  {
    int i = super.A(paramArrayOfInt);
    if (i >= 0) {
      return i;
    }
    return super.A(StateSet.WILD_CARD);
  }
  
  public int G(int paramInt1, int paramInt2)
  {
    long l = D(paramInt1, paramInt2);
    return (int)((Long)K.g(l, Long.valueOf(-1L))).longValue();
  }
  
  public boolean H(int paramInt1, int paramInt2)
  {
    long l = D(paramInt1, paramInt2);
    boolean bool;
    if ((((Long)K.g(l, Long.valueOf(-1L))).longValue() & 0x100000000) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean I(int paramInt1, int paramInt2)
  {
    long l = D(paramInt1, paramInt2);
    boolean bool;
    if ((((Long)K.g(l, Long.valueOf(-1L))).longValue() & 0x200000000) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Drawable newDrawable()
  {
    return new a(this, null);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return new a(this, paramResources);
  }
  
  public void r()
  {
    K = K.b();
    L = L.d();
  }
}

/* Location:
 * Qualified Name:     h.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */