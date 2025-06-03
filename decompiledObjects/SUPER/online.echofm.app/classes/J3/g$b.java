package J3;

public final class g$b
  extends B.d.b.a
{
  public String a;
  public byte[] b;
  
  public B.d.b a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" filename");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" contents");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new g(a, b, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.d.b.a b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      b = paramArrayOfByte;
      return this;
    }
    throw new NullPointerException("Null contents");
  }
  
  public B.d.b.a c(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null filename");
  }
}

/* Location:
 * Qualified Name:     J3.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */