package k3;

import c3.AbstractC0829g;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16164a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16165b;

    public class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f16166c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f16166c = bVar;
        }

        @Override // k3.l
        public Object a(AbstractC0829g abstractC0829g) {
            return this.f16166c.a(abstractC0829g);
        }
    }

    public interface b {
        Object a(AbstractC0829g abstractC0829g);
    }

    public l(Class cls, Class cls2) {
        this.f16164a = cls;
        this.f16165b = cls2;
    }

    public static l b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(AbstractC0829g abstractC0829g);

    public Class c() {
        return this.f16164a;
    }

    public Class d() {
        return this.f16165b;
    }

    public /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }
}
