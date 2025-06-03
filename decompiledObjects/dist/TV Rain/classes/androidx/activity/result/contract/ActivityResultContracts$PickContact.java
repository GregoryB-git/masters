package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\030\0002\022\022\006\022\004\030\0010\002\022\006\022\004\030\0010\0030\001B\005¢\006\002\020\004J\032\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\002H\026J\034\020\n\032\004\030\0010\0032\006\020\013\032\0020\f2\b\020\r\032\004\030\0010\006H\026¨\006\016"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContracts$PickContact
  extends ActivityResultContract<Void, Uri>
{
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @Nullable Void paramVoid)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    paramContext = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
    return paramContext;
  }
  
  @Nullable
  public Uri parseResult(int paramInt, @Nullable Intent paramIntent)
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
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.PickContact
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */