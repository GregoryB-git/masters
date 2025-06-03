package xa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.g;
import j7.e;
import java.util.ArrayList;
import java.util.Arrays;
import l3.l;

/* loaded from: classes.dex */
public class b implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f17233a;

    /* renamed from: b, reason: collision with root package name */
    public Context f17234b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f17235c;

    /* renamed from: d, reason: collision with root package name */
    public j7.b f17236d;

    public final boolean a() {
        ArrayList arrayList = new ArrayList(Arrays.asList("com.android.vending"));
        String installerPackageName = this.f17234b.getPackageManager().getInstallerPackageName(this.f17234b.getPackageName());
        Log.i("InAppReviewPlugin", "appInstalledBySupportedStore: installer: " + installerPackageName);
        return installerPackageName != null && arrayList.contains(installerPackageName);
    }

    public final void b(MethodChannel.Result result, l lVar, j7.b bVar) {
        Task task;
        Log.i("InAppReviewPlugin", "launchReviewFlow: called");
        if (c(result)) {
            return;
        }
        Activity activity = this.f17235c;
        lVar.getClass();
        if (bVar.b()) {
            task = Tasks.forResult(null);
        } else {
            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", bVar.a());
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            intent.putExtra("result_receiver", new e((Handler) lVar.f9560b, taskCompletionSource));
            activity.startActivity(intent);
            task = taskCompletionSource.getTask();
        }
        task.addOnCompleteListener(new g(result, 4));
    }

    public final boolean c(MethodChannel.Result result) {
        String str;
        Log.i("InAppReviewPlugin", "noContextOrActivity: called");
        if (this.f17234b == null) {
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android context not available");
            str = "Android context not available";
        } else {
            if (this.f17235c != null) {
                return false;
            }
            Log.e("InAppReviewPlugin", "noContextOrActivity: Android activity not available");
            str = "Android activity not available";
        }
        result.error("error", str, null);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f17235c = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.britannio.in_app_review");
        this.f17233a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f17234b = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f17235c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17233a.setMethodCallHandler(null);
        this.f17234b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        if (r8 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r8, io.flutter.plugin.common.MethodChannel.Result r9) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
