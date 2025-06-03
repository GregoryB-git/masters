package Z0;

import F0.T.a;
import g0.a;
import g0.o;

public final class t
{
  public final boolean a;
  public final String b;
  public final T.a c;
  public final int d;
  public final byte[] e;
  
  public t(boolean paramBoolean, String paramString, int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2)
  {
    int i = 1;
    int j;
    if (paramInt1 == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (paramArrayOfByte2 != null) {
      i = 0;
    }
    a.a(i ^ j);
    a = paramBoolean;
    b = paramString;
    d = paramInt1;
    e = paramArrayOfByte2;
    c = new T.a(a(paramString), paramArrayOfByte1, paramInt2, paramInt3);
  }
  
  public static int a(String paramString)
  {
    if (paramString == null) {
      return 1;
    }
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 3049895: 
      if (paramString.equals("cens")) {
        j = 3;
      }
      break;
    case 3049879: 
      if (paramString.equals("cenc")) {
        j = 2;
      }
      break;
    case 3046671: 
      if (paramString.equals("cbcs")) {
        j = 1;
      }
      break;
    case 3046605: 
      if (paramString.equals("cbc1")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unsupported protection scheme type '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("'. Assuming AES-CTR crypto mode.");
      o.h("TrackEncryptionBox", localStringBuilder.toString());
    case 2: 
    case 3: 
      return 1;
    }
    return 2;
  }
}

/* Location:
 * Qualified Name:     Z0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */