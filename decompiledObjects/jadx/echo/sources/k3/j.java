package k3;

import r3.C1919a;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final C1919a f16158a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16159b;

    public class a extends j {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f16160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1919a c1919a, Class cls, b bVar) {
            super(c1919a, cls, null);
            this.f16160c = bVar;
        }
    }

    public interface b {
    }

    public j(C1919a c1919a, Class cls) {
        this.f16158a = c1919a;
        this.f16159b = cls;
    }

    public static j a(b bVar, C1919a c1919a, Class cls) {
        return new a(c1919a, cls, bVar);
    }

    public final C1919a b() {
        return this.f16158a;
    }

    public final Class c() {
        return this.f16159b;
    }

    public /* synthetic */ j(C1919a c1919a, Class cls, a aVar) {
        this(c1919a, cls);
    }
}
