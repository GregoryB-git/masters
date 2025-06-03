/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package O5;

import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.T;

public class B
extends LiveData {
    public static B l;

    public static B k() {
        if (l == null) {
            l = new B();
        }
        return l;
    }

    public void l(T t8) {
        this.h(t8);
    }
}

