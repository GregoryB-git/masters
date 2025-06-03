package Q0;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class c
{
  public final ByteArrayOutputStream a;
  public final DataOutputStream b;
  
  public c()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(512);
    a = localByteArrayOutputStream;
    b = new DataOutputStream(localByteArrayOutputStream);
  }
  
  public static void b(DataOutputStream paramDataOutputStream, String paramString)
  {
    paramDataOutputStream.writeBytes(paramString);
    paramDataOutputStream.writeByte(0);
  }
  
  public byte[] a(a parama)
  {
    a.reset();
    try
    {
      b(b, o);
      String str = p;
      if (str == null) {
        str = "";
      }
      b(b, str);
      b.writeLong(q);
      b.writeLong(r);
      b.write(s);
      b.flush();
      parama = a.toByteArray();
      return parama;
    }
    catch (IOException parama)
    {
      throw new RuntimeException(parama);
    }
  }
}

/* Location:
 * Qualified Name:     Q0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */