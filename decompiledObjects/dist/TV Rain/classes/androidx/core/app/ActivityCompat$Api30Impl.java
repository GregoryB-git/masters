package androidx.core.app;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.LocusIdCompat;
import d;

@RequiresApi(30)
class ActivityCompat$Api30Impl
{
  @DoNotInline
  public static Display getDisplay(ContextWrapper paramContextWrapper)
  {
    return d.g(paramContextWrapper);
  }
  
  @DoNotInline
  public static void setLocusContext(@NonNull Activity paramActivity, @Nullable LocusIdCompat paramLocusIdCompat, @Nullable Bundle paramBundle)
  {
    if (paramLocusIdCompat == null) {
      paramLocusIdCompat = null;
    } else {
      paramLocusIdCompat = paramLocusIdCompat.toLocusId();
    }
    d.p(paramActivity, paramLocusIdCompat, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */