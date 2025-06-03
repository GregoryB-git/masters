package eb;

import java.io.Serializable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import n7.d;

public final class e1$c
  implements s0.g<String>
{
  public static final byte[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  
  public final byte[] a(Serializable paramSerializable)
  {
    byte[] arrayOfByte1 = ((String)paramSerializable).getBytes(d.c);
    for (int i = 0;; i++)
    {
      paramSerializable = arrayOfByte1;
      if (i >= arrayOfByte1.length) {
        break;
      }
      int j = arrayOfByte1[i];
      if ((j >= 32) && (j < 126) && (j != 37)) {
        j = 0;
      } else {
        j = 1;
      }
      if (j != 0)
      {
        byte[] arrayOfByte2 = new byte[(arrayOfByte1.length - i) * 3 + i];
        if (i != 0) {
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
        }
        int k = i;
        j = i;
        while (j < arrayOfByte1.length)
        {
          int m = arrayOfByte1[j];
          if ((m >= 32) && (m < 126) && (m != 37)) {
            i = 0;
          } else {
            i = 1;
          }
          if (i != 0)
          {
            arrayOfByte2[k] = ((byte)37);
            paramSerializable = a;
            arrayOfByte2[(k + 1)] = ((byte)paramSerializable[(m >> 4 & 0xF)]);
            arrayOfByte2[(k + 2)] = ((byte)paramSerializable[(m & 0xF)]);
            i = k + 3;
          }
          else
          {
            arrayOfByte2[k] = ((byte)m);
            i = k + 1;
          }
          j++;
          k = i;
        }
        paramSerializable = Arrays.copyOf(arrayOfByte2, k);
        break;
      }
    }
    return paramSerializable;
  }
  
  public final Object b(byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i];
      if ((j >= 32) && (j < 126) && ((j != 37) || (i + 2 >= paramArrayOfByte.length)))
      {
        i++;
      }
      else
      {
        ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length);
        for (i = 0;; i++)
        {
          for (;;)
          {
            if ((i >= paramArrayOfByte.length) || ((paramArrayOfByte[i] == 37) && (i + 2 < paramArrayOfByte.length))) {}
            try
            {
              String str = new java/lang/String;
              str.<init>(paramArrayOfByte, i + 1, 2, d.a);
              localByteBuffer.put((byte)Integer.parseInt(str, 16));
              i += 3;
            }
            catch (NumberFormatException localNumberFormatException)
            {
              for (;;) {}
            }
          }
          localByteBuffer.put(paramArrayOfByte[i]);
        }
        paramArrayOfByte = new String(localByteBuffer.array(), 0, localByteBuffer.position(), d.c);
        break label166;
      }
    }
    paramArrayOfByte = new String(paramArrayOfByte, 0);
    label166:
    return paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     eb.e1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */