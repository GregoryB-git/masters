// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.os.Bundle;
import D2.b;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.y7;
import android.net.Uri;
import android.content.ServiceConnection;
import com.google.android.gms.internal.measurement.c0;

public final class w2 implements Runnable
{
    public final /* synthetic */ c0 o;
    public final /* synthetic */ ServiceConnection p;
    public final /* synthetic */ t2 q;
    
    public w2(final t2 q, final c0 o, final ServiceConnection p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        final t2 q = this.q;
        final u2 b = q.b;
        final String a = t2.a(q);
        final c0 o = this.o;
        final ServiceConnection p = this.p;
        final Bundle a2 = b.a(a, o);
        b.a.e().n();
        b.a.Q();
        Label_0508: {
            if (a2 != null) {
                final long n = ((BaseBundle)a2).getLong("install_begin_timestamp_seconds", 0L) * 1000L;
                a2 a3 = null;
                String s = null;
                Label_0103: {
                    if (n == 0L) {
                        a3 = b.a.j().L();
                        s = "Service response is missing Install Referrer install timestamp";
                    }
                    else {
                        final String string = ((BaseBundle)a2).getString("install_referrer");
                        if (string != null && !string.isEmpty()) {
                            b.a.j().K().b("InstallReferrer API result", string);
                            final S5 l = b.a.L();
                            final StringBuilder sb = new StringBuilder("?");
                            sb.append(string);
                            final Bundle d = l.D(Uri.parse(sb.toString()), y7.a() && b.a.z().s(K.F0), H6.a() && b.a.z().s(K.a1));
                            if (d == null) {
                                a3 = b.a.j().G();
                                s = "No campaign params defined in Install Referrer result";
                            }
                            else {
                                final String string2 = ((BaseBundle)d).getString("medium");
                                if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                    final long n2 = ((BaseBundle)a2).getLong("referrer_click_timestamp_seconds", 0L) * 1000L;
                                    if (n2 == 0L) {
                                        a3 = b.a.j().G();
                                        s = "Install Referrer is missing click timestamp for ad campaign";
                                        break Label_0103;
                                    }
                                    ((BaseBundle)d).putLong("click_timestamp", n2);
                                }
                                if (n == b.a.F().f.a()) {
                                    b.a.j().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                                }
                                if (b.a.p()) {
                                    b.a.F().f.b(n);
                                    b.a.j().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                    ((BaseBundle)d).putString("_cis", "referrer API v2");
                                    b.a.H().Y("auto", "_cmp", d, a);
                                }
                                break Label_0508;
                            }
                        }
                        else {
                            a3 = b.a.j().G();
                            s = "No referrer defined in Install Referrer response";
                        }
                    }
                }
                a3.a(s);
            }
        }
        if (p != null) {
            D2.b.b().c(b.a.a(), p);
        }
    }
}
