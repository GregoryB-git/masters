package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000:\n\002\030\002\n\002\030\002\n\002\020\016\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b\027\030\000 \0222\031\022\004\022\0020\002\022\017\022\r\022\t\022\0070\004¢\006\002\b\0050\0030\001:\001\022B\005¢\006\002\020\006J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\002H\027J$\020\f\032\020\022\n\022\b\022\004\022\0020\0040\003\030\0010\r2\006\020\t\032\0020\n2\006\020\013\032\0020\002J\036\020\016\032\b\022\004\022\0020\0040\0032\006\020\017\032\0020\0202\b\020\021\032\004\030\0010\b¨\006\023"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
@RequiresApi(18)
public class ActivityResultContracts$GetMultipleContents
  extends ActivityResultContract<String, List<Uri>>
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  
  @CallSuper
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "input");
    paramContext = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(paramString).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
    Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
    return paramContext;
  }
  
  @Nullable
  public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context paramContext, @NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "input");
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
      paramIntent = Companion.getClipDataUris$activity_release(paramIntent);
      if (paramIntent != null) {}
    }
    else
    {
      paramIntent = CollectionsKt.emptyList();
    }
    return paramIntent;
  }
  
  @Metadata(d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\027\020\003\032\b\022\004\022\0020\0050\004*\0020\006H\000¢\006\002\b\007¨\006\b"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "()V", "getClipDataUris", "", "Landroid/net/Uri;", "Landroid/content/Intent;", "getClipDataUris$activity_release", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  @RequiresApi(18)
  public static final class Companion
  {
    @NotNull
    public final List<Uri> getClipDataUris$activity_release(@NotNull Intent paramIntent)
    {
      Intrinsics.checkNotNullParameter(paramIntent, "<this>");
      LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      Uri localUri = paramIntent.getData();
      if (localUri != null) {
        localLinkedHashSet.add(localUri);
      }
      paramIntent = paramIntent.getClipData();
      if ((paramIntent == null) && (localLinkedHashSet.isEmpty())) {
        return CollectionsKt.emptyList();
      }
      if (paramIntent != null)
      {
        int i = 0;
        int j = paramIntent.getItemCount();
        while (i < j)
        {
          localUri = paramIntent.getItemAt(i).getUri();
          if (localUri != null) {
            localLinkedHashSet.add(localUri);
          }
          i++;
        }
      }
      return new ArrayList(localLinkedHashSet);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */