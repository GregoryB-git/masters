package a4;

import java.util.UUID;
import v5.e0;
import z3.b;

public final class p
  implements b
{
  public static final boolean d;
  public final UUID a;
  public final byte[] b;
  public final boolean c;
  
  static
  {
    if ("Amazon".equals(e0.c))
    {
      String str = e0.d;
      if (("AFTM".equals(str)) || ("AFTB".equals(str)))
      {
        bool = true;
        break label40;
      }
    }
    boolean bool = false;
    label40:
    d = bool;
  }
  
  public p(UUID paramUUID, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    a = paramUUID;
    b = paramArrayOfByte;
    c = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     a4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */