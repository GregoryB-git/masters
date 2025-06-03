package nc;

import android.content.ContentValues;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpl;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 implements q1.a, e7.l0 {

    /* renamed from: b, reason: collision with root package name */
    public static g0 f11496b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11497a;

    public g0() {
        this.f11497a = 2;
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(ub.e eVar) {
        Object a10;
        if (eVar instanceof sc.g) {
            return eVar.toString();
        }
        try {
            a10 = eVar + '@' + b(eVar);
        } catch (Throwable th) {
            a10 = rb.f.a(th);
        }
        if (rb.e.a(a10) != null) {
            a10 = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) a10;
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // q1.a
    public final void a(u1.c cVar) {
        cVar.m("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        cVar.H("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    @Override // e7.l0
    public final Object zza() {
        switch (this.f11497a) {
            case 3:
                List<e7.m0<?>> list = e7.h0.f4230a;
                return Boolean.valueOf(zzoy.zzj());
            case 4:
                List<e7.m0<?>> list2 = e7.h0.f4230a;
                return Integer.valueOf((int) zznu.zzar());
            case 5:
                List<e7.m0<?>> list3 = e7.h0.f4230a;
                return zznu.zzbg();
            case 6:
                List<e7.m0<?>> list4 = e7.h0.f4230a;
                return Long.valueOf(zznu.zzaa());
            case 7:
                List<e7.m0<?>> list5 = e7.h0.f4230a;
                return Long.valueOf(zznu.zzr());
            case 8:
                List<e7.m0<?>> list6 = e7.h0.f4230a;
                return Long.valueOf(zznu.zzg());
            case 9:
                List<e7.m0<?>> list7 = e7.h0.f4230a;
                return Long.valueOf(zzot.zzd());
            case 10:
                List<e7.m0<?>> list8 = e7.h0.f4230a;
                return Long.valueOf(zznu.zzaj());
            case 11:
                List<e7.m0<?>> list9 = e7.h0.f4230a;
                return zznu.zzbb();
            case 12:
                List<e7.m0<?>> list10 = e7.h0.f4230a;
                return Integer.valueOf((int) zznu.zzag());
            case 13:
                List<e7.m0<?>> list11 = e7.h0.f4230a;
                return Integer.valueOf((int) zznu.zzu());
            case 14:
                List<e7.m0<?>> list12 = e7.h0.f4230a;
                return Integer.valueOf((int) zznu.zzax());
            default:
                List<e7.m0<?>> list13 = e7.h0.f4230a;
                return Boolean.valueOf(zzpl.zzf());
        }
    }

    public /* synthetic */ g0(int i10) {
        this.f11497a = i10;
    }
}
