package c5;

import V4.a;
import V4.d;
import Y4.b;
import java.util.Map;

public final class j
  extends q
{
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.v) {
      return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(parama)));
  }
  
  public boolean[] c(String paramString)
  {
    int i = paramString.length();
    if (i != 12)
    {
      if (i == 13) {
        try
        {
          if (p.a(paramString)) {
            break label97;
          }
          paramString = new java/lang/IllegalArgumentException;
          paramString.<init>("Contents do not pass checksum");
          throw paramString;
        }
        catch (d paramString)
        {
          throw new IllegalArgumentException("Illegal contents");
        }
      }
      throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(i)));
    }
    try
    {
      i = p.b(paramString);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(i);
      paramString = ((StringBuilder)localObject).toString();
      label97:
      i = Character.digit(paramString.charAt(0), 10);
      int j = i.f[i];
      localObject = new boolean[95];
      int k = n.b((boolean[])localObject, 0, p.a, true);
      int n;
      for (i = 1; i <= 6; i++)
      {
        int m = Character.digit(paramString.charAt(i), 10);
        n = m;
        if ((j >> 6 - i & 0x1) == 1) {
          n = m + 10;
        }
        k += n.b((boolean[])localObject, k, p.e[n], false);
      }
      i = k + n.b((boolean[])localObject, k, p.b, false);
      for (k = 7; k <= 12; k++)
      {
        n = Character.digit(paramString.charAt(k), 10);
        i += n.b((boolean[])localObject, i, p.d[n], true);
      }
      n.b((boolean[])localObject, i, p.a, true);
      return (boolean[])localObject;
    }
    catch (d paramString)
    {
      throw new IllegalArgumentException(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     c5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */