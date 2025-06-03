import ec.i;

public final class b
{
  public final Boolean a;
  
  public b()
  {
    this(null);
  }
  
  public b(Boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
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
    localStringBuilder.append("ToggleMessage(enable=");
    localStringBuilder.append(localBoolean);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */