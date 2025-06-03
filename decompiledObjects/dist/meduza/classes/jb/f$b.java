package jb;

import g;
import java.util.Locale;

public final class f$b
{
  public static final String[] a = { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
  public static final String[] b = new String[64];
  public static final String[] c = new String['Ā'];
  
  static
  {
    int i = 0;
    for (int j = 0;; j++)
    {
      localObject = c;
      if (j >= localObject.length) {
        break;
      }
      localObject[j] = String.format("%8s", new Object[] { Integer.toBinaryString(j) }).replace(' ', '0');
    }
    String[] arrayOfString = b;
    arrayOfString[0] = "";
    arrayOfString[1] = "END_STREAM";
    Object localObject = new int[1];
    localObject[0] = 1;
    arrayOfString[8] = "PADDED";
    int k;
    for (j = 0; j < 1; j++)
    {
      k = localObject[j];
      arrayOfString = b;
      arrayOfString[(k | 0x8)] = g.f(new StringBuilder(), arrayOfString[k], "|PADDED");
    }
    arrayOfString = b;
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
        arrayOfString = b;
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
      localObject = b;
      if (k >= localObject.length) {
        break;
      }
      if (localObject[k] == null) {
        localObject[k] = c[k];
      }
      k++;
    }
  }
  
  public static String a(boolean paramBoolean, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    Object localObject1 = a;
    String str1;
    if (paramByte1 < 10) {
      str1 = localObject1[paramByte1];
    } else {
      str1 = String.format("0x%02x", new Object[] { Byte.valueOf(paramByte1) });
    }
    String str2;
    if (paramByte2 == 0)
    {
      localObject1 = "";
    }
    else
    {
      if ((paramByte1 != 2) && (paramByte1 != 3)) {
        if ((paramByte1 != 4) && (paramByte1 != 6))
        {
          if ((paramByte1 != 7) && (paramByte1 != 8))
          {
            localObject1 = b;
            if (paramByte2 < 64) {
              localObject1 = localObject1[paramByte2];
            } else {
              localObject1 = c[paramByte2];
            }
            if ((paramByte1 == 5) && ((paramByte2 & 0x4) != 0)) {
              localObject2 = "HEADERS";
            }
            for (str2 = "PUSH_PROMISE";; str2 = "COMPRESSED")
            {
              localObject1 = ((String)localObject1).replace((CharSequence)localObject2, str2);
              break;
              if ((paramByte1 != 0) || ((paramByte2 & 0x20) == 0)) {
                break;
              }
              localObject2 = "PRIORITY";
            }
            break label205;
          }
        }
        else
        {
          if (paramByte2 == 1)
          {
            localObject1 = "ACK";
            break label205;
          }
          localObject1 = c[paramByte2];
          break label205;
        }
      }
      localObject1 = c[paramByte2];
    }
    label205:
    Object localObject2 = Locale.US;
    if (paramBoolean) {
      str2 = "<<";
    } else {
      str2 = ">>";
    }
    return String.format((Locale)localObject2, "%s 0x%08x %5d %-13s %s", new Object[] { str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str1, localObject1 });
  }
}

/* Location:
 * Qualified Name:     jb.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */