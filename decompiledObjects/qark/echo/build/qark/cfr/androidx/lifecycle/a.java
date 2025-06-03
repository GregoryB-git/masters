/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {
    public static a c = new a();
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public final a a(Class class_, Method[] arrmethod) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final Method[] b(Class arrmethod) {
        try {
            arrmethod = arrmethod.getDeclaredMethods();
            return arrmethod;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", (Throwable)noClassDefFoundError);
        }
    }

    public a c(Class class_) {
        a a8 = (a)this.a.get((Object)class_);
        if (a8 != null) {
            return a8;
        }
        return this.a(class_, null);
    }

    public boolean d(Class class_) {
        Method[] arrmethod = (Method[])this.b.get((Object)class_);
        if (arrmethod != null) {
            return arrmethod.booleanValue();
        }
        arrmethod = this.b(class_);
        int n8 = arrmethod.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if ((n)arrmethod[i8].getAnnotation(n.class) == null) continue;
            this.a(class_, arrmethod);
            return true;
        }
        this.b.put((Object)class_, (Object)Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b b8, d.b b9, Class class_) {
        d.b b10 = (d.b)((Object)map.get((Object)b8));
        if (b10 != null && b9 != b10) {
            map = b8.b;
            b8 = new StringBuilder();
            b8.append("Method ");
            b8.append(map.getName());
            b8.append(" in ");
            b8.append(class_.getName());
            b8.append(" already declared with different @OnLifecycleEvent value: previous value ");
            b8.append((Object)b10);
            b8.append(", new value ");
            b8.append((Object)b9);
            throw new IllegalArgumentException(b8.toString());
        }
        if (b10 == null) {
            map.put((Object)b8, (Object)b9);
        }
    }

    public static class a {
        public final Map a;
        public final Map b;

        public a(Map map) {
            this.b = map;
            this.a = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                d.b b8 = (d.b)((Object)entry.getValue());
                List list = (List)this.a.get((Object)b8);
                map = list;
                if (list == null) {
                    map = new ArrayList();
                    this.a.put((Object)b8, (Object)map);
                }
                map.add(entry.getKey());
            }
        }

        public static void b(List list, h h8, d.b b8, Object object) {
            if (list != null) {
                for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                    ((b)list.get(i8)).a(h8, b8, object);
                }
            }
        }

        public void a(h h8, d.b b8, Object object) {
            a.b((List)this.a.get((Object)b8), h8, b8, object);
            a.b((List)this.a.get((Object)d.b.ON_ANY), h8, b8, object);
        }
    }

    public static final class b {
        public final int a;
        public final Method b;

        public b(int n8, Method method) {
            this.a = n8;
            this.b = method;
            method.setAccessible(true);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void a(h h8, d.b b8, Object object) {
            try {
                int n8 = this.a;
                if (n8 == 0) {
                    this.b.invoke(object, new Object[0]);
                    return;
                }
                if (n8 == 1) {
                    this.b.invoke(object, new Object[]{h8});
                    return;
                }
                if (n8 != 2) {
                    return;
                }
                this.b.invoke(object, new Object[]{h8, b8});
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException((Throwable)illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new RuntimeException("Failed to call observer method", invocationTargetException.getCause());
            }
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (this.a == object.a && this.b.getName().equals((Object)object.b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a * 31 + this.b.getName().hashCode();
        }
    }

}

