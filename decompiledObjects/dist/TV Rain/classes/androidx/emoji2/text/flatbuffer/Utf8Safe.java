package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import z2;

public final class Utf8Safe
  extends Utf8
{
  private static int computeEncodedLength(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    for (int j = 0; (j < i) && (paramCharSequence.charAt(j) < ''); j++) {}
    int k = i;
    for (;;)
    {
      m = k;
      if (j >= i) {
        break label86;
      }
      m = paramCharSequence.charAt(j);
      if (m >= 2048) {
        break;
      }
      k += (127 - m >>> 31);
      j++;
    }
    int m = k + encodedLengthGeneral(paramCharSequence, j);
    label86:
    if (m >= i) {
      return m;
    }
    paramCharSequence = z2.t("UTF-8 length does not fit in int: ");
    paramCharSequence.append(m + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  public static String decodeUtf8Array(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
    {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      byte b1;
      for (paramInt2 = 0; paramInt1 < i; paramInt2++)
      {
        b1 = paramArrayOfByte[paramInt1];
        if (!Utf8.DecodeUtil.isOneByte(b1)) {
          break;
        }
        paramInt1++;
        Utf8.DecodeUtil.handleOneByte(b1, arrayOfChar, paramInt2);
      }
      int j = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = j;
      while (paramInt2 < i)
      {
        j = paramInt2 + 1;
        byte b2 = paramArrayOfByte[paramInt2];
        if (Utf8.DecodeUtil.isOneByte(b2))
        {
          paramInt2 = paramInt1 + 1;
          Utf8.DecodeUtil.handleOneByte(b2, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = j;
          while (paramInt2 < i)
          {
            b1 = paramArrayOfByte[paramInt2];
            if (!Utf8.DecodeUtil.isOneByte(b1)) {
              break;
            }
            paramInt2++;
            Utf8.DecodeUtil.handleOneByte(b1, arrayOfChar, paramInt1);
            paramInt1++;
          }
        }
        else if (Utf8.DecodeUtil.isTwoBytes(b2))
        {
          if (j < i)
          {
            Utf8.DecodeUtil.handleTwoBytes(b2, paramArrayOfByte[j], arrayOfChar, paramInt1);
            paramInt2 = j + 1;
            paramInt1++;
          }
          else
          {
            throw new IllegalArgumentException("Invalid UTF-8");
          }
        }
        else if (Utf8.DecodeUtil.isThreeBytes(b2))
        {
          if (j < i - 1)
          {
            paramInt2 = j + 1;
            Utf8.DecodeUtil.handleThreeBytes(b2, paramArrayOfByte[j], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
          }
          else
          {
            throw new IllegalArgumentException("Invalid UTF-8");
          }
        }
        else if (j < i - 2)
        {
          paramInt2 = j + 1;
          b1 = paramArrayOfByte[j];
          j = paramInt2 + 1;
          Utf8.DecodeUtil.handleFourBytes(b2, b1, paramArrayOfByte[paramInt2], paramArrayOfByte[j], arrayOfChar, paramInt1);
          paramInt2 = j + 1;
          paramInt1 = paramInt1 + 1 + 1;
        }
        else
        {
          throw new IllegalArgumentException("Invalid UTF-8");
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public static String decodeUtf8Buffer(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramByteBuffer.limit() - paramInt1 - paramInt2) >= 0)
    {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      byte b1;
      for (paramInt2 = 0; paramInt1 < i; paramInt2++)
      {
        b1 = paramByteBuffer.get(paramInt1);
        if (!Utf8.DecodeUtil.isOneByte(b1)) {
          break;
        }
        paramInt1++;
        Utf8.DecodeUtil.handleOneByte(b1, arrayOfChar, paramInt2);
      }
      int j = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = j;
      while (paramInt2 < i)
      {
        j = paramInt2 + 1;
        byte b2 = paramByteBuffer.get(paramInt2);
        if (Utf8.DecodeUtil.isOneByte(b2))
        {
          paramInt2 = paramInt1 + 1;
          Utf8.DecodeUtil.handleOneByte(b2, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = j;
          while (paramInt2 < i)
          {
            b1 = paramByteBuffer.get(paramInt2);
            if (!Utf8.DecodeUtil.isOneByte(b1)) {
              break;
            }
            paramInt2++;
            Utf8.DecodeUtil.handleOneByte(b1, arrayOfChar, paramInt1);
            paramInt1++;
          }
        }
        else if (Utf8.DecodeUtil.isTwoBytes(b2))
        {
          if (j < i)
          {
            Utf8.DecodeUtil.handleTwoBytes(b2, paramByteBuffer.get(j), arrayOfChar, paramInt1);
            paramInt2 = j + 1;
            paramInt1++;
          }
          else
          {
            throw new IllegalArgumentException("Invalid UTF-8");
          }
        }
        else if (Utf8.DecodeUtil.isThreeBytes(b2))
        {
          if (j < i - 1)
          {
            paramInt2 = j + 1;
            Utf8.DecodeUtil.handleThreeBytes(b2, paramByteBuffer.get(j), paramByteBuffer.get(paramInt2), arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
          }
          else
          {
            throw new IllegalArgumentException("Invalid UTF-8");
          }
        }
        else if (j < i - 2)
        {
          paramInt2 = j + 1;
          b1 = paramByteBuffer.get(j);
          j = paramInt2 + 1;
          Utf8.DecodeUtil.handleFourBytes(b2, b1, paramByteBuffer.get(paramInt2), paramByteBuffer.get(j), arrayOfChar, paramInt1);
          paramInt2 = j + 1;
          paramInt1 = paramInt1 + 1 + 1;
        }
        else
        {
          throw new IllegalArgumentException("Invalid UTF-8");
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramByteBuffer.limit()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  private static int encodeUtf8Array(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    int j = paramInt2 + paramInt1;
    int k;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      k = paramInt2 + paramInt1;
      if (k >= j) {
        break;
      }
      m = paramCharSequence.charAt(paramInt2);
      if (m >= 128) {
        break;
      }
      paramArrayOfByte[k] = ((byte)(byte)m);
    }
    if (paramInt2 == i) {
      return paramInt1 + i;
    }
    int m = paramInt1 + paramInt2;
    paramInt1 = paramInt2;
    while (paramInt1 < i)
    {
      int n = paramCharSequence.charAt(paramInt1);
      if ((n < 128) && (m < j))
      {
        paramInt2 = m + 1;
        paramArrayOfByte[m] = ((byte)(byte)n);
      }
      for (;;)
      {
        break;
        if ((n < 2048) && (m <= j - 2))
        {
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n >>> 6 | 0x3C0));
          paramInt2 = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(n & 0x3F | 0x80));
        }
        else if (((n < 55296) || (57343 < n)) && (m <= j - 3))
        {
          paramInt2 = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n >>> 12 | 0x1E0));
          m = paramInt2 + 1;
          paramArrayOfByte[paramInt2] = ((byte)(byte)(n >>> 6 & 0x3F | 0x80));
          paramInt2 = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(n & 0x3F | 0x80));
        }
        else
        {
          if (m > j - 4) {
            break label442;
          }
          paramInt2 = paramInt1 + 1;
          if (paramInt2 == paramCharSequence.length()) {
            break label429;
          }
          char c = paramCharSequence.charAt(paramInt2);
          if (!Character.isSurrogatePair(n, c)) {
            break label427;
          }
          paramInt1 = Character.toCodePoint(n, c);
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 18 | 0xF0));
          m = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(paramInt1 >>> 12 & 0x3F | 0x80));
          k = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 6 & 0x3F | 0x80));
          m = k + 1;
          paramArrayOfByte[k] = ((byte)(byte)(paramInt1 & 0x3F | 0x80));
          paramInt1 = paramInt2;
          paramInt2 = m;
        }
      }
      paramInt1++;
      m = paramInt2;
      continue;
      label427:
      paramInt1 = paramInt2;
      label429:
      throw new UnpairedSurrogateException(paramInt1 - 1, i);
      label442:
      if ((55296 <= n) && (n <= 57343))
      {
        paramInt2 = paramInt1 + 1;
        if ((paramInt2 == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(paramInt2)))) {
          throw new UnpairedSurrogateException(paramInt1, i);
        }
      }
      paramCharSequence = new StringBuilder();
      paramCharSequence.append("Failed writing ");
      paramCharSequence.append(n);
      paramCharSequence.append(" at index ");
      paramCharSequence.append(m);
      throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    }
    return m;
  }
  
  private static void encodeUtf8Buffer(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = paramCharSequence.length();
    int j = paramByteBuffer.position();
    k = 0;
    if (k < i)
    {
      m = j;
      n = k;
    }
    for (;;)
    {
      try
      {
        i1 = paramCharSequence.charAt(k);
        if (i1 < 128)
        {
          m = j;
          n = k;
          paramByteBuffer.put(j + k, (byte)i1);
          k++;
          break;
        }
        if (k == i)
        {
          m = j;
          n = k;
          paramByteBuffer.position(j + k);
          return;
        }
        j += k;
        if (k < i)
        {
          m = j;
          n = k;
          i2 = paramCharSequence.charAt(k);
          if (i2 < 128)
          {
            m = j;
            n = k;
            paramByteBuffer.put(j, (byte)i2);
          }
          else if (i2 < 2048)
          {
            m = j + 1;
            b = (byte)(i2 >>> 6 | 0xC0);
            n = m;
            try
            {
              paramByteBuffer.put(j, b);
              n = m;
              paramByteBuffer.put(m, (byte)(i2 & 0x3F | 0x80));
              j = m;
            }
            catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
            {
              m = n;
              continue;
            }
          }
          else if ((i2 >= 55296) && (57343 >= i2))
          {
            n = k + 1;
            if (n != i) {
              k = j;
            }
          }
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException3)
      {
        int i1;
        int i2;
        byte b;
        char c;
        UnpairedSurrogateException localUnpairedSurrogateException;
        k = n;
        continue;
      }
      try
      {
        c = paramCharSequence.charAt(n);
        k = j;
        if (Character.isSurrogatePair(i2, c))
        {
          k = j;
          int i3 = Character.toCodePoint(i2, c);
          i1 = j + 1;
          b = (byte)(i3 >>> 18 | 0xF0);
          k = i1;
          try
          {
            paramByteBuffer.put(j, b);
            m = i1 + 1;
            b = (byte)(i3 >>> 12 & 0x3F | 0x80);
            k = m;
            paramByteBuffer.put(i1, b);
            j = m + 1;
            b = (byte)(i3 >>> 6 & 0x3F | 0x80);
            k = j;
            paramByteBuffer.put(m, b);
            k = j;
            paramByteBuffer.put(j, (byte)(i3 & 0x3F | 0x80));
            k = n;
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
          {
            continue;
          }
        }
        else
        {
          k = n;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException4)
      {
        continue;
      }
      m = k;
      k = n;
      continue;
      m = j;
      n = k;
      localUnpairedSurrogateException = new androidx/emoji2/text/flatbuffer/Utf8Safe$UnpairedSurrogateException;
      m = j;
      n = k;
      localUnpairedSurrogateException.<init>(k, i);
      m = j;
      n = k;
      throw localUnpairedSurrogateException;
      i1 = j + 1;
      b = (byte)(i2 >>> 12 | 0xE0);
      n = i1;
      paramByteBuffer.put(j, b);
      j = i1 + 1;
      b = (byte)(i2 >>> 6 & 0x3F | 0x80);
      m = j;
      n = k;
      paramByteBuffer.put(i1, b);
      m = j;
      n = k;
      paramByteBuffer.put(j, (byte)(i2 & 0x3F | 0x80));
      k++;
      j++;
    }
    int m = j;
    n = k;
    paramByteBuffer.position(j);
    return;
    j = paramByteBuffer.position();
    n = Math.max(k, m - paramByteBuffer.position() + 1);
    paramByteBuffer = z2.t("Failed writing ");
    paramByteBuffer.append(paramCharSequence.charAt(k));
    paramByteBuffer.append(" at index ");
    paramByteBuffer.append(n + j);
    throw new ArrayIndexOutOfBoundsException(paramByteBuffer.toString());
  }
  
  private static int encodedLengthGeneral(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = 0;
    while (paramInt < i)
    {
      int k = paramCharSequence.charAt(paramInt);
      int m;
      if (k < 2048)
      {
        j += (127 - k >>> 31);
        m = paramInt;
      }
      else
      {
        int n = j + 2;
        j = n;
        m = paramInt;
        if (55296 <= k)
        {
          j = n;
          m = paramInt;
          if (k <= 57343) {
            if (Character.codePointAt(paramCharSequence, paramInt) >= 65536)
            {
              m = paramInt + 1;
              j = n;
            }
            else
            {
              throw new UnpairedSurrogateException(paramInt, i);
            }
          }
        }
      }
      paramInt = m + 1;
    }
    return j;
  }
  
  public String decodeUtf8(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
    throws IllegalArgumentException
  {
    if (paramByteBuffer.hasArray()) {
      return decodeUtf8Array(paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramInt1, paramInt2);
    }
    return decodeUtf8Buffer(paramByteBuffer, paramInt1, paramInt2);
  }
  
  public void encodeUtf8(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.hasArray())
    {
      int i = paramByteBuffer.arrayOffset();
      paramByteBuffer.position(encodeUtf8Array(paramCharSequence, paramByteBuffer.array(), paramByteBuffer.position() + i, paramByteBuffer.remaining()) - i);
    }
    else
    {
      encodeUtf8Buffer(paramCharSequence, paramByteBuffer);
    }
  }
  
  public int encodedLength(CharSequence paramCharSequence)
  {
    return computeEncodedLength(paramCharSequence);
  }
  
  public static class UnpairedSurrogateException
    extends IllegalArgumentException
  {
    public UnpairedSurrogateException(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8Safe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */