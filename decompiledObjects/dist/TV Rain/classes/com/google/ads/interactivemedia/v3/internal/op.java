package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

public class op
{
  private final int[] a;
  private final nv[] b;
  
  public op(int[] paramArrayOfInt, nv[] paramArrayOfnv)
  {
    a = paramArrayOfInt;
    b = paramArrayOfnv;
  }
  
  public gi a(int paramInt)
  {
    for (int i = 0;; i++)
    {
      localObject = a;
      if (i >= localObject.length) {
        break;
      }
      if (paramInt == localObject[i]) {
        return b[i];
      }
    }
    Object localObject = new StringBuilder(36);
    ((StringBuilder)localObject).append("Unmatched track of type: ");
    ((StringBuilder)localObject).append(paramInt);
    Log.e("BaseMediaChunkOutput", ((StringBuilder)localObject).toString());
    return new fx();
  }
  
  public void a(long paramLong)
  {
    for (nv localnv : b) {
      if (localnv != null) {
        localnv.a(paramLong);
      }
    }
  }
  
  public int[] a()
  {
    int[] arrayOfInt = new int[b.length];
    for (int i = 0;; i++)
    {
      Object localObject = b;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        arrayOfInt[i] = ((nv)localObject).c();
      }
    }
    return arrayOfInt;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.op
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */