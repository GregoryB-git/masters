// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import A2.n;
import java.util.concurrent.atomic.AtomicReference;

public final class X1
{
    public static final AtomicReference b;
    public static final AtomicReference c;
    public static final AtomicReference d;
    public final W1 a;
    
    static {
        b = new AtomicReference();
        c = new AtomicReference();
        d = new AtomicReference();
    }
    
    public X1(final W1 a) {
        this.a = a;
    }
    
    public static String d(String s, final String[] array, final String[] array2, final AtomicReference atomicReference) {
        n.i(array);
        n.i(array2);
        n.i(atomicReference);
        final int length = array.length;
        final int length2 = array2.length;
        int i = 0;
        n.a(length == length2);
        Label_0091: {
            while (i < array.length) {
                final String obj = array[i];
                if (s == obj || (s != null && s.equals(obj))) {
                    break Label_0091;
                }
                ++i;
            }
            return s;
        }
        // monitorenter(atomicReference)
        while (true) {
            try {
                String[] newValue;
                if ((newValue = atomicReference.get()) == null) {
                    newValue = new String[array2.length];
                    atomicReference.set(newValue);
                }
                if (newValue[i] == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(array2[i]);
                    sb.append("(");
                    sb.append(array[i]);
                    sb.append(")");
                    newValue[i] = sb.toString();
                }
                s = newValue[i];
                // monitorexit(atomicReference)
                return s;
                // monitorexit(atomicReference)
                return s;
            }
            finally {}
            continue;
        }
    }
    
    public final String a(final I i) {
        final String s = null;
        if (i == null) {
            return null;
        }
        if (!this.a.a()) {
            return i.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(i.q);
        sb.append(",name=");
        sb.append(this.c(i.o));
        sb.append(",params=");
        final D p = i.p;
        String str;
        if (p == null) {
            str = s;
        }
        else if (!this.a.a()) {
            str = p.toString();
        }
        else {
            str = this.b(p.g());
        }
        sb.append(str);
        return sb.toString();
    }
    
    public final String b(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (final String s : ((BaseBundle)bundle).keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(this.f(s));
            sb.append("=");
            final Object value = ((BaseBundle)bundle).get(s);
            String str;
            if (value instanceof Bundle) {
                str = this.e(new Object[] { value });
            }
            else if (value instanceof Object[]) {
                str = this.e((Object[])value);
            }
            else if (value instanceof ArrayList) {
                str = this.e(((ArrayList)value).toArray());
            }
            else {
                str = String.valueOf(value);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }
    
    public final String c(final String s) {
        if (s == null) {
            return null;
        }
        if (!this.a.a()) {
            return s;
        }
        return d(s, r3.c, r3.a, X1.b);
    }
    
    public final String e(final Object[] array) {
        if (array == null) {
            return "[]";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int length = array.length, i = 0; i < length; ++i) {
            final Object obj = array[i];
            String str;
            if (obj instanceof Bundle) {
                str = this.b((Bundle)obj);
            }
            else {
                str = String.valueOf(obj);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public final String f(final String s) {
        if (s == null) {
            return null;
        }
        if (!this.a.a()) {
            return s;
        }
        return d(s, t3.b, t3.a, X1.c);
    }
    
    public final String g(final String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("experiment_id");
            sb.append("(");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
        return d(str, s3.b, s3.a, X1.d);
    }
}
