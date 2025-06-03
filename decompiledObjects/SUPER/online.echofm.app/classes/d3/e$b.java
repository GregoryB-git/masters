package d3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import l3.k;
import p3.d;
import p3.d.b;
import p3.g;
import p3.u;
import p3.v;
import q3.r;

public class e$b
  extends d.a
{
  public e$b(e parame, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    u localu = u.s;
    l.b localb1 = l.b.o;
    localHashMap.put("AES128_CTR_HMAC_SHA256", e.k(16, 16, 32, 16, localu, localb1));
    l.b localb2 = l.b.q;
    localHashMap.put("AES128_CTR_HMAC_SHA256_RAW", e.k(16, 16, 32, 16, localu, localb2));
    localHashMap.put("AES256_CTR_HMAC_SHA256", e.k(32, 16, 32, 32, localu, localb1));
    localHashMap.put("AES256_CTR_HMAC_SHA256_RAW", e.k(32, 16, 32, 32, localu, localb2));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public d f(p3.e parame)
  {
    p3.f localf = (p3.f)new f().f().a(parame.X());
    parame = (v)new k().f().a(parame.Y());
    return (d)d.b0().y(localf).z(parame).A(b.n()).n();
  }
  
  public p3.e g(h paramh)
  {
    return p3.e.a0(paramh, p.b());
  }
  
  public void h(p3.e parame)
  {
    new f().f().e(parame.X());
    new k().f().e(parame.Y());
    r.a(parame.X().Y());
  }
}

/* Location:
 * Qualified Name:     d3.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */