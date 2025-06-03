package androidx.core.app;

import a3;
import android.app.RemoteAction;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class RemoteActionCompat$Api28Impl
{
  @DoNotInline
  public static void setShouldShowIcon(RemoteAction paramRemoteAction, boolean paramBoolean)
  {
    a3.p(paramRemoteAction, paramBoolean);
  }
  
  @DoNotInline
  public static boolean shouldShowIcon(RemoteAction paramRemoteAction)
  {
    return a3.z(paramRemoteAction);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteActionCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */