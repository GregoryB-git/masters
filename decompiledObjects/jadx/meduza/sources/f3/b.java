package f3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.f;
import ec.i;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final String f5330d = "dynamic_icon_flutter";

    public final void b(String str, List<String> list) {
        Context a10 = a();
        i.b(a10);
        PackageManager packageManager = a10.getPackageManager();
        i.d(packageManager, "getPackageManager(...)");
        Context a11 = a();
        i.b(a11);
        String packageName = a11.getPackageName();
        StringBuilder m10 = f.m(packageName, ".", str);
        for (String str2 : list) {
            int i10 = i.a(str2, str) ? 1 : 2;
            i.b(packageName);
            packageManager.setComponentEnabledSetting(new ComponentName(packageName, packageName + '.' + str2), i10, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent();
            i.b(packageName);
            intent.setClassName(packageName, m10.toString());
            intent.setAction("android.intent.action.MAIN");
            intent.addFlags(67108864);
            intent.setFlags(268468224);
            Activity activity = this.f5328b.get();
            if (activity != null) {
                activity.finish();
            }
            Context a12 = a();
            i.b(a12);
            v.a.startActivity(a12, intent, null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        i.e(methodCall, "call");
        i.e(result, "result");
        if (!i.a(methodCall.method, "setIcon")) {
            result.notImplemented();
            return;
        }
        try {
            String str = (String) methodCall.argument("icon");
            List<String> list = (List) methodCall.argument("listAvailableIcon");
            if (list != null && str != null) {
                b(str, list);
            }
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
