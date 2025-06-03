package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

public class g$i
  extends g.h
{
  private static final long serialVersionUID = 1L;
  public final byte[] s;
  
  public g$i(byte[] paramArrayOfByte)
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
    int i = f0();
    return q0.n(s, i, size() + i);
  }
  
  public final int T(int paramInt1, int paramInt2, int paramInt3)
  {
    return y.i(paramInt1, s, f0() + paramInt2, paramInt3);
  }
  
  public final g V(int paramInt1, int paramInt2)
  {
    paramInt2 = g.g(paramInt1, paramInt2, size());
    if (paramInt2 == 0) {
      return g.p;
    }
    return new g.e(s, f0() + paramInt1, paramInt2);
  }
  
  public final String Z(Charset paramCharset)
  {
    return new String(s, f0(), size(), paramCharset);
  }
  
  public byte d(int paramInt)
  {
    return s[paramInt];
  }
  
  public final void d0(f paramf)
  {
    paramf.a(s, f0(), size());
  }
  
  public final boolean e0(g paramg, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramg.size())
    {
      int i = paramInt1 + paramInt2;
      if (i <= paramg.size())
      {
        if ((paramg instanceof i))
        {
          paramg = (i)paramg;
          localObject = s;
          byte[] arrayOfByte = s;
          int j = f0();
          i = f0();
          int k = paramg.f0() + paramInt1;
          paramInt1 = i;
          for (i = k; paramInt1 < j + paramInt2; i++)
          {
            if (localObject[paramInt1] != arrayOfByte[i]) {
              return false;
            }
            paramInt1++;
          }
          return true;
        }
        return paramg.V(paramInt1, i).equals(V(0, paramInt2));
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Ran off end of other: ");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramInt2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramg.size());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    paramg = new StringBuilder();
    paramg.append("Length too large: ");
    paramg.append(paramInt2);
    paramg.append(size());
    throw new IllegalArgumentException(paramg.toString());
  }
  
  public final boolean equals(Object paramObject)
  {
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
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      int i = U();
      int j = ((g)paramObject).U();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return e0((g)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public int f0()
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
 * Qualified Name:     androidx.datastore.preferences.protobuf.g.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */