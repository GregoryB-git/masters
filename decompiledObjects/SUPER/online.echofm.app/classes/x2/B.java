package x2;

import java.util.Arrays;

public final class B
  extends A
{
  public final byte[] c;
  
  public B(byte[] paramArrayOfByte)
  {
    super(Arrays.copyOfRange(paramArrayOfByte, 0, 25));
    c = paramArrayOfByte;
  }
  
  public final byte[] Z0()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     x2.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */