package d4;

import Y3.m;

public class f
  extends k
{
  public final Double q;
  
  public f(Double paramDouble, n paramn)
  {
    super(paramn);
    q = paramDouble;
  }
  
  public String O(n.b paramb)
  {
    paramb = T(paramb);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramb);
    localStringBuilder.append("number:");
    paramb = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramb);
    localStringBuilder.append(m.c(q.doubleValue()));
    return localStringBuilder.toString();
  }
  
  public k.b S()
  {
    return k.b.q;
  }
  
  public int V(f paramf)
  {
    return q.compareTo(q);
  }
  
  public f W(n paramn)
  {
    m.f(r.b(paramn));
    return new f(q, paramn);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof f;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (f)paramObject;
    bool1 = bool2;
    if (q.equals(q))
    {
      bool1 = bool2;
      if (o.equals(o)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public Object getValue()
  {
    return q;
  }
  
  public int hashCode()
  {
    return q.hashCode() + o.hashCode();
  }
}

/* Location:
 * Qualified Name:     d4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */