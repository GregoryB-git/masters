package j6;

import android.content.Intent;

/* loaded from: classes.dex */
public final class h extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f8497a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8498b;

    public h(int i10, Intent intent) {
        super("Google Play Services not available");
        this.f8497a = intent;
        this.f8498b = i10;
    }
}
