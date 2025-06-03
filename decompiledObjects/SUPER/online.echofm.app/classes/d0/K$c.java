package d0;

import X2.v;
import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import g0.M;
import java.util.HashMap;
import java.util.HashSet;

public class K$c
{
  public HashMap A;
  public HashSet B;
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public boolean k;
  public v l;
  public int m;
  public v n;
  public int o;
  public int p;
  public int q;
  public v r;
  public K.b s;
  public v t;
  public int u;
  public int v;
  public boolean w;
  public boolean x;
  public boolean y;
  public boolean z;
  
  public K$c()
  {
    a = Integer.MAX_VALUE;
    b = Integer.MAX_VALUE;
    c = Integer.MAX_VALUE;
    d = Integer.MAX_VALUE;
    i = Integer.MAX_VALUE;
    j = Integer.MAX_VALUE;
    k = true;
    l = v.Y();
    m = 0;
    n = v.Y();
    o = 0;
    p = Integer.MAX_VALUE;
    q = Integer.MAX_VALUE;
    r = v.Y();
    s = K.b.d;
    t = v.Y();
    u = 0;
    v = 0;
    w = false;
    x = false;
    y = false;
    z = false;
    A = new HashMap();
    B = new HashSet();
  }
  
  public K$c(Context paramContext)
  {
    this();
    G(paramContext);
    I(paramContext, true);
  }
  
  public K$c(K paramK)
  {
    D(paramK);
  }
  
  public K C()
  {
    return new K(this);
  }
  
  public final void D(K paramK)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
    h = h;
    i = i;
    j = j;
    k = k;
    l = l;
    m = m;
    n = n;
    o = o;
    p = p;
    q = q;
    r = r;
    s = s;
    t = t;
    u = u;
    v = v;
    w = w;
    x = x;
    y = y;
    z = z;
    B = new HashSet(B);
    A = new HashMap(A);
  }
  
  public c E(K paramK)
  {
    D(paramK);
    return this;
  }
  
  public c F(K.b paramb)
  {
    s = paramb;
    return this;
  }
  
  public c G(Context paramContext)
  {
    if ((M.a < 23) && (Looper.myLooper() == null)) {
      return this;
    }
    paramContext = (CaptioningManager)paramContext.getSystemService("captioning");
    if ((paramContext != null) && (paramContext.isEnabled()))
    {
      u = 1088;
      paramContext = paramContext.getLocale();
      if (paramContext != null) {
        t = v.Z(M.Z(paramContext));
      }
    }
    return this;
  }
  
  public c H(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    i = paramInt1;
    j = paramInt2;
    k = paramBoolean;
    return this;
  }
  
  public c I(Context paramContext, boolean paramBoolean)
  {
    paramContext = M.S(paramContext);
    return H(x, y, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     d0.K.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */