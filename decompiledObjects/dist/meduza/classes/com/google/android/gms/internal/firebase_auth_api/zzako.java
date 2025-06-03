package com.google.android.gms.internal.firebase_auth_api;

public enum zzako
{
  private final Class<?> zzl;
  
  static
  {
    zzako localzzako1 = new zzako("VOID", 0, Void.class, Void.class, null);
    zza = localzzako1;
    Object localObject = Integer.TYPE;
    zzako localzzako2 = new zzako("INT", 1, (Class)localObject, Integer.class, Integer.valueOf(0));
    zzb = localzzako2;
    zzako localzzako3 = new zzako("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    zzc = localzzako3;
    zzako localzzako4 = new zzako("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    zzd = localzzako4;
    zzako localzzako5 = new zzako("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    zze = localzzako5;
    zzako localzzako6 = new zzako("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
    zzf = localzzako6;
    zzako localzzako7 = new zzako("STRING", 6, String.class, String.class, "");
    zzg = localzzako7;
    zzako localzzako8 = new zzako("BYTE_STRING", 7, com.google.android.gms.internal.firebase-auth-api.zzaiw.class, com.google.android.gms.internal.firebase-auth-api.zzaiw.class, zzaiw.zza);
    zzh = localzzako8;
    localObject = new zzako("ENUM", 8, (Class)localObject, Integer.class, null);
    zzi = (com.google.android.gms.internal.firebase-auth-api.zzako)localObject;
    zzako localzzako9 = new zzako("MESSAGE", 9, Object.class, Object.class, null);
    zzj = localzzako9;
    zzk = new zzako[] { localzzako1, localzzako2, localzzako3, localzzako4, localzzako5, localzzako6, localzzako7, localzzako8, localObject, localzzako9 };
  }
  
  private zzako(Class<?> paramClass1, Class<?> paramClass2, Object paramObject)
  {
    zzl = paramClass2;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzako[] values()
  {
    return (zzako[])zzk.clone();
  }
  
  public final Class<?> zza()
  {
    return zzl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzako
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */