// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class v
{
    public final j a;
    public final ClassLoader b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public boolean r;
    public ArrayList s;
    
    public v(final j a, final ClassLoader b) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = a;
        this.b = b;
    }
    
    public v b(final int n, final Fragment fragment, final String s) {
        this.j(n, fragment, s, 1);
        return this;
    }
    
    public v c(final ViewGroup u, final Fragment fragment, final String s) {
        fragment.U = u;
        return this.b(((View)u).getId(), fragment, s);
    }
    
    public v d(final Fragment fragment, final String s) {
        this.j(0, fragment, s, 1);
        return this;
    }
    
    public void e(final a e) {
        this.c.add(e);
        e.c = this.d;
        e.d = this.e;
        e.e = this.f;
        e.f = this.g;
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
    
    public void j(final int l, final Fragment obj, final String str, final int n) {
        final Class<? extends Fragment> class1 = obj.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                final String m = obj.M;
                if (m != null && !str.equals(m)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(obj);
                    sb.append(": was ");
                    sb.append(obj.M);
                    sb.append(" now ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                obj.M = str;
            }
            if (l != 0) {
                if (l == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't add fragment ");
                    sb2.append(obj);
                    sb2.append(" with tag ");
                    sb2.append(str);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int k = obj.K;
                if (k != 0 && k != l) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(obj);
                    sb3.append(": was ");
                    sb3.append(obj.K);
                    sb3.append(" now ");
                    sb3.append(l);
                    throw new IllegalStateException(sb3.toString());
                }
                obj.K = l;
                obj.L = l;
            }
            this.e(new a(n, obj));
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(class1.getCanonicalName());
        sb4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(sb4.toString());
    }
    
    public v k(final Fragment fragment) {
        this.e(new a(3, fragment));
        return this;
    }
    
    public v l(final boolean r) {
        this.r = r;
        return this;
    }
    
    public static final class a
    {
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
        
        public a(final int a, final Fragment b) {
            this.a = a;
            this.b = b;
            final d.c s = d.c.s;
            this.g = s;
            this.h = s;
        }
    }
}
