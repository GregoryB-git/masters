package A2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Uri f461f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f463b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentName f464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f465d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f466e;

    public e0(String str, String str2, int i7, boolean z7) {
        AbstractC0328n.e(str);
        this.f462a = str;
        AbstractC0328n.e(str2);
        this.f463b = str2;
        this.f464c = null;
        this.f465d = i7;
        this.f466e = z7;
    }

    public final int a() {
        return this.f465d;
    }

    public final ComponentName b() {
        return this.f464c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f462a == null) {
            return new Intent().setComponent(this.f464c);
        }
        if (this.f466e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f462a);
            try {
                bundle = context.getContentResolver().call(f461f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e7) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e7.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f462a)));
            }
        }
        return r2 != null ? r2 : new Intent(this.f462a).setPackage(this.f463b);
    }

    public final String d() {
        return this.f463b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC0327m.a(this.f462a, e0Var.f462a) && AbstractC0327m.a(this.f463b, e0Var.f463b) && AbstractC0327m.a(this.f464c, e0Var.f464c) && this.f465d == e0Var.f465d && this.f466e == e0Var.f466e;
    }

    public final int hashCode() {
        return AbstractC0327m.b(this.f462a, this.f463b, this.f464c, Integer.valueOf(this.f465d), Boolean.valueOf(this.f466e));
    }

    public final String toString() {
        String str = this.f462a;
        if (str != null) {
            return str;
        }
        AbstractC0328n.i(this.f464c);
        return this.f464c.flattenToString();
    }
}
