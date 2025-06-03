package i3;

import c3.e;
import c3.v;
import c3.v.c;
import c3.w;
import c3.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import k3.g;
import n3.b;
import n3.b.a;

public class c
  implements w
{
  public static final Logger a = Logger.getLogger(c.class.getName());
  public static final c b = new c();
  
  public static void e()
  {
    x.n(b);
  }
  
  public Class a()
  {
    return e.class;
  }
  
  public Class c()
  {
    return e.class;
  }
  
  public e f(v paramv)
  {
    return new a(paramv);
  }
  
  public static class a
    implements e
  {
    public final v a;
    public final b.a b;
    public final b.a c;
    
    public a(v paramv)
    {
      a = paramv;
      if (paramv.i())
      {
        b localb = g.b().a();
        paramv = k3.f.a(paramv);
        b = localb.a(paramv, "daead", "encrypt");
        paramv = localb.a(paramv, "daead", "decrypt");
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
        paramArrayOfByte2 = q3.f.a(new byte[][] { a.e().b(), ((e)a.e().g()).a(paramArrayOfByte1, paramArrayOfByte2) });
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
      if (paramArrayOfByte1.length > 5)
      {
        localObject1 = Arrays.copyOf(paramArrayOfByte1, 5);
        localObject2 = Arrays.copyOfRange(paramArrayOfByte1, 5, paramArrayOfByte1.length);
        localObject1 = a.f((byte[])localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject3 = (v.c)((Iterator)localObject1).next();
          try
          {
            byte[] arrayOfByte1 = ((e)((v.c)localObject3).g()).b((byte[])localObject2, paramArrayOfByte2);
            c.b(((v.c)localObject3).d(), localObject2.length);
            return arrayOfByte1;
          }
          catch (GeneralSecurityException localGeneralSecurityException2)
          {
            Logger localLogger = c.d();
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("ciphertext prefix matches a key, but cannot decrypt: ");
            ((StringBuilder)localObject3).append(localGeneralSecurityException2);
            localLogger.info(((StringBuilder)localObject3).toString());
          }
        }
      }
      Object localObject2 = a.h().iterator();
      for (;;)
      {
        if (((Iterator)localObject2).hasNext()) {
          localObject1 = (v.c)((Iterator)localObject2).next();
        }
        try
        {
          byte[] arrayOfByte2 = ((e)((v.c)localObject1).g()).b(paramArrayOfByte1, paramArrayOfByte2);
          c.b(((v.c)localObject1).d(), paramArrayOfByte1.length);
          return arrayOfByte2;
        }
        catch (GeneralSecurityException localGeneralSecurityException1) {}
        c.a();
        throw new GeneralSecurityException("decryption failed");
      }
    }
  }
}

/* Location:
 * Qualified Name:     i3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */