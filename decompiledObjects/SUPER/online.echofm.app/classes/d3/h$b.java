package d3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import p3.i;
import p3.i.b;
import p3.j;
import p3.k;
import q3.r;

public class h$b
  extends d.a
{
  public h$b(h paramh, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    l.b localb1 = l.b.o;
    localHashMap.put("AES128_EAX", h.k(16, 16, localb1));
    l.b localb2 = l.b.q;
    localHashMap.put("AES128_EAX_RAW", h.k(16, 16, localb2));
    localHashMap.put("AES256_EAX", h.k(32, 16, localb1));
    localHashMap.put("AES256_EAX_RAW", h.k(32, 16, localb2));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public i f(j paramj)
  {
    return (i)i.b0().y(com.google.crypto.tink.shaded.protobuf.h.i(q3.p.c(paramj.X()))).z(paramj.Y()).A(b.m()).n();
  }
  
  public j g(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    return j.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void h(j paramj)
  {
    r.a(paramj.X());
    if ((paramj.Y().X() != 12) && (paramj.Y().X() != 16)) {
      throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
  }
}

/* Location:
 * Qualified Name:     d3.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */