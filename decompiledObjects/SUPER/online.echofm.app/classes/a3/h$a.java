package a3;

import java.util.Arrays;

public abstract class h$a
{
  public static final byte[] a;
  
  static
  {
    byte[] arrayOfByte = new byte[''];
    Arrays.fill(arrayOfByte, (byte)-1);
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = i;
      if (j >= 10) {
        break;
      }
      arrayOfByte[(j + 48)] = ((byte)(byte)j);
    }
    while (k < 26)
    {
      j = (byte)(k + 10);
      arrayOfByte[(k + 65)] = ((byte)j);
      arrayOfByte[(k + 97)] = ((byte)j);
      k++;
    }
    a = arrayOfByte;
  }
  
  public static int a(char paramChar)
  {
    if (paramChar < '') {
      paramChar = a[paramChar];
    } else {
      paramChar = '￿';
    }
    return paramChar;
  }
}

/* Location:
 * Qualified Name:     a3.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */