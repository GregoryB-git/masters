package a4;

import a4.g;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes.dex */
public interface e {

    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f176a;

        public a(int i10, Throwable th) {
            super(th);
            this.f176a = i10;
        }
    }

    int e();

    void f(g.a aVar);

    UUID g();

    void h(g.a aVar);

    boolean i();

    boolean j(String str);

    a k();

    z3.b l();
}
