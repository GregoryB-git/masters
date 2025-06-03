package A1;

public final class e$b
{
  public k a;
  public i b;
  
  public e$b(k paramk, i parami)
  {
    a = paramk;
    b = parami;
  }
  
  public final i a()
  {
    return b;
  }
  
  public final k b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if (a != a) {
      return false;
    }
    return b == b;
  }
  
  public int hashCode()
  {
    k localk = a;
    int i;
    if (localk == null) {
      i = 0;
    } else {
      i = localk.hashCode();
    }
    return i * 31 + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SectionCustomEventFieldMapping(section=");
    localStringBuilder.append(a);
    localStringBuilder.append(", field=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     A1.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */