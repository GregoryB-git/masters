package R2;

import A2.AbstractC0328n;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import x2.AbstractC2202p;

/* loaded from: classes.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f4695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4696b;

    public H2(Context context, String str) {
        AbstractC0328n.i(context);
        this.f4695a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f4696b = a(context);
        } else {
            this.f4696b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC2202p.f21194a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f4695a.getIdentifier(str, "string", this.f4696b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f4695a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
