package K1;

import android.app.Activity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class g$a
{
  public final void a(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    int i = paramActivity.hashCode();
    Map localMap = g.b();
    Integer localInteger = Integer.valueOf(i);
    Object localObject1 = localMap.get(localInteger);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new g(paramActivity, null);
      localMap.put(localInteger, localObject2);
    }
    g.c((g)localObject2);
  }
  
  public final void b(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    int i = paramActivity.hashCode();
    paramActivity = (g)g.b().remove(Integer.valueOf(i));
    if (paramActivity != null) {
      g.d(paramActivity);
    }
  }
}

/* Location:
 * Qualified Name:     K1.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */