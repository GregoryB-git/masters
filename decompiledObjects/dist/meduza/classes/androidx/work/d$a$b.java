package androidx.work;

public final class d$a$b
  extends d.a
{
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (b.class != paramObject.getClass())) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return b.class.getName().hashCode();
  }
  
  public final String toString()
  {
    return "Retry";
  }
}

/* Location:
 * Qualified Name:     androidx.work.d.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */