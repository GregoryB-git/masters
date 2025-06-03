// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class a
{
    public static a c;
    public final Map a;
    public final Map b;
    
    static {
        a.c = new a();
    }
    
    public a() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public final a a(final Class clazz, final Method[] array) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final Method[] b(final Class clazz) {
        try {
            return clazz.getDeclaredMethods();
        }
        catch (NoClassDefFoundError cause) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", cause);
        }
    }
    
    public a c(final Class clazz) {
        final a a = this.a.get(clazz);
        if (a != null) {
            return a;
        }
        return this.a(clazz, null);
    }
    
    public boolean d(final Class clazz) {
        final Boolean b = this.b.get(clazz);
        if (b != null) {
            return b;
        }
        final Method[] b2 = this.b(clazz);
        for (int length = b2.length, i = 0; i < length; ++i) {
            if (b2[i].getAnnotation(n.class) != null) {
                this.a(clazz, b2);
                return true;
            }
        }
        this.b.put(clazz, Boolean.FALSE);
        return false;
    }
    
    public final void e(final Map map, final b b, final d.b obj, final Class clazz) {
        final d.b obj2 = map.get(b);
        if (obj2 != null && obj != obj2) {
            final Method b2 = b.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(b2.getName());
            sb.append(" in ");
            sb.append(clazz.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(obj2);
            sb.append(", new value ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        if (obj2 == null) {
            map.put(b, obj);
        }
    }
    
    public static class a
    {
        public final Map a;
        public final Map b;
        
        public a(final Map b) {
            this.b = b;
            this.a = new HashMap();
            for (final Map.Entry<K, d.b> entry : b.entrySet()) {
                final d.b b2 = entry.getValue();
                Object o;
                if ((o = this.a.get(b2)) == null) {
                    o = new ArrayList<Object>();
                    this.a.put(b2, o);
                }
                ((List<K>)o).add(entry.getKey());
            }
        }
        
        public static void b(final List list, final h h, final d.b b, final Object o) {
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; --i) {
                    list.get(i).a(h, b, o);
                }
            }
        }
        
        public void a(final h h, final d.b b, final Object o) {
            b(this.a.get(b), h, b, o);
            b(this.a.get(d.b.ON_ANY), h, b, o);
        }
    }
    
    public static final class b
    {
        public final int a;
        public final Method b;
        
        public b(final int a, final Method b) {
            this.a = a;
            (this.b = b).setAccessible(true);
        }
        
        public void a(final h h, final d.b b, final Object obj) {
            while (true) {
                try {
                    final int a = this.a;
                    if (a == 0) {
                        this.b.invoke(obj, new Object[0]);
                        return;
                    }
                    if (a == 1) {
                        this.b.invoke(obj, h);
                        return;
                    }
                    if (a != 2) {
                        return;
                    }
                    this.b.invoke(obj, h, b);
                    return;
                    final InvocationTargetException ex;
                    throw new RuntimeException("Failed to call observer method", ex.getCause());
                }
                catch (IllegalAccessException ex3) {}
                catch (InvocationTargetException ex2) {}
                final InvocationTargetException ex2;
                final InvocationTargetException ex = ex2;
                continue;
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a == b.a && this.b.getName().equals(b.b.getName());
        }
        
        @Override
        public int hashCode() {
            return this.a * 31 + this.b.getName().hashCode();
        }
    }
}
