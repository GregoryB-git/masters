package e7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w4 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public final i5 f4734d;

    /* renamed from: e, reason: collision with root package name */
    public n0 f4735e;
    public volatile Boolean f;

    /* renamed from: o, reason: collision with root package name */
    public final x4 f4736o;

    /* renamed from: p, reason: collision with root package name */
    public final pb.c f4737p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f4738q;

    /* renamed from: r, reason: collision with root package name */
    public final x4 f4739r;

    public w4(j2 j2Var) {
        super(j2Var);
        this.f4738q = new ArrayList();
        this.f4737p = new pb.c(j2Var.f4371v);
        this.f4734d = new i5(this);
        this.f4736o = new x4(this, j2Var, 0);
        this.f4739r = new x4(this, j2Var, 1);
    }

    public final void A() {
        b1 b1Var;
        String str;
        l();
        t();
        if (C()) {
            return;
        }
        if (F()) {
            i5 i5Var = this.f4734d;
            i5Var.f4329c.l();
            Context zza = i5Var.f4329c.zza();
            synchronized (i5Var) {
                if (i5Var.f4327a) {
                    b1Var = i5Var.f4329c.zzj().f4067w;
                    str = "Connection attempt already in progress";
                } else if (i5Var.f4328b == null || !(i5Var.f4328b.isConnecting() || i5Var.f4328b.isConnected())) {
                    i5Var.f4328b = new z0(zza, Looper.getMainLooper(), i5Var, i5Var);
                    i5Var.f4329c.zzj().f4067w.b("Connecting to remote service");
                    i5Var.f4327a = true;
                    m6.j.i(i5Var.f4328b);
                    i5Var.f4328b.checkAvailabilityAndConnect();
                } else {
                    b1Var = i5Var.f4329c.zzj().f4067w;
                    str = "Already awaiting connection attempt";
                }
                b1Var.b(str);
            }
            return;
        }
        if (h().C()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!((queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true)) {
            zzj().f4060o.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        i5 i5Var2 = this.f4734d;
        i5Var2.f4329c.l();
        Context zza2 = i5Var2.f4329c.zza();
        u6.a b10 = u6.a.b();
        synchronized (i5Var2) {
            if (i5Var2.f4327a) {
                i5Var2.f4329c.zzj().f4067w.b("Connection attempt already in progress");
            } else {
                i5Var2.f4329c.zzj().f4067w.b("Using local app measurement service");
                i5Var2.f4327a = true;
                b10.a(zza2, intent, i5Var2.f4329c.f4734d, 129);
            }
        }
    }

    public final void B() {
        l();
        t();
        i5 i5Var = this.f4734d;
        if (i5Var.f4328b != null && (i5Var.f4328b.isConnected() || i5Var.f4328b.isConnecting())) {
            i5Var.f4328b.disconnect();
        }
        i5Var.f4328b = null;
        try {
            u6.a.b().c(zza(), this.f4734d);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f4735e = null;
    }

    public final boolean C() {
        l();
        t();
        return this.f4735e != null;
    }

    public final boolean D() {
        l();
        t();
        return !F() || k().s0() >= h0.E0.a(null).intValue();
    }

    public final boolean E() {
        l();
        t();
        return !F() || k().s0() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.w4.F():boolean");
    }

    public final void G() {
        l();
        zzj().f4067w.c("Processing queued up service tasks", Integer.valueOf(this.f4738q.size()));
        Iterator it = this.f4738q.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                zzj().f4060o.c("Task exception while flushing queue", e10);
            }
        }
        this.f4738q.clear();
        this.f4739r.a();
    }

    public final void H() {
        l();
        pb.c cVar = this.f4737p;
        ((b.z) ((v6.b) cVar.f13112b)).getClass();
        cVar.f13111a = SystemClock.elapsedRealtime();
        this.f4736o.b(h0.U.a(null).longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020f  */
    /* JADX WARN: Type inference failed for: r10v21, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.k6 I(boolean r49) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.w4.I(boolean):e7.k6");
    }

    @Override // e7.j0
    public final boolean s() {
        return false;
    }

    public final void v(f fVar) {
        boolean w10;
        l();
        t();
        w0 n2 = n();
        n2.k();
        byte[] a02 = r6.a0(fVar);
        if (a02.length > 131072) {
            n2.zzj().f4061p.b("Conditional user property too long for local database. Sending directly to service");
            w10 = false;
        } else {
            w10 = n2.w(a02, 2);
        }
        f fVar2 = new f(fVar);
        x(new g5(this, I(true), w10, fVar2, fVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0201 A[Catch: all -> 0x01c6, TRY_ENTER, TryCatch #16 {all -> 0x01c6, blocks: (B:85:0x009e, B:88:0x00a4, B:90:0x00b4, B:98:0x00ca, B:100:0x014f, B:126:0x0201, B:128:0x0207, B:129:0x020a, B:107:0x0225, B:118:0x0239, B:139:0x00e9, B:140:0x00ec, B:136:0x00e4, B:148:0x00f2, B:151:0x0106, B:157:0x011e, B:158:0x0121, B:160:0x0117, B:162:0x0124, B:165:0x0138, B:170:0x0153, B:171:0x0156, B:173:0x0149, B:176:0x015a, B:177:0x016b, B:179:0x0163, B:187:0x0182, B:190:0x0191, B:194:0x019d, B:195:0x01a8), top: B:84:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(e7.n0 r29, n6.a r30, e7.k6 r31) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.w4.w(e7.n0, n6.a, e7.k6):void");
    }

    public final void x(Runnable runnable) {
        l();
        if (C()) {
            runnable.run();
        } else {
            if (this.f4738q.size() >= 1000) {
                zzj().f4060o.b("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f4738q.add(runnable);
            this.f4739r.b(60000L);
            A();
        }
    }

    public final void y(AtomicReference<String> atomicReference) {
        l();
        t();
        x(new v1(this, atomicReference, I(false), 3));
    }

    public final void z(boolean z10) {
        l();
        t();
        if (D()) {
            x(new i6.p(this, I(false), 8));
        }
    }
}
