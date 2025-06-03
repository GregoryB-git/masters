package f2;

import c2.b;
import c2.e;

public final class c
  extends o
{
  public final p a;
  public final String b;
  public final c2.c c;
  public final e d;
  public final b e;
  
  public c(p paramp, String paramString, c2.c paramc, e parame, b paramb)
  {
    a = paramp;
    b = paramString;
    c = paramc;
    d = parame;
    e = paramb;
  }
  
  public b b()
  {
    return e;
  }
  
  public c2.c c()
  {
    return c;
  }
  
  public e e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof o))
    {
      paramObject = (o)paramObject;
      if ((!a.equals(((o)paramObject).f())) || (!b.equals(((o)paramObject).g())) || (!c.equals(((o)paramObject).c())) || (!d.equals(((o)paramObject).e())) || (!e.equals(((o)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public p f()
  {
    return a;
  }
  
  public String g()
  {
    return b;
  }
  
  public int hashCode()
  {
    return ((((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode()) * 1000003 ^ d.hashCode()) * 1000003 ^ e.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SendRequest{transportContext=");
    localStringBuilder.append(a);
    localStringBuilder.append(", transportName=");
    localStringBuilder.append(b);
    localStringBuilder.append(", event=");
    localStringBuilder.append(c);
    localStringBuilder.append(", transformer=");
    localStringBuilder.append(d);
    localStringBuilder.append(", encoding=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends o.a
  {
    public p a;
    public String b;
    public c2.c c;
    public e d;
    public b e;
    
    public o a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" transportContext");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" transportName");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" event");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (d == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" transformer");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (e == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" encoding");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new c(a, b, c, d, e, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public o.a b(b paramb)
    {
      if (paramb != null)
      {
        e = paramb;
        return this;
      }
      throw new NullPointerException("Null encoding");
    }
    
    public o.a c(c2.c paramc)
    {
      if (paramc != null)
      {
        c = paramc;
        return this;
      }
      throw new NullPointerException("Null event");
    }
    
    public o.a d(e parame)
    {
      if (parame != null)
      {
        d = parame;
        return this;
      }
      throw new NullPointerException("Null transformer");
    }
    
    public o.a e(p paramp)
    {
      if (paramp != null)
      {
        a = paramp;
        return this;
      }
      throw new NullPointerException("Null transportContext");
    }
    
    public o.a f(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null transportName");
    }
  }
}

/* Location:
 * Qualified Name:     f2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */