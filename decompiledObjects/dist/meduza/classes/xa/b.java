package xa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import f;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugins.firebase.auth.g;
import java.util.ArrayList;
import java.util.Arrays;
import l3.l;
import m9.q;

public class b
  implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware
{
  public MethodChannel a;
  public Context b;
  public Activity c;
  public j7.b d;
  
  public final boolean a()
  {
    ArrayList localArrayList = new ArrayList(Arrays.asList(new String[] { "com.android.vending" }));
    String str = b.getPackageManager().getInstallerPackageName(b.getPackageName());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("appInstalledBySupportedStore: installer: ");
    localStringBuilder.append(str);
    Log.i("InAppReviewPlugin", localStringBuilder.toString());
    boolean bool;
    if ((str != null) && (localArrayList.contains(str))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b(MethodChannel.Result paramResult, l paraml, j7.b paramb)
  {
    Log.i("InAppReviewPlugin", "launchReviewFlow: called");
    if (c(paramResult)) {
      return;
    }
    Activity localActivity = c;
    paraml.getClass();
    if (paramb.b())
    {
      paraml = Tasks.forResult(null);
    }
    else
    {
      Intent localIntent = new Intent(localActivity, PlayCoreDialogWrapperActivity.class);
      localIntent.putExtra("confirmation_intent", paramb.a());
      localIntent.putExtra("window_flags", localActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
      paramb = new TaskCompletionSource();
      localIntent.putExtra("result_receiver", new j7.e((Handler)b, paramb));
      localActivity.startActivity(localIntent);
      paraml = paramb.getTask();
    }
    paraml.addOnCompleteListener(new g(paramResult, 4));
  }
  
  public final boolean c(MethodChannel.Result paramResult)
  {
    Log.i("InAppReviewPlugin", "noContextOrActivity: called");
    if (b == null) {
      Log.e("InAppReviewPlugin", "noContextOrActivity: Android context not available");
    }
    for (String str = "Android context not available";; str = "Android activity not available")
    {
      paramResult.error("error", str, null);
      return true;
      if (c != null) {
        break;
      }
      Log.e("InAppReviewPlugin", "noContextOrActivity: Android activity not available");
    }
    return false;
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    c = paramActivityPluginBinding.getActivity();
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    MethodChannel localMethodChannel = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "dev.britannio.in_app_review");
    a = localMethodChannel;
    localMethodChannel.setMethodCallHandler(this);
    b = paramFlutterPluginBinding.getApplicationContext();
  }
  
  public final void onDetachedFromActivity()
  {
    c = null;
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    a.setMethodCallHandler(null);
    b = null;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = f.l("onMethodCall: ");
    ((StringBuilder)localObject).append(method);
    Log.i("InAppReviewPlugin", ((StringBuilder)localObject).toString());
    paramMethodCall = method;
    paramMethodCall.getClass();
    int i = paramMethodCall.hashCode();
    boolean bool = true;
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1361080007: 
      if (paramMethodCall.equals("requestReview")) {
        j = 2;
      }
      break;
    case 444517567: 
      if (paramMethodCall.equals("isAvailable")) {
        j = 1;
      }
      break;
    case 159262157: 
      if (paramMethodCall.equals("openStoreListing")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 2: 
      Log.i("InAppReviewPlugin", "requestReview: called");
      if (!c(paramResult))
      {
        if (!a()) {
          Log.w("InAppReviewPlugin", "The app should be installed by the Play Store to test in_app_review. See https://pub.dev/packages/in_app_review#testing-read-carefully for more information.");
        }
        paramMethodCall = x6.b.P(b);
        localObject = d;
        if (localObject != null)
        {
          b(paramResult, paramMethodCall, (j7.b)localObject);
        }
        else
        {
          localObject = paramMethodCall.e();
          Log.i("InAppReviewPlugin", "requestReview: Requesting review flow");
          ((Task)localObject).addOnCompleteListener(new q(this, paramResult, paramMethodCall, 1));
        }
      }
      break;
    case 1: 
      Log.i("InAppReviewPlugin", "isAvailable: called");
      Log.i("InAppReviewPlugin", "noContextOrActivity: called");
      if (b == null)
      {
        paramMethodCall = "noContextOrActivity: Android context not available";
      }
      else
      {
        if (c != null) {
          break label326;
        }
        paramMethodCall = "noContextOrActivity: Android activity not available";
      }
      Log.e("InAppReviewPlugin", paramMethodCall);
      j = 1;
      break label329;
      j = 0;
      if (j == 0)
      {
        if (!a()) {
          Log.w("InAppReviewPlugin", "The app should be installed by the Play Store to test in_app_review. See https://pub.dev/packages/in_app_review#testing-read-carefully for more information.");
        }
        try
        {
          j = Build.VERSION.SDK_INT;
          if (j >= 33) {
            b.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L));
          } else {
            b.getPackageManager().getPackageInfo("com.android.vending", 0);
          }
          j = 1;
        }
        catch (PackageManager.NameNotFoundException paramMethodCall)
        {
          Log.i("InAppReviewPlugin", "Play Store not installed.");
          j = 0;
        }
        if (j != 0)
        {
          if (j6.e.d.b(b) != 0)
          {
            Log.i("InAppReviewPlugin", "Google Play Services not available");
            j = 0;
          }
          else
          {
            j = 1;
          }
          if (j != 0) {}
        }
        else
        {
          bool = false;
        }
        paramMethodCall = new StringBuilder();
        paramMethodCall.append("isAvailable: playStoreAndPlayServicesAvailable: ");
        paramMethodCall.append(bool);
        Log.i("InAppReviewPlugin", paramMethodCall.toString());
        Log.i("InAppReviewPlugin", "isAvailable: lollipopOrLater: true");
        if (bool)
        {
          Log.i("InAppReviewPlugin", "isAvailable: Play Store, Play Services and Android version requirements met");
          Log.i("InAppReviewPlugin", "cacheReviewInfo: called");
          if (!c(paramResult))
          {
            paramMethodCall = x6.b.P(b).e();
            Log.i("InAppReviewPlugin", "cacheReviewInfo: Requesting review flow");
            paramMethodCall.addOnCompleteListener(new a(this, paramResult, 0));
          }
        }
        else
        {
          Log.w("InAppReviewPlugin", "isAvailable: The Play Store must be installed, Play Services must be available and Android 5 or later must be used");
        }
      }
      else
      {
        paramResult.success(Boolean.FALSE);
      }
      break;
    case 0: 
      label326:
      label329:
      Log.i("InAppReviewPlugin", "openStoreListing: called");
      if (!c(paramResult))
      {
        paramMethodCall = b.getPackageName();
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("https://play.google.com/store/apps/details?id=");
        ((StringBuilder)localObject).append(paramMethodCall);
        paramMethodCall = new Intent("android.intent.action.VIEW", Uri.parse(((StringBuilder)localObject).toString()));
        c.startActivity(paramMethodCall);
        paramResult.success(null);
      }
      break;
    }
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    onAttachedToActivity(paramActivityPluginBinding);
  }
}

/* Location:
 * Qualified Name:     xa.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */