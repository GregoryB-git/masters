package u4;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o7.l0;
import o7.t.a;
import v5.e0;
import v5.u;
import w3.v;

public final class g
  extends e9.a
{
  public static final v c = new v(9);
  public final a b;
  
  public g(a parama)
  {
    b = parama;
  }
  
  public static a D(int paramInt1, int paramInt2, u paramu)
  {
    int i = paramu.v();
    Object localObject1 = N(i);
    int j = paramInt1 - 1;
    byte[] arrayOfByte = new byte[j];
    paramu.d(arrayOfByte, 0, j);
    Object localObject2;
    if (paramInt2 == 2)
    {
      paramu = f.l("image/");
      paramu.append(x6.b.x0(new String(arrayOfByte, 0, 3, n7.d.b)));
      localObject2 = paramu.toString();
      paramu = (u)localObject2;
      if ("image/jpg".equals(localObject2)) {
        paramu = "image/jpeg";
      }
      paramInt1 = 2;
    }
    else
    {
      paramInt1 = Q(arrayOfByte, 0);
      paramu = x6.b.x0(new String(arrayOfByte, 0, paramInt1, n7.d.b));
      if (paramu.indexOf('/') == -1) {
        paramu = g.d("image/", paramu);
      }
    }
    paramInt2 = arrayOfByte[(paramInt1 + 1)];
    int k = paramInt1 + 2;
    paramInt1 = P(arrayOfByte, k, i);
    localObject1 = new String(arrayOfByte, k, paramInt1 - k, (Charset)localObject1);
    paramInt1 = M(i) + paramInt1;
    if (j <= paramInt1) {
      localObject2 = e0.f;
    } else {
      localObject2 = Arrays.copyOfRange(arrayOfByte, paramInt1, j);
    }
    return new a(paramInt2 & 0xFF, paramu, (String)localObject1, (byte[])localObject2);
  }
  
  public static c E(u paramu, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a parama)
  {
    int i = b;
    int j = Q(a, i);
    String str = new String(a, i, j - i, n7.d.b);
    paramu.G(j + 1);
    j = paramu.f();
    int k = paramu.f();
    long l1 = paramu.w();
    if (l1 == 4294967295L) {
      l1 = -1L;
    }
    long l2 = paramu.w();
    if (l2 == 4294967295L) {
      l2 = -1L;
    }
    ArrayList localArrayList = new ArrayList();
    while (b < i + paramInt1)
    {
      h localh = H(paramInt2, paramu, paramBoolean, paramInt3, parama);
      if (localh != null) {
        localArrayList.add(localh);
      }
    }
    return new c(str, j, k, l1, l2, (h[])localArrayList.toArray(new h[0]));
  }
  
  public static d F(u paramu, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a parama)
  {
    int i = b;
    int j = Q(a, i);
    String str = new String(a, i, j - i, n7.d.b);
    paramu.G(j + 1);
    j = paramu.v();
    boolean bool1;
    if ((j & 0x2) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if ((j & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    int k = paramu.v();
    String[] arrayOfString = new String[k];
    for (j = 0; j < k; j++)
    {
      int m = b;
      int n = Q(a, m);
      arrayOfString[j] = new String(a, m, n - m, n7.d.b);
      paramu.G(n + 1);
    }
    ArrayList localArrayList = new ArrayList();
    while (b < i + paramInt1)
    {
      h localh = H(paramInt2, paramu, paramBoolean, paramInt3, parama);
      if (localh != null) {
        localArrayList.add(localh);
      }
    }
    return new d(str, bool1, bool2, arrayOfString, (h[])localArrayList.toArray(new h[0]));
  }
  
  public static e G(int paramInt, u paramu)
  {
    if (paramInt < 4) {
      return null;
    }
    int i = paramu.v();
    Charset localCharset = N(i);
    Object localObject = new byte[3];
    paramu.d((byte[])localObject, 0, 3);
    localObject = new String((byte[])localObject, 0, 3);
    paramInt -= 4;
    byte[] arrayOfByte = new byte[paramInt];
    paramu.d(arrayOfByte, 0, paramInt);
    paramInt = P(arrayOfByte, 0, i);
    paramu = new String(arrayOfByte, 0, paramInt, localCharset);
    paramInt = M(i) + paramInt;
    return new e((String)localObject, paramu, K(arrayOfByte, paramInt, P(arrayOfByte, paramInt, i), localCharset));
  }
  
  public static h H(int paramInt1, u paramu, boolean paramBoolean, int paramInt2, a parama)
  {
    int i = paramu.v();
    int j = paramu.v();
    int k = paramu.v();
    int m;
    if (paramInt1 >= 3) {
      m = paramu.v();
    } else {
      m = 0;
    }
    if (paramInt1 == 4)
    {
      n = paramu.y();
      i1 = n;
      if (!paramBoolean) {
        i1 = (n >> 24 & 0xFF) << 21 | n & 0xFF | (n >> 8 & 0xFF) << 7 | (n >> 16 & 0xFF) << 14;
      }
    }
    int i2;
    for (;;)
    {
      i2 = i1;
      break;
      if (paramInt1 == 3) {
        i1 = paramu.y();
      } else {
        i1 = paramu.x();
      }
    }
    if (paramInt1 >= 3) {
      i1 = paramu.A();
    } else {
      i1 = 0;
    }
    if ((i == 0) && (j == 0) && (k == 0) && (m == 0) && (i2 == 0) && (i1 == 0)) {}
    int i3;
    for (;;)
    {
      paramu.G(c);
      return null;
      i3 = b + i2;
      if (i3 <= c) {
        break;
      }
      v5.m.f("Id3Decoder", "Frame size exceeds remaining tag data");
    }
    if ((parama != null) && (!parama.d(paramInt1, i, j, k, m)))
    {
      paramu.G(i3);
      return null;
    }
    int i4 = i1;
    int i5;
    if (paramInt1 == 3)
    {
      if ((i4 & 0x80) != 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i4 & 0x40) != 0) {
        n = 1;
      } else {
        n = 0;
      }
      if ((i4 & 0x20) != 0) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      i5 = i1;
    }
    else
    {
      if (paramInt1 == 4)
      {
        if ((i4 & 0x40) != 0) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i4 & 0x8) != 0) {
          n = 1;
        } else {
          n = 0;
        }
        if ((i4 & 0x4) != 0) {
          i5 = 1;
        } else {
          i5 = 0;
        }
        if ((i4 & 0x2) != 0) {
          i6 = 1;
        } else {
          i6 = 0;
        }
        if ((i4 & 0x1) != 0)
        {
          i4 = 1;
          i7 = i1;
          i1 = i5;
          break label457;
        }
        i4 = 0;
        i7 = i1;
        i1 = i5;
        break label457;
      }
      i4 = 0;
      i1 = 0;
      n = 0;
      i5 = 0;
    }
    int i6 = 0;
    int i7 = n;
    int n = i1;
    int i1 = i7;
    i7 = i4;
    i4 = i5;
    label457:
    if ((n == 0) && (i1 == 0))
    {
      i1 = i2;
      if (i7 != 0)
      {
        i1 = i2 - 1;
        paramu.H(1);
      }
      n = i1;
      if (i4 != 0)
      {
        n = i1 - 4;
        paramu.H(4);
      }
      i1 = n;
      if (i6 != 0) {
        i1 = R(n, paramu);
      }
      if ((i == 84) && (j == 88) && (k == 88) && ((paramInt1 == 2) || (m == 88)))
      {
        if (i1 >= 1) {
          try
          {
            paramInt2 = paramu.v();
            n = i1 - 1;
            parama = new byte[n];
            paramu.d(parama, 0, n);
            n = P(parama, 0, paramInt2);
            localObject = new java/lang/String;
            ((String)localObject).<init>(parama, 0, n, N(paramInt2));
            parama = new l("TXXX", (String)localObject, L(parama, paramInt2, M(paramInt2) + n));
          }
          finally
          {
            break label1464;
          }
        }
      }
      else if (i == 84)
      {
        parama = O(paramInt1, i, j, k, m);
        if (i1 >= 1)
        {
          paramInt2 = paramu.v();
          n = i1 - 1;
          localObject = new byte[n];
          paramu.d((byte[])localObject, 0, n);
          parama = new l(parama, null, L((byte[])localObject, paramInt2, 0));
          break label1386;
        }
      }
      else
      {
        if ((i != 87) || (j != 88) || (k != 88) || ((paramInt1 != 2) && (m != 88))) {
          break label873;
        }
        if (i1 >= 1) {
          break label780;
        }
      }
      parama = null;
      break label1386;
      label780:
      paramInt2 = paramu.v();
      n = i1 - 1;
      Object localObject = new byte[n];
      paramu.d((byte[])localObject, 0, n);
      n = P((byte[])localObject, 0, paramInt2);
      parama = new java/lang/String;
      parama.<init>((byte[])localObject, 0, n, N(paramInt2));
      paramInt2 = M(paramInt2) + n;
      parama = new m("WXXX", parama, K((byte[])localObject, paramInt2, Q((byte[])localObject, paramInt2), n7.d.b));
      break label947;
      label873:
      if (i == 87)
      {
        localObject = O(paramInt1, i, j, k, m);
        byte[] arrayOfByte = new byte[i1];
        paramu.d(arrayOfByte, 0, i1);
        paramInt2 = Q(arrayOfByte, 0);
        parama = new java/lang/String;
        parama.<init>(arrayOfByte, 0, paramInt2, n7.d.b);
        parama = new m((String)localObject, null, parama);
      }
      for (;;)
      {
        label947:
        break;
        if ((i == 80) && (j == 82) && (k == 73) && (m == 86))
        {
          parama = new byte[i1];
          paramu.d(parama, 0, i1);
          paramInt2 = Q(parama, 0);
          localObject = new java/lang/String;
          ((String)localObject).<init>(parama, 0, paramInt2, n7.d.b);
          paramInt2++;
          if (i1 <= paramInt2) {
            parama = e0.f;
          } else {
            parama = Arrays.copyOfRange(parama, paramInt2, i1);
          }
          parama = new k((String)localObject, parama);
        }
        else if ((i == 71) && (j == 69) && (k == 79) && ((m == 66) || (paramInt1 == 2)))
        {
          parama = I(i1, paramu);
        }
        else if (paramInt1 == 2 ? (i == 80) && (j == 73) && (k == 67) : (i == 65) && (j == 80) && (k == 73) && (m == 67))
        {
          parama = D(i1, paramInt1, paramu);
        }
        else if ((i == 67) && (j == 79) && (k == 77) && ((m == 77) || (paramInt1 == 2)))
        {
          parama = G(i1, paramu);
        }
        else if ((i == 67) && (j == 72) && (k == 65) && (m == 80))
        {
          parama = E(paramu, i1, paramInt1, paramBoolean, paramInt2, parama);
        }
        else if ((i == 67) && (j == 84) && (k == 79) && (m == 67))
        {
          parama = F(paramu, i1, paramInt1, paramBoolean, paramInt2, parama);
        }
        else if ((i == 77) && (j == 76) && (k == 76) && (m == 84))
        {
          parama = J(i1, paramu);
        }
        else
        {
          parama = O(paramInt1, i, j, k, m);
          localObject = new byte[i1];
          paramu.d((byte[])localObject, 0, i1);
          parama = new b(parama, (byte[])localObject);
        }
      }
      label1386:
      if (parama == null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Failed to decode frame: id=");
        ((StringBuilder)localObject).append(O(paramInt1, i, j, k, m));
        ((StringBuilder)localObject).append(", frameSize=");
        ((StringBuilder)localObject).append(i1);
        v5.m.f("Id3Decoder", ((StringBuilder)localObject).toString());
      }
      paramu.G(i3);
      return parama;
      label1464:
      paramu.G(i3);
      throw parama;
    }
    v5.m.f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
    paramu.G(i3);
    return null;
  }
  
  public static f I(int paramInt, u paramu)
  {
    int i = paramu.v();
    Object localObject = N(i);
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramu.d(arrayOfByte, 0, paramInt);
    int j = Q(arrayOfByte, 0);
    String str1 = new String(arrayOfByte, 0, j, n7.d.b);
    int k = j + 1;
    j = P(arrayOfByte, k, i);
    String str2 = K(arrayOfByte, k, j, (Charset)localObject);
    j = M(i) + j;
    k = P(arrayOfByte, j, i);
    localObject = K(arrayOfByte, j, k, (Charset)localObject);
    i = M(i) + k;
    if (paramInt <= i) {
      paramu = e0.f;
    } else {
      paramu = Arrays.copyOfRange(arrayOfByte, i, paramInt);
    }
    return new f(str1, str2, (String)localObject, paramu);
  }
  
  public static j J(int paramInt, u paramu)
  {
    int i = paramu.A();
    int j = paramu.x();
    int k = paramu.x();
    int m = paramu.v();
    int n = paramu.v();
    v5.t localt = new v5.t();
    localt.j(a, c);
    localt.k(b * 8);
    int i1 = (paramInt - 10) * 8 / (m + n);
    paramu = new int[i1];
    int[] arrayOfInt = new int[i1];
    for (paramInt = 0; paramInt < i1; paramInt++)
    {
      int i2 = localt.g(m);
      int i3 = localt.g(n);
      paramu[paramInt] = i2;
      arrayOfInt[paramInt] = i3;
    }
    return new j(i, j, paramu, arrayOfInt, k);
  }
  
  public static String K(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Charset paramCharset)
  {
    if ((paramInt2 > paramInt1) && (paramInt2 <= paramArrayOfByte.length)) {
      return new String(paramArrayOfByte, paramInt1, paramInt2 - paramInt1, paramCharset);
    }
    return "";
  }
  
  public static l0 L(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= paramArrayOfByte.length) {
      return o7.t.t("");
    }
    Object localObject = o7.t.b;
    localObject = new t.a();
    for (;;)
    {
      int i = P(paramArrayOfByte, paramInt2, paramInt1);
      if (paramInt2 >= i) {
        break;
      }
      ((t.a)localObject).c(new String(paramArrayOfByte, paramInt2, i - paramInt2, N(paramInt1)));
      paramInt2 = M(paramInt1) + i;
    }
    localObject = ((t.a)localObject).e();
    paramArrayOfByte = (byte[])localObject;
    if (((AbstractCollection)localObject).isEmpty()) {
      paramArrayOfByte = o7.t.t("");
    }
    return paramArrayOfByte;
  }
  
  public static int M(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 3)) {
      paramInt = 2;
    } else {
      paramInt = 1;
    }
    return paramInt;
  }
  
  public static Charset N(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return n7.d.b;
        }
        return n7.d.c;
      }
      return n7.d.d;
    }
    return n7.d.f;
  }
  
  public static String O(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    String str;
    if (paramInt1 == 2) {
      str = String.format(Locale.US, "%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    } else {
      str = String.format(Locale.US, "%c%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
    }
    return str;
  }
  
  public static int P(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = Q(paramArrayOfByte, paramInt1);
    if (paramInt2 != 0)
    {
      int j = i;
      if (paramInt2 != 3)
      {
        while (j < paramArrayOfByte.length - 1)
        {
          if (((j - paramInt1) % 2 == 0) && (paramArrayOfByte[(j + 1)] == 0)) {
            return j;
          }
          j = Q(paramArrayOfByte, j + 1);
        }
        return paramArrayOfByte.length;
      }
    }
    return i;
  }
  
  public static int Q(byte[] paramArrayOfByte, int paramInt)
  {
    while (paramInt < paramArrayOfByte.length)
    {
      if (paramArrayOfByte[paramInt] == 0) {
        return paramInt;
      }
      paramInt++;
    }
    return paramArrayOfByte.length;
  }
  
  public static int R(int paramInt, u paramu)
  {
    byte[] arrayOfByte = a;
    int i = b;
    int j = i;
    for (;;)
    {
      int k = j + 1;
      if (k >= i + paramInt) {
        break;
      }
      int m = paramInt;
      if ((arrayOfByte[j] & 0xFF) == 255)
      {
        m = paramInt;
        if (arrayOfByte[k] == 0)
        {
          System.arraycopy(arrayOfByte, j + 2, arrayOfByte, k, paramInt - (j - i) - 2);
          m = paramInt - 1;
        }
      }
      j = k;
      paramInt = m;
    }
    return paramInt;
  }
  
  public static boolean S(u paramu, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = b;
    try
    {
      for (;;)
      {
        int j = c;
        int k = b;
        int m = 1;
        if (j - k < paramInt2) {
          break;
        }
        long l1;
        if (paramInt1 >= 3)
        {
          k = paramu.f();
          l1 = paramu.w();
          n = paramu.A();
        }
        else
        {
          k = paramu.x();
          j = paramu.x();
          l1 = j;
          n = 0;
        }
        if ((k == 0) && (l1 == 0L) && (n == 0)) {
          return true;
        }
        long l2 = l1;
        if (paramInt1 == 4)
        {
          l2 = l1;
          if (!paramBoolean)
          {
            if ((0x808080 & l1) != 0L) {
              return false;
            }
            l2 = (l1 >> 24 & 0xFF) << 21 | l1 & 0xFF | (l1 >> 8 & 0xFF) << 7 | (l1 >> 16 & 0xFF) << 14;
          }
        }
        if (paramInt1 == 4)
        {
          if ((n & 0x40) != 0) {
            k = 1;
          } else {
            k = 0;
          }
          j = k;
          if ((n & 0x1) != 0)
          {
            j = m;
            break label287;
          }
        }
        else
        {
          if (paramInt1 != 3) {
            break label280;
          }
          if ((n & 0x20) != 0) {
            k = 1;
          } else {
            k = 0;
          }
          j = k;
          if ((n & 0x80) != 0)
          {
            j = m;
            break label287;
          }
        }
        int n = 0;
        k = j;
        j = n;
        break label287;
        label280:
        k = 0;
        j = k;
        label287:
        n = k;
        if (j != 0) {
          n = k + 4;
        }
        if (l2 < n) {
          return false;
        }
        k = c;
        j = b;
        if (k - j < l2) {
          return false;
        }
        k = (int)l2;
        paramu.H(k);
      }
      return true;
    }
    finally
    {
      paramu.G(i);
    }
  }
  
  public final p4.a C(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = new ArrayList();
    u localu = new u(paramArrayOfByte, paramInt);
    int i = c;
    paramInt = b;
    int j = 10;
    boolean bool1 = true;
    boolean bool2;
    if (i - paramInt < 10)
    {
      paramArrayOfByte = "Data too short to be an ID3 tag";
    }
    else
    {
      paramInt = localu.x();
      if (paramInt != 4801587)
      {
        paramArrayOfByte = f.l("Unexpected first three bytes of ID3 tag header: 0x");
        paramArrayOfByte.append(String.format("%06X", new Object[] { Integer.valueOf(paramInt) }));
      }
      else
      {
        k = localu.v();
        localu.H(1);
        int m = localu.v();
        n = localu.u();
        if (k == 2)
        {
          if ((m & 0x40) != 0) {
            i = 1;
          } else {
            i = 0;
          }
          paramInt = n;
          if (i != 0)
          {
            paramArrayOfByte = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
            break label366;
          }
        }
        else if (k == 3)
        {
          if ((m & 0x40) != 0) {
            i = 1;
          } else {
            i = 0;
          }
          paramInt = n;
          if (i != 0)
          {
            paramInt = localu.f();
            localu.H(paramInt);
            paramInt = n - (paramInt + 4);
          }
        }
        else
        {
          if (k != 4) {
            break label338;
          }
          if ((m & 0x40) != 0) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
          i = n;
          if (paramInt != 0)
          {
            paramInt = localu.u();
            localu.H(paramInt - 4);
            i = n - paramInt;
          }
          if ((m & 0x10) != 0) {
            n = 1;
          } else {
            n = 0;
          }
          paramInt = i;
          if (n != 0) {
            paramInt = i - 10;
          }
        }
        if ((k < 4) && ((m & 0x80) != 0)) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        paramArrayOfByte = new b(k, paramInt, bool2);
        break label374;
        label338:
        paramArrayOfByte = new StringBuilder();
        paramArrayOfByte.append("Skipped ID3 tag with unsupported majorVersion=");
        paramArrayOfByte.append(k);
      }
      paramArrayOfByte = paramArrayOfByte.toString();
    }
    label366:
    v5.m.f("Id3Decoder", paramArrayOfByte);
    paramArrayOfByte = null;
    label374:
    if (paramArrayOfByte == null) {
      return null;
    }
    int k = b;
    paramInt = j;
    if (a == 2) {
      paramInt = 6;
    }
    int n = c;
    i = n;
    if (b) {
      i = R(n, localu);
    }
    localu.F(k + i);
    if (!S(localu, a, paramInt, false))
    {
      if ((a == 4) && (S(localu, 4, paramInt, true)))
      {
        bool2 = bool1;
      }
      else
      {
        localObject = f.l("Failed to validate ID3 tag with majorVersion=");
        ((StringBuilder)localObject).append(a);
        v5.m.f("Id3Decoder", ((StringBuilder)localObject).toString());
        return null;
      }
    }
    else {
      bool2 = false;
    }
    while (c - b >= paramInt)
    {
      h localh = H(a, localu, bool2, paramInt, b);
      if (localh != null) {
        ((ArrayList)localObject).add(localh);
      }
    }
    return new p4.a((List)localObject);
  }
  
  public final p4.a i(p4.d paramd, ByteBuffer paramByteBuffer)
  {
    return C(paramByteBuffer.array(), paramByteBuffer.limit());
  }
  
  public static abstract interface a
  {
    public abstract boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  }
  
  public static final class b
  {
    public final int a;
    public final boolean b;
    public final int c;
    
    public b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      a = paramInt1;
      b = paramBoolean;
      c = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     u4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */