// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.BaseBundle;
import android.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.net.Uri$Builder;
import android.content.ComponentName;
import android.net.Uri;

public final class e0
{
    public static final Uri f;
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;
    
    static {
        f = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }
    
    public e0(final String a, final String b, final int d, final boolean e) {
        n.e(a);
        this.a = a;
        n.e(b);
        this.b = b;
        this.c = null;
        this.d = d;
        this.e = e;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final ComponentName b() {
        return this.c;
    }
    
    public final Intent c(final Context context) {
        if (this.a == null) {
            return new Intent().setComponent(this.c);
        }
        final boolean e = this.e;
        Intent intent = null;
        final Intent intent2 = null;
        if (e) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("serviceActionBundleKey", this.a);
            Bundle call;
            try {
                call = context.getContentResolver().call(e0.f, "serviceIntentCall", (String)null, bundle);
            }
            catch (IllegalArgumentException ex) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(ex.toString()));
                call = null;
            }
            Intent intent3;
            if (call == null) {
                intent3 = intent2;
            }
            else {
                intent3 = (Intent)call.getParcelable("serviceResponseIntentKey");
            }
            intent = intent3;
            if (intent3 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a)));
                intent = intent3;
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.a).setPackage(this.b);
    }
    
    public final String d() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0)) {
            return false;
        }
        final e0 e0 = (e0)o;
        return m.a(this.a, e0.a) && m.a(this.b, e0.b) && m.a(this.c, e0.c) && this.d == e0.d && this.e == e0.e;
    }
    
    @Override
    public final int hashCode() {
        return m.b(this.a, this.b, this.c, this.d, this.e);
    }
    
    @Override
    public final String toString() {
        String s;
        if ((s = this.a) == null) {
            n.i(this.c);
            s = this.c.flattenToString();
        }
        return s;
    }
}
