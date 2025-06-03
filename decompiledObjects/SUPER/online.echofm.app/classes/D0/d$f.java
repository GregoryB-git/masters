package D0;

import android.content.Context;
import d0.F;
import d0.F.a;
import d0.M;
import d0.N.a;
import d0.O;
import d0.h;
import d0.k;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;

public final class d$f
  implements F.a
{
  public final N.a a;
  
  public d$f(N.a parama)
  {
    a = parama;
  }
  
  public F a(Context paramContext, h paramh, k paramk, O paramO, Executor paramExecutor, List paramList, long paramLong)
  {
    try
    {
      Constructor localConstructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(new Class[] { N.a.class });
      try
      {
        ((F.a)localConstructor.newInstance(new Object[] { a })).a(paramContext, paramh, paramk, paramO, paramExecutor, paramList, paramLong);
        return null;
      }
      catch (Exception paramContext) {}
      throw M.a(paramContext);
    }
    catch (Exception paramContext) {}
  }
}

/* Location:
 * Qualified Name:     D0.d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */