package androidx.work;

import android.content.Context;
import androidx.work.d;
import b.m;
import dc.p;
import nc.d0;
import nc.e0;
import nc.m1;
import nc.r0;
import rb.f;
import rb.h;
import ub.h;
import wb.i;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends d {

    /* renamed from: e, reason: collision with root package name */
    public final m1 f1425e;
    public final z2.c<d.a> f;

    /* renamed from: o, reason: collision with root package name */
    public final tc.c f1426o;

    @wb.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, ub.e<? super h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public o2.i f1427a;

        /* renamed from: b, reason: collision with root package name */
        public int f1428b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o2.i<o2.d> f1429c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f1430d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2.i<o2.d> iVar, CoroutineWorker coroutineWorker, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f1429c = iVar;
            this.f1430d = coroutineWorker;
        }

        @Override // wb.a
        public final ub.e<h> create(Object obj, ub.e<?> eVar) {
            return new a(this.f1429c, this.f1430d, eVar);
        }

        @Override // dc.p
        public final Object invoke(d0 d0Var, ub.e<? super h> eVar) {
            return ((a) create(d0Var, eVar)).invokeSuspend(h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f1428b;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o2.i iVar = this.f1427a;
                f.b(obj);
                iVar.f11718b.i(obj);
                return h.f13851a;
            }
            f.b(obj);
            o2.i<o2.d> iVar2 = this.f1429c;
            CoroutineWorker coroutineWorker = this.f1430d;
            this.f1427a = iVar2;
            this.f1428b = 1;
            coroutineWorker.getClass();
            throw new IllegalStateException("Not implemented");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ec.i.e(context, "appContext");
        ec.i.e(workerParameters, "params");
        this.f1425e = new m1(null);
        z2.c<d.a> cVar = new z2.c<>();
        this.f = cVar;
        cVar.f(new m(this, 7), this.f1458b.f1438d.c());
        this.f1426o = r0.f11545a;
    }

    @Override // androidx.work.d
    public final s7.e<o2.d> b() {
        m1 m1Var = new m1(null);
        tc.c cVar = this.f1426o;
        cVar.getClass();
        sc.d a10 = e0.a(h.a.a(cVar, m1Var));
        o2.i iVar = new o2.i(m1Var);
        x6.b.g0(a10, null, new a(iVar, this, null), 3);
        return iVar;
    }

    @Override // androidx.work.d
    public final void g() {
        this.f.cancel(false);
    }

    @Override // androidx.work.d
    public final z2.c h() {
        x6.b.g0(e0.a(this.f1426o.plus(this.f1425e)), null, new b(this, null), 3);
        return this.f;
    }

    public abstract Object j();
}
