package R2;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class K5 implements U5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D5 f4881a;

    public K5(D5 d52) {
        this.f4881a = d52;
    }

    @Override // R2.U5
    public final void r(String str, String str2, Bundle bundle) {
        N2 n22;
        N2 n23;
        if (!TextUtils.isEmpty(str)) {
            this.f4881a.e().D(new J5(this, str, str2, bundle));
            return;
        }
        n22 = this.f4881a.f4618l;
        if (n22 != null) {
            n23 = this.f4881a.f4618l;
            n23.j().G().b("AppId not known when logging event", str2);
        }
    }
}
