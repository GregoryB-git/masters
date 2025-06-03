package t0;

import android.content.Context;
import d0.AbstractC1203z;
import g0.M;
import t0.C1970K;
import t0.C1973b;
import t0.InterfaceC1984m;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1982k implements InterfaceC1984m.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19470a;

    /* renamed from: b, reason: collision with root package name */
    public int f19471b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19472c = true;

    public C1982k(Context context) {
        this.f19470a = context;
    }

    @Override // t0.InterfaceC1984m.b
    public InterfaceC1984m a(InterfaceC1984m.a aVar) {
        int i7;
        if (M.f14261a < 23 || !((i7 = this.f19471b) == 1 || (i7 == 0 && b()))) {
            return new C1970K.b().a(aVar);
        }
        int k7 = AbstractC1203z.k(aVar.f19475c.f12726n);
        g0.o.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + M.p0(k7));
        C1973b.C0270b c0270b = new C1973b.C0270b(k7);
        c0270b.e(this.f19472c);
        return c0270b.a(aVar);
    }

    public final boolean b() {
        int i7 = M.f14261a;
        if (i7 >= 31) {
            return true;
        }
        Context context = this.f19470a;
        return context != null && i7 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
