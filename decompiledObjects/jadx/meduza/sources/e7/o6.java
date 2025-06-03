package e7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzhi;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpf;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import n6.b;

/* loaded from: classes.dex */
public final class o6 extends h6 {
    public o6(i6 i6Var) {
        super(i6Var);
    }

    public static f0 A(zzad zzadVar) {
        Object obj;
        Bundle v10 = v(zzadVar.zzc(), true);
        String obj2 = (!v10.containsKey("_o") || (obj = v10.get("_o")) == null) ? "app" : obj.toString();
        String i10 = va.a.i(zzadVar.zzb(), b.a0.f1561b, b.a0.f1565d);
        if (i10 == null) {
            i10 = zzadVar.zzb();
        }
        return new f0(i10, new a0(v10), obj2, zzadVar.zza());
    }

    public static String D(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static ArrayList E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 < bitSet.length()) {
                    if (bitSet.get(i12)) {
                        j10 |= 1 << i11;
                    }
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static HashMap F(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(F((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(F((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(F((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public static void H(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void I(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                H(builder, str3, string, set);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J(zzgf.zzf.zza zzaVar, String str, Long l10) {
        List<zzgf.zzh> zzf = zzaVar.zzf();
        int i10 = 0;
        while (true) {
            if (i10 >= zzf.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzf.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzgf.zzh.zza zza = zzgf.zzh.zze().zza(str);
        if (l10 instanceof Long) {
            zza.zza(l10.longValue());
        } else if (l10 instanceof String) {
            zza.zzb((String) l10);
        } else if (l10 instanceof Double) {
            zza.zza(((Double) l10).doubleValue());
        }
        if (i10 >= 0) {
            zzaVar.zza(i10, zza);
        } else {
            zzaVar.zza(zza);
        }
    }

    public static void L(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static void N(StringBuilder sb2, int i10, String str, zzfw.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        L(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzdVar.zzh()) {
            O(sb2, i10, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            O(sb2, i10, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            O(sb2, i10, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            O(sb2, i10, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            O(sb2, i10, "max_comparison_value", zzdVar.zze());
        }
        L(sb2, i10);
        sb2.append("}\n");
    }

    public static void O(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        L(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static void Q(StringBuilder sb2, String str, zzgf.zzm zzmVar) {
        if (zzmVar == null) {
            return;
        }
        L(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzmVar.zzb() != 0) {
            L(sb2, 4);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l10 : zzmVar.zzi()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (zzmVar.zzd() != 0) {
            L(sb2, 4);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l11 : zzmVar.zzk()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (zzmVar.zza() != 0) {
            L(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (zzgf.zze zzeVar : zzmVar.zzh()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzeVar.zzf() ? Integer.valueOf(zzeVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzeVar.zze() ? Long.valueOf(zzeVar.zzb()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (zzmVar.zzc() != 0) {
            L(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (zzgf.zzn zznVar : zzmVar.zzj()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zznVar.zzf() ? Integer.valueOf(zznVar.zzb()) : null);
                sb2.append(": [");
                Iterator<Long> it = zznVar.zze().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        L(sb2, 3);
        sb2.append("}\n");
    }

    public static boolean R(int i10, List list) {
        if (i10 < (list.size() << 6)) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable T(zzgf.zzf zzfVar, String str) {
        zzgf.zzh y10 = y(zzfVar, str);
        if (y10 == null) {
            return null;
        }
        if (y10.zzn()) {
            return y10.zzh();
        }
        if (y10.zzl()) {
            return Long.valueOf(y10.zzd());
        }
        if (y10.zzj()) {
            return Double.valueOf(y10.zza());
        }
        if (y10.zzc() > 0) {
            return W(y10.zzi());
        }
        return null;
    }

    public static boolean U(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] W(List<zzgf.zzh> list) {
        ArrayList arrayList = new ArrayList();
        for (zzgf.zzh zzhVar : list) {
            if (zzhVar != null) {
                Bundle bundle = new Bundle();
                for (zzgf.zzh zzhVar2 : zzhVar.zzi()) {
                    if (zzhVar2.zzn()) {
                        bundle.putString(zzhVar2.zzg(), zzhVar2.zzh());
                    } else if (zzhVar2.zzl()) {
                        bundle.putLong(zzhVar2.zzg(), zzhVar2.zzd());
                    } else if (zzhVar2.zzj()) {
                        bundle.putDouble(zzhVar2.zzg(), zzhVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static int s(zzgf.zzk.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < zzaVar.zzd(); i10++) {
            if (str.equals(zzaVar.zzk(i10).zzg())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle u(List<zzgf.zzh> list) {
        Bundle bundle = new Bundle();
        for (zzgf.zzh zzhVar : list) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putDouble(zzg, zzhVar.zza());
            } else if (zzhVar.zzk()) {
                bundle.putFloat(zzg, zzhVar.zzb());
            } else if (zzhVar.zzn()) {
                bundle.putString(zzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putLong(zzg, zzhVar.zzd());
            }
        }
        return bundle;
    }

    public static Bundle v(Map map, boolean z10) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(v((Map) obj2, false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public static zzgf.zzh y(zzgf.zzf zzfVar, String str) {
        for (zzgf.zzh zzhVar : zzfVar.zzh()) {
            if (zzhVar.zzg().equals(str)) {
                return zzhVar;
            }
        }
        return null;
    }

    public static zzlp z(zzkg.zza zzaVar, byte[] bArr) {
        zzjt zza = zzjt.zza();
        return zza != null ? zzaVar.zza(bArr, zza) : zzaVar.zza(bArr);
    }

    public final w5 B(String str, zzgf.zzk.zza zzaVar, zzgf.zzf.zza zzaVar2, String str2) {
        String valueOf;
        String valueOf2;
        int indexOf;
        if (!zzoy.zza() || !h().x(str, h0.Q0)) {
            return null;
        }
        ((b.z) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String[] split = h().u(str, h0.f4266p0).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        g6 g6Var = this.f4804c.f4338r;
        String G = g6Var.o().G(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(g6Var.h().u(str, h0.f4252i0));
        builder.authority(!TextUtils.isEmpty(G) ? defpackage.g.e(G, ".", g6Var.h().u(str, h0.f4254j0)) : g6Var.h().u(str, h0.f4254j0));
        builder.path(g6Var.h().u(str, h0.f4256k0));
        H(builder, "gmp_app_id", zzaVar.zzy(), unmodifiableSet);
        H(builder, "gmp_version", "114010", unmodifiableSet);
        String zzv = zzaVar.zzv();
        h h10 = h();
        m0<Boolean> m0Var = h0.T0;
        if (h10.x(str, m0Var) && o().J(str)) {
            zzv = "";
        }
        H(builder, "app_instance_id", zzv, unmodifiableSet);
        H(builder, "rdid", zzaVar.zzaa(), unmodifiableSet);
        H(builder, "bundle_id", zzaVar.zzu(), unmodifiableSet);
        String zze = zzaVar2.zze();
        String i10 = va.a.i(zze, b.a0.f1565d, b.a0.f1561b);
        if (!TextUtils.isEmpty(i10)) {
            zze = i10;
        }
        H(builder, "app_event_name", zze, unmodifiableSet);
        H(builder, "app_version", String.valueOf(zzaVar.zzb()), unmodifiableSet);
        String zzz = zzaVar.zzz();
        if (h().x(str, m0Var) && o().K(str) && !TextUtils.isEmpty(zzz) && (indexOf = zzz.indexOf(".")) != -1) {
            zzz = zzz.substring(0, indexOf);
        }
        H(builder, "os_version", zzz, unmodifiableSet);
        H(builder, Constants.TIMESTAMP, String.valueOf(zzaVar2.zzc()), unmodifiableSet);
        if (zzaVar.zzae()) {
            H(builder, "lat", "1", unmodifiableSet);
        }
        H(builder, "privacy_sandbox_version", String.valueOf(zzaVar.zza()), unmodifiableSet);
        H(builder, "trigger_uri_source", "1", unmodifiableSet);
        H(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        H(builder, "request_uuid", str2, unmodifiableSet);
        List<zzgf.zzh> zzf = zzaVar2.zzf();
        Bundle bundle = new Bundle();
        for (zzgf.zzh zzhVar : zzf) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                valueOf2 = String.valueOf(zzhVar.zza());
            } else if (zzhVar.zzk()) {
                valueOf2 = String.valueOf(zzhVar.zzb());
            } else if (zzhVar.zzn()) {
                valueOf2 = zzhVar.zzh();
            } else if (zzhVar.zzl()) {
                valueOf2 = String.valueOf(zzhVar.zzd());
            }
            bundle.putString(zzg, valueOf2);
        }
        I(builder, h().u(str, h0.f4264o0).split("\\|"), bundle, unmodifiableSet);
        List<zzgf.zzp> zzac = zzaVar.zzac();
        Bundle bundle2 = new Bundle();
        for (zzgf.zzp zzpVar : zzac) {
            String zzg2 = zzpVar.zzg();
            if (zzpVar.zzi()) {
                valueOf = String.valueOf(zzpVar.zza());
            } else if (zzpVar.zzj()) {
                valueOf = String.valueOf(zzpVar.zzb());
            } else if (zzpVar.zzm()) {
                valueOf = zzpVar.zzh();
            } else if (zzpVar.zzk()) {
                valueOf = String.valueOf(zzpVar.zzc());
            }
            bundle2.putString(zzg2, valueOf);
        }
        I(builder, h().u(str, h0.f4262n0).split("\\|"), bundle2, unmodifiableSet);
        H(builder, "dma", zzaVar.zzad() ? "1" : "0", unmodifiableSet);
        if (!zzaVar.zzx().isEmpty()) {
            H(builder, "dma_cps", zzaVar.zzx(), unmodifiableSet);
        }
        if (h().x(null, h0.V0) && zzaVar.zzaf()) {
            zzgf.zza zzg3 = zzaVar.zzg();
            if (!zzg3.zzh().isEmpty()) {
                H(builder, "dl_gclid", zzg3.zzh(), unmodifiableSet);
            }
            if (!zzg3.zzg().isEmpty()) {
                H(builder, "dl_gbraid", zzg3.zzg(), unmodifiableSet);
            }
            if (!zzg3.zzf().isEmpty()) {
                H(builder, "dl_gs", zzg3.zzf(), unmodifiableSet);
            }
            if (zzg3.zza() > 0) {
                H(builder, "dl_ss_ts", String.valueOf(zzg3.zza()), unmodifiableSet);
            }
            if (!zzg3.zzk().isEmpty()) {
                H(builder, "mr_gclid", zzg3.zzk(), unmodifiableSet);
            }
            if (!zzg3.zzj().isEmpty()) {
                H(builder, "mr_gbraid", zzg3.zzj(), unmodifiableSet);
            }
            if (!zzg3.zzi().isEmpty()) {
                H(builder, "mr_gs", zzg3.zzi(), unmodifiableSet);
            }
            if (zzg3.zzb() > 0) {
                H(builder, "mr_click_ts", String.valueOf(zzg3.zzb()), unmodifiableSet);
            }
        }
        return new w5(builder.build().toString(), currentTimeMillis, 1);
    }

    public final String C(zzgf.zzj zzjVar) {
        zzgf.zzc zzw;
        if (zzjVar == null) {
            return "";
        }
        StringBuilder l10 = defpackage.f.l("\nbatch {\n");
        if (zzjVar.zzh()) {
            O(l10, 0, "upload_subdomain", zzjVar.zze());
        }
        if (zzjVar.zzg()) {
            O(l10, 0, "sgtm_join_id", zzjVar.zzd());
        }
        for (zzgf.zzk zzkVar : zzjVar.zzf()) {
            if (zzkVar != null) {
                L(l10, 1);
                l10.append("bundle {\n");
                if (zzkVar.zzbs()) {
                    O(l10, 1, "protocol_version", Integer.valueOf(zzkVar.zzf()));
                }
                if (zzpf.zza() && h().x(zzkVar.zzab(), h0.H0) && zzkVar.zzbv()) {
                    O(l10, 1, "session_stitching_token", zzkVar.zzaq());
                }
                O(l10, 1, "platform", zzkVar.zzao());
                if (zzkVar.zzbn()) {
                    O(l10, 1, "gmp_version", Long.valueOf(zzkVar.zzo()));
                }
                if (zzkVar.zzcb()) {
                    O(l10, 1, "uploading_gmp_version", Long.valueOf(zzkVar.zzu()));
                }
                if (zzkVar.zzbl()) {
                    O(l10, 1, "dynamite_version", Long.valueOf(zzkVar.zzm()));
                }
                if (zzkVar.zzbe()) {
                    O(l10, 1, "config_version", Long.valueOf(zzkVar.zzk()));
                }
                O(l10, 1, "gmp_app_id", zzkVar.i_());
                O(l10, 1, "admob_app_id", zzkVar.zzaa());
                O(l10, 1, "app_id", zzkVar.zzab());
                O(l10, 1, "app_version", zzkVar.zzae());
                if (zzkVar.zzba()) {
                    O(l10, 1, "app_version_major", Integer.valueOf(zzkVar.zzb()));
                }
                O(l10, 1, "firebase_instance_id", zzkVar.zzak());
                if (zzkVar.zzbj()) {
                    O(l10, 1, "dev_cert_hash", Long.valueOf(zzkVar.zzl()));
                }
                O(l10, 1, "app_store", zzkVar.zzad());
                if (zzkVar.zzca()) {
                    O(l10, 1, "upload_timestamp_millis", Long.valueOf(zzkVar.zzt()));
                }
                if (zzkVar.zzbx()) {
                    O(l10, 1, "start_timestamp_millis", Long.valueOf(zzkVar.zzr()));
                }
                if (zzkVar.zzbm()) {
                    O(l10, 1, "end_timestamp_millis", Long.valueOf(zzkVar.zzn()));
                }
                if (zzkVar.zzbr()) {
                    O(l10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzkVar.zzq()));
                }
                if (zzkVar.zzbq()) {
                    O(l10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzkVar.zzp()));
                }
                O(l10, 1, "app_instance_id", zzkVar.zzac());
                O(l10, 1, "resettable_device_id", zzkVar.zzap());
                O(l10, 1, "ds_id", zzkVar.zzaj());
                if (zzkVar.zzbp()) {
                    O(l10, 1, "limited_ad_tracking", Boolean.valueOf(zzkVar.zzax()));
                }
                O(l10, 1, "os_version", zzkVar.zzan());
                O(l10, 1, "device_model", zzkVar.zzai());
                O(l10, 1, "user_default_language", zzkVar.zzar());
                if (zzkVar.zzbz()) {
                    O(l10, 1, "time_zone_offset_minutes", Integer.valueOf(zzkVar.zzh()));
                }
                if (zzkVar.zzbd()) {
                    O(l10, 1, "bundle_sequential_index", Integer.valueOf(zzkVar.zzc()));
                }
                if (zzkVar.zzbi()) {
                    O(l10, 1, "delivery_index", Integer.valueOf(zzkVar.zzd()));
                }
                if (zzkVar.zzbu()) {
                    O(l10, 1, "service_upload", Boolean.valueOf(zzkVar.zzay()));
                }
                O(l10, 1, "health_monitor", zzkVar.zzam());
                if (zzkVar.zzbt()) {
                    O(l10, 1, "retry_counter", Integer.valueOf(zzkVar.zzg()));
                }
                if (zzkVar.zzbg()) {
                    O(l10, 1, "consent_signals", zzkVar.zzag());
                }
                if (zzkVar.zzbo()) {
                    O(l10, 1, "is_dma_region", Boolean.valueOf(zzkVar.zzaw()));
                }
                if (zzkVar.zzbh()) {
                    O(l10, 1, "core_platform_services", zzkVar.zzah());
                }
                if (zzkVar.zzbf()) {
                    O(l10, 1, "consent_diagnostics", zzkVar.zzaf());
                }
                if (zzkVar.zzby()) {
                    O(l10, 1, "target_os_version", Long.valueOf(zzkVar.zzs()));
                }
                if (zzoy.zza() && h().x(zzkVar.zzab(), h0.Q0)) {
                    O(l10, 1, "ad_services_version", Integer.valueOf(zzkVar.zza()));
                    if (zzkVar.zzbb() && (zzw = zzkVar.zzw()) != null) {
                        L(l10, 2);
                        l10.append("attribution_eligibility_status {\n");
                        O(l10, 2, "eligible", Boolean.valueOf(zzw.zzf()));
                        O(l10, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzw.zzh()));
                        O(l10, 2, "pre_r", Boolean.valueOf(zzw.zzi()));
                        O(l10, 2, "r_extensions_too_old", Boolean.valueOf(zzw.zzj()));
                        O(l10, 2, "adservices_extension_too_old", Boolean.valueOf(zzw.zze()));
                        O(l10, 2, "ad_storage_not_allowed", Boolean.valueOf(zzw.zzd()));
                        O(l10, 2, "measurement_manager_disabled", Boolean.valueOf(zzw.zzg()));
                        L(l10, 2);
                        l10.append("}\n");
                    }
                }
                if (zzkVar.zzaz()) {
                    zzgf.zza zzv = zzkVar.zzv();
                    L(l10, 2);
                    l10.append("ad_campaign_info {\n");
                    if (zzv.zzn()) {
                        O(l10, 2, "deep_link_gclid", zzv.zzh());
                    }
                    if (zzv.zzm()) {
                        O(l10, 2, "deep_link_gbraid", zzv.zzg());
                    }
                    if (zzv.zzl()) {
                        O(l10, 2, "deep_link_gad_source", zzv.zzf());
                    }
                    if (zzv.zzo()) {
                        O(l10, 2, "deep_link_session_millis", Long.valueOf(zzv.zza()));
                    }
                    if (zzv.zzs()) {
                        O(l10, 2, "market_referrer_gclid", zzv.zzk());
                    }
                    if (zzv.zzr()) {
                        O(l10, 2, "market_referrer_gbraid", zzv.zzj());
                    }
                    if (zzv.zzq()) {
                        O(l10, 2, "market_referrer_gad_source", zzv.zzi());
                    }
                    if (zzv.zzp()) {
                        O(l10, 2, "market_referrer_click_millis", Long.valueOf(zzv.zzb()));
                    }
                    L(l10, 2);
                    l10.append("}\n");
                }
                if (zzkVar.zzbc()) {
                    O(l10, 1, "batching_timestamp_millis", Long.valueOf(zzkVar.zzj()));
                }
                if (zzkVar.zzbw()) {
                    zzgf.zzo zzz = zzkVar.zzz();
                    L(l10, 2);
                    l10.append("sgtm_diagnostics {\n");
                    O(l10, 2, "upload_type", zzz.zzd().name());
                    O(l10, 2, "client_upload_eligibility", zzz.zzb().name());
                    O(l10, 2, "service_upload_eligibility", zzz.zzc().name());
                    L(l10, 2);
                    l10.append("}\n");
                }
                List<zzgf.zzp> zzau = zzkVar.zzau();
                if (zzau != null) {
                    for (zzgf.zzp zzpVar : zzau) {
                        if (zzpVar != null) {
                            L(l10, 2);
                            l10.append("user_property {\n");
                            O(l10, 2, "set_timestamp_millis", zzpVar.zzl() ? Long.valueOf(zzpVar.zzd()) : null);
                            O(l10, 2, "name", i().g(zzpVar.zzg()));
                            O(l10, 2, "string_value", zzpVar.zzh());
                            O(l10, 2, "int_value", zzpVar.zzk() ? Long.valueOf(zzpVar.zzc()) : null);
                            O(l10, 2, "double_value", zzpVar.zzi() ? Double.valueOf(zzpVar.zza()) : null);
                            L(l10, 2);
                            l10.append("}\n");
                        }
                    }
                }
                List<zzgf.zzd> zzas = zzkVar.zzas();
                zzkVar.zzab();
                if (zzas != null) {
                    for (zzgf.zzd zzdVar : zzas) {
                        if (zzdVar != null) {
                            L(l10, 2);
                            l10.append("audience_membership {\n");
                            if (zzdVar.zzg()) {
                                O(l10, 2, "audience_id", Integer.valueOf(zzdVar.zza()));
                            }
                            if (zzdVar.zzh()) {
                                O(l10, 2, "new_audience", Boolean.valueOf(zzdVar.zzf()));
                            }
                            Q(l10, "current_data", zzdVar.zzd());
                            if (zzdVar.zzi()) {
                                Q(l10, "previous_data", zzdVar.zze());
                            }
                            L(l10, 2);
                            l10.append("}\n");
                        }
                    }
                }
                List<zzgf.zzf> zzat = zzkVar.zzat();
                if (zzat != null) {
                    for (zzgf.zzf zzfVar : zzat) {
                        if (zzfVar != null) {
                            L(l10, 2);
                            l10.append("event {\n");
                            O(l10, 2, "name", i().c(zzfVar.zzg()));
                            if (zzfVar.zzk()) {
                                O(l10, 2, "timestamp_millis", Long.valueOf(zzfVar.zzd()));
                            }
                            if (zzfVar.zzj()) {
                                O(l10, 2, "previous_timestamp_millis", Long.valueOf(zzfVar.zzc()));
                            }
                            if (zzfVar.zzi()) {
                                O(l10, 2, "count", Integer.valueOf(zzfVar.zza()));
                            }
                            if (zzfVar.zzb() != 0) {
                                P(l10, 2, zzfVar.zzh());
                            }
                            L(l10, 2);
                            l10.append("}\n");
                        }
                    }
                }
                L(l10, 1);
                l10.append("}\n");
            }
        }
        l10.append("} // End-of-batch\n");
        return l10.toString();
    }

    public final List<Long> G(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().f4063r.c("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().f4063r.d("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final void K(zzgf.zzh.zza zzaVar, Object obj) {
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().f4060o.c("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzgf.zzh.zza zze = zzgf.zzh.zze();
                for (String str : bundle.keySet()) {
                    zzgf.zzh.zza zza = zzgf.zzh.zze().zza(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zza.zza(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zza.zzb((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zza.zza(((Double) obj2).doubleValue());
                    }
                    zze.zza(zza);
                }
                if (zze.zza() > 0) {
                    arrayList.add((zzgf.zzh) ((zzkg) zze.zzaj()));
                }
            }
        }
        zzaVar.zza(arrayList);
    }

    public final void M(StringBuilder sb2, int i10, zzfw.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        L(sb2, i10);
        sb2.append("filter {\n");
        if (zzcVar.zzg()) {
            O(sb2, i10, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            O(sb2, i10, "param_name", i().f(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i11 = i10 + 1;
            zzfw.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                L(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzd.zzj()) {
                    O(sb2, i11, "match_type", zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    O(sb2, i11, "expression", zzd.zze());
                }
                if (zzd.zzh()) {
                    O(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    L(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str : zzd.zzf()) {
                        L(sb2, i11 + 2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                L(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            N(sb2, i10 + 1, "number_filter", zzcVar.zzc());
        }
        L(sb2, i10);
        sb2.append("}\n");
    }

    public final void P(StringBuilder sb2, int i10, List<zzgf.zzh> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (zzgf.zzh zzhVar : list) {
            if (zzhVar != null) {
                L(sb2, i11);
                sb2.append("param {\n");
                O(sb2, i11, "name", zzhVar.zzm() ? i().f(zzhVar.zzg()) : null);
                O(sb2, i11, "string_value", zzhVar.zzn() ? zzhVar.zzh() : null);
                O(sb2, i11, "int_value", zzhVar.zzl() ? Long.valueOf(zzhVar.zzd()) : null);
                O(sb2, i11, "double_value", zzhVar.zzj() ? Double.valueOf(zzhVar.zza()) : null);
                if (zzhVar.zzc() > 0) {
                    P(sb2, i11, zzhVar.zzi());
                }
                L(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final boolean S(long j10, long j11) {
        if (j10 == 0 || j11 <= 0) {
            return true;
        }
        ((b.z) zzb()).getClass();
        return Math.abs(System.currentTimeMillis() - j10) > j11;
    }

    public final byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().f4060o.c("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final byte[] X(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e10) {
            zzj().f4060o.c("Failed to ungzip content", e10);
            throw e10;
        }
    }

    public final ArrayList Y() {
        Context context = this.f4804c.t.f4360a;
        List<m0<?>> list = h0.f4230a;
        zzhi zza = zzhi.zza(context.getContentResolver(), zzhu.zza("com.google.android.gms.measurement"), new Runnable() { // from class: e7.g0
            @Override // java.lang.Runnable
            public final void run() {
                zzhx.zzc();
            }
        });
        Map<String, String> emptyMap = zza == null ? Collections.emptyMap() : zza.zza();
        if (emptyMap == null || emptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = h0.f4231a0.a(null).intValue();
        for (Map.Entry<String, String> entry : emptyMap.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().f4063r.c("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    zzj().f4063r.c("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // e7.h6
    public final boolean r() {
        return false;
    }

    public final long t(byte[] bArr) {
        m6.j.i(bArr);
        k().l();
        MessageDigest B0 = r6.B0();
        if (B0 != null) {
            return r6.t(B0.digest(bArr));
        }
        zzj().f4060o.b("Failed to get MD5");
        return 0L;
    }

    public final <T extends Parcelable> T w(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (b.a unused) {
            zzj().f4060o.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzgf.zzf x(y yVar) {
        zzgf.zzf.zza zza = zzgf.zzf.zze().zza(yVar.f4770e);
        a0 a0Var = yVar.f;
        a0Var.getClass();
        for (String str : a0Var.f4057a.keySet()) {
            zzgf.zzh.zza zza2 = zzgf.zzh.zze().zza(str);
            Object obj = yVar.f.f4057a.get(str);
            m6.j.i(obj);
            K(zza2, obj);
            zza.zza(zza2);
        }
        if (!TextUtils.isEmpty(yVar.f4768c) && yVar.f.f4057a.get("_o") == null) {
            zza.zza((zzgf.zzh) ((zzkg) zzgf.zzh.zze().zza("_o").zzb(yVar.f4768c).zzaj()));
        }
        return (zzgf.zzf) ((zzkg) zza.zzaj());
    }
}
