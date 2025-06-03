/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.m;
import A2.w;
import A2.x;
import android.os.Bundle;
import y2.a;

public class u
implements a.d {
    public static final u b = u.a().a();
    public final String a;

    public /* synthetic */ u(String string2, x x8) {
        this.a = string2;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String string2 = this.a;
        if (string2 != null) {
            bundle.putString("api", string2);
        }
        return bundle;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        return m.a(this.a, object.a);
    }

    public final int hashCode() {
        return m.b(this.a);
    }

    public static class a {
        public String a;

        public /* synthetic */ a(w w8) {
        }

        public u a() {
            return new u(this.a, null);
        }
    }

}

