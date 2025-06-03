package com.google.android.gms.internal.measurement;

public enum zzkr
{
  private final Class<?> zzl;
  
  static
  {
    zzkr localzzkr1 = new zzkr("VOID", 0, Void.class, Void.class, null);
    zza = localzzkr1;
    Object localObject = Integer.TYPE;
    zzkr localzzkr2 = new zzkr("INT", 1, (Class)localObject, Integer.class, Integer.valueOf(0));
    zzb = localzzkr2;
    zzkr localzzkr3 = new zzkr("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    zzc = localzzkr3;
    zzkr localzzkr4 = new zzkr("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    zzd = localzzkr4;
    zzkr localzzkr5 = new zzkr("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    zze = localzzkr5;
    zzkr localzzkr6 = new zzkr("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
    zzf = localzzkr6;
    zzkr localzzkr7 = new zzkr("STRING", 6, String.class, String.class, "");
    zzg = localzzkr7;
    zzkr localzzkr8 = new zzkr("BYTE_STRING", 7, zziy.class, zziy.class, zziy.zza);
    zzh = localzzkr8;
    zzkr localzzkr9 = new zzkr("ENUM", 8, (Class)localObject, Integer.class, null);
    zzi = localzzkr9;
    localObject = new zzkr("MESSAGE", 9, Object.class, Object.class, null);
    zzj = (zzkr)localObject;
    zzk = new zzkr[] { localzzkr1, localzzkr2, localzzkr3, localzzkr4, localzzkr5, localzzkr6, localzzkr7, localzzkr8, localzzkr9, localObject };
  }
  
  private zzkr(Class<?> paramClass1, Class<?> paramClass2, Object paramObject)
  {
    zzl = paramClass2;
  }
  
  public final Class<?> zza()
  {
    return zzl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */