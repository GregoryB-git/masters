package x1;

import Z.a;
import kotlin.jvm.internal.Intrinsics;

public final class Q$a
{
  public final Q a()
  {
    try
    {
      if (Q.a() == null)
      {
        a locala = a.b(B.l());
        Intrinsics.checkNotNullExpressionValue(locala, "getInstance(applicationContext)");
        Q localQ1 = new x1/Q;
        P localP = new x1/P;
        localP.<init>();
        localQ1.<init>(locala, localP);
        Q.b(localQ1);
      }
    }
    finally
    {
      break label69;
    }
    Q localQ2 = Q.a();
    if (localQ2 != null) {
      return localQ2;
    }
    Intrinsics.n("instance");
    throw null;
    label69:
    throw localQ2;
  }
}

/* Location:
 * Qualified Name:     x1.Q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */