package com.google.android.gms.internal.firebase_auth_api;

class zzajh
  extends zzaje
{
  public final byte[] zzb;
  
  public zzajh(byte[] paramArrayOfByte)
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
    if (!(paramObject instanceof zzaiw)) {
      return false;
    }
    if (zzb() != ((zzaiw)paramObject).zzb()) {
      return false;
    }
    if (zzb() == 0) {
      return true;
    }
    if ((paramObject instanceof zzajh))
    {
      paramObject = (zzajh)paramObject;
      int i = zza();
      int j = ((zzaiw)paramObject).zza();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return zza((com.google.android.gms.internal.firebase-auth-api.zzaiw)paramObject, 0, zzb());
    }
    return paramObject.equals(this);
  }
  
  public byte zza(int paramInt)
  {
    return zzb[paramInt];
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zza(int paramInt1, int paramInt2)
  {
    paramInt1 = zzaiw.zza(0, paramInt2, zzb());
    if (paramInt1 == 0) {
      return zzaiw.zza;
    }
    return new zzaja(zzb, zze(), paramInt1);
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaix paramzzaix)
  {
    paramzzaix.zza(zzb, zze(), zzb());
  }
  
  public void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(zzb, 0, paramArrayOfByte, 0, paramInt3);
  }
  
  public final boolean zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramzzaiw.zzb())
    {
      if (paramInt2 <= paramzzaiw.zzb())
      {
        if ((paramzzaiw instanceof zzajh))
        {
          zzajh localzzajh = (zzajh)paramzzaiw;
          byte[] arrayOfByte = zzb;
          paramzzaiw = zzb;
          int i = zze();
          paramInt1 = zze();
          for (int j = localzzajh.zze(); paramInt1 < i + paramInt2; j++)
          {
            if (arrayOfByte[paramInt1] != paramzzaiw[j]) {
              return false;
            }
            paramInt1++;
          }
          return true;
        }
        return paramzzaiw.zza(0, paramInt2).equals(zza(0, paramInt2));
      }
      paramInt1 = paramzzaiw.zzb();
      paramzzaiw = new StringBuilder("Ran off end of other: ");
      paramzzaiw.append(0);
      paramzzaiw.append(", ");
      paramzzaiw.append(paramInt2);
      paramzzaiw.append(", ");
      paramzzaiw.append(paramInt1);
      throw new IllegalArgumentException(paramzzaiw.toString());
    }
    paramInt1 = zzb();
    paramzzaiw = new StringBuilder("Length too large: ");
    paramzzaiw.append(paramInt2);
    paramzzaiw.append(paramInt1);
    throw new IllegalArgumentException(paramzzaiw.toString());
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
    return zzaki.zza(paramInt1, zzb, zze(), paramInt3);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaji zzc()
  {
    return zzaji.zza(zzb, zze(), zzb(), true);
  }
  
  public int zze()
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */