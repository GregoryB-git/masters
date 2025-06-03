package d3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import k3.d.a.a;
import p3.K;
import p3.K.b;
import p3.L;

public class H$b
  extends d.a
{
  public H$b(H paramH, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("XCHACHA20_POLY1305", new d.a.a(L.V(), l.b.o));
    localHashMap.put("XCHACHA20_POLY1305_RAW", new d.a.a(L.V(), l.b.q));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public K f(L paramL)
  {
    return (K)K.Z().z(b.k()).y(h.i(q3.p.c(32))).n();
  }
  
  public L g(h paramh)
  {
    return L.W(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void h(L paramL) {}
}

/* Location:
 * Qualified Name:     d3.H.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */