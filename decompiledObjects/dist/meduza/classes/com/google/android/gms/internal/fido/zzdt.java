package com.google.android.gms.internal.fido;

public final class zzdt
{
  private final byte zza;
  private final byte zzb;
  
  public zzdt(int paramInt)
  {
    zza = ((byte)(byte)(paramInt & 0xE0));
    zzb = ((byte)(byte)(paramInt & 0x1F));
  }
  
  public final byte zza()
  {
    return zzb;
  }
  
  public final byte zzb()
  {
    return zza;
  }
  
  public final int zzc()
  {
    return zza >> 5 & 0x7;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */