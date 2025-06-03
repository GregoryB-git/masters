package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\027\030\0002\022\022\006\022\004\030\0010\002\022\006\022\004\030\0010\0020\001B\005¢\006\002\020\003J\032\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\002H\027J\"\020\t\032\f\022\006\022\004\030\0010\002\030\0010\n2\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\002J\032\020\013\032\004\030\0010\0022\006\020\f\032\0020\r2\b\020\016\032\004\030\0010\005¨\006\017"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
@RequiresApi(21)
public class ActivityResultContracts$OpenDocumentTree
  extends ActivityResultContract<Uri, Uri>
{
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @Nullable Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    paramContext = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
    if ((Build.VERSION.SDK_INT >= 26) && (paramUri != null)) {
      paramContext.putExtra("android.provider.extra.INITIAL_URI", paramUri);
    }
    return paramContext;
  }
  
  @Nullable
  public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context paramContext, @Nullable Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
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
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.OpenDocumentTree
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */