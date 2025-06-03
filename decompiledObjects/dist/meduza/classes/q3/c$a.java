package q3;

import g;
import java.util.Set;

public final class c$a
  extends e.a.a
{
  public Long a;
  public Long b;
  public Set<e.b> c;
  
  public final c a()
  {
    if (a == null) {
      localObject1 = " delta";
    } else {
      localObject1 = "";
    }
    Object localObject2 = localObject1;
    if (b == null) {
      localObject2 = g.d((String)localObject1, " maxAllowedDelay");
    }
    Object localObject1 = localObject2;
    if (c == null) {
      localObject1 = g.d((String)localObject2, " flags");
    }
    if (((String)localObject1).isEmpty()) {
      return new c(a.longValue(), b.longValue(), c);
    }
    throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
  }
}

/* Location:
 * Qualified Name:     q3.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */