package R;

import android.content.Context;
import g6.a;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public final class c$a
  extends l
  implements a
{
  public c$a(Context paramContext, c paramc)
  {
    super(0);
  }
  
  public final File a()
  {
    Context localContext = o;
    Intrinsics.checkNotNullExpressionValue(localContext, "applicationContext");
    return b.a(localContext, c.b(p));
  }
}

/* Location:
 * Qualified Name:     R.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */