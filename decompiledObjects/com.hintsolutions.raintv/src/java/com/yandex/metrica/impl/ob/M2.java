/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.coreutils.io.FileUtils;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Ad;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.D1;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Fd;
import com.yandex.metrica.impl.ob.Gd;
import com.yandex.metrica.impl.ob.Hd;
import com.yandex.metrica.impl.ob.Id;
import com.yandex.metrica.impl.ob.Jd;
import com.yandex.metrica.impl.ob.Kd;
import com.yandex.metrica.impl.ob.L0;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.M7;
import com.yandex.metrica.impl.ob.N7;
import com.yandex.metrica.impl.ob.Nd;
import com.yandex.metrica.impl.ob.Q7;
import com.yandex.metrica.impl.ob.Qi;
import com.yandex.metrica.impl.ob.Ri;
import com.yandex.metrica.impl.ob.Td;
import com.yandex.metrica.impl.ob.V7;
import com.yandex.metrica.impl.ob.Vi;
import com.yandex.metrica.impl.ob.W3;
import com.yandex.metrica.impl.ob.X8;
import com.yandex.metrica.impl.ob.Xd;
import com.yandex.metrica.impl.ob.Y8;
import com.yandex.metrica.impl.ob.Y9;
import com.yandex.metrica.impl.ob.Z1;
import com.yandex.metrica.impl.ob.Z8;
import com.yandex.metrica.impl.ob.ah;
import com.yandex.metrica.impl.ob.bh;
import com.yandex.metrica.impl.ob.ca;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.di;
import com.yandex.metrica.impl.ob.md;
import com.yandex.metrica.impl.ob.s;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.ud;
import com.yandex.metrica.impl.ob.v3;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class m2
extends D1 {
    @NonNull
    private final Y8 a;
    @NonNull
    private final Context b;
    @NonNull
    private final V7 c;

    @VisibleForTesting
    public m2(@NonNull Context context, @NonNull Y8 y82, @NonNull V7 v72) {
        this.b = context;
        this.a = y82;
        this.c = v72;
    }

    public static /* synthetic */ Context a(m2 m22) {
        return m22.b;
    }

    public static /* synthetic */ Y8 b(m2 m22) {
        return m22.a;
    }

    @Override
    public int a(Gd gd2) {
        int n2;
        int n3 = n2 = gd2.f();
        if (n2 == -1) {
            n3 = this.a.a(-1);
        }
        n2 = n3;
        if (n3 == -1) {
            n2 = this.c.c();
        }
        return n2;
    }

    @Override
    public SparseArray<D1.a> a() {
        return new SparseArray<D1.a>(this){
            public final m2 a;
            {
                this.a = m22;
                this.put(29, new j(m2.a(m22)));
                this.put(39, new k());
                this.put(47, new l(m2.b(m22)));
                this.put(60, new m(m2.b(m22)));
                this.put(62, new n());
                this.put(66, new o());
                this.put(67, new g(Y9.b.a(di.class).b(m2.a(m22)), new Z8(ca.a(m2.a(m22)).q(), m2.a(m22).getPackageName())));
                this.put(68, new u());
                this.put(72, new f(Y9.b.b(ud.class).b(m2.a(m22)), Y9.b.a(di.class).b(m2.a(m22))));
                this.put(82, new h(Y9.b.b(ud.class).b(m2.a(m22)), Y9.b.a(md.class).b(m2.a(m22))));
                this.put(87, new i(Y9.b.a(di.class).b(m2.a(m22))));
                this.put(92, new c(Y9.b.a(di.class).b(m2.a(m22))));
                this.put(93, new e(m2.a(m22), Y9.b.a(Xd.class).b(m2.a(m22)), Y9.b.a(Nd.class).b(m2.a(m22))));
                this.put(94, new p(m2.a(m22), Y9.b.a(di.class).b(m2.a(m22))));
                this.put(98, new t(m2.b(m22)));
                this.put(100, new b(new Z8(ca.a(m2.a(m22)).q(), m2.a(m22).getPackageName())));
                this.put(101, new q(m2.b(m22), Y9.b.a(di.class).b(m2.a(m22))));
                this.put(102, new r(Y9.b.a(Nd.class).b(m2.a(m22))));
                this.put(103, new d(Y9.b.a(Z1.class).b(m2.a(m22)), Y9.b.a(v3.class).b(m2.a(m22)), m2.b(m22)));
                this.put(104, new s(ca.a(m2.a(m22)).o()));
            }
        };
    }

    @Override
    public void a(Gd gd2, int n2) {
        this.c.a(n2);
    }

    public static class b
    implements D1.a {
        private final Z8 a;

        public b(@NonNull Z8 z82) {
            this.a = z82;
        }

        @Override
        public void a(Context context) {
            this.a.f();
        }
    }

    public static class c
    implements D1.a {
        @NonNull
        private final ProtobufStateStorage a;

        public c(@NonNull ProtobufStateStorage protobufStateStorage) {
            this.a = protobufStateStorage;
        }

        @Override
        public void a(Context object) {
            object = (di)this.a.read();
            this.a.save(((di)object).a(((di)object).r).g(((di)object).p).a());
        }
    }

    public static class d
    implements D1.a {
        @NonNull
        private final ProtobufStateStorage a;
        @NonNull
        private final ProtobufStateStorage b;
        @NonNull
        private final Y8 c;

        public d(@NonNull ProtobufStateStorage protobufStateStorage, @NonNull ProtobufStateStorage protobufStateStorage2, @NonNull Y8 y82) {
            this.a = protobufStateStorage;
            this.b = protobufStateStorage2;
            this.c = y82;
        }

        @Override
        public void a(Context object) {
            object = (Z1)this.a.read();
            this.a.delete();
            if (object.b) {
                if (!A2.b(object.a)) {
                    object = new v3.a(object.a, u0.d);
                    object = new v3((v3.a)object, (List<v3.a>)Collections.singletonList((Object)object));
                    this.b.save(object);
                }
                this.c.h();
            }
        }
    }

    public static class e
    implements D1.a {
        @NonNull
        private final Td a;
        @NonNull
        private final ProtobufStateStorage b;
        @NonNull
        private final ProtobufStateStorage c;

        public e(@NonNull Context context, @NonNull ProtobufStateStorage protobufStateStorage, @NonNull ProtobufStateStorage protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new Td(context));
        }

        @VisibleForTesting
        public e(@NonNull ProtobufStateStorage protobufStateStorage, @NonNull ProtobufStateStorage protobufStateStorage2, @NonNull Td td) {
            this.b = protobufStateStorage;
            this.c = protobufStateStorage2;
            this.a = td;
        }

        @Override
        public void a(Context object) {
            object = (Xd)this.b.read();
            ArrayList arrayList = new ArrayList();
            Object object2 = object.e;
            if (object2 != u0.b) {
                arrayList.add(new Object(object.a, object.b, (u0)((Object)object2)){
                    @Nullable
                    public final String a;
                    @NonNull
                    public final JSONObject b;
                    @NonNull
                    public final u0 c;
                    {
                        this.a = string;
                        this.b = jSONObject;
                        this.c = u02;
                    }

                    public String toString() {
                        StringBuilder stringBuilder = z2.t("Candidate{trackingId='");
                        a.B(stringBuilder, this.a, '\'', ", additionalParams=");
                        stringBuilder.append((Object)this.b);
                        stringBuilder.append(", source=");
                        stringBuilder.append((Object)((Object)this.c));
                        stringBuilder.append('}');
                        return stringBuilder.toString();
                    }
                });
            }
            if (object.e == u0.e && (object2 = this.a.a()) != null) {
                arrayList.add(new /* invalid duplicate definition of identical inner class */);
            }
            object = new Nd((Xd)object, (List<Nd.a>)arrayList);
            this.c.save(object);
            this.b.delete();
        }
    }

    public static class f
    implements D1.a {
        @NonNull
        private final ProtobufStateStorage a;
        @NonNull
        private final ProtobufStateStorage b;
        @NonNull
        private final B0 c;

        public f(@NonNull ProtobufStateStorage protobufStateStorage, @NonNull ProtobufStateStorage protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new B0());
        }

        @VisibleForTesting
        public f(@NonNull ProtobufStateStorage protobufStateStorage, @NonNull ProtobufStateStorage protobufStateStorage2, @NonNull B0 b0) {
            this.a = protobufStateStorage;
            this.b = protobufStateStorage2;
            this.c = b0;
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(@NonNull Context context) {
            void var3_13;
            void var3_10;
            Object object = ca.a(context).h();
            List<ud> list = ((Q7)object).b();
            if (list != null) {
                this.a.save(list);
                ((Q7)object).a();
            }
            object = (di)this.b.read();
            di.b b4 = ((di)object).a(((di)object).r);
            Object var4_17 = null;
            try {
                File file = this.c.b(context.getFilesDir(), "credentials.dat");
                object = new JSONObject(L0.a(file));
            }
            catch (Throwable throwable) {
                object = null;
            }
            Object object2 = object;
            if (object == null) {
                Object object3 = object;
                if (FileUtils.needToUseNoBackup()) {
                    try {
                        File file = this.c.b(context.getNoBackupFilesDir(), "credentials.dat");
                        JSONObject jSONObject = new JSONObject(L0.a(file));
                    }
                    catch (Throwable throwable) {
                        Object object4 = object;
                    }
                }
            }
            if (var3_10 != null) {
                object = var3_10.optString("device_id", null);
                String string = var3_10.optString("device_id_hash", null);
            } else {
                Object var3_12 = null;
                object = var4_17;
            }
            if (!TextUtils.isEmpty((CharSequence)object)) {
                b4.c((String)object);
            }
            if (!TextUtils.isEmpty((CharSequence)var3_13)) {
                b4.d((String)var3_13);
            }
            b4.b(true);
            this.b.save(b4.a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }
    }

    public static class g
    implements D1.a {
        @NonNull
        private ProtobufStateStorage a;
        @NonNull
        private Z8 b;

        public g(@NonNull ProtobufStateStorage protobufStateStorage, @NonNull Z8 z82) {
            this.a = protobufStateStorage;
            this.b = z82;
        }

        @Override
        public void a(Context object) {
            object = this.b.g();
            this.a.save(object);
        }
    }

    public static class h
    implements D1.a {
        @NonNull
        private final ProtobufStateStorage a;
        @NonNull
        private final ProtobufStateStorage b;

        public h(@NonNull ProtobufStateStorage protobufStateStorage, @NonNull ProtobufStateStorage protobufStateStorage2) {
            this.a = protobufStateStorage;
            this.b = protobufStateStorage2;
        }

        @Override
        public void a(Context context) {
            context = (Collection)this.a.read();
            this.b.save(new md((List<ud>)new ArrayList((Collection)context), null, (List<String>)new ArrayList()));
        }
    }

    public static class i
    implements D1.a {
        @NonNull
        private final ProtobufStateStorage a;

        public i(@NonNull ProtobufStateStorage protobufStateStorage) {
            this.a = protobufStateStorage;
        }

        @Override
        public void a(Context object) {
            ProtobufStateStorage protobufStateStorage = this.a;
            object = (di)protobufStateStorage.read();
            protobufStateStorage.save(((di)object).a(((di)object).r).b(true).a());
        }
    }

    public static class j
    implements D1.a {
        private Id a;
        private Z8 b;

        public j(@NonNull Context context) {
            this.a = new Id(context);
            this.b = new Z8(ca.a(context).p(), context.getPackageName());
        }

        @Override
        public void a(Context context) {
            String string = this.a.b(null);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.b.i(string).d();
                Id.b(context);
            }
        }
    }

    public static class k
    implements D1.a {
        @Override
        public void a(Context object) {
            Fd fd = new Fd((Context)object, object.getPackageName());
            SharedPreferences sharedPreferences = com.yandex.metrica.impl.ob.b.a(object, "_boundentrypreferences");
            Kd kd = Fd.H;
            object = sharedPreferences.getString(kd.b(), null);
            Kd kd2 = Fd.I;
            long l4 = sharedPreferences.getLong(kd2.b(), -1L);
            if (object != null && l4 != -1L) {
                fd.a(new s.a((String)object, l4)).b();
                sharedPreferences.edit().remove(kd.b()).remove(kd2.b()).apply();
            }
        }
    }

    public static class l
    implements D1.a {
        @NonNull
        private final Y8 a;

        public l(@NonNull Y8 y82) {
            this.a = y82;
        }

        @Override
        public void a(Context object) {
            Object object2 = this.a;
            Object object3 = new Jd((Context)object, null);
            if (((Jd)object3).f()) {
                ((Y8)object2).d(true);
                ((Jd)object3).g();
            }
            object3 = this.a;
            object2 = new Hd((Context)object, object.getPackageName());
            long l4 = ((Hd)object2).a(0);
            if (l4 != 0L) {
                ((Y8)object3).l(l4);
            }
            ((Hd)object2).f();
            new Fd((Context)object, new W3(object.getPackageName(), null).b()).i().b();
            this.a.d();
            object = new Ad((Context)object);
            ((Ad)object).a();
            ((Ad)object).b();
        }
    }

    public static class m
    implements D1.a {
        @NonNull
        private final Y8 a;

        public m(@NonNull Y8 y82) {
            this.a = y82;
        }

        @Override
        public void a(Context context) {
            long l4 = new Z8((N7)ca.a((Context)context).q(), (String)context.getPackageName()).g().u;
            boolean bl2 = true;
            boolean bl3 = l4 > 0L;
            if (this.a.b(-1) <= 0L) {
                bl2 = false;
            }
            if (bl3 || bl2) {
                this.a.c(false).d();
            }
        }
    }

    public static class n
    implements D1.a {
        @Override
        public void a(Context object) {
            String string = ((Z8)(object = new Z8(ca.a((Context)object).q(), object.getPackageName()))).h(null);
            if (string != null) {
                ((Z8)object).b((List<String>)Collections.singletonList((Object)string));
            }
            if ((string = ((Z8)object).g(null)) != null) {
                ((Z8)object).a((List<String>)Collections.singletonList((Object)string));
            }
        }
    }

    public static class o
    implements D1.a {
        @NonNull
        private final B0 a;

        public o() {
            this(new B0());
        }

        @VisibleForTesting
        public o(@NonNull B0 b0) {
            this.a = b0;
        }

        @Override
        public void a(Context context) {
            File[] fileArray = this.b(context);
            for (File file : fileArray == null ? new File[]{} : this.b(context).listFiles(new FilenameFilter((Iterable<FilenameFilter>)Arrays.asList((Object[])new FilenameFilter[]{new FilenameFilter(new FilenameFilter(context.getPackageName()){
                private final String a;
                {
                    this.a = string;
                }

                public boolean accept(File file, String string) {
                    return string.contains((CharSequence)this.a) ^ true;
                }
            }){
                private final FilenameFilter a;
                {
                    this.a = filenameFilter;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                public boolean accept(File file, String string) {
                    String string2;
                    FilenameFilter filenameFilter;
                    if (!string.startsWith("db_metrica_")) return false;
                    try {
                        filenameFilter = this.a;
                        string2 = string;
                    }
                    catch (Throwable throwable) {
                        return false;
                    }
                    if (!string.endsWith("-journal")) return filenameFilter.accept(file, string2);
                    string2 = string.replace((CharSequence)"-journal", (CharSequence)"");
                    return filenameFilter.accept(file, string2);
                }
            }, new /* invalid duplicate definition of identical inner class */})){
                public final Iterable<FilenameFilter> a;
                {
                    this.a = iterable;
                }

                public boolean accept(File file, String string) {
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        if (!((FilenameFilter)iterator.next()).accept(file, string)) continue;
                        return true;
                    }
                    return false;
                }
            })) {
                if (file.delete()) continue;
                M0 m0 = bh.a();
                Object object = new JSONObject();
                object = object.put("fileName", (Object)file.getName()).toString();
                m0 = (ah)m0;
                try {
                    ((ah)m0).reportEvent("Can not delete file", (String)object);
                }
                catch (Throwable throwable) {
                    ((ah)bh.a()).reportError("Can not delete file", throwable);
                }
            }
            ((X8)new Z8(ca.a(context).q(), context.getPackageName()).f(new Kd("LAST_STARTUP_CLIDS_SAVE_TIME", null).a())).d();
        }

        @Nullable
        @VisibleForTesting
        public File b(@NonNull Context object) {
            object = A2.a(21) ? object.getNoBackupFilesDir() : ((object = object.getFilesDir()) != null ? this.a.b(object.getParentFile(), "databases") : null);
            return object;
        }
    }

    public static class p
    implements D1.a {
        @NonNull
        private final ProtobufStateStorage a;
        @NonNull
        private final Qi b;

        public p(@NonNull Context context, @NonNull ProtobufStateStorage protobufStateStorage) {
            this(protobufStateStorage, Ri.a(context).b(context, new Vi(new ci.b(context))));
        }

        @VisibleForTesting
        public p(@NonNull ProtobufStateStorage protobufStateStorage, @NonNull Qi qi) {
            this.a = protobufStateStorage;
            this.b = qi;
        }

        @Override
        public void a(Context object) {
            object = this.b.a().a;
            if (!TextUtils.isEmpty((CharSequence)object)) {
                di di2 = (di)this.a.read();
                if (!object.equals((Object)di2.a)) {
                    this.a.save(di2.a(di2.r).k((String)object).a());
                }
            }
        }
    }

    public static class q
    implements D1.a {
        @NonNull
        private final Y8 a;
        @NonNull
        private final ProtobufStateStorage b;
        @NonNull
        private final V7 c;
        @NonNull
        private final String d = new Kd("REFERRER_FROM_PLAY_SERVICES").a();
        @NonNull
        private final String e = new Kd("REFERRER_CHECKED").a();
        @NonNull
        private final String f = new Kd("L_ID").a();
        @NonNull
        private final String g = new Kd("LBS_ID").a();
        @NonNull
        private final String h = new Kd("L_REQ_NUM").a();

        public q(@NonNull Y8 y82, @NonNull ProtobufStateStorage protobufStateStorage) {
            this(y82, protobufStateStorage, F0.g().w().b());
        }

        @VisibleForTesting
        public q(@NonNull Y8 y82, @NonNull ProtobufStateStorage protobufStateStorage, @NonNull V7 v72) {
            this.a = y82;
            this.b = protobufStateStorage;
            this.c = v72;
        }

        @Override
        public void a(Context object) {
            int n2;
            di di2 = (di)this.b.read();
            Gd gd2 = new Gd((Context)object);
            int n3 = n2 = gd2.f();
            if (n2 == -1) {
                n3 = this.a.a(-1);
            }
            V7 v72 = this.c;
            String string = di2.b;
            String string2 = di2.c;
            String string3 = this.a.a(this.d, (String)null);
            object = this.a.c(this.e) ? Boolean.valueOf((boolean)this.a.a(this.e, false)) : null;
            di2 = this.a.c(this.f) ? Long.valueOf((long)this.a.a(this.f, -1L)) : null;
            Long l4 = this.a.c(this.g) ? Long.valueOf((long)this.a.a(this.g, -1L)) : null;
            Long l5 = this.a.c(this.h) ? Long.valueOf((long)this.a.a(this.h, -1L)) : null;
            Integer n5 = n3 == -1 ? null : Integer.valueOf((int)n3);
            v72.a(string, string2, string3, (Boolean)object, (Long)di2, l4, l5, n5);
            ((X8)((X8)((X8)((X8)((X8)this.a.j().f(this.d)).f(this.e)).f(this.f)).f(this.g)).f(this.h)).d();
            gd2.h().b();
        }
    }

    public static class r
    implements D1.a {
        @NonNull
        private final ProtobufStateStorage a;

        public r(@NonNull ProtobufStateStorage protobufStateStorage) {
            this.a = protobufStateStorage;
        }

        @Override
        public void a(Context object) {
            Nd nd2 = (Nd)this.a.read();
            ArrayList arrayList = new ArrayList();
            Iterator iterator = nd2.b.iterator();
            object = null;
            while (iterator.hasNext()) {
                Nd.a a2 = iterator.next();
                if (a2.c != u0.c) {
                    arrayList.add((Object)a2);
                    continue;
                }
                if (object != null) continue;
                arrayList.add((Object)a2);
                object = a2;
            }
            this.a.save(new Nd(nd2.a, (List<Nd.a>)arrayList));
        }
    }

    public static class s
    implements D1.a {
        @NonNull
        private final M7 a;

        public s(@NonNull M7 m7) {
            this.a = m7;
        }

        @Override
        public void a(Context context) {
            this.a.b("notification_cache_state");
        }
    }

    public static class t
    implements D1.a {
        private final Y8 a;

        public t(@NonNull Y8 y82) {
            this.a = y82;
        }

        @Override
        public void a(Context context) {
            ((X8)((X8)this.a.f(new Kd("REFERRER", null).a())).f(new Kd("REFERRER_HOLDER_STATE", null).a())).d();
        }
    }

    public static class u
    implements D1.a {
        @Override
        public void a(Context object) {
            object = Y9.b.a(di.class).b((Context)object);
            di di2 = (di)object.read();
            di.b b4 = di2.a(di2.r);
            boolean bl2 = di2.u > 0L;
            object.save(b4.a(bl2).b(true).a());
        }
    }
}

