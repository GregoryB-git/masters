package k3;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1465c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16137a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16138b;

    /* renamed from: k3.c$a */
    public class a extends AbstractC1465c {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f16139c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f16139c = bVar;
        }
    }

    /* renamed from: k3.c$b */
    public interface b {
    }

    public AbstractC1465c(Class cls, Class cls2) {
        this.f16137a = cls;
        this.f16138b = cls2;
    }

    public static AbstractC1465c a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f16137a;
    }

    public Class c() {
        return this.f16138b;
    }

    public /* synthetic */ AbstractC1465c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }
}
