package R3;

import V3.A;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r4.InterfaceC1921a;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public class g implements A {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1921a f5644a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f5645b = new AtomicReference();

    public g(InterfaceC1921a interfaceC1921a) {
        this.f5644a = interfaceC1921a;
        interfaceC1921a.a(new InterfaceC1921a.InterfaceC0260a() { // from class: R3.e
            @Override // r4.InterfaceC1921a.InterfaceC0260a
            public final void a(InterfaceC1922b interfaceC1922b) {
                g.this.f(interfaceC1922b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(ExecutorService executorService, A.b bVar, InterfaceC1922b interfaceC1922b) {
        android.support.v4.media.a.a(interfaceC1922b.get());
        new c(executorService, bVar);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(InterfaceC1922b interfaceC1922b) {
        AtomicReference atomicReference = this.f5645b;
        android.support.v4.media.a.a(interfaceC1922b.get());
        atomicReference.set(null);
    }

    @Override // V3.A
    public void a(boolean z7, A.a aVar) {
        android.support.v4.media.a.a(this.f5645b.get());
        aVar.a(null);
    }

    @Override // V3.A
    public void b(final ExecutorService executorService, final A.b bVar) {
        this.f5644a.a(new InterfaceC1921a.InterfaceC0260a() { // from class: R3.f
            @Override // r4.InterfaceC1921a.InterfaceC0260a
            public final void a(InterfaceC1922b interfaceC1922b) {
                g.e(executorService, bVar, interfaceC1922b);
            }
        });
    }
}
