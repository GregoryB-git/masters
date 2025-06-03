package za;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public final class b implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f17822a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f17823b;

    public b(PackageManager packageManager, ActivityManager activityManager) {
        this.f17822a = packageManager;
        this.f17823b = activityManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00c5, code lost:
    
        if (lc.h.n0(r1, "generic") == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0182 A[LOOP:1: B:21:0x017c->B:23:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r12, io.flutter.plugin.common.MethodChannel.Result r13) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: za.b.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
