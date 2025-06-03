/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package R2;

import A2.n;
import R2.D5;
import R2.G2;
import R2.K;
import R2.P1;
import R2.R2;
import R2.W5;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.p;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.g7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class k3
implements Callable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ R2 q;

    public k3(R2 r22, W5 w52, Bundle bundle) {
        this.q = r22;
        this.o = w52;
        this.p = bundle;
    }

    public final /* synthetic */ Object call() {
        R2.o(this.q).o0();
        D5 d52 = R2.o(this.q);
        W5 w52 = this.o;
        long[] arrl = this.p;
        d52.e().n();
        if (g7.a() && d52.c0().B(w52.o, K.L0) && w52.o != null) {
            if (arrl != null) {
                int[] arrn = arrl.getIntArray("uriSources");
                arrl = arrl.getLongArray("uriTimestamps");
                if (arrn != null) {
                    if (arrl != null && arrl.length == arrn.length) {
                        for (int i8 = 0; i8 < arrn.length; ++i8) {
                            p p8 = d52.e0();
                            String string2 = w52.o;
                            int n8 = arrn[i8];
                            long l8 = arrl[i8];
                            n.e(string2);
                            p8.n();
                            p8.u();
                            try {
                                int n9 = p8.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{string2, String.valueOf((int)n8), String.valueOf((long)l8)});
                                a2 a22 = p8.j().K();
                                StringBuilder stringBuilder = new StringBuilder("Pruned ");
                                stringBuilder.append(n9);
                                stringBuilder.append(" trigger URIs. appId, source, timestamp");
                                a22.d(stringBuilder.toString(), string2, n8, l8);
                                continue;
                            }
                            catch (SQLiteException sQLiteException) {
                                p8.j().G().c("Error pruning trigger URIs. appId", Y1.v(string2), (Object)sQLiteException);
                            }
                        }
                    } else {
                        d52.j().G().a("Uri sources and timestamps do not match");
                    }
                }
            }
            return d52.e0().K0(w52.o);
        }
        return new ArrayList();
    }
}

