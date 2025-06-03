/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  java.io.Serializable
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 */
package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.a;
import androidx.activity.result.b;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public abstract class ActivityResultRegistry {
    public Random a = new Random();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final transient Map e = new HashMap();
    public final Map f = new HashMap();
    public final Bundle g = new Bundle();

    public final void a(int n8, String string2) {
        this.b.put((Object)n8, (Object)string2);
        this.c.put((Object)string2, (Object)n8);
    }

    public final boolean b(int n8, int n9, Intent intent) {
        String string2 = (String)this.b.get((Object)n8);
        if (string2 == null) {
            return false;
        }
        this.d(string2, n9, intent, (c)this.e.get((Object)string2));
        return true;
    }

    public final boolean c(int n8, Object object) {
        String string2 = (String)this.b.get((Object)n8);
        if (string2 == null) {
            return false;
        }
        Object object2 = (c)this.e.get((Object)string2);
        if (object2 != null && (object2 = object2.a) != null) {
            object2.a(object);
        } else {
            this.g.remove(string2);
            this.f.put((Object)string2, object);
        }
        return true;
    }

    public final void d(String string2, int n8, Intent intent, c c8) {
        b b8;
        if (c8 != null && (b8 = c8.a) != null) {
            b8.a(c8.b.c(n8, intent));
            return;
        }
        this.f.remove((Object)string2);
        this.g.putParcelable(string2, (Parcelable)new a(n8, intent));
    }

    public final int e() {
        int n8 = this.a.nextInt(2147418112);
        while (this.b.containsKey((Object)(n8 += 65536))) {
            n8 = this.a.nextInt(2147418112);
        }
        return n8;
    }

    public abstract void f(int var1, d.a var2, Object var3, w.b var4);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList arrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList arrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (arrayList2 != null) {
            if (arrayList == null) {
                return;
            }
            int n8 = arrayList2.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.a((Integer)arrayList.get(i8), (String)arrayList2.get(i8));
            }
            this.a = (Random)bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList((Collection)this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.values()));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)this.g.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", (Serializable)this.a);
    }

    public final androidx.activity.result.c i(final String string2, h object, final d.a a8, final b b8) {
        androidx.lifecycle.d d8 = object.g();
        if (!d8.b().c(d.c.r)) {
            final int n8 = this.k(string2);
            d d9 = (d)this.d.get((Object)string2);
            object = d9;
            if (d9 == null) {
                object = new d(d8);
            }
            object.a(new f(){

                @Override
                public void a(h object, d.b b82) {
                    if (d.b.ON_START.equals((Object)b82)) {
                        ActivityResultRegistry.this.e.put((Object)string2, (Object)new c(b8, a8));
                        if (ActivityResultRegistry.this.f.containsKey((Object)string2)) {
                            object = ActivityResultRegistry.this.f.get((Object)string2);
                            ActivityResultRegistry.this.f.remove((Object)string2);
                            b8.a(object);
                        }
                        if ((object = (a)ActivityResultRegistry.this.g.getParcelable(string2)) != null) {
                            ActivityResultRegistry.this.g.remove(string2);
                            b8.a(a8.c(object.b(), object.a()));
                            return;
                        }
                    } else {
                        if (d.b.ON_STOP.equals((Object)b82)) {
                            ActivityResultRegistry.this.e.remove((Object)string2);
                            return;
                        }
                        if (d.b.ON_DESTROY.equals((Object)b82)) {
                            ActivityResultRegistry.this.l(string2);
                        }
                    }
                }
            });
            this.d.put((Object)string2, object);
            return new androidx.activity.result.c(){

                @Override
                public void b(Object object, w.b b8) {
                    ActivityResultRegistry.this.f(n8, a8, object, b8);
                }

                @Override
                public void c() {
                    ActivityResultRegistry.this.l(string2);
                }
            };
        }
        string2 = new StringBuilder();
        string2.append("LifecycleOwner ");
        string2.append(object);
        string2.append(" is attempting to register while current state is ");
        string2.append((Object)((Object)d8.b()));
        string2.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(string2.toString());
    }

    public final androidx.activity.result.c j(final String string2, final d.a a8, b b8) {
        Object object;
        final int n8 = this.k(string2);
        this.e.put((Object)string2, (Object)new c(b8, a8));
        if (this.f.containsKey((Object)string2)) {
            object = this.f.get((Object)string2);
            this.f.remove((Object)string2);
            b8.a(object);
        }
        if ((object = (a)this.g.getParcelable(string2)) != null) {
            this.g.remove(string2);
            b8.a(a8.c(object.b(), object.a()));
        }
        return new androidx.activity.result.c(){

            @Override
            public void b(Object object, w.b b8) {
                ActivityResultRegistry.this.f(n8, a8, object, b8);
            }

            @Override
            public void c() {
                ActivityResultRegistry.this.l(string2);
            }
        };
    }

    public final int k(String string2) {
        Integer n8 = (Integer)this.c.get((Object)string2);
        if (n8 != null) {
            return n8;
        }
        int n9 = this.e();
        this.a(n9, string2);
        return n9;
    }

    public final void l(String string2) {
        Object object = (Integer)this.c.remove((Object)string2);
        if (object != null) {
            this.b.remove(object);
        }
        this.e.remove((Object)string2);
        if (this.f.containsKey((Object)string2)) {
            object = new StringBuilder();
            object.append("Dropping pending result for request ");
            object.append(string2);
            object.append(": ");
            object.append(this.f.get((Object)string2));
            Log.w((String)"ActivityResultRegistry", (String)object.toString());
            this.f.remove((Object)string2);
        }
        if (this.g.containsKey(string2)) {
            object = new StringBuilder();
            object.append("Dropping pending result for request ");
            object.append(string2);
            object.append(": ");
            object.append((Object)this.g.getParcelable(string2));
            Log.w((String)"ActivityResultRegistry", (String)object.toString());
            this.g.remove(string2);
        }
        if ((object = (d)this.d.get((Object)string2)) != null) {
            object.b();
            this.d.remove((Object)string2);
        }
    }

    public static class c {
        public final b a;
        public final d.a b;

        public c(b b8, d.a a8) {
            this.a = b8;
            this.b = a8;
        }
    }

    public static class d {
        public final androidx.lifecycle.d a;
        public final ArrayList b;

        public d(androidx.lifecycle.d d8) {
            this.a = d8;
            this.b = new ArrayList();
        }

        public void a(f f8) {
            this.a.a(f8);
            this.b.add((Object)f8);
        }

        public void b() {
            for (f f8 : this.b) {
                this.a.c(f8);
            }
            this.b.clear();
        }
    }

}

