// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import g6.p;
import g6.l;
import java.io.File;
import n6.b;

public final class e implements n6.b
{
    public final File a;
    public final f b;
    public final l c;
    public final l d;
    public final p e;
    public final int f;
    
    public e(final File file, final f f) {
        Intrinsics.checkNotNullParameter(file, "start");
        Intrinsics.checkNotNullParameter(f, "direction");
        this(file, f, null, null, null, 0, 32, null);
    }
    
    public e(final File a, final f b, final l c, final l d, final p e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final /* synthetic */ f a(final e e) {
        return e.b;
    }
    
    public static final /* synthetic */ int b(final e e) {
        return e.f;
    }
    
    public static final /* synthetic */ l c(final e e) {
        return e.c;
    }
    
    public static final /* synthetic */ p d(final e e) {
        return e.e;
    }
    
    public static final /* synthetic */ l e(final e e) {
        return e.d;
    }
    
    public static final /* synthetic */ File f(final e e) {
        return e.a;
    }
    
    @Override
    public Iterator iterator() {
        return new b();
    }
    
    public abstract static class a extends e.c
    {
        public a(final File file) {
            Intrinsics.checkNotNullParameter(file, "rootDir");
            super(file);
        }
    }
    
    public final class b extends W5.b
    {
        public final ArrayDeque q;
        
        public b() {
            final ArrayDeque<e.b.b> q = new ArrayDeque<e.b.b>();
            this.q = q;
            if (e6.e.f(e6.e.this).isDirectory()) {
                q.push((e.b.b)this.g(e6.e.f(e6.e.this)));
                return;
            }
            if (e6.e.f(e6.e.this).isFile()) {
                q.push(new e.b.b(e6.e.f(e6.e.this)));
                return;
            }
            this.d();
        }
        
        @Override
        public void b() {
            final File h = this.h();
            if (h != null) {
                this.e(h);
                return;
            }
            this.d();
        }
        
        public final e.a g(final File file) {
            final int n = d.a[e6.e.a(e6.e.this).ordinal()];
            if (n == 1) {
                return new c(file);
            }
            if (n == 2) {
                return new a(file);
            }
            throw new V5.l();
        }
        
        public final File h() {
            while (true) {
                final e.c c = this.q.peek();
                if (c == null) {
                    return null;
                }
                final File b = c.b();
                if (b == null) {
                    this.q.pop();
                }
                else {
                    if (Intrinsics.a(b, c.a()) || !b.isDirectory()) {
                        return b;
                    }
                    if (this.q.size() >= e6.e.b(e6.e.this)) {
                        return b;
                    }
                    this.q.push(this.g(b));
                }
            }
        }
        
        public final class a extends e.a
        {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;
            
            public a(final File file) {
                Intrinsics.checkNotNullParameter(file, "rootDir");
                super(file);
            }
            
            @Override
            public File b() {
                if (!this.e && this.c == null) {
                    final l c = e6.e.c(e6.e.this);
                    if (c != null && !(boolean)c.invoke(((e.c)this).a())) {
                        return null;
                    }
                    if ((this.c = ((e.c)this).a().listFiles()) == null) {
                        final p d = e6.e.d(e6.e.this);
                        if (d != null) {
                            d.invoke(((e.c)this).a(), new e6.a(((e.c)this).a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                final File[] c2 = this.c;
                if (c2 != null) {
                    final int d2 = this.d;
                    Intrinsics.b(c2);
                    if (d2 < c2.length) {
                        final File[] c3 = this.c;
                        Intrinsics.b(c3);
                        return c3[this.d++];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return ((e.c)this).a();
                }
                final l e = e6.e.e(e6.e.this);
                if (e != null) {
                    e.invoke(((e.c)this).a());
                }
                return null;
            }
        }
        
        public final class b extends e.c
        {
            public boolean b;
            
            public b(final File file) {
                Intrinsics.checkNotNullParameter(file, "rootFile");
                super(file);
            }
            
            @Override
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return ((e.c)this).a();
            }
        }
        
        public final class c extends e.a
        {
            public boolean b;
            public File[] c;
            public int d;
            
            public c(final File file) {
                Intrinsics.checkNotNullParameter(file, "rootDir");
                super(file);
            }
            
            @Override
            public File b() {
                if (this.b) {
                    final File[] c = this.c;
                    if (c != null) {
                        final int d = this.d;
                        Intrinsics.b(c);
                        if (d >= c.length) {
                            final l e = e6.e.e(e6.e.this);
                            if (e != null) {
                                e.invoke(((e.c)this).a());
                            }
                            return null;
                        }
                    }
                    Label_0220: {
                        if (this.c == null) {
                            if ((this.c = ((e.c)this).a().listFiles()) == null) {
                                final p d2 = e6.e.d(e6.e.this);
                                if (d2 != null) {
                                    d2.invoke(((e.c)this).a(), new a(((e.c)this).a(), null, "Cannot list files in a directory", 2, null));
                                }
                            }
                            final File[] c2 = this.c;
                            if (c2 != null) {
                                Intrinsics.b(c2);
                                if (c2.length != 0) {
                                    break Label_0220;
                                }
                            }
                            final l e2 = e6.e.e(e6.e.this);
                            if (e2 != null) {
                                e2.invoke(((e.c)this).a());
                            }
                            return null;
                        }
                    }
                    final File[] c3 = this.c;
                    Intrinsics.b(c3);
                    return c3[this.d++];
                }
                final l c4 = e6.e.c(e6.e.this);
                if (c4 != null && !(boolean)c4.invoke(((e.c)this).a())) {
                    return null;
                }
                this.b = true;
                return ((e.c)this).a();
            }
        }
    }
    
    public abstract static class c
    {
        public final File a;
        
        public c(final File a) {
            Intrinsics.checkNotNullParameter(a, "root");
            this.a = a;
        }
        
        public final File a() {
            return this.a;
        }
        
        public abstract File b();
    }
}
