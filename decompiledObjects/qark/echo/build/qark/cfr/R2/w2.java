/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R2;

import D2.b;
import R2.C3;
import R2.G2;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S5;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l2;
import R2.q2;
import R2.t2;
import R2.u2;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.y7;

public final class w2
implements Runnable {
    public final /* synthetic */ c0 o;
    public final /* synthetic */ ServiceConnection p;
    public final /* synthetic */ t2 q;

    public w2(t2 t22, c0 c02, ServiceConnection serviceConnection) {
        this.q = t22;
        this.o = c02;
        this.p = serviceConnection;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        ServiceConnection serviceConnection;
        block3 : {
            Object object;
            Object object2;
            block5 : {
                block6 : {
                    long l8;
                    S5 s52;
                    block8 : {
                        long l9;
                        block9 : {
                            String string2;
                            block7 : {
                                block4 : {
                                    object = this.q;
                                    u2 u22 = object.b;
                                    object = t2.a((t2)object);
                                    object2 = this.o;
                                    serviceConnection = this.p;
                                    object2 = u22.a((String)object, (c0)object2);
                                    u22.a.e().n();
                                    u22.a.Q();
                                    if (object2 == null) break block3;
                                    l8 = object2.getLong("install_begin_timestamp_seconds", 0L) * 1000L;
                                    if (l8 != 0L) break block4;
                                    object = u22.a.j().L();
                                    object2 = "Service response is missing Install Referrer install timestamp";
                                    break block5;
                                }
                                string2 = object2.getString("install_referrer");
                                if (string2 == null || string2.isEmpty()) break block6;
                                u22.a.j().K().b("InstallReferrer API result", string2);
                                s52 = u22.a.L();
                                StringBuilder stringBuilder = new StringBuilder("?");
                                stringBuilder.append(string2);
                                string2 = Uri.parse((String)stringBuilder.toString());
                                boolean bl = y7.a() && u22.a.z().s(K.F0);
                                boolean bl2 = H6.a() && u22.a.z().s(K.a1);
                                s52 = s52.D((Uri)string2, bl, bl2);
                                if (s52 != null) break block7;
                                object = u22.a.j().G();
                                object2 = "No campaign params defined in Install Referrer result";
                                break block5;
                            }
                            string2 = s52.getString("medium");
                            if (string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) break block8;
                            l9 = object2.getLong("referrer_click_timestamp_seconds", 0L) * 1000L;
                            if (l9 != 0L) break block9;
                            object = u22.a.j().G();
                            object2 = "Install Referrer is missing click timestamp for ad campaign";
                            break block5;
                        }
                        s52.putLong("click_timestamp", l9);
                    }
                    if (l8 == u22.a.F().f.a()) {
                        u22.a.j().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                    }
                    if (u22.a.p()) {
                        u22.a.F().f.b(l8);
                        u22.a.j().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                        s52.putString("_cis", "referrer API v2");
                        u22.a.H().Y("auto", "_cmp", (Bundle)s52, (String)object);
                    }
                    break block3;
                }
                object = u22.a.j().G();
                object2 = "No referrer defined in Install Referrer response";
            }
            object.a((String)object2);
        }
        if (serviceConnection != null) {
            b.b().c(u22.a.a(), serviceConnection);
        }
    }
}

