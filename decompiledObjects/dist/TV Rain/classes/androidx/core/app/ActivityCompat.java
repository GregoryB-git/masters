package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.os.BuildCompat;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.view.DragAndDropPermissionsCompat;
import c;
import d;
import f;
import g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import z2;

public class ActivityCompat
  extends ContextCompat
{
  private static PermissionCompatDelegate sDelegate;
  
  public static void finishAffinity(@NonNull Activity paramActivity)
  {
    Api16Impl.finishAffinity(paramActivity);
  }
  
  public static void finishAfterTransition(@NonNull Activity paramActivity)
  {
    Api21Impl.finishAfterTransition(paramActivity);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static PermissionCompatDelegate getPermissionCompatDelegate()
  {
    return sDelegate;
  }
  
  @Nullable
  public static Uri getReferrer(@NonNull Activity paramActivity)
  {
    return Api22Impl.getReferrer(paramActivity);
  }
  
  @Deprecated
  public static boolean invalidateOptionsMenu(Activity paramActivity)
  {
    paramActivity.invalidateOptionsMenu();
    return true;
  }
  
  public static boolean isLaunchedFromBubble(@NonNull Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 31) {
      return Api31Impl.isLaunchedFromBubble(paramActivity);
    }
    boolean bool1 = true;
    boolean bool2 = true;
    if (i == 30)
    {
      if ((Api30Impl.getDisplay(paramActivity) == null) || (Api30Impl.getDisplay(paramActivity).getDisplayId() == 0)) {
        bool2 = false;
      }
      return bool2;
    }
    if (i == 29)
    {
      if ((paramActivity.getWindowManager().getDefaultDisplay() != null) && (paramActivity.getWindowManager().getDefaultDisplay().getDisplayId() != 0)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      return bool2;
    }
    return false;
  }
  
  public static void postponeEnterTransition(@NonNull Activity paramActivity)
  {
    Api21Impl.postponeEnterTransition(paramActivity);
  }
  
  public static void recreate(@NonNull Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      paramActivity.recreate();
    } else {
      new Handler(paramActivity.getMainLooper()).post(new f(paramActivity));
    }
  }
  
  @Nullable
  public static DragAndDropPermissionsCompat requestDragAndDropPermissions(@NonNull Activity paramActivity, @NonNull DragEvent paramDragEvent)
  {
    return DragAndDropPermissionsCompat.request(paramActivity, paramDragEvent);
  }
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static void requestPermissions(@NonNull Activity paramActivity, @NonNull String[] paramArrayOfString, @IntRange(from=0L) int paramInt)
  {
    Object localObject = sDelegate;
    if ((localObject != null) && (((PermissionCompatDelegate)localObject).requestPermissions(paramActivity, paramArrayOfString, paramInt))) {
      return;
    }
    HashSet localHashSet = new HashSet();
    int i = 0;
    int j = 0;
    while (j < paramArrayOfString.length) {
      if (!TextUtils.isEmpty(paramArrayOfString[j]))
      {
        if ((!BuildCompat.isAtLeastT()) && (TextUtils.equals(paramArrayOfString[j], "android.permission.POST_NOTIFICATIONS"))) {
          localHashSet.add(Integer.valueOf(j));
        }
        j++;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("Permission request for permissions "), Arrays.toString(paramArrayOfString), " must not contain null or empty values"));
      }
    }
    j = localHashSet.size();
    if (j > 0) {
      localObject = new String[paramArrayOfString.length - j];
    } else {
      localObject = paramArrayOfString;
    }
    if (j > 0)
    {
      if (j == paramArrayOfString.length) {
        return;
      }
      for (int k = 0; i < paramArrayOfString.length; k = j)
      {
        j = k;
        if (!localHashSet.contains(Integer.valueOf(i)))
        {
          localObject[k] = paramArrayOfString[i];
          j = k + 1;
        }
        i++;
      }
    }
    if ((paramActivity instanceof RequestPermissionsRequestCodeValidator)) {
      ((RequestPermissionsRequestCodeValidator)paramActivity).validateRequestPermissionsRequestCode(paramInt);
    }
    Api23Impl.requestPermissions(paramActivity, paramArrayOfString, paramInt);
  }
  
  @NonNull
  public static <T extends View> T requireViewById(@NonNull Activity paramActivity, @IdRes int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return (View)Api28Impl.requireViewById(paramActivity, paramInt);
    }
    paramActivity = paramActivity.findViewById(paramInt);
    if (paramActivity != null) {
      return paramActivity;
    }
    throw new IllegalArgumentException("ID does not reference a View inside this Activity");
  }
  
  public static void setEnterSharedElementCallback(@NonNull Activity paramActivity, @Nullable SharedElementCallback paramSharedElementCallback)
  {
    if (paramSharedElementCallback != null) {
      paramSharedElementCallback = new SharedElementCallback21Impl(paramSharedElementCallback);
    } else {
      paramSharedElementCallback = null;
    }
    Api21Impl.setEnterSharedElementCallback(paramActivity, paramSharedElementCallback);
  }
  
  public static void setExitSharedElementCallback(@NonNull Activity paramActivity, @Nullable SharedElementCallback paramSharedElementCallback)
  {
    if (paramSharedElementCallback != null) {
      paramSharedElementCallback = new SharedElementCallback21Impl(paramSharedElementCallback);
    } else {
      paramSharedElementCallback = null;
    }
    Api21Impl.setExitSharedElementCallback(paramActivity, paramSharedElementCallback);
  }
  
  public static void setLocusContext(@NonNull Activity paramActivity, @Nullable LocusIdCompat paramLocusIdCompat, @Nullable Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      Api30Impl.setLocusContext(paramActivity, paramLocusIdCompat, paramBundle);
    }
  }
  
  public static void setPermissionCompatDelegate(@Nullable PermissionCompatDelegate paramPermissionCompatDelegate)
  {
    sDelegate = paramPermissionCompatDelegate;
  }
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public static boolean shouldShowRequestPermissionRationale(@NonNull Activity paramActivity, @NonNull String paramString)
  {
    if ((!BuildCompat.isAtLeastT()) && (TextUtils.equals("android.permission.POST_NOTIFICATIONS", paramString))) {
      return false;
    }
    return Api23Impl.shouldShowRequestPermissionRationale(paramActivity, paramString);
  }
  
  public static void startActivityForResult(@NonNull Activity paramActivity, @NonNull Intent paramIntent, int paramInt, @Nullable Bundle paramBundle)
  {
    Api16Impl.startActivityForResult(paramActivity, paramIntent, paramInt, paramBundle);
  }
  
  public static void startIntentSenderForResult(@NonNull Activity paramActivity, @NonNull IntentSender paramIntentSender, int paramInt1, @Nullable Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, @Nullable Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    Api16Impl.startIntentSenderForResult(paramActivity, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public static void startPostponedEnterTransition(@NonNull Activity paramActivity)
  {
    Api21Impl.startPostponedEnterTransition(paramActivity);
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static void finishAffinity(Activity paramActivity)
    {
      paramActivity.finishAffinity();
    }
    
    @DoNotInline
    public static void startActivityForResult(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
    {
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
    }
    
    @DoNotInline
    public static void startIntentSenderForResult(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
      throws IntentSender.SendIntentException
    {
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void finishAfterTransition(Activity paramActivity)
    {
      paramActivity.finishAfterTransition();
    }
    
    @DoNotInline
    public static void postponeEnterTransition(Activity paramActivity)
    {
      paramActivity.postponeEnterTransition();
    }
    
    @DoNotInline
    public static void setEnterSharedElementCallback(Activity paramActivity, android.app.SharedElementCallback paramSharedElementCallback)
    {
      paramActivity.setEnterSharedElementCallback(paramSharedElementCallback);
    }
    
    @DoNotInline
    public static void setExitSharedElementCallback(Activity paramActivity, android.app.SharedElementCallback paramSharedElementCallback)
    {
      paramActivity.setExitSharedElementCallback(paramSharedElementCallback);
    }
    
    @DoNotInline
    public static void startPostponedEnterTransition(Activity paramActivity)
    {
      paramActivity.startPostponedEnterTransition();
    }
  }
  
  @RequiresApi(22)
  public static class Api22Impl
  {
    @DoNotInline
    public static Uri getReferrer(Activity paramActivity)
    {
      return paramActivity.getReferrer();
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    public static void onSharedElementsReady(Object paramObject)
    {
      ((SharedElementCallback.OnSharedElementsReadyListener)paramObject).onSharedElementsReady();
    }
    
    @DoNotInline
    public static void requestPermissions(Activity paramActivity, String[] paramArrayOfString, int paramInt)
    {
      paramActivity.requestPermissions(paramArrayOfString, paramInt);
    }
    
    @DoNotInline
    public static boolean shouldShowRequestPermissionRationale(Activity paramActivity, String paramString)
    {
      return paramActivity.shouldShowRequestPermissionRationale(paramString);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static <T> T requireViewById(Activity paramActivity, int paramInt)
    {
      return c.i(paramActivity, paramInt);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static Display getDisplay(ContextWrapper paramContextWrapper)
    {
      return d.g(paramContextWrapper);
    }
    
    @DoNotInline
    public static void setLocusContext(@NonNull Activity paramActivity, @Nullable LocusIdCompat paramLocusIdCompat, @Nullable Bundle paramBundle)
    {
      if (paramLocusIdCompat == null) {
        paramLocusIdCompat = null;
      } else {
        paramLocusIdCompat = paramLocusIdCompat.toLocusId();
      }
      d.p(paramActivity, paramLocusIdCompat, paramBundle);
    }
  }
  
  @RequiresApi(31)
  public static class Api31Impl
  {
    @DoNotInline
    public static boolean isLaunchedFromBubble(@NonNull Activity paramActivity)
    {
      return g.p(paramActivity);
    }
  }
  
  public static abstract interface OnRequestPermissionsResultCallback
  {
    public abstract void onRequestPermissionsResult(int paramInt, @NonNull String[] paramArrayOfString, @NonNull int[] paramArrayOfInt);
  }
  
  public static abstract interface PermissionCompatDelegate
  {
    public abstract boolean onActivityResult(@NonNull Activity paramActivity, @IntRange(from=0L) int paramInt1, int paramInt2, @Nullable Intent paramIntent);
    
    public abstract boolean requestPermissions(@NonNull Activity paramActivity, @NonNull String[] paramArrayOfString, @IntRange(from=0L) int paramInt);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static abstract interface RequestPermissionsRequestCodeValidator
  {
    public abstract void validateRequestPermissionsRequestCode(int paramInt);
  }
  
  @RequiresApi(21)
  public static class SharedElementCallback21Impl
    extends android.app.SharedElementCallback
  {
    private final SharedElementCallback mCallback;
    
    public SharedElementCallback21Impl(SharedElementCallback paramSharedElementCallback)
    {
      mCallback = paramSharedElementCallback;
    }
    
    public Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
    {
      return mCallback.onCaptureSharedElementSnapshot(paramView, paramMatrix, paramRectF);
    }
    
    public View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
    {
      return mCallback.onCreateSnapshotView(paramContext, paramParcelable);
    }
    
    public void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
    {
      mCallback.onMapSharedElements(paramList, paramMap);
    }
    
    public void onRejectSharedElements(List<View> paramList)
    {
      mCallback.onRejectSharedElements(paramList);
    }
    
    public void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
    {
      mCallback.onSharedElementEnd(paramList, paramList1, paramList2);
    }
    
    public void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
    {
      mCallback.onSharedElementStart(paramList, paramList1, paramList2);
    }
    
    @RequiresApi(23)
    public void onSharedElementsArrived(List<String> paramList, List<View> paramList1, SharedElementCallback.OnSharedElementsReadyListener paramOnSharedElementsReadyListener)
    {
      mCallback.onSharedElementsArrived(paramList, paramList1, new a(paramOnSharedElementsReadyListener));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */