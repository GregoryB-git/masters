package v3;

import android.util.SparseBooleanArray;
import v5.h;

public final class f1$b
{
  public final h a;
  
  public f1$b(h paramh)
  {
    a = paramh;
  }
  
  public final boolean a(int... paramVarArgs)
  {
    h localh = a;
    localh.getClass();
    int i = paramVarArgs.length;
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      int k = paramVarArgs[j];
      if (a.get(k))
      {
        bool2 = true;
        break;
      }
    }
    return bool2;
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
    return a.equals(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
}

/* Location:
 * Qualified Name:     v3.f1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */