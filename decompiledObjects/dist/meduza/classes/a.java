import ec.i;

public final class a
{
  public final Boolean a;
  
  public a()
  {
    this(null);
  }
  
  public a(Boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return i.a(a, a);
  }
  
  public final int hashCode()
  {
    Boolean localBoolean = a;
    int i;
    if (localBoolean == null) {
      i = 0;
    } else {
      i = localBoolean.hashCode();
    }
    return i;
  }
  
  public final String toString()
  {
    Boolean localBoolean = a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IsEnabledMessage(enabled=");
    localStringBuilder.append(localBoolean);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */