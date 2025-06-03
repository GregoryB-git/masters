package c3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p3.C;
import p3.t;

public final class b
  implements p
{
  public final InputStream a;
  
  public b(InputStream paramInputStream)
  {
    a = paramInputStream;
  }
  
  public static p b(byte[] paramArrayOfByte)
  {
    return new b(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public t a()
  {
    try
    {
      t localt = t.Z(a, com.google.crypto.tink.shaded.protobuf.p.b());
      return localt;
    }
    finally
    {
      a.close();
    }
  }
  
  public C read()
  {
    try
    {
      C localC = C.e0(a, com.google.crypto.tink.shaded.protobuf.p.b());
      return localC;
    }
    finally
    {
      a.close();
    }
  }
}

/* Location:
 * Qualified Name:     c3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */