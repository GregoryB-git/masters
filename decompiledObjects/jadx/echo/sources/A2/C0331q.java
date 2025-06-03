package A2;

import android.content.Context;
import android.content.res.Resources;
import x2.AbstractC2202p;

/* renamed from: A2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0331q {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f532b;

    public C0331q(Context context) {
        AbstractC0328n.i(context);
        Resources resources = context.getResources();
        this.f531a = resources;
        this.f532b = resources.getResourcePackageName(AbstractC2202p.f21194a);
    }

    public String a(String str) {
        int identifier = this.f531a.getIdentifier(str, "string", this.f532b);
        if (identifier == 0) {
            return null;
        }
        return this.f531a.getString(identifier);
    }
}
