/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.K2;
import t.h;

public final class F2
implements K2 {
    public final h a;

    public F2(h h8) {
        this.a = h8;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final String a(Uri object, String string2, String string3, String string4) {
        if (object != null) {
            string2 = object.toString();
        } else if (string2 == null) {
            return null;
        }
        object = (h)this.a.get(string2);
        if (object == null) {
            return null;
        }
        string2 = string4;
        if (string3 != null) {
            string2 = new StringBuilder();
            string2.append(string3);
            string2.append(string4);
            string2 = string2.toString();
        }
        return (String)object.get(string2);
    }
}

