package com.google.android.recaptcha.internal;

public final class zztl
  extends zznd
  implements zzoj
{
  private static final zztl zzb;
  private static volatile zzoq zzd;
  private int zze = 0;
  private Object zzf;
  
  static
  {
    zztl localzztl = new zztl();
    zzb = localzztl;
    zznd.zzI(zztl.class, localzztl);
  }
  
  public static zztl zzg()
  {
    return zzb;
  }
  
  public final Object zzh(int paramInt, Object paramObject1, Object paramObject2)
  {
    
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5)
            {
              if (paramInt != 6) {
                return null;
              }
              paramObject2 = zzd;
              paramObject1 = paramObject2;
              if (paramObject2 == null) {
                try
                {
                  paramObject2 = zzd;
                  paramObject1 = paramObject2;
                  if (paramObject2 == null)
                  {
                    paramObject1 = new com/google/android/recaptcha/internal/zzmy;
                    ((zzmy)paramObject1).<init>(zzb);
                    zzd = (zzoq)paramObject1;
                  }
                }
                finally {}
              }
              return paramObject1;
            }
            return zzb;
          }
          return new zztk(null);
        }
        return new zztl();
      }
      return zznd.zzF(zzb, "\000(\001\000\001((\000\000\000\001?\000\002?\000\003?\000\004?\000\005?\000\006?\000\007?\000\b?\000\t?\000\n?\000\013?\000\f?\000\r?\000\016?\000\017?\000\020?\000\021?\000\022?\000\023?\000\024?\000\025?\000\026?\000\027?\000\030?\000\031?\000\032?\000\033?\000\034?\000\035?\000\036?\000\037?\000 ?\000!?\000\"?\000#?\000$?\000%?\000&?\000'?\000(?\000", new Object[] { "zzf", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zztl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */