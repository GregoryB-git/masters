package R3;

import V3.A;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r4.InterfaceC1921a;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public class d implements A {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1921a f5639a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f5640b = new AtomicReference();

    public d(InterfaceC1921a interfaceC1921a) {
        this.f5639a = interfaceC1921a;
        interfaceC1921a.a(new InterfaceC1921a.InterfaceC0260a() { // from class: R3.a
            @Override // r4.InterfaceC1921a.InterfaceC0260a
            public final void a(InterfaceC1922b interfaceC1922b) {
                d.this.f(interfaceC1922b);
            }
        });
    }

    public static /* synthetic */ void e(ExecutorService executorService, A.b bVar, InterfaceC1922b interfaceC1922b) {
        android.support.v4.media.a.a(interfaceC1922b.get());
        new c(executorService, bVar);
        throw null;
    }

    @Override // V3.A
    public void a(boolean z7, A.a aVar) {
        android.support.v4.media.a.a(this.f5640b.get());
        aVar.a(null);
    }

    @Override // V3.A
    public void b(final ExecutorService executorService, final A.b bVar) {
        this.f5639a.a(new InterfaceC1921a.InterfaceC0260a() { // from class: R3.b
            @Override // r4.InterfaceC1921a.InterfaceC0260a
            public final void a(InterfaceC1922b interfaceC1922b) {
                d.e(executorService, bVar, interfaceC1922b);
            }
        });
    }

    public final /* synthetic */ void f(InterfaceC1922b interfaceC1922b) {
        AtomicReference atomicReference = this.f5640b;
        android.support.v4.media.a.a(interfaceC1922b.get());
        atomicReference.set(null);
    }
}
