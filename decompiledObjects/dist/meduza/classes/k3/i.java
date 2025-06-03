package k3;

import f;
import h3.c;
import h3.d;
import h3.g;

public final class i
  extends r
{
  public final s a;
  public final String b;
  public final d<?> c;
  public final g<?, byte[]> d;
  public final c e;
  
  public i(s params, String paramString, d paramd, g paramg, c paramc)
  {
    a = params;
    b = paramString;
    c = paramd;
    d = paramg;
    e = paramc;
  }
  
  public final c a()
  {
    return e;
  }
  
  public final d<?> b()
  {
    return c;
  }
  
  public final g<?, byte[]> c()
  {
    return d;
  }
  
  public final s d()
  {
    return a;
  }
  
  public final String e()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof r))
    {
      paramObject = (r)paramObject;
      if ((!a.equals(((r)paramObject).d())) || (!b.equals(((r)paramObject).e())) || (!c.equals(((r)paramObject).b())) || (!d.equals(((r)paramObject).c())) || (!e.equals(((r)paramObject).a()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode()) * 1000003 ^ d.hashCode()) * 1000003 ^ e.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SendRequest{transportContext=");
    localStringBuilder.append(a);
    localStringBuilder.append(", transportName=");
    localStringBuilder.append(b);
    localStringBuilder.append(", event=");
    localStringBuilder.append(c);
    localStringBuilder.append(", transformer=");
    localStringBuilder.append(d);
    localStringBuilder.append(", encoding=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */