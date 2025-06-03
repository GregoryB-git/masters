package p4;

import a0.j;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l3.l;
import p4.a;
import p4.c;
import v3.d0;
import v3.i0;
import v5.e0;

/* loaded from: classes.dex */
public final class f extends v3.f implements Handler.Callback {
    public boolean A;
    public long B;
    public a C;
    public long D;

    /* renamed from: u, reason: collision with root package name */
    public final c f13000u;

    /* renamed from: v, reason: collision with root package name */
    public final e f13001v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f13002w;

    /* renamed from: x, reason: collision with root package name */
    public final d f13003x;

    /* renamed from: y, reason: collision with root package name */
    public b f13004y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13005z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d0.b bVar, Looper looper) {
        super(5);
        Handler handler;
        c.a aVar = c.f12998a;
        this.f13001v = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = e0.f15881a;
            handler = new Handler(looper, this);
        }
        this.f13002w = handler;
        this.f13000u = aVar;
        this.f13003x = new d();
        this.D = -9223372036854775807L;
    }

    @Override // v3.f
    public final void B() {
        this.C = null;
        this.f13004y = null;
        this.D = -9223372036854775807L;
    }

    @Override // v3.f
    public final void D(long j10, boolean z10) {
        this.C = null;
        this.f13005z = false;
        this.A = false;
    }

    @Override // v3.f
    public final void H(i0[] i0VarArr, long j10, long j11) {
        this.f13004y = this.f13000u.b(i0VarArr[0]);
        a aVar = this.C;
        if (aVar != null) {
            long j12 = aVar.f12997b;
            long j13 = (this.D + j12) - j11;
            if (j12 != j13) {
                aVar = new a(j13, aVar.f12996a);
            }
            this.C = aVar;
        }
        this.D = j11;
    }

    public final void J(a aVar, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f12996a;
            if (i10 >= bVarArr.length) {
                return;
            }
            i0 n2 = bVarArr[i10].n();
            if (n2 == null || !this.f13000u.a(n2)) {
                arrayList.add(aVar.f12996a[i10]);
            } else {
                e9.a b10 = this.f13000u.b(n2);
                byte[] B = aVar.f12996a[i10].B();
                B.getClass();
                this.f13003x.o();
                this.f13003x.q(B.length);
                ByteBuffer byteBuffer = this.f13003x.f17532c;
                int i11 = e0.f15881a;
                byteBuffer.put(B);
                this.f13003x.r();
                a a10 = b10.a(this.f13003x);
                if (a10 != null) {
                    J(a10, arrayList);
                }
            }
            i10++;
        }
    }

    public final long K(long j10) {
        x6.b.H(j10 != -9223372036854775807L);
        x6.b.H(this.D != -9223372036854775807L);
        return j10 - this.D;
    }

    @Override // v3.k1
    public final int a(i0 i0Var) {
        if (this.f13000u.a(i0Var)) {
            return j.b(i0Var.O == 0 ? 4 : 2, 0, 0);
        }
        return j.b(0, 0, 0);
    }

    @Override // v3.j1
    public final boolean b() {
        return true;
    }

    @Override // v3.j1
    public final boolean d() {
        return this.A;
    }

    @Override // v3.j1, v3.k1
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f13001v.w((a) message.obj);
        return true;
    }

    @Override // v3.j1
    public final void p(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f13005z && this.C == null) {
                this.f13003x.o();
                l lVar = this.f15331b;
                lVar.f9559a = null;
                lVar.f9560b = null;
                int I = I(lVar, this.f13003x, 0);
                if (I == -4) {
                    if (this.f13003x.m(4)) {
                        this.f13005z = true;
                    } else {
                        d dVar = this.f13003x;
                        dVar.f12999q = this.B;
                        dVar.r();
                        b bVar = this.f13004y;
                        int i10 = e0.f15881a;
                        a a10 = bVar.a(this.f13003x);
                        if (a10 != null) {
                            ArrayList arrayList = new ArrayList(a10.f12996a.length);
                            J(a10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.C = new a(K(this.f13003x.f17534e), (a.b[]) arrayList.toArray(new a.b[0]));
                            }
                        }
                    }
                } else if (I == -5) {
                    i0 i0Var = (i0) lVar.f9560b;
                    i0Var.getClass();
                    this.B = i0Var.f15460x;
                }
            }
            a aVar = this.C;
            if (aVar == null || aVar.f12997b > K(j10)) {
                z10 = false;
            } else {
                a aVar2 = this.C;
                Handler handler = this.f13002w;
                if (handler != null) {
                    handler.obtainMessage(0, aVar2).sendToTarget();
                } else {
                    this.f13001v.w(aVar2);
                }
                this.C = null;
                z10 = true;
            }
            if (this.f13005z && this.C == null) {
                this.A = true;
            }
        }
    }
}
