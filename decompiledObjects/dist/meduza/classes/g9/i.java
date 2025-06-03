package g9;

import f;
import j9.g;
import j9.n;

public final class i
{
  public final a a;
  public final g b;
  
  public i(a parama, g paramg)
  {
    a = parama;
    b = paramg;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof i;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (i)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.getKey().hashCode();
    return b.getData().hashCode() + (j + (i + 1891) * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DocumentViewChange(");
    localStringBuilder.append(b);
    localStringBuilder.append(",");
    localStringBuilder.append(a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("REMOVED", 0);
      a = locala1;
      a locala2 = new a("ADDED", 1);
      b = locala2;
      a locala3 = new a("MODIFIED", 2);
      c = locala3;
      a locala4 = new a("METADATA", 3);
      d = locala4;
      e = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     g9.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */