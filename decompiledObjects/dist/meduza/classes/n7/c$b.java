package n7;

import f;

public final class c$b
  extends c.a
{
  public final char a;
  
  public c$b(char paramChar)
  {
    a = ((char)paramChar);
  }
  
  public final boolean b(char paramChar)
  {
    boolean bool;
    if (paramChar == a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("CharMatcher.is('");
    int i = a;
    char[] arrayOfChar = new char[6];
    char[] tmp17_16 = arrayOfChar;
    tmp17_16[0] = 92;
    char[] tmp22_17 = tmp17_16;
    tmp22_17[1] = 117;
    char[] tmp27_22 = tmp22_17;
    tmp27_22[2] = 0;
    char[] tmp32_27 = tmp27_22;
    tmp32_27[3] = 0;
    char[] tmp37_32 = tmp32_27;
    tmp37_32[4] = 0;
    char[] tmp42_37 = tmp37_32;
    tmp42_37[5] = 0;
    tmp42_37;
    for (int j = 0; j < 4; j++)
    {
      arrayOfChar[(5 - j)] = "0123456789ABCDEF".charAt(i & 0xF);
      i = (char)(i >> 4);
    }
    localStringBuilder.append(String.copyValueOf(arrayOfChar));
    localStringBuilder.append("')");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n7.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */