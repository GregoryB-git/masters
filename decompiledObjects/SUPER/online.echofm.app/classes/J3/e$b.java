package J3;

public final class e$b
  extends B.c.a
{
  public String a;
  public String b;
  
  public B.c a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" key");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" value");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new e(a, b, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.c.a b(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null key");
  }
  
  public B.c.a c(String paramString)
  {
    if (paramString != null)
    {
      b = paramString;
      return this;
    }
    throw new NullPointerException("Null value");
  }
}

/* Location:
 * Qualified Name:     J3.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */