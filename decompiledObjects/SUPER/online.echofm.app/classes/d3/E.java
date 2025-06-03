package d3;

import c3.a;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.O;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.A;

public final class E
  implements a
{
  public static final byte[] c = new byte[0];
  public final A a;
  public final a b;
  
  public E(A paramA, a parama)
  {
    a = paramA;
    b = parama;
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = x.j(a).f();
    return c(b.a(arrayOfByte, c), ((a)x.f(a.a0(), arrayOfByte, a.class)).a(paramArrayOfByte1, paramArrayOfByte2));
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      Object localObject = ByteBuffer.wrap(paramArrayOfByte1);
      int i = ((ByteBuffer)localObject).getInt();
      if ((i > 0) && (i <= paramArrayOfByte1.length - 4))
      {
        byte[] arrayOfByte = new byte[i];
        ((ByteBuffer)localObject).get(arrayOfByte, 0, i);
        paramArrayOfByte1 = new byte[((Buffer)localObject).remaining()];
        ((ByteBuffer)localObject).get(paramArrayOfByte1, 0, ((Buffer)localObject).remaining());
        localObject = b.b(arrayOfByte, c);
        return ((a)x.f(a.a0(), (byte[])localObject, a.class)).b(paramArrayOfByte1, paramArrayOfByte2);
      }
    }
    catch (NegativeArraySizeException paramArrayOfByte1) {}catch (BufferUnderflowException paramArrayOfByte1) {}catch (IndexOutOfBoundsException paramArrayOfByte1) {}
    paramArrayOfByte1 = new java/security/GeneralSecurityException;
    paramArrayOfByte1.<init>("invalid ciphertext");
    throw paramArrayOfByte1;
    throw new GeneralSecurityException("invalid ciphertext", paramArrayOfByte1);
  }
  
  public final byte[] c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    return ByteBuffer.allocate(paramArrayOfByte1.length + 4 + paramArrayOfByte2.length).putInt(paramArrayOfByte1.length).put(paramArrayOfByte1).put(paramArrayOfByte2).array();
  }
}

/* Location:
 * Qualified Name:     d3.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */