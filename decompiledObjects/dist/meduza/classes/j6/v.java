package j6;

import java.util.Arrays;

public final class v
  extends u
{
  public final byte[] b;
  
  public v(byte[] paramArrayOfByte)
  {
    super(Arrays.copyOfRange(paramArrayOfByte, 0, 25));
    b = paramArrayOfByte;
  }
  
  public final byte[] r()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     j6.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */