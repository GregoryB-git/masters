package w5;

import v5.u;

public final class c
{
  public final String a;
  
  public c(String paramString)
  {
    a = paramString;
  }
  
  public static c a(u paramu)
  {
    paramu.H(2);
    int i = paramu.v();
    int j = i >> 1;
    i = paramu.v() >> 3 & 0x1F | (i & 0x1) << 5;
    if ((j != 4) && (j != 5) && (j != 7))
    {
      if (j == 8) {
        paramu = "hev1";
      } else if (j == 9) {
        paramu = "avc3";
      } else {
        return null;
      }
    }
    else {
      paramu = "dvhe";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramu);
    paramu = ".0";
    localStringBuilder.append(".0");
    localStringBuilder.append(j);
    if (i >= 10) {
      paramu = ".";
    }
    localStringBuilder.append(paramu);
    localStringBuilder.append(i);
    return new c(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     w5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */