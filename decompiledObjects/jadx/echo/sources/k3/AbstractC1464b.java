package k3;

import c3.AbstractC0829g;
import c3.C0847y;
import r3.C1919a;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1464b {

    /* renamed from: a, reason: collision with root package name */
    public final C1919a f16134a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16135b;

    /* renamed from: k3.b$a */
    public class a extends AbstractC1464b {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0227b f16136c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1919a c1919a, Class cls, InterfaceC0227b interfaceC0227b) {
            super(c1919a, cls, null);
            this.f16136c = interfaceC0227b;
        }

        @Override // k3.AbstractC1464b
        public AbstractC0829g d(q qVar, C0847y c0847y) {
            return this.f16136c.a(qVar, c0847y);
        }
    }

    /* renamed from: k3.b$b, reason: collision with other inner class name */
    public interface InterfaceC0227b {
        AbstractC0829g a(q qVar, C0847y c0847y);
    }

    public AbstractC1464b(C1919a c1919a, Class cls) {
        this.f16134a = c1919a;
        this.f16135b = cls;
    }

    public static AbstractC1464b a(InterfaceC0227b interfaceC0227b, C1919a c1919a, Class cls) {
        return new a(c1919a, cls, interfaceC0227b);
    }

    public final C1919a b() {
        return this.f16134a;
    }

    public final Class c() {
        return this.f16135b;
    }

    public abstract AbstractC0829g d(q qVar, C0847y c0847y);

    public /* synthetic */ AbstractC1464b(C1919a c1919a, Class cls, a aVar) {
        this(c1919a, cls);
    }
}
