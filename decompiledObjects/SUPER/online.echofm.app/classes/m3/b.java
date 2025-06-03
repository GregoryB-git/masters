package m3;

import h3.b.b;
import java.security.GeneralSecurityException;
import l3.a;
import l3.g;

public final class b
  implements g
{
  public static final b.b b = b.b.o;
  public final a a;
  
  public b(a parama)
  {
    if (b.c())
    {
      a = parama;
      return;
    }
    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
  }
}

/* Location:
 * Qualified Name:     m3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */