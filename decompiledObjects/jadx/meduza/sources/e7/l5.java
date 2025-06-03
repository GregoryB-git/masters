package e7;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import y5.a;

/* loaded from: classes.dex */
public final class l5 extends h6 {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f4470e;
    public final q1 f;

    /* renamed from: o, reason: collision with root package name */
    public final q1 f4471o;

    /* renamed from: p, reason: collision with root package name */
    public final q1 f4472p;

    /* renamed from: q, reason: collision with root package name */
    public final q1 f4473q;

    /* renamed from: r, reason: collision with root package name */
    public final q1 f4474r;

    /* renamed from: s, reason: collision with root package name */
    public final q1 f4475s;

    public l5(i6 i6Var) {
        super(i6Var);
        this.f4470e = new HashMap();
        l1 j10 = j();
        Objects.requireNonNull(j10);
        this.f = new q1(j10, "last_delete_stale", 0L);
        l1 j11 = j();
        Objects.requireNonNull(j11);
        this.f4471o = new q1(j11, "last_delete_stale_batch", 0L);
        l1 j12 = j();
        Objects.requireNonNull(j12);
        this.f4472p = new q1(j12, "backoff", 0L);
        l1 j13 = j();
        Objects.requireNonNull(j13);
        this.f4473q = new q1(j13, "last_upload", 0L);
        l1 j14 = j();
        Objects.requireNonNull(j14);
        this.f4474r = new q1(j14, "last_upload_attempt", 0L);
        l1 j15 = j();
        Objects.requireNonNull(j15);
        this.f4475s = new q1(j15, "midnight_offset", 0L);
    }

    @Override // e7.h6
    public final boolean r() {
        return false;
    }

    @Deprecated
    public final Pair<String, Boolean> s(String str) {
        k5 k5Var;
        l();
        ((b.z) zzb()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        k5 k5Var2 = (k5) this.f4470e.get(str);
        if (k5Var2 != null && elapsedRealtime < k5Var2.f4436c) {
            return new Pair<>(k5Var2.f4434a, Boolean.valueOf(k5Var2.f4435b));
        }
        h h10 = h();
        h10.getClass();
        long s10 = h10.s(str, h0.f4233b) + elapsedRealtime;
        a.C0264a c0264a = null;
        try {
            try {
                c0264a = y5.a.a(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (k5Var2 != null && elapsedRealtime < k5Var2.f4436c + h().s(str, h0.f4236c)) {
                    return new Pair<>(k5Var2.f4434a, Boolean.valueOf(k5Var2.f4435b));
                }
            }
        } catch (Exception e10) {
            zzj().f4066v.c("Unable to get advertising id", e10);
            k5Var = new k5(s10, "", false);
        }
        if (c0264a == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = c0264a.f17437a;
        k5Var = str2 != null ? new k5(s10, str2, c0264a.f17438b) : new k5(s10, "", c0264a.f17438b);
        this.f4470e.put(str, k5Var);
        return new Pair<>(k5Var.f4434a, Boolean.valueOf(k5Var.f4435b));
    }

    @Deprecated
    public final String t(String str, boolean z10) {
        l();
        String str2 = z10 ? (String) s(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest B0 = r6.B0();
        if (B0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, B0.digest(str2.getBytes())));
    }
}
