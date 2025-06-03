package k0;

import A0.y;
import B0.b;
import B0.h;
import d0.I;
import g0.M;
import g0.a;
import g0.o;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import l0.y1;
import x0.Z;
import x0.x.b;

public class r
  implements x0
{
  public final h a;
  public final long b;
  public final long c;
  public final long d;
  public final long e;
  public final int f;
  public final boolean g;
  public final long h;
  public final boolean i;
  public final HashMap j;
  public long k;
  
  public r()
  {
    this(new h(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
  }
  
  public r(h paramh, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, int paramInt6, boolean paramBoolean2)
  {
    k(paramInt3, 0, "bufferForPlaybackMs", "0");
    k(paramInt4, 0, "bufferForPlaybackAfterRebufferMs", "0");
    k(paramInt1, paramInt3, "minBufferMs", "bufferForPlaybackMs");
    k(paramInt1, paramInt4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
    k(paramInt2, paramInt1, "maxBufferMs", "minBufferMs");
    k(paramInt6, 0, "backBufferDurationMs", "0");
    a = paramh;
    b = M.J0(paramInt1);
    c = M.J0(paramInt2);
    d = M.J0(paramInt3);
    e = M.J0(paramInt4);
    f = paramInt5;
    g = paramBoolean1;
    h = M.J0(paramInt6);
    i = paramBoolean2;
    j = new HashMap();
    k = -1L;
  }
  
  public static void k(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    boolean bool;
    if (paramInt1 >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" cannot be less than ");
    localStringBuilder.append(paramString2);
    a.b(bool, localStringBuilder.toString());
  }
  
  public static int n(int paramInt)
  {
    switch (paramInt)
    {
    case -1: 
    default: 
      throw new IllegalArgumentException();
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      return 131072;
    case 2: 
      return 131072000;
    case 1: 
      return 13107200;
    case 0: 
      return 144310272;
    }
    return 0;
  }
  
  public void a(y1 paramy1)
  {
    long l1 = Thread.currentThread().getId();
    long l2 = k;
    boolean bool;
    if ((l2 != -1L) && (l2 != l1)) {
      bool = false;
    } else {
      bool = true;
    }
    a.g(bool, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
    k = l1;
    if (!j.containsKey(paramy1)) {
      j.put(paramy1, new c(null));
    }
    p(paramy1);
  }
  
  public void b(y1 paramy1, I paramI, x.b paramb, Y0[] paramArrayOfY0, Z paramZ, y[] paramArrayOfy)
  {
    paramy1 = (c)a.e((c)j.get(paramy1));
    int m = f;
    int n = m;
    if (m == -1) {
      n = l(paramArrayOfY0, paramArrayOfy);
    }
    b = n;
    q();
  }
  
  public boolean c(x0.a parama)
  {
    c localc = (c)a.e((c)j.get(a));
    int m = a.f();
    int n = m();
    boolean bool1 = true;
    if (m >= n) {
      n = 1;
    } else {
      n = 0;
    }
    long l1 = b;
    float f1 = f;
    long l2 = l1;
    if (f1 > 1.0F) {
      l2 = Math.min(M.c0(l1, f1), c);
    }
    l2 = Math.max(l2, 500000L);
    l1 = e;
    if (l1 < l2)
    {
      boolean bool2 = bool1;
      if (!g) {
        if (n == 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      a = bool2;
      if ((!bool2) && (l1 < 500000L)) {
        o.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
      }
    }
    else if ((l1 >= c) || (n != 0))
    {
      a = false;
    }
    return a;
  }
  
  public void d(y1 paramy1)
  {
    o(paramy1);
    if (j.isEmpty()) {
      k = -1L;
    }
  }
  
  public boolean e(x0.a parama)
  {
    long l1 = M.h0(e, f);
    long l2;
    if (h) {
      l2 = e;
    } else {
      l2 = d;
    }
    long l3 = i;
    long l4 = l2;
    if (l3 != -9223372036854775807L) {
      l4 = Math.min(l3 / 2L, l2);
    }
    boolean bool;
    if ((l4 > 0L) && (l1 < l4) && ((g) || (a.f() < m()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean f(y1 paramy1)
  {
    return i;
  }
  
  public void g(y1 paramy1)
  {
    o(paramy1);
  }
  
  public long h(y1 paramy1)
  {
    return h;
  }
  
  public b i()
  {
    return a;
  }
  
  public int l(Y0[] paramArrayOfY0, y[] paramArrayOfy)
  {
    int m = 0;
    int i1;
    for (int n = 0; m < paramArrayOfY0.length; n = i1)
    {
      i1 = n;
      if (paramArrayOfy[m] != null) {
        i1 = n + n(paramArrayOfY0[m].l());
      }
      m++;
    }
    return Math.max(13107200, n);
  }
  
  public int m()
  {
    Iterator localIterator = j.values().iterator();
    int m = 0;
    while (localIterator.hasNext()) {
      m += nextb;
    }
    return m;
  }
  
  public final void o(y1 paramy1)
  {
    if (j.remove(paramy1) != null) {
      q();
    }
  }
  
  public final void p(y1 paramy1)
  {
    paramy1 = (c)a.e((c)j.get(paramy1));
    int m = f;
    int n = m;
    if (m == -1) {
      n = 13107200;
    }
    b = n;
    a = false;
  }
  
  public final void q()
  {
    if (j.isEmpty()) {
      a.g();
    } else {
      a.h(m());
    }
  }
  
  public static final class b
  {
    public h a;
    public int b = 50000;
    public int c = 50000;
    public int d = 2500;
    public int e = 5000;
    public int f = -1;
    public boolean g = false;
    public int h = 0;
    public boolean i = false;
    public boolean j;
    
    public r a()
    {
      a.f(j ^ true);
      j = true;
      if (a == null) {
        a = new h(true, 65536);
      }
      return new r(a, b, c, d, e, f, g, h, i);
    }
    
    public b b(int paramInt, boolean paramBoolean)
    {
      a.f(j ^ true);
      r.j(paramInt, 0, "backBufferDurationMs", "0");
      h = paramInt;
      i = paramBoolean;
      return this;
    }
    
    public b c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      a.f(j ^ true);
      r.j(paramInt3, 0, "bufferForPlaybackMs", "0");
      r.j(paramInt4, 0, "bufferForPlaybackAfterRebufferMs", "0");
      r.j(paramInt1, paramInt3, "minBufferMs", "bufferForPlaybackMs");
      r.j(paramInt1, paramInt4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
      r.j(paramInt2, paramInt1, "maxBufferMs", "minBufferMs");
      b = paramInt1;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
      return this;
    }
    
    public b d(boolean paramBoolean)
    {
      a.f(j ^ true);
      g = paramBoolean;
      return this;
    }
    
    public b e(int paramInt)
    {
      a.f(j ^ true);
      f = paramInt;
      return this;
    }
  }
  
  public static class c
  {
    public boolean a;
    public int b;
  }
}

/* Location:
 * Qualified Name:     k0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */