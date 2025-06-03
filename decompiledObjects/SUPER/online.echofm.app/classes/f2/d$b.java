package f2;

public final class d$b
  extends p.a
{
  public String a;
  public byte[] b;
  public c2.d c;
  
  public p a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" backendName");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (c == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" priority");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new d(a, b, c, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public p.a b(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null backendName");
  }
  
  public p.a c(byte[] paramArrayOfByte)
  {
    b = paramArrayOfByte;
    return this;
  }
  
  public p.a d(c2.d paramd)
  {
    if (paramd != null)
    {
      c = paramd;
      return this;
    }
    throw new NullPointerException("Null priority");
  }
}

/* Location:
 * Qualified Name:     f2.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */