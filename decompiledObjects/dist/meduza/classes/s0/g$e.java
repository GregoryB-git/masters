package s0;

import java.nio.charset.Charset;
import m.e;

public class g$e
  extends g.d
{
  public final byte[] d;
  
  public g$e(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    d = paramArrayOfByte;
  }
  
  public byte a(int paramInt)
  {
    return d[paramInt];
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof g)) {
      return false;
    }
    if (size() != ((g)paramObject).size()) {
      return false;
    }
    if (size() == 0) {
      return true;
    }
    if ((paramObject instanceof e))
    {
      paramObject = (e)paramObject;
      int i = a;
      int j = a;
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      int k = size();
      if (k <= ((e)paramObject).size())
      {
        if (0 + k <= ((e)paramObject).size())
        {
          localObject = d;
          byte[] arrayOfByte = d;
          int m = p();
          i = p();
          boolean bool2;
          for (j = ((e)paramObject).p() + 0;; j++)
          {
            bool2 = bool1;
            if (i >= m + k) {
              break;
            }
            if (localObject[i] != arrayOfByte[j])
            {
              bool2 = false;
              break;
            }
            i++;
          }
          return bool2;
        }
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ran off end of other: ");
        ((StringBuilder)localObject).append(0);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(k);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(((e)paramObject).size());
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Length too large: ");
      ((StringBuilder)paramObject).append(k);
      ((StringBuilder)paramObject).append(size());
      throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
    }
    return paramObject.equals(this);
  }
  
  public byte k(int paramInt)
  {
    return d[paramInt];
  }
  
  public final boolean l()
  {
    int i = p();
    byte[] arrayOfByte = d;
    int j = size();
    boolean bool;
    if (m1.a.c(arrayOfByte, i, j + i) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int m(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = d;
    int i = p() + 0;
    Charset localCharset = x.a;
    int j = i;
    int k = paramInt1;
    for (paramInt1 = j; paramInt1 < i + paramInt2; paramInt1++) {
      k = k * 31 + arrayOfByte[paramInt1];
    }
    return k;
  }
  
  public final String n(Charset paramCharset)
  {
    return new String(d, p(), size(), paramCharset);
  }
  
  public final void o(e parame)
  {
    parame.s(d, p(), size());
  }
  
  public int p()
  {
    return 0;
  }
  
  public int size()
  {
    return d.length;
  }
}

/* Location:
 * Qualified Name:     s0.g.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */