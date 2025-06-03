package A1;

public final class e$c
{
  public k a;
  public l b;
  
  public e$c(k paramk, l paraml)
  {
    a = paramk;
    b = paraml;
  }
  
  public final l a()
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
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if (a != a) {
      return false;
    }
    return b == b;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    l locall = b;
    int j;
    if (locall == null) {
      j = 0;
    } else {
      j = locall.hashCode();
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SectionFieldMapping(section=");
    localStringBuilder.append(a);
    localStringBuilder.append(", field=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     A1.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */