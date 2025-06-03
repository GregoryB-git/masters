package u0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f14882a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f14883b;

    /* renamed from: c, reason: collision with root package name */
    public int f14884c;

    /* renamed from: d, reason: collision with root package name */
    public int f14885d;

    public c() {
        if (d.f14886b == null) {
            d.f14886b = new d();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f14885d) {
            return this.f14883b.getShort(this.f14884c + i10);
        }
        return 0;
    }
}
