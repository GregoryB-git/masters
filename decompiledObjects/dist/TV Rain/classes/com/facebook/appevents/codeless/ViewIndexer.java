package com.facebook.appevents.codeless;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewIndexer
{
  private static final String APP_VERSION_PARAM = "app_version";
  private static final String PLATFORM_PARAM = "platform";
  private static final String REQUEST_TYPE = "request_type";
  private static final String SUCCESS = "success";
  private static final String TAG = "com.facebook.appevents.codeless.ViewIndexer";
  private static final String TREE_PARAM = "tree";
  private static ViewIndexer instance;
  private WeakReference<Activity> activityReference;
  private Timer indexingTimer;
  private String previousDigest;
  private final Handler uiThreadHandler;
  
  public ViewIndexer(Activity paramActivity)
  {
    activityReference = new WeakReference(paramActivity);
    previousDigest = null;
    uiThreadHandler = new Handler(Looper.getMainLooper());
    instance = this;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static GraphRequest buildAppIndexingRequest(String paramString1, AccessToken paramAccessToken, String paramString2, String paramString3)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewIndexer.class)) {
      return null;
    }
    if (paramString1 == null) {
      return null;
    }
    try
    {
      GraphRequest localGraphRequest = GraphRequest.newPostRequest(paramAccessToken, String.format(Locale.US, "%s/app_indexing", new Object[] { paramString2 }), null, null);
      paramString2 = localGraphRequest.getParameters();
      paramAccessToken = paramString2;
      if (paramString2 == null)
      {
        paramAccessToken = new android/os/Bundle;
        paramAccessToken.<init>();
      }
      paramAccessToken.putString("tree", paramString1);
      paramAccessToken.putString("app_version", AppEventUtility.getAppVersion());
      paramAccessToken.putString("platform", "android");
      paramAccessToken.putString("request_type", paramString3);
      if (paramString3.equals("app_indexing")) {
        paramAccessToken.putString("device_session_id", CodelessManager.getCurrentDeviceSessionID());
      }
      localGraphRequest.setParameters(paramAccessToken);
      paramString1 = new com/facebook/appevents/codeless/ViewIndexer$4;
      paramString1.<init>();
      localGraphRequest.setCallback(paramString1);
      return localGraphRequest;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, ViewIndexer.class);
    }
    return null;
  }
  
  private void sendToServer(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Executor localExecutor = FacebookSdk.getExecutor();
      Runnable local3 = new com/facebook/appevents/codeless/ViewIndexer$3;
      local3.<init>(this, paramString);
      localExecutor.execute(local3);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public static void sendToServerUnityInstance(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(ViewIndexer.class)) {
      return;
    }
    try
    {
      ViewIndexer localViewIndexer = instance;
      if (localViewIndexer == null) {
        return;
      }
      localViewIndexer.sendToServerUnity(paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, ViewIndexer.class);
    }
  }
  
  @VisibleForTesting
  public String getPreviousDigest()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = previousDigest;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public void processRequest(@Nullable GraphRequest paramGraphRequest, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    if (paramGraphRequest == null) {
      return;
    }
    try
    {
      paramGraphRequest = paramGraphRequest.executeAndWait();
      try
      {
        Object localObject = paramGraphRequest.getJSONObject();
        if (localObject != null)
        {
          if ("true".equals(((JSONObject)localObject).optString("success")))
          {
            Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Successfully send UI component tree to server");
            previousDigest = paramString;
          }
          if (((JSONObject)localObject).has("is_app_indexing_enabled")) {
            CodelessManager.updateAppIndexing(Boolean.valueOf(((JSONObject)localObject).getBoolean("is_app_indexing_enabled")));
          }
        }
        else
        {
          localObject = TAG;
          paramString = new java/lang/StringBuilder;
          paramString.<init>();
          paramString.append("Error sending UI component tree to Facebook: ");
          paramString.append(paramGraphRequest.getError());
          Log.e((String)localObject, paramString.toString());
        }
      }
      catch (JSONException paramGraphRequest)
      {
        Log.e(TAG, "Error decoding server response.", paramGraphRequest);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramGraphRequest, this);
    }
  }
  
  public void schedule()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      TimerTask local1 = new com/facebook/appevents/codeless/ViewIndexer$1;
      local1.<init>(this);
      try
      {
        Executor localExecutor = FacebookSdk.getExecutor();
        Runnable local2 = new com/facebook/appevents/codeless/ViewIndexer$2;
        local2.<init>(this, local1);
        localExecutor.execute(local2);
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        Log.e(TAG, "Error scheduling indexing job", localRejectedExecutionException);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  @Deprecated
  public void sendToServerUnity(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      instance.sendToServer(paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void unschedule()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if ((Activity)activityReference.get() == null) {
        return;
      }
      Timer localTimer = indexingTimer;
      if (localTimer != null) {
        try
        {
          localTimer.cancel();
          indexingTimer = null;
        }
        catch (Exception localException)
        {
          Log.e(TAG, "Error unscheduling indexing job", localException);
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public static class ScreenshotTaker
    implements Callable<String>
  {
    private WeakReference<View> rootView;
    
    public ScreenshotTaker(View paramView)
    {
      rootView = new WeakReference(paramView);
    }
    
    public String call()
    {
      Object localObject = (View)rootView.get();
      if ((localObject != null) && (((View)localObject).getWidth() != 0) && (((View)localObject).getHeight() != 0))
      {
        Bitmap localBitmap = Bitmap.createBitmap(((View)localObject).getWidth(), ((View)localObject).getHeight(), Bitmap.Config.RGB_565);
        ((View)localObject).draw(new Canvas(localBitmap));
        localObject = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)localObject);
        return Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 2);
      }
      return "";
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */