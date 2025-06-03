package F0;

import g0.z;

public final class o
{
  public final int a;
  public final int b;
  public final String c;
  
  public o(int paramInt1, int paramInt2, String paramString)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramString;
  }
  
  public static o a(z paramz)
  {
    paramz.U(2);
    int i = paramz.G();
    int j = i >> 1;
    i = paramz.G() >> 3 & 0x1F | (i & 0x1) << 5;
    if ((j != 4) && (j != 5) && (j != 7))
    {
      if (j == 8) {
        paramz = "hev1";
      } else if (j == 9) {
        paramz = "avc3";
      } else {
        return null;
      }
    }
    else {
      paramz = "dvhe";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramz);
    paramz = ".0";
    localStringBuilder.append(".0");
    localStringBuilder.append(j);
    if (i >= 10) {
      paramz = ".";
    }
    localStringBuilder.append(paramz);
    localStringBuilder.append(i);
    return new o(j, i, localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     F0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */