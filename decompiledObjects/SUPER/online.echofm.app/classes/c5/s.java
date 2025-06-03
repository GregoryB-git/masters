package c5;

import V4.a;
import V4.d;
import Y4.b;
import java.util.Map;

public final class s
  extends q
{
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.D) {
      return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(parama)));
  }
  
  public boolean[] c(String paramString)
  {
    int i = paramString.length();
    if (i != 7)
    {
      if (i == 8) {
        try
        {
          if (p.a(paramString)) {
            break label100;
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
      throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(i)));
    }
    try
    {
      i = p.b(r.c(paramString));
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(i);
      paramString = ((StringBuilder)localObject).toString();
      label100:
      i = Character.digit(paramString.charAt(0), 10);
      if ((i != 0) && (i != 1)) {
        throw new IllegalArgumentException("Number system must be 0 or 1");
      }
      int j = Character.digit(paramString.charAt(7), 10);
      int k = r.g[i][j];
      localObject = new boolean[51];
      j = n.b((boolean[])localObject, 0, p.a, true);
      for (i = 1; i <= 6; i++)
      {
        int m = Character.digit(paramString.charAt(i), 10);
        int n = m;
        if ((k >> 6 - i & 0x1) == 1) {
          n = m + 10;
        }
        j += n.b((boolean[])localObject, j, p.e[n], false);
      }
      n.b((boolean[])localObject, j, p.c, false);
      return (boolean[])localObject;
    }
    catch (d paramString)
    {
      throw new IllegalArgumentException(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     c5.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */