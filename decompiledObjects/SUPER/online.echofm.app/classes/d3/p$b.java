package d3;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import p3.l;
import p3.m;
import q3.r;

public class p$b
  extends d.a
{
  public p$b(p paramp, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    c3.l.b localb1 = c3.l.b.o;
    localHashMap.put("AES128_GCM", p.k(16, localb1));
    c3.l.b localb2 = c3.l.b.q;
    localHashMap.put("AES128_GCM_RAW", p.k(16, localb2));
    localHashMap.put("AES256_GCM", p.k(32, localb1));
    localHashMap.put("AES256_GCM_RAW", p.k(32, localb2));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public l f(m paramm)
  {
    return (l)l.Z().y(h.i(q3.p.c(paramm.W()))).z(b.m()).n();
  }
  
  public m g(h paramh)
  {
    return m.Y(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void h(m paramm)
  {
    r.a(paramm.W());
  }
}

/* Location:
 * Qualified Name:     d3.p.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */