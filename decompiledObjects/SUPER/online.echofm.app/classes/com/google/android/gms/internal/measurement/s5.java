package com.google.android.gms.internal.measurement;

public abstract class s5
{
  public static String a(q3 paramq3)
  {
    r5 localr5 = new r5(paramq3);
    StringBuilder localStringBuilder = new StringBuilder(localr5.a());
    for (int i = 0; i < localr5.a(); i++)
    {
      int j = localr5.e(i);
      if (j != 34) {
        if (j != 39) {
          if (j != 92) {
            switch (j)
            {
            default: 
              if ((j >= 32) && (j <= 126)) {}
              for (;;)
              {
                localStringBuilder.append((char)j);
                break;
                localStringBuilder.append('\\');
                localStringBuilder.append((char)((j >>> 6 & 0x3) + 48));
                localStringBuilder.append((char)((j >>> 3 & 0x7) + 48));
                j = (j & 0x7) + 48;
              }
            case 13: 
              paramq3 = "\\r";
            }
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(paramq3);
        break;
        paramq3 = "\\f";
        continue;
        paramq3 = "\\v";
        continue;
        paramq3 = "\\n";
        continue;
        paramq3 = "\\t";
        continue;
        paramq3 = "\\b";
        continue;
        paramq3 = "\\a";
        continue;
        paramq3 = "\\\\";
        continue;
        paramq3 = "\\'";
        continue;
        paramq3 = "\\\"";
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.s5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */