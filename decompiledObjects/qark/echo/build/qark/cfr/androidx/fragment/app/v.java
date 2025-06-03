/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Modifier
 *  java.util.ArrayList
 */
package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class v {
    public final j a;
    public final ClassLoader b;
    public ArrayList c = new ArrayList();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j = true;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public boolean r = false;
    public ArrayList s;

    public v(j j8, ClassLoader classLoader) {
        this.a = j8;
        this.b = classLoader;
    }

    public v b(int n8, Fragment fragment, String string2) {
        this.j(n8, fragment, string2, 1);
        return this;
    }

    public v c(ViewGroup viewGroup, Fragment fragment, String string2) {
        fragment.U = viewGroup;
        return this.b(viewGroup.getId(), fragment, string2);
    }

    public v d(Fragment fragment, String string2) {
        this.j(0, fragment, string2, 1);
        return this;
    }

    public void e(a a8) {
        this.c.add((Object)a8);
        a8.c = this.d;
        a8.d = this.e;
        a8.e = this.f;
        a8.f = this.g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public v i() {
        if (!this.i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void j(int n8, Fragment fragment, String string2, int n9) {
        Object object = fragment.getClass();
        int n10 = object.getModifiers();
        if (!object.isAnonymousClass() && Modifier.isPublic((int)n10) && (!object.isMemberClass() || Modifier.isStatic((int)n10))) {
            if (string2 != null) {
                object = fragment.M;
                if (object != null && !string2.equals(object)) {
                    object = new StringBuilder();
                    object.append("Can't change tag of fragment ");
                    object.append((Object)fragment);
                    object.append(": was ");
                    object.append(fragment.M);
                    object.append(" now ");
                    object.append(string2);
                    throw new IllegalStateException(object.toString());
                }
                fragment.M = string2;
            }
            if (n8 != 0) {
                if (n8 != -1) {
                    n10 = fragment.K;
                    if (n10 != 0 && n10 != n8) {
                        string2 = new StringBuilder();
                        string2.append("Can't change container ID of fragment ");
                        string2.append((Object)fragment);
                        string2.append(": was ");
                        string2.append(fragment.K);
                        string2.append(" now ");
                        string2.append(n8);
                        throw new IllegalStateException(string2.toString());
                    }
                    fragment.K = n8;
                    fragment.L = n8;
                } else {
                    object = new StringBuilder();
                    object.append("Can't add fragment ");
                    object.append((Object)fragment);
                    object.append(" with tag ");
                    object.append(string2);
                    object.append(" to container view with no id");
                    throw new IllegalArgumentException(object.toString());
                }
            }
            this.e(new a(n9, fragment));
            return;
        }
        fragment = new StringBuilder();
        fragment.append("Fragment ");
        fragment.append(object.getCanonicalName());
        fragment.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(fragment.toString());
    }

    public v k(Fragment fragment) {
        this.e(new a(3, fragment));
        return this;
    }

    public v l(boolean bl) {
        this.r = bl;
        return this;
    }

    public static final class a {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public d.c g;
        public d.c h;

        public a() {
        }

        public a(int n8, Fragment object) {
            this.a = n8;
            this.b = object;
            this.g = object = d.c.s;
            this.h = object;
        }
    }

}

