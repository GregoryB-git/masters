/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.D1;
import com.yandex.metrica.impl.ob.Ed;
import com.yandex.metrica.impl.ob.Gd;
import com.yandex.metrica.impl.ob.Kd;
import com.yandex.metrica.impl.ob.L0;
import com.yandex.metrica.impl.ob.U0;
import com.yandex.metrica.impl.ob.V8;
import com.yandex.metrica.impl.ob.W0;
import com.yandex.metrica.impl.ob.X8;
import com.yandex.metrica.impl.ob.ca;

public class O
extends D1 {
    private final V8 a;

    public O(@NonNull Context context) {
        this(new V8(ca.a(context).d()));
    }

    @VisibleForTesting
    public O(V8 v8) {
        this.a = v8;
    }

    public static /* synthetic */ V8 a(O o3) {
        return o3.a;
    }

    @Override
    public int a(Gd gd) {
        return (int)this.a.b(-1L);
    }

    @Override
    public SparseArray<D1.a> a() {
        return new SparseArray<D1.a>(this){
            public final O a;
            {
                this.a = o3;
                this.put(47, new c(O.a(o3)));
                this.put(66, new d(o3, O.a(o3)));
                this.put(89, new b(O.a(o3)));
                this.put(99, new e(O.a(o3)));
                this.put(105, new f(O.a(o3)));
            }
        };
    }

    @Override
    public void a(Gd gd, int n2) {
        this.a.e(n2);
        gd.g().b();
    }

    public static class b
    implements D1.a {
        private final V8 a;

        public b(V8 v8) {
            this.a = v8;
        }

        @NonNull
        private W0 a(@Nullable String string2) {
            boolean bl = TextUtils.isEmpty((CharSequence)string2);
            U0 u02 = bl ? U0.g : U0.b;
            String string3 = bl ? "no identifier saved in previous version" : null;
            return new W0(string2, u02, string3);
        }

        @Override
        public void a(Context object) {
            String string2 = this.a.l(null);
            String string3 = this.a.n(null);
            object = this.a.m(null);
            String string4 = this.a.g((String)null);
            String string5 = this.a.h((String)null);
            String string6 = this.a.j((String)null);
            this.a.e(this.a(string2));
            this.a.i(this.a(string3));
            this.a.d(this.a((String)object));
            this.a.a(this.a(string4));
            this.a.b(this.a(string5));
            this.a.h(this.a(string6));
        }
    }

    public static class c
    implements D1.a {
        private V8 a;

        public c(V8 v8) {
            this.a = v8;
        }

        private boolean a(String string2, String string3) {
            boolean bl = !TextUtils.isEmpty((CharSequence)string2) && TextUtils.isEmpty((CharSequence)string3);
            return bl;
        }

        @Override
        public void a(Context object) {
            if (!(A2.b(((Ed)(object = new Ed((Context)object))).g()) || this.a.n(null) != null && this.a.l(null) != null)) {
                String string2 = ((Ed)object).e(null);
                if (this.a(string2, this.a.l(null))) {
                    this.a.s(string2);
                }
                if (this.a(string2 = ((Ed)object).f(null), this.a.n(null))) {
                    this.a.t(string2);
                }
                if (this.a(string2 = ((Ed)object).b(null), this.a.g((String)null))) {
                    this.a.o(string2);
                }
                if (this.a(string2 = ((Ed)object).c(null), this.a.h((String)null))) {
                    this.a.p(string2);
                }
                if (this.a(string2 = ((Ed)object).d(null), this.a.j((String)null))) {
                    this.a.q(string2);
                }
                long l4 = ((Ed)object).a(-1L);
                long l6 = this.a.d(-1L);
                boolean bl = l4 != -1L && l6 == -1L;
                if (bl) {
                    this.a.h(l4);
                }
                this.a.d();
                ((Ed)object).f().b();
            }
        }
    }

    public class d
    implements D1.a {
        private final V8 a;

        public d(O o3, V8 v8) {
            this.a = v8;
        }

        @Override
        public void a(Context context) {
            this.a.f(new Kd("COOKIE_BROWSERS", null).a());
            this.a.f(new Kd("BIND_ID_URL", null).a());
            L0.a(context, "b_meta.dat");
            L0.a(context, "browsers.dat");
        }
    }

    public static class e
    implements D1.a {
        private final V8 a;

        public e(@NonNull V8 v8) {
            this.a = v8;
        }

        @Override
        public void a(Context context) {
            ((X8)this.a.f(new Kd("DEVICE_ID_POSSIBLE", null).a())).d();
        }
    }

    public static class f
    implements D1.a {
        private final V8 a;

        public f(@NonNull V8 v8) {
            this.a = v8;
        }

        @Override
        public void a(Context context) {
            ((X8)this.a.f(new Kd("STARTUP_REQUEST_TIME", null).a())).d();
        }
    }
}

