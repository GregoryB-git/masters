package w2;

import V2.C0660k;
import android.os.Bundle;
import android.util.Log;

/* renamed from: w2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2098t {

    /* renamed from: a, reason: collision with root package name */
    public final int f20363a;

    /* renamed from: b, reason: collision with root package name */
    public final C0660k f20364b = new C0660k();

    /* renamed from: c, reason: collision with root package name */
    public final int f20365c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f20366d;

    public AbstractC2098t(int i7, int i8, Bundle bundle) {
        this.f20363a = i7;
        this.f20365c = i8;
        this.f20366d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(C2099u c2099u) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c2099u);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f20364b.b(c2099u);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f20364b.c(obj);
    }

    public final String toString() {
        int i7 = this.f20365c;
        int i8 = this.f20363a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i7);
        sb.append(" id=");
        sb.append(i8);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
