package m9;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import eb.e1;
import eb.t0;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import m9.a;
import m9.j0;
import n9.a;

/* loaded from: classes.dex */
public abstract class a<ReqT, RespT, CallbackT extends j0> {

    /* renamed from: n, reason: collision with root package name */
    public static final long f10724n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f10725o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f10726p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f10727q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f10728r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f10729s = 0;

    /* renamed from: a, reason: collision with root package name */
    public a.C0174a f10730a;

    /* renamed from: b, reason: collision with root package name */
    public a.C0174a f10731b;

    /* renamed from: c, reason: collision with root package name */
    public final v f10732c;

    /* renamed from: d, reason: collision with root package name */
    public final t0<ReqT, RespT> f10733d;

    /* renamed from: e, reason: collision with root package name */
    public final a<ReqT, RespT, CallbackT>.b f10734e;
    public final n9.a f;

    /* renamed from: g, reason: collision with root package name */
    public final a.c f10735g;

    /* renamed from: h, reason: collision with root package name */
    public final a.c f10736h;

    /* renamed from: i, reason: collision with root package name */
    public i0 f10737i;

    /* renamed from: j, reason: collision with root package name */
    public long f10738j;

    /* renamed from: k, reason: collision with root package name */
    public s f10739k;

    /* renamed from: l, reason: collision with root package name */
    public final n9.g f10740l;

    /* renamed from: m, reason: collision with root package name */
    public final CallbackT f10741m;

    /* renamed from: m9.a$a, reason: collision with other inner class name */
    public class C0162a {

        /* renamed from: a, reason: collision with root package name */
        public final long f10742a;

        public C0162a(long j10) {
            this.f10742a = j10;
        }

        public final void a(Runnable runnable) {
            a.this.f.d();
            a aVar = a.this;
            if (aVar.f10738j == this.f10742a) {
                runnable.run();
            } else {
                p2.m0.y(1, aVar.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.c()) {
                aVar.a(i0.Initial, e1.f5070e);
            }
        }
    }

    public class c implements a0<RespT> {

        /* renamed from: a, reason: collision with root package name */
        public final a<ReqT, RespT, CallbackT>.C0162a f10745a;

        /* renamed from: b, reason: collision with root package name */
        public int f10746b = 0;

