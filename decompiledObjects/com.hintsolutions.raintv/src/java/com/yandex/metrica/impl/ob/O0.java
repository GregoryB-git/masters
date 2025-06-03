/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.n0;
import java.util.Map;

public class o0 {
    private boolean a;
    @Nullable
    private DeferredDeeplinkListener b;
    @Nullable
    private DeferredDeeplinkParametersListener c;
    @Nullable
    private n0 d;

    public o0(boolean bl) {
        this.a = bl;
    }

    private void a() {
        Object object = this.d;
        if (object != null) {
            Object object2 = object.b;
            if (object2 != null) {
                object = this.b;
                if (object != null) {
                    object.onDeeplinkLoaded((String)object2);
                    this.b = null;
                }
                if (!A2.b(this.d.a)) {
                    object = this.d.a;
                    object2 = this.c;
                    if (object2 != null) {
                        object2.onParametersLoaded((Map<String, String>)object);
                        this.c = null;
                    }
                } else {
                    this.a(com.yandex.metrica.impl.ob.o0$a.b, this.d.c);
                }
            } else if (object.c != null) {
                this.a(com.yandex.metrica.impl.ob.o0$a.b);
            } else {
                this.a(com.yandex.metrica.impl.ob.o0$a.c);
            }
        }
    }

    private void a(@NonNull a a2) {
        Object object = this.d;
        String string = object == null ? null : object.c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.b;
        if (deferredDeeplinkListener != null) {
            int n4 = a2.ordinal();
            object = n4 != 0 ? (n4 != 1 ? (n4 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER) : DeferredDeeplinkListener.Error.PARSE_ERROR) : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            String string2 = string == null ? "" : string;
            deferredDeeplinkListener.onError((DeferredDeeplinkListener.Error)((Object)object), string2);
            this.b = null;
        }
        this.a(a2, string);
    }

    private void a(@NonNull a enum_, @Nullable String string) {
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.c;
        if (deferredDeeplinkParametersListener != null) {
            int n4 = enum_.ordinal();
            enum_ = n4 != 0 ? (n4 != 1 ? (n4 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER) : DeferredDeeplinkParametersListener.Error.PARSE_ERROR) : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            String string2 = string;
            if (string == null) {
                string2 = "";
            }
            deferredDeeplinkParametersListener.onError((DeferredDeeplinkParametersListener.Error)enum_, string2);
            this.c = null;
        }
    }

    public void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.b = deferredDeeplinkListener;
        if (this.a) {
            this.a(com.yandex.metrica.impl.ob.o0$a.a);
        } else {
            this.a();
        }
    }

    public void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.c = deferredDeeplinkParametersListener;
        if (this.a) {
            this.a(com.yandex.metrica.impl.ob.o0$a.a);
        } else {
            this.a();
        }
    }

    public void a(@Nullable n0 n02) {
        this.d = n02;
        this.a();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a;
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        private static final a[] d;

        static {
            a a2;
            a a3;
            a a5;
            a = a5 = new a();
            b = a3 = new a();
            c = a2 = new a();
            d = new a[]{a5, a3, a2};
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])d.clone();
        }
    }
}

