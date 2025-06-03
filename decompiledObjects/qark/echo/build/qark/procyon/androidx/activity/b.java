// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b
{
    public boolean a;
    public CopyOnWriteArrayList b;
    
    public b(final boolean a) {
        this.b = new CopyOnWriteArrayList();
        this.a = a;
    }
    
    public void a(final a e) {
        this.b.add(e);
    }
    
    public abstract void b();
    
    public final boolean c() {
        return this.a;
    }
    
    public final void d() {
        final Iterator<a> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel();
        }
    }
    
    public void e(final a o) {
        this.b.remove(o);
    }
    
    public final void f(final boolean a) {
        this.a = a;
    }
}
