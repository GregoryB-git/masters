package c5;

import V4.a;
import V4.d;
import Y4.b;
import java.util.Map;

public final class k
  extends q
{
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.u) {
      return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(parama)));
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
      throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(i)));
    }
    try
    {
      i = p.b(paramString);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(i);
      paramString = ((StringBuilder)localObject).toString();
      label97:
      localObject = new boolean[67];
      int j = n.b((boolean[])localObject, 0, p.a, true);
      int k;
      for (i = 0; i <= 3; i++)
      {
        k = Character.digit(paramString.charAt(i), 10);
        j += n.b((boolean[])localObject, j, p.d[k], false);
      }
      j += n.b((boolean[])localObject, j, p.b, false);
      for (i = 4; i <= 7; i++)
      {
        k = Character.digit(paramString.charAt(i), 10);
        j += n.b((boolean[])localObject, j, p.d[k], true);
      }
      n.b((boolean[])localObject, j, p.a, true);
      return (boolean[])localObject;
    }
    catch (d paramString)
    {
      throw new IllegalArgumentException(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     c5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */