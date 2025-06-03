/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 *  android.util.Pair
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package R2;

import A2.n;
import R2.N5;
import R2.Y1;
import R2.a2;
import R2.b;
import R2.b6;
import R2.p;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.Y3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f6 {
    public com.google.android.gms.internal.measurement.Y1 a;
    public Long b;
    public long c;
    public final /* synthetic */ b6 d;

    public f6(b6 b62) {
        this.d = b62;
    }

    public /* synthetic */ f6(b6 b62, b b8) {
        this(b62);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final com.google.android.gms.internal.measurement.Y1 a(String var1_1, com.google.android.gms.internal.measurement.Y1 var2_3) {
        var7_4 = var2_3.b0();
        var9_5 = var2_3.c0();
        this.d.o();
        var10_6 = (Long)N5.e0(var2_3, "_eid");
        var3_7 = var10_6 != null;
        if (!var3_7 || !var7_4.equals((Object)"_ep")) ** GOTO lbl46
        n.i((Object)var10_6);
        this.d.o();
        var6_8 = (String)N5.e0(var2_3, "_en");
        if (TextUtils.isEmpty((CharSequence)var6_8)) {
            this.d.j().I().b("Extra parameter without an event name. eventId", (Object)var10_6);
            return null;
        }
        if (this.a != null && this.b != null && var10_6.longValue() == this.b.longValue()) ** GOTO lbl20
        var7_4 = this.d.q().L(var1_1, var10_6);
        if (var7_4 != null && (var8_9 = var7_4.first) != null) {
            this.a = (com.google.android.gms.internal.measurement.Y1)var8_9;
            this.c = (Long)var7_4.second;
            this.d.o();
            this.b = (Long)N5.e0(this.a, "_eid");
lbl20: // 2 sources:
            this.c = var4_10 = this.c - 1L;
            if (var4_10 <= 0L) {
                var7_4 = this.d.q();
                var7_4.n();
                var7_4.j().K().b("Clearing complex main event info. appId", var1_1);
                try {
                    var7_4.B().execSQL("delete from main_event_params where app_id=?", (Object[])new String[]{var1_1});
                }
                catch (SQLiteException var1_2) {
                    var7_4.j().G().b("Error clearing complex main event", (Object)var1_2);
                }
            } else {
                this.d.q().j0(var1_1, var10_6, this.c, this.a);
            }
            var8_9 = new ArrayList();
            for (Object var7_4 : this.a.c0()) {
                this.d.o();
                if (N5.G(var2_3, var7_4.c0()) != null) continue;
                var8_9.add(var7_4);
            }
            if (!var8_9.isEmpty()) {
                var8_9.addAll((Collection)var9_5);
                return (com.google.android.gms.internal.measurement.Y1)((Y3)((Y1.a)var2_3.x()).E((String)var6_8).J().D((Iterable)var8_9).p());
            }
            var7_4 = this.d.j().I();
            var1_1 = "No unique parameters in main event. eventName";
        } else {
            this.d.j().I().c("Extra parameter without existing main event. eventName, eventId", var6_8, (Object)var10_6);
            return null;
lbl46: // 1 sources:
            var6_8 = var7_4;
            var8_9 = var9_5;
            if (var3_7 == false) return (com.google.android.gms.internal.measurement.Y1)((Y3)((Y1.a)var2_3.x()).E((String)var6_8).J().D((Iterable)var8_9).p());
            this.b = var10_6;
            this.a = var2_3;
            this.d.o();
            var6_8 = 0L;
            var8_9 = N5.e0(var2_3, "_epc");
            if (var8_9 != null) {
                var6_8 = var8_9;
            }
            this.c = var4_11 = ((Long)var6_8).longValue();
            if (var4_11 > 0L) {
                this.d.q().j0(var1_1, (Long)n.i((Object)var10_6), this.c, var2_3);
                var8_9 = var9_5;
                var6_8 = var7_4;
                return (com.google.android.gms.internal.measurement.Y1)((Y3)((Y1.a)var2_3.x()).E((String)var6_8).J().D((Iterable)var8_9).p());
            }
            var8_9 = this.d.j().I();
            var1_1 = "Complex event with zero extra param count. eventName";
            var6_8 = var7_4;
            var7_4 = var8_9;
        }
        var7_4.b(var1_1, var6_8);
        var8_9 = var9_5;
        return (com.google.android.gms.internal.measurement.Y1)((Y3)((Y1.a)var2_3.x()).E((String)var6_8).J().D((Iterable)var8_9).p());
    }
}

