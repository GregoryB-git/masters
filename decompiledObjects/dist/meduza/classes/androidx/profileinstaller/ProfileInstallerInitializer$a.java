package androidx.profileinstaller;

import android.view.Choreographer;
import n1.c;

public final class ProfileInstallerInitializer$a
{
  public static void a(Runnable paramRunnable)
  {
    Choreographer.getInstance().postFrameCallback(new c(paramRunnable));
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.ProfileInstallerInitializer.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */