// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F;

import android.graphics.Typeface;
import android.os.Handler;

public class a
{
    public final g.c a;
    public final Handler b;
    
    public a(final g.c a, final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final int n) {
        this.b.post((Runnable)new Runnable() {
            public final /* synthetic */ g.c o = F.a.this.a;
            
            @Override
            public void run() {
                this.o.a(n);
            }
        });
    }
    
    public void b(final f.e e) {
        if (e.a()) {
            this.c(e.a);
            return;
        }
        this.a(e.b);
    }
    
    public final void c(final Typeface typeface) {
        this.b.post((Runnable)new Runnable() {
            public final /* synthetic */ g.c o = F.a.this.a;
            
            @Override
            public void run() {
                this.o.b(typeface);
            }
        });
    }
}
