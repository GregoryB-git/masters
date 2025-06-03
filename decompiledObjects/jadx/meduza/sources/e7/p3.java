package e7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements k4, f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4566a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4567b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4568c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4569d;

    public /* synthetic */ p3(k3 k3Var, AtomicReference atomicReference, b6 b6Var) {
        this.f4566a = 0;
        this.f4567b = k3Var;
        this.f4568c = atomicReference;
        this.f4569d = b6Var;
    }

    public final g9.o0 a() {
        return new g9.o0(this, j9.l.f8692c, false);
    }

    @Override // e7.k4
    public final void c(String str, int i10, Throwable th, byte[] bArr, Map map) {
        switch (this.f4566a) {
            case 0:
                k3 k3Var = (k3) this.f4567b;
                AtomicReference atomicReference = (AtomicReference) this.f4568c;
                b6 b6Var = (b6) this.f4569d;
                k3Var.l();
                boolean z10 = (i10 == 200 || i10 == 204 || i10 == 304) && th == null;
                if (z10) {
                    k3Var.zzj().f4067w.c("[sgtm] Upload succeeded for row_id", Long.valueOf(b6Var.f4117a));
                } else {
                    k3Var.zzj().f4063r.a(Long.valueOf(b6Var.f4117a), Integer.valueOf(i10), th, "[sgtm] Upload failed for row_id. response, exception");
                }
                w4 q10 = k3Var.q();
                e eVar = new e(z10 ? 1 : 2, b6Var.f4117a, b6Var.f);
                q10.l();
                q10.t();
                q10.x(new v1(q10, q10.I(true), eVar));
                k3Var.zzj().f4067w.d("[sgtm] Updated status for row_id", Long.valueOf(b6Var.f4117a), z10 ? "SUCCESS" : "FAILURE");
                synchronized (atomicReference) {
                    atomicReference.set(Boolean.valueOf(z10));
                    atomicReference.notifyAll();
                }
                return;
            default:
                ((i6) this.f4569d).y(true, i10, th, bArr, (String) this.f4567b, (List) this.f4568c);
                return;
        }
    }

    public p3(i6 i6Var, String str, ArrayList arrayList) {
        this.f4566a = 1;
        this.f4567b = str;
        this.f4568c = arrayList;
        this.f4569d = i6Var;
    }

    public p3(g9.p0 p0Var) {
        this.f4566a = 2;
        this.f4567b = p0Var;
        this.f4568c = new HashSet();
        this.f4569d = new ArrayList();
    }
}
