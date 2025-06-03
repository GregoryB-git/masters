package O1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class b$a
{
  public final b a(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    if (b.a() != null) {
      return b.a();
    }
    paramContext = new b(paramContext, null);
    b.b(paramContext);
    b.c(paramContext);
    return b.a();
  }
}

/* Location:
 * Qualified Name:     O1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */