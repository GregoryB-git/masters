package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;

final class zzamo
{
  public static String zza(zzaiw paramzzaiw)
  {
    zzamr localzzamr = new zzamr(paramzzaiw);
    StringBuilder localStringBuilder = new StringBuilder(localzzamr.zza());
    for (int i = 0; i < localzzamr.zza(); i++)
    {
      int j = localzzamr.zza(i);
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
              paramzzaiw = "\\r";
              break;
            case 12: 
              paramzzaiw = "\\f";
              break;
            case 11: 
              paramzzaiw = "\\v";
              break;
            case 10: 
              paramzzaiw = "\\n";
              break;
            case 9: 
              paramzzaiw = "\\t";
              break;
            case 8: 
              paramzzaiw = "\\b";
              break;
            case 7: 
              paramzzaiw = "\\a";
            }
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(paramzzaiw);
        break;
        paramzzaiw = "\\\\";
        continue;
        paramzzaiw = "\\'";
        continue;
        paramzzaiw = "\\\"";
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */