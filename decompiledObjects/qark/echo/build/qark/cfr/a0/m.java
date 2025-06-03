/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package a0;

import H.c;
import a0.g;
import android.text.TextUtils;

public class m
implements g {
    public String a;
    public int b;
    public int c;

    public m(String string2, int n8, int n9) {
        this.a = string2;
        this.b = n8;
        this.c = n9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        if (this.b >= 0 && object.b >= 0) {
            if (TextUtils.equals((CharSequence)this.a, (CharSequence)object.a) && this.b == object.b && this.c == object.c) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals((CharSequence)this.a, (CharSequence)object.a) && this.c == object.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return c.b(this.a, this.c);
    }
}

