package com.google.protobuf;

import java.nio.charset.Charset;

public class f$i
  extends f.h
{
  private static final long serialVersionUID = 1L;
  public final byte[] s;
  
  public f$i(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    s = paramArrayOfByte;
  }
  
  public final int M(int paramInt1, int paramInt2, int paramInt3)
  {
    return t.h(paramInt1, s, d0() + paramInt2, paramInt3);
  }
  
  public final f T(int paramInt1, int paramInt2)
  {
    paramInt2 = f.g(paramInt1, paramInt2, size());
    if (paramInt2 == 0) {
      return f.p;
    }
    return new f.e(s, d0() + paramInt1, paramInt2);
  }
  
  public final String X(Charset paramCharset)
  {
    return new String(s, d0(), size(), paramCharset);
  }
  
  public final void b0(e parame)
  {
    parame.a(s, d0(), size());
  }
  
  public final boolean c0(f paramf, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramf.size())
    {
      int i = paramInt1 + paramInt2;
      if (i <= paramf.size())
      {
        if ((paramf instanceof i))
        {
          paramf = (i)paramf;
          byte[] arrayOfByte = s;
          localObject = s;
          int j = d0();
          int k = d0();
          i = paramf.d0() + paramInt1;
          paramInt1 = k;
          while (paramInt1 < j + paramInt2)
          {
            if (arrayOfByte[paramInt1] != localObject[i]) {
              return false;
            }
            paramInt1++;
            i++;
          }
          return true;
        }
        return paramf.T(paramInt1, i).equals(T(0, paramInt2));
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Ran off end of other: ");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramInt2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramf.size());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    paramf = new StringBuilder();
    paramf.append("Length too large: ");
    paramf.append(paramInt2);
    paramf.append(size());
    throw new IllegalArgumentException(paramf.toString());
  }
  
  public byte d(int paramInt)
  {
    return s[paramInt];
  }
  
  public int d0()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof f)) {
      return false;
    }
    if (size() != ((f)paramObject).size()) {
      return false;
    }
    if (size() == 0) {
      return true;
    }
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      int i = S();
      int j = ((f)paramObject).S();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return c0((f)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(s, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public byte q(int paramInt)
  {
    return s[paramInt];
  }
  
  public final boolean s()
  {
    int i = d0();
    return l0.m(s, i, size() + i);
  }
  
  public int size()
  {
    return s.length;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.f.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */