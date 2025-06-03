package c3;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;
import k3.AbstractC1466d;

/* renamed from: c3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0831i implements InterfaceC0830h {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1466d f10079a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f10080b;

    /* renamed from: c3.i$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1466d.a f10081a;

        public a(AbstractC1466d.a aVar) {
            this.f10081a = aVar;
        }

        public O a(AbstractC1093h abstractC1093h) {
            return b(this.f10081a.d(abstractC1093h));
        }

        public final O b(O o7) {
            this.f10081a.e(o7);
            return this.f10081a.a(o7);
        }
    }

    public C0831i(AbstractC1466d abstractC1466d, Class cls) {
        if (!abstractC1466d.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", abstractC1466d.toString(), cls.getName()));
        }
        this.f10079a = abstractC1466d;
        this.f10080b = cls;
    }

    @Override // c3.InterfaceC0830h
    public final Object a(AbstractC1093h abstractC1093h) {
        try {
            return f(this.f10079a.h(abstractC1093h));
        } catch (A e7) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f10079a.c().getName(), e7);
        }
    }

    @Override // c3.InterfaceC0830h
    public final O b(AbstractC1093h abstractC1093h) {
        try {
            return e().a(abstractC1093h);
        } catch (A e7) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f10079a.f().b().getName(), e7);
        }
    }

    @Override // c3.InterfaceC0830h
    public final p3.y c(AbstractC1093h abstractC1093h) {
        try {
            return (p3.y) p3.y.c0().z(d()).A(e().a(abstractC1093h).j()).y(this.f10079a.g()).n();
        } catch (A e7) {
            throw new GeneralSecurityException("Unexpected proto", e7);
        }
    }

    @Override // c3.InterfaceC0830h
    public final String d() {
        return this.f10079a.d();
    }

    public final a e() {
        return new a(this.f10079a.f());
    }

    public final Object f(O o7) {
        if (Void.class.equals(this.f10080b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f10079a.j(o7);
        return this.f10079a.e(o7, this.f10080b);
    }
}
