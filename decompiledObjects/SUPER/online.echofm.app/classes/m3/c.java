package m3;

import h3.b.b;
import java.security.GeneralSecurityException;
import l3.g;
import l3.i;

public final class c
  implements g
{
  public static final b.b b = b.b.p;
  public final i a;
  
  public c(i parami)
  {
    if (b.c())
    {
      a = parami;
      return;
    }
    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
}

/* Location:
 * Qualified Name:     m3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */