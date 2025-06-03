package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import z2;

public final class aiy
{
  private final ByteBuffer a;
  
  private aiy(ByteBuffer paramByteBuffer)
  {
    a = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private aiy(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static aiy a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new aiy(paramArrayOfByte, 0, paramInt2);
  }
  
  private final void a(int paramInt)
    throws IOException
  {
    byte b = (byte)paramInt;
    if (a.hasRemaining())
    {
      a.put(b);
      return;
    }
    throw new aix(a.position(), a.limit());
  }
  
  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.isReadOnly())
    {
      boolean bool = paramByteBuffer.hasArray();
      int i = 0;
      int j = 0;
      char c;
      if (bool) {
        try
        {
          byte[] arrayOfByte = paramByteBuffer.array();
          i = paramByteBuffer.arrayOffset() + paramByteBuffer.position();
          k = paramByteBuffer.remaining();
          int m = paramCharSequence.length();
          int n = k + i;
          int i1;
          while (j < m)
          {
            k = j + i;
            if (k >= n) {
              break;
            }
            i1 = paramCharSequence.charAt(j);
            if (i1 >= 128) {
              break;
            }
            arrayOfByte[k] = ((byte)(byte)i1);
            j++;
          }
          if (j == m)
          {
            k = i + m;
          }
          else
          {
            i += j;
            int i2;
            for (;;)
            {
              k = i;
              if (j >= m) {
                break label582;
              }
              i2 = paramCharSequence.charAt(j);
              if ((i2 < 128) && (i < n))
              {
                k = i + 1;
                arrayOfByte[i] = ((byte)(byte)i2);
                i = k;
              }
              else if ((i2 < 2048) && (i <= n - 2))
              {
                k = i + 1;
                arrayOfByte[i] = ((byte)(byte)(i2 >>> 6 | 0x3C0));
                i = k + 1;
                arrayOfByte[k] = ((byte)(byte)(i2 & 0x3F | 0x80));
              }
              else if (((i2 < 55296) || (57343 < i2)) && (i <= n - 3))
              {
                i1 = i + 1;
                arrayOfByte[i] = ((byte)(byte)(i2 >>> 12 | 0x1E0));
                k = i1 + 1;
                arrayOfByte[i1] = ((byte)(byte)(i2 >>> 6 & 0x3F | 0x80));
                i = k + 1;
                arrayOfByte[k] = ((byte)(byte)(i2 & 0x3F | 0x80));
              }
              break label481;
              if (i > n - 4) {
                break label531;
              }
              k = j + 1;
              if (k == paramCharSequence.length()) {
                break label491;
              }
              c = paramCharSequence.charAt(k);
              if (!Character.isSurrogatePair(i2, c)) {
                break;
              }
              j = Character.toCodePoint(i2, c);
              i1 = i + 1;
              arrayOfByte[i] = ((byte)(byte)(j >>> 18 | 0xF0));
              i = i1 + 1;
              arrayOfByte[i1] = ((byte)(byte)(j >>> 12 & 0x3F | 0x80));
              i1 = i + 1;
              arrayOfByte[i] = ((byte)(byte)(j >>> 6 & 0x3F | 0x80));
              i = i1 + 1;
              arrayOfByte[i1] = ((byte)(byte)(j & 0x3F | 0x80));
              j = k;
              label481:
              j++;
            }
            j = k;
            label491:
            paramCharSequence = new java/lang/IllegalArgumentException;
            paramByteBuffer = new java/lang/StringBuilder;
            paramByteBuffer.<init>(39);
            paramByteBuffer.append("Unpaired surrogate at index ");
            paramByteBuffer.append(j - 1);
            paramCharSequence.<init>(paramByteBuffer.toString());
            throw paramCharSequence;
            label531:
            paramByteBuffer = new java/lang/ArrayIndexOutOfBoundsException;
            paramCharSequence = new java/lang/StringBuilder;
            paramCharSequence.<init>(37);
            paramCharSequence.append("Failed writing ");
            paramCharSequence.append(i2);
            paramCharSequence.append(" at index ");
            paramCharSequence.append(i);
            paramByteBuffer.<init>(paramCharSequence.toString());
            throw paramByteBuffer;
          }
          label582:
          paramByteBuffer.position(k - paramByteBuffer.arrayOffset());
          return;
        }
        catch (ArrayIndexOutOfBoundsException paramByteBuffer)
        {
          paramCharSequence = new BufferOverflowException();
          paramCharSequence.initCause(paramByteBuffer);
          throw paramCharSequence;
        }
      }
      int k = paramCharSequence.length();
      for (j = i; j < k; j++)
      {
        int i3 = paramCharSequence.charAt(j);
        if (i3 < 128)
        {
          paramByteBuffer.put((byte)i3);
        }
        else if (i3 < 2048)
        {
          paramByteBuffer.put((byte)(i3 >>> 6 | 0x3C0));
          paramByteBuffer.put((byte)(i3 & 0x3F | 0x80));
        }
        else if ((i3 >= 55296) && (57343 >= i3))
        {
          i = j + 1;
          if (i != paramCharSequence.length())
          {
            c = paramCharSequence.charAt(i);
            if (Character.isSurrogatePair(i3, c))
            {
              j = Character.toCodePoint(i3, c);
              paramByteBuffer.put((byte)(j >>> 18 | 0xF0));
              paramByteBuffer.put((byte)(j >>> 12 & 0x3F | 0x80));
              paramByteBuffer.put((byte)(j >>> 6 & 0x3F | 0x80));
              paramByteBuffer.put((byte)(j & 0x3F | 0x80));
              j = i;
            }
            else
            {
              j = i;
            }
          }
          else
          {
            throw new IllegalArgumentException(z2.k(39, "Unpaired surrogate at index ", j - 1));
          }
        }
        else
        {
          paramByteBuffer.put((byte)(i3 >>> 12 | 0x1E0));
          paramByteBuffer.put((byte)(i3 >>> 6 & 0x3F | 0x80));
          paramByteBuffer.put((byte)(i3 & 0x3F | 0x80));
        }
      }
      return;
    }
    throw new ReadOnlyBufferException();
  }
  
  private final void b(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        a(paramInt);
        return;
      }
      a(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  private static int c(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  public final int a()
  {
    return a.remaining();
  }
  
  public final void a(byte paramByte)
    throws IOException
  {
    if (a.hasRemaining())
    {
      a.put(paramByte);
      return;
    }
    throw new aix(a.position(), a.limit());
  }
  
  public final void a(int paramInt1, int paramInt2)
    throws IOException
  {
    b(paramInt1 << 3 | paramInt2);
  }
  
  public final void a(String paramString)
    throws IOException
  {
    try
    {
      int i = c(paramString.length());
      if (i == c(paramString.length() * 3))
      {
        j = a.position();
        if (a.remaining() >= i)
        {
          a.position(j + i);
          a(paramString, a);
          k = a.position();
          a.position(j);
          b(k - j - i);
          a.position(k);
          return;
        }
        paramString = new com/google/ads/interactivemedia/v3/internal/aix;
        paramString.<init>(j + i, a.limit());
        throw paramString;
      }
      int m = paramString.length();
      int n = 0;
      for (int j = 0; (j < m) && (paramString.charAt(j) < ''); j++) {}
      i = m;
      for (;;)
      {
        k = i;
        if (j >= m) {
          break label356;
        }
        k = paramString.charAt(j);
        if (k >= 2048) {
          break;
        }
        i += (127 - k >>> 31);
        j++;
      }
      int i1 = paramString.length();
      int k = n;
      while (j < i1)
      {
        int i2 = paramString.charAt(j);
        if (i2 < 2048)
        {
          k += (127 - i2 >>> 31);
          n = j;
        }
        else
        {
          int i3 = k + 2;
          k = i3;
          n = j;
          if (55296 <= i2)
          {
            k = i3;
            n = j;
            if (i2 <= 57343) {
              if (Character.codePointAt(paramString, j) >= 65536)
              {
                n = j + 1;
                k = i3;
              }
              else
              {
                localIllegalArgumentException = new java/lang/IllegalArgumentException;
                paramString = new java/lang/StringBuilder;
                paramString.<init>(39);
                paramString.append("Unpaired surrogate at index ");
                paramString.append(j);
                localIllegalArgumentException.<init>(paramString.toString());
                throw localIllegalArgumentException;
              }
            }
          }
        }
        j = n + 1;
      }
      k = i + k;
      label356:
      if (k >= m)
      {
        b(k);
        a(paramString, a);
        return;
      }
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      long l = k;
      paramString = new java/lang/StringBuilder;
      paramString.<init>(54);
      paramString.append("UTF-8 length does not fit in int: ");
      paramString.append(l + 4294967296L);
      localIllegalArgumentException.<init>(paramString.toString());
      throw localIllegalArgumentException;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      paramString = new aix(a.position(), a.limit());
      paramString.initCause(localBufferOverflowException);
      throw paramString;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aiy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */