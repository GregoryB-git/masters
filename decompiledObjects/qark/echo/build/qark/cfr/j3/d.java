/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import c3.q;
import java.io.IOException;
import p3.C;
import p3.t;
import q3.k;

public final class d
implements q {
    public final SharedPreferences.Editor a;
    public final String b;

    /*
     * Enabled aggressive block sorting
     */
    public d(Context context, String string2, String string3) {
        if (string2 == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = string2;
        context = context.getApplicationContext();
        context = string3 == null ? PreferenceManager.getDefaultSharedPreferences((Context)context) : context.getSharedPreferences(string3, 0);
        this.a = context.edit();
    }

    @Override
    public void a(t t8) {
        if (this.a.putString(this.b, k.b(t8.f())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }

    @Override
    public void b(C c8) {
        if (this.a.putString(this.b, k.b(c8.f())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}

