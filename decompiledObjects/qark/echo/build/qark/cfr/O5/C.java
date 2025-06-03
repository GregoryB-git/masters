/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package O5;

import androidx.lifecycle.LiveData;

public class C
extends LiveData {
    public static C l;

    public static C k() {
        if (l == null) {
            l = new C();
        }
        return l;
    }

    public void l(String string2) {
        this.h(string2);
    }
}

