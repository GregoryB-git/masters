package com.google.android.gms.internal.measurement;

class zzjf
  extends zzjg
{
  public final byte[] zzb;
  
  public zzjf(byte[] paramArrayOfByte)
  {
    super(null);
    paramArrayOfByte.getClass();
    zzb = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zziy)) {
      return false;
    }
    if (zzb() != ((zziy)paramObject).zzb()) {
      return false;
    }
    if (zzb() == 0) {
      return true;
    }
    if ((paramObject instanceof zzjf))
    {
      paramObject = (zzjf)paramObject;
      int i = zza();
      int j = ((zziy)paramObject).zza();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return zza((zziy)paramObject, 0, zzb());
    }
    return paramObject.equals(this);
  }
  
  public byte zza(int paramInt)
  {
    return zzb[paramInt];
  }
  
  public final zziy zza(int paramInt1, int paramInt2)
  {
    paramInt1 = zziy.zza(0, paramInt2, zzb());
    if (paramInt1 == 0) {
      return zziy.zza;
    }
    return new zzjc(zzb, zzc(), paramInt1);
  }
  
  public final void zza(zziv paramzziv)
  {
    paramzziv.zza(zzb, zzc(), zzb());
  }
  
  public final boolean zza(zziy paramzziy, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramzziy.zzb())
    {
      if (paramInt2 <= paramzziy.zzb())
      {
        if ((paramzziy instanceof zzjf))
        {
          zzjf localzzjf = (zzjf)paramzziy;
          byte[] arrayOfByte = zzb;
          paramzziy = zzb;
          int i = zzc();
          int j = zzc();
          for (paramInt1 = localzzjf.zzc(); j < i + paramInt2; paramInt1++)
          {
            if (arrayOfByte[j] != paramzziy[paramInt1]) {
              return false;
            }
            j++;
          }
          return true;
        }
        return paramzziy.zza(0, paramInt2).equals(zza(0, paramInt2));
      }
      paramInt1 = paramzziy.zzb();
      paramzziy = new StringBuilder("Ran off end of other: ");
      paramzziy.append(0);
      paramzziy.append(", ");
      paramzziy.append(paramInt2);
      paramzziy.append(", ");
      paramzziy.append(paramInt1);
      throw new IllegalArgumentException(paramzziy.toString());
    }
    paramInt1 = zzb();
    paramzziy = new StringBuilder("Length too large: ");
    paramzziy.append(paramInt2);
    paramzziy.append(paramInt1);
    throw new IllegalArgumentException(paramzziy.toString());
  }
  
  public byte zzb(int paramInt)
  {
    return zzb[paramInt];
  }
  
  public int zzb()
  {
    return zzb.length;
  }
  
  public final int zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    return zzkj.zza(paramInt1, zzb, zzc(), paramInt3);
  }
  
  public int zzc()
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */