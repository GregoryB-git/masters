package e4;

import java.util.ArrayList;
import java.util.List;

public class a$a
  implements a.b
{
  public List a = new ArrayList();
  public int b = 0;
  
  public boolean a(byte[] paramArrayOfByte)
  {
    a.add(paramArrayOfByte);
    b += paramArrayOfByte.length;
    return true;
  }
  
  public g b()
  {
    byte[] arrayOfByte1 = new byte[b];
    int i = 0;
    int j = i;
    while (i < a.size())
    {
      byte[] arrayOfByte2 = (byte[])a.get(i);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, arrayOfByte2.length);
      j += arrayOfByte2.length;
      i++;
    }
    return new g(arrayOfByte1);
  }
}

/* Location:
 * Qualified Name:     e4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */