/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package E1;

import E1.m;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class l {
    public static final a g = new a(null);
    public static l h;
    public static final AtomicBoolean i;
    public final Class a;
    public final Class b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;

    static {
        i = new AtomicBoolean(false);
    }

    public l(Class class_, Class class_2, Method method, Method method2, Method method3, Method method4) {
        Intrinsics.checkNotNullParameter((Object)class_, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter((Object)class_2, "builderClazz");
        Intrinsics.checkNotNullParameter((Object)method, "newBuilderMethod");
        Intrinsics.checkNotNullParameter((Object)method2, "setTypeMethod");
        Intrinsics.checkNotNullParameter((Object)method3, "setSkusListMethod");
        Intrinsics.checkNotNullParameter((Object)method4, "buildMethod");
        this.a = class_;
        this.b = class_2;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = i;
            return atomicBoolean;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            l l8 = h;
            return l8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(l l8) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            h = l8;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, l.class);
            return;
        }
    }

    public final Object d(String object, List list) {
        block8 : {
            block7 : {
                Object object2;
                block6 : {
                    if (T1.a.d(this)) {
                        return null;
                    }
                    try {
                        object2 = m.a;
                        object2 = m.e(this.a, this.c, null, new Object[0]);
                        if (object2 != null) break block6;
                        return null;
                    }
                    catch (Throwable throwable) {
                        T1.a.b(throwable, this);
                        return null;
                    }
                }
                object = m.e(this.b, this.d, object2, object);
                if (object != null) break block7;
                return null;
            }
            object = m.e(this.b, this.e, object, new Object[]{list});
            if (object != null) break block8;
            return null;
        }
        object = m.e(this.b, this.f, object, new Object[0]);
        return object;
    }

    public final Class e() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Class class_ = this.a;
            return class_;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a() {
            Class class_ = m.a("com.android.billingclient.api.SkuDetailsParams");
            Class class_2 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (class_ != null) {
                if (class_2 == null) {
                    return;
                }
                Method method = m.d(class_, "newBuilder", new Class[0]);
                Method method2 = m.d(class_2, "setType", String.class);
                Method method3 = m.d(class_2, "setSkusList", List.class);
                Method method4 = m.d(class_2, "build", new Class[0]);
                if (method != null && method2 != null && method3 != null) {
                    if (method4 == null) {
                        return;
                    }
                    l.c(new l(class_, class_2, method, method2, method3, method4));
                }
            }
        }

        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            this.a();
            l.a().set(true);
            return l.b();
        }
    }

}

