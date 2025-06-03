package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkerParameters$RuntimeExtras
{
  @RequiresApi(28)
  public Network network;
  @NonNull
  public List<String> triggeredContentAuthorities = Collections.emptyList();
  @NonNull
  public List<Uri> triggeredContentUris = Collections.emptyList();
}

/* Location:
 * Qualified Name:     androidx.work.WorkerParameters.RuntimeExtras
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */