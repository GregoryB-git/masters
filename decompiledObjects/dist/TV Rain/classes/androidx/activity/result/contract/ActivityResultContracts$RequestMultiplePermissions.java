package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000>\n\002\030\002\n\002\030\002\n\002\020\021\n\002\020\016\n\002\020$\n\002\020\013\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\030\000 \0252%\022\n\022\b\022\004\022\0020\0030\002\022\025\022\023\022\004\022\0020\003\022\t\022\0070\005¢\006\002\b\0060\0040\001:\001\025B\005¢\006\002\020\007J#\020\b\032\0020\t2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002H\026¢\006\002\020\rJ7\020\016\032\026\022\020\022\016\022\004\022\0020\003\022\004\022\0020\0050\004\030\0010\0172\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002H\026¢\006\002\020\020J&\020\021\032\016\022\004\022\0020\003\022\004\022\0020\0050\0042\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\tH\026¨\006\026"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContracts$RequestMultiplePermissions
  extends ActivityResultContract<String[], Map<String, Boolean>>
{
  @NotNull
  public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
  @NotNull
  public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";
  
  @NotNull
  public Intent createIntent(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
    return Companion.createIntent$activity_release(paramArrayOfString);
  }
  
  @Nullable
  public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
    int i = paramArrayOfString.length;
    int j = 1;
    int k = 0;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return new ActivityResultContract.SynchronousResult(MapsKt.emptyMap());
    }
    int m = paramArrayOfString.length;
    int n;
    for (i = 0;; i++)
    {
      n = j;
      if (i >= m) {
        break;
      }
      if (ContextCompat.checkSelfPermission(paramContext, paramArrayOfString[i]) == 0) {
        n = 1;
      } else {
        n = 0;
      }
      if (n == 0)
      {
        n = 0;
        break;
      }
    }
    if (n != 0)
    {
      paramContext = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfString.length), 16));
      n = paramArrayOfString.length;
      for (i = k; i < n; i++)
      {
        Pair localPair = TuplesKt.to(paramArrayOfString[i], Boolean.TRUE);
        paramContext.put(localPair.getFirst(), localPair.getSecond());
      }
      paramContext = new ActivityResultContract.SynchronousResult(paramContext);
    }
    else
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  @NotNull
  public Map<String, Boolean> parseResult(int paramInt, @Nullable Intent paramIntent)
  {
    if (paramInt != -1) {
      return MapsKt.emptyMap();
    }
    if (paramIntent == null) {
      return MapsKt.emptyMap();
    }
    String[] arrayOfString = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
    int[] arrayOfInt = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
    if ((arrayOfInt != null) && (arrayOfString != null))
    {
      paramIntent = new ArrayList(arrayOfInt.length);
      int i = arrayOfInt.length;
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        boolean bool;
        if (arrayOfInt[paramInt] == 0) {
          bool = true;
        } else {
          bool = false;
        }
        paramIntent.add(Boolean.valueOf(bool));
      }
      return MapsKt.a(CollectionsKt.r(ArraysKt.filterNotNull(arrayOfString), paramIntent));
    }
    return MapsKt.emptyMap();
  }
  
  @Metadata(d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\021\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\035\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0040\nH\000¢\006\004\b\013\020\fR\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000¨\006\r"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "()V", "ACTION_REQUEST_PERMISSIONS", "", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "createIntent", "Landroid/content/Intent;", "input", "", "createIntent$activity_release", "([Ljava/lang/String;)Landroid/content/Intent;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion
  {
    @NotNull
    public final Intent createIntent$activity_release(@NotNull String[] paramArrayOfString)
    {
      Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
      paramArrayOfString = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString);
      Intrinsics.checkNotNullExpressionValue(paramArrayOfString, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
      return paramArrayOfString;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */