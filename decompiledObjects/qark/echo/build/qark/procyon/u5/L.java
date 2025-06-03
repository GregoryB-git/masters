// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import E5.c;
import android.view.KeyCharacterMap;
import t5.b;
import java.util.Map;
import android.view.KeyEvent;
import D5.i;
import java.util.HashSet;
import D5.j;
import io.flutter.plugin.editing.l;

public class L implements l.a, j.b
{
    public final d[] a;
    public final HashSet b;
    public final e c;
    
    public L(final e c) {
        this.b = new HashSet();
        this.c = c;
        this.a = new d[] { (d)new K(c.getBinaryMessenger()), (d)new F(new i(c.getBinaryMessenger())) };
        new j(c.getBinaryMessenger()).b((j.b)this);
    }
    
    @Override
    public Map a() {
        return ((K)this.a[0]).h();
    }
    
    @Override
    public boolean b(final KeyEvent o) {
        final boolean remove = this.b.remove(o);
        int i = 0;
        if (remove) {
            return false;
        }
        if (this.a.length > 0) {
            final c c = new c(o);
            for (d[] a = this.a; i < a.length; ++i) {
                a[i].a(o, c.a());
            }
        }
        else {
            this.e(o);
        }
        return true;
    }
    
    public void d() {
        final int size = this.b.size();
        if (size > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("A KeyboardManager was destroyed with ");
            sb.append(String.valueOf(size));
            sb.append(" unhandled redispatch event(s).");
            t5.b.g("KeyboardManager", sb.toString());
        }
    }
    
    public final void e(final KeyEvent keyEvent) {
        final e c = this.c;
        if (c != null) {
            if (c.c(keyEvent)) {
                return;
            }
            this.b.add(keyEvent);
            this.c.a(keyEvent);
            if (this.b.remove(keyEvent)) {
                t5.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }
    
    public static class b
    {
        public int a;
        
        public b() {
            this.a = 0;
        }
        
        public Character a(int a) {
            char c = (char)a;
            char c2;
            if ((Integer.MIN_VALUE & a) != 0x0) {
                final int n = a & Integer.MAX_VALUE;
                final int a2 = this.a;
                c2 = c;
                a = n;
                if (a2 != 0) {
                    a = KeyCharacterMap.getDeadChar(a2, n);
                    c2 = c;
                }
            }
            else {
                final int a3 = this.a;
                c2 = c;
                if (a3 == 0) {
                    return c2;
                }
                a = KeyCharacterMap.getDeadChar(a3, a);
                if (a > 0) {
                    c = (char)a;
                }
                a = 0;
                c2 = c;
            }
            this.a = a;
            return c2;
        }
    }
    
    public class c
    {
        public final KeyEvent a;
        public int b;
        public boolean c;
        
        public c(final KeyEvent a) {
            this.b = L.this.a.length;
            this.c = false;
            this.a = a;
        }
        
        public d.a a() {
            return new a(null);
        }
        
        public class a implements d.a
        {
            public boolean a;
            
            public a() {
                this.a = false;
            }
            
            @Override
            public void a(final boolean b) {
                if (!this.a) {
                    this.a = true;
                    final c b2 = L.c.this;
                    final int b3 = b2.b - 1;
                    b2.b = b3;
                    final boolean c = b | b2.c;
                    b2.c = c;
                    if (b3 == 0 && !c) {
                        L.this.e(b2.a);
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }
    }
    
    public interface d
    {
        void a(final KeyEvent p0, final a p1);
        
        public interface a
        {
            void a(final boolean p0);
        }
    }
    
    public interface e
    {
        void a(final KeyEvent p0);
        
        boolean c(final KeyEvent p0);
        
        E5.c getBinaryMessenger();
    }
}
