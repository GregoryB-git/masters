package V3;

import a4.C0747c;
import a4.C0748d;
import a4.InterfaceC0749e;

/* renamed from: V3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0662a extends AbstractC0669h {

    /* renamed from: d, reason: collision with root package name */
    public final m f6498d;

    /* renamed from: e, reason: collision with root package name */
    public final Q3.a f6499e;

    /* renamed from: f, reason: collision with root package name */
    public final a4.i f6500f;

    /* renamed from: V3.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0109a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6501a;

        static {
            int[] iArr = new int[InterfaceC0749e.a.values().length];
            f6501a = iArr;
            try {
                iArr[InterfaceC0749e.a.CHILD_ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6501a[InterfaceC0749e.a.CHILD_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6501a[InterfaceC0749e.a.CHILD_MOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6501a[InterfaceC0749e.a.CHILD_REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0662a(m mVar, Q3.a aVar, a4.i iVar) {
        this.f6498d = mVar;
        this.f6499e = aVar;
        this.f6500f = iVar;
    }

    @Override // V3.AbstractC0669h
    public AbstractC0669h a(a4.i iVar) {
        return new C0662a(this.f6498d, this.f6499e, iVar);
    }

    @Override // V3.AbstractC0669h
    public C0748d b(C0747c c0747c, a4.i iVar) {
        return new C0748d(c0747c.j(), this, Q3.k.a(Q3.k.c(this.f6498d, iVar.e().U(c0747c.i())), c0747c.k()), c0747c.m() != null ? c0747c.m().e() : null);
    }

    @Override // V3.AbstractC0669h
    public void c(Q3.c cVar) {
        this.f6499e.a(cVar);
    }

    @Override // V3.AbstractC0669h
    public void d(C0748d c0748d) {
        if (h()) {
            return;
        }
        int i7 = C0109a.f6501a[c0748d.b().ordinal()];
        if (i7 == 1) {
            this.f6499e.f(c0748d.e(), c0748d.d());
            return;
        }
        if (i7 == 2) {
            this.f6499e.e(c0748d.e(), c0748d.d());
        } else if (i7 == 3) {
            this.f6499e.d(c0748d.e(), c0748d.d());
        } else {
            if (i7 != 4) {
                return;
            }
            this.f6499e.c(c0748d.e());
        }
    }

    @Override // V3.AbstractC0669h
    public a4.i e() {
        return this.f6500f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0662a) {
            C0662a c0662a = (C0662a) obj;
            if (c0662a.f6499e.equals(this.f6499e) && c0662a.f6498d.equals(this.f6498d) && c0662a.f6500f.equals(this.f6500f)) {
                return true;
            }
        }
        return false;
    }

    @Override // V3.AbstractC0669h
    public boolean f(AbstractC0669h abstractC0669h) {
        return (abstractC0669h instanceof C0662a) && ((C0662a) abstractC0669h).f6499e.equals(this.f6499e);
    }

    public int hashCode() {
        return (((this.f6499e.hashCode() * 31) + this.f6498d.hashCode()) * 31) + this.f6500f.hashCode();
    }

    @Override // V3.AbstractC0669h
    public boolean i(InterfaceC0749e.a aVar) {
        return aVar != InterfaceC0749e.a.VALUE;
    }

    public String toString() {
        return "ChildEventRegistration";
    }
}
