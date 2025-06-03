package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

public abstract class te
{
  private tm a;
  
  public te() {}
  
  public te(byte paramByte)
  {
    this();
  }
  
  private static int a(cm[] paramArrayOfcm, od paramod)
    throws ba
  {
    int i = paramArrayOfcm.length;
    int j = 0;
    int k = j;
    while (j < paramArrayOfcm.length)
    {
      cm localcm = paramArrayOfcm[j];
      int m = 0;
      while (m < a)
      {
        int n = localcm.a(paramod.a(m)) & 0x7;
        int i1 = k;
        if (n > k)
        {
          if (n == 4) {
            return j;
          }
          i = j;
          i1 = n;
        }
        m++;
        k = i1;
      }
      j++;
    }
    return i;
  }
  
  private static int[] a(cm paramcm, od paramod)
    throws ba
  {
    int[] arrayOfInt = new int[a];
    for (int i = 0; i < a; i++) {
      arrayOfInt[i] = paramcm.a(paramod.a(i));
    }
    return arrayOfInt;
  }
  
  private static int[] a(cm[] paramArrayOfcm)
    throws ba
  {
    int i = paramArrayOfcm.length;
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = paramArrayOfcm[j].s();
    }
    return arrayOfInt;
  }
  
  public abstract Pair<cl[], sy[]> a(sz paramsz, int[][][] paramArrayOfInt, int[] paramArrayOfInt1)
    throws ba;
  
  public tg a(cm[] paramArrayOfcm, of paramof)
    throws ba
  {
    int[] arrayOfInt1 = new int[paramArrayOfcm.length + 1];
    int i = paramArrayOfcm.length + 1;
    od[][] arrayOfod = new od[i][];
    int[][][] arrayOfInt = new int[paramArrayOfcm.length + 1][][];
    int j = 0;
    int m;
    for (int k = 0; k < i; k++)
    {
      m = b;
      arrayOfod[k] = new od[m];
      arrayOfInt[k] = new int[m][];
    }
    int[] arrayOfInt2 = a(paramArrayOfcm);
    for (k = 0; k < b; k++)
    {
      od localod = paramof.a(k);
      m = a(paramArrayOfcm, localod);
      if (m == paramArrayOfcm.length) {
        arrayOfInt3 = new int[a];
      } else {
        arrayOfInt3 = a(paramArrayOfcm[m], localod);
      }
      i = arrayOfInt1[m];
      arrayOfod[m][i] = localod;
      arrayOfInt[m][i] = arrayOfInt3;
      arrayOfInt1[m] = (i + 1);
    }
    paramof = new of[paramArrayOfcm.length];
    int[] arrayOfInt3 = new int[paramArrayOfcm.length];
    for (k = j; k < paramArrayOfcm.length; k++)
    {
      j = arrayOfInt1[k];
      paramof[k] = new of((od[])wl.a(arrayOfod[k], j));
      arrayOfInt[k] = ((int[][])wl.a(arrayOfInt[k], j));
      arrayOfInt3[k] = paramArrayOfcm[k].a();
    }
    k = arrayOfInt1[paramArrayOfcm.length];
    paramArrayOfcm = new sz(arrayOfInt3, paramof, arrayOfInt2, arrayOfInt, new of((od[])wl.a(arrayOfod[paramArrayOfcm.length], k)));
    paramof = a(paramArrayOfcm, arrayOfInt, arrayOfInt2);
    return new tg((cl[])first, (sy[])second, paramArrayOfcm);
  }
  
  public final tm a()
  {
    return (tm)rp.a(a);
  }
  
  public final void a(th paramth, tm paramtm)
  {
    a = paramtm;
  }
  
  public void a(Object paramObject)
  {
    paramObject = (sz)paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.te
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */