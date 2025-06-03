package bb;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import b.z;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import ec.i;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import lc.k;
import rb.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2194a;

    /* renamed from: c, reason: collision with root package name */
    public final f f2196c;

    /* renamed from: b, reason: collision with root package name */
    public Activity f2195b = null;

    /* renamed from: d, reason: collision with root package name */
    public final g f2197d = z.n(new dc.a() { // from class: bb.b
        @Override // dc.a
        public final Object invoke() {
            return defpackage.g.d(d.this.a().getPackageName(), ".flutter.share_provider");
        }
    });

    /* renamed from: e, reason: collision with root package name */
    public final g f2198e = z.n(new c(0));

    public d(Context context, f fVar) {
        this.f2194a = context;
        this.f2196c = fVar;
    }

    public static String b(String str) {
        if (str == null || !k.o0(str, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            return "*";
        }
        String substring = str.substring(0, k.s0(str, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6));
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final Context a() {
        Activity activity = this.f2195b;
        if (activity == null) {
            return this.f2194a;
        }
        i.b(activity);
        return activity;
    }

    public final File c() {
        return new File(a().getCacheDir(), "share_plus");
    }

    public final void d(String str, String str2) {
        i.e(str, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        Intent createChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f2194a, 0, new Intent(this.f2194a, (Class<?>) SharePlusPendingIntent.class), 134217728 | ((Number) this.f2198e.getValue()).intValue()).getIntentSender());
        i.b(createChooser);
        f(createChooser);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.util.List r11, java.util.List r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.d.e(java.util.List, java.util.List, java.lang.String, java.lang.String):void");
    }

    public final void f(Intent intent) {
        MethodChannel.Result result;
        Activity activity = this.f2195b;
        if (activity != null) {
            activity.startActivityForResult(intent, 22643);
            return;
        }
        intent.addFlags(268435456);
        f fVar = this.f2196c;
        if (fVar.f2203b.compareAndSet(false, true) && (result = fVar.f2202a) != null) {
            result.success("dev.fluttercommunity.plus/share/unavailable");
            fVar.f2202a = null;
        }
        this.f2194a.startActivity(intent);
    }
}
