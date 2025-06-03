package d4;

public final class m
{
  public static final m c = new m(b.n(), g.W());
  public static final m d = new m(b.m(), n.l);
  public final b a;
  public final n b;
  
  public m(b paramb, n paramn)
  {
    a = paramb;
    b = paramn;
  }
  
  public static m a()
  {
    return d;
  }
  
  public static m b()
  {
    return c;
  }
  
  public b c()
  {
    return a;
  }
  
  public n d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (m.class == paramObject.getClass()))
    {
      paramObject = (m)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      return b.equals(b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return a.hashCode() * 31 + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NamedNode{name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", node=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */