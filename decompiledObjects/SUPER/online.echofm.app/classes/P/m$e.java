package P;

import g6.p;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.u;

public final class m$e
  extends l
  implements p
{
  public static final e o = new e();
  
  public m$e()
  {
    super(2);
  }
  
  public final void a(m.b paramb, Throwable paramThrowable)
  {
    Intrinsics.checkNotNullParameter(paramb, "msg");
    if ((paramb instanceof m.b.b))
    {
      u localu = ((m.b.b)paramb).a();
      paramb = paramThrowable;
      if (paramThrowable == null) {
        paramb = new CancellationException("DataStore scope was cancelled before updateData could complete");
      }
      localu.l(paramb);
    }
  }
}

/* Location:
 * Qualified Name:     P.m.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */