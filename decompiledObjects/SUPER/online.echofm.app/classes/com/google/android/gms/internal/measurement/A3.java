package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

public class A3
  extends B3
{
  public final byte[] s;
  
  public A3(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    s = paramArrayOfByte;
  }
  
  public final void D(r3 paramr3)
  {
    paramr3.a(s, Y(), S());
  }
  
  public byte M(int paramInt)
  {
    return s[paramInt];
  }
  
  public int S()
  {
    return s.length;
  }
  
  public final int T(int paramInt1, int paramInt2, int paramInt3)
  {
    return a4.a(paramInt1, s, Y(), paramInt3);
  }
  
  public final boolean W()
  {
    int i = Y();
    return E5.f(s, i, S() + i);
  }
  
  public final boolean X(q3 paramq3, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramq3.S())
    {
      if (paramInt2 <= paramq3.S())
      {
        if ((paramq3 instanceof A3))
        {
          paramq3 = (A3)paramq3;
          byte[] arrayOfByte1 = s;
          byte[] arrayOfByte2 = s;
          int i = Y();
          paramInt1 = Y();
          for (int j = paramq3.Y(); paramInt1 < i + paramInt2; j++)
          {
            if (arrayOfByte1[paramInt1] != arrayOfByte2[j]) {
              return false;
            }
            paramInt1++;
          }
          return true;
        }
        return paramq3.i(0, paramInt2).equals(i(0, paramInt2));
      }
      paramInt1 = paramq3.S();
      paramq3 = new StringBuilder("Ran off end of other: ");
      paramq3.append(0);
      paramq3.append(", ");
      paramq3.append(paramInt2);
      paramq3.append(", ");
      paramq3.append(paramInt1);
      throw new IllegalArgumentException(paramq3.toString());
    }
    paramInt1 = S();
    paramq3 = new StringBuilder("Length too large: ");
    paramq3.append(paramInt2);
    paramq3.append(paramInt1);
    throw new IllegalArgumentException(paramq3.toString());
  }
  
  public int Y()
  {
    return 0;
  }
  
  public byte a(int paramInt)
  {
    return s[paramInt];
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof q3)) {
      return false;
    }
    if (S() != ((q3)paramObject).S()) {
      return false;
    }
    if (S() == 0) {
      return true;
    }
    if ((paramObject instanceof A3))
    {
      paramObject = (A3)paramObject;
      int i = d();
      int j = ((q3)paramObject).d();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return X((q3)paramObject, 0, S());
    }
    return paramObject.equals(this);
  }
  
  public final q3 i(int paramInt1, int paramInt2)
  {
    paramInt1 = q3.g(0, paramInt2, S());
    if (paramInt1 == 0) {
      return q3.p;
    }
    return new u3(s, Y(), paramInt1);
  }
  
  public final String s(Charset paramCharset)
  {
    return new String(s, Y(), S(), paramCharset);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.A3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */