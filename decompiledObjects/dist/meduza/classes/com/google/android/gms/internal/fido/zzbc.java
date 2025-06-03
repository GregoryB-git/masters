package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public abstract class zzbc
  extends zzav
  implements Set
{
  private transient zzaz zza;
  
  private static zzbc zzf(int paramInt, Object... paramVarArgs)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        int i = zzh(paramInt);
        Object[] arrayOfObject = new Object[i];
        int j = i - 1;
        int k = 0;
        int m = k;
        Object localObject1;
        int i4;
        for (int n = m; k < paramInt; n = i4)
        {
          localObject1 = paramVarArgs[k];
          zzbq.zza(localObject1, k);
          int i1 = localObject1.hashCode();
          int i3;
          for (int i2 = zzau.zza(i1);; i2++)
          {
            i3 = i2 & j;
            Object localObject2 = arrayOfObject[i3];
            if (localObject2 == null)
            {
              paramVarArgs[n] = localObject1;
              arrayOfObject[i3] = localObject1;
              i3 = m + i1;
              i4 = n + 1;
              break;
            }
            i3 = m;
            i4 = n;
            if (localObject2.equals(localObject1)) {
              break;
            }
          }
          k++;
          m = i3;
        }
        Arrays.fill(paramVarArgs, n, paramInt, null);
        if (n == 1)
        {
          paramVarArgs = paramVarArgs[0];
          paramVarArgs.getClass();
          return new zzby(paramVarArgs);
        }
        paramInt = i / 2;
        if (zzh(n) >= paramInt)
        {
          localObject1 = paramVarArgs;
          if (n <= 0) {
            localObject1 = Arrays.copyOf(paramVarArgs, n);
          }
          return new zzbt((Object[])localObject1, m, arrayOfObject, j, n);
        }
        return zzf(n, paramVarArgs);
      }
      paramVarArgs = paramVarArgs[0];
      paramVarArgs.getClass();
      return new zzby(paramVarArgs);
    }
    return zzbt.zza;
  }
  
  static int zzh(int paramInt)
  {
    int i = Math.max(paramInt, 2);
    if (i < 751619276)
    {
      paramInt = Integer.highestOneBit(i - 1);
      do
      {
        paramInt += paramInt;
      } while (paramInt * 0.7D < i);
      return paramInt;
    }
    if (i < 1073741824) {
      return 1073741824;
    }
    throw new IllegalArgumentException("collection too large");
  }
  
  public static zzbc zzk(Object paramObject1, Object paramObject2)
  {
    return zzf(2, new Object[] { paramObject1, paramObject2 });
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof zzbc)) && (zzg()) && (((zzbc)paramObject).zzg()) && (hashCode() != paramObject.hashCode())) {
      return false;
    }
    if (paramObject != this) {
      if ((paramObject instanceof Set)) {
        paramObject = (Set)paramObject;
      }
    }
    try
    {
      if (size() == ((Set)paramObject).size())
      {
        bool = containsAll((Collection)paramObject);
        if (bool) {
          return true;
        }
      }
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    bool = false;
    return bool;
  }
  
  public int hashCode()
  {
    return zzbx.zza(this);
  }
  
  public abstract zzcb zzd();
  
  boolean zzg()
  {
    return false;
  }
  
  public zzaz zzi()
  {
    zzaz localzzaz1 = zza;
    zzaz localzzaz2 = localzzaz1;
    if (localzzaz1 == null)
    {
      localzzaz2 = zzj();
      zza = localzzaz2;
    }
    return localzzaz2;
  }
  
  public zzaz zzj()
  {
    Object[] arrayOfObject = toArray();
    int i = zzaz.zzd;
    return zzaz.zzh(arrayOfObject, arrayOfObject.length);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */