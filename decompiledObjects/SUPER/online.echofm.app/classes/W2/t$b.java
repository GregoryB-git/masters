package W2;

public class t$b
  implements s
{
  public static final s q = new u();
  public volatile s o;
  public Object p;
  
  public t$b(s params)
  {
    o = ((s)m.j(params));
  }
  
  public Object get()
  {
    Object localObject1 = o;
    s locals = q;
    if (localObject1 != locals) {
      label57:
      try
      {
        if (o != locals)
        {
          localObject1 = o.get();
          p = localObject1;
          o = locals;
          return localObject1;
        }
      }
      finally
      {
        break label57;
      }
    }
    return j.a(p);
  }
  
  public String toString()
  {
    s locals = o;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Suppliers.memoize(");
    Object localObject = locals;
    if (locals == q)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("<supplier that returned ");
      ((StringBuilder)localObject).append(p);
      ((StringBuilder)localObject).append(">");
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     W2.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */