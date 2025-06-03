package androidx.work;

import f;

public final class d$a$a
  extends d.a
{
  public final c a;
  
  public d$a$a()
  {
    a = localc;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.class.getName().hashCode();
    return a.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Failure {mOutputData=");
    localStringBuilder.append(a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.work.d.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */