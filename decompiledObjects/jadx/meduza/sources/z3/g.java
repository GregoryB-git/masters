package z3;

import java.nio.ByteBuffer;
import v3.h0;

/* loaded from: classes.dex */
public class g extends z3.a {

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f17532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17533d;

    /* renamed from: e, reason: collision with root package name */
    public long f17534e;
    public ByteBuffer f;

    /* renamed from: o, reason: collision with root package name */
    public final int f17535o;

    /* renamed from: b, reason: collision with root package name */
    public final c f17531b = new c();

    /* renamed from: p, reason: collision with root package name */
    public final int f17536p = 0;

    public static final class a extends IllegalStateException {
        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
        }
    }

    static {
        h0.a("goog.exo.decoder");
    }

    public g(int i10) {
        this.f17535o = i10;
    }

    public void o() {
        this.f17508a = 0;
        ByteBuffer byteBuffer = this.f17532c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f17533d = false;
    }

    public final ByteBuffer p(int i10) {
        int i11 = this.f17535o;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f17532c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public final void q(int i10) {
        int i11 = i10 + this.f17536p;
        ByteBuffer byteBuffer = this.f17532c;
        if (byteBuffer == null) {
            this.f17532c = p(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f17532c = byteBuffer;
            return;
        }
        ByteBuffer p10 = p(i12);
        p10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            p10.put(byteBuffer);
        }
        this.f17532c = p10;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.f17532c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
