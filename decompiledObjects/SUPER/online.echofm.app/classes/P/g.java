package P;

import Q.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p6.I;

public final class g
{
  public static final g a = new g();
  
  public final f a(k paramk, b paramb, List paramList, I paramI, g6.a parama)
  {
    Intrinsics.checkNotNullParameter(paramk, "serializer");
    Intrinsics.checkNotNullParameter(paramList, "migrations");
    Intrinsics.checkNotNullParameter(paramI, "scope");
    Intrinsics.checkNotNullParameter(parama, "produceFile");
    paramb = new Q.a();
    return new m(parama, paramk, W5.m.b(e.a.b(paramList)), paramb, paramI);
  }
}

/* Location:
 * Qualified Name:     P.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */