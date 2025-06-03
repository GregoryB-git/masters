package ma;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import m.e;

public class h$h
  extends h.g
{
  public final byte[] d;
  
  public h$h(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    d = paramArrayOfByte;
  }
  
  public final String A(Charset paramCharset)
  {
    return new String(d, D(), size(), paramCharset);
  }
  
  public final void B(e parame)
  {
    parame.s(d, D(), size());
  }
  
  public final boolean C(h paramh, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramh.size())
    {
      int i = paramInt1 + paramInt2;
      if (i <= paramh.size())
      {
        if ((paramh instanceof h))
        {
          localObject = (h)paramh;
          paramh = d;
          byte[] arrayOfByte = d;
          int j = D();
          i = D();
          for (paramInt1 = ((h)localObject).D() + paramInt1; i < j + paramInt2; paramInt1++)
          {
            if (paramh[i] != arrayOfByte[paramInt1]) {
              return false;
            }
            i++;
          }
          return true;
        }
        return paramh.y(paramInt1, i).equals(y(0, paramInt2));
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Ran off end of other: ");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramInt2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramh.size());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    paramh = new StringBuilder();
    paramh.append("Length too large: ");
    paramh.append(paramInt2);
    paramh.append(size());
    throw new IllegalArgumentException(paramh.toString());
  }
  
  public int D()
  {
    return 0;
  }
  
  public final ByteBuffer a()
  {
    return ByteBuffer.wrap(d, D(), size()).asReadOnlyBuffer();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    if (size() != ((h)paramObject).size()) {
      return false;
    }
    if (size() == 0) {
      return true;
    }
    if ((paramObject instanceof h))
    {
      paramObject = (h)paramObject;
      int i = a;
      int j = a;
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return C((h)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public byte i(int paramInt)
  {
    return d[paramInt];
  }
  
  public void n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    System.arraycopy(d, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public byte p(int paramInt)
  {
    return d[paramInt];
  }
  
  public final boolean r()
  {
    int i = D();
    return u1.e(d, i, size() + i);
  }
  
  public int size()
  {
    return d.length;
  }
  
  public final i t()
  {
    return i.f(d, D(), size(), true);
  }
  
  public final int u(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[] arrayOfByte = d;
    int i = D() + paramInt2;
    Charset localCharset = a0.a;
    for (paramInt2 = i; paramInt2 < i + paramInt3; paramInt2++) {
      paramInt1 = paramInt1 * 31 + arrayOfByte[paramInt2];
    }
    return paramInt1;
  }
  
  public final int x(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = D() + paramInt2;
    byte[] arrayOfByte = d;
    return u1.a.e(paramInt1, arrayOfByte, paramInt2, paramInt3 + paramInt2);
  }
  
  public final h y(int paramInt1, int paramInt2)
  {
    paramInt2 = h.l(paramInt1, paramInt2, size());
    if (paramInt2 == 0) {
      return h.b;
    }
    return new h.d(d, D() + paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     ma.h.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */