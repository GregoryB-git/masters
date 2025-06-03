// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w5;

import java.util.concurrent.ConcurrentLinkedQueue;
import t5.a;
import java.util.concurrent.ExecutorService;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import E5.b;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import io.flutter.embedding.engine.FlutterJNI;

public class c implements c, w5.f
{
    public final FlutterJNI a;
    public final Map b;
    public Map c;
    public final Object d;
    public final AtomicBoolean e;
    public final Map f;
    public int g;
    public final d h;
    public WeakHashMap i;
    public i j;
    
    public c(final FlutterJNI flutterJNI) {
        this(flutterJNI, (i)new e());
    }
    
    public c(final FlutterJNI a, final i j) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.e = new AtomicBoolean(false);
        this.f = new HashMap();
        this.g = 1;
        this.h = (d)new w5.g();
        this.i = new WeakHashMap();
        this.a = a;
        this.j = j;
    }
    
    public static void k(final Error error) {
        final Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }
    
    @Override
    public c a(final E5.c.d d) {
        final d a = this.j.a(d);
        final j key = new j(null);
        this.i.put(key, a);
        return key;
    }
    
    @Override
    public void c(final String s, final a a) {
        this.h(s, a, null);
    }
    
    @Override
    public void d(final String str, final ByteBuffer byteBuffer) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message over channel '");
        sb.append(str);
        sb.append("'");
        t5.b.f("DartMessenger", sb.toString());
        this.f(str, byteBuffer, null);
    }
    
    @Override
    public void e(final int i, final ByteBuffer byteBuffer) {
        t5.b.f("DartMessenger", "Received message reply from Dart.");
        final E5.c.b b = this.f.remove(i);
        if (b != null) {
            Label_0073: {
                try {
                    t5.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                    b.a(byteBuffer);
                    if (byteBuffer != null && byteBuffer.isDirect()) {
                        byteBuffer.limit(0);
                    }
                    return;
                }
                catch (Error error) {}
                catch (Exception ex) {
                    break Label_0073;
                }
                final Error error;
                k(error);
                return;
            }
            final Exception ex;
            t5.b.c("DartMessenger", "Uncaught exception in binary message reply handler", ex);
        }
    }
    
    @Override
    public void f(final String s, final ByteBuffer byteBuffer, final E5.c.b b) {
        final StringBuilder sb = new StringBuilder();
        sb.append("DartMessenger#send on ");
        sb.append(s);
        final T5.f i = T5.f.i(sb.toString());
        while (true) {
            try {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Sending message with callback over channel '");
                sb2.append(s);
                sb2.append("'");
                t5.b.f("DartMessenger", sb2.toString());
                final int j = this.g++;
                if (b != null) {
                    this.f.put(j, b);
                }
                if (byteBuffer == null) {
                    this.a.dispatchEmptyPlatformMessage(s, j);
                }
                else {
                    this.a.dispatchPlatformMessage(s, byteBuffer, byteBuffer.position(), j);
                }
                if (i != null) {
                    i.close();
                }
                return;
                // iftrue(Label_0175:, i == null)
                Block_6: {
                    break Block_6;
                    Label_0175: {
                        throw s;
                    }
                }
                try {
                    i.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)s).addSuppressed(exception);
                }
                throw s;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void g(final String str, final ByteBuffer byteBuffer, final int n, final long n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Received message from Dart over channel '");
        sb.append(str);
        sb.append("'");
        t5.b.f("DartMessenger", sb.toString());
        final Object d = this.d;
        // monitorenter(d)
        while (true) {
            try {
                final f f = this.b.get(str);
                boolean b;
                if (this.e.get() && f == null) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (b) {
                    if (!this.c.containsKey(str)) {
                        this.c.put(str, new LinkedList());
                    }
                    this.c.get(str).add(new b(byteBuffer, n, n2));
                }
                // monitorexit(d)
                if (!b) {
                    this.j(str, f, byteBuffer, n, n2);
                }
                return;
            }
            // monitorexit(d)
            finally {}
            continue;
        }
    }
    
    @Override
    public void h(final String s, final a a, final c key) {
        if (a == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removing handler for channel '");
            sb.append(s);
            sb.append("'");
            t5.b.f("DartMessenger", sb.toString());
            synchronized (this.d) {
                this.b.remove(s);
                return;
            }
        }
        d d;
        if (key != null) {
            d = this.i.get(key);
            if (d == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        }
        else {
            d = null;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting handler for channel '");
        sb2.append(s);
        sb2.append("'");
        t5.b.f("DartMessenger", sb2.toString());
        final Object d2 = this.d;
        // monitorenter(d2)
        while (true) {
            try {
                this.b.put(s, new f(a, d));
                final List<b> list = this.c.remove(s);
                if (list == null) {
                    // monitorexit(d2)
                    return;
                }
                // monitorexit(d2)
                for (final b b : list) {
                    this.j(s, this.b.get(s), b.a, b.b, b.c);
                }
                return;
                // monitorexit(d2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void j(final String str, final f f, final ByteBuffer byteBuffer, final int n, final long n2) {
        Object b;
        if (f != null) {
            b = f.b;
        }
        else {
            b = null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("PlatformChannel ScheduleHandler on ");
        sb.append(str);
        T5.f.b(sb.toString(), n);
        final w5.b b2 = new w5.b(this, str, n, f, byteBuffer, n2);
        d h = (d)b;
        if (b == null) {
            h = this.h;
        }
        h.a(b2);
    }
    
    public final void l(final f f, final ByteBuffer byteBuffer, final int n) {
        if (f != null) {
            Label_0048: {
                try {
                    t5.b.f("DartMessenger", "Deferring to registered handler to process message.");
                    f.a.a(byteBuffer, new g(this.a, n));
                    return;
                }
                catch (Error error) {}
                catch (Exception ex) {
                    break Label_0048;
                }
                final Error error;
                k(error);
                return;
            }
            final Exception ex;
            t5.b.c("DartMessenger", "Uncaught exception in binary message listener", ex);
        }
        else {
            t5.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.a.invokePlatformMessageEmptyResponseCallback(n);
    }
    
    public static class b
    {
        public final ByteBuffer a;
        public int b;
        public long c;
        
        public b(final ByteBuffer a, final int b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static class c implements d
    {
        public final ExecutorService a;
        
        public c(final ExecutorService a) {
            this.a = a;
        }
        
        @Override
        public void a(final Runnable runnable) {
            this.a.execute(runnable);
        }
    }
    
    public interface d
    {
        void a(final Runnable p0);
    }
    
    public static class e implements i
    {
        public ExecutorService a;
        
        public e() {
            this.a = t5.a.e().b();
        }
        
        @Override
        public d a(final E5.c.d d) {
            if (d.a()) {
                return new h(this.a);
            }
            return new c(this.a);
        }
    }
    
    public static class f
    {
        public final a a;
        public final d b;
        
        public f(final a a, final d b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static class g implements b
    {
        public final FlutterJNI a;
        public final int b;
        public final AtomicBoolean c;
        
        public g(final FlutterJNI a, final int b) {
            this.c = new AtomicBoolean(false);
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void a(final ByteBuffer byteBuffer) {
            if (this.c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.a.invokePlatformMessageEmptyResponseCallback(this.b);
                return;
            }
            this.a.invokePlatformMessageResponseCallback(this.b, byteBuffer, byteBuffer.position());
        }
    }
    
    public static class h implements d
    {
        public final ExecutorService a;
        public final ConcurrentLinkedQueue b;
        public final AtomicBoolean c;
        
        public h(final ExecutorService a) {
            this.a = a;
            this.b = new ConcurrentLinkedQueue();
            this.c = new AtomicBoolean(false);
        }
        
        @Override
        public void a(final Runnable e) {
            this.b.add(e);
            this.a.execute(new w5.d(this));
        }
        
        public final void d() {
            if (this.c.compareAndSet(false, true)) {
                Label_0040: {
                    try {
                        final Runnable runnable = this.b.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                        break Label_0040;
                    }
                    finally {
                        this.c.set(false);
                        if (!this.b.isEmpty()) {
                            this.a.execute(new w5.e(this));
                        }
                        while (true) {
                            this.a.execute(new w5.e(this));
                            return;
                            this.c.set(false);
                            continue;
                        }
                    }
                    // iftrue(Label_0113:, this.b.isEmpty())
                }
            }
            Label_0113:;
        }
    }
    
    public interface i
    {
        d a(final E5.c.d p0);
    }
    
    public static class j implements c
    {
    }
}
