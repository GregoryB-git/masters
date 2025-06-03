package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.CallSuper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b\026\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\027J\036\020\n\032\n\022\004\022\0020\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002J\035\020\f\032\0020\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¢\006\002\020\020¨\006\021"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public class ActivityResultContracts$TakePicture
  extends ActivityResultContract<Uri, Boolean>
{
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramUri, "input");
    paramContext = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", paramUri);
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
    return paramContext;
  }
  
  @Nullable
  public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context paramContext, @NotNull Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramUri, "input");
    return null;
  }
  
  @NotNull
  public final Boolean parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    boolean bool;
    if (paramInt == -1) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.TakePicture
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */