/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.List
 */
package w5;

import E5.c;
import E5.r;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import w5.f;

public class a
implements E5.c {
    public final FlutterJNI a;
    public final AssetManager b;
    public final w5.c c;
    public final E5.c d;
    public boolean e = false;
    public String f;
    public final c.a g;

    public a(FlutterJNI flutterJNI, AssetManager object) {
        c.a a8;
        this.g = a8 = new c.a(){

            @Override
            public void a(ByteBuffer byteBuffer, c.b b8) {
                a.this.f = r.b.c(byteBuffer);
                a.g(a.this);
            }
        };
        this.a = flutterJNI;
        this.b = object;
        this.c = object = new w5.c(flutterJNI);
        object.c("flutter/isolate", a8);
        this.d = new d((w5.c)object, null);
        if (flutterJNI.isAttached()) {
            this.e = true;
        }
    }

    public static /* synthetic */ e g(a a8) {
        a8.getClass();
        return null;
    }

    @Override
    public c.c a(c.d d8) {
        return this.d.a(d8);
    }

    @Override
    public /* synthetic */ c.c b() {
        return E5.b.a(this);
    }

    @Override
    public void c(String string2, c.a a8) {
        this.d.c(string2, a8);
    }

    @Override
    public void d(String string2, ByteBuffer byteBuffer) {
        this.d.d(string2, byteBuffer);
    }

    @Override
    public void f(String string2, ByteBuffer byteBuffer, c.b b8) {
        this.d.f(string2, byteBuffer, b8);
    }

    @Override
    public void h(String string2, c.a a8, c.c c8) {
        this.d.h(string2, a8, c8);
    }

    public void i(b b8) {
        block6 : {
            if (this.e) {
                t5.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
                return;
            }
            T5.f f8 = T5.f.i("DartExecutor#executeDartCallback");
            try {
                Object object = new StringBuilder();
                object.append("Executing Dart callback: ");
                object.append((Object)b8);
                t5.b.f("DartExecutor", object.toString());
                object = this.a;
                String string2 = b8.b;
                FlutterCallbackInformation flutterCallbackInformation = b8.c;
                object.runBundleAndSnapshotFromLibrary(string2, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, b8.a, null);
                this.e = true;
                if (f8 == null) break block6;
            }
            catch (Throwable throwable) {
                if (f8 != null) {
                    try {
                        f8.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            f8.close();
        }
    }

    public void j(c c8) {
        this.k(c8, null);
    }

    public void k(c c8, List list) {
        block6 : {
            if (this.e) {
                t5.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
                return;
            }
            T5.f f8 = T5.f.i("DartExecutor#executeDartEntrypoint");
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Executing Dart entrypoint: ");
                stringBuilder.append((Object)c8);
                t5.b.f("DartExecutor", stringBuilder.toString());
                this.a.runBundleAndSnapshotFromLibrary(c8.a, c8.c, c8.b, this.b, list);
                this.e = true;
                if (f8 == null) break block6;
            }
            catch (Throwable throwable) {
                if (f8 != null) {
                    try {
                        f8.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            f8.close();
        }
    }

    public boolean l() {
        return this.e;
    }

    public void m() {
        if (this.a.isAttached()) {
            this.a.notifyLowMemoryWarning();
        }
    }

    public void n() {
        t5.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(this.c);
    }

    public void o() {
        t5.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(null);
    }

    public static class b {
        public final AssetManager a;
        public final String b;
        public final FlutterCallbackInformation c;

        public b(AssetManager assetManager, String string2, FlutterCallbackInformation flutterCallbackInformation) {
            this.a = assetManager;
            this.b = string2;
            this.c = flutterCallbackInformation;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DartCallback( bundle path: ");
            stringBuilder.append(this.b);
            stringBuilder.append(", library path: ");
            stringBuilder.append(this.c.callbackLibraryPath);
            stringBuilder.append(", function: ");
            stringBuilder.append(this.c.callbackName);
            stringBuilder.append(" )");
            return stringBuilder.toString();
        }
    }

    public static class c {
        public final String a;
        public final String b;
        public final String c;

        public c(String string2, String string3) {
            this.a = string2;
            this.b = null;
            this.c = string3;
        }

        public c(String string2, String string3, String string4) {
            this.a = string2;
            this.b = string3;
            this.c = string4;
        }

        public static c a() {
            y5.f f8 = t5.a.e().c();
            if (f8.l()) {
                return new c(f8.j(), "main");
            }
            throw new AssertionError((Object)"DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (this.getClass() != object.getClass()) {
                    return false;
                }
                object = (c)object;
                if (!this.a.equals((Object)object.a)) {
                    return false;
                }
                return this.c.equals((Object)object.c);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + this.c.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DartEntrypoint( bundle path: ");
            stringBuilder.append(this.a);
            stringBuilder.append(", function: ");
            stringBuilder.append(this.c);
            stringBuilder.append(" )");
            return stringBuilder.toString();
        }
    }

    public static class d
    implements E5.c {
        public final w5.c a;

        public d(w5.c c8) {
            this.a = c8;
        }

        public /* synthetic */ d(w5.c c8,  a8) {
            this(c8);
        }

        @Override
        public c.c a(c.d d8) {
            return this.a.a(d8);
        }

        @Override
        public /* synthetic */ c.c b() {
            return E5.b.a(this);
        }

        @Override
        public void c(String string2, c.a a8) {
            this.a.c(string2, a8);
        }

        @Override
        public void d(String string2, ByteBuffer byteBuffer) {
            this.a.f(string2, byteBuffer, null);
        }

        @Override
        public void f(String string2, ByteBuffer byteBuffer, c.b b8) {
            this.a.f(string2, byteBuffer, b8);
        }

        @Override
        public void h(String string2, c.a a8, c.c c8) {
            this.a.h(string2, a8, c8);
        }
    }

    public static interface e {
    }

}

