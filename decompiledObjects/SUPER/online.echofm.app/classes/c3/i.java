package c3;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.Set;
import k3.d;
import k3.d.a;
import p3.y;
import p3.y.b;

public class i
  implements h
{
  public final d a;
  public final Class b;
  
  public i(d paramd, Class paramClass)
  {
    if ((!paramd.i().contains(paramClass)) && (!Void.class.equals(paramClass))) {
      throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[] { paramd.toString(), paramClass.getName() }));
    }
    a = paramd;
    b = paramClass;
  }
  
  public final Object a(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    try
    {
      paramh = f(a.h(paramh));
      return paramh;
    }
    catch (A localA)
    {
      paramh = new StringBuilder();
      paramh.append("Failures parsing proto of type ");
      paramh.append(a.c().getName());
      throw new GeneralSecurityException(paramh.toString(), localA);
    }
  }
  
  public final O b(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    try
    {
      paramh = e().a(paramh);
      return paramh;
    }
    catch (A localA)
    {
      paramh = new StringBuilder();
      paramh.append("Failures parsing proto of type ");
      paramh.append(a.f().b().getName());
      throw new GeneralSecurityException(paramh.toString(), localA);
    }
  }
  
  public final y c(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    try
    {
      paramh = e().a(paramh);
      paramh = (y)y.c0().z(d()).A(paramh.j()).y(a.g()).n();
      return paramh;
    }
    catch (A paramh)
    {
      throw new GeneralSecurityException("Unexpected proto", paramh);
    }
  }
  
  public final String d()
  {
    return a.d();
  }
  
  public final a e()
  {
    return new a(a.f());
  }
  
  public final Object f(O paramO)
  {
    if (!Void.class.equals(b))
    {
      a.j(paramO);
      return a.e(paramO, b);
    }
    throw new GeneralSecurityException("Cannot create a primitive for Void");
  }
  
  public static class a
  {
    public final d.a a;
    
    public a(d.a parama)
    {
      a = parama;
    }
    
    public O a(com.google.crypto.tink.shaded.protobuf.h paramh)
    {
      return b(a.d(paramh));
    }
    
    public final O b(O paramO)
    {
      a.e(paramO);
      return a.a(paramO);
    }
  }
}

/* Location:
 * Qualified Name:     c3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */