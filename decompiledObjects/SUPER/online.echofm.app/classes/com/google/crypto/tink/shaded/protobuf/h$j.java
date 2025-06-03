package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

public class h$j
  extends h.i
{
  private static final long serialVersionUID = 1L;
  public final byte[] s;
  
  public h$j(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    s = paramArrayOfByte;
  }
  
  public byte D(int paramInt)
  {
    return s[paramInt];
  }
  
  public final boolean M()
  {
    int i = i0();
    return p0.n(s, i, size() + i);
  }
  
  public final i U()
  {
    return i.j(s, i0(), size(), true);
  }
  
  public final int V(int paramInt1, int paramInt2, int paramInt3)
  {
    return z.h(paramInt1, s, i0() + paramInt2, paramInt3);
  }
  
  public final h X(int paramInt1, int paramInt2)
  {
    paramInt2 = h.g(paramInt1, paramInt2, size());
    if (paramInt2 == 0) {
      return h.p;
    }
    return new h.e(s, i0() + paramInt1, paramInt2);
  }
  
  public final String b0(Charset paramCharset)
  {
    return new String(s, i0(), size(), paramCharset);
  }
  
  public byte d(int paramInt)
  {
    return s[paramInt];
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
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      int i = W();
      int j = ((h)paramObject).W();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return h0((h)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public final void g0(g paramg)
  {
    paramg.a(s, i0(), size());
  }
  
  public final boolean h0(h paramh, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramh.size())
    {
      int i = paramInt1 + paramInt2;
      if (i <= paramh.size())
      {
        if ((paramh instanceof j))
        {
          j localj = (j)paramh;
          paramh = s;
          localObject = s;
          int j = i0();
          i = i0();
          for (paramInt1 = localj.i0() + paramInt1; i < j + paramInt2; paramInt1++)
          {
            if (paramh[i] != localObject[paramInt1]) {
              return false;
            }
            i++;
          }
          return true;
        }
        return paramh.X(paramInt1, i).equals(X(0, paramInt2));
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
  
  public int i0()
  {
    return 0;
  }
  
  public void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(s, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public int size()
  {
    return s.length;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.h.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */