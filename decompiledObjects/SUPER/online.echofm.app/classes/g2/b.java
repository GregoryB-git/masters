package g2;

public final class b
  extends g
{
  public final g.a a;
  public final long b;
  
  public b(g.a parama, long paramLong)
  {
    if (parama != null)
    {
      a = parama;
      b = paramLong;
      return;
    }
    throw new NullPointerException("Null status");
  }
  
  public long b()
  {
    return b;
  }
  
  public g.a c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof g))
    {
      paramObject = (g)paramObject;
      if ((!a.equals(((g)paramObject).c())) || (b != ((g)paramObject).b())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    long l = b;
    return (i ^ 0xF4243) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BackendResponse{status=");
    localStringBuilder.append(a);
    localStringBuilder.append(", nextRequestWaitMillis=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     g2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */