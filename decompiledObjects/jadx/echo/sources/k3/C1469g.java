package k3;

import java.util.concurrent.atomic.AtomicReference;
import n3.C1727c;
import n3.InterfaceC1726b;

/* renamed from: k3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469g {

    /* renamed from: b, reason: collision with root package name */
    public static final C1469g f16151b = new C1469g();

    /* renamed from: c, reason: collision with root package name */
    public static final b f16152c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f16153a = new AtomicReference();

    /* renamed from: k3.g$b */
    public static class b implements InterfaceC1726b {
        public b() {
        }

        @Override // n3.InterfaceC1726b
        public InterfaceC1726b.a a(C1727c c1727c, String str, String str2) {
            return AbstractC1468f.f16149a;
        }
    }

    public static C1469g b() {
        return f16151b;
    }

    public InterfaceC1726b a() {
        InterfaceC1726b interfaceC1726b = (InterfaceC1726b) this.f16153a.get();
        return interfaceC1726b == null ? f16152c : interfaceC1726b;
    }
}
