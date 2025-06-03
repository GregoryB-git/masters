package J3;

public final class f$b
  extends B.d.a
{
  public C a;
  public String b;
  
  public B.d a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" files");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new f(a, b, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public B.d.a b(C paramC)
  {
    if (paramC != null)
    {
      a = paramC;
      return this;
    }
    throw new NullPointerException("Null files");
  }
  
  public B.d.a c(String paramString)
  {
    b = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     J3.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */