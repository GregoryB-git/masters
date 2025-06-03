// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.activity;

import androidx.lifecycle.g;
import androidx.lifecycle.f;
import java.util.Iterator;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import java.util.ArrayDeque;

public final class OnBackPressedDispatcher
{
    public final Runnable a;
    public final ArrayDeque b;
    
    public OnBackPressedDispatcher(final Runnable a) {
        this.b = new ArrayDeque();
        this.a = a;
    }
    
    public void a(final h h, final b b) {
        final d g = h.g();
        if (g.b() == d.c.o) {
            return;
        }
        b.a(new LifecycleOnBackPressedCancellable(g, b));
    }
    
    public androidx.activity.a b(final b e) {
        this.b.add(e);
        final a a = new a(e);
        e.a(a);
        return a;
    }
    
    public void c() {
        final Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            final b b = descendingIterator.next();
            if (b.c()) {
                b.b();
                return;
            }
        }
        final Runnable a = this.a;
        if (a != null) {
            a.run();
        }
    }
    
    public class LifecycleOnBackPressedCancellable implements f, a
    {
        public final d o;
        public final b p;
        public a q;
        
        public LifecycleOnBackPressedCancellable(final d o, final b p3) {
            this.o = o;
            this.p = p3;
            o.a(this);
        }
        
        @Override
        public void a(final h h, final d.b b) {
            if (b == d.b.ON_START) {
                this.q = OnBackPressedDispatcher.this.b(this.p);
                return;
            }
            if (b == d.b.ON_STOP) {
                final a q = this.q;
                if (q != null) {
                    q.cancel();
                }
            }
            else if (b == d.b.ON_DESTROY) {
                this.cancel();
            }
        }
        
        @Override
        public void cancel() {
            this.o.c(this);
            this.p.e(this);
            final a q = this.q;
            if (q != null) {
                q.cancel();
                this.q = null;
            }
        }
    }
    
    public class a implements androidx.activity.a
    {
        public final b o;
        
        public a(final b o) {
            this.o = o;
        }
        
        @Override
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.o);
            this.o.e(this);
        }
    }
}
