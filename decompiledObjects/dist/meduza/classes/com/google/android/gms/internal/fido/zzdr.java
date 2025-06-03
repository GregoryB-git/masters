package com.google.android.gms.internal.fido;

import a0.j;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public abstract class zzdr
  implements Comparable
{
  private final zzdr zzc(Class paramClass)
  {
    if (paramClass.isInstance(this)) {
      return (zzdr)paramClass.cast(this);
    }
    throw new zzdq(j.k("Expected a ", paramClass.getName(), " value, but got ", getClass().getName()));
  }
  
  public static int zzd(byte paramByte)
  {
    return paramByte >> 5 & 0x7;
  }
  
  public static zzdm zzg(long paramLong)
  {
    return new zzdm(paramLong);
  }
  
  public static zzdp zzi(String paramString)
  {
    return new zzdp(paramString);
  }
  
  public static zzdr zzj(byte... paramVarArgs)
  {
    paramVarArgs.getClass();
    paramVarArgs = new ByteArrayInputStream(Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    return zzds.zza(paramVarArgs, new zzdu(paramVarArgs));
  }
  
  public static zzdr zzk(InputStream paramInputStream)
  {
    return zzds.zza(paramInputStream, new zzdu(paramInputStream));
  }
  
  public abstract int zza();
  
  public int zzb()
  {
    return 0;
  }
  
  public final zzdk zze()
  {
    return (zzdk)zzc(zzdk.class);
  }
  
  public final zzdm zzf()
  {
    return (zzdm)zzc(zzdm.class);
  }
  
  public final zzdo zzh()
  {
    return (zzdo)zzc(zzdo.class);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */