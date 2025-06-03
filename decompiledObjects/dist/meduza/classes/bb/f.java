package bb;

import android.content.Context;
import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f
  implements PluginRegistry.ActivityResultListener
{
  public MethodChannel.Result a;
  public AtomicBoolean b = new AtomicBoolean(true);
  
  public f(Context paramContext) {}
  
  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 == 22643)
    {
      String str = SharePlusPendingIntent.a;
      bool2 = bool1;
      if (b.compareAndSet(false, true))
      {
        paramIntent = a;
        bool2 = bool1;
        if (paramIntent != null)
        {
          paramIntent.success(str);
          a = null;
          bool2 = bool1;
        }
      }
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     bb.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */