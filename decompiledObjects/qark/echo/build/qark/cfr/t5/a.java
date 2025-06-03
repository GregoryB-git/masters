/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package t5;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import y5.f;

public final class a {
    public static a d;
    public static boolean e;
    public f a;
    public FlutterJNI.c b;
    public ExecutorService c;

    public a(f f8, x5.a a8, FlutterJNI.c c8, ExecutorService executorService) {
        this.a = f8;
        this.b = c8;
        this.c = executorService;
    }

    public /* synthetic */ a(f f8, x5.a a8, FlutterJNI.c c8, ExecutorService executorService,  a9) {
        this(f8, a8, c8, executorService);
    }

    public static a e() {
        e = true;
        if (d == null) {
            d = new b().a();
        }
        return d;
    }

    public x5.a a() {
        return null;
    }

    public ExecutorService b() {
        return this.c;
    }

    public f c() {
        return this.a;
    }

    public FlutterJNI.c d() {
        return this.b;
    }

    public static final class b {
        public f a;
        public FlutterJNI.c b;
        public ExecutorService c;

        public t5.a a() {
            this.b();
            return new t5.a(this.a, null, this.b, this.c, null);
        }

        public final void b() {
            if (this.b == null) {
                this.b = new FlutterJNI.c();
            }
            if (this.c == null) {
                this.c = Executors.newCachedThreadPool((ThreadFactory)new a(null));
            }
            if (this.a == null) {
                this.a = new f(this.b.a(), this.c);
            }
        }

        public class a
        implements ThreadFactory {
            public int a;

            public a() {
                this.a = 0;
            }

            public /* synthetic */ a( a8) {
                this();
            }

            public Thread newThread(Runnable runnable) {
                runnable = new Thread(runnable);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("flutter-worker-");
                int n8 = this.a;
                this.a = n8 + 1;
                stringBuilder.append(n8);
                runnable.setName(stringBuilder.toString());
                return runnable;
            }
        }

    }

}

