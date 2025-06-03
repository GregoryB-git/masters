package d4;

import Y3.m;

public class t
  extends k
{
  public final String q;
  
  public t(String paramString, n paramn)
  {
    super(paramn);
    q = paramString;
  }
  
  public String O(n.b paramb)
  {
    int i = a.a[paramb.ordinal()];
    Object localObject1;
    Object localObject2;
    if (i != 1) {
      if (i == 2)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(T(paramb));
        ((StringBuilder)localObject1).append("string:");
        localObject2 = m.j(q);
        paramb = (n.b)localObject1;
      }
    }
    for (;;)
    {
      paramb.append((String)localObject2);
      return paramb.toString();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Invalid hash version for string node: ");
      ((StringBuilder)localObject2).append(paramb);
      throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(T(paramb));
      ((StringBuilder)localObject2).append("string:");
      localObject1 = q;
      paramb = (n.b)localObject2;
      localObject2 = localObject1;
    }
  }
  
  public k.b S()
  {
    return k.b.r;
  }
  
  public int V(t paramt)
  {
    return q.compareTo(q);
  }
  
  public t W(n paramn)
  {
    return new t(q, paramn);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof t;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (t)paramObject;
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
 * Qualified Name:     d4.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */