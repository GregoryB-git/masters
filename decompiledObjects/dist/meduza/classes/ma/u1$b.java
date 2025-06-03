package ma;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class u1$b
{
  public static String b(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramByteBuffer.limit() - paramInt1 - paramInt2) >= 0)
    {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      int j;
      for (paramInt2 = 0; paramInt1 < i; paramInt2++)
      {
        j = paramByteBuffer.get(paramInt1);
        if (j >= 0) {
          k = 1;
        } else {
          k = 0;
        }
        if (k == 0) {
          break;
        }
        paramInt1++;
        arrayOfChar[paramInt2] = ((char)(char)j);
      }
      int k = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = k;
      while (paramInt2 < i)
      {
        k = paramInt2 + 1;
        byte b1 = paramByteBuffer.get(paramInt2);
        if (b1 >= 0) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if (paramInt2 != 0)
        {
          paramInt2 = paramInt1 + 1;
          arrayOfChar[paramInt1] = ((char)(char)b1);
          paramInt1 = paramInt2;
          for (;;)
          {
            j = paramInt1;
            paramInt1 = j;
            paramInt2 = k;
            if (k >= i) {
              break;
            }
            paramInt2 = paramByteBuffer.get(k);
            if (paramInt2 >= 0) {
              paramInt1 = 1;
            } else {
              paramInt1 = 0;
            }
            if (paramInt1 == 0)
            {
              paramInt1 = j;
              paramInt2 = k;
              break;
            }
            k++;
            paramInt1 = j + 1;
            arrayOfChar[j] = ((char)(char)paramInt2);
          }
        }
        if (b1 < -32) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if (paramInt2 != 0)
        {
          if (k < i)
          {
            u1.a.b(b1, paramByteBuffer.get(k), arrayOfChar, paramInt1);
            paramInt2 = k + 1;
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
          if (paramInt2 != 0)
          {
            if (k < i - 1)
            {
              paramInt2 = k + 1;
              u1.a.c(b1, paramByteBuffer.get(k), paramByteBuffer.get(paramInt2), arrayOfChar, paramInt1);
              paramInt2++;
              paramInt1++;
            }
            else
            {
              throw b0.c();
            }
          }
          else if (k < i - 2)
          {
            j = k + 1;
            byte b2 = paramByteBuffer.get(k);
            paramInt2 = j + 1;
            u1.a.a(b1, b2, paramByteBuffer.get(j), paramByteBuffer.get(paramInt2), arrayOfChar, paramInt1);
            paramInt1 = paramInt1 + 1 + 1;
            paramInt2++;
          }
          else
          {
            throw b0.c();
          }
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramByteBuffer.limit()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public abstract String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract String c(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2);
  
  public abstract int d(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract int e(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
}

/* Location:
 * Qualified Name:     ma.u1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */