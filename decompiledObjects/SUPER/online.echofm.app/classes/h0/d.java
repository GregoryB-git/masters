package h0;

import d0.h;
import g0.a;
import g0.o;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class d
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
  
  public static void b(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = 0;
    int k = j;
    for (;;)
    {
      int m = j + 1;
      if (m >= i) {
        break;
      }
      int n = paramByteBuffer.get(j) & 0xFF;
      int i1;
      if (k == 3)
      {
        i1 = k;
        if (n == 1)
        {
          i1 = k;
          if ((paramByteBuffer.get(m) & 0x1F) == 7)
          {
            ByteBuffer localByteBuffer = paramByteBuffer.duplicate();
            localByteBuffer.position(j - 3);
            localByteBuffer.limit(i);
            paramByteBuffer.position(0);
            paramByteBuffer.put(localByteBuffer);
          }
        }
      }
      else
      {
        i1 = k;
        if (n == 0) {
          i1 = k + 1;
        }
      }
      k = i1;
      if (n != 0) {
        k = 0;
      }
      j = m;
    }
    paramByteBuffer.clear();
  }
  
  public static int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    int i = paramInt2 - paramInt1;
    boolean bool1 = false;
    if (i >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.f(bool2);
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
    if (i > 2) {
      if ((paramArrayOfByte[(paramInt2 - 3)] != 0) || (paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[j] != 1)) {}
    }
    for (;;)
    {
      bool2 = true;
      break;
      do
      {
        do
        {
          bool2 = false;
          break label273;
          if (i != 2) {
            break;
          }
        } while ((paramArrayOfBoolean[2] == 0) || (paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[j] != 1));
        break;
      } while ((paramArrayOfBoolean[1] == 0) || (paramArrayOfByte[j] != 1));
    }
    label273:
    paramArrayOfBoolean[0] = bool2;
    if (i > 1) {
      if ((paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[j] != 0)) {}
    }
    for (;;)
    {
      bool2 = true;
      break;
      do
      {
        bool2 = false;
        break;
      } while ((paramArrayOfBoolean[2] == 0) || (paramArrayOfByte[j] != 0));
    }
    paramArrayOfBoolean[1] = bool2;
    boolean bool2 = bool1;
    if (paramArrayOfByte[j] == 0) {
      bool2 = true;
    }
    paramArrayOfBoolean[2] = bool2;
    return paramInt2;
  }
  
  public static int d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2 - 2)
    {
      if ((paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 0) && (paramArrayOfByte[(paramInt1 + 2)] == 3)) {
        return paramInt1;
      }
      paramInt1++;
    }
    return paramInt2;
  }
  
  public static int e(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[(paramInt + 3)] & 0x7E) >> 1;
  }
  
  public static int f(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 3)] & 0x1F;
  }
  
  public static boolean g(String paramString, byte paramByte)
  {
    boolean bool1 = "video/avc".equals(paramString);
    boolean bool2 = true;
    if (bool1)
    {
      bool1 = bool2;
      if ((paramByte & 0x1F) == 6) {}
    }
    else if (("video/hevc".equals(paramString)) && ((paramByte & 0x7E) >> 1 == 39))
    {
      bool1 = bool2;
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public static a h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return i(paramArrayOfByte, paramInt1 + 2, paramInt2);
  }
  
  public static a i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new e(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte.l(4);
    int i = paramArrayOfByte.e(3);
    paramArrayOfByte.k();
    int j = 2;
    int k = paramArrayOfByte.e(2);
    boolean bool1 = paramArrayOfByte.d();
    int m = paramArrayOfByte.e(5);
    int n = 0;
    paramInt1 = 0;
    while (paramInt1 < 32)
    {
      paramInt2 = n;
      if (paramArrayOfByte.d()) {
        paramInt2 = n | 1 << paramInt1;
      }
      paramInt1++;
      n = paramInt2;
    }
    int[] arrayOfInt = new int[6];
    for (paramInt1 = 0; paramInt1 < 6; paramInt1++) {
      arrayOfInt[paramInt1] = paramArrayOfByte.e(8);
    }
    int i1 = paramArrayOfByte.e(8);
    int i2 = 0;
    paramInt1 = 0;
    while (i2 < i)
    {
      paramInt2 = paramInt1;
      if (paramArrayOfByte.d()) {
        paramInt2 = paramInt1 + 89;
      }
      paramInt1 = paramInt2;
      if (paramArrayOfByte.d()) {
        paramInt1 = paramInt2 + 8;
      }
      i2++;
    }
    paramArrayOfByte.l(paramInt1);
    if (i > 0) {
      paramArrayOfByte.l((8 - i) * 2);
    }
    int i3 = paramArrayOfByte.h();
    int i4 = paramArrayOfByte.h();
    if (i4 == 3) {
      paramArrayOfByte.k();
    }
    int i5 = paramArrayOfByte.h();
    i2 = paramArrayOfByte.h();
    int i6 = i5;
    paramInt2 = i2;
    if (paramArrayOfByte.d())
    {
      i6 = paramArrayOfByte.h();
      i7 = paramArrayOfByte.h();
      i8 = paramArrayOfByte.h();
      i9 = paramArrayOfByte.h();
      if ((i4 != 1) && (i4 != 2)) {
        paramInt1 = 1;
      } else {
        paramInt1 = 2;
      }
      if (i4 == 1) {
        paramInt2 = 2;
      } else {
        paramInt2 = 1;
      }
      i6 = i5 - paramInt1 * (i6 + i7);
      paramInt2 = i2 - paramInt2 * (i8 + i9);
    }
    int i9 = paramArrayOfByte.h();
    int i8 = paramArrayOfByte.h();
    int i7 = paramArrayOfByte.h();
    if (paramArrayOfByte.d()) {
      paramInt1 = 0;
    } else {
      paramInt1 = i;
    }
    i2 = -1;
    i5 = -1;
    for (;;)
    {
      paramArrayOfByte.h();
      if (paramInt1 > i) {
        break;
      }
      i5 = Math.max(paramArrayOfByte.h(), i5);
      paramArrayOfByte.h();
      paramInt1++;
    }
    paramArrayOfByte.h();
    paramArrayOfByte.h();
    paramArrayOfByte.h();
    paramArrayOfByte.h();
    paramArrayOfByte.h();
    if ((paramArrayOfByte.d()) && (paramArrayOfByte.d())) {
      n(paramArrayOfByte);
    }
    paramArrayOfByte.l(2);
    if (paramArrayOfByte.d())
    {
      paramArrayOfByte.l(8);
      paramArrayOfByte.h();
      paramArrayOfByte.h();
      paramArrayOfByte.k();
    }
    q(paramArrayOfByte);
    if (paramArrayOfByte.d())
    {
      i = paramArrayOfByte.h();
      for (paramInt1 = 0; paramInt1 < i; paramInt1++) {
        paramArrayOfByte.l(i7 + 5);
      }
    }
    paramArrayOfByte.l(2);
    boolean bool2 = paramArrayOfByte.d();
    float f1 = 1.0F;
    float f2;
    if (bool2)
    {
      f2 = f1;
      if (paramArrayOfByte.d())
      {
        paramInt1 = paramArrayOfByte.e(8);
        if (paramInt1 == 255)
        {
          i = paramArrayOfByte.e(16);
          paramInt1 = paramArrayOfByte.e(16);
          f2 = f1;
          if (i != 0)
          {
            f2 = f1;
            if (paramInt1 != 0) {
              f2 = i / paramInt1;
            }
          }
        }
        else
        {
          Object localObject = b;
          if (paramInt1 < localObject.length)
          {
            f2 = localObject[paramInt1];
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Unexpected aspect_ratio_idc value: ");
            ((StringBuilder)localObject).append(paramInt1);
            o.h("NalUnitUtil", ((StringBuilder)localObject).toString());
            f2 = f1;
          }
        }
      }
      if (paramArrayOfByte.d()) {
        paramArrayOfByte.k();
      }
      if (paramArrayOfByte.d())
      {
        paramArrayOfByte.l(3);
        if (paramArrayOfByte.d()) {
          j = 1;
        }
        if (paramArrayOfByte.d())
        {
          i2 = paramArrayOfByte.e(8);
          paramInt1 = paramArrayOfByte.e(8);
          paramArrayOfByte.l(8);
          i2 = h.j(i2);
          paramInt1 = h.k(paramInt1);
        }
        else
        {
          paramInt1 = -1;
        }
      }
      else
      {
        paramInt1 = -1;
        j = paramInt1;
      }
      if (paramArrayOfByte.d())
      {
        paramArrayOfByte.h();
        paramArrayOfByte.h();
      }
      paramArrayOfByte.k();
      i = paramInt2;
      if (paramArrayOfByte.d()) {
        i = paramInt2 * 2;
      }
      paramInt2 = i;
    }
    else
    {
      f2 = 1.0F;
      j = -1;
      paramInt1 = j;
    }
    return new a(k, bool1, m, n, i4, i9, i8, arrayOfInt, i1, i3, i6, paramInt2, f2, i5, i2, j, paramInt1);
  }
  
  public static b j(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return k(paramArrayOfByte, paramInt1 + 1, paramInt2);
  }
  
  public static b k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new e(paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = paramArrayOfByte.h();
    paramInt2 = paramArrayOfByte.h();
    paramArrayOfByte.k();
    return new b(paramInt1, paramInt2, paramArrayOfByte.d());
  }
  
  public static c l(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return m(paramArrayOfByte, paramInt1 + 1, paramInt2);
  }
  
  public static c m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new e(paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = 8;
    int i = paramArrayOfByte.e(8);
    int j = paramArrayOfByte.e(8);
    int k = paramArrayOfByte.e(8);
    int m = paramArrayOfByte.h();
    int n = 1;
    boolean bool1;
    int i1;
    int i2;
    int i3;
    boolean bool2;
    if ((i != 100) && (i != 110) && (i != 122) && (i != 244) && (i != 44) && (i != 83) && (i != 86) && (i != 118) && (i != 128) && (i != 138))
    {
      paramInt2 = 1;
      bool1 = false;
      i1 = 0;
      i2 = 0;
    }
    else
    {
      i3 = paramArrayOfByte.h();
      if (i3 == 3) {
        bool2 = paramArrayOfByte.d();
      } else {
        bool2 = false;
      }
      i4 = paramArrayOfByte.h();
      i5 = paramArrayOfByte.h();
      paramArrayOfByte.k();
      paramInt2 = i3;
      bool1 = bool2;
      i1 = i4;
      i2 = i5;
      if (paramArrayOfByte.d())
      {
        if (i3 == 3) {
          paramInt1 = 12;
        }
        for (i6 = 0;; i6++)
        {
          paramInt2 = i3;
          bool1 = bool2;
          i1 = i4;
          i2 = i5;
          if (i6 >= paramInt1) {
            break;
          }
          if (paramArrayOfByte.d())
          {
            if (i6 < 6) {
              paramInt2 = 16;
            } else {
              paramInt2 = 64;
            }
            p(paramArrayOfByte, paramInt2);
          }
        }
      }
    }
    int i7 = paramArrayOfByte.h();
    int i8 = paramArrayOfByte.h();
    if (i8 == 0) {}
    for (paramInt1 = paramArrayOfByte.h() + 4;; paramInt1 = 0)
    {
      bool2 = false;
      i3 = paramInt1;
      break;
      if (i8 == 1)
      {
        bool2 = paramArrayOfByte.d();
        paramArrayOfByte.g();
        paramArrayOfByte.g();
        long l = paramArrayOfByte.h();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++) {
          paramArrayOfByte.h();
        }
        i3 = 0;
        break;
      }
    }
    int i9 = paramArrayOfByte.h();
    paramArrayOfByte.k();
    int i6 = paramArrayOfByte.h();
    paramInt1 = paramArrayOfByte.h();
    boolean bool3 = paramArrayOfByte.d();
    if (!bool3) {
      paramArrayOfByte.k();
    }
    paramArrayOfByte.k();
    int i10 = (i6 + 1) * 16;
    i6 = (true - bool3) * (paramInt1 + 1) * 16;
    int i4 = i10;
    int i5 = i6;
    if (paramArrayOfByte.d())
    {
      i4 = paramArrayOfByte.h();
      int i11 = paramArrayOfByte.h();
      int i12 = paramArrayOfByte.h();
      int i13 = paramArrayOfByte.h();
      if (paramInt2 == 0)
      {
        paramInt1 = true - bool3;
        paramInt2 = 1;
      }
      else
      {
        if (paramInt2 == 3) {
          paramInt1 = 1;
        } else {
          paramInt1 = 2;
        }
        if (paramInt2 == 1) {
          paramInt2 = 2;
        } else {
          paramInt2 = 1;
        }
        i5 = paramInt2 * (true - bool3);
        paramInt2 = paramInt1;
        paramInt1 = i5;
      }
      i4 = i10 - (i4 + i11) * paramInt2;
      i5 = i6 - (i12 + i13) * paramInt1;
    }
    if (((i == 44) || (i == 86) || (i == 100) || (i == 110) || (i == 122) || (i == 244)) && ((j & 0x10) != 0)) {
      paramInt1 = 0;
    } else {
      paramInt1 = 16;
    }
    boolean bool4 = paramArrayOfByte.d();
    i6 = -1;
    float f1 = 1.0F;
    float f2;
    if (bool4)
    {
      f2 = f1;
      if (paramArrayOfByte.d())
      {
        paramInt2 = paramArrayOfByte.e(8);
        if (paramInt2 == 255)
        {
          paramInt2 = paramArrayOfByte.e(16);
          i10 = paramArrayOfByte.e(16);
          f2 = f1;
          if (paramInt2 != 0)
          {
            f2 = f1;
            if (i10 != 0) {
              f2 = paramInt2 / i10;
            }
          }
        }
        else
        {
          Object localObject = b;
          if (paramInt2 < localObject.length)
          {
            f2 = localObject[paramInt2];
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Unexpected aspect_ratio_idc value: ");
            ((StringBuilder)localObject).append(paramInt2);
            o.h("NalUnitUtil", ((StringBuilder)localObject).toString());
            f2 = f1;
          }
        }
      }
      if (paramArrayOfByte.d()) {
        paramArrayOfByte.k();
      }
      if (paramArrayOfByte.d())
      {
        paramArrayOfByte.l(3);
        if (!paramArrayOfByte.d()) {
          n = 2;
        }
        if (paramArrayOfByte.d())
        {
          i6 = paramArrayOfByte.e(8);
          paramInt2 = paramArrayOfByte.e(8);
          paramArrayOfByte.l(8);
          i6 = h.j(i6);
          paramInt2 = h.k(paramInt2);
        }
        else
        {
          paramInt2 = -1;
        }
      }
      else
      {
        paramInt2 = -1;
        n = paramInt2;
      }
      if (paramArrayOfByte.d())
      {
        paramArrayOfByte.h();
        paramArrayOfByte.h();
      }
      if (paramArrayOfByte.d()) {
        paramArrayOfByte.l(65);
      }
      boolean bool5 = paramArrayOfByte.d();
      if (bool5) {
        o(paramArrayOfByte);
      }
      bool4 = paramArrayOfByte.d();
      if (bool4) {
        o(paramArrayOfByte);
      }
      if ((bool5) || (bool4)) {
        paramArrayOfByte.k();
      }
      paramArrayOfByte.k();
      if (paramArrayOfByte.d())
      {
        paramArrayOfByte.k();
        paramArrayOfByte.h();
        paramArrayOfByte.h();
        paramArrayOfByte.h();
        paramArrayOfByte.h();
        paramInt1 = paramArrayOfByte.h();
        paramArrayOfByte.h();
      }
    }
    else
    {
      paramInt2 = -1;
      f2 = 1.0F;
      n = paramInt2;
    }
    return new c(i, j, k, m, i9, i4, i5, f2, i1, i2, bool1, bool3, i7 + 4, i8, i3, bool2, i6, n, paramInt2, paramInt1);
  }
  
  public static void n(e parame)
  {
    for (int i = 0; i < 4; i++)
    {
      int j = 0;
      while (j < 6)
      {
        boolean bool = parame.d();
        int k = 1;
        if (!bool)
        {
          parame.h();
        }
        else
        {
          int m = Math.min(64, 1 << (i << 1) + 4);
          if (i > 1) {
            parame.g();
          }
          for (n = 0; n < m; n++) {
            parame.g();
          }
        }
        int n = k;
        if (i == 3) {
          n = 3;
        }
        j += n;
      }
    }
  }
  
  public static void o(e parame)
  {
    int i = parame.h();
    parame.l(8);
    for (int j = 0; j < i + 1; j++)
    {
      parame.h();
      parame.h();
      parame.k();
    }
    parame.l(20);
  }
  
  public static void p(e parame, int paramInt)
  {
    int i = 8;
    int j = 0;
    int k = 8;
    while (j < paramInt)
    {
      int m = i;
      if (i != 0) {
        m = (parame.g() + k + 256) % 256;
      }
      if (m != 0) {
        k = m;
      }
      j++;
      i = m;
    }
  }
  
  public static void q(e parame)
  {
    int i = parame.h();
    Object localObject = new int[0];
    int[] arrayOfInt1 = new int[0];
    int j = -1;
    int k = 0;
    int i3;
    for (int m = -1; k < i; m = i3)
    {
      int i2;
      int i4;
      if ((k != 0) && (parame.d()))
      {
        int n = j + m;
        int i1 = (1 - parame.d() * true) * (parame.h() + 1);
        i2 = n + 1;
        boolean[] arrayOfBoolean = new boolean[i2];
        for (i3 = 0; i3 <= n; i3++) {
          if (!parame.d()) {
            arrayOfBoolean[i3] = parame.d();
          } else {
            arrayOfBoolean[i3] = true;
          }
        }
        int[] arrayOfInt2 = new int[i2];
        int[] arrayOfInt3 = new int[i2];
        i4 = m - 1;
        for (i3 = 0; i4 >= 0; i3 = i2)
        {
          i5 = arrayOfInt1[i4] + i1;
          i2 = i3;
          if (i5 < 0)
          {
            i2 = i3;
            if (arrayOfBoolean[(j + i4)] != 0)
            {
              arrayOfInt2[i3] = i5;
              i2 = i3 + 1;
            }
          }
          i4--;
        }
        i2 = i3;
        if (i1 < 0)
        {
          i2 = i3;
          if (arrayOfBoolean[n] != 0)
          {
            arrayOfInt2[i3] = i1;
            i2 = i3 + 1;
          }
        }
        i4 = 0;
        i3 = i2;
        i2 = i4;
        while (i2 < j)
        {
          i5 = localObject[i2] + i1;
          i4 = i3;
          if (i5 < 0)
          {
            i4 = i3;
            if (arrayOfBoolean[i2] != 0)
            {
              arrayOfInt2[i3] = i5;
              i4 = i3 + 1;
            }
          }
          i2++;
          i3 = i4;
        }
        arrayOfInt2 = Arrays.copyOf(arrayOfInt2, i3);
        i4 = j - 1;
        for (i2 = 0; i4 >= 0; i2 = i5)
        {
          int i6 = localObject[i4] + i1;
          i5 = i2;
          if (i6 > 0)
          {
            i5 = i2;
            if (arrayOfBoolean[i4] != 0)
            {
              arrayOfInt3[i2] = i6;
              i5 = i2 + 1;
            }
          }
          i4--;
        }
        i4 = i2;
        if (i1 > 0)
        {
          i4 = i2;
          if (arrayOfBoolean[n] != 0)
          {
            arrayOfInt3[i2] = i1;
            i4 = i2 + 1;
          }
        }
        int i5 = 0;
        for (i2 = i4; i5 < m; i2 = i4)
        {
          n = arrayOfInt1[i5] + i1;
          i4 = i2;
          if (n > 0)
          {
            i4 = i2;
            if (arrayOfBoolean[(j + i5)] != 0)
            {
              arrayOfInt3[i2] = n;
              i4 = i2 + 1;
            }
          }
          i5++;
        }
        arrayOfInt1 = Arrays.copyOf(arrayOfInt3, i2);
        localObject = arrayOfInt2;
        i4 = i2;
        i2 = i3;
        i3 = i4;
      }
      else
      {
        m = parame.h();
        i4 = parame.h();
        localObject = new int[m];
        for (i3 = 0; i3 < m; i3++)
        {
          if (i3 > 0) {
            i2 = localObject[(i3 - 1)];
          } else {
            i2 = 0;
          }
          localObject[i3] = (i2 - (parame.h() + 1));
          parame.k();
        }
        arrayOfInt1 = new int[i4];
        for (i3 = 0; i3 < i4; i3++)
        {
          if (i3 > 0) {
            i2 = arrayOfInt1[(i3 - 1)];
          } else {
            i2 = 0;
          }
          arrayOfInt1[i3] = (i2 + (parame.h() + 1));
          parame.k();
        }
        i2 = m;
        i3 = i4;
      }
      k++;
      j = i2;
    }
  }
  
  public static int r(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = c;
    int i = 0;
    for (int j = i; i < paramInt; j++)
    {
      try
      {
        label11:
        k = d(paramArrayOfByte, i, paramInt);
        i = k;
        if (k >= paramInt) {
          break label11;
        }
        int[] arrayOfInt = d;
        if (arrayOfInt.length <= j) {
          d = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
        }
      }
      finally
      {
        break label188;
      }
      d[j] = k;
      i = k + 3;
    }
    int m = paramInt - j;
    int n = 0;
    paramInt = n;
    i = paramInt;
    int k = paramInt;
    for (paramInt = n; paramInt < j; paramInt++)
    {
      n = d[paramInt] - i;
      System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, n);
      int i1 = k + n;
      paramArrayOfByte[i1] = ((byte)0);
      k = i1 + 2;
      paramArrayOfByte[(i1 + 1)] = ((byte)0);
      i += n + 3;
    }
    System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, m - k);
    return m;
    label188:
    throw paramArrayOfByte;
  }
  
  public static final class a
  {
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int[] h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    
    public a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfInt, int paramInt7, int paramInt8, int paramInt9, int paramInt10, float paramFloat, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
    {
      a = paramInt1;
      b = paramBoolean;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
      f = paramInt5;
      g = paramInt6;
      h = paramArrayOfInt;
      i = paramInt7;
      j = paramInt8;
      k = paramInt9;
      l = paramInt10;
      m = paramFloat;
      n = paramInt11;
      o = paramInt12;
      p = paramInt13;
      q = paramInt14;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    public final boolean c;
    
    public b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramBoolean;
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
    public final float h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    
    public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat, int paramInt8, int paramInt9, boolean paramBoolean1, boolean paramBoolean2, int paramInt10, int paramInt11, int paramInt12, boolean paramBoolean3, int paramInt13, int paramInt14, int paramInt15, int paramInt16)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramInt6;
      g = paramInt7;
      h = paramFloat;
      i = paramInt8;
      j = paramInt9;
      k = paramBoolean1;
      l = paramBoolean2;
      m = paramInt10;
      n = paramInt11;
      o = paramInt12;
      p = paramBoolean3;
      q = paramInt13;
      r = paramInt14;
      s = paramInt15;
      t = paramInt16;
    }
  }
}

/* Location:
 * Qualified Name:     h0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */