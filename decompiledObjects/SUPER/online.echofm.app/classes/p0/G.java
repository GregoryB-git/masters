package p0;

import g0.M;
import j0.b;
import java.util.UUID;

public final class G
  implements b
{
  public static final boolean d;
  public final UUID a;
  public final byte[] b;
  public final boolean c;
  
  static
  {
    if ("Amazon".equals(M.c))
    {
      String str = M.d;
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
  
  public G(UUID paramUUID, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    a = paramUUID;
    b = paramArrayOfByte;
    c = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     p0.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */