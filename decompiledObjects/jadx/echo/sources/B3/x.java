package B3;

import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public class x implements InterfaceC1922b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f803c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f804a = f803c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC1922b f805b;

    public x(InterfaceC1922b interfaceC1922b) {
        this.f805b = interfaceC1922b;
    }

    @Override // r4.InterfaceC1922b
    public Object get() {
        Object obj = this.f804a;
        Object obj2 = f803c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f804a;
                    if (obj == obj2) {
                        obj = this.f805b.get();
                        this.f804a = obj;
                        this.f805b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
