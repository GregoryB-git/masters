package ma;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public Iterator<ByteBuffer> f10920a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f10921b;

    /* renamed from: c, reason: collision with root package name */
    public int f10922c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f10923d;

    /* renamed from: e, reason: collision with root package name */
    public int f10924e;
    public boolean f;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f10925o;

    /* renamed from: p, reason: collision with root package name */
    public int f10926p;

    /* renamed from: q, reason: collision with root package name */
    public long f10927q;

    public c0(ArrayList arrayList) {
        this.f10920a = arrayList.iterator();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f10922c++;
        }
        this.f10923d = -1;
        if (f()) {
            return;
        }
        this.f10921b = a0.f10911c;
        this.f10923d = 0;
        this.f10924e = 0;
        this.f10927q = 0L;
    }

    public final boolean f() {
        this.f10923d++;
        if (!this.f10920a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f10920a.next();
        this.f10921b = next;
        this.f10924e = next.position();
        if (this.f10921b.hasArray()) {
            this.f = true;
            this.f10925o = this.f10921b.array();
            this.f10926p = this.f10921b.arrayOffset();
        } else {
            this.f = false;
            this.f10927q = t1.f11086c.j(this.f10921b, t1.f11089g);
            this.f10925o = null;
        }
        return true;
    }

    public final void g(int i10) {
        int i11 = this.f10924e + i10;
        this.f10924e = i11;
        if (i11 == this.f10921b.limit()) {
            f();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f10923d == this.f10922c) {
            return -1;
        }
        int h10 = (this.f ? this.f10925o[this.f10924e + this.f10926p] : t1.h(this.f10924e + this.f10927q)) & 255;
        g(1);
        return h10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f10923d == this.f10922c) {
            return -1;
        }
        int limit = this.f10921b.limit();
        int i12 = this.f10924e;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f) {
            System.arraycopy(this.f10925o, i12 + this.f10926p, bArr, i10, i11);
        } else {
            int position = this.f10921b.position();
            this.f10921b.position(this.f10924e);
            this.f10921b.get(bArr, i10, i11);
            this.f10921b.position(position);
        }
        g(i11);
        return i11;
    }
}
