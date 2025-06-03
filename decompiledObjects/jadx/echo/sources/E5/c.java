package E5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface c {

    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: E5.c$c, reason: collision with other inner class name */
    public interface InterfaceC0023c {
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1656a = true;

        public boolean a() {
            return this.f1656a;
        }
    }

    InterfaceC0023c a(d dVar);

    InterfaceC0023c b();

    void c(String str, a aVar);

    void d(String str, ByteBuffer byteBuffer);

    void f(String str, ByteBuffer byteBuffer, b bVar);

    void h(String str, a aVar, InterfaceC0023c interfaceC0023c);
}
