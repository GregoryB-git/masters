package Q3;

import V3.C;
import V3.k;
import V3.t;
import Z3.a;
import d4.b;
import d4.o;

public class m
{
  public final t a;
  public final k b;
  
  public m(t paramt, k paramk)
  {
    a = paramt;
    b = paramk;
    C.g(paramk, c());
  }
  
  public m(d4.n paramn)
  {
    this(new t(paramn), new k(""));
  }
  
  public String a()
  {
    String str;
    if (b.X() != null) {
      str = b.X().e();
    } else {
      str = null;
    }
    return str;
  }
  
  public d4.n b()
  {
    return a.a(b);
  }
  
  public Object c()
  {
    return b().getValue();
  }
  
  public void d(Object paramObject)
  {
    C.g(b, paramObject);
    paramObject = a.b(paramObject);
    Y3.n.k(paramObject);
    a.c(b, o.a(paramObject));
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof m))
    {
      t localt = a;
      paramObject = (m)paramObject;
      if ((localt.equals(a)) && (b.equals(b))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public String toString()
  {
    Object localObject = b.Z();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MutableData { key = ");
    if (localObject != null) {
      localObject = ((b)localObject).e();
    } else {
      localObject = "<none>";
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", value = ");
    localStringBuilder.append(a.b().L(true));
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     Q3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */