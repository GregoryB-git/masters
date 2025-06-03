package com.google.android.gms.internal.fido;

public final class zzcl
{
  public static byte[] zza(byte[]... paramVarArgs)
  {
    int i = 0;
    int j = i;
    int k;
    for (;;)
    {
      k = paramVarArgs.length;
      if (i >= k) {
        break;
      }
      j += paramVarArgs[i].length;
      i++;
    }
    byte[] arrayOfByte1 = new byte[j];
    j = 0;
    i = j;
    while (j < k)
    {
      byte[] arrayOfByte2 = paramVarArgs[j];
      int m = arrayOfByte2.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i, m);
      i += m;
      j++;
    }
    return arrayOfByte1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzcl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */