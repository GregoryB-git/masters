package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import l.l;
import o2.j;
import p2.m0;

/* loaded from: classes.dex */
public final class a implements p2.d {
    public static final String f = j.f("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f1481a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1482b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f1483c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final o2.a f1484d;

    /* renamed from: e, reason: collision with root package name */
    public final l f1485e;

    public a(Context context, m0 m0Var, l lVar) {
        this.f1481a = context;
        this.f1484d = m0Var;
        this.f1485e = lVar;
    }

    public static x2.l c(Intent intent) {
        return new x2.l(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, x2.l lVar) {
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f16820a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", lVar.f16821b);
    }

    @Override // p2.d
    public final void a(x2.l lVar, boolean z10) {
        synchronized (this.f1483c) {
            c cVar = (c) this.f1482b.remove(lVar);
            this.f1485e.f(lVar);
            if (cVar != null) {
                cVar.g(z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r10, android.content.Intent r11, androidx.work.impl.background.systemalarm.d r12) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.a.b(int, android.content.Intent, androidx.work.impl.background.systemalarm.d):void");
    }
}
