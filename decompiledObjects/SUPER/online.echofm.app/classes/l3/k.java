package l3;

import c3.l.b;
import c3.t;
import com.google.crypto.tink.shaded.protobuf.x.a;
import h3.b.b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import k3.d;
import k3.d.a;
import k3.d.a.a;
import k3.l;
import k3.m;
import p3.u;
import p3.v;
import p3.v.b;
import p3.w;
import p3.w.b;
import p3.x.b;
import p3.y.c;
import q3.o;
import q3.r;

public final class k
  extends d
{
  public static final l d = l.b(new j(), i.class, g.class);
  
  public k()
  {
    super(v.class, new m[] { new a(t.class) });
  }
  
  public static d.a.a m(int paramInt1, int paramInt2, u paramu, l.b paramb)
  {
    return new d.a.a((w)w.a0().z((p3.x)p3.x.a0().y(paramu).z(paramInt2).n()).y(paramInt1).n(), paramb);
  }
  
  public static void p(boolean paramBoolean)
  {
    c3.x.l(new k(), paramBoolean);
    n.c();
    k3.h.c().d(d);
  }
  
  public static void r(p3.x paramx)
  {
    if (paramx.Z() >= 10)
    {
      int i = c.a[paramx.Y().ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                if (paramx.Z() > 64) {
                  throw new GeneralSecurityException("tag size too big");
                }
              }
              else {
                throw new GeneralSecurityException("unknown hash type");
              }
            }
            else if (paramx.Z() > 48) {
              throw new GeneralSecurityException("tag size too big");
            }
          }
          else if (paramx.Z() > 32) {
            throw new GeneralSecurityException("tag size too big");
          }
        }
        else if (paramx.Z() > 28) {
          throw new GeneralSecurityException("tag size too big");
        }
      }
      else {
        if (paramx.Z() > 20) {
          break label154;
        }
      }
      return;
      label154:
      throw new GeneralSecurityException("tag size too big");
    }
    throw new GeneralSecurityException("tag size too small");
  }
  
  public b.b a()
  {
    return b.b.p;
  }
  
  public String d()
  {
    return "type.googleapis.com/google.crypto.tink.HmacKey";
  }
  
  public d.a f()
  {
    return new b(w.class);
  }
  
  public y.c g()
  {
    return y.c.q;
  }
  
  public int n()
  {
    return 0;
  }
  
  public v o(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    return v.d0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void q(v paramv)
  {
    r.c(paramv.b0(), n());
    if (paramv.Z().size() >= 16)
    {
      r(paramv.a0());
      return;
    }
    throw new GeneralSecurityException("key too short");
  }
  
  public class a
    extends m
  {
    public a()
    {
      super();
    }
    
    public t c(v paramv)
    {
      u localu = paramv.a0().Y();
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramv.Z().Y(), "HMAC");
      int i = paramv.a0().Z();
      int j = k.c.a[localu.ordinal()];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 4)
            {
              if (j == 5) {
                return new o(new q3.n("HMACSHA512", localSecretKeySpec), i);
              }
              throw new GeneralSecurityException("unknown hash");
            }
            return new o(new q3.n("HMACSHA384", localSecretKeySpec), i);
          }
          return new o(new q3.n("HMACSHA256", localSecretKeySpec), i);
        }
        return new o(new q3.n("HMACSHA224", localSecretKeySpec), i);
      }
      return new o(new q3.n("HMACSHA1", localSecretKeySpec), i);
    }
  }
  
  public class b
    extends d.a
  {
    public b(Class paramClass)
    {
      super();
    }
    
    public Map c()
    {
      HashMap localHashMap = new HashMap();
      u localu = u.s;
      l.b localb1 = l.b.o;
      localHashMap.put("HMAC_SHA256_128BITTAG", k.l(32, 16, localu, localb1));
      l.b localb2 = l.b.q;
      localHashMap.put("HMAC_SHA256_128BITTAG_RAW", k.l(32, 16, localu, localb2));
      localHashMap.put("HMAC_SHA256_256BITTAG", k.l(32, 32, localu, localb1));
      localHashMap.put("HMAC_SHA256_256BITTAG_RAW", k.l(32, 32, localu, localb2));
      localu = u.t;
      localHashMap.put("HMAC_SHA512_128BITTAG", k.l(64, 16, localu, localb1));
      localHashMap.put("HMAC_SHA512_128BITTAG_RAW", k.l(64, 16, localu, localb2));
      localHashMap.put("HMAC_SHA512_256BITTAG", k.l(64, 32, localu, localb1));
      localHashMap.put("HMAC_SHA512_256BITTAG_RAW", k.l(64, 32, localu, localb2));
      localHashMap.put("HMAC_SHA512_512BITTAG", k.l(64, 64, localu, localb1));
      localHashMap.put("HMAC_SHA512_512BITTAG_RAW", k.l(64, 64, localu, localb2));
      return Collections.unmodifiableMap(localHashMap);
    }
    
    public v f(w paramw)
    {
      return (v)v.c0().A(n()).z(paramw.Z()).y(com.google.crypto.tink.shaded.protobuf.h.i(q3.p.c(paramw.Y()))).n();
    }
    
    public w g(com.google.crypto.tink.shaded.protobuf.h paramh)
    {
      return w.b0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
    }
    
    public void h(w paramw)
    {
      if (paramw.Y() >= 16)
      {
        k.k(paramw.Z());
        return;
      }
      throw new GeneralSecurityException("key too short");
    }
  }
}

/* Location:
 * Qualified Name:     l3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */