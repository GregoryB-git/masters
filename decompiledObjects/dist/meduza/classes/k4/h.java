package k4;

import f;
import java.nio.ByteBuffer;
import java.util.UUID;
import v5.m;
import v5.u;

public final class h
{
  public static byte[] a(UUID paramUUID, UUID[] paramArrayOfUUID, byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte != null) {
      j = paramArrayOfByte.length;
    } else {
      j = 0;
    }
    int k = j + 32;
    int j = k;
    if (paramArrayOfUUID != null) {
      j = k + (paramArrayOfUUID.length * 16 + 4);
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(j);
    localByteBuffer.putInt(j);
    localByteBuffer.putInt(1886614376);
    if (paramArrayOfUUID != null) {
      j = 16777216;
    } else {
      j = 0;
    }
    localByteBuffer.putInt(j);
    localByteBuffer.putLong(paramUUID.getMostSignificantBits());
    localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
    if (paramArrayOfUUID != null)
    {
      localByteBuffer.putInt(paramArrayOfUUID.length);
      k = paramArrayOfUUID.length;
      for (j = i; j < k; j++)
      {
        paramUUID = paramArrayOfUUID[j];
        localByteBuffer.putLong(paramUUID.getMostSignificantBits());
        localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
      }
    }
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
    {
      localByteBuffer.putInt(paramArrayOfByte.length);
      localByteBuffer.put(paramArrayOfByte);
    }
    return localByteBuffer.array();
  }
  
  public static a b(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new u(paramArrayOfByte);
    if (c < 32) {
      return null;
    }
    paramArrayOfByte.G(0);
    if (paramArrayOfByte.f() != c - b + 4) {
      return null;
    }
    if (paramArrayOfByte.f() != 1886614376) {
      return null;
    }
    int i = paramArrayOfByte.f() >> 24 & 0xFF;
    if (i > 1)
    {
      f.p("Unsupported pssh version: ", i, "PsshAtomUtil");
      return null;
    }
    UUID localUUID = new UUID(paramArrayOfByte.o(), paramArrayOfByte.o());
    if (i == 1) {
      paramArrayOfByte.H(paramArrayOfByte.y() * 16);
    }
    int j = paramArrayOfByte.y();
    if (j != c - b) {
      return null;
    }
    byte[] arrayOfByte = new byte[j];
    paramArrayOfByte.d(arrayOfByte, 0, j);
    return new a(localUUID, i, arrayOfByte);
  }
  
  public static byte[] c(UUID paramUUID, byte[] paramArrayOfByte)
  {
    a locala = b(paramArrayOfByte);
    if (locala == null) {
      return null;
    }
    if (!paramUUID.equals(a))
    {
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("UUID mismatch. Expected: ");
      paramArrayOfByte.append(paramUUID);
      paramArrayOfByte.append(", got: ");
      paramArrayOfByte.append(a);
      paramArrayOfByte.append(".");
      m.f("PsshAtomUtil", paramArrayOfByte.toString());
      return null;
    }
    return c;
  }
  
  public static final class a
  {
    public final UUID a;
    public final int b;
    public final byte[] c;
    
    public a(UUID paramUUID, int paramInt, byte[] paramArrayOfByte)
    {
      a = paramUUID;
      b = paramInt;
      c = paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     k4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */