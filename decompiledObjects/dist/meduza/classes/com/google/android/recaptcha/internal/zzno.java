package com.google.android.recaptcha.internal;

public enum zzno
{
  private final Class zzl;
  
  static
  {
    zzno localzzno1 = new zzno("VOID", 0, Void.class, Void.class, null);
    zza = localzzno1;
    Object localObject = Integer.TYPE;
    zzno localzzno2 = new zzno("INT", 1, (Class)localObject, Integer.class, Integer.valueOf(0));
    zzb = localzzno2;
    zzno localzzno3 = new zzno("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    zzc = localzzno3;
    zzno localzzno4 = new zzno("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    zzd = localzzno4;
    zzno localzzno5 = new zzno("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    zze = localzzno5;
    zzno localzzno6 = new zzno("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
    zzf = localzzno6;
    zzno localzzno7 = new zzno("STRING", 6, String.class, String.class, "");
    zzg = localzzno7;
    zzno localzzno8 = new zzno("BYTE_STRING", 7, zzle.class, zzle.class, zzle.zzb);
    zzh = localzzno8;
    zzno localzzno9 = new zzno("ENUM", 8, (Class)localObject, Integer.class, null);
    zzi = localzzno9;
    localObject = new zzno("MESSAGE", 9, Object.class, Object.class, null);
    zzj = (zzno)localObject;
    zzk = new zzno[] { localzzno1, localzzno2, localzzno3, localzzno4, localzzno5, localzzno6, localzzno7, localzzno8, localzzno9, localObject };
  }
  
  private zzno(Class paramClass1, Class paramClass2, Object paramObject)
  {
    zzl = paramClass2;
  }
  
  public final Class zza()
  {
    return zzl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzno
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */