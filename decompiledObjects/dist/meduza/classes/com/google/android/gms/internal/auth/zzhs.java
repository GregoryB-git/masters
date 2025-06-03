package com.google.android.gms.internal.auth;

import java.util.List;

public final class zzhs
  extends zzev
  implements zzfy
{
  private static final zzhs zzb;
  private zzez zzd = zzev.zzf();
  
  static
  {
    zzhs localzzhs = new zzhs();
    zzb = localzzhs;
    zzev.zzk(zzhs.class, localzzhs);
  }
  
  public static zzhs zzp(byte[] paramArrayOfByte)
  {
    return (zzhs)zzev.zzd(zzb, paramArrayOfByte);
  }
  
  public final Object zzn(int paramInt, Object paramObject1, Object paramObject2)
  {
    
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5) {
              return null;
            }
            return zzb;
          }
          return new zzhr(null);
        }
        return new zzhs();
      }
      return zzev.zzh(zzb, "\001\001\000\000\001\001\001\000\001\000\001\032", new Object[] { "zzd" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final List zzq()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */