package R2;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.InterfaceC0874c0;
import com.google.android.gms.internal.measurement.y7;

/* renamed from: R2.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0625w2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0874c0 f5570o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f5571p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0604t2 f5572q;

    public RunnableC0625w2(ServiceConnectionC0604t2 serviceConnectionC0604t2, InterfaceC0874c0 interfaceC0874c0, ServiceConnection serviceConnection) {
        this.f5572q = serviceConnectionC0604t2;
        this.f5570o = interfaceC0874c0;
        this.f5571p = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C0472a2 G6;
        String str2;
        ServiceConnectionC0604t2 serviceConnectionC0604t2 = this.f5572q;
        C0611u2 c0611u2 = serviceConnectionC0604t2.f5539b;
        str = serviceConnectionC0604t2.f5538a;
        InterfaceC0874c0 interfaceC0874c0 = this.f5570o;
        ServiceConnection serviceConnection = this.f5571p;
        Bundle a7 = c0611u2.a(str, interfaceC0874c0);
        c0611u2.f5547a.e().n();
        c0611u2.f5547a.Q();
        if (a7 != null) {
            long j7 = a7.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j7 == 0) {
                G6 = c0611u2.f5547a.j().L();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a7.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    G6 = c0611u2.f5547a.j().G();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    c0611u2.f5547a.j().K().b("InstallReferrer API result", string);
                    Bundle D7 = c0611u2.f5547a.L().D(Uri.parse("?" + string), y7.a() && c0611u2.f5547a.z().s(K.f4777F0), H6.a() && c0611u2.f5547a.z().s(K.f4820a1));
                    if (D7 == null) {
                        G6 = c0611u2.f5547a.j().G();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = D7.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j8 = a7.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j8 == 0) {
                                G6 = c0611u2.f5547a.j().G();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                D7.putLong("click_timestamp", j8);
                            }
                        }
                        if (j7 == c0611u2.f5547a.F().f5389f.a()) {
                            c0611u2.f5547a.j().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c0611u2.f5547a.p()) {
                            c0611u2.f5547a.F().f5389f.b(j7);
                            c0611u2.f5547a.j().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            D7.putString("_cis", "referrer API v2");
                            c0611u2.f5547a.H().Y("auto", "_cmp", D7, str);
                        }
                    }
                }
            }
            G6.a(str2);
        }
        if (serviceConnection != null) {
            D2.b.b().c(c0611u2.f5547a.a(), serviceConnection);
        }
    }
}
