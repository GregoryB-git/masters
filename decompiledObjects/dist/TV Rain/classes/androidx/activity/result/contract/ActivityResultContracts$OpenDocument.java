package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0006\n\002\030\002\n\002\030\002\n\002\020\021\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\027\030\0002\026\022\n\022\b\022\004\022\0020\0030\002\022\006\022\004\030\0010\0040\001B\005¢\006\002\020\005J#\020\006\032\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\0030\002H\027¢\006\002\020\013J+\020\f\032\f\022\006\022\004\030\0010\004\030\0010\r2\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\0030\002¢\006\002\020\016J\032\020\017\032\004\030\0010\0042\006\020\020\032\0020\0212\b\020\022\032\004\030\0010\007¨\006\023"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
@RequiresApi(19)
public class ActivityResultContracts$OpenDocument
  extends ActivityResultContract<String[], Uri>
{
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
    paramContext = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", paramArrayOfString).setType("*/*");
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
    return paramContext;
  }
  
  @Nullable
  public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
    return null;
  }
  
  @Nullable
  public final Uri parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    if (paramInt == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    Uri localUri = null;
    if (paramInt == 0) {
      paramIntent = null;
    }
    if (paramIntent != null) {
      localUri = paramIntent.getData();
    }
    return localUri;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.OpenDocument
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */