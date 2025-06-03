/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64OutputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.zip.GZIPOutputStream
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package o4;

import B3.F;
import B3.c;
import B3.h;
import V2.m;
import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import o4.b;
import o4.c;
import o4.d;
import o4.e;
import o4.g;
import o4.i;
import o4.j;
import o4.q;
import o4.r;
import org.json.JSONArray;
import org.json.JSONObject;
import y3.a;

public class f
implements i,
j {
    public final r4.b a;
    public final Context b;
    public final r4.b c;
    public final Set d;
    public final Executor e;

    public f(Context context, String string2, Set set, r4.b b8, Executor executor) {
        this(new c(context, string2), set, executor, b8, context);
    }

    public f(r4.b b8, Set set, Executor executor, r4.b b9, Context context) {
        this.a = b8;
        this.d = set;
        this.e = executor;
        this.c = b9;
        this.b = context;
    }

    public static /* synthetic */ String c(f f8) {
        return f8.i();
    }

    public static /* synthetic */ q d(Context context, String string2) {
        return f.j(context, string2);
    }

    public static /* synthetic */ f e(F f8, B3.e e8) {
        return f.h(f8, e8);
    }

    public static /* synthetic */ Void f(f f8) {
        return f8.k();
    }

    public static B3.c g() {
        F f8 = F.a(a.class, Executor.class);
        return B3.c.f(f.class, i.class, j.class).b(B3.r.k(Context.class)).b(B3.r.k(s3.e.class)).b(B3.r.n(g.class)).b(B3.r.m(O4.i.class)).b(B3.r.j(f8)).f(new b(f8)).d();
    }

    public static /* synthetic */ f h(F f8, B3.e e8) {
        return new f((Context)e8.a(Context.class), ((s3.e)e8.a(s3.e.class)).s(), e8.c(g.class), e8.g(O4.i.class), (Executor)e8.h(f8));
    }

    public static /* synthetic */ q j(Context context, String string2) {
        return new q(context, string2);
    }

    @Override
    public V2.j a() {
        if (E.r.a(this.b) ^ true) {
            return m.e("");
        }
        return m.c(this.e, new d(this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public j.a b(String object) {
        synchronized (this) {
            try {
                long l8 = System.currentTimeMillis();
                object = (q)this.a.get();
                if (!object.i(l8)) return j.a.p;
                object.g();
                return j.a.r;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final /* synthetic */ String i() {
        Throwable throwable522;
        JSONObject jSONObject;
        r r8;
        // MONITORENTER : this
        q q8 = (q)this.a.get();
        Object object = q8.c();
        q8.b();
        q8 = new JSONArray();
        for (int i8 = 0; i8 < object.size(); ++i8) {
            r8 = (r)object.get(i8);
            jSONObject = new JSONObject();
            jSONObject.put("agent", (Object)r8.c());
            jSONObject.put("dates", (Object)new JSONArray((Collection)r8.b()));
            q8.put((Object)jSONObject);
        }
        r8 = new JSONObject();
        r8.put("heartbeats", (Object)q8);
        r8.put("version", (Object)"2");
        jSONObject = new ByteArrayOutputStream();
        object = new Base64OutputStream((OutputStream)jSONObject, 11);
        {
            catch (Throwable throwable222) {
                throw throwable222;
            }
        }
        q8 = new GZIPOutputStream((OutputStream)object);
        q8.write(r8.toString().getBytes("UTF-8"));
        q8.close();
        object.close();
        object = jSONObject.toString("UTF-8");
        // MONITOREXIT : this
        return object;
        catch (Throwable throwable3) {
            try {
                q8.close();
                throw throwable3;
            }
            catch (Throwable throwable4) {
                try {
                    throwable3.addSuppressed(throwable4);
                    throw throwable3;
                }
                catch (Throwable throwable522) {}
            }
        }
        try {
            object.close();
            throw throwable522;
        }
        catch (Throwable throwable6) {
            throwable522.addSuppressed(throwable6);
            throw throwable522;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ Void k() {
        synchronized (this) {
            ((q)this.a.get()).k(System.currentTimeMillis(), ((O4.i)this.c.get()).a());
            return null;
        }
    }

    public V2.j l() {
        if (this.d.size() <= 0) {
            return m.e(null);
        }
        if (E.r.a(this.b) ^ true) {
            return m.e(null);
        }
        return m.c(this.e, new e(this));
    }
}

