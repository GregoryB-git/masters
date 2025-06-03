package d4;

public class a
  extends k
{
  public final boolean q;
  
  public a(Boolean paramBoolean, n paramn)
  {
    super(paramn);
    q = paramBoolean.booleanValue();
  }
  
  public String O(n.b paramb)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(T(paramb));
    localStringBuilder.append("boolean:");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public k.b S()
  {
    return k.b.p;
  }
  
  public int V(a parama)
  {
    boolean bool = q;
    int i;
    if (bool == q) {
      i = 0;
    } else if (bool) {
      i = 1;
    } else {
      i = -1;
    }
    return i;
  }
  
  public a W(n paramn)
  {
    return new a(Boolean.valueOf(q), paramn);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (a)paramObject;
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
    return Boolean.valueOf(q);
  }
  
  public int hashCode()
  {
    return q + o.hashCode();
  }
}

/* Location:
 * Qualified Name:     d4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */