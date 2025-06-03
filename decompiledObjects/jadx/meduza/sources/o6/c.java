package o6;

import android.content.Context;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import d2.h0;
import k6.a;
import k6.d;
import l6.q;
import m6.m;
import m6.n;

/* loaded from: classes.dex */
public final class c extends k6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final k6.a f11932a = new k6.a("ClientTelemetry.API", new b(), new a.g());

    public c(Context context, n nVar) {
        super(context, (k6.a<n>) f11932a, nVar, d.a.f9097c);
    }

    public final Task<Void> a(m mVar) {
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zaf.zaa};
        aVar.f9715b = false;
        aVar.f9714a = new h0(mVar, 4);
        return doBestEffortWrite(aVar.a());
    }
}
