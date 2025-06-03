package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class L1
  extends Y3
  implements K4
{
  private static final L1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private long zzf;
  private String zzg = "";
  private int zzh;
  private h4 zzi = Y3.B();
  private h4 zzj = Y3.B();
  private h4 zzk = Y3.B();
  private String zzl = "";
  private boolean zzm;
  private h4 zzn = Y3.B();
  private h4 zzo = Y3.B();
  private String zzp = "";
  private String zzq = "";
  private String zzr = "";
  private String zzs = "";
  private I1 zzt;
  private M1 zzu;
  
  static
  {
    L1 localL1 = new L1();
    zzc = localL1;
    Y3.t(L1.class, localL1);
  }
  
  public static a N()
  {
    return (a)zzc.w();
  }
  
  public static L1 P()
  {
    return zzc;
  }
  
  public final K1 G(int paramInt)
  {
    return (K1)zzj.get(paramInt);
  }
  
  public final void H(int paramInt, K1 paramK1)
  {
    paramK1.getClass();
    h4 localh4 = zzj;
    if (!localh4.c()) {
      zzj = Y3.n(localh4);
    }
    zzj.set(paramInt, paramK1);
  }
  
  public final int K()
  {
    return zzj.size();
  }
  
  public final long L()
  {
    return zzf;
  }
  
  public final I1 M()
  {
    I1 localI11 = zzt;
    I1 localI12 = localI11;
    if (localI11 == null) {
      localI12 = I1.H();
    }
    return localI12;
  }
  
  public final String Q()
  {
    return zzg;
  }
  
  public final String R()
  {
    return zzr;
  }
  
  public final String S()
  {
    return zzq;
  }
  
  public final String T()
  {
    return zzp;
  }
  
  public final List U()
  {
    return zzk;
  }
  
  public final List V()
  {
    return zzo;
  }
  
  public final List W()
  {
    return zzn;
  }
  
  public final List X()
  {
    return zzi;
  }
  
  public final boolean Y()
  {
    return zzm;
  }
  
  public final boolean Z()
  {
    return (zze & 0x200) != 0;
  }
  
  public final boolean a0()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean b0()
  {
    return (zze & 0x1) != 0;
  }
  
  public final void c0()
  {
    zzk = Y3.B();
  }
  
  public final int k()
  {
    return zzn.size();
  }
  
  public final Object p(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (H1.a[(paramInt - 1)])
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
      return Y3.q(zzc, "\001\020\000\001\001\020\020\000\005\000\001ဂ\000\002ဈ\001\003င\002\004\033\005\033\006\033\007ဈ\003\bဇ\004\t\033\n\033\013ဈ\005\fဈ\006\rဈ\007\016ဈ\b\017ဉ\t\020ဉ\n", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", O1.class, "zzj", K1.class, "zzk", w1.class, "zzl", "zzm", "zzn", q2.class, "zzo", J1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new L1();
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
      return ((L1)p).T();
    }
    
    public final List B()
    {
      return Collections.unmodifiableList(((L1)p).U());
    }
    
    public final List C()
    {
      return Collections.unmodifiableList(((L1)p).V());
    }
    
    public final int w()
    {
      return ((L1)p).K();
    }
    
    public final K1 x(int paramInt)
    {
      return ((L1)p).G(paramInt);
    }
    
    public final a y(int paramInt, K1.a parama)
    {
      s();
      L1.J((L1)p, paramInt, (K1)parama.p());
      return this;
    }
    
    public final a z()
    {
      s();
      L1.I((L1)p);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.L1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */