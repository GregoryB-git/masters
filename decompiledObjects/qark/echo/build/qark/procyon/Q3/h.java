// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import V3.k;
import V3.f;
import V3.q;
import A2.n;
import android.text.TextUtils;
import V3.m;
import i4.a;
import V3.g;
import V3.p;
import s3.e;

public class h
{
    public final e a;
    public final p b;
    public final g c;
    public a d;
    public m e;
    
    public h(final e a, final p b, final g c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static /* synthetic */ m a(final h h) {
        return h.e;
    }
    
    public static h d(final e e) {
        String s;
        if ((s = e.r().d()) == null) {
            if (e.r().g() == null) {
                throw new d("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("https://");
            sb.append(e.r().g());
            sb.append("-default-rtdb.firebaseio.com");
            s = sb.toString();
        }
        return e(e, s);
    }
    
    public static h e(final e e, final String str) {
        // monitorenter(h.class)
        Label_0129: {
            try {
                if (TextUtils.isEmpty((CharSequence)str)) {
                    throw new d("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
                }
                n.j(e, "Provided FirebaseApp must not be null.");
                final i i = (i)e.k(i.class);
                n.j(i, "Firebase Database component is not present.");
                final Y3.h h = Y3.m.h(str);
                if (h.b.isEmpty()) {
                    // monitorexit(h.class)
                    return i.a(h.a);
                }
            }
            finally {
                break Label_0129;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Specified Database URL '");
            sb.append(str);
            sb.append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ");
            final Y3.h h2;
            sb.append(h2.b.toString());
            throw new d(sb.toString());
        }
    }
    // monitorexit(h.class)
    
    public static String g() {
        return "20.3.0";
    }
    
    public final void b(final String str) {
        if (this.e == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Calls to ");
        sb.append(str);
        sb.append("() must be made before any other usage of FirebaseDatabase instance.");
        throw new d(sb.toString());
    }
    
    public final void c() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0046: {
            try {
                if (this.e == null) {
                    this.b.a(this.d);
                    this.e = q.b(this.c, this.b, this);
                }
            }
            finally {
                break Label_0046;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public Q3.e f(final String s) {
        this.c();
        if (s != null) {
            Y3.n.i(s);
            return new Q3.e(this.e, new k(s));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
    }
    
    public void h() {
        this.c();
        q.c(this.e);
    }
    
    public void i() {
        this.c();
        q.d(this.e);
    }
    
    public void j() {
        this.c();
        this.e.i0(new Runnable() {
            @Override
            public void run() {
                h.a(h.this).a0();
            }
        });
    }
    
    public void k(final l l) {
        synchronized (this) {
            this.b("setLogLevel");
            this.c.L(l);
        }
    }
    
    public void l(final long n) {
        synchronized (this) {
            this.b("setPersistenceCacheSizeBytes");
            this.c.M(n);
        }
    }
    
    public void m(final boolean b) {
        synchronized (this) {
            this.b("setPersistenceEnabled");
            this.c.N(b);
        }
    }
    
    public void n(final String s, final int n) {
        if (this.e == null) {
            this.d = new a(s, n);
            return;
        }
        throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
    }
}
