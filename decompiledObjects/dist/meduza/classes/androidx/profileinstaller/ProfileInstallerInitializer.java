package androidx.profileinstaller;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g.q;
import java.util.Collections;
import java.util.List;
import n1.c;

public class ProfileInstallerInitializer
  implements w1.b<c>
{
  public final List<Class<? extends w1.b<?>>> a()
  {
    return Collections.emptyList();
  }
  
  public final Object b(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 24)
    {
      paramContext = new c();
    }
    else
    {
      a.a(new q(2, this, paramContext.getApplicationContext()));
      paramContext = new c();
    }
    return paramContext;
  }
  
  public static final class a
  {
    public static void a(Runnable paramRunnable)
    {
      Choreographer.getInstance().postFrameCallback(new c(paramRunnable));
    }
  }
  
  public static final class b
  {
    public static Handler a(Looper paramLooper)
    {
      return android.support.v4.media.session.b.e(paramLooper);
    }
  }
  
  public static final class c {}
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.ProfileInstallerInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */