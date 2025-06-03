package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import c3.InterfaceC0839q;
import java.io.IOException;
import p3.C1794C;
import p3.t;
import q3.AbstractC1895k;

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374d implements InterfaceC0839q {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f15454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15455b;

    public C1374d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f15455b = str;
        Context applicationContext = context.getApplicationContext();
        this.f15454a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // c3.InterfaceC0839q
    public void a(t tVar) {
        if (!this.f15454a.putString(this.f15455b, AbstractC1895k.b(tVar.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // c3.InterfaceC0839q
    public void b(C1794C c1794c) {
        if (!this.f15454a.putString(this.f15455b, AbstractC1895k.b(c1794c.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
