/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package j5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j5.a;
import j5.d;
import j5.e;
import j5.i;
import j5.l;
import j5.n;
import java.util.Map;

public class m {
    public static final d e = d.q;
    public static final l f = l.q;
    public final d a;
    public final l b;
    public final d c;
    public final l d;

    public m(SharedPreferences object, Map object2) {
        d d8 = e;
        this.a = d.valueOf(object.getString("FlutterSecureSAlgorithmKey", d8.name()));
        l l8 = f;
        this.b = l.valueOf(object.getString("FlutterSecureSAlgorithmStorage", l8.name()));
        d d9 = d.valueOf(this.b((Map)object2, "keyCipherAlgorithm", d8.name()));
        int n8 = d9.p;
        int n9 = Build.VERSION.SDK_INT;
        object = d8;
        if (n8 <= n9) {
            object = d9;
        }
        this.c = object;
        object2 = l.valueOf(this.b((Map)object2, "storageCipherAlgorithm", l8.name()));
        object = l8;
        if (object2.p <= n9) {
            object = object2;
        }
        this.d = object;
    }

    public i a(Context context) {
        a a8 = this.c.o.a(context);
        return this.d.o.a(context, a8);
    }

    public final String b(Map object, String string2, String string3) {
        if ((object = object.get((Object)string2)) != null) {
            string3 = object.toString();
        }
        return string3;
    }

    public i c(Context context) {
        a a8 = this.a.o.a(context);
        return this.b.o.a(context, a8);
    }

    public void d(SharedPreferences.Editor editor) {
        editor.remove("FlutterSecureSAlgorithmKey");
        editor.remove("FlutterSecureSAlgorithmStorage");
    }

    public boolean e() {
        if (this.a == this.c && this.b == this.d) {
            return false;
        }
        return true;
    }

    public void f(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.d.name());
    }
}

