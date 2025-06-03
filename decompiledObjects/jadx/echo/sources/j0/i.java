package j0;

import d0.AbstractC1199v;
import d0.C1194q;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class i extends AbstractC1368a {

    /* renamed from: p, reason: collision with root package name */
    public C1194q f15398p;

    /* renamed from: q, reason: collision with root package name */
    public final c f15399q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f15400r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15401s;

    /* renamed from: t, reason: collision with root package name */
    public long f15402t;

    /* renamed from: u, reason: collision with root package name */
    public ByteBuffer f15403u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15404v;

    /* renamed from: w, reason: collision with root package name */
    public final int f15405w;

    public static final class a extends IllegalStateException {

        /* renamed from: o, reason: collision with root package name */
        public final int f15406o;

        /* renamed from: p, reason: collision with root package name */
        public final int f15407p;

        public a(int i7, int i8) {
            super("Buffer too small (" + i7 + " < " + i8 + ")");
            this.f15406o = i7;
            this.f15407p = i8;
        }
    }

    static {
        AbstractC1199v.a("media3.decoder");
    }

    public i(int i7) {
        this(i7, 0);
    }

    public static i F() {
        return new i(0);
    }

    public final void C() {
        ByteBuffer byteBuffer = this.f15400r;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f15403u;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean D() {
        return n(1073741824);
    }

    public void G(int i7) {
        ByteBuffer byteBuffer = this.f15403u;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            this.f15403u = ByteBuffer.allocate(i7);
        } else {
            this.f15403u.clear();
        }
    }

    @Override // j0.AbstractC1368a
    public void m() {
        super.m();
        ByteBuffer byteBuffer = this.f15400r;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f15403u;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f15401s = false;
    }

    public final ByteBuffer x(int i7) {
        int i8 = this.f15404v;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f15400r;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i7);
    }

    public void z(int i7) {
        int i8 = i7 + this.f15405w;
        ByteBuffer byteBuffer = this.f15400r;
        if (byteBuffer == null) {
            this.f15400r = x(i8);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i9 = i8 + position;
        if (capacity >= i9) {
            this.f15400r = byteBuffer;
            return;
        }
        ByteBuffer x7 = x(i9);
        x7.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            x7.put(byteBuffer);
        }
        this.f15400r = x7;
    }

    public i(int i7, int i8) {
        this.f15399q = new c();
        this.f15404v = i7;
        this.f15405w = i8;
    }
}
