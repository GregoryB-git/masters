package com.google.android.gms.internal.fido;

final class zzbs
  extends zzaz
{
  public static final zzaz zza = new zzbs(new Object[0], 0);
  public final transient Object[] zzb;
  private final transient int zzc;
  
  public zzbs(Object[] paramArrayOfObject, int paramInt)
  {
    zzb = paramArrayOfObject;
    zzc = paramInt;
  }
  
  public final Object get(int paramInt)
  {
    zzap.zza(paramInt, zzc, "index");
    Object localObject = zzb[paramInt];
    localObject.getClass();
    return localObject;
  }
  
  public final int size()
  {
    return zzc;
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(zzb, 0, paramArrayOfObject, 0, zzc);
    return zzc;
  }
  
  public final int zzb()
  {
    return zzc;
  }
  
  public final int zzc()
  {
    return 0;
  }
  
  public final Object[] zze()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */