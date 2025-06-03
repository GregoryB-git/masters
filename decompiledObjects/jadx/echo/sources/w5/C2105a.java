package w5;

import E5.c;
import E5.r;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import t5.AbstractC1995b;
import t5.C1994a;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2105a implements E5.c {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f20401a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f20402b;

    /* renamed from: c, reason: collision with root package name */
    public final C2107c f20403c;

    /* renamed from: d, reason: collision with root package name */
    public final E5.c f20404d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20405e;

    /* renamed from: f, reason: collision with root package name */
    public String f20406f;

    /* renamed from: g, reason: collision with root package name */
    public final c.a f20407g;

    /* renamed from: w5.a$a, reason: collision with other inner class name */
    public class C0289a implements c.a {
        public C0289a() {
        }

        @Override // E5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            C2105a.this.f20406f = r.f1688b.b(byteBuffer);
            C2105a.g(C2105a.this);
        }
    }

    /* renamed from: w5.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f20409a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20410b;

        /* renamed from: c, reason: collision with root package name */
        public final FlutterCallbackInformation f20411c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.f20409a = assetManager;
            this.f20410b = str;
            this.f20411c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.f20410b + ", library path: " + this.f20411c.callbackLibraryPath + ", function: " + this.f20411c.callbackName + " )";
        }
    }

    /* renamed from: w5.a$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f20412a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20413b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20414c;

        public c(String str, String str2) {
            this.f20412a = str;
            this.f20413b = null;
            this.f20414c = str2;
        }

        public static c a() {
            y5.f c7 = C1994a.e().c();
            if (c7.l()) {
                return new c(c7.j(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f20412a.equals(cVar.f20412a)) {
                return this.f20414c.equals(cVar.f20414c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f20412a.hashCode() * 31) + this.f20414c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f20412a + ", function: " + this.f20414c + " )";
        }

        public c(String str, String str2, String str3) {
            this.f20412a = str;
            this.f20413b = str2;
            this.f20414c = str3;
        }
    }

    /* renamed from: w5.a$d */
    public static class d implements E5.c {

        /* renamed from: a, reason: collision with root package name */
        public final C2107c f20415a;

        public d(C2107c c2107c) {
            this.f20415a = c2107c;
        }

        @Override // E5.c
        public c.InterfaceC0023c a(c.d dVar) {
            return this.f20415a.a(dVar);
        }

        @Override // E5.c
        public /* synthetic */ c.InterfaceC0023c b() {
            return E5.b.a(this);
        }

        @Override // E5.c
        public void c(String str, c.a aVar) {
            this.f20415a.c(str, aVar);
        }

        @Override // E5.c
        public void d(String str, ByteBuffer byteBuffer) {
            this.f20415a.f(str, byteBuffer, null);
        }

        @Override // E5.c
        public void f(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f20415a.f(str, byteBuffer, bVar);
        }

        @Override // E5.c
        public void h(String str, c.a aVar, c.InterfaceC0023c interfaceC0023c) {
            this.f20415a.h(str, aVar, interfaceC0023c);
        }

        public /* synthetic */ d(C2107c c2107c, C0289a c0289a) {
            this(c2107c);
        }
    }

    /* renamed from: w5.a$e */
    public interface e {
    }

    public C2105a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f20405e = false;
        C0289a c0289a = new C0289a();
        this.f20407g = c0289a;
        this.f20401a = flutterJNI;
        this.f20402b = assetManager;
        C2107c c2107c = new C2107c(flutterJNI);
        this.f20403c = c2107c;
        c2107c.c("flutter/isolate", c0289a);
        this.f20404d = new d(c2107c, null);
        if (flutterJNI.isAttached()) {
            this.f20405e = true;
        }
    }

    public static /* synthetic */ e g(C2105a c2105a) {
        c2105a.getClass();
        return null;
    }

    @Override // E5.c
    public c.InterfaceC0023c a(c.d dVar) {
        return this.f20404d.a(dVar);
    }

    @Override // E5.c
    public /* synthetic */ c.InterfaceC0023c b() {
        return E5.b.a(this);
    }

    @Override // E5.c
    public void c(String str, c.a aVar) {
        this.f20404d.c(str, aVar);
    }

    @Override // E5.c
    public void d(String str, ByteBuffer byteBuffer) {
        this.f20404d.d(str, byteBuffer);
    }

    @Override // E5.c
    public void f(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f20404d.f(str, byteBuffer, bVar);
    }

    @Override // E5.c
    public void h(String str, c.a aVar, c.InterfaceC0023c interfaceC0023c) {
        this.f20404d.h(str, aVar, interfaceC0023c);
    }

    public void i(b bVar) {
        if (this.f20405e) {
            AbstractC1995b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        T5.f i7 = T5.f.i("DartExecutor#executeDartCallback");
        try {
            AbstractC1995b.f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f20401a;
            String str = bVar.f20410b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.f20411c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.f20409a, null);
            this.f20405e = true;
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void j(c cVar) {
        k(cVar, null);
    }

    public void k(c cVar, List list) {
        if (this.f20405e) {
            AbstractC1995b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        T5.f i7 = T5.f.i("DartExecutor#executeDartEntrypoint");
        try {
            AbstractC1995b.f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f20401a.runBundleAndSnapshotFromLibrary(cVar.f20412a, cVar.f20414c, cVar.f20413b, this.f20402b, list);
            this.f20405e = true;
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean l() {
        return this.f20405e;
    }

    public void m() {
        if (this.f20401a.isAttached()) {
            this.f20401a.notifyLowMemoryWarning();
        }
    }

    public void n() {
        AbstractC1995b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f20401a.setPlatformMessageHandler(this.f20403c);
    }

    public void o() {
        AbstractC1995b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f20401a.setPlatformMessageHandler(null);
    }
}
