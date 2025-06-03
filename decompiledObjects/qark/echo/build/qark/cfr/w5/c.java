/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.WeakHashMap
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package w5;

import E5.c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import t5.a;

public class c
implements E5.c,
w5.f {
    public final FlutterJNI a;
    public final Map b = new HashMap();
    public Map c = new HashMap();
    public final Object d = new Object();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final Map f = new HashMap();
    public int g = 1;
    public final d h = new w5.g();
    public WeakHashMap i = new WeakHashMap();
    public i j;

    public c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    public c(FlutterJNI flutterJNI, i i8) {
        this.a = flutterJNI;
        this.j = i8;
    }

    public static /* synthetic */ void i(c c8, String string2, int n8, f f8, ByteBuffer byteBuffer, long l8) {
        c8.m(string2, n8, f8, byteBuffer, l8);
    }

    public static void k(Error error) {
        Thread thread = Thread.currentThread();
        if (thread.getUncaughtExceptionHandler() != null) {
            thread.getUncaughtExceptionHandler().uncaughtException(thread, (Throwable)error);
            return;
        }
        throw error;
    }

    @Override
    public c.c a(c.d object) {
        object = this.j.a((c.d)object);
        j j8 = new j(null);
        this.i.put((Object)j8, object);
        return j8;
    }

    @Override
    public /* synthetic */ c.c b() {
        return E5.b.a(this);
    }

    @Override
    public void c(String string2, c.a a8) {
        this.h(string2, a8, null);
    }

    @Override
    public void d(String string2, ByteBuffer byteBuffer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message over channel '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        t5.b.f("DartMessenger", stringBuilder.toString());
        this.f(string2, byteBuffer, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void e(int n8, ByteBuffer byteBuffer) {
        Exception exception2;
        block5 : {
            Error error2;
            t5.b.f("DartMessenger", "Received message reply from Dart.");
            c.b b8 = (c.b)this.f.remove((Object)n8);
            if (b8 == null) return;
            t5.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
            b8.a(byteBuffer);
            if (byteBuffer == null) return;
            try {
                if (!byteBuffer.isDirect()) return;
                byteBuffer.limit(0);
                return;
            }
            catch (Error error2) {
            }
            catch (Exception exception2) {
                break block5;
            }
            c.k(error2);
            return;
        }
        t5.b.c("DartMessenger", "Uncaught exception in binary message reply handler", (Throwable)exception2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f(String string2, ByteBuffer byteBuffer, c.b b8) {
        Object object = new StringBuilder();
        object.append("DartMessenger#send on ");
        object.append(string2);
        object = T5.f.i(object.toString());
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sending message with callback over channel '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            t5.b.f("DartMessenger", stringBuilder.toString());
            int n8 = this.g;
            this.g = n8 + 1;
            if (b8 != null) {
                this.f.put((Object)n8, (Object)b8);
            }
            if (byteBuffer == null) {
                this.a.dispatchEmptyPlatformMessage(string2, n8);
            } else {
                this.a.dispatchPlatformMessage(string2, byteBuffer, byteBuffer.position(), n8);
            }
            if (object == null) return;
        }
        catch (Throwable throwable) {}
        object.close();
        return;
        if (object == null) throw throwable;
        try {
            object.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void g(String string2, ByteBuffer byteBuffer, int n8, long l8) {
        Object object = new StringBuilder();
        object.append("Received message from Dart over channel '");
        object.append(string2);
        object.append("'");
        t5.b.f("DartMessenger", object.toString());
        object = this.d;
        // MONITORENTER : object
        f f8 = (f)this.b.get((Object)string2);
        boolean bl = this.e.get() && f8 == null;
        if (bl) {
            if (!this.c.containsKey((Object)string2)) {
                this.c.put((Object)string2, (Object)new LinkedList());
            }
            ((List)this.c.get((Object)string2)).add((Object)new b(byteBuffer, n8, l8));
        }
        // MONITOREXIT : object
        if (bl) return;
        this.j(string2, f8, byteBuffer, n8, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void h(String string2, c.a object, c.c object2) {
        if (object == null) {
            object = new StringBuilder();
            object.append("Removing handler for channel '");
            object.append(string2);
            object.append("'");
            t5.b.f("DartMessenger", object.toString());
            object = this.d;
            // MONITORENTER : object
            this.b.remove((Object)string2);
            // MONITOREXIT : object
            return;
        }
        if (object2 != null) {
            if ((object2 = (d)this.i.get(object2)) == null) throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        } else {
            object2 = null;
        }
        Object object3 = new StringBuilder();
        object3.append("Setting handler for channel '");
        object3.append(string2);
        object3.append("'");
        t5.b.f("DartMessenger", object3.toString());
        object3 = this.d;
        // MONITORENTER : object3
        this.b.put((Object)string2, (Object)new f((c.a)object, (d)object2));
        object = (List)this.c.remove((Object)string2);
        if (object == null) {
            // MONITOREXIT : object3
            return;
        }
        // MONITOREXIT : object3
        object = object.iterator();
        while (object.hasNext()) {
            object2 = (b)object.next();
            this.j(string2, (f)this.b.get((Object)string2), object2.a, object2.b, object2.c);
        }
        return;
    }

    public final void j(String object, f object2, ByteBuffer byteBuffer, int n8, long l8) {
        d d8 = object2 != null ? object2.b : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlatformChannel ScheduleHandler on ");
        stringBuilder.append((String)object);
        T5.f.b(stringBuilder.toString(), n8);
        object2 = new w5.b(this, (String)object, n8, (f)object2, byteBuffer, l8);
        object = d8;
        if (d8 == null) {
            object = this.h;
        }
        object.a((Runnable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(f f8, ByteBuffer byteBuffer, int n8) {
        if (f8 != null) {
            Exception exception2;
            block5 : {
                try {
                    t5.b.f("DartMessenger", "Deferring to registered handler to process message.");
                    f8.a.a(byteBuffer, new g(this.a, n8));
                    return;
                }
                catch (Error error) {
                }
                catch (Exception exception2) {
                    break block5;
                }
                c.k(error);
                return;
            }
            t5.b.c("DartMessenger", "Uncaught exception in binary message listener", (Throwable)exception2);
        } else {
            t5.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.a.invokePlatformMessageEmptyResponseCallback(n8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void m(String object, int n8, f f8, ByteBuffer byteBuffer, long l8) {
        Throwable throwable2222;
        Throwable throwable322;
        block10 : {
            block9 : {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PlatformChannel ScheduleHandler on ");
                stringBuilder.append((String)object);
                T5.f.h(stringBuilder.toString(), n8);
                stringBuilder = new StringBuilder();
                stringBuilder.append("DartMessenger#handleMessageFromDart on ");
                stringBuilder.append((String)object);
                object = T5.f.i(stringBuilder.toString());
                {
                    catch (Throwable throwable2222) {}
                }
                try {
                    this.l(f8, byteBuffer, n8);
                    if (byteBuffer == null || !byteBuffer.isDirect()) break block9;
                    byteBuffer.limit(0);
                }
                catch (Throwable throwable322) {
                    break block10;
                }
            }
            if (object != null) {
                object.close();
            }
            this.a.cleanupMessageData(l8);
            return;
        }
        if (object == null) throw throwable322;
        try {
            object.close();
            throw throwable322;
        }
        catch (Throwable throwable4) {
            throwable322.addSuppressed(throwable4);
            throw throwable322;
        }
        this.a.cleanupMessageData(l8);
        throw throwable2222;
    }

    public static class b {
        public final ByteBuffer a;
        public int b;
        public long c;

        public b(ByteBuffer byteBuffer, int n8, long l8) {
            this.a = byteBuffer;
            this.b = n8;
            this.c = l8;
        }
    }

    public static class c
    implements d {
        public final ExecutorService a;

        public c(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override
        public void a(Runnable runnable) {
            this.a.execute(runnable);
        }
    }

    public static interface d {
        public void a(Runnable var1);
    }

    public static class e
    implements i {
        public ExecutorService a = a.e().b();

        @Override
        public d a(c.d d8) {
            if (d8.a()) {
                return new h(this.a);
            }
            return new c(this.a);
        }
    }

    public static class f {
        public final c.a a;
        public final d b;

        public f(c.a a8, d d8) {
            this.a = a8;
            this.b = d8;
        }
    }

    public static class g
    implements c.b {
        public final FlutterJNI a;
        public final int b;
        public final AtomicBoolean c = new AtomicBoolean(false);

        public g(FlutterJNI flutterJNI, int n8) {
            this.a = flutterJNI;
            this.b = n8;
        }

        @Override
        public void a(ByteBuffer byteBuffer) {
            if (!this.c.getAndSet(true)) {
                if (byteBuffer == null) {
                    this.a.invokePlatformMessageEmptyResponseCallback(this.b);
                    return;
                }
                this.a.invokePlatformMessageResponseCallback(this.b, byteBuffer, byteBuffer.position());
                return;
            }
            throw new IllegalStateException("Reply already submitted");
        }
    }

    public static class h
    implements d {
        public final ExecutorService a;
        public final ConcurrentLinkedQueue b;
        public final AtomicBoolean c;

        public h(ExecutorService executorService) {
            this.a = executorService;
            this.b = new ConcurrentLinkedQueue();
            this.c = new AtomicBoolean(false);
        }

        public static /* synthetic */ void b(h h8) {
            h8.e();
        }

        public static /* synthetic */ void c(h h8) {
            h8.f();
        }

        @Override
        public void a(Runnable runnable) {
            this.b.add((Object)runnable);
            this.a.execute((Runnable)new w5.d(this));
        }

        public final void d() {
            block8 : {
                if (this.c.compareAndSet(false, true)) {
                    Throwable throwable2;
                    block7 : {
                        block6 : {
                            Runnable runnable;
                            try {
                                runnable = (Runnable)this.b.poll();
                                if (runnable == null) break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                            runnable.run();
                        }
                        this.c.set(false);
                        if (!this.b.isEmpty()) {
                            this.a.execute((Runnable)new w5.e(this));
                            return;
                        }
                        break block8;
                    }
                    this.c.set(false);
                    if (!this.b.isEmpty()) {
                        this.a.execute((Runnable)new w5.e(this));
                    }
                    throw throwable2;
                }
            }
        }

        public final /* synthetic */ void e() {
            this.d();
        }

        public final /* synthetic */ void f() {
            this.d();
        }
    }

    public static interface i {
        public d a(c.d var1);
    }

    public static class j
    implements c.c {
        public j() {
        }

        public /* synthetic */ j( a8) {
            this();
        }
    }

}

