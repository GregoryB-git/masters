package l3;

import c3.t;
import c3.v;
import c3.v.c;
import c3.w;
import c3.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import k3.g;
import n3.b;
import n3.b.a;
import p3.I;
import r3.a;

public class r
  implements w
{
  public static final Logger a = Logger.getLogger(r.class.getName());
  public static final byte[] b = { 0 };
  public static final r c = new r();
  
  public static void f()
  {
    x.n(c);
  }
  
  public Class a()
  {
    return t.class;
  }
  
  public Class c()
  {
    return t.class;
  }
  
  public final void g(v paramv)
  {
    Object localObject2;
    do
    {
      do
      {
        Iterator localIterator = paramv.c().iterator();
        while (!((Iterator)localObject1).hasNext())
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject1 = ((List)localIterator.next()).iterator();
        }
        localObject2 = (v.c)((Iterator)localObject1).next();
      } while (!(((v.c)localObject2).c() instanceof p));
      paramv = (p)((v.c)localObject2).c();
      localObject2 = a.a(((v.c)localObject2).b());
    } while (((a)localObject2).equals(paramv.a()));
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Mac Key with parameters ");
    ((StringBuilder)localObject1).append(paramv.b());
    ((StringBuilder)localObject1).append(" has wrong output prefix (");
    ((StringBuilder)localObject1).append(paramv.a());
    ((StringBuilder)localObject1).append(") instead of (");
    ((StringBuilder)localObject1).append(localObject2);
    ((StringBuilder)localObject1).append(")");
    throw new GeneralSecurityException(((StringBuilder)localObject1).toString());
  }
  
  public t h(v paramv)
  {
    g(paramv);
    return new b(paramv, null);
  }
  
  public static class b
    implements t
  {
    public final v a;
    public final b.a b;
    public final b.a c;
    
    public b(v paramv)
    {
      a = paramv;
      if (paramv.i())
      {
        b localb = g.b().a();
        paramv = k3.f.a(paramv);
        b = localb.a(paramv, "mac", "compute");
        paramv = localb.a(paramv, "mac", "verify");
      }
      for (;;)
      {
        c = paramv;
        break;
        paramv = k3.f.a;
        b = paramv;
      }
    }
    
    public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    {
      Object localObject1;
      Object localObject2;
      if (paramArrayOfByte1.length > 5)
      {
        localObject1 = Arrays.copyOf(paramArrayOfByte1, 5);
        localObject2 = Arrays.copyOfRange(paramArrayOfByte1, 5, paramArrayOfByte1.length);
        Iterator localIterator = a.f((byte[])localObject1).iterator();
        while (localIterator.hasNext())
        {
          Object localObject3 = (v.c)localIterator.next();
          if (((v.c)localObject3).f().equals(I.r)) {
            localObject1 = q3.f.a(new byte[][] { paramArrayOfByte2, r.d() });
          } else {
            localObject1 = paramArrayOfByte2;
          }
          try
          {
            ((t)((v.c)localObject3).g()).a((byte[])localObject2, (byte[])localObject1);
            c.b(((v.c)localObject3).d(), localObject1.length);
            return;
          }
          catch (GeneralSecurityException localGeneralSecurityException2)
          {
            localObject1 = r.e();
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("tag prefix matches a key, but cannot verify: ");
            ((StringBuilder)localObject3).append(localGeneralSecurityException2);
            ((Logger)localObject1).info(((StringBuilder)localObject3).toString());
          }
        }
        localObject1 = a.h().iterator();
      }
      for (;;)
      {
        if (((Iterator)localObject1).hasNext()) {
          localObject2 = (v.c)((Iterator)localObject1).next();
        }
        try
        {
          ((t)((v.c)localObject2).g()).a(paramArrayOfByte1, paramArrayOfByte2);
          c.b(((v.c)localObject2).d(), paramArrayOfByte2.length);
          return;
        }
        catch (GeneralSecurityException localGeneralSecurityException1) {}
        c.a();
        throw new GeneralSecurityException("invalid MAC");
        c.a();
        throw new GeneralSecurityException("tag too short");
      }
    }
    
    public byte[] b(byte[] paramArrayOfByte)
    {
      byte[] arrayOfByte = paramArrayOfByte;
      if (a.e().f().equals(I.r)) {
        arrayOfByte = q3.f.a(new byte[][] { paramArrayOfByte, r.d() });
      }
      try
      {
        paramArrayOfByte = q3.f.a(new byte[][] { a.e().b(), ((t)a.e().g()).b(arrayOfByte) });
        b.b(a.e().d(), arrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (GeneralSecurityException paramArrayOfByte)
      {
        b.a();
        throw paramArrayOfByte;
      }
    }
  }
}

/* Location:
 * Qualified Name:     l3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */