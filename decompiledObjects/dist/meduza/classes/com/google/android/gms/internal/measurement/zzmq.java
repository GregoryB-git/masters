package com.google.android.gms.internal.measurement;

final class zzmq
{
  public static String zza(zziy paramzziy)
  {
    zzmt localzzmt = new zzmt(paramzziy);
    StringBuilder localStringBuilder = new StringBuilder(localzzmt.zza());
    for (int i = 0; i < localzzmt.zza(); i++)
    {
      int j = localzzmt.zza(i);
      if (j != 34) {
        if (j != 39) {
          if (j != 92) {
            switch (j)
            {
            default: 
              if ((j < 32) || (j > 126))
              {
                localStringBuilder.append('\\');
                localStringBuilder.append((char)((j >>> 6 & 0x3) + 48));
                localStringBuilder.append((char)((j >>> 3 & 0x7) + 48));
                j = (j & 0x7) + 48;
              }
              localStringBuilder.append((char)j);
              break;
            case 13: 
              paramzziy = "\\r";
              break;
            case 12: 
              paramzziy = "\\f";
              break;
            case 11: 
              paramzziy = "\\v";
              break;
            case 10: 
              paramzziy = "\\n";
              break;
            case 9: 
              paramzziy = "\\t";
              break;
            case 8: 
              paramzziy = "\\b";
              break;
            case 7: 
              paramzziy = "\\a";
            }
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(paramzziy);
        break;
        paramzziy = "\\\\";
        continue;
        paramzziy = "\\'";
        continue;
        paramzziy = "\\\"";
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */