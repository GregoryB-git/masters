package D3;

import android.os.Bundle;
import java.util.Locale;
import w3.InterfaceC2100a;

/* loaded from: classes.dex */
public class e implements InterfaceC2100a.b {

    /* renamed from: a, reason: collision with root package name */
    public F3.b f1257a;

    /* renamed from: b, reason: collision with root package name */
    public F3.b f1258b;

    public static void b(F3.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.t(str, bundle);
    }

    @Override // w3.InterfaceC2100a.b
    public void a(int i7, Bundle bundle) {
        String string;
        E3.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i7), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f1257a : this.f1258b, str, bundle);
    }

    public void d(F3.b bVar) {
        this.f1258b = bVar;
    }

    public void e(F3.b bVar) {
        this.f1257a = bVar;
    }
}
