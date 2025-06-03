/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package x3;

import Q2.a;
import android.os.Bundle;
import java.util.Set;
import x3.a;
import x3.d;

public final class c
implements a.a {
    public final /* synthetic */ d a;

    public c(d d8) {
        this.a = d8;
    }

    @Override
    public final void a(String string2, String string3, Bundle bundle, long l8) {
        if (!this.a.a.contains((Object)string3)) {
            return;
        }
        string2 = new Bundle();
        string2.putString("events", a.b(string3));
        d.a(this.a).a(2, (Bundle)string2);
    }
}

