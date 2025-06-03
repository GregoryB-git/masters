package d0;

import g0.M;

public class t
{
  public static final String c = M.w0(0);
  public static final String d = M.w0(1);
  public final String a;
  public final String b;
  
  public t(String paramString1, String paramString2)
  {
    a = M.L0(paramString1);
    b = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (t)paramObject;
      if ((!M.c(a, a)) || (!M.c(b, b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = b.hashCode();
    String str = a;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
}

/* Location:
 * Qualified Name:     d0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */