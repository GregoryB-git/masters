package com.google.android.gms.internal.measurement;

public abstract class E5
{
  public static final F5 a = new I5();
  
  static
  {
    if (D5.w()) {
      D5.z();
    }
  }
  
  public static int a(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = 0;
    for (int k = 0; (k < i) && (paramCharSequence.charAt(k) < ''); k++) {}
    int m = i;
    for (;;)
    {
      n = m;
      if (k >= i) {
        break label213;
      }
      n = paramCharSequence.charAt(k);
      if (n >= 2048) {
        break;
      }
      m += (127 - n >>> 31);
      k++;
    }
    int i1 = paramCharSequence.length();
    int n = j;
    while (k < i1)
    {
      int i2 = paramCharSequence.charAt(k);
      if (i2 < 2048)
      {
        n += (127 - i2 >>> 31);
        j = k;
      }
      else
      {
        int i3 = n + 2;
        n = i3;
        j = k;
        if (55296 <= i2)
        {
          n = i3;
          j = k;
          if (i2 <= 57343) {
            if (Character.codePointAt(paramCharSequence, k) >= 65536)
            {
              j = k + 1;
              n = i3;
            }
            else
            {
              throw new H5(k, i1);
            }
          }
        }
      }
      k = j + 1;
    }
    n = m + n;
    label213:
    if (n >= i) {
      return n;
    }
    long l = n;
    paramCharSequence = new StringBuilder("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  public static int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.b(paramCharSequence, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static boolean d(byte[] paramArrayOfByte)
  {
    return a.d(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static String e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.c(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static boolean f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.d(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.E5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */