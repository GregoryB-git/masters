package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

public final class MediaTransferReceiver
  extends BroadcastReceiver
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static boolean isDeclared(@NonNull Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, MediaTransferReceiver.class);
    localIntent.setPackage(paramContext.getPackageName());
    paramContext = paramContext.getPackageManager();
    boolean bool = false;
    if (paramContext.queryBroadcastReceivers(localIntent, 0).size() > 0) {
      bool = true;
    }
    return bool;
  }
  
  public void onReceive(@NonNull Context paramContext, @NonNull Intent paramIntent) {}
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaTransferReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */