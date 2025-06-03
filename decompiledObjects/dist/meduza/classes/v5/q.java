package v5;

import f;
import java.util.Arrays;

public final class q
{
  public static final byte[] a = { 0, 0, 0, 1 };
  public static final float[] b = { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F };
  public static final Object c = new Object();
  public static int[] d = new int[10];
  
  public static void a(boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    paramArrayOfBoolean[1] = false;
    paramArrayOfBoolean[2] = false;
  }
  
  public static int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    int i = paramInt2 - paramInt1;
    boolean bool1 = false;
    if (i >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.H(bool2);
    if (i == 0) {
      return paramInt2;
    }
    if (paramArrayOfBoolean[0] != 0)
    {
      a(paramArrayOfBoolean);
      return paramInt1 - 3;
    }
    if ((i > 1) && (paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[paramInt1] == 1))
    {
      a(paramArrayOfBoolean);
      return paramInt1 - 2;
    }
    if ((i > 2) && (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 1))
    {
      a(paramArrayOfBoolean);
      return paramInt1 - 1;
    }
    int j = paramInt2 - 1;
    paramInt1 += 2;
    while (paramInt1 < j)
    {
      int k = paramArrayOfByte[paramInt1];
      if ((k & 0xFE) == 0)
      {
        int m = paramInt1 - 2;
        if ((paramArrayOfByte[m] == 0) && (paramArrayOfByte[(paramInt1 - 1)] == 0) && (k == 1))
        {
          a(paramArrayOfBoolean);
          return m;
        }
        paramInt1 -= 2;
      }
      paramInt1 += 3;
    }
    if (i > 2)
    {
      if ((paramArrayOfByte[(paramInt2 - 3)] == 0) && (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[j] == 1)) {}
    }
    else {
      while (i == 2 ? (paramArrayOfBoolean[2] == 0) || (paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[j] != 1) : (paramArrayOfBoolean[1] == 0) || (paramArrayOfByte[j] != 1))
      {
        bool2 = false;
        break;
      }
    }
    boolean bool2 = true;
    paramArrayOfBoolean[0] = bool2;
    if (i > 1 ? (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[j] == 0) : (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[j] == 0)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    paramArrayOfBoolean[1] = bool2;
    bool2 = bool1;
    if (paramArrayOfByte[j] == 0) {
      bool2 = true;
    }
    paramArrayOfBoolean[2] = bool2;
    return paramInt2;
  }
  
  public static a c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    v localv = new v(paramArrayOfByte, paramInt1 + 2, paramInt2);
    localv.j(4);
    int i = localv.e(3);
    localv.i();
    int j = localv.e(2);
    boolean bool1 = localv.d();
    int k = localv.e(5);
    int m = 0;
    for (paramInt2 = 0; m < 32; paramInt2 = paramInt1)
    {
      paramInt1 = paramInt2;
      if (localv.d()) {
        paramInt1 = paramInt2 | 1 << m;
      }
      m++;
    }
    int[] arrayOfInt1 = new int[6];
    int n;
    for (paramInt1 = 0;; paramInt1++)
    {
      n = localv.e(8);
      if (paramInt1 >= 6) {
        break;
      }
      arrayOfInt1[paramInt1] = n;
    }
    paramInt1 = 0;
    for (int i1 = 0; i1 < i; i1++)
    {
      m = paramInt1;
      if (localv.d()) {
        m = paramInt1 + 89;
      }
      paramInt1 = m;
      if (localv.d()) {
        paramInt1 = m + 8;
      }
    }
    localv.j(paramInt1);
    if (i > 0) {
      localv.j((8 - i) * 2);
    }
    localv.f();
    int i2 = localv.f();
    if (i2 == 3) {
      localv.i();
    }
    int i3 = localv.f();
    i1 = localv.f();
    m = i3;
    paramInt1 = i1;
    if (localv.d())
    {
      i4 = localv.f();
      i5 = localv.f();
      i6 = localv.f();
      i7 = localv.f();
      if ((i2 != 1) && (i2 != 2)) {
        paramInt1 = 1;
      } else {
        paramInt1 = 2;
      }
      if (i2 == 1) {
        m = 2;
      } else {
        m = 1;
      }
      i3 -= (i4 + i5) * paramInt1;
      paramInt1 = i1 - (i6 + i7) * m;
      m = i3;
    }
    localv.f();
    localv.f();
    int i8 = localv.f();
    if (localv.d()) {
      i1 = 0;
    }
    for (i1 = i; i1 <= i; i1++)
    {
      localv.f();
      localv.f();
      localv.f();
    }
    localv.f();
    localv.f();
    localv.f();
    localv.f();
    localv.f();
    localv.f();
    if ((localv.d()) && (localv.d())) {
      for (i1 = 0; i1 < 4; i1++)
      {
        i = 0;
        while (i < 6)
        {
          if (!localv.d())
          {
            localv.f();
          }
          else
          {
            i6 = Math.min(64, 1 << (i1 << 1) + 4);
            if (i1 > 1) {
              localv.g();
            }
            for (i3 = 0; i3 < i6; i3++) {
              localv.g();
            }
          }
          if (i1 == 3) {
            i3 = 3;
          } else {
            i3 = 1;
          }
          i += i3;
        }
      }
    }
    localv.j(2);
    if (localv.d())
    {
      localv.j(8);
      localv.f();
      localv.f();
      localv.i();
    }
    i = localv.f();
    int i7 = 0;
    Object localObject = new int[0];
    paramArrayOfByte = new int[0];
    int i4 = -1;
    int i5 = -1;
    i3 = m;
    int i6 = paramInt2;
    while (i7 < i)
    {
      if ((i7 != 0) && (localv.d())) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      if (paramInt2 != 0)
      {
        int i9 = i4 + i5;
        int i10 = (1 - localv.d() * true) * (localv.f() + 1);
        m = i9 + 1;
        boolean[] arrayOfBoolean = new boolean[m];
        for (paramInt2 = 0; paramInt2 <= i9; paramInt2++) {
          if (!localv.d()) {
            arrayOfBoolean[paramInt2] = localv.d();
          } else {
            arrayOfBoolean[paramInt2] = true;
          }
        }
        int[] arrayOfInt2 = new int[m];
        int[] arrayOfInt3 = new int[m];
        m = i5 - 1;
        for (paramInt2 = 0; m >= 0; paramInt2 = i1)
        {
          i2 = paramArrayOfByte[m] + i10;
          i1 = paramInt2;
          if (i2 < 0)
          {
            i1 = paramInt2;
            if (arrayOfBoolean[(i4 + m)] != 0)
            {
              arrayOfInt2[paramInt2] = i2;
              i1 = paramInt2 + 1;
            }
          }
          m--;
        }
        m = paramInt2;
        if (i10 < 0)
        {
          m = paramInt2;
          if (arrayOfBoolean[i9] != 0)
          {
            arrayOfInt2[paramInt2] = i10;
            m = paramInt2 + 1;
          }
        }
        i1 = 0;
        paramInt2 = m;
        m = i1;
        while (m < i4)
        {
          i2 = localObject[m] + i10;
          i1 = paramInt2;
          if (i2 < 0)
          {
            i1 = paramInt2;
            if (arrayOfBoolean[m] != 0)
            {
              arrayOfInt2[paramInt2] = i2;
              i1 = paramInt2 + 1;
            }
          }
          m++;
          paramInt2 = i1;
        }
        arrayOfInt2 = Arrays.copyOf(arrayOfInt2, paramInt2);
        i2 = i4 - 1;
        for (m = 0; i2 >= 0; m = i1)
        {
          int i11 = localObject[i2] + i10;
          i1 = m;
          if (i11 > 0)
          {
            i1 = m;
            if (arrayOfBoolean[i2] != 0)
            {
              arrayOfInt3[m] = i11;
              i1 = m + 1;
            }
          }
          i2--;
        }
        i1 = m;
        if (i10 > 0)
        {
          i1 = m;
          if (arrayOfBoolean[i9] != 0)
          {
            arrayOfInt3[m] = i10;
            i1 = m + 1;
          }
        }
        i2 = 0;
        for (m = i1; i2 < i5; m = i1)
        {
          i9 = paramArrayOfByte[i2] + i10;
          i1 = m;
          if (i9 > 0)
          {
            i1 = m;
            if (arrayOfBoolean[(i4 + i2)] != 0)
            {
              arrayOfInt3[m] = i9;
              i1 = m + 1;
            }
          }
          i2++;
        }
        paramArrayOfByte = Arrays.copyOf(arrayOfInt3, m);
        i1 = m;
        localObject = arrayOfInt2;
        m = paramInt2;
        paramInt2 = i1;
      }
      else
      {
        m = localv.f();
        i1 = localv.f();
        localObject = new int[m];
        for (paramInt2 = 0; paramInt2 < m; paramInt2++)
        {
          localObject[paramInt2] = (localv.f() + 1);
          localv.i();
        }
        paramArrayOfByte = new int[i1];
        for (paramInt2 = 0; paramInt2 < i1; paramInt2++)
        {
          paramArrayOfByte[paramInt2] = (localv.f() + 1);
          localv.i();
        }
        paramInt2 = i1;
      }
      i7++;
      i4 = m;
      i5 = paramInt2;
    }
    if (localv.d()) {
      for (paramInt2 = 0; paramInt2 < localv.f(); paramInt2++) {
        localv.j(i8 + 4 + 1);
      }
    }
    i1 = 1;
    localv.j(2);
    float f1 = 1.0F;
    float f2;
    if (localv.d())
    {
      f2 = f1;
      if (localv.d())
      {
        paramInt2 = localv.e(8);
        if (paramInt2 == 255)
        {
          paramInt2 = localv.e(16);
          m = localv.e(16);
          f2 = f1;
          if (paramInt2 != 0)
          {
            f2 = f1;
            if (m != 0) {
              f2 = paramInt2 / m;
            }
          }
        }
        else
        {
          paramArrayOfByte = b;
          if (paramInt2 < 17)
          {
            f2 = paramArrayOfByte[paramInt2];
          }
          else
          {
            f.p("Unexpected aspect_ratio_idc value: ", paramInt2, "NalUnitUtil");
            f2 = f1;
          }
        }
      }
      if (localv.d()) {
        localv.i();
      }
      if (localv.d())
      {
        localv.j(3);
        boolean bool2 = localv.d();
        if (localv.d())
        {
          m = localv.e(8);
          paramInt2 = localv.e(8);
          localv.j(8);
          m = w5.b.a(m);
          if (!bool2) {
            i1 = 2;
          }
          paramInt2 = w5.b.b(paramInt2);
          break label1420;
        }
      }
      i1 = -1;
      paramInt2 = -1;
      m = -1;
      label1420:
      if (localv.d())
      {
        localv.f();
        localv.f();
      }
      localv.i();
      i = paramInt1;
      if (localv.d()) {
        i = paramInt1 * 2;
      }
      paramInt1 = m;
      m = i;
    }
    else
    {
      f2 = 1.0F;
      m = paramInt1;
      paramInt2 = -1;
      paramInt1 = -1;
      i1 = -1;
    }
    return new a(j, bool1, k, i6, arrayOfInt1, n, i3, m, f2, paramInt1, i1, paramInt2);
  }
  
  public static c d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new v(paramArrayOfByte, paramInt1 + 1, paramInt2);
    int i = paramArrayOfByte.e(8);
    int j = paramArrayOfByte.e(8);
    int k = paramArrayOfByte.e(8);
    int m = paramArrayOfByte.f();
    int n;
    boolean bool1;
    if ((i != 100) && (i != 110) && (i != 122) && (i != 244) && (i != 44) && (i != 83) && (i != 86) && (i != 118) && (i != 128) && (i != 138))
    {
      n = 1;
      bool1 = false;
    }
    else
    {
      i1 = paramArrayOfByte.f();
      if (i1 == 3) {
        bool1 = paramArrayOfByte.d();
      } else {
        bool1 = false;
      }
      paramArrayOfByte.f();
      paramArrayOfByte.f();
      paramArrayOfByte.i();
      if (paramArrayOfByte.d())
      {
        if (i1 != 3) {
          paramInt2 = 8;
        } else {
          paramInt2 = 12;
        }
        for (n = 0; n < paramInt2; n++) {
          if (paramArrayOfByte.d())
          {
            if (n < 6) {
              i2 = 16;
            } else {
              i2 = 64;
            }
            i3 = 0;
            i4 = 8;
            i5 = i4;
            while (i3 < i2)
            {
              paramInt1 = i4;
              if (i4 != 0) {
                paramInt1 = (paramArrayOfByte.g() + i5 + 256) % 256;
              }
              if (paramInt1 != 0) {
                i5 = paramInt1;
              }
              i3++;
              i4 = paramInt1;
            }
          }
        }
      }
      n = i1;
    }
    int i1 = paramArrayOfByte.f();
    int i6 = paramArrayOfByte.f();
    if (i6 == 0)
    {
      paramInt1 = paramArrayOfByte.f() + 4;
    }
    else
    {
      if (i6 == 1)
      {
        bool2 = paramArrayOfByte.d();
        paramArrayOfByte.g();
        paramArrayOfByte.g();
        long l = paramArrayOfByte.f();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++) {
          paramArrayOfByte.f();
        }
        paramInt2 = 0;
        break label371;
      }
      paramInt1 = 0;
    }
    boolean bool2 = false;
    paramInt2 = paramInt1;
    label371:
    paramArrayOfByte.f();
    paramArrayOfByte.i();
    int i2 = paramArrayOfByte.f();
    paramInt1 = paramArrayOfByte.f();
    boolean bool3 = paramArrayOfByte.d();
    int i4 = true - bool3;
    if (!bool3) {
      paramArrayOfByte.i();
    }
    paramArrayOfByte.i();
    int i5 = (i2 + 1) * 16;
    int i3 = (paramInt1 + 1) * i4 * 16;
    i2 = i5;
    paramInt1 = i3;
    if (paramArrayOfByte.d())
    {
      int i7 = paramArrayOfByte.f();
      int i8 = paramArrayOfByte.f();
      int i9 = paramArrayOfByte.f();
      int i10 = paramArrayOfByte.f();
      if (n == 0)
      {
        n = 1;
        paramInt1 = i4;
      }
      else
      {
        if (n == 3) {
          paramInt1 = 1;
        } else {
          paramInt1 = 2;
        }
        i2 = 1;
        if (n == 1) {
          i2 = 2;
        }
        i2 = i4 * i2;
        n = paramInt1;
        paramInt1 = i2;
      }
      i2 = i5 - (i7 + i8) * n;
      paramInt1 = i3 - (i9 + i10) * paramInt1;
    }
    float f1 = 1.0F;
    float f2 = f1;
    if (paramArrayOfByte.d())
    {
      f2 = f1;
      if (paramArrayOfByte.d())
      {
        n = paramArrayOfByte.e(8);
        if (n == 255)
        {
          i3 = paramArrayOfByte.e(16);
          n = paramArrayOfByte.e(16);
          f2 = f1;
          if (i3 != 0)
          {
            f2 = f1;
            if (n != 0) {
              f2 = i3 / n;
            }
          }
        }
        else
        {
          paramArrayOfByte = b;
          if (n < 17)
          {
            f2 = paramArrayOfByte[n];
          }
          else
          {
            f.p("Unexpected aspect_ratio_idc value: ", n, "NalUnitUtil");
            f2 = f1;
          }
        }
      }
    }
    return new c(i, j, k, m, i2, paramInt1, f2, bool1, bool3, i1 + 4, i6, paramInt2, bool2);
  }
  
  public static int e(byte[] paramArrayOfByte, int paramInt)
  {
    localObject = c;
    int i = 0;
    int j = i;
    for (;;)
    {
      int k;
      if (i < paramInt)
      {
        while (i < paramInt - 2)
        {
          if ((paramArrayOfByte[i] == 0) && (paramArrayOfByte[(i + 1)] == 0) && (paramArrayOfByte[(i + 2)] == 3))
          {
            k = i;
            break label61;
          }
          i++;
        }
        k = paramInt;
        label61:
        i = k;
        if (k >= paramInt) {
          continue;
        }
      }
      int m;
      int n;
      try
      {
        int[] arrayOfInt = d;
        if (arrayOfInt.length <= j) {
          d = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
        }
        d[j] = k;
        i = k + 3;
        j++;
      }
      finally {}
    }
    m = paramInt - j;
    n = 0;
    paramInt = n;
    i = paramInt;
    k = paramInt;
    for (paramInt = n; paramInt < j; paramInt++)
    {
      n = d[paramInt] - i;
      System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, n);
      k += n;
      int i1 = k + 1;
      paramArrayOfByte[k] = ((byte)0);
      k = i1 + 1;
      paramArrayOfByte[i1] = ((byte)0);
      i += n + 3;
    }
    System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, m - k);
    return m;
  }
  
  public static final class a
  {
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;
    
    public a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, int paramInt5, int paramInt6, float paramFloat, int paramInt7, int paramInt8, int paramInt9)
    {
      a = paramInt1;
      b = paramBoolean;
      c = paramInt2;
      d = paramInt3;
      e = paramArrayOfInt;
      f = paramInt4;
      g = paramInt5;
      h = paramInt6;
      i = paramFloat;
      j = paramInt7;
      k = paramInt8;
      l = paramInt9;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final boolean b;
    
    public b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      a = paramInt2;
      b = paramBoolean;
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
    public final float g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    
    public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean3)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramInt6;
      g = paramFloat;
      h = paramBoolean1;
      i = paramBoolean2;
      j = paramInt7;
      k = paramInt8;
      l = paramInt9;
      m = paramBoolean3;
    }
  }
}

/* Location:
 * Qualified Name:     v5.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */