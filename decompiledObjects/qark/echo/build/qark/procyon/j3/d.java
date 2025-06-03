// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j3;

import p3.C;
import java.io.IOException;
import q3.k;
import p3.t;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.Context;
import android.content.SharedPreferences$Editor;
import c3.q;

public final class d implements q
{
    public final SharedPreferences$Editor a;
    public final String b;
    
    public d(Context applicationContext, final String b, final String s) {
        if (b != null) {
            this.b = b;
            applicationContext = applicationContext.getApplicationContext();
            SharedPreferences sharedPreferences;
            if (s == null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            }
            else {
                sharedPreferences = applicationContext.getSharedPreferences(s, 0);
            }
            this.a = sharedPreferences.edit();
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
    
    @Override
    public void a(final t t) {
        if (this.a.putString(this.b, k.b(t.f())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
    
    @Override
    public void b(final C c) {
        if (this.a.putString(this.b, k.b(c.f())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}
