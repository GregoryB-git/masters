package a;

import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpl;
import e7.h0;
import e7.l0;
import e7.m0;
import java.util.List;
import u1.c;

/* loaded from: classes.dex */
public final class a implements q1.a, l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1a;

    public /* synthetic */ a() {
        this.f1a = 0;
    }

    public /* synthetic */ a(int i10) {
        this.f1a = i10;
    }

    @Override // q1.a
    public void a(c cVar) {
        cVar.m("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // e7.l0
    public Object zza() {
        switch (this.f1a) {
            case 2:
                return Boolean.valueOf(zzoy.zze());
            case 3:
                List<m0<?>> list = h0.f4230a;
                return Boolean.valueOf(zzoy.zzk());
            case 4:
                List<m0<?>> list2 = h0.f4230a;
                return Boolean.valueOf(zzoy.zzb());
            case 5:
                List<m0<?>> list3 = h0.f4230a;
                return Integer.valueOf((int) zznu.zzat());
            case 6:
                List<m0<?>> list4 = h0.f4230a;
                return Integer.valueOf((int) zznu.zzaw());
            case 7:
                List<m0<?>> list5 = h0.f4230a;
                return Boolean.valueOf(zzob.zzb());
            case 8:
                List<m0<?>> list6 = h0.f4230a;
                return Long.valueOf(zznu.zzae());
            case 9:
                List<m0<?>> list7 = h0.f4230a;
                return Long.valueOf(zznu.zzab());
            case 10:
                List<m0<?>> list8 = h0.f4230a;
                return Long.valueOf(zznu.zzba());
            case 11:
                List<m0<?>> list9 = h0.f4230a;
                return Long.valueOf(zznu.zzs());
            case 12:
                List<m0<?>> list10 = h0.f4230a;
                return Long.valueOf(zznu.zzam());
            case 13:
                List<m0<?>> list11 = h0.f4230a;
                return Long.valueOf(zznu.zzav());
            case 14:
                List<m0<?>> list12 = h0.f4230a;
                return Integer.valueOf((int) zznu.zzm());
            case 15:
                List<m0<?>> list13 = h0.f4230a;
                return Boolean.valueOf(zznp.zzb());
            case 16:
                List<m0<?>> list14 = h0.f4230a;
                return Double.valueOf(zzot.zza());
            case 17:
                List<m0<?>> list15 = h0.f4230a;
                return Integer.valueOf((int) zznu.zzj());
            case 18:
                List<m0<?>> list16 = h0.f4230a;
                return Integer.valueOf((int) zznu.zzc());
            case 19:
                List<m0<?>> list17 = h0.f4230a;
                return Integer.valueOf((int) zznu.zzq());
            case 20:
                List<m0<?>> list18 = h0.f4230a;
                return zznu.zzbi();
            case 21:
                List<m0<?>> list19 = h0.f4230a;
                return zznu.zzbm();
            case 22:
                List<m0<?>> list20 = h0.f4230a;
                return Long.valueOf(zznu.zzai());
            case 23:
                List<m0<?>> list21 = h0.f4230a;
                return Integer.valueOf((int) zznu.zzo());
            case 24:
                List<m0<?>> list22 = h0.f4230a;
                return Boolean.valueOf(zzoz.zza());
            case 25:
                List<m0<?>> list23 = h0.f4230a;
                return Boolean.valueOf(zzoh.zzd());
            case 26:
                List<m0<?>> list24 = h0.f4230a;
                return Integer.valueOf((int) zznv.zza());
            case 27:
                List<m0<?>> list25 = h0.f4230a;
                return Boolean.valueOf(zzog.zzc());
            case 28:
                List<m0<?>> list26 = h0.f4230a;
                return Boolean.valueOf(zzpl.zze());
            default:
                List<m0<?>> list27 = h0.f4230a;
                return Boolean.valueOf(zzpl.zza());
        }
    }
}
