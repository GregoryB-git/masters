// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.util.Log;

public abstract class V
{
    public Object a;
    public boolean b;
    public final /* synthetic */ c c;
    
    public V(final c c, final Object a) {
        this.c = c;
        this.a = a;
        this.b = false;
    }
    
    public abstract void a(final Object p0);
    
    public abstract void b();
    
    public final void c() {
        // monitorenter(this)
        while (true) {
            try {
                final Object a = this.a;
                if (this.b) {
                    final String string = this.toString();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
                // monitorexit(this)
                if (a != null) {
                    this.a(a);
                }
                synchronized (this) {
                    this.b = true;
                    // monitorexit(this)
                    this.e();
                    return;
                }
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
    
    public final void e() {
        this.d();
        synchronized (A2.c.Y(this.c)) {
            A2.c.Y(this.c).remove(this);
        }
    }
}
