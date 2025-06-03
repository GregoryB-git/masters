package l3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import k3.d.a.a;
import p3.a;
import p3.a.b;
import p3.b;
import p3.b.b;

public class c$b
  extends d.a
{
  public c$b(c paramc, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    b localb = (b)b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n();
    l.b localb1 = l.b.o;
    localHashMap.put("AES_CMAC", new d.a.a(localb, localb1));
    localHashMap.put("AES256_CMAC", new d.a.a((b)b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n(), localb1));
    localHashMap.put("AES256_CMAC_RAW", new d.a.a((b)b.Z().y(32).z((p3.c)p3.c.Y().y(16).n()).n(), l.b.q));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public a f(b paramb)
  {
    return (a)a.b0().A(0).y(h.i(q3.p.c(paramb.X()))).z(paramb.Y()).n();
  }
  
  public b g(h paramh)
  {
    return b.a0(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void h(b paramb)
  {
    c.k(paramb.Y());
    c.l(paramb.X());
  }
}

/* Location:
 * Qualified Name:     l3.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */