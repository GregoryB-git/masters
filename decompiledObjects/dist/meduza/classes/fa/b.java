package fa;

import ec.i;
import f;

public abstract interface b
{
  public abstract void a(b paramb);
  
  public abstract boolean b();
  
  public abstract void c();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("CRASHLYTICS", 0);
      a = locala1;
      a locala2 = new a("PERFORMANCE", 1);
      b = locala2;
      c = new a[] { locala1, locala2, new a("MATT_SAYS_HI", 2) };
    }
    
    public a() {}
  }
  
  public static final class b
  {
    public final String a;
    
    public b(String paramString)
    {
      a = paramString;
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
      return a.hashCode();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("SessionDetails(sessionId=");
      localStringBuilder.append(a);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     fa.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */