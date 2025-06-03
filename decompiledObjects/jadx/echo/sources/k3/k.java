package k3;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16161a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16162b;

    public class a extends k {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f16163c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f16163c = bVar;
        }
    }

    public interface b {
    }

    public k(Class cls, Class cls2) {
        this.f16161a = cls;
        this.f16162b = cls2;
    }

    public static k a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f16161a;
    }

    public Class c() {
        return this.f16162b;
    }

    public /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }
}
