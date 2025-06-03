package k3;

import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import p3.I;
import p3.y.c;
import r3.a;

public final class o
  implements q
{
  public final String a;
  public final a b;
  public final h c;
  public final y.c d;
  public final I e;
  public final Integer f;
  
  public o(String paramString, h paramh, y.c paramc, I paramI, Integer paramInteger)
  {
    a = paramString;
    b = t.e(paramString);
    c = paramh;
    d = paramc;
    e = paramI;
    f = paramInteger;
  }
  
  public static o b(String paramString, h paramh, y.c paramc, I paramI, Integer paramInteger)
  {
    if (paramI == I.s)
    {
      if (paramInteger != null) {
        throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
      }
    }
    else {
      if (paramInteger == null) {
        break label44;
      }
    }
    return new o(paramString, paramh, paramc, paramI, paramInteger);
    label44:
    throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
  }
  
  public a a()
  {
    return b;
  }
  
  public Integer c()
  {
    return f;
  }
  
  public y.c d()
  {
    return d;
  }
  
  public I e()
  {
    return e;
  }
  
  public String f()
  {
    return a;
  }
  
  public h g()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     k3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */