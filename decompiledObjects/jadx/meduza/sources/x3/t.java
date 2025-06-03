package x3;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import n9.a;
import p2.m0;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17098b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f17097a = i10;
        this.f17098b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17097a) {
            case 0:
                ((Handler) this.f17098b).post(runnable);
                break;
            default:
                a.b bVar = ((d9.x) this.f17098b).f3735c.f11322a;
                bVar.getClass();
                try {
                    bVar.f11328a.execute(runnable);
                    break;
                } catch (RejectedExecutionException unused) {
                    m0.y(2, n9.a.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
                    return;
                }
        }
    }
}
