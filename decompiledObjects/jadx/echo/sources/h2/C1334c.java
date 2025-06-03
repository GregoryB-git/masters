package h2;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334c implements InterfaceC1333b {

    /* renamed from: b, reason: collision with root package name */
    public static final C1334c f14580b = new C1334c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f14581a;

    public C1334c(Object obj) {
        this.f14581a = obj;
    }

    public static InterfaceC1333b a(Object obj) {
        return new C1334c(d.c(obj, "instance cannot be null"));
    }

    @Override // U5.a
    public Object get() {
        return this.f14581a;
    }
}
