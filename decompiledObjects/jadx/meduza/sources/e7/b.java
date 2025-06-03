package e7;

import com.google.android.gms.internal.measurement.zzfw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public String f4082a;

    /* renamed from: b, reason: collision with root package name */
    public int f4083b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f4084c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f4085d;

    /* renamed from: e, reason: collision with root package name */
    public Long f4086e;
    public Long f;

    public b(String str, int i10) {
        this.f4082a = str;
        this.f4083b = i10;
    }

    public static Boolean b(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public static Boolean c(String str, zzfw.zzf zzfVar, a1 a1Var) {
        List<String> zzf;
        boolean startsWith;
        m6.j.i(zzfVar);
        if (str == null || !zzfVar.zzj() || zzfVar.zzb() == zzfw.zzf.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzfw.zzf.zza zzb = zzfVar.zzb();
        zzfw.zzf.zza zzaVar = zzfw.zzf.zza.IN_LIST;
        if (zzb == zzaVar) {
            if (zzfVar.zza() == 0) {
                return null;
            }
        } else if (!zzfVar.zzi()) {
            return null;
        }
        zzfw.zzf.zza zzb2 = zzfVar.zzb();
        boolean zzg = zzfVar.zzg();
        String zze = (zzg || zzb2 == zzfw.zzf.zza.REGEXP || zzb2 == zzaVar) ? zzfVar.zze() : zzfVar.zze().toUpperCase(Locale.ENGLISH);
        if (zzfVar.zza() == 0) {
            zzf = null;
        } else {
            zzf = zzfVar.zzf();
            if (!zzg) {
                ArrayList arrayList = new ArrayList(zzf.size());
                Iterator<String> it = zzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                zzf = Collections.unmodifiableList(arrayList);
            }
        }
        zzfw.zzf.zza zzaVar2 = zzfw.zzf.zza.REGEXP;
        String str2 = zzb2 == zzaVar2 ? zze : null;
        if (zzb2 == zzfw.zzf.zza.IN_LIST) {
            if (zzf == null || zzf.isEmpty()) {
                return null;
            }
        } else if (zze == null) {
            return null;
        }
        if (!zzg && zzb2 != zzaVar2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (x6.f4764a[zzb2.ordinal()]) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, zzg ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (a1Var == null) {
                        return null;
                    }
                    a1Var.f4063r.c("Invalid regular expression in REGEXP audience filter. expression", str2);
                    return null;
                }
            case 2:
                startsWith = str.startsWith(zze);
                break;
            case 3:
                startsWith = str.endsWith(zze);
                break;
            case 4:
                startsWith = str.contains(zze);
                break;
            case 5:
                startsWith = str.equals(zze);
                break;
            case 6:
                if (zzf != null) {
                    startsWith = zzf.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean d(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzfw.zzd r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.b.d(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzfw$zzd, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean e();

    public abstract boolean f();
}
