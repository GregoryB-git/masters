package Q3;

import V2.j;
import V3.C;
import V3.k;
import Y3.g;
import Z3.a;
import d4.o;
import d4.r;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class e
  extends p
{
  public e(V3.m paramm, k paramk)
  {
    super(paramm, paramk);
  }
  
  public e W(String paramString)
  {
    if (paramString != null)
    {
      if (s().isEmpty()) {
        Y3.n.i(paramString);
      } else {
        Y3.n.h(paramString);
      }
      paramString = s().T(new k(paramString));
      return new e(a, paramString);
    }
    throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
  }
  
  public String X()
  {
    if (s().isEmpty()) {
      return null;
    }
    return s().X().e();
  }
  
  public e Y()
  {
    k localk = s().a0();
    if (localk != null) {
      return new e(a, localk);
    }
    return null;
  }
  
  public n Z()
  {
    Y3.n.l(s());
    return new n(a, s());
  }
  
  public void a0(final r.b paramb, final boolean paramBoolean)
  {
    if (paramb != null)
    {
      Y3.n.l(s());
      a.i0(new d(paramb, paramBoolean));
      return;
    }
    throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
  }
  
  public j b0(Object paramObject)
  {
    return c0(r.c(b, paramObject), null);
  }
  
  public final j c0(final d4.n paramn, final e parame)
  {
    Y3.n.l(s());
    parame = Y3.m.l(parame);
    a.i0(new b(paramn, parame));
    return (j)parame.a();
  }
  
  public j d0(Object paramObject)
  {
    return f0(paramObject, r.c(b, null), null);
  }
  
  public j e0(Object paramObject1, Object paramObject2)
  {
    return f0(paramObject1, r.c(b, paramObject2), null);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof e)) && (toString().equals(paramObject.toString()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final j f0(final Object paramObject, final d4.n paramn, e parame)
  {
    Y3.n.l(s());
    C.g(s(), paramObject);
    paramObject = a.b(paramObject);
    Y3.n.k(paramObject);
    paramObject = o.b(paramObject, paramn);
    paramn = Y3.m.l(parame);
    a.i0(new a((d4.n)paramObject, paramn));
    return (j)paramn.a();
  }
  
  public j g0(Map paramMap)
  {
    return h0(paramMap, null);
  }
  
  public final j h0(final Map paramMap, final e parame)
  {
    if (paramMap != null)
    {
      final Map localMap = a.c(paramMap);
      paramMap = V3.b.D(Y3.n.e(s(), localMap));
      parame = Y3.m.l(parame);
      a.i0(new c(paramMap, parame, localMap));
      return (j)parame.a();
    }
    throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
  }
  
  public int hashCode()
  {
    return toString().hashCode();
  }
  
  public String toString()
  {
    Object localObject = Y();
    if (localObject == null) {
      return a.toString();
    }
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(((e)localObject).toString());
      localStringBuilder.append("/");
      localStringBuilder.append(URLEncoder.encode(X(), "UTF-8").replace("+", "%20"));
      localObject = localStringBuilder.toString();
      return (String)localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to URLEncode key: ");
      ((StringBuilder)localObject).append(X());
      throw new d(((StringBuilder)localObject).toString(), localUnsupportedEncodingException);
    }
  }
  
  public class a
    implements Runnable
  {
    public a(d4.n paramn, g paramg) {}
    
    public void run()
    {
      e locale = e.this;
      a.m0(locale.s(), paramObject, (e.e)paramn.b());
    }
  }
  
  public class b
    implements Runnable
  {
    public b(d4.n paramn, g paramg) {}
    
    public void run()
    {
      e locale = e.this;
      a.m0(locale.s().U(d4.b.o()), paramn, (e.e)parame.b());
    }
  }
  
  public class c
    implements Runnable
  {
    public c(V3.b paramb, g paramg, Map paramMap) {}
    
    public void run()
    {
      e locale = e.this;
      a.o0(locale.s(), paramMap, (e.e)parame.b(), localMap);
    }
  }
  
  public class d
    implements Runnable
  {
    public d(r.b paramb, boolean paramBoolean) {}
    
    public void run()
    {
      e locale = e.this;
      a.n0(locale.s(), paramb, paramBoolean);
    }
  }
  
  public static abstract interface e
  {
    public abstract void a(c paramc, e parame);
  }
}

/* Location:
 * Qualified Name:     Q3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */