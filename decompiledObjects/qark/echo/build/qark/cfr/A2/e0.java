/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.m;
import A2.n;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

public final class e0 {
    public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public e0(String string2, String string3, int n8, boolean bl) {
        n.e(string2);
        this.a = string2;
        n.e(string3);
        this.b = string3;
        this.c = null;
        this.d = n8;
        this.e = bl;
    }

    public final int a() {
        return this.d;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final Intent c(Context context) {
        if (this.a != null) {
            boolean bl = this.e;
            Bundle bundle = null;
            Object var4_5 = null;
            if (bl) {
                bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.a);
                try {
                    context = context.getContentResolver().call(f, "serviceIntentCall", null, bundle);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    Log.w((String)"ConnectionStatusConfig", (String)"Dynamic intent resolution failed: ".concat(illegalArgumentException.toString()));
                    context = null;
                }
                context = context == null ? var4_5 : (Intent)context.getParcelable("serviceResponseIntentKey");
                bundle = context;
                if (context == null) {
                    Log.w((String)"ConnectionStatusConfig", (String)"Dynamic lookup for intent failed for action: ".concat(String.valueOf((Object)this.a)));
                    bundle = context;
                }
            }
            if (bundle != null) {
                return bundle;
            }
            return new Intent(this.a).setPackage(this.b);
        }
        return new Intent().setComponent(this.c);
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e0)) {
            return false;
        }
        object = (e0)object;
        if (m.a(this.a, object.a) && m.a(this.b, object.b) && m.a((Object)this.c, (Object)object.c) && this.d == object.d && this.e == object.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return m.b(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        String string2;
        String string3 = string2 = this.a;
        if (string2 == null) {
            n.i((Object)this.c);
            string3 = this.c.flattenToString();
        }
        return string3;
    }
}

