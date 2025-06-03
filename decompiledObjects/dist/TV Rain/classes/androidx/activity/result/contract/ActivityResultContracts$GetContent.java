package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.CallSuper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\026\030\0002\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\027J \020\n\032\f\022\006\022\004\030\0010\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002J\032\020\f\032\004\030\0010\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¨\006\020"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public class ActivityResultContracts$GetContent
  extends ActivityResultContract<String, Uri>
{
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "input");
    paramContext = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(paramString);
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_GET…          .setType(input)");
    return paramContext;
  }
  
  @Nullable
  public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context paramContext, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "input");
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
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.GetContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */