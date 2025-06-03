package com.google.android.gms.internal.common;

final class zzw
  extends zzz
{
  public zzw(zzx paramzzx, zzaa paramzzaa, CharSequence paramCharSequence, zzr paramzzr)
  {
    super(paramzzaa, paramCharSequence);
  }
  
  public final int zzc(int paramInt)
  {
    return paramInt + 1;
  }
  
  public final int zzd(int paramInt)
  {
    CharSequence localCharSequence = zzb;
    int i = localCharSequence.length();
    zzv.zzb(paramInt, i, "index");
    while (paramInt < i)
    {
      if (zza.zza(localCharSequence.charAt(paramInt))) {
        return paramInt;
      }
      paramInt++;
    }
    paramInt = -1;
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */