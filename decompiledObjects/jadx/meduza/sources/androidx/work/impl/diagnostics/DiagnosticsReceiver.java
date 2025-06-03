package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import o2.j;
import o2.l;
import p2.k0;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1524a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.d().a(f1524a, "Requesting diagnostics");
        try {
            k0.d(context).a(new l.a(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e10) {
            j.d().c(f1524a, "WorkManager is not initialized", e10);
        }
    }
}
