package R2;

import A2.AbstractC0328n;
import android.content.SharedPreferences;

/* renamed from: R2.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590r2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5508b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5509c;

    /* renamed from: d, reason: collision with root package name */
    public String f5510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0549l2 f5511e;

    public C0590r2(C0549l2 c0549l2, String str, String str2) {
        this.f5511e = c0549l2;
        AbstractC0328n.e(str);
        this.f5507a = str;
        this.f5508b = null;
    }

    public final String a() {
        if (!this.f5509c) {
            this.f5509c = true;
            this.f5510d = this.f5511e.F().getString(this.f5507a, null);
        }
        return this.f5510d;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f5511e.F().edit();
        edit.putString(this.f5507a, str);
        edit.apply();
        this.f5510d = str;
    }
}
