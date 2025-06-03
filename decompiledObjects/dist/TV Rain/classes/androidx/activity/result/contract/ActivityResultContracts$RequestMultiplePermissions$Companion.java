package androidx.activity.result.contract;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\021\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\035\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0040\nH\000¢\006\004\b\013\020\fR\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000¨\006\r"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "()V", "ACTION_REQUEST_PERMISSIONS", "", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "createIntent", "Landroid/content/Intent;", "input", "", "createIntent$activity_release", "([Ljava/lang/String;)Landroid/content/Intent;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContracts$RequestMultiplePermissions$Companion
{
  @NotNull
  public final Intent createIntent$activity_release(@NotNull String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
    paramArrayOfString = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString);
    Intrinsics.checkNotNullExpressionValue(paramArrayOfString, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
    return paramArrayOfString;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */