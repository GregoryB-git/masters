/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.Nd
 *  com.yandex.metrica.impl.ob.Xd
 *  com.yandex.metrica.impl.ob.Z9
 *  com.yandex.metrica.impl.ob.ca
 *  com.yandex.metrica.impl.ob.di
 *  com.yandex.metrica.impl.ob.f9
 *  com.yandex.metrica.impl.ob.im
 *  com.yandex.metrica.impl.ob.md
 *  com.yandex.metrica.impl.ob.ud
 *  com.yandex.metrica.impl.ob.v3
 *  com.yandex.metrica.impl.ob.yf$e
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.I9;
import com.yandex.metrica.impl.ob.K9;
import com.yandex.metrica.impl.ob.M7;
import com.yandex.metrica.impl.ob.M9;
import com.yandex.metrica.impl.ob.Nd;
import com.yandex.metrica.impl.ob.O9;
import com.yandex.metrica.impl.ob.Pd;
import com.yandex.metrica.impl.ob.Q9;
import com.yandex.metrica.impl.ob.Rg;
import com.yandex.metrica.impl.ob.X2;
import com.yandex.metrica.impl.ob.X9;
import com.yandex.metrica.impl.ob.Xd;
import com.yandex.metrica.impl.ob.Y2;
import com.yandex.metrica.impl.ob.Yd;
import com.yandex.metrica.impl.ob.Z1;
import com.yandex.metrica.impl.ob.Z9;
import com.yandex.metrica.impl.ob.ca;
import com.yandex.metrica.impl.ob.di;
import com.yandex.metrica.impl.ob.f9;
import com.yandex.metrica.impl.ob.h9;
import com.yandex.metrica.impl.ob.im;
import com.yandex.metrica.impl.ob.l9;
import com.yandex.metrica.impl.ob.md;
import com.yandex.metrica.impl.ob.r9;
import com.yandex.metrica.impl.ob.ud;
import com.yandex.metrica.impl.ob.v3;
import com.yandex.metrica.impl.ob.yf;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public interface Y9<T> {
    public ProtobufStateStorage a(@NonNull Context var1);

    public ProtobufStateStorage b(@NonNull Context var1);

    public static class b {
        private final HashMap<Class<?>, Y9<?>> a;
        private final Y9<di> b;
        private final Y9<yf.e> c;
        private final Y9<List<ud>> d;
        private final Y9<md> e;
        private final Y9<Rg> f;
        @Deprecated
        private final Y9<Xd> g;
        @Deprecated
        private final Y9<Z1> h;
        private final Y9<Nd> i;
        private final Y9<X2> j;
        private final Y9<v3> k;

        private b() {
            HashMap hashMap;
            this.a = hashMap = new HashMap();
            Z9<di> z9 = new Z9<di>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("startup_state", m72, new X9(new im(context)).i(), (ProtobufConverter)new Q9());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.b = z9;
            Z9<yf.e> z92 = new Z9<yf.e>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("provided_request_state", m72, new X9(new im(context)).g(), (ProtobufConverter)new K9());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.c = z92;
            Z9<List<ud>> z93 = new Z9<List<ud>>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("permission_list", m72, new X9(new im(context)).d(), (ProtobufConverter)new I9());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.d = z93;
            Z9<md> z94 = new Z9<md>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("app_permissions_state", m72, new X9(new im(context)).a(), (ProtobufConverter)new l9());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.e = z94;
            Z9<Rg> z95 = new Z9<Rg>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("sdk_fingerprinting", m72, new X9(new im(context)).h(), (ProtobufConverter)new O9());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.f = z95;
            Z9<Xd> z96 = new Z9<Xd>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("preload_info", m72, new X9(new im(context)).f(), (ProtobufConverter)new Yd());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.g = z96;
            Z9<Z1> z97 = new Z9<Z1>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("satellite_clids_info", m72, (ProtobufStateSerializer)new h9(), (ProtobufConverter)new M9());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.h = z97;
            Z9<Nd> z98 = new Z9<Nd>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("preload_info_data", m72, new X9(new im(context)).e(), (ProtobufConverter)new Pd());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.i = z98;
            Z9<X2> z99 = new Z9<X2>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("auto_inapp_collecting_info_data", m72, new X9(new im(context)).b(), (ProtobufConverter)new Y2());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).a();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).b();
                }
            };
            this.j = z99;
            Z9<v3> z910 = new Z9<v3>(this){

                @NonNull
                public ProtobufStateStorage a(@NonNull Context context, @NonNull M7 m72) {
                    return new f9("clids_info", m72, new X9(new im(context)).c(), (ProtobufConverter)new r9());
                }

                @NonNull
                public M7 c(@NonNull Context context) {
                    return ca.a((Context)context).n();
                }

                @NonNull
                public M7 d(@NonNull Context context) {
                    return ca.a((Context)context).o();
                }
            };
            this.k = z910;
            hashMap.put(di.class, (Object)z9);
            hashMap.put(yf.e.class, (Object)z92);
            hashMap.put(ud.class, (Object)z93);
            hashMap.put(md.class, (Object)z94);
            hashMap.put(Rg.class, (Object)z95);
            hashMap.put(Xd.class, (Object)z96);
            hashMap.put(Z1.class, (Object)z97);
            hashMap.put(Nd.class, (Object)z98);
            hashMap.put(X2.class, (Object)z99);
            hashMap.put(v3.class, (Object)z910);
        }

        public /* synthetic */ b(a a3) {
            this();
        }

        public static <T> Y9<T> a(Class<T> clazz) {
            return (Y9)k.a.a.get(clazz);
        }

        public static <T> Y9<Collection<T>> b(Class<T> clazz) {
            return (Y9)k.a.a.get(clazz);
        }

        public static final class k {
            public static final b a = new b(null);
        }
    }
}

