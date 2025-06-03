package R2;

import A2.AbstractC0328n;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0858a2;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.Y1 f5295a;

    /* renamed from: b, reason: collision with root package name */
    public Long f5296b;

    /* renamed from: c, reason: collision with root package name */
    public long f5297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b6 f5298d;

    public f6(b6 b6Var) {
        this.f5298d = b6Var;
    }

    public final com.google.android.gms.internal.measurement.Y1 a(String str, com.google.android.gms.internal.measurement.Y1 y12) {
        C0472a2 I6;
        String str2;
        Object obj;
        String b02 = y12.b0();
        List c02 = y12.c0();
        this.f5298d.o();
        Long l7 = (Long) N5.e0(y12, "_eid");
        boolean z7 = l7 != null;
        if (z7 && b02.equals("_ep")) {
            AbstractC0328n.i(l7);
            this.f5298d.o();
            b02 = (String) N5.e0(y12, "_en");
            if (TextUtils.isEmpty(b02)) {
                this.f5298d.j().I().b("Extra parameter without an event name. eventId", l7);
                return null;
            }
            if (this.f5295a == null || this.f5296b == null || l7.longValue() != this.f5296b.longValue()) {
                Pair L6 = this.f5298d.q().L(str, l7);
                if (L6 == null || (obj = L6.first) == null) {
                    this.f5298d.j().I().c("Extra parameter without existing main event. eventName, eventId", b02, l7);
                    return null;
                }
                this.f5295a = (com.google.android.gms.internal.measurement.Y1) obj;
                this.f5297c = ((Long) L6.second).longValue();
                this.f5298d.o();
                this.f5296b = (Long) N5.e0(this.f5295a, "_eid");
            }
            long j7 = this.f5297c - 1;
            this.f5297c = j7;
            if (j7 <= 0) {
                C0574p q7 = this.f5298d.q();
                q7.n();
                q7.j().K().b("Clearing complex main event info. appId", str);
                try {
                    q7.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e7) {
                    q7.j().G().b("Error clearing complex main event", e7);
                }
            } else {
                this.f5298d.q().j0(str, l7, this.f5297c, this.f5295a);
            }
            ArrayList arrayList = new ArrayList();
            for (C0858a2 c0858a2 : this.f5295a.c0()) {
                this.f5298d.o();
                if (N5.G(y12, c0858a2.c0()) == null) {
                    arrayList.add(c0858a2);
                }
            }
            if (arrayList.isEmpty()) {
                I6 = this.f5298d.j().I();
                str2 = "No unique parameters in main event. eventName";
                I6.b(str2, b02);
            } else {
                arrayList.addAll(c02);
                c02 = arrayList;
            }
        } else if (z7) {
            this.f5296b = l7;
            this.f5295a = y12;
            this.f5298d.o();
            Object e02 = N5.e0(y12, "_epc");
            long longValue = ((Long) (e02 != null ? e02 : 0L)).longValue();
            this.f5297c = longValue;
            if (longValue <= 0) {
                I6 = this.f5298d.j().I();
                str2 = "Complex event with zero extra param count. eventName";
                I6.b(str2, b02);
            } else {
                this.f5298d.q().j0(str, (Long) AbstractC0328n.i(l7), this.f5297c, y12);
            }
        }
        return (com.google.android.gms.internal.measurement.Y1) ((com.google.android.gms.internal.measurement.Y3) ((Y1.a) y12.x()).E(b02).J().D(c02).p());
    }
}
