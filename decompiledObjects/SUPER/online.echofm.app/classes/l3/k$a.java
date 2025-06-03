package l3;

import c3.t;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import k3.m;
import p3.u;
import p3.v;
import p3.x;
import q3.n;
import q3.o;

public class k$a
  extends m
{
  public k$a(Class paramClass)
  {
    super(paramClass);
  }
  
  public t c(v paramv)
  {
    u localu = paramv.a0().Y();
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramv.Z().Y(), "HMAC");
    int i = paramv.a0().Z();
    int j = k.c.a[localu.ordinal()];
    if (j != 1)
    {
      if (j != 2)
      {
        if (j != 3)
        {
          if (j != 4)
          {
            if (j == 5) {
              return new o(new n("HMACSHA512", localSecretKeySpec), i);
            }
            throw new GeneralSecurityException("unknown hash");
          }
          return new o(new n("HMACSHA384", localSecretKeySpec), i);
        }
        return new o(new n("HMACSHA256", localSecretKeySpec), i);
      }
      return new o(new n("HMACSHA224", localSecretKeySpec), i);
    }
    return new o(new n("HMACSHA1", localSecretKeySpec), i);
  }
}

/* Location:
 * Qualified Name:     l3.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */