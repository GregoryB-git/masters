package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.CallSuper;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message="The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
@Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\027\030\0002\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\027J \020\n\032\f\022\006\022\004\030\0010\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002J\032\020\f\032\004\030\0010\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¨\006\020"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public class ActivityResultContracts$TakeVideo
  extends ActivityResultContract<Uri, Bitmap>
{
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramUri, "input");
    paramContext = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", paramUri);
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
    return paramContext;
  }
  
  @Nullable
  public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@NotNull Context paramContext, @NotNull Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramUri, "input");
    return null;
  }
  
  @Nullable
  public final Bitmap parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    if (paramInt == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    Bitmap localBitmap = null;
    if (paramInt == 0) {
      paramIntent = null;
    }
    if (paramIntent != null) {
      localBitmap = (Bitmap)paramIntent.getParcelableExtra("data");
    }
    return localBitmap;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.TakeVideo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */