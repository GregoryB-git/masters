/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.E3
 *  com.yandex.metrica.impl.ob.I
 *  com.yandex.metrica.impl.ob.Rh$a
 *  com.yandex.metrica.impl.ob.Sl
 *  com.yandex.metrica.impl.ob.Vi
 *  com.yandex.metrica.impl.ob.q3
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  kotlin.jvm.functions.Function0
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Cl;
import com.yandex.metrica.impl.ob.E3;
import com.yandex.metrica.impl.ob.Eh;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.I;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.Oi;
import com.yandex.metrica.impl.ob.Qi;
import com.yandex.metrica.impl.ob.Rh;
import com.yandex.metrica.impl.ob.Ri;
import com.yandex.metrica.impl.ob.Sh;
import com.yandex.metrica.impl.ob.Sl;
import com.yandex.metrica.impl.ob.Th;
import com.yandex.metrica.impl.ob.Vi;
import com.yandex.metrica.impl.ob.Xh;
import com.yandex.metrica.impl.ob.ai;
import com.yandex.metrica.impl.ob.bi;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.di;
import com.yandex.metrica.impl.ob.kd;
import com.yandex.metrica.impl.ob.l3;
import com.yandex.metrica.impl.ob.n3;
import com.yandex.metrica.impl.ob.q3;
import com.yandex.metrica.impl.ob.zg;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

public class ei {
    @NonNull
    private final Context a;
    @NonNull
    private final I3 b;
    @NonNull
    private final bi c;
    @NonNull
    private final ci.b d;
    @Nullable
    private volatile NetworkTask e;
    @NonNull
    private Sh f;
    @NonNull
    private final TimeProvider g;
    @NonNull
    private final I h;
    @NonNull
    private final Eh i;
    @NonNull
    private final l3 j;

    @VisibleForTesting
    public ei(@NonNull Context context, @NonNull I3 i3, @NonNull bi bi2, @NonNull ci.b b2, @NonNull ci ci2, @NonNull Cl cl2, @NonNull Sh sh2, @NonNull TimeProvider timeProvider, @NonNull I i5, @NonNull Eh eh, @NonNull Qi qi2, @NonNull l3 l32) {
        this.a = context;
        this.b = i3;
        this.c = bi2;
        this.d = b2;
        this.f = sh2;
        this.g = timeProvider;
        this.h = i5;
        this.i = eh;
        this.j = l32;
        this.a(cl2, qi2, ci2);
    }

    private ei(@NonNull Context context, @NonNull I3 i3, @NonNull zg.b b2, @NonNull bi bi2, @NonNull ci.b b3, @NonNull Cl cl2, @NonNull TimeProvider timeProvider, @NonNull I i5, @NonNull Eh eh, @NonNull l3 l32) {
        this(context, i3, b2, bi2, b3, b3.a(), cl2, timeProvider, i5, eh, l32);
    }

    private ei(@NonNull Context context, @NonNull I3 i3, @NonNull zg.b b2, @NonNull bi bi2, @NonNull ci.b b3, @NonNull ci ci2, @NonNull Cl cl2, @NonNull TimeProvider timeProvider, @NonNull I i5, @NonNull Eh eh, @NonNull l3 l32) {
        this(context, i3, bi2, b3, ci2, cl2, new Sh(new zg.c(context, i3.b()), ci2, b2), timeProvider, i5, eh, Ri.a(context).a(context, (Oi)new Vi(b3)), l32);
    }

    public ei(@NonNull Context context, @NonNull String string, @NonNull zg.b b2, @NonNull bi bi2) {
        this(context, (I3)new E3(string), b2, bi2, new ci.b(context), new Cl(context), new SystemTimeProvider(), F0.g().d(), new Eh(), l3.a());
    }

    public static /* synthetic */ I a(ei ei2) {
        return ei2.h;
    }

    private void a(@NonNull Cl object, @NonNull Qi object2, @NonNull ci ci2) {
        ci.a a2;
        ci.a a3 = a2 = ci2.a();
        if (!ai.a(ci2.V())) {
            a3 = a2.k(((Qi)object2).a().a);
        }
        object2 = ((Cl)object).a();
        object = a3;
        if (!ai.a(ci2.i())) {
            object = a3.c((String)object2).d("");
        }
        object = ((ci.a)object).a();
        this.b((ci)object);
        this.a((ci)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(@NonNull ci ci2) {
        bi bi2 = this.c;
        ArrayList arrayList = this.b.b();
        Rh.a a2 = (Rh.a)bi2;
        bi bi3 = bi2 = Rh.a(a2.a);
        synchronized (bi3) {
            Rh.a(a2.a, ci2);
            arrayList = Rh.b(a2.a).a(arrayList);
            arrayList = arrayList == null ? new ArrayList() : new ArrayList((Collection)arrayList);
        }
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            ((Xh)arrayList.next()).a(ci2);
        }
        return;
    }

    private void b(@NonNull ci ci2) {
        ei ei2 = this;
        synchronized (ei2) {
            this.f.a(ci2);
            this.d.a(ci2);
            F0.g().a(ci2);
            l3 l32 = this.j;
            q3 q32 = new q3(this.b.b(), ci2);
            l32.a((n3)q32);
            return;
        }
    }

    @NonNull
    public I3 a() {
        return this.b;
    }

    @NonNull
    @VisibleForTesting
    public ci a(@NonNull Hi hi2, @NonNull zg object, @Nullable Long l5) {
        String string = Gl.c(((zg)((Object)object)).C());
        Map map = ((zg)((Object)object)).B().b();
        Object object2 = hi2.n();
        String string2 = this.f.d().n();
        if (!Gl.d(Gl.a((String)object2))) {
            object2 = Gl.d(Gl.a(string2)) ? string2 : null;
        }
        Object object3 = this.f.d().i();
        string2 = object3;
        if (TextUtils.isEmpty((CharSequence)object3)) {
            string2 = hi2.i();
        }
        object3 = this.f.d();
        object = new ci.a(new di.b(hi2.e())).c(string2).d(hi2.h()).c(this.g.currentTimeSeconds()).k(((ci)object3).V()).f(hi2.o()).c(hi2.G()).b(((zg)((Object)object)).J()).i(hi2.y()).e(hi2.r()).i(hi2.x()).j(hi2.D()).a(hi2.d()).a(hi2.j()).g(hi2.t()).a(hi2.g()).e((String)object2).h(string);
        this.i.getClass();
        object2 = Gl.a((String)object2);
        boolean bl = A2.b(map) ? A2.b(object2) : object2.equals((Object)map);
        object2 = ((ci.a)object).c(bl).g(Gl.c((Map<String, String>)map)).a(hi2.E()).d(hi2.q()).j(hi2.z()).b(hi2.f()).a(hi2.w()).h(hi2.v()).a(hi2.C()).a(hi2.H()).a(true);
        object = System.currentTimeMillis() / 1000L * 1000L;
        if (l5 != null) {
            object = l5;
        }
        return ((ci.a)object2).b(object.longValue()).a(((zg)((Object)this.f.b())).a(l5)).b(false).a(hi2.p()).a(hi2.B()).a(hi2.L()).b(hi2.K()).c(hi2.M()).a(hi2.J()).a(hi2.I()).a(hi2.c()).a(hi2.k()).f(hi2.s()).a(hi2.b()).a(hi2.a()).a(hi2.l()).a(hi2.m()).a(hi2.F()).b(hi2.u()).a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(@NonNull Hi object, @NonNull zg zg2, @Nullable Map<String, List<String>> list) {
        Object object2;
        boolean bl;
        ei ei2 = this;
        // MONITORENTER : ei2
        if (!A2.b((Map)list) && !(bl = A2.b((Collection)(list = (List)list.get((Object)"Date"))))) {
            try {
                object2 = (String)list.get(0);
                list = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US);
                list = Long.valueOf((long)list.parse((String)object2).getTime());
            }
            catch (Throwable throwable) {}
        }
        list = null;
        object2 = list;
        if (list == null) {
            object2 = 0L;
        }
        list = ((Hi)object).N();
        Sl.c().a(object2.longValue(), (Long)list);
        object = this.a((Hi)object, zg2, (Long)object2);
        ei2 = this;
        // MONITORENTER : ei2
        this.e = null;
        // MONITOREXIT : ei2
        this.b((ci)object);
        // MONITOREXIT : ei2
        this.a((ci)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull Th th2) {
        ei ei2 = this;
        synchronized (ei2) {
            this.e = null;
        }
        bi bi2 = this.c;
        ArrayList arrayList = this.b.b();
        ci ci2 = this.f.d();
        Rh.a a2 = (Rh.a)bi2;
        bi bi3 = bi2 = Rh.a(a2.a);
        synchronized (bi3) {
            arrayList = Rh.b(a2.a).a(arrayList);
            arrayList = arrayList == null ? new ArrayList() : new ArrayList((Collection)arrayList);
        }
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            ((Xh)arrayList.next()).a(th2, ci2);
        }
        return;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull zg.b object) {
        ei ei2 = this;
        synchronized (ei2) {
            this.f.a((zg.b)((Object)object));
            zg zg2 = (zg)((Object)this.f.b());
            if (zg2.K()) {
                boolean bl = false;
                List<String> list = zg2.G();
                boolean bl2 = A2.b(list);
                boolean bl3 = true;
                Object var6_15 = null;
                boolean bl4 = bl;
                Object var1_2 = var6_15;
                if (bl2) {
                    bl4 = bl;
                    Object var1_3 = var6_15;
                    if (!A2.b(zg2.J())) {
                        ci.a a2 = this.f.d().a().b((List<String>)null);
                        bl4 = true;
                    }
                }
                if (!A2.b(list) && !A2.a(list, zg2.J())) {
                    ci.a a3 = this.f.d().a().b(list);
                    bl4 = bl3;
                }
                if (bl4) {
                    void var1_7;
                    ci ci2 = var1_7.a();
                    this.b(ci2);
                    this.a(ci2);
                }
            }
            return;
        }
    }

    public boolean a(@Nullable List<String> list, @NonNull Map<String, String> map) {
        ei ei2 = this;
        synchronized (ei2) {
            ci ci2 = this.f.d();
            Function0<I> function0 = new Function0<I>(this){
                public final ei a;
                {
                    this.a = ei2;
                }

                public Object invoke() {
                    return ei.a(this.a);
                }
            };
            boolean bl = ai.a(ci2, list, map, function0);
            return bl ^ true;
        }
    }

    @NonNull
    public Context b() {
        return this.a;
    }

    @Nullable
    public NetworkTask c() {
        ei ei2 = this;
        synchronized (ei2) {
            if (this.e()) {
                if (this.e == null) {
                    this.e = kd.a(this, (zg)((Object)this.f.b()));
                }
                NetworkTask networkTask = this.e;
                return networkTask;
            }
            return null;
        }
    }

    @NonNull
    public ci d() {
        return this.f.d();
    }

    public boolean e() {
        ei ei2 = this;
        synchronized (ei2) {
            boolean bl;
            block5: {
                boolean bl2;
                ci ci2 = this.f.d();
                bl = bl2 = ai.b(ci2);
                if (bl2) break block5;
                bl = bl2 = ai.a(ci2) ^ true;
                if (bl2) break block5;
                boolean bl3 = this.i.a(((zg)((Object)this.f.b())).C(), ci2, this.h);
                bl = bl2;
                if (bl3) break block5;
                bl = true;
            }
            return bl;
        }
    }
}

