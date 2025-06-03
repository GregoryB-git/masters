package d3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import p3.n;
import p3.n.b;
import p3.o;
import q3.r;

public class u$b
  extends d.a
{
  public u$b(u paramu, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    l.b localb1 = l.b.o;
    localHashMap.put("AES128_GCM_SIV", u.k(16, localb1));
    l.b localb2 = l.b.q;
    localHashMap.put("AES128_GCM_SIV_RAW", u.k(16, localb2));
    localHashMap.put("AES256_GCM_SIV", u.k(32, localb1));
    localHashMap.put("AES256_GCM_SIV_RAW", u.k(32, localb2));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public n f(o paramo)
  {
    return (n)n.Z().y(h.i(q3.p.c(paramo.W()))).z(b.n()).n();
  }
  
  public o g(h paramh)
  {
    return o.Y(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void h(o paramo)
  {
    r.a(paramo.W());
  }
}

/* Location:
 * Qualified Name:     d3.u.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */