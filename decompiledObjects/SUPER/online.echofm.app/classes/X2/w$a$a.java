package X2;

public final class w$a$a
{
  public final Object a;
  public final Object b;
  public final Object c;
  
  public w$a$a(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    a = paramObject1;
    b = paramObject2;
    c = paramObject3;
  }
  
  public IllegalArgumentException a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Multiple entries with same key: ");
    localStringBuilder.append(a);
    localStringBuilder.append("=");
    localStringBuilder.append(b);
    localStringBuilder.append(" and ");
    localStringBuilder.append(a);
    localStringBuilder.append("=");
    localStringBuilder.append(c);
    return new IllegalArgumentException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     X2.w.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */