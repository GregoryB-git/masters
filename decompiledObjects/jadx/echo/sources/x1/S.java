package x1;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class S extends OutputStream implements U {

    /* renamed from: o, reason: collision with root package name */
    public final Handler f20977o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f20978p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public F f20979q;

    /* renamed from: r, reason: collision with root package name */
    public V f20980r;

    /* renamed from: s, reason: collision with root package name */
    public int f20981s;

    public S(Handler handler) {
        this.f20977o = handler;
    }

    @Override // x1.U
    public void a(F f7) {
        this.f20979q = f7;
        this.f20980r = f7 != null ? (V) this.f20978p.get(f7) : null;
    }

    public final void b(long j7) {
        F f7 = this.f20979q;
        if (f7 == null) {
            return;
        }
        if (this.f20980r == null) {
            V v7 = new V(this.f20977o, f7);
            this.f20980r = v7;
            this.f20978p.put(f7, v7);
        }
        V v8 = this.f20980r;
        if (v8 != null) {
            v8.b(j7);
        }
        this.f20981s += (int) j7;
    }

    public final int c() {
        return this.f20981s;
    }

    public final Map e() {
        return this.f20978p;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        b(1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        b(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i7, int i8) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        b(i8);
    }
}
