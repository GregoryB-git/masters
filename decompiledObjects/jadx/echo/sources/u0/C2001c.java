package u0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.M;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC1425n;
import k0.C1441v0;
import k0.Z0;
import x0.InterfaceC2142x;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001c extends AbstractC1425n implements Handler.Callback {

    /* renamed from: F, reason: collision with root package name */
    public final InterfaceC1999a f19653F;

    /* renamed from: G, reason: collision with root package name */
    public final InterfaceC2000b f19654G;

    /* renamed from: H, reason: collision with root package name */
    public final Handler f19655H;

    /* renamed from: I, reason: collision with root package name */
    public final O0.b f19656I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f19657J;

    /* renamed from: K, reason: collision with root package name */
    public O0.a f19658K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f19659L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f19660M;

    /* renamed from: N, reason: collision with root package name */
    public long f19661N;

    /* renamed from: O, reason: collision with root package name */
    public C1201x f19662O;

    /* renamed from: P, reason: collision with root package name */
    public long f19663P;

    public C2001c(InterfaceC2000b interfaceC2000b, Looper looper) {
        this(interfaceC2000b, looper, InterfaceC1999a.f19652a);
    }

    @Override // k0.AbstractC1425n
    public void T() {
        this.f19662O = null;
        this.f19658K = null;
        this.f19663P = -9223372036854775807L;
    }

    @Override // k0.AbstractC1425n
    public void W(long j7, boolean z7) {
        this.f19662O = null;
        this.f19659L = false;
        this.f19660M = false;
    }

    @Override // k0.a1
    public int a(C1194q c1194q) {
        if (this.f19653F.a(c1194q)) {
            return Z0.a(c1194q.f12711K == 0 ? 4 : 2);
        }
        return Z0.a(0);
    }

    @Override // k0.Y0
    public boolean c() {
        return this.f19660M;
    }

    @Override // k0.AbstractC1425n
    public void c0(C1194q[] c1194qArr, long j7, long j8, InterfaceC2142x.b bVar) {
        this.f19658K = this.f19653F.b(c1194qArr[0]);
        C1201x c1201x = this.f19662O;
        if (c1201x != null) {
            this.f19662O = c1201x.c((c1201x.f13014p + this.f19663P) - j8);
        }
        this.f19663P = j8;
    }

    @Override // k0.Y0, k0.a1
    public String d() {
        return "MetadataRenderer";
    }

    @Override // k0.Y0
    public boolean e() {
        return true;
    }

    @Override // k0.Y0
    public void f(long j7, long j8) {
        boolean z7 = true;
        while (z7) {
            m0();
            z7 = l0(j7);
        }
    }

    public final void h0(C1201x c1201x, List list) {
        for (int i7 = 0; i7 < c1201x.e(); i7++) {
            C1194q s7 = c1201x.d(i7).s();
            if (s7 == null || !this.f19653F.a(s7)) {
                list.add(c1201x.d(i7));
            } else {
                O0.a b7 = this.f19653F.b(s7);
                byte[] bArr = (byte[]) AbstractC1297a.e(c1201x.d(i7).M());
                this.f19656I.m();
                this.f19656I.z(bArr.length);
                ((ByteBuffer) M.i(this.f19656I.f15400r)).put(bArr);
                this.f19656I.C();
                C1201x a7 = b7.a(this.f19656I);
                if (a7 != null) {
                    h0(a7, list);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        k0((C1201x) message.obj);
        return true;
    }

    public final long i0(long j7) {
        AbstractC1297a.f(j7 != -9223372036854775807L);
        AbstractC1297a.f(this.f19663P != -9223372036854775807L);
        return j7 - this.f19663P;
    }

    public final void j0(C1201x c1201x) {
        Handler handler = this.f19655H;
        if (handler != null) {
            handler.obtainMessage(1, c1201x).sendToTarget();
        } else {
            k0(c1201x);
        }
    }

    public final void k0(C1201x c1201x) {
        this.f19654G.x(c1201x);
    }

    public final boolean l0(long j7) {
        boolean z7;
        C1201x c1201x = this.f19662O;
        if (c1201x == null || (!this.f19657J && c1201x.f13014p > i0(j7))) {
            z7 = false;
        } else {
            j0(this.f19662O);
            this.f19662O = null;
            z7 = true;
        }
        if (this.f19659L && this.f19662O == null) {
            this.f19660M = true;
        }
        return z7;
    }

    public final void m0() {
        if (this.f19659L || this.f19662O != null) {
            return;
        }
        this.f19656I.m();
        C1441v0 N6 = N();
        int e02 = e0(N6, this.f19656I, 0);
        if (e02 != -4) {
            if (e02 == -5) {
                this.f19661N = ((C1194q) AbstractC1297a.e(N6.f16024b)).f12731s;
                return;
            }
            return;
        }
        if (this.f19656I.p()) {
            this.f19659L = true;
            return;
        }
        if (this.f19656I.f15402t >= P()) {
            O0.b bVar = this.f19656I;
            bVar.f3710x = this.f19661N;
            bVar.C();
            C1201x a7 = ((O0.a) M.i(this.f19658K)).a(this.f19656I);
            if (a7 != null) {
                ArrayList arrayList = new ArrayList(a7.e());
                h0(a7, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f19662O = new C1201x(i0(this.f19656I.f15402t), arrayList);
            }
        }
    }

    public C2001c(InterfaceC2000b interfaceC2000b, Looper looper, InterfaceC1999a interfaceC1999a) {
        this(interfaceC2000b, looper, interfaceC1999a, false);
    }

    public C2001c(InterfaceC2000b interfaceC2000b, Looper looper, InterfaceC1999a interfaceC1999a, boolean z7) {
        super(5);
        this.f19654G = (InterfaceC2000b) AbstractC1297a.e(interfaceC2000b);
        this.f19655H = looper == null ? null : M.z(looper, this);
        this.f19653F = (InterfaceC1999a) AbstractC1297a.e(interfaceC1999a);
        this.f19657J = z7;
        this.f19656I = new O0.b();
        this.f19663P = -9223372036854775807L;
    }
}
