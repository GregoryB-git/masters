package d3;

import c3.a;
import c3.v;
import c3.v.c;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import k3.g;
import n3.b;
import n3.b.a;

public class d$b
  implements a
{
  public final v a;
  public final b.a b;
  public final b.a c;
  
  public d$b(v paramv)
  {
    a = paramv;
    if (paramv.i())
    {
      b localb = g.b().a();
      paramv = k3.f.a(paramv);
      b = localb.a(paramv, "aead", "encrypt");
      paramv = localb.a(paramv, "aead", "decrypt");
    }
    for (;;)
    {
      c = paramv;
      break;
      paramv = k3.f.a;
      b = paramv;
    }
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      paramArrayOfByte2 = q3.f.a(new byte[][] { a.e().b(), ((a)a.e().g()).a(paramArrayOfByte1, paramArrayOfByte2) });
      b.b(a.e().d(), paramArrayOfByte1.length);
      return paramArrayOfByte2;
    }
    catch (GeneralSecurityException paramArrayOfByte1)
    {
      b.a();
      throw paramArrayOfByte1;
    }
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Object localObject1;
    Object localObject3;
    if (paramArrayOfByte1.length > 5)
    {
      localObject1 = Arrays.copyOf(paramArrayOfByte1, 5);
      localObject2 = Arrays.copyOfRange(paramArrayOfByte1, 5, paramArrayOfByte1.length);
      localObject1 = a.f((byte[])localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (v.c)((Iterator)localObject1).next();
        try
        {
          byte[] arrayOfByte = ((a)((v.c)localObject3).g()).b((byte[])localObject2, paramArrayOfByte2);
          c.b(((v.c)localObject3).d(), localObject2.length);
          return arrayOfByte;
        }
        catch (GeneralSecurityException localGeneralSecurityException2)
        {
          localObject3 = d.d();
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("ciphertext prefix matches a key, but cannot decrypt: ");
          localStringBuilder.append(localGeneralSecurityException2);
          ((Logger)localObject3).info(localStringBuilder.toString());
        }
      }
    }
    Object localObject2 = a.h().iterator();
    for (;;)
    {
      if (((Iterator)localObject2).hasNext()) {
        localObject3 = (v.c)((Iterator)localObject2).next();
      }
      try
      {
        localObject1 = ((a)((v.c)localObject3).g()).b(paramArrayOfByte1, paramArrayOfByte2);
        c.b(((v.c)localObject3).d(), paramArrayOfByte1.length);
        return (byte[])localObject1;
      }
      catch (GeneralSecurityException localGeneralSecurityException1) {}
      c.a();
      throw new GeneralSecurityException("decryption failed");
    }
  }
}

/* Location:
 * Qualified Name:     d3.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */