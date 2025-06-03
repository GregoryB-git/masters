package h5;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o7.l0;
import o7.t;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h5.b f7128a = new h5.b();

    /* renamed from: b, reason: collision with root package name */
    public final k f7129b = new k();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f7130c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f7131d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7132e;

    public class a extends l {
        public a() {
        }

        @Override // z3.h
        public final void o() {
            d dVar = d.this;
            x6.b.H(dVar.f7130c.size() < 2);
            x6.b.q(!dVar.f7130c.contains(this));
            this.f17508a = 0;
            this.f7139c = null;
            dVar.f7130c.addFirst(this);
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final long f7134a;

        /* renamed from: b, reason: collision with root package name */
        public final t<h5.a> f7135b;

        public b(long j10, l0 l0Var) {
            this.f7134a = j10;
            this.f7135b = l0Var;
        }

        @Override // h5.g
        public final int f(long j10) {
            return this.f7134a > j10 ? 0 : -1;
        }

        @Override // h5.g
        public final long g(int i10) {
            x6.b.q(i10 == 0);
            return this.f7134a;
        }

        @Override // h5.g
        public final List<h5.a> h(long j10) {
            if (j10 >= this.f7134a) {
                return this.f7135b;
            }
            t.b bVar = t.f12050b;
            return l0.f12009e;
        }

        @Override // h5.g
        public final int i() {
            return 1;
        }
    }

    public d() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f7130c.addFirst(new a());
        }
        this.f7131d = 0;
    }

    @Override // h5.h
    public final void a(long j10) {
    }

    @Override // z3.d
    public final l b() {
        x6.b.H(!this.f7132e);
        if (this.f7131d != 2 || this.f7130c.isEmpty()) {
            return null;
        }
        l lVar = (l) this.f7130c.removeFirst();
        if (this.f7129b.m(4)) {
            lVar.l(4);
        } else {
            k kVar = this.f7129b;
            long j10 = kVar.f17534e;
            h5.b bVar = this.f7128a;
            ByteBuffer byteBuffer = kVar.f17532c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            bVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            lVar.p(this.f7129b.f17534e, new b(j10, v5.b.a(h5.a.R, parcelableArrayList)), 0L);
        }
        this.f7129b.o();
        this.f7131d = 0;
        return lVar;
    }

    @Override // z3.d
    public final k c() {
        x6.b.H(!this.f7132e);
        if (this.f7131d != 0) {
            return null;
        }
        this.f7131d = 1;
        return this.f7129b;
    }

    @Override // z3.d
    public final void d(k kVar) {
        x6.b.H(!this.f7132e);
        x6.b.H(this.f7131d == 1);
        x6.b.q(this.f7129b == kVar);
        this.f7131d = 2;
    }

    @Override // z3.d
    public final void flush() {
        x6.b.H(!this.f7132e);
        this.f7129b.o();
        this.f7131d = 0;
    }

    @Override // z3.d
    public final void release() {
        this.f7132e = true;
    }
}
