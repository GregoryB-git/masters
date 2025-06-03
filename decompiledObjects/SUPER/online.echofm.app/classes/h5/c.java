package h5;

import V4.h;
import g5.c.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class c
{
  public static final int[] a = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1 };
  
  public static void a(String paramString1, Y4.a parama, String paramString2)
  {
    try
    {
      paramString1 = paramString1.getBytes(paramString2);
      int i = paramString1.length;
      for (int j = 0; j < i; j++) {
        parama.d(paramString1[j], 8);
      }
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new h(paramString1);
    }
  }
  
  public static void b(CharSequence paramCharSequence, Y4.a parama)
  {
    int i = paramCharSequence.length();
    int j = 0;
    while (j < i)
    {
      int k = p(paramCharSequence.charAt(j));
      if (k != -1)
      {
        int m = j + 1;
        if (m < i)
        {
          m = p(paramCharSequence.charAt(m));
          if (m != -1)
          {
            parama.d(k * 45 + m, 11);
            j += 2;
          }
          else
          {
            throw new h();
          }
        }
        else
        {
          parama.d(k, 6);
          j = m;
        }
      }
      else
      {
        throw new h();
      }
    }
  }
  
  public static void c(String paramString1, g5.b paramb, Y4.a parama, String paramString2)
  {
    int i = a.a[paramb.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4)
          {
            e(paramString1, parama);
            return;
          }
          throw new h("Invalid mode: ".concat(String.valueOf(paramb)));
        }
        a(paramString1, parama, paramString2);
        return;
      }
      b(paramString1, parama);
      return;
    }
    h(paramString1, parama);
  }
  
  public static void d(Y4.c paramc, Y4.a parama)
  {
    parama.d(g5.b.v.c(), 4);
    parama.d(paramc.e(), 8);
  }
  
  public static void e(String paramString, Y4.a parama)
  {
    try
    {
      paramString = paramString.getBytes("Shift_JIS");
      int i = paramString.length;
      int j = 0;
      while (j < i)
      {
        int k = (paramString[j] & 0xFF) << 8 | paramString[(j + 1)] & 0xFF;
        int m = 33088;
        if ((k >= 33088) && (k <= 40956)) {}
        for (;;)
        {
          m = k - m;
          break label91;
          if ((k < 57408) || (k > 60351)) {
            break;
          }
          m = 49472;
        }
        m = -1;
        label91:
        if (m != -1)
        {
          parama.d((m >> 8) * 192 + (m & 0xFF), 13);
          j += 2;
        }
        else
        {
          throw new h("Invalid byte sequence");
        }
      }
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new h(paramString);
    }
  }
  
  public static void f(int paramInt, g5.c paramc, g5.b paramb, Y4.a parama)
  {
    int i = paramb.e(paramc);
    int j = 1 << i;
    if (paramInt < j)
    {
      parama.d(paramInt, i);
      return;
    }
    paramc = new StringBuilder();
    paramc.append(paramInt);
    paramc.append(" is bigger than ");
    paramc.append(j - 1);
    throw new h(paramc.toString());
  }
  
  public static void g(g5.b paramb, Y4.a parama)
  {
    parama.d(paramb.c(), 4);
  }
  
  public static void h(CharSequence paramCharSequence, Y4.a parama)
  {
    int i = paramCharSequence.length();
    int j = 0;
    while (j < i)
    {
      int k = paramCharSequence.charAt(j) - '0';
      int m = j + 2;
      if (m < i)
      {
        parama.d(k * 100 + (paramCharSequence.charAt(j + 1) - '0') * 10 + (paramCharSequence.charAt(m) - '0'), 10);
        j += 3;
      }
      else
      {
        j++;
        if (j < i)
        {
          parama.d(k * 10 + (paramCharSequence.charAt(j) - '0'), 7);
          j = m;
        }
        else
        {
          parama.d(k, 4);
        }
      }
    }
  }
  
  public static int i(g5.b paramb, Y4.a parama1, Y4.a parama2, g5.c paramc)
  {
    return parama1.l() + paramb.e(paramc) + parama2.l();
  }
  
  public static int j(b paramb)
  {
    return d.a(paramb) + d.c(paramb) + d.d(paramb) + d.e(paramb);
  }
  
  public static int k(Y4.a parama, g5.a parama1, g5.c paramc, b paramb)
  {
    int i = Integer.MAX_VALUE;
    int j = -1;
    int k = 0;
    while (k < 8)
    {
      e.a(parama, parama1, paramc, k, paramb);
      int m = j(paramb);
      int n = i;
      if (m < i)
      {
        j = k;
        n = m;
      }
      k++;
      i = n;
    }
    return j;
  }
  
  public static g5.b l(String paramString1, String paramString2)
  {
    if (("Shift_JIS".equals(paramString2)) && (s(paramString1))) {
      return g5.b.w;
    }
    int i = 0;
    int j = 0;
    int k = j;
    while (i < paramString1.length())
    {
      int m = paramString1.charAt(i);
      if ((m >= 48) && (m <= 57))
      {
        k = 1;
      }
      else
      {
        if (p(m) == -1) {
          break label79;
        }
        j = 1;
      }
      i++;
      continue;
      label79:
      return g5.b.u;
    }
    if (j != 0) {
      return g5.b.s;
    }
    if (k != 0) {
      return g5.b.r;
    }
    return g5.b.u;
  }
  
  public static g5.c m(int paramInt, g5.a parama)
  {
    for (int i = 1; i <= 40; i++)
    {
      g5.c localc = g5.c.e(i);
      if (v(paramInt, localc, parama)) {
        return localc;
      }
    }
    throw new h("Data too big");
  }
  
  public static f n(String paramString, g5.a parama, Map paramMap)
  {
    if ((paramMap != null) && (paramMap.containsKey(V4.c.p))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject1 = paramMap.get(V4.c.p).toString();
    } else {
      localObject1 = "ISO-8859-1";
    }
    Object localObject2 = l(paramString, (String)localObject1);
    Y4.a locala = new Y4.a();
    g5.b localb = g5.b.u;
    if ((localObject2 == localb) && (i != 0))
    {
      localObject3 = Y4.c.c((String)localObject1);
      if (localObject3 != null) {
        d((Y4.c)localObject3, locala);
      }
    }
    if (paramMap != null)
    {
      localObject3 = V4.c.z;
      if ((paramMap.containsKey(localObject3)) && (Boolean.valueOf(paramMap.get(localObject3).toString()).booleanValue())) {
        g(g5.b.x, locala);
      }
    }
    g((g5.b)localObject2, locala);
    Object localObject3 = new Y4.a();
    c(paramString, (g5.b)localObject2, (Y4.a)localObject3, (String)localObject1);
    if (paramMap != null)
    {
      localObject1 = V4.c.y;
      if (paramMap.containsKey(localObject1))
      {
        paramMap = g5.c.e(Integer.parseInt(paramMap.get(localObject1).toString()));
        if (v(i((g5.b)localObject2, locala, (Y4.a)localObject3, paramMap), paramMap, parama)) {
          break label254;
        }
        throw new h("Data too big for requested version");
      }
    }
    paramMap = t(parama, (g5.b)localObject2, locala, (Y4.a)localObject3);
    label254:
    Object localObject1 = new Y4.a();
    ((Y4.a)localObject1).b(locala);
    if (localObject2 == localb) {
      i = ((Y4.a)localObject3).n();
    } else {
      i = paramString.length();
    }
    f(i, paramMap, (g5.b)localObject2, (Y4.a)localObject1);
    ((Y4.a)localObject1).b((Y4.a)localObject3);
    paramString = paramMap.c(parama);
    int i = paramMap.d() - paramString.d();
    u(i, (Y4.a)localObject1);
    paramString = r((Y4.a)localObject1, paramMap.d(), i, paramString.c());
    localObject1 = new f();
    ((f)localObject1).c(parama);
    ((f)localObject1).f((g5.b)localObject2);
    ((f)localObject1).g(paramMap);
    i = paramMap.b();
    localObject2 = new b(i, i);
    i = k(paramString, parama, paramMap, (b)localObject2);
    ((f)localObject1).d(i);
    e.a(paramString, parama, paramMap, i, (b)localObject2);
    ((f)localObject1).e((b)localObject2);
    return (f)localObject1;
  }
  
  public static byte[] o(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int[] arrayOfInt = new int[i + paramInt];
    int j = 0;
    for (int k = 0; k < i; k++) {
      paramArrayOfByte[k] &= 0xFF;
    }
    new Z4.c(Z4.a.l).b(arrayOfInt, paramInt);
    paramArrayOfByte = new byte[paramInt];
    for (k = j; k < paramInt; k++) {
      paramArrayOfByte[k] = ((byte)(byte)arrayOfInt[(i + k)]);
    }
    return paramArrayOfByte;
  }
  
  public static int p(int paramInt)
  {
    int[] arrayOfInt = a;
    if (paramInt < arrayOfInt.length) {
      return arrayOfInt[paramInt];
    }
    return -1;
  }
  
  public static void q(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramInt4 < paramInt3)
    {
      int i = paramInt1 % paramInt3;
      int j = paramInt3 - i;
      int k = paramInt1 / paramInt3;
      int m = paramInt2 / paramInt3;
      int n = m + 1;
      paramInt2 = k - m;
      k = k + 1 - n;
      if (paramInt2 == k)
      {
        if (paramInt3 == j + i)
        {
          if (paramInt1 == (m + paramInt2) * j + (n + k) * i)
          {
            if (paramInt4 < j)
            {
              paramArrayOfInt1[0] = m;
              paramArrayOfInt2[0] = paramInt2;
              return;
            }
            paramArrayOfInt1[0] = n;
            paramArrayOfInt2[0] = k;
            return;
          }
          throw new h("Total bytes mismatch");
        }
        throw new h("RS blocks mismatch");
      }
      throw new h("EC bytes mismatch");
    }
    throw new h("Block ID too large");
  }
  
  public static Y4.a r(Y4.a parama, int paramInt1, int paramInt2, int paramInt3)
  {
    if (parama.n() == paramInt2)
    {
      Object localObject1 = new ArrayList(paramInt3);
      int i = 0;
      int j = 0;
      int k = j;
      int m = k;
      int n = m;
      Object localObject2;
      Object localObject4;
      while (j < paramInt3)
      {
        localObject2 = new int[1];
        Object localObject3 = new int[1];
        q(paramInt1, paramInt2, paramInt3, j, (int[])localObject2, (int[])localObject3);
        int i1 = localObject2[0];
        localObject4 = new byte[i1];
        parama.p(k << 3, (byte[])localObject4, 0, i1);
        localObject3 = o((byte[])localObject4, localObject3[0]);
        ((Collection)localObject1).add(new a((byte[])localObject4, (byte[])localObject3));
        m = Math.max(m, i1);
        n = Math.max(n, localObject3.length);
        k += localObject2[0];
        j++;
      }
      if (paramInt2 == k)
      {
        parama = new Y4.a();
        for (paramInt3 = 0;; paramInt3++)
        {
          paramInt2 = i;
          if (paramInt3 >= m) {
            break;
          }
          localObject2 = ((Collection)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = ((a)((Iterator)localObject2).next()).a();
            if (paramInt3 < localObject4.length) {
              parama.d(localObject4[paramInt3], 8);
            }
          }
        }
        while (paramInt2 < n)
        {
          localObject4 = ((Collection)localObject1).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject2 = ((a)((Iterator)localObject4).next()).b();
            if (paramInt2 < localObject2.length) {
              parama.d(localObject2[paramInt2], 8);
            }
          }
          paramInt2++;
        }
        if (paramInt1 == parama.n()) {
          return parama;
        }
        localObject1 = new StringBuilder("Interleaving error: ");
        ((StringBuilder)localObject1).append(paramInt1);
        ((StringBuilder)localObject1).append(" and ");
        ((StringBuilder)localObject1).append(parama.n());
        ((StringBuilder)localObject1).append(" differ.");
        throw new h(((StringBuilder)localObject1).toString());
      }
      throw new h("Data bytes does not match offset");
    }
    throw new h("Number of bits and data bytes does not match");
  }
  
  public static boolean s(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("Shift_JIS");
      int i = paramString.length;
      if (i % 2 != 0) {
        return false;
      }
      int j = 0;
      while (j < i)
      {
        int k = paramString[j] & 0xFF;
        if (((k >= 129) && (k <= 159)) || ((k >= 224) && (k <= 235))) {
          j += 2;
        } else {
          return false;
        }
      }
      return true;
    }
    catch (UnsupportedEncodingException paramString) {}
    return false;
  }
  
  public static g5.c t(g5.a parama, g5.b paramb, Y4.a parama1, Y4.a parama2)
  {
    return m(i(paramb, parama1, parama2, m(i(paramb, parama1, parama2, g5.c.e(1)), parama)), parama);
  }
  
  public static void u(int paramInt, Y4.a parama)
  {
    int i = paramInt << 3;
    if (parama.l() <= i)
    {
      int j = 0;
      for (int k = 0; (k < 4) && (parama.l() < i); k++) {
        parama.a(false);
      }
      k = parama.l() & 0x7;
      if (k > 0) {
        while (k < 8)
        {
          parama.a(false);
          k++;
        }
      }
      int m = parama.n();
      for (k = j; k < paramInt - m; k++)
      {
        if ((k & 0x1) == 0) {
          j = 236;
        } else {
          j = 17;
        }
        parama.d(j, 8);
      }
      if (parama.l() == i) {
        return;
      }
      throw new h("Bits size does not equal capacity");
    }
    StringBuilder localStringBuilder = new StringBuilder("data bits cannot fit in the QR Code");
    localStringBuilder.append(parama.l());
    localStringBuilder.append(" > ");
    localStringBuilder.append(i);
    throw new h(localStringBuilder.toString());
  }
  
  public static boolean v(int paramInt, g5.c paramc, g5.a parama)
  {
    return paramc.d() - paramc.c(parama).d() >= (paramInt + 7) / 8;
  }
}

/* Location:
 * Qualified Name:     h5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */