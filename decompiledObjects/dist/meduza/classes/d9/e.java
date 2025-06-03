package d9;

import com.google.firebase.firestore.d;
import com.google.firebase.firestore.j;

public final class e
{
  public final a a;
  public final j b;
  public final int c;
  public final int d;
  
  public e(j paramj, a parama, int paramInt1, int paramInt2)
  {
    a = parama;
    b = paramj;
    c = paramInt1;
    d = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (e)paramObject;
      bool3 = bool2;
      if (a.equals(a))
      {
        bool3 = bool2;
        if (b.equals(b))
        {
          bool3 = bool2;
          if (c == c)
          {
            bool3 = bool2;
            if (d == d) {
              bool3 = true;
            }
          }
        }
      }
    }
    return bool3;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return ((b.hashCode() + i * 31) * 31 + c) * 31 + d;
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("ADDED", 0);
      a = locala1;
      a locala2 = new a("MODIFIED", 1);
      b = locala2;
      a locala3 = new a("REMOVED", 2);
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     d9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */