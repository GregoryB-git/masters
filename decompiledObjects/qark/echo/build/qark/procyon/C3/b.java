// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C3;

import java.util.Locale;
import android.os.StrictMode;
import android.os.Process;
import java.util.concurrent.Executors;
import android.os.StrictMode$ThreadPolicy;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;

public class b implements ThreadFactory
{
    public static final ThreadFactory e;
    public final AtomicLong a;
    public final String b;
    public final int c;
    public final StrictMode$ThreadPolicy d;
    
    static {
        e = Executors.defaultThreadFactory();
    }
    
    public b(final String b, final int c, final StrictMode$ThreadPolicy d) {
        this.a = new AtomicLong();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread thread = C3.b.e.newThread(new a(this, runnable));
        thread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, this.a.getAndIncrement()));
        return thread;
    }
}
