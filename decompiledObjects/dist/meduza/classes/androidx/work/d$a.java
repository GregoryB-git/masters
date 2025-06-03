package androidx.work;

import f;

public abstract class d$a
{
  public static final class a
    extends d.a
  {
    public final c a;
    
    public a()
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
  
  public static final class b
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
  
  public static final class c
    extends d.a
  {
    public final c a;
    
    public c()
    {
      this(c.c);
    }
    
    public c(c paramc)
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
}

/* Location:
 * Qualified Name:     androidx.work.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */