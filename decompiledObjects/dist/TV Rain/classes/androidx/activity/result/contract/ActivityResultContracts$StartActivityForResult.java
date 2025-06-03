package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\030\000 \r2\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\rB\005¢\006\002\020\004J\030\020\005\032\0020\0022\006\020\006\032\0020\0072\006\020\b\032\0020\002H\026J\032\020\t\032\0020\0032\006\020\n\032\0020\0132\b\020\f\032\004\030\0010\002H\026¨\006\016"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContracts$StartActivityForResult
  extends ActivityResultContract<Intent, ActivityResult>
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
  
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramIntent, "input");
    return paramIntent;
  }
  
  @NotNull
  public ActivityResult parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    return new ActivityResult(paramInt, paramIntent);
  }
  
  @Metadata(d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult$Companion;", "", "()V", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion {}
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */