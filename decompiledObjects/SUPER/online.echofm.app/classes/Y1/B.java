package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum B
{
  public static final a p = new a(null);
  public final String o;
  
  public B(String paramString1)
  {
    o = paramString1;
  }
  
  public String toString()
  {
    return o;
  }
  
  public static final class a
  {
    public final B a(String paramString)
    {
      B[] arrayOfB = B.values();
      int i = arrayOfB.length;
      int j = 0;
      while (j < i)
      {
        B localB = arrayOfB[j];
        j++;
        if (Intrinsics.a(localB.toString(), paramString)) {
          return localB;
        }
      }
      return B.q;
    }
  }
}

/* Location:
 * Qualified Name:     Y1.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */