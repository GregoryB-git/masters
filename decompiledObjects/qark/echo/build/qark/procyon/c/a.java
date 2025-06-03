// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import java.util.Set;

public final class a
{
    public final Set a;
    public volatile Context b;
    
    public a() {
        this.a = new CopyOnWriteArraySet();
    }
    
    public void a(final b b) {
        if (this.b != null) {
            b.a(this.b);
        }
        this.a.add(b);
    }
    
    public void b() {
        this.b = null;
    }
    
    public void c(final Context b) {
        this.b = b;
        final Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b);
        }
    }
}
