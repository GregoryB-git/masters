package androidx.work;

import f;

public final class d$a$c
  extends d.a
{
  public final c a;
  
  public d$a$c()
  {
    this(c.c);
  }
  
  public d$a$c(c paramc)
  {
    a = paramc;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = c.class.getName().hashCode();
    return a.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Success {mOutputData=");
    localStringBuilder.append(a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.work.d.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */