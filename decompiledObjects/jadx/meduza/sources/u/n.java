package u;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f14807a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f14808b;

    /* renamed from: c, reason: collision with root package name */
    public final z[] f14809c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14810d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14811e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14812g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public int f14813h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f14814i;

    /* renamed from: j, reason: collision with root package name */
    public PendingIntent f14815j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14816k;

    public n(int i10, String str, PendingIntent pendingIntent) {
        this(i10 != 0 ? IconCompat.d(null, "", i10) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
    }

    public n(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, z[] zVarArr, z[] zVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f14811e = true;
        this.f14808b = iconCompat;
        if (iconCompat != null) {
            int i11 = iconCompat.f942a;
            if ((i11 == -1 ? IconCompat.a.c(iconCompat.f943b) : i11) == 2) {
                this.f14813h = iconCompat.e();
            }
        }
        this.f14814i = q.b(charSequence);
        this.f14815j = pendingIntent;
        this.f14807a = bundle == null ? new Bundle() : bundle;
        this.f14809c = zVarArr;
        this.f14810d = z10;
        this.f = i10;
        this.f14811e = z11;
        this.f14812g = z12;
        this.f14816k = z13;
    }
}
