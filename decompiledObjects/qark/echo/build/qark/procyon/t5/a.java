// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t5;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import io.flutter.embedding.engine.FlutterJNI;
import y5.f;

public final class a
{
    public static a d;
    public static boolean e;
    public f a;
    public FlutterJNI.c b;
    public ExecutorService c;
    
    public a(final f a, final x5.a a2, final FlutterJNI.c b, final ExecutorService c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static a e() {
        a.e = true;
        if (a.d == null) {
            a.d = new b().a();
        }
        return a.d;
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
    
    public static final class b
    {
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
                this.c = Executors.newCachedThreadPool(new a(null));
            }
            if (this.a == null) {
                this.a = new f(this.b.a(), this.c);
            }
        }
        
        public class a implements ThreadFactory
        {
            public int a;
            
            public a() {
                this.a = 0;
            }
            
            @Override
            public Thread newThread(final Runnable target) {
                final Thread thread = new Thread(target);
                final StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                sb.append(this.a++);
                thread.setName(sb.toString());
                return thread;
            }
        }
    }
}
