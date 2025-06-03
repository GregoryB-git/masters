package F0;

import X2.v;
import android.util.Base64;
import d0.A;
import d0.x;
import g0.M;
import g0.o;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class W
{
  public static int[] a(int paramInt)
  {
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 6)
        {
          if (paramInt != 7)
          {
            if (paramInt != 8) {
              return null;
            }
            return new int[] { 0, 2, 1, 7, 5, 6, 3, 4 };
          }
          return new int[] { 0, 2, 1, 6, 5, 3, 4 };
        }
        return new int[] { 0, 2, 1, 5, 3, 4 };
      }
      return new int[] { 0, 2, 1, 3, 4 };
    }
    return new int[] { 0, 2, 1 };
  }
  
  public static int b(int paramInt)
  {
    int i = 0;
    while (paramInt > 0)
    {
      i++;
      paramInt >>>= 1;
    }
    return i;
  }
  
  public static long c(long paramLong1, long paramLong2)
  {
    return Math.floor(Math.pow(paramLong1, 1.0D / paramLong2));
  }
  
  public static x d(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject1 = (String)paramList.get(i);
      Object localObject2 = M.c1((String)localObject1, "=");
      if (localObject2.length != 2)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Failed to parse Vorbis comment: ");
        ((StringBuilder)localObject2).append((String)localObject1);
        o.h("VorbisUtil", ((StringBuilder)localObject2).toString());
      }
      else if (localObject2[0].equals("METADATA_BLOCK_PICTURE"))
      {
        try
        {
          localObject2 = Base64.decode(localObject2[1], 0);
          localObject1 = new g0/z;
          ((z)localObject1).<init>((byte[])localObject2);
          localArrayList.add(R0.a.a((z)localObject1));
        }
        catch (RuntimeException localRuntimeException)
        {
          o.i("VorbisUtil", "Failed to parse vorbis picture", localRuntimeException);
        }
      }
      else
      {
        localArrayList.add(new W0.a(localObject2[0], localObject2[1]));
      }
    }
    if (localArrayList.isEmpty()) {
      paramList = null;
    } else {
      paramList = new x(localArrayList);
    }
    return paramList;
  }
  
  public static v e(byte[] paramArrayOfByte)
  {
    Object localObject = new z(paramArrayOfByte);
    ((z)localObject).U(1);
    int i = 0;
    while ((((z)localObject).a() > 0) && (((z)localObject).j() == 255))
    {
      i += 255;
      ((z)localObject).U(1);
    }
    int j = i + ((z)localObject).G();
    i = 0;
    while ((((z)localObject).a() > 0) && (((z)localObject).j() == 255))
    {
      i += 255;
      ((z)localObject).U(1);
    }
    int k = ((z)localObject).G();
    byte[] arrayOfByte = new byte[j];
    int m = ((z)localObject).f();
    System.arraycopy(paramArrayOfByte, m, arrayOfByte, 0, j);
    i = m + j + (i + k);
    j = paramArrayOfByte.length - i;
    localObject = new byte[j];
    System.arraycopy(paramArrayOfByte, i, localObject, 0, j);
    return v.a0(arrayOfByte, localObject);
  }
  
  public static void f(V paramV)
  {
    int i = paramV.d(6);
    for (int j = 0; j < i + 1; j++)
    {
      int k = paramV.d(16);
      if (k != 0)
      {
        if (k == 1)
        {
          int m = paramV.d(5);
          int[] arrayOfInt1 = new int[m];
          n = -1;
          k = 0;
          while (k < m)
          {
            i1 = paramV.d(4);
            arrayOfInt1[k] = i1;
            i2 = n;
            if (i1 > n) {
              i2 = i1;
            }
            k++;
            n = i2;
          }
          int i2 = n + 1;
          int[] arrayOfInt2 = new int[i2];
          for (k = 0; k < i2; k++)
          {
            arrayOfInt2[k] = (paramV.d(3) + 1);
            i1 = paramV.d(2);
            if (i1 > 0) {
              paramV.e(8);
            }
            for (n = 0; n < 1 << i1; n++) {
              paramV.e(8);
            }
          }
          paramV.e(2);
          int i3 = paramV.d(4);
          int i1 = 0;
          k = i1;
          n = k;
          i2 = k;
          for (k = i1; k < m; k++)
          {
            i2 += arrayOfInt2[arrayOfInt1[k]];
            while (n < i2)
            {
              paramV.e(i3);
              n++;
            }
          }
        }
        paramV = new StringBuilder();
        paramV.append("floor type greater than 1 not decodable: ");
        paramV.append(k);
        throw A.a(paramV.toString(), null);
      }
      paramV.e(8);
      paramV.e(16);
      paramV.e(16);
      paramV.e(6);
      paramV.e(8);
      int n = paramV.d(4);
      for (k = 0; k < n + 1; k++) {
        paramV.e(8);
      }
    }
  }
  
  public static void g(int paramInt, V paramV)
  {
    int i = paramV.d(6);
    int j = 0;
    while (j < i + 1)
    {
      int k = paramV.d(16);
      if (k != 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("mapping type other than 0 not supported: ");
        localStringBuilder.append(k);
        o.c("VorbisUtil", localStringBuilder.toString());
      }
      else
      {
        if (paramV.c()) {
          k = paramV.d(4) + 1;
        } else {
          k = 1;
        }
        if (paramV.c())
        {
          int m = paramV.d(8);
          for (n = 0; n < m + 1; n++)
          {
            int i1 = paramInt - 1;
            paramV.e(b(i1));
            paramV.e(b(i1));
          }
        }
        if (paramV.d(2) != 0) {
          break label219;
        }
        if (k > 1) {
          for (n = 0; n < paramInt; n++) {
            paramV.e(4);
          }
        }
        for (int n = 0; n < k; n++)
        {
          paramV.e(8);
          paramV.e(8);
          paramV.e(8);
        }
      }
      j++;
      continue;
      label219:
      throw A.a("to reserved bits must be zero after mapping coupling steps", null);
    }
  }
  
  public static b[] h(V paramV)
  {
    int i = paramV.d(6) + 1;
    b[] arrayOfb = new b[i];
    for (int j = 0; j < i; j++) {
      arrayOfb[j] = new b(paramV.c(), paramV.d(16), paramV.d(16), paramV.d(8));
    }
    return arrayOfb;
  }
  
  public static void i(V paramV)
  {
    int i = paramV.d(6);
    int j = 0;
    while (j < i + 1) {
      if (paramV.d(16) <= 2)
      {
        paramV.e(24);
        paramV.e(24);
        paramV.e(24);
        int k = paramV.d(6) + 1;
        paramV.e(8);
        int[] arrayOfInt = new int[k];
        int i1;
        for (int m = 0; m < k; m++)
        {
          int n = paramV.d(3);
          if (paramV.c()) {
            i1 = paramV.d(5);
          } else {
            i1 = 0;
          }
          arrayOfInt[m] = (i1 * 8 + n);
        }
        for (m = 0; m < k; m++) {
          for (i1 = 0; i1 < 8; i1++) {
            if ((arrayOfInt[m] & 1 << i1) != 0) {
              paramV.e(8);
            }
          }
        }
        j++;
      }
      else
      {
        throw A.a("residueType greater than 2 is not decodable", null);
      }
    }
  }
  
  public static a j(z paramz)
  {
    return k(paramz, true, true);
  }
  
  public static a k(z paramz, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    if (paramBoolean1) {
      o(3, paramz, false);
    }
    String str1 = paramz.D((int)paramz.w());
    int j = str1.length();
    long l = paramz.w();
    String[] arrayOfString = new String[(int)l];
    j += 15;
    while (i < l)
    {
      String str2 = paramz.D((int)paramz.w());
      arrayOfString[i] = str2;
      j = j + 4 + str2.length();
      i++;
    }
    if ((paramBoolean2) && ((paramz.G() & 0x1) == 0)) {
      throw A.a("framing bit expected to be set", null);
    }
    return new a(str1, arrayOfString, j + 1);
  }
  
  public static c l(z paramz)
  {
    boolean bool = true;
    o(1, paramz, false);
    int i = paramz.x();
    int j = paramz.G();
    int k = paramz.x();
    int m = paramz.t();
    int n = m;
    if (m <= 0) {
      n = -1;
    }
    int i1 = paramz.t();
    m = i1;
    if (i1 <= 0) {
      m = -1;
    }
    int i2 = paramz.t();
    i1 = i2;
    if (i2 <= 0) {
      i1 = -1;
    }
    int i3 = paramz.G();
    i2 = (int)Math.pow(2.0D, i3 & 0xF);
    i3 = (int)Math.pow(2.0D, (i3 & 0xF0) >> 4);
    if ((paramz.G() & 0x1) <= 0) {
      bool = false;
    }
    return new c(i, j, k, n, m, i1, i2, i3, bool, Arrays.copyOf(paramz.e(), paramz.g()));
  }
  
  public static b[] m(z paramz, int paramInt)
  {
    int i = 0;
    o(5, paramz, false);
    int j = paramz.G();
    V localV = new V(paramz.e());
    localV.e(paramz.f() * 8);
    for (int k = 0; k < j + 1; k++) {
      n(localV);
    }
    j = localV.d(6);
    k = i;
    while (k < j + 1) {
      if (localV.d(16) == 0) {
        k++;
      } else {
        throw A.a("placeholder of time domain transforms not zeroed out", null);
      }
    }
    f(localV);
    i(localV);
    g(paramInt, localV);
    paramz = h(localV);
    if (localV.c()) {
      return paramz;
    }
    throw A.a("framing bit after modes not set as expected", null);
  }
  
  public static void n(V paramV)
  {
    if (paramV.d(24) == 5653314)
    {
      int i = paramV.d(16);
      int j = paramV.d(24);
      boolean bool = paramV.c();
      int k = 0;
      int m = 0;
      if (!bool)
      {
        bool = paramV.c();
        while (m < j)
        {
          if ((!bool) || (paramV.c())) {
            paramV.e(5);
          }
          m++;
        }
      }
      paramV.e(5);
      m = k;
      while (m < j) {
        m += paramV.d(b(j - m));
      }
      m = paramV.d(4);
      if (m <= 2)
      {
        if ((m == 1) || (m == 2))
        {
          paramV.e(32);
          paramV.e(32);
          k = paramV.d(4);
          paramV.e(1);
          long l;
          if (m == 1)
          {
            if (i != 0) {
              l = c(j, i);
            } else {
              l = 0L;
            }
          }
          else
          {
            l = j;
            l = i * l;
          }
          paramV.e((int)(l * (k + 1)));
        }
        return;
      }
      paramV = new StringBuilder();
      paramV.append("lookup type greater than 2 not decodable: ");
      paramV.append(m);
      throw A.a(paramV.toString(), null);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("expected code book to start with [0x56, 0x43, 0x42] at ");
    localStringBuilder.append(paramV.b());
    throw A.a(localStringBuilder.toString(), null);
  }
  
  public static boolean o(int paramInt, z paramz, boolean paramBoolean)
  {
    if (paramz.a() < 7)
    {
      if (paramBoolean) {
        return false;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("too short header: ");
      localStringBuilder.append(paramz.a());
      throw A.a(localStringBuilder.toString(), null);
    }
    if (paramz.G() != paramInt)
    {
      if (paramBoolean) {
        return false;
      }
      paramz = new StringBuilder();
      paramz.append("expected header type ");
      paramz.append(Integer.toHexString(paramInt));
      throw A.a(paramz.toString(), null);
    }
    if ((paramz.G() == 118) && (paramz.G() == 111) && (paramz.G() == 114) && (paramz.G() == 98) && (paramz.G() == 105) && (paramz.G() == 115)) {
      return true;
    }
    if (paramBoolean) {
      return false;
    }
    throw A.a("expected characters 'vorbis'", null);
  }
  
  public static final class a
  {
    public final String a;
    public final String[] b;
    public final int c;
    
    public a(String paramString, String[] paramArrayOfString, int paramInt)
    {
      a = paramString;
      b = paramArrayOfString;
      c = paramInt;
    }
  }
  
  public static final class b
  {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    
    public b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramBoolean;
      b = paramInt1;
      c = paramInt2;
      d = paramInt3;
    }
  }
  
  public static final class c
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final byte[] j;
    
    public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, byte[] paramArrayOfByte)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramInt6;
      g = paramInt7;
      h = paramInt8;
      i = paramBoolean;
      j = paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     F0.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */