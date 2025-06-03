package b5;

import java.util.Arrays;

public abstract class j
{
  public static int a(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = 0;
    int k = 0;
    if (paramInt < i)
    {
      int m = paramInt;
      paramInt = k;
      for (;;)
      {
        char c = paramCharSequence.charAt(m);
        do
        {
          j = paramInt;
          if (!f(c)) {
            break;
          }
          j = paramInt;
          if (m >= i) {
            break;
          }
          k = paramInt + 1;
          j = m + 1;
          paramInt = k;
          m = j;
        } while (j >= i);
        paramInt = k;
        m = j;
      }
    }
    return j;
  }
  
  public static String b(String paramString, l paraml, V4.b paramb1, V4.b paramb2)
  {
    a locala = new a();
    c localc = new c();
    m localm = new m();
    n localn = new n();
    f localf = new f();
    b localb = new b();
    int i = 0;
    h localh = new h(paramString);
    localh.n(paraml);
    localh.l(paramb1, paramb2);
    int j;
    if ((paramString.startsWith("[)>\03605\035")) && (paramString.endsWith("\036\004"))) {
      j = 236;
    }
    for (int k = j;; k = j)
    {
      localh.r(k);
      localh.m(2);
      d += 7;
      j = i;
      break;
      j = i;
      if (!paramString.startsWith("[)>\03606\035")) {
        break;
      }
      j = i;
      if (!paramString.endsWith("\036\004")) {
        break;
      }
      j = 237;
    }
    while (localh.i())
    {
      new g[] { locala, localc, localm, localn, localf, localb }[j].a(localh);
      if (localh.e() >= 0)
      {
        j = localh.e();
        localh.j();
      }
    }
    i = localh.a();
    localh.p();
    int m = localh.g().a();
    if ((i < m) && (j != 0) && (j != 5) && (j != 4)) {
      localh.r('þ');
    }
    paramString = localh.b();
    if (paramString.length() < m) {
      paramString.append('');
    }
    while (paramString.length() < m) {
      paramString.append(o('', paramString.length() + 1));
    }
    return localh.b().toString();
  }
  
  public static int c(float[] paramArrayOfFloat, int[] paramArrayOfInt, int paramInt, byte[] paramArrayOfByte)
  {
    Arrays.fill(paramArrayOfByte, (byte)0);
    int i = 0;
    for (int j = paramInt; i < 6; j = paramInt)
    {
      int k = (int)Math.ceil(paramArrayOfFloat[i]);
      paramArrayOfInt[i] = k;
      paramInt = j;
      if (j > k)
      {
        Arrays.fill(paramArrayOfByte, (byte)0);
        paramInt = k;
      }
      if (paramInt == k) {
        paramArrayOfByte[i] = ((byte)(byte)(paramArrayOfByte[i] + 1));
      }
      i++;
    }
    return j;
  }
  
  public static int d(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 0;
    while (i < 6)
    {
      j += paramArrayOfByte[i];
      i++;
    }
    return j;
  }
  
  public static void e(char paramChar)
  {
    String str = Integer.toHexString(paramChar);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("0000".substring(0, 4 - str.length()));
    localStringBuilder.append(str);
    str = localStringBuilder.toString();
    localStringBuilder = new StringBuilder("Illegal character: ");
    localStringBuilder.append(paramChar);
    localStringBuilder.append(" (0x");
    localStringBuilder.append(str);
    localStringBuilder.append(')');
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static boolean f(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }
  
  public static boolean g(char paramChar)
  {
    return (paramChar >= '') && (paramChar <= 'ÿ');
  }
  
  public static boolean h(char paramChar)
  {
    return (paramChar == ' ') || ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'A') && (paramChar <= 'Z'));
  }
  
  public static boolean i(char paramChar)
  {
    return (paramChar >= ' ') && (paramChar <= '^');
  }
  
  public static boolean j(char paramChar)
  {
    return (paramChar == ' ') || ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'a') && (paramChar <= 'z'));
  }
  
  public static boolean k(char paramChar)
  {
    return (m(paramChar)) || (paramChar == ' ') || ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'A') && (paramChar <= 'Z'));
  }
  
  public static boolean l(char paramChar)
  {
    return false;
  }
  
  public static boolean m(char paramChar)
  {
    return (paramChar == '\r') || (paramChar == '*') || (paramChar == '>');
  }
  
  public static int n(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (paramInt1 >= paramCharSequence.length()) {
      return paramInt2;
    }
    float[] arrayOfFloat;
    if (paramInt2 == 0)
    {
      arrayOfFloat = new float[6];
      float[] tmp22_21 = arrayOfFloat;
      tmp22_21[0] = 0.0F;
      float[] tmp26_22 = tmp22_21;
      tmp26_22[1] = 1.0F;
      float[] tmp30_26 = tmp26_22;
      tmp30_26[2] = 1.0F;
      float[] tmp34_30 = tmp30_26;
      tmp34_30[3] = 1.0F;
      float[] tmp38_34 = tmp34_30;
      tmp38_34[4] = 1.0F;
      float[] tmp42_38 = tmp38_34;
      tmp42_38[5] = 1.25F;
      tmp42_38;
    }
    else
    {
      arrayOfFloat = new float[6];
      float[] tmp57_56 = arrayOfFloat;
      tmp57_56[0] = 1.0F;
      float[] tmp61_57 = tmp57_56;
      tmp61_57[1] = 2.0F;
      float[] tmp65_61 = tmp61_57;
      tmp65_61[2] = 2.0F;
      float[] tmp69_65 = tmp65_61;
      tmp69_65[3] = 2.0F;
      float[] tmp73_69 = tmp69_65;
      tmp73_69[4] = 2.0F;
      float[] tmp77_73 = tmp73_69;
      tmp77_73[5] = 2.25F;
      tmp77_73;
      arrayOfFloat[paramInt2] = 0.0F;
    }
    paramInt2 = 0;
    label809:
    for (;;)
    {
      int i = paramInt1 + paramInt2;
      Object localObject;
      if (i == paramCharSequence.length())
      {
        localObject = new byte[6];
        paramCharSequence = new int[6];
        paramInt1 = c(arrayOfFloat, paramCharSequence, Integer.MAX_VALUE, (byte[])localObject);
        paramInt2 = d((byte[])localObject);
        if (paramCharSequence[0] == paramInt1) {
          return 0;
        }
        if ((paramInt2 == 1) && (localObject[5] > 0)) {
          return 5;
        }
        if ((paramInt2 == 1) && (localObject[4] > 0)) {
          return 4;
        }
        if ((paramInt2 == 1) && (localObject[2] > 0)) {
          return 2;
        }
        if ((paramInt2 == 1) && (localObject[3] > 0)) {
          return 3;
        }
        return 1;
      }
      char c = paramCharSequence.charAt(i);
      paramInt2++;
      if (f(c))
      {
        arrayOfFloat[0] += 0.5F;
      }
      else
      {
        float f;
        if (g(c))
        {
          f = (float)Math.ceil(arrayOfFloat[0]);
          arrayOfFloat[0] = f;
          arrayOfFloat[0] = (f + 2.0F);
        }
        else
        {
          f = (float)Math.ceil(arrayOfFloat[0]);
          arrayOfFloat[0] = f;
          arrayOfFloat[0] = (f + 1.0F);
        }
      }
      if (h(c)) {
        arrayOfFloat[1] += 0.6666667F;
      } else if (g(c)) {
        arrayOfFloat[1] += 2.6666667F;
      } else {
        arrayOfFloat[1] += 1.3333334F;
      }
      if (j(c)) {
        arrayOfFloat[2] += 0.6666667F;
      } else if (g(c)) {
        arrayOfFloat[2] += 2.6666667F;
      } else {
        arrayOfFloat[2] += 1.3333334F;
      }
      if (k(c)) {
        arrayOfFloat[3] += 0.6666667F;
      } else if (g(c)) {
        arrayOfFloat[3] += 4.3333335F;
      } else {
        arrayOfFloat[3] += 3.3333333F;
      }
      if (i(c)) {
        arrayOfFloat[4] += 0.75F;
      } else if (g(c)) {
        arrayOfFloat[4] += 4.25F;
      } else {
        arrayOfFloat[4] += 3.25F;
      }
      if (l(c)) {
        arrayOfFloat[5] += 4.0F;
      } else {
        arrayOfFloat[5] += 1.0F;
      }
      if (paramInt2 >= 4)
      {
        localObject = new int[6];
        byte[] arrayOfByte = new byte[6];
        c(arrayOfFloat, (int[])localObject, Integer.MAX_VALUE, arrayOfByte);
        int j = d(arrayOfByte);
        int k = localObject[0];
        i = localObject[5];
        if ((k < i) && (k < localObject[1]) && (k < localObject[2]) && (k < localObject[3]) && (k < localObject[4])) {
          return 0;
        }
        int n;
        int i1;
        int i2;
        if (i >= k)
        {
          int m = arrayOfByte[1];
          n = arrayOfByte[2];
          i1 = arrayOfByte[3];
          i2 = arrayOfByte[4];
          if (m + n + i1 + i2 == 0) {}
        }
        else
        {
          if ((j == 1) && (i2 > 0)) {
            return 4;
          }
          if ((j == 1) && (n > 0)) {
            return 2;
          }
          if ((j == 1) && (i1 > 0)) {
            return 3;
          }
          i2 = localObject[1];
          if ((i2 + 1 >= k) || (i2 + 1 >= i) || (i2 + 1 >= localObject[4]) || (i2 + 1 >= localObject[2])) {
            break label809;
          }
          i = localObject[3];
          if (i2 < i) {
            return 1;
          }
          if (i2 != i) {
            break label809;
          }
          paramInt1 += paramInt2;
          do
          {
            paramInt1++;
            if (paramInt1 >= paramCharSequence.length()) {
              break;
            }
            c = paramCharSequence.charAt(paramInt1);
            if (m(c)) {
              return 3;
            }
          } while (k(c));
          return 1;
        }
        return 5;
      }
    }
  }
  
  public static char o(char paramChar, int paramInt)
  {
    paramChar += paramInt * 149 % 253 + 1;
    if (paramChar > 'þ') {
      paramChar -= 254;
    }
    return (char)paramChar;
  }
}

/* Location:
 * Qualified Name:     b5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */