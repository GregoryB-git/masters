package g2;

public final class a$b
  extends f.a
{
  public Iterable a;
  public byte[] b;
  
  public f a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" events");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new a(a, b, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public f.a b(Iterable paramIterable)
  {
    if (paramIterable != null)
    {
      a = paramIterable;
      return this;
    }
    throw new NullPointerException("Null events");
  }
  
  public f.a c(byte[] paramArrayOfByte)
  {
    b = paramArrayOfByte;
    return this;
  }
}

/* Location:
 * Qualified Name:     g2.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */