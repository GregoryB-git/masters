package c3;

import com.google.crypto.tink.shaded.protobuf.x.a;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p3.C;
import p3.C.c;
import p3.D;
import p3.D.b;
import p3.D.c;
import p3.D.c.a;
import p3.I;
import p3.y;
import p3.y.c;

public abstract class z
{
  public static final Charset a = Charset.forName("UTF-8");
  
  public static D.c a(C.c paramc)
  {
    return (D.c)D.c.a0().B(paramc.Z().a0()).A(paramc.c0()).z(paramc.b0()).y(paramc.a0()).n();
  }
  
  public static D b(C paramC)
  {
    D.b localb = D.a0().z(paramC.c0());
    paramC = paramC.b0().iterator();
    while (paramC.hasNext()) {
      localb.y(a((C.c)paramC.next()));
    }
    return (D)localb.n();
  }
  
  public static void c(C.c paramc)
  {
    if (paramc.d0())
    {
      if (paramc.b0() != I.p)
      {
        if (paramc.c0() != p3.z.p) {
          return;
        }
        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[] { Integer.valueOf(paramc.a0()) }));
      }
      throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[] { Integer.valueOf(paramc.a0()) }));
    }
    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[] { Integer.valueOf(paramc.a0()) }));
  }
  
  public static void d(C paramC)
  {
    int i = paramC.c0();
    Iterator localIterator = paramC.b0().iterator();
    int j = 0;
    int k = j;
    int m = 1;
    while (localIterator.hasNext())
    {
      paramC = (C.c)localIterator.next();
      if (paramC.c0() == p3.z.q)
      {
        c(paramC);
        int n = k;
        if (paramC.a0() == i) {
          if (k == 0) {
            n = 1;
          } else {
            throw new GeneralSecurityException("keyset contains multiple primary keys");
          }
        }
        if (paramC.Z().Z() != y.c.s) {
          m = 0;
        }
        j++;
        k = n;
      }
    }
    if (j != 0)
    {
      if ((k == 0) && (m == 0)) {
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
      }
      return;
    }
    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
  }
}

/* Location:
 * Qualified Name:     c3.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */