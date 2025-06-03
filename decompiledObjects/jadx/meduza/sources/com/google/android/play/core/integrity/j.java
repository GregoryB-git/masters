package com.google.android.play.core.integrity;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final k6.b a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new StandardIntegrityException(i10, null);
    }
}
