package Y1;

import kotlin.jvm.internal.Intrinsics;

public final class B$a
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

/* Location:
 * Qualified Name:     Y1.B.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */