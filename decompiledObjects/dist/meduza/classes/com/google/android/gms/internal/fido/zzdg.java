package com.google.android.gms.internal.fido;

final class zzdg
{
  public static String zza(zzcz paramzzcz)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramzzcz.zzd());
    for (int i = 0; i < paramzzcz.zzd(); i++)
    {
      int j = paramzzcz.zza(i);
      String str;
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
              str = "\\r";
              break;
            case 12: 
              str = "\\f";
              break;
            case 11: 
              str = "\\v";
              break;
            case 10: 
              str = "\\n";
              break;
            case 9: 
              str = "\\t";
              break;
            case 8: 
              str = "\\b";
              break;
            case 7: 
              str = "\\a";
            }
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(str);
        break;
        str = "\\\\";
        continue;
        str = "\\'";
        continue;
        str = "\\\"";
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */