package f2;

import c2.b;
import c2.e;
import c2.f;
import c2.g;
import java.util.Set;

public final class q
  implements g
{
  public final Set a;
  public final p b;
  public final t c;
  
  public q(Set paramSet, p paramp, t paramt)
  {
    a = paramSet;
    b = paramp;
    c = paramt;
  }
  
  public f a(String paramString, Class paramClass, b paramb, e parame)
  {
    if (a.contains(paramb)) {
      return new s(b, paramString, paramb, parame, c);
    }
    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { paramb, a }));
  }
}

/* Location:
 * Qualified Name:     f2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */