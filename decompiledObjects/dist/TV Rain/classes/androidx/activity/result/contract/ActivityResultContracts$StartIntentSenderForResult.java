package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\030\000 \0162\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\016B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\026J\032\020\n\032\0020\0032\006\020\013\032\0020\f2\b\020\r\032\004\030\0010\006H\026¨\006\017"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContracts$StartIntentSenderForResult
  extends ActivityResultContract<IntentSenderRequest, ActivityResult>
{
  @NotNull
  public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
  @NotNull
  public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";
  
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull IntentSenderRequest paramIntentSenderRequest)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramIntentSenderRequest, "input");
    paramContext = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramIntentSenderRequest);
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
    return paramContext;
  }
  
  @NotNull
  public ActivityResult parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    return new ActivityResult(paramInt, paramIntent);
  }
  
  @Metadata(d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000¨\006\007"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult$Companion;", "", "()V", "ACTION_INTENT_SENDER_REQUEST", "", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion {}
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */