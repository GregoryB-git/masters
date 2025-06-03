package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f3037b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3038c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3040e;

    /* renamed from: a, reason: collision with root package name */
    private final m7.v f3036a = new m7.v("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f3039d = new Object();

    public y(String str, long j10) {
        this.f3037b = str;
        this.f3038c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f3039d) {
            if (this.f3040e) {
                return Tasks.forResult(0);
            }
            this.f3040e = true;
            m7.v vVar = this.f3036a;
            Object[] objArr = {Integer.valueOf(i10)};
            vVar.getClass();
            if (Log.isLoggable("PlayCore", 3)) {
                Log.d("PlayCore", m7.v.c(vVar.f10368a, "checkAndShowDialog(%s)", objArr));
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialog.intent.type", i10);
            bundle.putString("package.name", this.f3037b);
            bundle.putInt("playcore.integrity.version.major", 1);
            bundle.putInt("playcore.integrity.version.minor", 3);
            bundle.putInt("playcore.integrity.version.patch", 0);
            bundle.putLong("request.token.sid", this.f3038c);
            return b(activity, bundle);
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
