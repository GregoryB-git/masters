package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\026J \020\n\032\n\022\004\022\0020\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002H\026J\037\020\f\032\0020\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006H\026¢\006\002\020\020¨\006\021"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContracts$RequestPermission
  extends ActivityResultContract<String, Boolean>
{
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "input");
    return ActivityResultContracts.RequestMultiplePermissions.Companion.createIntent$activity_release(new String[] { paramString });
  }
  
  @Nullable
  public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context paramContext, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "input");
    int i;
    if (ContextCompat.checkSelfPermission(paramContext, paramString) == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      paramContext = new ActivityResultContract.SynchronousResult(Boolean.TRUE);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  @NotNull
  public Boolean parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    if ((paramIntent != null) && (paramInt == -1))
    {
      paramIntent = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
      boolean bool = true;
      if (paramIntent != null)
      {
        int i = paramIntent.length;
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          int j;
          if (paramIntent[paramInt] == 0) {
            j = 1;
          } else {
            j = 0;
          }
          if (j != 0)
          {
            paramInt = 1;
            break label70;
          }
        }
        paramInt = 0;
        label70:
        if (paramInt == 1) {}
      }
      else
      {
        bool = false;
      }
      return Boolean.valueOf(bool);
    }
    return Boolean.FALSE;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.RequestPermission
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */