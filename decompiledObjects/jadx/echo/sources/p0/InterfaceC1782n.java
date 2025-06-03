package p0;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p0.v;

/* renamed from: p0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1782n {

    /* renamed from: p0.n$a */
    public static class a extends IOException {

        /* renamed from: o, reason: collision with root package name */
        public final int f18328o;

        public a(Throwable th, int i7) {
            super(th);
            this.f18328o = i7;
        }
    }

    void a(v.a aVar);

    boolean b();

    Map c();

    UUID d();

    void e(v.a aVar);

    boolean f(String str);

    a g();

    int getState();

    j0.b h();
}
