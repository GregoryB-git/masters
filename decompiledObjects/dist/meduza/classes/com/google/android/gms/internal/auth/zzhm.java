package com.google.android.gms.internal.auth;

final class zzhm
  extends zzhl
{
  public final int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    while ((paramInt2 < paramInt3) && (paramArrayOfByte[paramInt2] >= 0)) {
      paramInt2++;
    }
    int i = 0;
    paramInt1 = paramInt2;
    if (paramInt2 >= paramInt3) {
      paramInt1 = i;
    }
    label191:
    label264:
    label266:
    for (;;)
    {
      if (paramInt1 >= paramInt3)
      {
        paramInt1 = i;
      }
      else
      {
        int j = paramInt1 + 1;
        paramInt2 = paramArrayOfByte[paramInt1];
        paramInt1 = j;
        if (paramInt2 >= 0) {
          break label266;
        }
        if (paramInt2 < -32)
        {
          if (j >= paramInt3)
          {
            paramInt1 = paramInt2;
            break label264;
          }
          if (paramInt2 >= -62)
          {
            paramInt1 = j + 1;
            if (paramArrayOfByte[j] <= -65) {
              continue;
            }
          }
        }
        for (;;)
        {
          paramInt1 = -1;
          break label264;
          if (paramInt2 < -16)
          {
            if (j >= paramInt3 - 1) {
              break label191;
            }
            int k = j + 1;
            paramInt1 = paramArrayOfByte[j];
            if ((paramInt1 > -65) || ((paramInt2 == -32) && (paramInt1 < -96)) || ((paramInt2 == -19) && (paramInt1 >= -96))) {
              continue;
            }
            paramInt1 = k + 1;
            if (paramArrayOfByte[k] <= -65) {
              break;
            }
            continue;
          }
          if (j >= paramInt3 - 2)
          {
            paramInt1 = zzhn.zza(paramArrayOfByte, j, paramInt3);
            break label264;
          }
          paramInt1 = j + 1;
          j = paramArrayOfByte[j];
          if ((j <= -65) && (j + 112 + (paramInt2 << 28) >> 30 == 0))
          {
            paramInt2 = paramInt1 + 1;
            if (paramArrayOfByte[paramInt1] <= -65)
            {
              paramInt1 = paramInt2 + 1;
              if (paramArrayOfByte[paramInt2] <= -65) {
                break label266;
              }
            }
          }
        }
      }
      return paramInt1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */