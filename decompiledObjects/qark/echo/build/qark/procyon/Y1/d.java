// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import kotlin.jvm.internal.Intrinsics;
import android.net.Uri;
import q.e;
import q.b;
import kotlin.jvm.internal.g;
import java.util.concurrent.locks.ReentrantLock;

public abstract class d extends q.d
{
    public static final a a;
    public static final ReentrantLock b;
    
    static {
        a = new a(null);
        b = new ReentrantLock();
    }
    
    public static final /* synthetic */ b a() {
        return null;
    }
    
    public static final /* synthetic */ ReentrantLock b() {
        return d.b;
    }
    
    public static final /* synthetic */ e c() {
        return null;
    }
    
    public static final /* synthetic */ void d(final e e) {
    }
    
    public static final class a
    {
        public final e a() {
            d.b().lock();
            d.c();
            d.d(null);
            d.b().unlock();
            return null;
        }
        
        public final void b(final Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "url");
            this.c();
            d.b().lock();
            d.c();
            d.b().unlock();
        }
        
        public final void c() {
            d.b().lock();
            d.c();
            d.a();
            d.b().unlock();
        }
    }
}
