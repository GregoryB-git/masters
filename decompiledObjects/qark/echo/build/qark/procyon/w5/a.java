// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w5;

import io.flutter.view.FlutterCallbackInformation;
import java.util.List;
import T5.f;
import E5.b;
import E5.r;
import java.nio.ByteBuffer;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import E5.c;

public class a implements E5.c
{
    public final FlutterJNI a;
    public final AssetManager b;
    public final w5.c c;
    public final E5.c d;
    public boolean e;
    public String f;
    public final E5.c.a g;
    
    public a(final FlutterJNI a, final AssetManager b) {
        this.e = false;
        final E5.c.a g = new E5.c.a() {
            @Override
            public void a(final ByteBuffer byteBuffer, final b b) {
                w5.a.e(w5.a.this, r.b.c(byteBuffer));
                w5.a.g(w5.a.this);
            }
        };
        this.g = g;
        this.a = a;
        this.b = b;
        final w5.c c = new w5.c(a);
        (this.c = c).c("flutter/isolate", g);
        this.d = new d(c, null);
        if (a.isAttached()) {
            this.e = true;
        }
    }
    
    public static /* synthetic */ String e(final a a, final String f) {
        return a.f = f;
    }
    
    public static /* synthetic */ e g(final a a) {
        a.getClass();
        return null;
    }
    
    @Override
    public E5.c.c a(final E5.c.d d) {
        return this.d.a(d);
    }
    
    @Override
    public void c(final String s, final E5.c.a a) {
        this.d.c(s, a);
    }
    
    @Override
    public void d(final String s, final ByteBuffer byteBuffer) {
        this.d.d(s, byteBuffer);
    }
    
    @Override
    public void f(final String s, final ByteBuffer byteBuffer, final E5.c.b b) {
        this.d.f(s, byteBuffer, b);
    }
    
    @Override
    public void h(final String s, final E5.c.a a, final E5.c.c c) {
        this.d.h(s, a, c);
    }
    
    public void i(final b obj) {
        if (this.e) {
            t5.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        final f i = T5.f.i("DartExecutor#executeDartCallback");
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("Executing Dart callback: ");
            sb.append(obj);
            t5.b.f("DartExecutor", sb.toString());
            final FlutterJNI a = this.a;
            final String b = obj.b;
            final FlutterCallbackInformation c = obj.c;
            a.runBundleAndSnapshotFromLibrary(b, c.callbackName, c.callbackLibraryPath, obj.a, null);
            this.e = true;
            if (i != null) {
                i.close();
            }
        }
        finally {
            if (i != null) {
                try {
                    i.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)obj).addSuppressed(exception);
                }
            }
        }
    }
    
    public void j(final c c) {
        this.k(c, null);
    }
    
    public void k(final c obj, final List list) {
        if (this.e) {
            t5.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        final f i = T5.f.i("DartExecutor#executeDartEntrypoint");
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("Executing Dart entrypoint: ");
            sb.append(obj);
            t5.b.f("DartExecutor", sb.toString());
            this.a.runBundleAndSnapshotFromLibrary(obj.a, obj.c, obj.b, this.b, list);
            this.e = true;
            if (i != null) {
                i.close();
            }
        }
        finally {
            if (i != null) {
                try {
                    i.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)obj).addSuppressed(exception);
                }
            }
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
    
    public static class b
    {
        public final AssetManager a;
        public final String b;
        public final FlutterCallbackInformation c;
        
        public b(final AssetManager a, final String b, final FlutterCallbackInformation c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("DartCallback( bundle path: ");
            sb.append(this.b);
            sb.append(", library path: ");
            sb.append(this.c.callbackLibraryPath);
            sb.append(", function: ");
            sb.append(this.c.callbackName);
            sb.append(" )");
            return sb.toString();
        }
    }
    
    public static class c
    {
        public final String a;
        public final String b;
        public final String c;
        
        public c(final String a, final String c) {
            this.a = a;
            this.b = null;
            this.c = c;
        }
        
        public c(final String a, final String b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static c a() {
            final y5.f c = t5.a.e().c();
            if (c.l()) {
                return new c(c.j(), "main");
            }
            throw new AssertionError((Object)"DartEntrypoints can only be created once a FlutterEngine is created.");
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final c c = (c)o;
            return this.a.equals(c.a) && this.c.equals(c.c);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + this.c.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("DartEntrypoint( bundle path: ");
            sb.append(this.a);
            sb.append(", function: ");
            sb.append(this.c);
            sb.append(" )");
            return sb.toString();
        }
    }
    
    public static class d implements c
    {
        public final c a;
        
        public d(final c a) {
            this.a = a;
        }
        
        @Override
        public c a(final E5.c.d d) {
            return this.a.a(d);
        }
        
        @Override
        public void c(final String s, final a a) {
            this.a.c(s, a);
        }
        
        @Override
        public void d(final String s, final ByteBuffer byteBuffer) {
            this.a.f(s, byteBuffer, null);
        }
        
        @Override
        public void f(final String s, final ByteBuffer byteBuffer, final b b) {
            this.a.f(s, byteBuffer, b);
        }
        
        @Override
        public void h(final String s, final a a, final c c) {
            this.a.h(s, a, c);
        }
    }
    
    public interface e
    {
    }
}
