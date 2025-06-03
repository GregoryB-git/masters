package ma;

import f;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class u1$e
  extends u1.b
{
  public static int f(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return u1.d(paramInt1, t1.i(paramArrayOfByte, paramLong), t1.i(paramArrayOfByte, paramLong + 1L));
        }
        throw new AssertionError();
      }
      return u1.c(paramInt1, t1.i(paramArrayOfByte, paramLong));
    }
    paramArrayOfByte = u1.a;
    paramInt2 = paramInt1;
    if (paramInt1 > -12) {
      paramInt2 = -1;
    }
    return paramInt2;
  }
  
  public final String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Charset localCharset = a0.a;
    String str = new String(paramArrayOfByte, paramInt1, paramInt2, localCharset);
    if (!str.contains("�")) {
      return str;
    }
    if (Arrays.equals(str.getBytes(localCharset), Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2 + paramInt1))) {
      return str;
    }
    throw b0.c();
  }
  
  public final String c(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramByteBuffer.limit() - paramInt1 - paramInt2) >= 0)
    {
      long l1 = t1.c.j(paramByteBuffer, t1.g) + paramInt1;
      long l2 = paramInt2 + l1;
      paramByteBuffer = new char[paramInt2];
      long l3;
      int i;
      for (paramInt1 = 0;; paramInt1++)
      {
        paramInt2 = paramInt1;
        l3 = l1;
        if (l1 >= l2) {
          break;
        }
        i = t1.h(l1);
        if (i >= 0) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if (paramInt2 == 0)
        {
          paramInt2 = paramInt1;
          l3 = l1;
          break;
        }
        l1 += 1L;
        paramByteBuffer[paramInt1] = ((char)(char)i);
      }
      for (;;)
      {
        paramInt1 = paramInt2;
        l1 = l3;
        byte b1;
        for (;;)
        {
          if (l1 >= l2) {
            break label421;
          }
          l3 = l1 + 1L;
          b1 = t1.h(l1);
          if (b1 >= 0) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if (paramInt2 != 0)
          {
            paramByteBuffer[paramInt1] = ((char)(char)b1);
            for (paramInt2 = paramInt1 + 1;; paramInt2++)
            {
              l1 = l3;
              paramInt1 = paramInt2;
              if (l3 >= l2) {
                break;
              }
              i = t1.h(l3);
              if (i >= 0) {
                paramInt1 = 1;
              } else {
                paramInt1 = 0;
              }
              if (paramInt1 == 0)
              {
                l1 = l3;
                paramInt1 = paramInt2;
                break;
              }
              l3 += 1L;
              paramByteBuffer[paramInt2] = ((char)(char)i);
            }
          }
          if (b1 < -32) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if (paramInt2 != 0)
          {
            if (l3 < l2)
            {
              l1 = l3 + 1L;
              u1.a.b(b1, t1.h(l3), paramByteBuffer, paramInt1);
              paramInt1++;
            }
            else
            {
              throw b0.c();
            }
          }
          else
          {
            if (b1 < -16) {
              paramInt2 = 1;
            } else {
              paramInt2 = 0;
            }
            if (paramInt2 == 0) {
              break label348;
            }
            if (l3 >= l2 - 1L) {
              break;
            }
            l1 = l3 + 1L;
            u1.a.c(b1, t1.h(l3), t1.h(l1), paramByteBuffer, paramInt1);
            paramInt1++;
            l1 += 1L;
          }
        }
        throw b0.c();
        label348:
        if (l3 >= l2 - 2L) {
          break;
        }
        l1 = l3 + 1L;
        byte b2 = t1.h(l3);
        long l4 = l1 + 1L;
        byte b3 = t1.h(l1);
        l3 = l4 + 1L;
        u1.a.a(b1, b2, b3, t1.h(l4), paramByteBuffer, paramInt1);
        paramInt2 = paramInt1 + 1 + 1;
      }
      throw b0.c();
      label421:
      return new String(paramByteBuffer, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramByteBuffer.limit()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public final int d(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = paramInt2 + l1;
    int i = paramCharSequence.length();
    if ((i <= paramInt2) && (paramArrayOfByte.length - paramInt2 >= paramInt1))
    {
      paramInt2 = 0;
      long l3;
      int j;
      for (;;)
      {
        l3 = 1L;
        j = 128;
        if (paramInt2 >= i) {
          break;
        }
        paramInt1 = paramCharSequence.charAt(paramInt2);
        if (paramInt1 >= 128) {
          break;
        }
        t1.s(paramArrayOfByte, l1, (byte)paramInt1);
        paramInt2++;
        l1 = 1L + l1;
      }
      paramInt1 = paramInt2;
      long l4 = l1;
      if (paramInt2 == i) {
        return (int)l1;
      }
      while (paramInt1 < i)
      {
        int k = paramCharSequence.charAt(paramInt1);
        if ((k < j) && (l4 < l2))
        {
          t1.s(paramArrayOfByte, l4, (byte)k);
          l1 = l4 + l3;
          paramInt2 = j;
        }
        else
        {
          if ((k < 2048) && (l4 <= l2 - 2L))
          {
            long l5 = l4 + l3;
            t1.s(paramArrayOfByte, l4, (byte)(k >>> 6 | 0x3C0));
            l1 = l5 + l3;
            t1.s(paramArrayOfByte, l5, (byte)(k & 0x3F | 0x80));
          }
          for (;;)
          {
            paramInt2 = 128;
            break label491;
            if (((k >= 55296) && (57343 >= k)) || (l4 > l2 - 3L)) {
              break;
            }
            l1 = l4 + l3;
            t1.s(paramArrayOfByte, l4, (byte)(k >>> 12 | 0x1E0));
            l3 += l1;
            t1.s(paramArrayOfByte, l1, (byte)(k >>> 6 & 0x3F | 0x80));
            l1 = 1L + l3;
            t1.s(paramArrayOfByte, l3, (byte)(k & 0x3F | 0x80));
            l3 = 1L;
          }
          if (l4 > l2 - 4L) {
            break label521;
          }
          paramInt2 = paramInt1 + 1;
          if (paramInt2 == i) {
            break label508;
          }
          char c = paramCharSequence.charAt(paramInt2);
          if (!Character.isSurrogatePair(k, c)) {
            break label505;
          }
          paramInt1 = Character.toCodePoint(k, c);
          l3 = l4 + 1L;
          t1.s(paramArrayOfByte, l4, (byte)(paramInt1 >>> 18 | 0xF0));
          l1 = 1L + l3;
          t1.s(paramArrayOfByte, l3, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
          l4 = 1L + l1;
          t1.s(paramArrayOfByte, l1, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
          l3 = 1L;
          t1.s(paramArrayOfByte, l4, (byte)(paramInt1 & 0x3F | 0x80));
          paramInt1 = paramInt2;
          paramInt2 = 128;
          l1 = l4 + 1L;
        }
        label491:
        paramInt1++;
        j = paramInt2;
        l4 = l1;
        continue;
        label505:
        paramInt1 = paramInt2;
        label508:
        throw new u1.d(paramInt1 - 1, i);
        label521:
        if ((55296 <= k) && (k <= 57343))
        {
          paramInt2 = paramInt1 + 1;
          if ((paramInt2 == i) || (!Character.isSurrogatePair(k, paramCharSequence.charAt(paramInt2)))) {
            throw new u1.d(paramInt1, i);
          }
        }
        paramCharSequence = new StringBuilder();
        paramCharSequence.append("Failed writing ");
        paramCharSequence.append(k);
        paramCharSequence.append(" at index ");
        paramCharSequence.append(l4);
        throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
      }
      return (int)l4;
    }
    paramArrayOfByte = f.l("Failed writing ");
    paramArrayOfByte.append(paramCharSequence.charAt(i - 1));
    paramArrayOfByte.append(" at index ");
    paramArrayOfByte.append(paramInt1 + paramInt2);
    throw new ArrayIndexOutOfBoundsException(paramArrayOfByte.toString());
  }
  
  public final int e(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if ((paramInt2 | paramInt3 | paramArrayOfByte.length - paramInt3) >= 0)
    {
      long l1 = paramInt2;
      long l2 = paramInt3;
      long l3 = l1;
      int i;
      long l4;
      if (paramInt1 != 0)
      {
        if (l1 >= l2) {
          return paramInt1;
        }
        i = (byte)paramInt1;
        if (i < -32) {
          if (i >= -62)
          {
            l3 = l1 + 1L;
            if (t1.i(paramArrayOfByte, l1) > -65) {}
          }
        }
        for (;;)
        {
          break;
          return -1;
          if (i < -16)
          {
            paramInt2 = (byte)(paramInt1 >> 8);
            paramInt1 = paramInt2;
            l4 = l1;
            if (paramInt2 == 0)
            {
              l4 = l1 + 1L;
              paramInt1 = t1.i(paramArrayOfByte, l1);
              if (l4 >= l2) {
                return u1.c(i, paramInt1);
              }
            }
            if ((paramInt1 <= -65) && ((i != -32) || (paramInt1 >= -96)) && ((i != -19) || (paramInt1 < -96)))
            {
              l3 = l4 + 1L;
              if (t1.i(paramArrayOfByte, l4) <= -65) {
                break;
              }
            }
            else
            {
              return -1;
            }
          }
          else
          {
            paramInt2 = (byte)(paramInt1 >> 8);
            if (paramInt2 == 0)
            {
              l3 = l1 + 1L;
              paramInt2 = t1.i(paramArrayOfByte, l1);
              if (l3 >= l2) {
                return u1.c(i, paramInt2);
              }
              l1 = l3;
              paramInt1 = 0;
            }
            else
            {
              paramInt1 = (byte)(paramInt1 >> 16);
            }
            paramInt3 = paramInt1;
            l3 = l1;
            if (paramInt1 == 0)
            {
              l3 = l1 + 1L;
              paramInt3 = t1.i(paramArrayOfByte, l1);
              if (l3 >= l2) {
                return u1.d(i, paramInt2, paramInt3);
              }
            }
            if ((paramInt2 <= -65) && (paramInt2 + 112 + (i << 28) >> 30 == 0) && (paramInt3 <= -65) && (t1.i(paramArrayOfByte, l3) <= -65)) {
              l3 += 1L;
            } else {
              return -1;
            }
          }
        }
      }
      paramInt3 = (int)(l2 - l3);
      if (paramInt3 < 16)
      {
        paramInt1 = 0;
      }
      else
      {
        i = (int)l3;
        l4 = l3;
        paramInt1 = 0;
        for (;;)
        {
          paramInt2 = paramInt1;
          l1 = l4;
          if (paramInt1 >= 8 - (i & 0x7)) {
            break;
          }
          if (t1.i(paramArrayOfByte, l4) < 0) {
            break label501;
          }
          paramInt1++;
          l4 += 1L;
        }
        for (;;)
        {
          i = paramInt2 + 8;
          paramInt1 = paramInt2;
          l4 = l1;
          if (i > paramInt3) {
            break;
          }
          if ((t1.o(paramArrayOfByte, t1.f + l1) & 0x8080808080808080) != 0L)
          {
            paramInt1 = paramInt2;
            l4 = l1;
            break;
          }
          l1 += 8L;
          paramInt2 = i;
        }
        while (paramInt1 < paramInt3)
        {
          if (t1.i(paramArrayOfByte, l4) < 0) {
            break label501;
          }
          paramInt1++;
          l4 += 1L;
        }
        paramInt1 = paramInt3;
      }
      label501:
      paramInt2 = paramInt3 - paramInt1;
      l3 += paramInt1;
      paramInt1 = paramInt2;
      for (;;)
      {
        paramInt2 = 0;
        paramInt3 = paramInt1;
        for (;;)
        {
          paramInt1 = paramInt2;
          l1 = l3;
          if (paramInt3 <= 0) {
            break;
          }
          l1 = l3 + 1L;
          paramInt1 = t1.i(paramArrayOfByte, l3);
          if (paramInt1 < 0) {
            break;
          }
          paramInt3--;
          l3 = l1;
          paramInt2 = paramInt1;
        }
        if (paramInt3 == 0)
        {
          paramInt1 = 0;
          break;
        }
        paramInt2 = paramInt3 - 1;
        if (paramInt1 < -32)
        {
          if (paramInt2 == 0) {
            break;
          }
          paramInt2--;
          if ((paramInt1 >= -62) && (t1.i(paramArrayOfByte, l1) <= -65))
          {
            l3 = l1 + 1L;
            paramInt1 = paramInt2;
            continue;
          }
        }
        label713:
        label718:
        do
        {
          do
          {
            for (;;)
            {
              paramInt1 = -1;
              break label812;
              if (paramInt1 >= -16) {
                break label713;
              }
              if (paramInt2 < 2) {
                break label718;
              }
              paramInt2 -= 2;
              l4 = l1 + 1L;
              paramInt3 = t1.i(paramArrayOfByte, l1);
              if ((paramInt3 <= -65) && ((paramInt1 != -32) || (paramInt3 >= -96)) && ((paramInt1 != -19) || (paramInt3 < -96)))
              {
                l3 = l4 + 1L;
                paramInt1 = paramInt2;
                if (t1.i(paramArrayOfByte, l4) <= -65) {
                  break;
                }
              }
            }
            if (paramInt2 < 3)
            {
              paramInt1 = f(paramArrayOfByte, paramInt1, l1, paramInt2);
              break label812;
            }
            paramInt2 -= 3;
            l3 = l1 + 1L;
            paramInt3 = t1.i(paramArrayOfByte, l1);
          } while ((paramInt3 > -65) || (paramInt3 + 112 + (paramInt1 << 28) >> 30 != 0));
          l1 = l3 + 1L;
        } while ((t1.i(paramArrayOfByte, l3) > -65) || (t1.i(paramArrayOfByte, l1) > -65));
        l3 = l1 + 1L;
        paramInt1 = paramInt2;
      }
      label812:
      return paramInt1;
    }
    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
  }
}

/* Location:
 * Qualified Name:     ma.u1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */