package k3;

import g;
import java.util.Map;

public final class h$a
  extends n.a
{
  public String a;
  public Integer b;
  public m c;
  public Long d;
  public Long e;
  public Map<String, String> f;
  public Integer g;
  public String h;
  public byte[] i;
  public byte[] j;
  
  public final h b()
  {
    if (a == null) {
      localObject1 = " transportName";
    } else {
      localObject1 = "";
    }
    Object localObject2 = localObject1;
    if (c == null) {
      localObject2 = g.d((String)localObject1, " encodedPayload");
    }
    Object localObject1 = localObject2;
    if (d == null) {
      localObject1 = g.d((String)localObject2, " eventMillis");
    }
    localObject2 = localObject1;
    if (e == null) {
      localObject2 = g.d((String)localObject1, " uptimeMillis");
    }
    localObject1 = localObject2;
    if (f == null) {
      localObject1 = g.d((String)localObject2, " autoMetadata");
    }
    if (((String)localObject1).isEmpty()) {
      return new h(a, b, c, d.longValue(), e.longValue(), f, g, h, i, j);
    }
    throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
  }
  
  public final a c(m paramm)
  {
    if (paramm != null)
    {
      c = paramm;
      return this;
    }
    throw new NullPointerException("Null encodedPayload");
  }
  
  public final a d(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null transportName");
  }
}

/* Location:
 * Qualified Name:     k3.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */