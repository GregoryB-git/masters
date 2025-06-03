package okhttp3.internal.http2;

import g;
import java.io.IOException;
import okhttp3.internal.Util;
import xc.i;
import xc.i.a;

public final class Http2
{
  public static final i a;
  public static final String[] b;
  public static final String[] c;
  public static final String[] d;
  
  static
  {
    Object localObject = i.d;
    a = i.a.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    b = new String[] { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
    c = new String[64];
    d = new String['Ā'];
    int i = 0;
    for (int j = 0;; j++)
    {
      localObject = d;
      if (j >= localObject.length) {
        break;
      }
      localObject[j] = Util.l("%8s", new Object[] { Integer.toBinaryString(j) }).replace(' ', '0');
    }
    String[] arrayOfString = c;
    arrayOfString[0] = "";
    arrayOfString[1] = "END_STREAM";
    localObject = new int[1];
    localObject[0] = 1;
    arrayOfString[8] = "PADDED";
    int k;
    for (j = 0; j < 1; j++)
    {
      k = localObject[j];
      arrayOfString = c;
      arrayOfString[(k | 0x8)] = g.f(new StringBuilder(), arrayOfString[k], "|PADDED");
    }
    arrayOfString = c;
    arrayOfString[4] = "END_HEADERS";
    arrayOfString[32] = "PRIORITY";
    arrayOfString[36] = "END_HEADERS|PRIORITY";
    for (j = 0;; j++)
    {
      k = i;
      if (j >= 3) {
        break;
      }
      int m = new int[] { 4, 32, 36 }[j];
      for (k = 0; k < 1; k++)
      {
        int n = localObject[k];
        arrayOfString = c;
        int i1 = n | m;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(arrayOfString[n]);
        localStringBuilder.append('|');
        localStringBuilder.append(arrayOfString[m]);
        arrayOfString[i1] = localStringBuilder.toString();
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(arrayOfString[n]);
        localStringBuilder.append('|');
        arrayOfString[(i1 | 0x8)] = g.f(localStringBuilder, arrayOfString[m], "|PADDED");
      }
    }
    for (;;)
    {
      localObject = c;
      if (k >= localObject.length) {
        break;
      }
      if (localObject[k] == null) {
        localObject[k] = d[k];
      }
      k++;
    }
  }
  
  public static String a(boolean paramBoolean, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    Object localObject = b;
    String str1;
    if (paramByte1 < localObject.length) {
      str1 = localObject[paramByte1];
    } else {
      str1 = Util.l("0x%02x", new Object[] { Byte.valueOf(paramByte1) });
    }
    String str3;
    if (paramByte2 == 0)
    {
      localObject = "";
    }
    else
    {
      if ((paramByte1 != 2) && (paramByte1 != 3)) {
        if ((paramByte1 != 4) && (paramByte1 != 6))
        {
          if ((paramByte1 != 7) && (paramByte1 != 8))
          {
            localObject = c;
            if (paramByte2 < localObject.length) {
              localObject = localObject[paramByte2];
            } else {
              localObject = d[paramByte2];
            }
            String str2;
            if ((paramByte1 == 5) && ((paramByte2 & 0x4) != 0)) {
              str2 = "HEADERS";
            }
            for (str3 = "PUSH_PROMISE";; str3 = "COMPRESSED")
            {
              localObject = ((String)localObject).replace(str2, str3);
              break;
              if ((paramByte1 != 0) || ((paramByte2 & 0x20) == 0)) {
                break;
              }
              str2 = "PRIORITY";
            }
            break label207;
          }
        }
        else
        {
          if (paramByte2 == 1)
          {
            localObject = "ACK";
            break label207;
          }
          localObject = d[paramByte2];
          break label207;
        }
      }
      localObject = d[paramByte2];
    }
    label207:
    if (paramBoolean) {
      str3 = "<<";
    } else {
      str3 = ">>";
    }
    return Util.l("%s 0x%08x %5d %-13s %s", new Object[] { str3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str1, localObject });
  }
  
  public static void b(String paramString, Object... paramVarArgs)
  {
    throw new IOException(Util.l(paramString, paramVarArgs));
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */