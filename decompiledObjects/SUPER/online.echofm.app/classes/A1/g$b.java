package A1;

import O1.P;
import W5.m;
import g6.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public final class g$b
  extends l
  implements p
{
  public g$b(List paramList)
  {
    super(2);
  }
  
  public static final void d(Integer paramInteger, List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "$processedEvents");
    if (!m.o(g.b(), paramInteger)) {
      g.a.g(paramInteger, paramList, 5);
    }
  }
  
  public final void b(String paramString, Integer paramInteger)
  {
    paramString = P.a;
    P.B0(new h(paramInteger, o));
  }
}

/* Location:
 * Qualified Name:     A1.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */