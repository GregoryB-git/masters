/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import A2.n;
import R2.D;
import R2.I;
import R2.W1;
import R2.r3;
import R2.s3;
import R2.t3;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class X1 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final W1 a;

    public X1(W1 w12) {
        this.a = w12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String d(String object, String[] arrstring, String[] arrstring2, AtomicReference atomicReference) {
        StringBuilder stringBuilder;
        n.i(arrstring);
        n.i(arrstring2);
        n.i((Object)atomicReference);
        int n8 = arrstring.length;
        int n9 = arrstring2.length;
        int n10 = 0;
        boolean bl = n8 == n9;
        n.a(bl);
        do {
            if (n10 >= arrstring.length) {
                return object;
            }
            stringBuilder = arrstring[n10];
            if (object == stringBuilder || object != null && object.equals((Object)stringBuilder)) break;
            ++n10;
        } while (true);
        synchronized (atomicReference) {
            Throwable throwable2;
            block8 : {
                try {
                    stringBuilder = (StringBuilder)atomicReference.get();
                    object = stringBuilder;
                    if (stringBuilder != null) break block8;
                    object = new String[arrstring2.length];
                    atomicReference.set(object);
                }
                catch (Throwable throwable2) {}
            }
            if (object[n10] == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(arrstring2[n10]);
                stringBuilder.append("(");
                stringBuilder.append(arrstring[n10]);
                stringBuilder.append(")");
                object[n10] = stringBuilder.toString();
            }
            object = object[n10];
            return object;
            throw throwable2;
        }
    }

    public final String a(I object) {
        Object var2_2 = null;
        if (object == null) {
            return null;
        }
        if (!this.a.a()) {
            return object.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("origin=");
        stringBuilder.append(object.q);
        stringBuilder.append(",name=");
        stringBuilder.append(this.c(object.o));
        stringBuilder.append(",params=");
        object = object.p;
        object = object == null ? var2_2 : (!this.a.a() ? object.toString() : this.b(object.g()));
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bundle[{");
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) {
            Object object = (String)iterator.next();
            if (stringBuilder.length() != 8) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.f((String)object));
            stringBuilder.append("=");
            object = bundle.get((String)object);
            object = object instanceof Bundle ? this.e(new Object[]{object}) : (object instanceof Object[] ? this.e((Object[])object) : (object instanceof ArrayList ? this.e(((ArrayList)object).toArray()) : String.valueOf((Object)object)));
            stringBuilder.append((String)object);
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    public final String c(String string2) {
        if (string2 == null) {
            return null;
        }
        if (!this.a.a()) {
            return string2;
        }
        return X1.d(string2, r3.c, r3.a, b);
    }

    public final String e(Object[] arrobject) {
        if (arrobject == null) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Object object : arrobject) {
            object = object instanceof Bundle ? this.b((Bundle)object) : String.valueOf((Object)object);
            if (object == null) continue;
            if (stringBuilder.length() != 1) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String)object);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final String f(String string2) {
        if (string2 == null) {
            return null;
        }
        if (!this.a.a()) {
            return string2;
        }
        return X1.d(string2, t3.b, t3.a, c);
    }

    public final String g(String string2) {
        if (string2 == null) {
            return null;
        }
        if (!this.a.a()) {
            return string2;
        }
        if (string2.startsWith("_exp_")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("experiment_id");
            stringBuilder.append("(");
            stringBuilder.append(string2);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        return X1.d(string2, s3.b, s3.a, d);
    }
}

