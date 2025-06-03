/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Void
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.FutureTask
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Db;
import com.yandex.metrica.impl.ob.U0;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.mb;
import com.yandex.metrica.impl.ob.nb;
import com.yandex.metrica.impl.ob.ob;
import com.yandex.metrica.impl.ob.pb;
import com.yandex.metrica.impl.ob.sb;
import com.yandex.metrica.impl.ob.xb;
import com.yandex.metrica.impl.ob.yb;
import com.yandex.metrica.impl.ob.zb;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class qb
implements xb {
    private final Object a = new Object();
    @Nullable
    private ci b;
    private volatile FutureTask<Void> c;
    @NonNull
    private final g d;
    @NonNull
    private final g e;
    @NonNull
    private final g f;
    @NonNull
    private final ob g;
    @NonNull
    private final ob h;
    @NonNull
    private final ob i;
    @Nullable
    private Context j;
    @NonNull
    private ICommonExecutor k;
    @NonNull
    private volatile sb l;

    @VisibleForTesting
    public qb(@NonNull g g2, @NonNull g g5, @NonNull g g6, @NonNull ICommonExecutor iCommonExecutor, @NonNull ob ob2, @NonNull ob ob3, @NonNull ob ob4, String string) {
        this.d = g2;
        this.e = g5;
        this.f = g6;
        this.g = ob2;
        this.h = ob3;
        this.i = ob4;
        this.k = iCommonExecutor;
        this.l = new sb();
    }

    public qb(@NonNull g g2, @NonNull g g5, @NonNull g g6, @NonNull ICommonExecutor iCommonExecutor, String string) {
        this(g2, g5, g6, iCommonExecutor, new pb(new Db("google")), new pb(new Db("huawei")), new pb(new Db("yandex")), string);
    }

    public static nb a(qb object, Context object2) {
        object = ((qb)object).d.a(((qb)object).b) ? ((qb)object).g.a((Context)object2) : ((object2 = ((qb)object).b) != null && ((ci)object2).q() ? (!((qb)object).b.f().n ? new nb(null, U0.f, "startup forbade ads identifiers collecting") : new nb(null, U0.g, "identifiers collecting is forbidden for unknown reason")) : new nb(null, U0.e, "startup has not been received yet"));
        return object;
    }

    public static nb a(qb object, Context context, zb zb2) {
        object = ((qb)object).f.a(((qb)object).b) ? ((qb)object).i.a(context, zb2) : new nb(null, U0.g, "identifiers collecting is forbidden for unknown reason");
        return object;
    }

    public static nb a(qb object, nb nb2, nb nb3) {
        object.getClass();
        U0 u02 = nb2.b;
        object = nb2;
        if (u02 != U0.b) {
            object = new nb(nb3.a, u02, nb2.c);
        }
        return object;
    }

    public static /* synthetic */ sb a(qb qb2) {
        return qb2.l;
    }

    public static /* synthetic */ sb a(qb qb2, sb sb2) {
        qb2.l = sb2;
        return sb2;
    }

    public static /* synthetic */ Context b(qb qb2) {
        return qb2.j;
    }

    public static nb b(qb object, Context object2) {
        object = ((qb)object).e.a(((qb)object).b) ? ((qb)object).h.a((Context)object2) : ((object2 = ((qb)object).b) != null && ((ci)object2).q() ? (!((qb)object).b.f().v ? new nb(null, U0.f, "startup forbade ads identifiers collecting") : new nb(null, U0.g, "identifiers collecting is forbidden for unknown reason")) : new nb(null, U0.e, "startup has not been received yet"));
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c() {
        boolean bl2;
        if (this.j == null) return;
        qb qb2 = this;
        synchronized (qb2) {
            block4: {
                U0 u02 = this.l.a().b;
                U0 u03 = U0.g;
                if (u02 == u03) break block4;
                u02 = this.l.b().b;
                if (u02 == u03) break block4;
                return;
            }
            bl2 = false;
        }
        if (bl2) return;
        this.a(this.j);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public sb a(@NonNull Context futureTask) {
        this.b((Context)futureTask);
        futureTask = this.c;
        try {
            futureTask.get();
            return this.l;
        }
        catch (InterruptedException | ExecutionException throwable) {
            return this.l;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public sb a(@NonNull Context context, @NonNull zb zb2) {
        context = new FutureTask((Callable)new Callable<Void>(){
            public final Context a;
            public final zb b;
            public final qb c;
            {
                this.c = qb2;
                this.a = context;
                this.b = zb2;
            }

            public Object call() throws Exception {
                sb sb2 = qb.a(this.c);
                qb qb2 = this.c;
                nb nb2 = qb.a(qb2, qb.a(qb2, this.a), sb2.a());
                Object object = this.c;
                object = qb.a((qb)object, qb.b((qb)object, this.a), sb2.b());
                qb qb3 = this.c;
                qb.a(qb2, new sb(nb2, (nb)object, qb.a(qb3, qb.a(qb3, this.a, this.b), sb2.c())));
                return null;
            }
        });
        this.k.execute((Runnable)context);
        try {
            context.get();
            return this.l;
        }
        catch (InterruptedException | ExecutionException throwable) {
            return this.l;
        }
    }

    @Override
    @Deprecated
    @Nullable
    public String a() {
        this.c();
        Object object = this.l.a().a;
        object = object == null ? null : ((mb)object).b;
        return object;
    }

    public void a(@NonNull Context context, @Nullable ci ci2) {
        this.b = ci2;
        this.b(context);
    }

    public void a(@NonNull ci ci2) {
        this.b = ci2;
    }

    @Override
    @Deprecated
    @Nullable
    public Boolean b() {
        this.c();
        mb mb2 = this.l.a().a;
        mb2 = mb2 == null ? null : mb2.c;
        return mb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@NonNull Context object) {
        this.j = object.getApplicationContext();
        if (this.c != null) return;
        Object object2 = object = this.a;
        synchronized (object2) {
            FutureTask futureTask;
            if (this.c != null) return;
            Callable<Void> callable = new Callable<Void>(this){
                public final qb a;
                {
                    this.a = qb2;
                }

                public Object call() throws Exception {
                    qb qb2 = this.a;
                    nb nb2 = qb.a(qb2, qb.b(qb2));
                    Object object = this.a;
                    object = qb.b((qb)object, qb.b((qb)object));
                    qb qb3 = this.a;
                    qb.a(qb2, new sb(nb2, (nb)object, qb.a(qb3, qb.b(qb3), new yb())));
                    return null;
                }
            };
            this.c = futureTask = new FutureTask((Callable)callable);
            this.k.execute((Runnable)this.c);
            return;
        }
    }

    public void c(@NonNull Context context) {
        this.j = context.getApplicationContext();
    }

    public static class c
    implements g {
        @Override
        public boolean a(@Nullable ci ci2) {
            return true;
        }
    }

    public static class d
    implements g {
        @Override
        public boolean a(@Nullable ci ci2) {
            boolean bl2 = ci2 != null && (ci2.f().v || !ci2.q());
            return bl2;
        }
    }

    public static class e
    implements g {
        @Override
        public boolean a(@Nullable ci ci2) {
            return false;
        }
    }

    public static class f
    implements g {
        @Override
        public boolean a(@Nullable ci ci2) {
            boolean bl2 = ci2 != null && ci2.f().v;
            return bl2;
        }
    }

    public static class h
    implements g {
        @Override
        public boolean a(@Nullable ci ci2) {
            boolean bl2 = ci2 != null && (ci2.f().n || !ci2.q());
            return bl2;
        }
    }

    public static class i
    implements g {
        @Override
        public boolean a(@Nullable ci ci2) {
            boolean bl2 = ci2 != null && ci2.f().n;
            return bl2;
        }
    }
}