        public c(a<ReqT, RespT, CallbackT>.C0162a c0162a) {
            this.f10745a = c0162a;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10724n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f10725o = timeUnit2.toMillis(1L);
        f10726p = timeUnit2.toMillis(1L);
        f10727q = timeUnit.toMillis(10L);
        f10728r = timeUnit.toMillis(10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(v vVar, t0 t0Var, n9.a aVar, a.c cVar, a.c cVar2, j0 j0Var) {
        a.c cVar3 = a.c.HEALTH_CHECK_TIMEOUT;
        this.f10737i = i0.Initial;
        this.f10738j = 0L;
        this.f10732c = vVar;
        this.f10733d = t0Var;
        this.f = aVar;
        this.f10735g = cVar2;
        this.f10736h = cVar3;
        this.f10741m = j0Var;
        this.f10734e = new b();
        this.f10740l = new n9.g(aVar, cVar, f10724n, f10725o);
    }

    public final void a(i0 i0Var, e1 e1Var) {
        x6.b.Z("Only started streams should be closed.", d(), new Object[0]);
        i0 i0Var2 = i0.Error;
        x6.b.Z("Can't provide an error when not in an error state.", i0Var == i0Var2 || e1Var.e(), new Object[0]);
        this.f.d();
        HashSet hashSet = j.f10815d;
        e1.a aVar = e1Var.f5081a;
        Throwable th = e1Var.f5083c;
        if (th instanceof SSLHandshakeException) {
            th.getMessage().contains("no ciphers available");
        }
        a.C0174a c0174a = this.f10731b;
        if (c0174a != null) {
            c0174a.a();
            this.f10731b = null;
        }
        a.C0174a c0174a2 = this.f10730a;
        if (c0174a2 != null) {
            c0174a2.a();
            this.f10730a = null;
        }
        n9.g gVar = this.f10740l;
        a.C0174a c0174a3 = gVar.f11369h;
        if (c0174a3 != null) {
            c0174a3.a();
            gVar.f11369h = null;
        }
        this.f10738j++;
        e1.a aVar2 = e1Var.f5081a;
        if (aVar2 == e1.a.OK) {
            this.f10740l.f = 0L;
        } else if (aVar2 == e1.a.RESOURCE_EXHAUSTED) {
            p2.m0.y(1, getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            n9.g gVar2 = this.f10740l;
            gVar2.f = gVar2.f11367e;
        } else if (aVar2 == e1.a.UNAUTHENTICATED && this.f10737i != i0.Healthy) {
            v vVar = this.f10732c;
            vVar.f10894b.t();
            vVar.f10895c.t();
        } else if (aVar2 == e1.a.UNAVAILABLE) {
            Throwable th2 = e1Var.f5083c;
            if ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException)) {
                this.f10740l.f11367e = f10728r;
            }
        }
        if (i0Var != i0Var2) {
            p2.m0.y(1, getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            h();
        }
        if (this.f10739k != null) {
            if (e1Var.e()) {
                p2.m0.y(1, getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f10739k.b();
            }
            this.f10739k = null;
        }
        this.f10737i = i0Var;
        this.f10741m.c(e1Var);
    }

    public final void b() {
        x6.b.Z("Can only inhibit backoff after in a stopped state", !d(), new Object[0]);
        this.f.d();
        this.f10737i = i0.Initial;
        this.f10740l.f = 0L;
    }

    public final boolean c() {
        this.f.d();
        i0 i0Var = this.f10737i;
        return i0Var == i0.Open || i0Var == i0.Healthy;
    }

    public final boolean d() {
        this.f.d();
        i0 i0Var = this.f10737i;
        return i0Var == i0.Starting || i0Var == i0.Backoff || c();
    }

    public abstract void e(RespT respt);

    public abstract void f(RespT respt);

    public void g() {
        this.f.d();
        x6.b.Z("Last call still set", this.f10739k == null, new Object[0]);
        x6.b.Z("Idle timer still set", this.f10731b == null, new Object[0]);
        i0 i0Var = this.f10737i;
        i0 i0Var2 = i0.Error;
        if (i0Var == i0Var2) {
            x6.b.Z("Should only perform backoff in an error state", i0Var == i0Var2, new Object[0]);
            this.f10737i = i0.Backoff;
            this.f10740l.a(new u.a(this, 13));
            return;
        }
        x6.b.Z("Already started", i0Var == i0.Initial, new Object[0]);
        final c cVar = new c(new C0162a(this.f10738j));
        final v vVar = this.f10732c;
        t0<ReqT, RespT> t0Var = this.f10733d;
        vVar.getClass();
        final eb.e[] eVarArr = {null};
        Task<eb.e<ReqT, RespT>> a10 = vVar.f10896d.a(t0Var);
        a10.addOnCompleteListener(vVar.f10893a.f11322a, new OnCompleteListener() { // from class: m9.p
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                v vVar2 = v.this;
                eb.e[] eVarArr2 = eVarArr;
                a0 a0Var = cVar;
                vVar2.getClass();
                eb.e eVar = (eb.e) task.getResult();
                eVarArr2[0] = eVar;
                eVar.e(new r(vVar2, a0Var, eVarArr2), vVar2.a());
                a.c cVar2 = (a.c) a0Var;
                cVar2.f10745a.a(new b.k(cVar2, 16));
                eVarArr2[0].c(1);
            }
        });
        this.f10739k = new s(vVar, eVarArr, a10);
        this.f10737i = i0.Starting;
    }

    public void h() {
    }

    public final void i(ma.w wVar) {
        this.f.d();
        p2.m0.y(1, getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), wVar);
        a.C0174a c0174a = this.f10731b;
        if (c0174a != null) {
            c0174a.a();
            this.f10731b = null;
        }
        this.f10739k.d(wVar);
    }
}
