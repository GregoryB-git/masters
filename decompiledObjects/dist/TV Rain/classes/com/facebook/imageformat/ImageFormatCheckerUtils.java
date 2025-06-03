package com.facebook.imageformat;

import com.facebook.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;

public class ImageFormatCheckerUtils
{
  public static byte[] asciiBytes(String paramString)
  {
    Preconditions.checkNotNull(paramString);
    try
    {
      paramString = paramString.getBytes("ASCII");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("ASCII not found!", paramString);
    }
  }
  
  public static int indexOfPattern(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    Preconditions.checkNotNull(paramArrayOfByte1);
    Preconditions.checkNotNull(paramArrayOfByte2);
    if (paramInt2 > paramInt1) {
      return -1;
    }
    int i = 0;
    int j = paramArrayOfByte2[0];
    int k = paramInt1 - paramInt2;
    for (paramInt1 = i; paramInt1 <= k; paramInt1 = i + 1)
    {
      int m = paramArrayOfByte1[paramInt1];
      int n = 1;
      i = paramInt1;
      if (m != j) {
        do
        {
          paramInt1++;
          i = paramInt1;
          if (paramInt1 > k) {
            break;
          }
          i = paramInt1;
        } while (paramArrayOfByte1[paramInt1] != j);
      }
      if (i <= k)
      {
        m = i + 1;
        int i1 = m + paramInt2 - 1;
        paramInt1 = n;
        n = m;
        while ((n < i1) && (paramArrayOfByte1[n] == paramArrayOfByte2[paramInt1]))
        {
          n++;
          paramInt1++;
        }
        if (n == i1) {
          return i;
        }
      }
    }
    return -1;
  }
  
  public static boolean startsWithPattern(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Preconditions.checkNotNull(paramArrayOfByte1);
    Preconditions.checkNotNull(paramArrayOfByte2);
    if (paramArrayOfByte2.length > paramArrayOfByte1.length) {
      return false;
    }
    for (int i = 0; i < paramArrayOfByte2.length; i++) {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageformat.ImageFormatCheckerUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */