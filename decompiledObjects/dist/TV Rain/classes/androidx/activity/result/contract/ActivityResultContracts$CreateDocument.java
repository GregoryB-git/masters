package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\027\030\0002\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\001B\007\b\027¢\006\002\020\004B\r\022\006\020\005\032\0020\002¢\006\002\020\006J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\002H\027J \020\f\032\f\022\006\022\004\030\0010\003\030\0010\r2\006\020\t\032\0020\n2\006\020\013\032\0020\002J\032\020\016\032\004\030\0010\0032\006\020\017\032\0020\0202\b\020\021\032\004\030\0010\bR\016\020\005\032\0020\002X\004¢\006\002\n\000¨\006\022"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "mimeType", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
@RequiresApi(19)
public class ActivityResultContracts$CreateDocument
  extends ActivityResultContract<String, Uri>
{
  @NotNull
  private final String mimeType;
  
  @Deprecated(message="Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith=@ReplaceWith(expression="CreateDocument(\"todo/todo\")", imports={}))
  public ActivityResultContracts$CreateDocument()
  {
    this("*/*");
  }
  
  public ActivityResultContracts$CreateDocument(@NotNull String paramString)
  {
    mimeType = paramString;
  }
  
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "input");
    paramContext = new Intent("android.intent.action.CREATE_DOCUMENT").setType(mimeType).putExtra("android.intent.extra.TITLE", paramString);
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
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
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.CreateDocument
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */