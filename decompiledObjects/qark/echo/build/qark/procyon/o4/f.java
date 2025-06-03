// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o4;

import java.util.List;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.concurrent.Callable;
import V2.m;
import B3.h;
import B3.r;
import y3.a;
import B3.e;
import B3.F;
import java.util.concurrent.Executor;
import java.util.Set;
import android.content.Context;
import r4.b;

public class f implements i, j
{
    public final b a;
    public final Context b;
    public final b c;
    public final Set d;
    public final Executor e;
    
    public f(final Context context, final String s, final Set set, final b b, final Executor executor) {
        this(new c(context, s), set, executor, b, context);
    }
    
    public f(final b a, final Set d, final Executor e, final b c, final Context b) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    public static B3.c g() {
        final F a = F.a(y3.a.class, Executor.class);
        return B3.c.f(f.class, i.class, j.class).b(r.k(Context.class)).b(r.k(s3.e.class)).b(r.n(g.class)).b(r.m(O4.i.class)).b(r.j(a)).f(new o4.b(a)).d();
    }
    
    @Override
    public V2.j a() {
        if (E.r.a(this.b) ^ true) {
            return m.e("");
        }
        return m.c(this.e, new d(this));
    }
    
    @Override
    public a b(final String s) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0051: {
            try {
                final long currentTimeMillis = System.currentTimeMillis();
                final q q = (q)this.a.get();
                if (q.i(currentTimeMillis)) {
                    q.g();
                    // monitorexit(this)
                    return j.a.r;
                }
            }
            finally {
                break Label_0051;
            }
            return j.a.p;
        }
    }
    // monitorexit(this)
    
    public V2.j l() {
        if (this.d.size() <= 0) {
            return m.e(null);
        }
        if (E.r.a(this.b) ^ true) {
            return m.e(null);
        }
        return m.c(this.e, new o4.e(this));
    }
}
