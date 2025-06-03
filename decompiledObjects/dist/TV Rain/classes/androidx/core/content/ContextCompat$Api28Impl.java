package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import c;
import java.util.concurrent.Executor;

@RequiresApi(28)
class ContextCompat$Api28Impl
{
  @DoNotInline
  public static Executor getMainExecutor(Context paramContext)
  {
    return c.q(paramContext);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */