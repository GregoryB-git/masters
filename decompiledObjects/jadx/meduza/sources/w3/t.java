package w3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements l.a, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16226b;

    public /* synthetic */ t(Object obj, boolean z10) {
        this.f16226b = obj;
        this.f16225a = z10;
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        ((b) obj).h();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Context context = (Context) this.f16226b;
        boolean z10 = this.f16225a;
        SharedPreferences.Editor edit = aa.y.a(context).edit();
        edit.putBoolean("proxy_retention", z10);
        edit.apply();
    }
}
