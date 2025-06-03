package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000>\n\002\030\002\n\002\030\002\n\002\020\021\n\002\020\016\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\027\030\0002\037\022\n\022\b\022\004\022\0020\0030\002\022\017\022\r\022\t\022\0070\005¢\006\002\b\0060\0040\001B\005¢\006\002\020\007J#\020\b\032\0020\t2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002H\027¢\006\002\020\rJ/\020\016\032\020\022\n\022\b\022\004\022\0020\0050\004\030\0010\0172\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002¢\006\002\020\020J\036\020\021\032\b\022\004\022\0020\0050\0042\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\t¨\006\025"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
@RequiresApi(19)
public class ActivityResultContracts$OpenMultipleDocuments
  extends ActivityResultContract<String[], List<Uri>>
{
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
    paramContext = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", paramArrayOfString).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
    return paramContext;
  }
  
  @Nullable
  public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
    return null;
  }
  
  @NotNull
  public final List<Uri> parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    if (paramInt == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt == 0) {
      paramIntent = null;
    }
    if (paramIntent != null)
    {
      paramIntent = ActivityResultContracts.GetMultipleContents.Companion.getClipDataUris$activity_release(paramIntent);
      if (paramIntent != null) {}
    }
    else
    {
      paramIntent = CollectionsKt.emptyList();
    }
    return paramIntent;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.OpenMultipleDocuments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */