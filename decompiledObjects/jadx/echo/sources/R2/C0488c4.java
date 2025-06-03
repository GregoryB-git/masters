package R2;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: R2.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488c4 implements U5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3 f5236a;

    public C0488c4(C3 c32) {
        this.f5236a = c32;
    }

    @Override // R2.U5
    public final void r(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f5236a.y0("auto", str2, bundle);
        } else {
            this.f5236a.Y("auto", str2, bundle, str);
        }
    }
}
