package J3;

public final class v$b
  extends B.e.e.a
{
  public Integer a;
  public String b;
  public String c;
  public Boolean d;
  
  public B.e.e a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" platform");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" version");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" buildVersion");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (d == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" jailbroken");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new v(a.intValue(), b, c, d.booleanValue(), null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.e.e.a b(String paramString)
  {
    if (paramString != null)
    {
      c = paramString;
      return this;
    }
    throw new NullPointerException("Null buildVersion");
  }
  
  public B.e.e.a c(boolean paramBoolean)
  {
    d = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public B.e.e.a d(int paramInt)
  {
    a = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.e.e.a e(String paramString)
  {
    if (paramString != null)
    {
      b = paramString;
      return this;
    }
    throw new NullPointerException("Null version");
  }
}

/* Location:
 * Qualified Name:     J3.v.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */