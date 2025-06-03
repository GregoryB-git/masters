package d4;

import Y3.m;

public class l
  extends k
{
  public final long q;
  
  public l(Long paramLong, n paramn)
  {
    super(paramn);
    q = paramLong.longValue();
  }
  
  public String O(n.b paramb)
  {
    paramb = T(paramb);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramb);
    ((StringBuilder)localObject).append("number:");
    localObject = ((StringBuilder)localObject).toString();
    paramb = new StringBuilder();
    paramb.append((String)localObject);
    paramb.append(m.c(q));
    return paramb.toString();
  }
  
  public k.b S()
  {
    return k.b.q;
  }
  
  public int V(l paraml)
  {
    return m.b(q, q);
  }
  
  public l W(n paramn)
  {
    return new l(Long.valueOf(q), paramn);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof l;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (l)paramObject;
    bool1 = bool2;
    if (q == q)
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
    return Long.valueOf(q);
  }
  
  public int hashCode()
  {
    long l = q;
    return (int)(l ^ l >>> 32) + o.hashCode();
  }
}

/* Location:
 * Qualified Name:     d4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */