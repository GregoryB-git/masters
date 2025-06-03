// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R3;

import X3.b;
import android.os.Build$VERSION;
import T3.n;
import T3.h;
import java.io.File;
import c4.a;
import java.util.List;
import c4.d;
import android.os.Handler;
import Y3.c;
import V3.r;
import V3.f;
import android.util.Log;
import java.util.HashSet;
import s3.e;
import java.util.Set;
import android.content.Context;
import V3.l;

public class i implements l
{
    public final Context a;
    public final Set b;
    public final e c;
    
    public i(final e c) {
        this.b = new HashSet();
        this.c = c;
        if (c != null) {
            this.a = c.m();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }
    
    public static /* synthetic */ Context h(final i i) {
        return i.a;
    }
    
    @Override
    public r a(final f f) {
        return new c() {
            public final /* synthetic */ c4.c b = f.q("RunLoop");
            
            @Override
            public void g(final Throwable t) {
                final String h = Y3.c.h(t);
                this.b.c(h, t);
                new Handler(i.h(i.this).getMainLooper()).post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        throw new RuntimeException(h, t);
                    }
                });
                this.d().shutdownNow();
            }
        };
    }
    
    @Override
    public d b(final f f, final d.a a, final List list) {
        return new a(a, list);
    }
    
    @Override
    public File c() {
        return this.a.getApplicationContext().getDir("sslcache", 0);
    }
    
    @Override
    public h d(final f f, final T3.c c, final T3.f f2, final h.a a) {
        final n n = new n(c, f2, a);
        this.c.g((e.a)new e.a() {
            @Override
            public void a(final boolean b) {
                if (b) {
                    n.j("app_in_background");
                    return;
                }
                n.p("app_in_background");
            }
        });
        return n;
    }
    
    @Override
    public String e(final f f) {
        final StringBuilder sb = new StringBuilder();
        sb.append(Build$VERSION.SDK_INT);
        sb.append("/Android");
        return sb.toString();
    }
    
    @Override
    public X3.e f(final f f, String string) {
        final String x = f.x();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("_");
        sb.append(x);
        string = sb.toString();
        if (!this.b.contains(string)) {
            this.b.add(string);
            return new b(f, new j(this.a, f, string), new X3.c(f.s()));
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("SessionPersistenceKey '");
        sb2.append(x);
        sb2.append("' has already been used.");
        throw new Q3.d(sb2.toString());
    }
    
    @Override
    public V3.j g(final f f) {
        return new R3.h();
    }
}
