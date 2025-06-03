// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import t.h;
import android.view.WindowInsetsController;
import android.os.Build$VERSION;
import android.view.View;
import android.view.Window;

public final class X
{
    public final e a;
    
    public X(final Window window, final View view) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            this.a = (e)new d(window, this);
            return;
        }
        a a;
        if (sdk_INT >= 26) {
            a = new c(window, view);
        }
        else {
            a = new b(window, view);
        }
        this.a = (e)a;
    }
    
    public void a(final boolean b) {
        this.a.a(b);
    }
    
    public void b(final boolean b) {
        this.a.b(b);
    }
    
    public abstract static class a extends e
    {
        public final Window a;
        public final View b;
        
        public a(final Window a, final View b) {
            this.a = a;
            this.b = b;
        }
        
        public void c(final int n) {
            final View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(n | decorView.getSystemUiVisibility());
        }
        
        public void d(final int n) {
            this.a.addFlags(n);
        }
        
        public void e(final int n) {
            final View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(n & decorView.getSystemUiVisibility());
        }
        
        public void f(final int n) {
            this.a.clearFlags(n);
        }
    }
    
    public static class b extends a
    {
        public b(final Window window, final View view) {
            super(window, view);
        }
        
        @Override
        public void b(final boolean b) {
            if (b) {
                ((a)this).f(67108864);
                ((a)this).d(Integer.MIN_VALUE);
                ((a)this).c(8192);
                return;
            }
            ((a)this).e(8192);
        }
    }
    
    public static class c extends b
    {
        public c(final Window window, final View view) {
            super(window, view);
        }
        
        @Override
        public void a(final boolean b) {
            if (b) {
                ((a)this).f(134217728);
                ((a)this).d(Integer.MIN_VALUE);
                ((a)this).c(16);
                return;
            }
            ((a)this).e(16);
        }
    }
    
    public static class d extends e
    {
        public final X a;
        public final WindowInsetsController b;
        public final h c;
        public Window d;
        
        public d(final Window d, final X x) {
            this(Y.a(d), x);
            this.d = d;
        }
        
        public d(final WindowInsetsController b, final X a) {
            this.c = new h();
            this.b = b;
            this.a = a;
        }
        
        @Override
        public void a(final boolean b) {
            if (b) {
                if (this.d != null) {
                    this.c(16);
                }
                Z.a(this.b, 16, 16);
                return;
            }
            if (this.d != null) {
                this.d(16);
            }
            Z.a(this.b, 0, 16);
        }
        
        @Override
        public void b(final boolean b) {
            if (b) {
                if (this.d != null) {
                    this.c(8192);
                }
                Z.a(this.b, 8, 8);
                return;
            }
            if (this.d != null) {
                this.d(8192);
            }
            Z.a(this.b, 0, 8);
        }
        
        public void c(final int n) {
            final View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility(n | decorView.getSystemUiVisibility());
        }
        
        public void d(final int n) {
            final View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility(n & decorView.getSystemUiVisibility());
        }
    }
    
    public abstract static class e
    {
        public void a(final boolean b) {
        }
        
        public abstract void b(final boolean p0);
    }
}
