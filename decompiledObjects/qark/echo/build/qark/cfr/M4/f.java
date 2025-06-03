/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.ClassCastException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package M4;

import F4.a;
import M4.g;
import android.os.Bundle;

public final class f {
    public static final a b = a.e();
    public final Bundle a;

    public f() {
        this(new Bundle());
    }

    public f(Bundle bundle) {
        this.a = (Bundle)bundle.clone();
    }

    public boolean a(String string2) {
        if (string2 != null && this.a.containsKey(string2)) {
            return true;
        }
        return false;
    }

    public g b(String string2) {
        if (!this.a(string2)) {
            return g.a();
        }
        try {
            g g8 = g.b((Object)((Boolean)this.a.get(string2)));
            return g8;
        }
        catch (ClassCastException classCastException) {
            b.b("Metadata key %s contains type other than boolean: %s", string2, classCastException.getMessage());
            return g.a();
        }
    }

    public g c(String string2) {
        if (!this.a(string2)) {
            return g.a();
        }
        Object object = this.a.get(string2);
        if (object == null) {
            return g.a();
        }
        if (object instanceof Float) {
            return g.e(((Float)object).doubleValue());
        }
        if (object instanceof Double) {
            return g.e((Object)((Double)object));
        }
        b.b("Metadata key %s contains type other than double: %s", string2);
        return g.a();
    }

    public final g d(String string2) {
        if (!this.a(string2)) {
            return g.a();
        }
        try {
            g g8 = g.b((Object)((Integer)this.a.get(string2)));
            return g8;
        }
        catch (ClassCastException classCastException) {
            b.b("Metadata key %s contains type other than int: %s", string2, classCastException.getMessage());
            return g.a();
        }
    }

    public g e(String object) {
        if ((object = this.d((String)object)).d()) {
            return g.e((long)((Integer)object.c()));
        }
        return g.a();
    }
}

