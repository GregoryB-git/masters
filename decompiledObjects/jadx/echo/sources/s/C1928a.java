package s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1928a implements InterfaceC1930c {
    @Override // s.InterfaceC1930c
    public void a(InterfaceC1929b interfaceC1929b, float f7) {
        interfaceC1929b.a().setElevation(f7);
    }

    @Override // s.InterfaceC1930c
    public float b(InterfaceC1929b interfaceC1929b) {
        return o(interfaceC1929b).d();
    }

    @Override // s.InterfaceC1930c
    public float c(InterfaceC1929b interfaceC1929b) {
        return b(interfaceC1929b) * 2.0f;
    }

    @Override // s.InterfaceC1930c
    public void d(InterfaceC1929b interfaceC1929b) {
        l(interfaceC1929b, i(interfaceC1929b));
    }

    @Override // s.InterfaceC1930c
    public float e(InterfaceC1929b interfaceC1929b) {
        return interfaceC1929b.a().getElevation();
    }

    @Override // s.InterfaceC1930c
    public void g(InterfaceC1929b interfaceC1929b, float f7) {
        o(interfaceC1929b).h(f7);
    }

    @Override // s.InterfaceC1930c
    public ColorStateList h(InterfaceC1929b interfaceC1929b) {
        return o(interfaceC1929b).b();
    }

    @Override // s.InterfaceC1930c
    public float i(InterfaceC1929b interfaceC1929b) {
        return o(interfaceC1929b).c();
    }

    @Override // s.InterfaceC1930c
    public void j(InterfaceC1929b interfaceC1929b, Context context, ColorStateList colorStateList, float f7, float f8, float f9) {
        interfaceC1929b.c(new C1931d(colorStateList, f7));
        View a7 = interfaceC1929b.a();
        a7.setClipToOutline(true);
        a7.setElevation(f8);
        l(interfaceC1929b, f9);
    }

    @Override // s.InterfaceC1930c
    public void k(InterfaceC1929b interfaceC1929b) {
        l(interfaceC1929b, i(interfaceC1929b));
    }

    @Override // s.InterfaceC1930c
    public void l(InterfaceC1929b interfaceC1929b, float f7) {
        o(interfaceC1929b).g(f7, interfaceC1929b.e(), interfaceC1929b.d());
        p(interfaceC1929b);
    }

    @Override // s.InterfaceC1930c
    public void m(InterfaceC1929b interfaceC1929b, ColorStateList colorStateList) {
        o(interfaceC1929b).f(colorStateList);
    }

    @Override // s.InterfaceC1930c
    public float n(InterfaceC1929b interfaceC1929b) {
        return b(interfaceC1929b) * 2.0f;
    }

    public final C1931d o(InterfaceC1929b interfaceC1929b) {
        return (C1931d) interfaceC1929b.f();
    }

    public void p(InterfaceC1929b interfaceC1929b) {
        if (!interfaceC1929b.e()) {
            interfaceC1929b.b(0, 0, 0, 0);
            return;
        }
        float i7 = i(interfaceC1929b);
        float b7 = b(interfaceC1929b);
        int ceil = (int) Math.ceil(AbstractC1932e.a(i7, b7, interfaceC1929b.d()));
        int ceil2 = (int) Math.ceil(AbstractC1932e.b(i7, b7, interfaceC1929b.d()));
        interfaceC1929b.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // s.InterfaceC1930c
    public void f() {
    }
}
