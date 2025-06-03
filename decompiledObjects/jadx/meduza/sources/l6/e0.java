package l6;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import m6.h;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f9671a;

    /* renamed from: b, reason: collision with root package name */
    public final j6.d f9672b;

    public /* synthetic */ e0(a aVar, j6.d dVar) {
        this.f9671a = aVar;
        this.f9672b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e0)) {
            e0 e0Var = (e0) obj;
            if (m6.h.a(this.f9671a, e0Var.f9671a) && m6.h.a(this.f9672b, e0Var.f9672b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9671a, this.f9672b});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a(this.f9671a, Constants.KEY);
        aVar.a(this.f9672b, "feature");
        return aVar.toString();
    }
}
