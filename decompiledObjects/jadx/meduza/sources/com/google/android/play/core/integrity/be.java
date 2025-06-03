package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class be extends m7.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bn f2973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f2973b = bnVar;
        this.f2972a = context;
    }

    @Override // m7.w
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        int i10;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f2972a;
        taskCompletionSource = this.f2973b.f2998d;
        m7.v vVar = m7.g.f10360a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo != null && applicationInfo.enabled && m7.g.a(packageInfo.signatures)) {
            i10 = packageInfo.versionCode;
            taskCompletionSource.trySetResult(Integer.valueOf(i10));
        }
        i10 = 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i10));
    }
}
