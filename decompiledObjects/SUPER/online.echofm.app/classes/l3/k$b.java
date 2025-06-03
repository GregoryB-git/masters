package l3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import p3.u;
import p3.v;
import p3.v.b;
import p3.w;

public class k$b
  extends d.a
{
  public k$b(k paramk, Class paramClass)
  {
    super(paramClass);
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
    return (v)v.c0().A(b.n()).z(paramw.Z()).y(h.i(q3.p.c(paramw.Y()))).n();
  }
  
  public w g(h paramh)
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

/* Location:
 * Qualified Name:     l3.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */