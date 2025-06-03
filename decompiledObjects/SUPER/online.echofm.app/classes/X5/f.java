package X5;

import V5.n;
import V5.t;
import Y5.b;
import g6.p;
import kotlin.jvm.internal.Intrinsics;

public abstract class f
{
  public static final void a(p paramp, Object paramObject, d paramd)
  {
    Intrinsics.checkNotNullParameter(paramp, "<this>");
    Intrinsics.checkNotNullParameter(paramd, "completion");
    paramp = b.b(b.a(paramp, paramObject, paramd));
    paramObject = n.o;
    paramp.resumeWith(n.a(t.a));
  }
}

/* Location:
 * Qualified Name:     X5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */