// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q4;

import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import com.google.firebase.remoteconfig.internal.d;
import android.content.Context;
import s4.i;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.e;
import java.util.Set;

public class m
{
    public final Set a;
    public final e b;
    public final c c;
    public final s3.e d;
    public final i e;
    public final Q4.e f;
    public final Context g;
    public final String h;
    public final d i;
    public final ScheduledExecutorService j;
    
    public m(final s3.e d, final i e, final c c, final Q4.e f, final Context g, final String h, final d i, final ScheduledExecutorService j) {
        final LinkedHashSet a = new LinkedHashSet();
        this.a = a;
        this.b = new e(d, e, c, f, g, h, a, i, j);
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public P4.d b(final P4.c c) {
        synchronized (this) {
            this.a.add(c);
            this.c();
            return new a(c);
        }
    }
    
    public final void c() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0031: {
            try {
                if (!this.a.isEmpty()) {
                    this.b.C();
                }
            }
            finally {
                break Label_0031;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public final void d(final P4.c c) {
        synchronized (this) {
            this.a.remove(c);
        }
    }
    
    public void e(final boolean b) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0028: {
            try {
                this.b.z(b);
                if (!b) {
                    this.c();
                }
            }
            finally {
                break Label_0028;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public class a implements d
    {
        public final P4.c a;
        
        public a(final P4.c a) {
            this.a = a;
        }
        
        @Override
        public void remove() {
            m.this.d(this.a);
        }
    }
}
