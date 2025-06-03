package b6;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Set;
import k6.a;

/* loaded from: classes.dex */
public final class c implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final c f1911b = new c(new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f1912a;

    public /* synthetic */ c(Bundle bundle) {
        this.f1912a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = this.f1912a;
        Bundle bundle2 = ((c) obj).f1912a;
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
        } else if (bundle.size() == bundle2.size()) {
            Set<String> keySet = bundle.keySet();
            if (keySet.containsAll(bundle2.keySet())) {
                for (String str : keySet) {
                    if (!m6.h.a(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1912a});
    }
}
