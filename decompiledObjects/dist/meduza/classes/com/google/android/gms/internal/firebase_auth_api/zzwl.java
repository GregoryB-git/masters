package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajv;
import com.google.android.gms.internal.firebase-auth-api.zzwb.zzb;
import java.io.InputStream;
import java.util.List;

public final class zzwl
  extends zzakg<zzwl, zzb>
  implements zzalp
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzwl zzc;
  private static volatile zzalw<zzwl> zzd;
  private int zze;
  private zzakn<zza> zzf = zzakg.zzp();
  
  static
  {
    zzwl localzzwl = new zzwl();
    zzc = localzzwl;
    zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwl.class, localzzwl);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwl zza(InputStream paramInputStream, zzajv paramzzajv)
  {
    return (zzwl)zzakg.zza(zzc, paramInputStream, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwl zza(byte[] paramArrayOfByte, zzajv paramzzajv)
  {
    return (zzwl)zzakg.zza(zzc, paramArrayOfByte, paramzzajv);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwl.zzb zzc()
  {
    return (zzb)zzc.zzm();
  }
  
  public final int zza()
  {
    return zzf.size();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwl.zza zza(int paramInt)
  {
    return (zza)zzf.get(paramInt);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzwk.zza[(paramInt - 1)])
    {
    default: 
      throw null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzd;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzd;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/firebase_auth_api/zzakg$zza;
            ((zzakg.zza)paramObject1).<init>(zzc);
            zzd = (com.google.android.gms.internal.firebase-auth-api.zzalw)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzc;
    case 3: 
      return zzakg.zza(zzc, "\000\002\000\000\001\002\002\000\001\000\001\013\002\033", new Object[] { "zze", "zzf", com.google.android.gms.internal.firebase-auth-api.zzwl.zza.class });
    case 2: 
      return new zzb(null);
    }
    return new zzwl();
  }
  
  public final int zzb()
  {
    return zze;
  }
  
  public final List<zza> zze()
  {
    return zzf;
  }
  
  public static final class zza
    extends zzakg<zza, zza>
    implements zzalp
  {
    private static final com.google.android.gms.internal.firebase-auth-api.zzwl.zza zzc;
    private static volatile zzalw<zza> zzd;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.zzwb zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    
    static
    {
      zza localzza = new zza();
      zzc = localzza;
      zzakg.zza(com.google.android.gms.internal.firebase-auth-api.zzwl.zza.class, localzza);
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.zzwl.zza.zza zzd()
    {
      return (zza)zzc.zzm();
    }
    
    public final int zza()
    {
      return zzh;
    }
    
    public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
    {
      switch (zzwk.zza[(paramInt - 1)])
      {
      default: 
        throw null;
      case 6: 
        return Byte.valueOf((byte)1);
      case 5: 
        paramObject2 = zzd;
        paramObject1 = paramObject2;
        if (paramObject2 == null) {
          try
          {
            paramObject2 = zzd;
            paramObject1 = paramObject2;
            if (paramObject2 == null)
            {
              paramObject1 = new com/google/android/gms/internal/firebase_auth_api/zzakg$zza;
              ((zzakg.zza)paramObject1).<init>(zzc);
              zzd = (com.google.android.gms.internal.firebase-auth-api.zzalw)paramObject1;
            }
          }
          finally {}
        }
        return paramObject1;
      case 4: 
        return zzc;
      case 3: 
        return zzakg.zza(zzc, "\000\004\000\001\001\004\004\000\000\000\001ဉ\000\002\f\003\013\004\f", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
      case 2: 
        return new zza(null);
      }
      return new zza();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwb zzb()
    {
      com.google.android.gms.internal.firebase-auth-api.zzwb localzzwb1 = zzf;
      com.google.android.gms.internal.firebase-auth-api.zzwb localzzwb2 = localzzwb1;
      if (localzzwb1 == null) {
        localzzwb2 = zzwb.zzd();
      }
      return localzzwb2;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwc zzc()
    {
      com.google.android.gms.internal.firebase-auth-api.zzwc localzzwc1 = zzwc.zza(zzg);
      com.google.android.gms.internal.firebase-auth-api.zzwc localzzwc2 = localzzwc1;
      if (localzzwc1 == null) {
        localzzwc2 = zzwc.zze;
      }
      return localzzwc2;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzxd zzf()
    {
      com.google.android.gms.internal.firebase-auth-api.zzxd localzzxd1 = zzxd.zza(zzi);
      com.google.android.gms.internal.firebase-auth-api.zzxd localzzxd2 = localzzxd1;
      if (localzzxd1 == null) {
        localzzxd2 = zzxd.zzf;
      }
      return localzzxd2;
    }
    
    public final boolean zzg()
    {
      return (zze & 0x1) != 0;
    }
    
    public static final class zza
      extends zzakg.zzb<zzwl.zza, zza>
      implements zzalp
    {
      private zza()
      {
        super();
      }
      
      public final com.google.android.gms.internal.firebase-auth-api.zzwl.zza.zza zza(int paramInt)
      {
        zzg();
        zzwl.zza.zza((zzwl.zza)zza, paramInt);
        return this;
      }
      
      public final com.google.android.gms.internal.firebase-auth-api.zzwl.zza.zza zza(zzwb.zzb paramzzb)
      {
        zzg();
        zzwl.zza.zza((zzwl.zza)zza, (zzwb)paramzzb.zze());
        return this;
      }
      
      public final com.google.android.gms.internal.firebase-auth-api.zzwl.zza.zza zza(com.google.android.gms.internal.firebase-auth-api.zzwb paramzzwb)
      {
        zzg();
        zzwl.zza.zza((zzwl.zza)zza, paramzzwb);
        return this;
      }
      
      public final com.google.android.gms.internal.firebase-auth-api.zzwl.zza.zza zza(com.google.android.gms.internal.firebase-auth-api.zzwc paramzzwc)
      {
        zzg();
        zzwl.zza.zza((zzwl.zza)zza, paramzzwc);
        return this;
      }
      
      public final com.google.android.gms.internal.firebase-auth-api.zzwl.zza.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
      {
        zzg();
        zzwl.zza.zza((zzwl.zza)zza, paramzzxd);
        return this;
      }
    }
  }
  
  public static final class zzb
    extends zzakg.zzb<zzwl, zzb>
    implements zzalp
  {
    private zzb()
    {
      super();
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwl.zzb zza(int paramInt)
    {
      zzg();
      zzwl.zza((zzwl)zza, paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzwl.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzwl.zza paramzza)
    {
      zzg();
      zzwl.zza((zzwl)zza, paramzza);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */