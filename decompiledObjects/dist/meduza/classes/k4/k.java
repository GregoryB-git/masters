package k4;

import c4.v.a;
import v5.m;
import x6.b;

public final class k
{
  public final boolean a;
  public final String b;
  public final v.a c;
  public final int d;
  public final byte[] e;
  
  public k(boolean paramBoolean, String paramString, int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2)
  {
    int i = 1;
    int j = 0;
    int k;
    if (paramInt1 == 0) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (paramArrayOfByte2 == null) {
      m = 1;
    } else {
      m = 0;
    }
    b.q(k ^ m);
    a = paramBoolean;
    b = paramString;
    d = paramInt1;
    e = paramArrayOfByte2;
    if (paramString == null)
    {
      k = i;
    }
    else
    {
      switch (paramString.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              paramInt1 = -1;
              break;
            } while (!paramString.equals("cens"));
            paramInt1 = 3;
            break;
          } while (!paramString.equals("cenc"));
          paramInt1 = 2;
          break;
        } while (!paramString.equals("cbcs"));
        paramInt1 = 1;
        break;
        paramInt1 = j;
      } while (!paramString.equals("cbc1"));
      k = i;
      switch (paramInt1)
      {
      default: 
        paramArrayOfByte2 = new StringBuilder();
        paramArrayOfByte2.append("Unsupported protection scheme type '");
        paramArrayOfByte2.append(paramString);
        paramArrayOfByte2.append("'. Assuming AES-CTR crypto mode.");
        m.f("TrackEncryptionBox", paramArrayOfByte2.toString());
        k = i;
        break;
      case 0: 
      case 1: 
        k = 2;
      }
    }
    c = new v.a(k, paramArrayOfByte1, paramInt2, paramInt3);
  }
}

/* Location:
 * Qualified Name:     k4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */