package Z0;

import g0.z;
import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class o
{
  public static byte[] a(UUID paramUUID, byte[] paramArrayOfByte)
  {
    return b(paramUUID, null, paramArrayOfByte);
  }
  
  public static byte[] b(UUID paramUUID, UUID[] paramArrayOfUUID, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      i = paramArrayOfByte.length;
    } else {
      i = 0;
    }
    int j = i + 32;
    int i = j;
    if (paramArrayOfUUID != null) {
      i = j + (paramArrayOfUUID.length * 16 + 4);
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putInt(i);
    localByteBuffer.putInt(1886614376);
    if (paramArrayOfUUID != null) {
      i = 16777216;
    } else {
      i = 0;
    }
    localByteBuffer.putInt(i);
    localByteBuffer.putLong(paramUUID.getMostSignificantBits());
    localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
    if (paramArrayOfUUID != null)
    {
      localByteBuffer.putInt(paramArrayOfUUID.length);
      j = paramArrayOfUUID.length;
      for (i = 0; i < j; i++)
      {
        paramUUID = paramArrayOfUUID[i];
        localByteBuffer.putLong(paramUUID.getMostSignificantBits());
        localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
      }
    }
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
    {
      localByteBuffer.putInt(paramArrayOfByte.length);
      localByteBuffer.put(paramArrayOfByte);
    }
    else
    {
      localByteBuffer.putInt(0);
    }
    return localByteBuffer.array();
  }
  
  public static boolean c(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (d(paramArrayOfByte) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static a d(byte[] paramArrayOfByte)
  {
    z localz = new z(paramArrayOfByte);
    if (localz.g() < 32) {
      return null;
    }
    localz.T(0);
    int i = localz.a();
    int j = localz.p();
    if (j != i)
    {
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("Advertised atom size (");
      paramArrayOfByte.append(j);
      localObject = ") does not match buffer size: ";
      paramArrayOfByte.append((String)localObject);
      paramArrayOfByte.append(i);
    }
    UUID localUUID;
    int k;
    for (;;)
    {
      g0.o.h("PsshAtomUtil", paramArrayOfByte.toString());
      return null;
      i = localz.p();
      if (i != 1886614376)
      {
        paramArrayOfByte = new StringBuilder();
        localObject = "Atom type is not pssh: ";
        break;
      }
      j = a.c(localz.p());
      if (j > 1)
      {
        paramArrayOfByte = new StringBuilder();
        localObject = "Unsupported pssh version: ";
        i = j;
        break;
      }
      localUUID = new UUID(localz.z(), localz.z());
      if (j == 1)
      {
        k = localz.K();
        localObject = new UUID[k];
        for (i = 0;; i++)
        {
          paramArrayOfByte = (byte[])localObject;
          if (i >= k) {
            break;
          }
          localObject[i] = new UUID(localz.z(), localz.z());
        }
      }
      paramArrayOfByte = null;
      k = localz.K();
      i = localz.a();
      if (k == i) {
        break label273;
      }
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("Atom data size (");
      paramArrayOfByte.append(k);
      paramArrayOfByte.append(") does not match the bytes left: ");
      paramArrayOfByte.append(i);
    }
    label273:
    Object localObject = new byte[k];
    localz.l((byte[])localObject, 0, k);
    return new a(localUUID, j, (byte[])localObject, paramArrayOfByte);
  }
  
  public static byte[] e(byte[] paramArrayOfByte, UUID paramUUID)
  {
    paramArrayOfByte = d(paramArrayOfByte);
    if (paramArrayOfByte == null) {
      return null;
    }
    if (!paramUUID.equals(a))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UUID mismatch. Expected: ");
      localStringBuilder.append(paramUUID);
      localStringBuilder.append(", got: ");
      localStringBuilder.append(a);
      localStringBuilder.append(".");
      g0.o.h("PsshAtomUtil", localStringBuilder.toString());
      return null;
    }
    return c;
  }
  
  public static UUID f(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = d(paramArrayOfByte);
    if (paramArrayOfByte == null) {
      return null;
    }
    return a;
  }
  
  public static int g(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = d(paramArrayOfByte);
    if (paramArrayOfByte == null) {
      return -1;
    }
    return b;
  }
  
  public static final class a
  {
    public final UUID a;
    public final int b;
    public final byte[] c;
    public final UUID[] d;
    
    public a(UUID paramUUID, int paramInt, byte[] paramArrayOfByte, UUID[] paramArrayOfUUID)
    {
      a = paramUUID;
      b = paramInt;
      c = paramArrayOfByte;
      d = paramArrayOfUUID;
    }
  }
}

/* Location:
 * Qualified Name:     Z0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */