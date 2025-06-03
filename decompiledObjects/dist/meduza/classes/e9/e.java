package e9;

import f;
import g;

public final class e
{
  public static final e b = new e(null);
  public final String a;
  
  public e(String paramString)
  {
    a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      Object localObject = (e)paramObject;
      paramObject = a;
      localObject = a;
      if (paramObject != null) {
        bool = ((String)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final String toString()
  {
    return g.f(f.l("User(uid:"), a, ")");
  }
}

/* Location:
 * Qualified Name:     e9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */