package q0;

import F0.r;
import F0.s;
import X2.v;
import android.net.Uri;
import android.text.TextUtils;
import c1.t.a;
import d0.o;
import d0.q;
import d0.q.b;
import d0.x;
import d0.z;
import g0.E;
import g0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l0.y1;
import l1.J;
import l1.e;
import l1.j;

public final class d
  implements h
{
  public static final int[] f = { 8, 13, 11, 2, 0, 1, 7 };
  public final int b;
  public t.a c;
  public boolean d;
  public final boolean e;
  
  public d()
  {
    this(0, true);
  }
  
  public d(int paramInt, boolean paramBoolean)
  {
    b = paramInt;
    e = paramBoolean;
    c = new c1.h();
  }
  
  public static void d(int paramInt, List paramList)
  {
    if ((a3.f.j(f, paramInt) != -1) && (!paramList.contains(Integer.valueOf(paramInt)))) {
      paramList.add(Integer.valueOf(paramInt));
    }
  }
  
  public static Z0.h g(t.a parama, boolean paramBoolean, E paramE, q paramq, List paramList)
  {
    int i;
    if (j(paramq)) {
      i = 4;
    } else {
      i = 0;
    }
    int j = i;
    if (!paramBoolean)
    {
      parama = t.a.a;
      j = i | 0x20;
    }
    if (paramList == null) {
      for (;;)
      {
        paramList = v.Y();
      }
    }
    return new Z0.h(parama, j, paramE, null, paramList, null);
  }
  
  public static J h(int paramInt, boolean paramBoolean1, q paramq, List paramList, E paramE, t.a parama, boolean paramBoolean2)
  {
    int i = paramInt | 0x10;
    if (paramList != null)
    {
      paramInt |= 0x30;
    }
    else if (paramBoolean1)
    {
      paramList = Collections.singletonList(new q.b().o0("application/cea-608").K());
      paramInt = i;
    }
    else
    {
      paramList = Collections.emptyList();
      paramInt = i;
    }
    paramq = j;
    i = paramInt;
    if (!TextUtils.isEmpty(paramq))
    {
      int j = paramInt;
      if (!z.b(paramq, "audio/mp4a-latm")) {
        j = paramInt | 0x2;
      }
      i = j;
      if (!z.b(paramq, "video/avc")) {
        i = j | 0x4;
      }
    }
    if (!paramBoolean2) {
      parama = t.a.a;
    }
    for (paramInt = 1;; paramInt = 0) {
      break;
    }
    return new J(2, paramInt, parama, paramE, new j(i, paramList), 112800);
  }
  
  public static boolean j(q paramq)
  {
    x localx = k;
    if (localx == null) {
      return false;
    }
    for (int i = 0; i < localx.e(); i++)
    {
      paramq = localx.d(i);
      if ((paramq instanceof t)) {
        return q.isEmpty() ^ true;
      }
    }
    return false;
  }
  
  /* Error */
  public static boolean k(r paramr, s params)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface 162 2 0
    //   7: istore_2
    //   8: aload_1
    //   9: invokeinterface 166 1 0
    //   14: goto +21 -> 35
    //   17: astore_0
    //   18: aload_1
    //   19: invokeinterface 166 1 0
    //   24: aload_0
    //   25: athrow
    //   26: astore_0
    //   27: aload_1
    //   28: invokeinterface 166 1 0
    //   33: iconst_0
    //   34: istore_2
    //   35: iload_2
    //   36: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	paramr	r
    //   0	37	1	params	s
    //   7	29	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	8	17	finally
    //   0	8	26	java/io/EOFException
  }
  
  public q b(q paramq)
  {
    Object localObject = paramq;
    if (d)
    {
      localObject = paramq;
      if (c.a(paramq))
      {
        q.b localb = paramq.a().o0("application/x-media3-cues").S(c.c(paramq));
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(n);
        if (j != null)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(" ");
          localStringBuilder.append(j);
          paramq = localStringBuilder.toString();
        }
        else
        {
          paramq = "";
        }
        ((StringBuilder)localObject).append(paramq);
        localObject = localb.O(((StringBuilder)localObject).toString()).s0(Long.MAX_VALUE).K();
      }
    }
    return (q)localObject;
  }
  
  public b e(Uri paramUri, q paramq, List paramList, E paramE, Map paramMap, s params, y1 paramy1)
  {
    int i = o.a(n);
    int j = o.b(paramMap);
    int k = o.c(paramUri);
    paramUri = f;
    ArrayList localArrayList = new ArrayList(paramUri.length);
    d(i, localArrayList);
    d(j, localArrayList);
    d(k, localArrayList);
    int m = paramUri.length;
    int n = 0;
    for (int i1 = 0; i1 < m; i1++) {
      d(paramUri[i1], localArrayList);
    }
    params.h();
    paramMap = null;
    i1 = n;
    while (i1 < localArrayList.size())
    {
      n = ((Integer)localArrayList.get(i1)).intValue();
      paramy1 = (r)a.e(f(n, paramq, paramList, paramE));
      if (k(paramy1, params)) {
        return new b(paramy1, paramq, paramE, c, d);
      }
      paramUri = paramMap;
      if (paramMap == null) {
        if ((n != i) && (n != j) && (n != k))
        {
          paramUri = paramMap;
          if (n != 11) {}
        }
        else
        {
          paramUri = paramy1;
        }
      }
      i1++;
      paramMap = paramUri;
    }
    return new b((r)a.e(paramMap), paramq, paramE, c, d);
  }
  
  public final r f(int paramInt, q paramq, List paramList, E paramE)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 7)
          {
            if (paramInt != 8)
            {
              if (paramInt != 11)
              {
                if (paramInt != 13) {
                  return null;
                }
                return new w(d, paramE, c, d);
              }
              return h(b, e, paramq, paramList, paramE, c, d);
            }
            return g(c, d, paramE, paramq, paramList);
          }
          return new Y0.f(0, 0L);
        }
        return new l1.h();
      }
      return new e();
    }
    return new l1.b();
  }
  
  public d i(boolean paramBoolean)
  {
    d = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     q0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */