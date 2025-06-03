package k3;

import h3.c;
import h3.g;
import h3.i;
import java.util.Set;

public final class t
  implements i
{
  public final Set<c> a;
  public final s b;
  public final v c;
  
  public t(Set paramSet, j paramj, v paramv)
  {
    a = paramSet;
    b = paramj;
    c = paramv;
  }
  
  public final u a(String paramString, c paramc, g paramg)
  {
    if (a.contains(paramc)) {
      return new u(b, paramString, paramc, paramg, c);
    }
    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { paramc, a }));
  }
}

/* Location:
 * Qualified Name:     k3.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */