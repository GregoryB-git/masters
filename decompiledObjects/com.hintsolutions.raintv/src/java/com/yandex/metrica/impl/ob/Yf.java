/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.zl
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.El;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.Oh;
import com.yandex.metrica.impl.ob.Xg;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.em;
import com.yandex.metrica.impl.ob.fd;
import com.yandex.metrica.impl.ob.s2;
import com.yandex.metrica.impl.ob.zl;
import com.yandex.metrica.network.NetworkClient$Builder;
import com.yandex.metrica.network.Request$Builder;
import com.yandex.metrica.network.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class yf {
    private static final Map<Oh.a, H1.d> i = Collections.unmodifiableMap((Map)new HashMap<Oh.a, H1.d>(){
        {
            this.put((Object)Oh.a.b, (Object)H1.d.b);
            this.put((Object)Oh.a.a, (Object)H1.d.a);
        }
    });
    @NonNull
    private final Context a;
    @NonNull
    private final ProtobufStateStorage b;
    @NonNull
    private final ICommonExecutor c;
    @NonNull
    private final Xg d;
    @NonNull
    private final s2 e;
    @NonNull
    private final El f;
    private e g;
    private boolean h = false;

    @VisibleForTesting
    public yf(@NonNull Context context, @NonNull ProtobufStateStorage protobufStateStorage, @NonNull s2 s22, @NonNull Xg xg2, @NonNull ICommonExecutor iCommonExecutor, @NonNull El el2) {
        this.a = context;
        this.b = protobufStateStorage;
        this.e = s22;
        this.d = xg2;
        this.g = (e)protobufStateStorage.read();
        this.c = iCommonExecutor;
        this.f = el2;
    }

    public static void a(yf yf2) {
        if (!yf2.h) {
            e e4;
            yf2.g = e4 = (e)yf2.b.read();
            e4 = e4.b().iterator();
            while (e4.hasNext()) {
                yf2.b((e.a)e4.next());
            }
            yf2.h = true;
        }
    }

    public static void a(yf yf2, e.b b3) {
        yf yf3 = yf2;
        synchronized (yf3) {
            yf2.g.b(b3.a);
            yf2.b.save(yf2.g);
            yf2.d.a(b3);
            return;
        }
    }

    public static void a(yf yf2, List list, long l8) {
        yf2.getClass();
        if (!A2.b((Collection)list)) {
            for (Oh oh2 : list) {
                Object object;
                if (oh2.a == null || oh2.b == null || oh2.c == null || (object = oh2.e) == null || object < 0L || A2.b(oh2.f)) continue;
                object = oh2.a;
                String string = oh2.b;
                String string2 = oh2.c;
                Iterator iterator2 = oh2.d;
                em<String, String> em2 = new em<String, String>(false);
                for (Iterator iterator2 : iterator2) {
                    em2.a((String)iterator2.first, (String)iterator2.second);
                }
                long l9 = TimeUnit.SECONDS.toMillis(oh2.e + l8);
                iterator2 = oh2.f;
                oh2 = new ArrayList(iterator2.size());
                for (Object object2 : iterator2) {
                    oh2.add(i.get(object2));
                }
                yf2.a(new e.a((String)object, string, string2, em2, l9, (List<H1.d>)oh2));
            }
        }
    }

    private boolean a(@NonNull e.a a2) {
        boolean bl = this.g.a(a2);
        if (bl) {
            this.b(a2);
            this.d.a(a2);
        }
        this.b.save(this.g);
        return bl;
    }

    private void b(@NonNull e.a a2) {
        long l8 = Math.max((long)(a2.e - System.currentTimeMillis()), (long)0L);
        this.c.executeDelayed(new Runnable(){
            public final e.a a;
            public final yf b;
            {
                this.b = yf2;
                this.a = a2;
            }

            public void run() {
                if (!this.b.e.e()) {
                    this.b.d.b(this.a);
                    e.b b3 = new e.b(this.a);
                    Object object = this.b.f;
                    Object object22 = this.b.a;
                    ((zl)object).getClass();
                    object = H1.a((Context)object22);
                    b3.a((H1.d)((Object)object));
                    if (object == H1.d.m) {
                        b3.a(e.b.a.a);
                    } else if (!this.a.f.contains(object)) {
                        b3.a(e.b.a.b);
                    } else {
                        object = new Request$Builder(this.a.b).withMethod(this.a.c);
                        for (Object object22 : this.a.d.a()) {
                            ((Request$Builder)object).addHeader((String)object22.getKey(), TextUtils.join((CharSequence)",", (Iterable)((Iterable)object22.getValue())));
                        }
                        object22 = new NetworkClient$Builder();
                        F0.g().t().getClass();
                        object22 = ((NetworkClient$Builder)object22).withSslSocketFactory(null).withInstanceFollowRedirects(true);
                        int n7 = fd.a;
                        object = ((NetworkClient$Builder)object22).withConnectTimeout(n7).withReadTimeout(n7).withMaxResponseSize(102400).build().newCall(((Request$Builder)object).build()).execute();
                        n7 = ((Response)object).getCode();
                        if (((Response)object).isCompleted()) {
                            b3.a(e.b.a.c);
                        } else {
                            b3.a(e.b.a.d);
                            b3.a(((Response)object).getException());
                        }
                        b3.a(n7);
                        b3.e = ((Response)object).getResponseData();
                        b3.f = ((Response)object).getErrorData();
                        b3.a((Map<String, List<String>>)((Response)object).getHeaders());
                    }
                    yf.a(this.b, b3);
                }
            }
        }, Math.max((long)ActivationBarrier.ACTIVATION_DELAY, (long)l8));
    }

    public void a() {
        yf yf2 = this;
        synchronized (yf2) {
            ICommonExecutor iCommonExecutor = this.c;
            Runnable runnable = new Runnable(this){
                public final yf a;
                {
                    this.a = yf2;
                }

                public void run() {
                    yf.a(this.a);
                }
            };
            iCommonExecutor.execute(runnable);
            return;
        }
    }

    public void a(@NonNull ci ci2) {
        yf yf2 = this;
        synchronized (yf2) {
            List<Oh> list = ci2.I();
            ICommonExecutor iCommonExecutor = this.c;
            Runnable runnable = new Runnable(){
                public final List a;
                public final ci b;
                public final yf c;
                {
                    this.c = yf2;
                    this.a = list;
                    this.b = ci2;
                }

                public void run() {
                    yf.a(this.c, this.a, this.b.C());
                }
            };
            iCommonExecutor.execute(runnable);
            return;
        }
    }

    public static class e {
        @NonNull
        private final List<a> a;
        @NonNull
        private final LinkedHashMap<String, Object> b;

        public e(@NonNull List<a> iterator, @NonNull List<String> object2) {
            this.a = iterator;
            this.b = new LinkedHashMap();
            if (!A2.b(object2)) {
                for (Object object2 : object2) {
                    this.b.put(object2, new Object());
                }
            }
        }

        @NonNull
        public Set<String> a() {
            HashSet hashSet = new HashSet();
            Iterator iterator = this.b.keySet().iterator();
            int n7 = 0;
            while (iterator.hasNext()) {
                int n8;
                hashSet.add((Object)((String)iterator.next()));
                n7 = n8 = n7 + 1;
                if (n8 <= 1000) continue;
            }
            return hashSet;
        }

        public boolean a(@NonNull a a2) {
            if (this.b.get((Object)a2.a) == null && !this.a.contains((Object)a2)) {
                this.a.add((Object)a2);
                return true;
            }
            return false;
        }

        @NonNull
        public List<a> b() {
            return this.a;
        }

        public void b(@NonNull a a2) {
            this.b.put((Object)a2.a, new Object());
            this.a.remove((Object)a2);
        }

        public static class a {
            @NonNull
            public final String a;
            @NonNull
            public final String b;
            @NonNull
            public final String c;
            @NonNull
            public final em<String, String> d;
            public final long e;
            @NonNull
            public final List<H1.d> f;

            public a(@NonNull String string, @NonNull String string2, @NonNull String string3, @NonNull em<String, String> em2, long l8, @NonNull List<H1.d> list) {
                this.a = string;
                this.b = string2;
                this.c = string3;
                this.e = l8;
                this.f = list;
                this.d = em2;
            }

            public boolean equals(Object object) {
                if (this == object) {
                    return true;
                }
                if (object != null && a.class == object.getClass()) {
                    object = (a)object;
                    return this.a.equals((Object)((a)object).a);
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }
        }

        public static class b {
            @NonNull
            private final com.yandex.metrica.impl.ob.yf$e$a a;
            @Nullable
            private a b;
            @Nullable
            private H1.d c;
            @Nullable
            private Integer d;
            @Nullable
            public byte[] e;
            @Nullable
            public byte[] f;
            @Nullable
            private Map<String, List<String>> g;
            @Nullable
            private Throwable h;

            public b(@NonNull com.yandex.metrica.impl.ob.yf$e$a a2) {
                this.a = a2;
            }

            @Nullable
            public H1.d a() {
                return this.c;
            }

            public void a(@Nullable H1.d d4) {
                this.c = d4;
            }

            public void a(@NonNull a a2) {
                this.b = a2;
            }

            public void a(@Nullable Integer n7) {
                this.d = n7;
            }

            public void a(@Nullable Throwable throwable) {
                this.h = throwable;
            }

            public void a(@Nullable Map<String, List<String>> map) {
                this.g = map;
            }

            @Nullable
            public byte[] b() {
                return this.f;
            }

            @Nullable
            public Throwable c() {
                return this.h;
            }

            @NonNull
            public com.yandex.metrica.impl.ob.yf$e$a d() {
                return this.a;
            }

            @Nullable
            public byte[] e() {
                return this.e;
            }

            @Nullable
            public Integer f() {
                return this.d;
            }

            @Nullable
            public Map<String, List<String>> g() {
                return this.g;
            }

            @Nullable
            public a h() {
                return this.b;
            }

            public static final class a
            extends Enum<a> {
                public static final /* enum */ a a;
                public static final /* enum */ a b;
                public static final /* enum */ a c;
                public static final /* enum */ a d;
                private static final a[] e;

                static {
                    a a2;
                    a a3;
                    a a7;
                    a a9;
                    a = a9 = new a();
                    b = a7 = new a();
                    c = a3 = new a();
                    d = a2 = new a();
                    e = new a[]{a9, a7, a3, a2};
                }

                public static a valueOf(String string) {
                    return (a)Enum.valueOf(a.class, (String)string);
                }

                public static a[] values() {
                    return (a[])e.clone();
                }
            }
        }
    }
}

