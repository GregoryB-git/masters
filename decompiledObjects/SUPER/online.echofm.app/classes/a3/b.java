package a3;

import W2.m;

public abstract class b
{
  public static char a(long paramLong)
  {
    char c = (char)(int)paramLong;
    boolean bool;
    if (c == paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    m.g(bool, "Out of range: %s", paramLong);
    return c;
  }
  
  public static boolean b(char[] paramArrayOfChar, char paramChar)
  {
    int i = paramArrayOfChar.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfChar[j] == paramChar) {
        return true;
      }
    }
    return false;
  }
  
  public static char c(byte paramByte1, byte paramByte2)
  {
    return (char)(paramByte1 << 8 | paramByte2 & 0xFF);
  }
}

/* Location:
 * Qualified Name:     a3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */