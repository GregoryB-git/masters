package d3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import k3.d.a.a;
import p3.r;
import p3.r.b;
import p3.s;

public class z$b
  extends d.a
{
  public z$b(z paramz, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("CHACHA20_POLY1305", new d.a.a(s.V(), l.b.o));
    localHashMap.put("CHACHA20_POLY1305_RAW", new d.a.a(s.V(), l.b.q));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public r f(s params)
  {
    return (r)r.Z().z(b.k()).y(h.i(q3.p.c(32))).n();
  }
  
  public s g(h paramh)
  {
    return s.W(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void h(s params) {}
}

/* Location:
 * Qualified Name:     d3.z.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */