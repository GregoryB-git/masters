package i3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.d.a;
import k3.d.a.a;
import p3.p.b;
import p3.q;
import p3.q.b;

public class a$b
  extends d.a
{
  public a$b(a parama, Class paramClass)
  {
    super(paramClass);
  }
  
  public Map c()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AES256_SIV", new d.a.a((q)q.X().y(64).n(), l.b.o));
    localHashMap.put("AES256_SIV_RAW", new d.a.a((q)q.X().y(64).n(), l.b.q));
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public p3.p f(q paramq)
  {
    return (p3.p)p3.p.Z().y(h.i(q3.p.c(paramq.W()))).z(b.k()).n();
  }
  
  public q g(h paramh)
  {
    return q.Y(paramh, com.google.crypto.tink.shaded.protobuf.p.b());
  }
  
  public void h(q paramq)
  {
    if (paramq.W() == 64) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("invalid key size: ");
    localStringBuilder.append(paramq.W());
    localStringBuilder.append(". Valid keys must have ");
    localStringBuilder.append(64);
    localStringBuilder.append(" bytes.");
    throw new InvalidAlgorithmParameterException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     i3.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */