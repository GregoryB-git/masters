package com.google.android.gms.internal.fido;

final class zzbt
  extends zzbc
{
  public static final zzbt zza;
  private static final Object[] zzd;
  public final transient Object[] zzb;
  public final transient Object[] zzc;
  private final transient int zze;
  private final transient int zzf;
  private final transient int zzg;
  
  static
  {
    Object[] arrayOfObject = new Object[0];
    zzd = arrayOfObject;
    zza = new zzbt(arrayOfObject, 0, arrayOfObject, 0, 0);
  }
  
  public zzbt(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
  {
    zzb = paramArrayOfObject1;
    zze = paramInt1;
    zzc = paramArrayOfObject2;
    zzf = paramInt2;
    zzg = paramInt3;
  }
  
  public final boolean contains(Object paramObject)
  {
    Object[] arrayOfObject = zzc;
    if ((paramObject != null) && (arrayOfObject.length != 0)) {
      for (int i = zzau.zza(paramObject.hashCode());; i++)
      {
        i &= zzf;
        Object localObject = arrayOfObject[i];
        if (localObject == null) {
          return false;
        }
        if (localObject.equals(paramObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return zze;
  }
  
  public final int size()
  {
    return zzg;
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(zzb, 0, paramArrayOfObject, 0, zzg);
    return zzg;
  }
  
  public final int zzb()
  {
    return zzg;
  }
  
  public final int zzc()
  {
    return 0;
  }
  
  public final zzcb zzd()
  {
    return zzi().zzk(0);
  }
  
  public final Object[] zze()
  {
    return zzb;
  }
  
  public final boolean zzg()
  {
    return true;
  }
  
  public final zzaz zzj()
  {
    return zzaz.zzh(zzb, zzg);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */