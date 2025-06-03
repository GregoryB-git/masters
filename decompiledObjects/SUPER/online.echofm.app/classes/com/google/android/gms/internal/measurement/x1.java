package com.google.android.gms.internal.measurement;

import java.util.List;

public final class x1
  extends Y3
  implements K4
{
  private static final x1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private String zzg = "";
  private h4 zzh = Y3.B();
  private boolean zzi;
  private z1 zzj;
  private boolean zzk;
  private boolean zzl;
  private boolean zzm;
  
  static
  {
    x1 localx1 = new x1();
    zzc = localx1;
    Y3.t(x1.class, localx1);
  }
  
  public static a M()
  {
    return (a)zzc.w();
  }
  
  public final y1 G(int paramInt)
  {
    return (y1)zzh.get(paramInt);
  }
  
  public final void H(int paramInt, y1 paramy1)
  {
    paramy1.getClass();
    h4 localh4 = zzh;
    if (!localh4.c()) {
      zzh = Y3.n(localh4);
    }
    zzh.set(paramInt, paramy1);
  }
  
  public final void K(String paramString)
  {
    paramString.getClass();
    zze |= 0x2;
    zzg = paramString;
  }
  
  public final int L()
  {
    return zzf;
  }
  
  public final z1 O()
  {
    z1 localz11 = zzj;
    z1 localz12 = localz11;
    if (localz11 == null) {
      localz12 = z1.I();
    }
    return localz12;
  }
  
  public final String P()
  {
    return zzg;
  }
  
  public final List Q()
  {
    return zzh;
  }
  
  public final boolean R()
  {
    return zzk;
  }
  
  public final boolean S()
  {
    return zzl;
  }
  
  public final boolean T()
  {
    return zzm;
  }
  
  public final boolean U()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean V()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean W()
  {
    return (zze & 0x40) != 0;
  }
  
  public final int k()
  {
    return zzh.size();
  }
  
  public final Object p(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (v1.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzd;
      paramObject1 = paramObject2;
      if (paramObject2 == null)
      {
        try
        {
          paramObject2 = zzd;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/measurement/Y3$a;
            ((Y3.a)paramObject1).<init>(zzc);
            zzd = (T4)paramObject1;
          }
        }
        finally
        {
          break label114;
        }
        break label119;
        throw ((Throwable)paramObject1);
      }
      return paramObject1;
    case 4: 
      return zzc;
    case 3: 
      return Y3.q(zzc, "\001\b\000\001\001\b\b\000\001\000\001င\000\002ဈ\001\003\033\004ဇ\002\005ဉ\003\006ဇ\004\007ဇ\005\bဇ\006", new Object[] { "zze", "zzf", "zzg", "zzh", y1.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new x1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final String A()
    {
      return ((x1)p).P();
    }
    
    public final int w()
    {
      return ((x1)p).k();
    }
    
    public final a x(int paramInt, y1 paramy1)
    {
      s();
      x1.I((x1)p, paramInt, paramy1);
      return this;
    }
    
    public final a y(String paramString)
    {
      s();
      x1.J((x1)p, paramString);
      return this;
    }
    
    public final y1 z(int paramInt)
    {
      return ((x1)p).G(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.x1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */