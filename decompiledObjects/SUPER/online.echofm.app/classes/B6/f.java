package B6;

import C6.a;

public abstract class f
{
  public static f a(d paramd, byte[] paramArrayOfByte)
  {
    return b(paramd, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static f b(d paramd, final byte[] paramArrayOfByte, final int paramInt1, final int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      a.b(paramArrayOfByte.length, paramInt1, paramInt2);
      return new a(paramInt2, paramArrayOfByte, paramInt1);
    }
    throw new NullPointerException("content == null");
  }
  
  public class a
    extends f
  {
    public a(int paramInt1, byte[] paramArrayOfByte, int paramInt2) {}
  }
}

/* Location:
 * Qualified Name:     B6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */