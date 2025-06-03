package R2;

import A2.AbstractC0328n;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C0885d2;
import com.google.android.gms.internal.measurement.C0903f2;
import com.google.android.gms.internal.measurement.C0917g7;
import com.google.android.gms.internal.measurement.C0921h2;
import com.google.android.gms.internal.measurement.C0934i6;
import com.google.android.gms.internal.measurement.C0979n6;
import com.google.android.gms.internal.measurement.C0988o6;
import com.google.android.gms.internal.measurement.C1063x1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C1958a;

/* renamed from: R2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574p extends C5 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f5453f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f5454g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f5455h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f5456i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f5457j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f5458k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f5459l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f5460m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f5461n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f5462o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    public final C0615v f5463d;

    /* renamed from: e, reason: collision with root package name */
    public final C0628w5 f5464e;

    public C0574p(D5 d52) {
        super(d52);
        this.f5464e = new C0628w5(b());
        this.f5463d = new C0615v(this, a(), "google_app_measurement.db");
    }

    public static void V(ContentValues contentValues, String str, Object obj) {
        AbstractC0328n.e(str);
        AbstractC0328n.i(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    public final long A() {
        return G("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R2.C0497e A0(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.A0(java.lang.String, java.lang.String):R2.e");
    }

    public final SQLiteDatabase B() {
        n();
        try {
            return this.f5463d.getWritableDatabase();
        } catch (SQLiteException e7) {
            j().L().b("Error opening database", e7);
            throw e7;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:46), block:B:58:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle B0(java.lang.String r8) {
        /*
            r7 = this;
            r7.n()
            r7.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.B()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r2 != 0) goto L33
            R2.Y1 r8 = r7.j()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            R2.a2 r8 = r8.K()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r1.close()
            return r0
        L2c:
            r8 = move-exception
            r0 = r1
            goto Ld3
        L30:
            r8 = move-exception
            goto Lc0
        L33:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            com.google.android.gms.internal.measurement.Y1$a r3 = com.google.android.gms.internal.measurement.Y1.Z()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            com.google.android.gms.internal.measurement.L4 r2 = R2.N5.H(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            com.google.android.gms.internal.measurement.Y1$a r2 = (com.google.android.gms.internal.measurement.Y1.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            com.google.android.gms.internal.measurement.I4 r2 = r2.p()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            com.google.android.gms.internal.measurement.Y3 r2 = (com.google.android.gms.internal.measurement.Y3) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            com.google.android.gms.internal.measurement.Y1 r2 = (com.google.android.gms.internal.measurement.Y1) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            r7.o()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.util.List r8 = r2.c0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
        L5a:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r3 == 0) goto La2
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            com.google.android.gms.internal.measurement.a2 r3 = (com.google.android.gms.internal.measurement.C0858a2) r3     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.lang.String r4 = r3.c0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            boolean r5 = r3.f0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L78
            double r5 = r3.G()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        L78:
            boolean r5 = r3.g0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L86
            float r3 = r3.R()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        L86:
            boolean r5 = r3.j0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L94
            java.lang.String r3 = r3.d0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        L94:
            boolean r5 = r3.h0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L5a
            long r5 = r3.X()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        La2:
            r1.close()
            return r2
        La6:
            r2 = move-exception
            R2.Y1 r3 = r7.j()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = R2.Y1.v(r8)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r3.c(r4, r8, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r1.close()
            return r0
        Lbc:
            r8 = move-exception
            goto Ld3
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            R2.Y1 r2 = r7.j()     // Catch: java.lang.Throwable -> L2c
            R2.a2 r2 = r2.G()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto Ld2
            r1.close()
        Ld2:
            return r0
        Ld3:
            if (r0 == 0) goto Ld8
            r0.close()
        Ld8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.B0(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            R2.Y1 r3 = r6.j()     // Catch: java.lang.Throwable -> L1a
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.C():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R2.E C0(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.C0(java.lang.String, java.lang.String):R2.E");
    }

    public final int D(String str, String str2) {
        AbstractC0328n.e(str);
        AbstractC0328n.e(str2);
        n();
        u();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            j().G().d("Error deleting conditional property", Y1.v(str), h().g(str2), e7);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0229 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0241 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0268 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a0 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c4 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ea A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0300 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0317 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TRY_LEAVE, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:14:0x0112, B:16:0x016f, B:20:0x0180, B:23:0x01ca, B:25:0x01f9, B:29:0x0203, B:32:0x021e, B:34:0x0229, B:35:0x023b, B:37:0x0241, B:39:0x024d, B:41:0x0259, B:42:0x0262, B:44:0x0268, B:46:0x0274, B:48:0x027c, B:51:0x0285, B:53:0x0288, B:55:0x02a0, B:57:0x02ac, B:58:0x02be, B:60:0x02c4, B:62:0x02d0, B:64:0x02d8, B:67:0x02e1, B:69:0x02e4, B:71:0x02ea, B:73:0x02f6, B:76:0x030b, B:77:0x0300, B:80:0x0307, B:81:0x030e, B:83:0x0317, B:87:0x021a, B:89:0x01c5, B:93:0x033d), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R2.I2 D0(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.D0(java.lang.String):R2.I2");
    }

    public final long E(C0885d2 c0885d2) {
        n();
        u();
        AbstractC0328n.i(c0885d2);
        AbstractC0328n.e(c0885d2.D3());
        byte[] h7 = c0885d2.h();
        long A7 = o().A(h7);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0885d2.D3());
        contentValues.put("metadata_fingerprint", Long.valueOf(A7));
        contentValues.put("metadata", h7);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return A7;
        } catch (SQLiteException e7) {
            j().G().c("Error storing raw event metadata. appId", Y1.v(c0885d2.D3()), e7);
            throw e7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R2.r E0(java.lang.String r13) {
        /*
            r12 = this;
            A2.AbstractC0328n.e(r13)
            r12.n()
            r12.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.B()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r2 = "apps"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "config_last_modified_time"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "e_tag"
            r11 = 2
            r3[r11] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r2 != 0) goto L39
            r1.close()
            return r0
        L39:
            byte[] r2 = r1.getBlob(r9)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r3 = r1.getString(r10)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r4 = r1.getString(r11)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r5 == 0) goto L62
            R2.Y1 r5 = r12.j()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            R2.a2 r5 = r5.G()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = R2.Y1.v(r13)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            goto L62
        L5d:
            r13 = move-exception
            r0 = r1
            goto L8c
        L60:
            r2 = move-exception
            goto L75
        L62:
            if (r2 != 0) goto L68
            r1.close()
            return r0
        L68:
            R2.r r5 = new R2.r     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r1.close()
            return r5
        L71:
            r13 = move-exception
            goto L8c
        L73:
            r2 = move-exception
            r1 = r0
        L75:
            R2.Y1 r3 = r12.j()     // Catch: java.lang.Throwable -> L5d
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r13 = R2.Y1.v(r13)     // Catch: java.lang.Throwable -> L5d
            r3.c(r4, r13, r2)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L8b
            r1.close()
        L8b:
            return r0
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.E0(java.lang.String):R2.r");
    }

    public final long F(String str) {
        AbstractC0328n.e(str);
        n();
        u();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, f().u(str, K.f4854r))))});
        } catch (SQLiteException e7) {
            j().G().c("Error deleting over the limit events. appId", Y1.v(str), e7);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R2.T5 F0(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            A2.AbstractC0328n.e(r14)
            A2.AbstractC0328n.e(r15)
            r13.n()
            r13.u()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.B()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.Object r9 = r13.M(r2, r11)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r9 != 0) goto L4a
            r2.close()
            return r1
        L4a:
            java.lang.String r5 = r2.getString(r12)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            R2.T5 r0 = new R2.T5     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r3 == 0) goto L73
            R2.Y1 r3 = r13.j()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = R2.Y1.v(r14)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            goto L73
        L6e:
            r0 = move-exception
            r1 = r2
            goto L9a
        L71:
            r0 = move-exception
            goto L7b
        L73:
            r2.close()
            return r0
        L77:
            r0 = move-exception
            goto L9a
        L79:
            r0 = move-exception
            r2 = r1
        L7b:
            R2.Y1 r3 = r13.j()     // Catch: java.lang.Throwable -> L6e
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = R2.Y1.v(r14)     // Catch: java.lang.Throwable -> L6e
            R2.X1 r6 = r13.h()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.g(r15)     // Catch: java.lang.Throwable -> L6e
            r3.d(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L99
            r2.close()
        L99:
            return r1
        L9a:
            if (r1 == 0) goto L9f
            r1.close()
        L9f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.F0(java.lang.String, java.lang.String):R2.T5");
    }

    public final long G(String str, String[] strArr, long j7) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j7;
                }
                long j8 = cursor.getLong(0);
                cursor.close();
                return j8;
            } catch (SQLiteException e7) {
                j().G().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C0643z G0(String str) {
        if (!C0979n6.a() || !f().s(K.f4805T0)) {
            return C0643z.f5622f;
        }
        AbstractC0328n.i(str);
        n();
        u();
        return C0643z.c(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R2.C0581q H(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.H(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):R2.q");
    }

    public final Map H0(String str, String str2) {
        u();
        n();
        AbstractC0328n.e(str);
        AbstractC0328n.e(str2);
        C1958a c1958a = new C1958a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        C1063x1 c1063x1 = (C1063x1) ((com.google.android.gms.internal.measurement.Y3) ((C1063x1.a) N5.H(C1063x1.M(), query.getBlob(1))).p());
                        int i7 = query.getInt(0);
                        List list = (List) c1958a.get(Integer.valueOf(i7));
                        if (list == null) {
                            list = new ArrayList();
                            c1958a.put(Integer.valueOf(i7), list);
                        }
                        list.add(c1063x1);
                    } catch (IOException e7) {
                        j().G().c("Failed to merge filter. appId", Y1.v(str), e7);
                    }
                } while (query.moveToNext());
                query.close();
                return c1958a;
            } catch (SQLiteException e8) {
                j().G().c("Database error querying filters. appId", Y1.v(str), e8);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C0581q I(long j7, String str, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return H(j7, str, 1L, false, false, z9, false, z11);
    }

    public final C0585q3 I0(String str) {
        AbstractC0328n.i(str);
        n();
        u();
        if (!C0979n6.a() || !f().s(K.f4805T0)) {
            return C0585q3.e(P("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
        }
        C0585q3 c0585q3 = (C0585q3) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new InterfaceC0594s() { // from class: R2.o
            @Override // R2.InterfaceC0594s
            public final Object a(Cursor cursor) {
                C0585q3 f7;
                f7 = C0585q3.f(cursor.getString(0), cursor.getInt(1));
                return f7;
            }
        });
        return c0585q3 == null ? C0585q3.f5491c : c0585q3;
    }

    public final Map J0(String str, String str2) {
        u();
        n();
        AbstractC0328n.e(str);
        AbstractC0328n.e(str2);
        C1958a c1958a = new C1958a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.A1 a12 = (com.google.android.gms.internal.measurement.A1) ((com.google.android.gms.internal.measurement.Y3) ((A1.a) N5.H(com.google.android.gms.internal.measurement.A1.J(), query.getBlob(1))).p());
                        int i7 = query.getInt(0);
                        List list = (List) c1958a.get(Integer.valueOf(i7));
                        if (list == null) {
                            list = new ArrayList();
                            c1958a.put(Integer.valueOf(i7), list);
                        }
                        list.add(a12);
                    } catch (IOException e7) {
                        j().G().c("Failed to merge filter", Y1.v(str), e7);
                    }
                } while (query.moveToNext());
                query.close();
                return c1958a;
            } catch (SQLiteException e8) {
                j().G().c("Database error querying filters. appId", Y1.v(str), e8);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List K0(String str) {
        AbstractC0328n.e(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new C0621v5(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e7) {
                j().G().c("Error querying trigger uris. appId", Y1.v(str), e7);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0036: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:55), block:B:29:0x0036 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair L(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.n()
            r7.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.B()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            if (r2 != 0) goto L3a
            R2.Y1 r8 = r7.j()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            R2.a2 r8 = r8.K()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L35:
            r8 = move-exception
            r0 = r1
            goto L8d
        L38:
            r8 = move-exception
            goto L7a
        L3a:
            byte[] r2 = r1.getBlob(r4)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            long r3 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            com.google.android.gms.internal.measurement.Y1$a r4 = com.google.android.gms.internal.measurement.Y1.Z()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.L4 r2 = R2.N5.H(r4, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.Y1$a r2 = (com.google.android.gms.internal.measurement.Y1.a) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.I4 r2 = r2.p()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.Y3 r2 = (com.google.android.gms.internal.measurement.Y3) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.Y1 r2 = (com.google.android.gms.internal.measurement.Y1) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r8
        L60:
            r2 = move-exception
            R2.Y1 r3 = r7.j()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = R2.Y1.v(r8)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r3.d(r4, r8, r9, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L76:
            r8 = move-exception
            goto L8d
        L78:
            r8 = move-exception
            r1 = r0
        L7a:
            R2.Y1 r9 = r7.j()     // Catch: java.lang.Throwable -> L35
            R2.a2 r9 = r9.G()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L8c
            r1.close()
        L8c:
            return r0
        L8d:
            if (r0 == 0) goto L92
            r0.close()
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.L(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final void L0(String str, String str2) {
        AbstractC0328n.e(str);
        AbstractC0328n.e(str2);
        n();
        u();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            j().G().d("Error deleting user property. appId", Y1.v(str), h().g(str2), e7);
        }
    }

    public final Object M(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 0) {
            j().G().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            j().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        j().G().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List M0(java.lang.String r16) {
        /*
            r15 = this;
            A2.AbstractC0328n.e(r16)
            r15.n()
            r15.u()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.B()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L46
            r1.close()
            return r0
        L46:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L52
            java.lang.String r2 = ""
        L52:
            r5 = r2
            goto L5a
        L54:
            r0 = move-exception
            r2 = r15
            goto Lab
        L57:
            r0 = move-exception
            r2 = r15
            goto L90
        L5a:
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r2 = r15
            java.lang.Object r9 = r15.M(r1, r14)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r9 != 0) goto L7b
            R2.Y1 r3 = r15.j()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = R2.Y1.v(r16)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            goto L86
        L77:
            r0 = move-exception
            goto Lab
        L79:
            r0 = move-exception
            goto L90
        L7b:
            R2.T5 r10 = new R2.T5     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r0.add(r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
        L86:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r3 != 0) goto L46
            r1.close()
            return r0
        L90:
            R2.Y1 r3 = r15.j()     // Catch: java.lang.Throwable -> L77
            R2.a2 r3 = r3.G()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = R2.Y1.v(r16)     // Catch: java.lang.Throwable -> L77
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L77
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto Laa
            r1.close()
        Laa:
            return r0
        Lab:
            if (r1 == 0) goto Lb0
            r1.close()
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.M0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(java.lang.String r3, java.lang.String[] r4, R2.InterfaceC0594s r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.B()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            R2.Y1 r4 = r2.j()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            R2.a2 r4 = r4.K()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            R2.Y1 r5 = r2.j()     // Catch: java.lang.Throwable -> L20
            R2.a2 r5 = r5.G()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.N(java.lang.String, java.lang.String[], R2.s):java.lang.Object");
    }

    public final Map N0(String str) {
        u();
        n();
        AbstractC0328n.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                C1958a c1958a = new C1958a();
                do {
                    int i7 = query.getInt(0);
                    try {
                        c1958a.put(Integer.valueOf(i7), (C0903f2) ((com.google.android.gms.internal.measurement.Y3) ((C0903f2.a) N5.H(C0903f2.V(), query.getBlob(1))).p()));
                    } catch (IOException e7) {
                        j().G().d("Failed to merge filter results. appId, audienceId, error", Y1.v(str), Integer.valueOf(i7), e7);
                    }
                } while (query.moveToNext());
                query.close();
                return c1958a;
            } catch (SQLiteException e8) {
                j().G().c("Database error querying filter results. appId", Y1.v(str), e8);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String O(long r5) {
        /*
            r4 = this;
            r4.n()
            r4.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.B()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            if (r1 != 0) goto L37
            R2.Y1 r6 = r4.j()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            R2.a2 r6 = r6.K()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r0
        L32:
            r6 = move-exception
            r0 = r5
            goto L56
        L35:
            r6 = move-exception
            goto L43
        L37:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r6
        L3f:
            r6 = move-exception
            goto L56
        L41:
            r6 = move-exception
            r5 = r0
        L43:
            R2.Y1 r1 = r4.j()     // Catch: java.lang.Throwable -> L32
            R2.a2 r1 = r1.G()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L55
            r5.close()
        L55:
            return r0
        L56:
            if (r0 == 0) goto L5b
            r0.close()
        L5b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.O(long):java.lang.String");
    }

    public final Map O0(String str) {
        AbstractC0328n.e(str);
        C1958a c1958a = new C1958a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        C1063x1 c1063x1 = (C1063x1) ((com.google.android.gms.internal.measurement.Y3) ((C1063x1.a) N5.H(C1063x1.M(), query.getBlob(1))).p());
                        if (c1063x1.U()) {
                            int i7 = query.getInt(0);
                            List list = (List) c1958a.get(Integer.valueOf(i7));
                            if (list == null) {
                                list = new ArrayList();
                                c1958a.put(Integer.valueOf(i7), list);
                            }
                            list.add(c1063x1);
                        }
                    } catch (IOException e7) {
                        j().G().c("Failed to merge filter. appId", Y1.v(str), e7);
                    }
                } while (query.moveToNext());
                query.close();
                return c1958a;
            } catch (SQLiteException e8) {
                j().G().c("Database error querying filters. appId", Y1.v(str), e8);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String P(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return str2;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e7) {
                j().G().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map P0(String str) {
        u();
        n();
        AbstractC0328n.e(str);
        C1958a c1958a = new C1958a();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i7 = rawQuery.getInt(0);
                    List list = (List) c1958a.get(Integer.valueOf(i7));
                    if (list == null) {
                        list = new ArrayList();
                        c1958a.put(Integer.valueOf(i7), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return c1958a;
            } catch (SQLiteException e7) {
                j().G().c("Database error querying scoped filters. appId", Y1.v(str), e7);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List Q(String str, int i7, int i8) {
        C0472a2 G6;
        String str2;
        Object v7;
        byte[] i02;
        long j7;
        long j8;
        n();
        u();
        int i9 = 1;
        AbstractC0328n.a(i7 > 0);
        AbstractC0328n.a(i8 > 0);
        AbstractC0328n.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i7));
                if (!query.moveToFirst()) {
                    List emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    long j9 = query.getLong(0);
                    try {
                        i02 = o().i0(query.getBlob(i9));
                    } catch (IOException e7) {
                        e = e7;
                        G6 = j().G();
                        str2 = "Failed to unzip queued bundle. appId";
                        v7 = Y1.v(str);
                    }
                    if (!arrayList.isEmpty() && i02.length + i10 > i8) {
                        break;
                    }
                    try {
                        C0885d2.a aVar = (C0885d2.a) N5.H(C0885d2.A3(), i02);
                        if (C0979n6.a() && f().s(K.f4813X0) && !arrayList.isEmpty()) {
                            C0885d2 c0885d2 = (C0885d2) ((Pair) arrayList.get(0)).first;
                            C0885d2 c0885d22 = (C0885d2) ((com.google.android.gms.internal.measurement.Y3) aVar.p());
                            if (!c0885d2.f0().equals(c0885d22.f0()) || !c0885d2.e0().equals(c0885d22.e0()) || c0885d2.v0() != c0885d22.v0() || !c0885d2.g0().equals(c0885d22.g0())) {
                                break;
                            }
                            Iterator it = c0885d2.t0().iterator();
                            while (true) {
                                j7 = -1;
                                if (!it.hasNext()) {
                                    j8 = -1;
                                    break;
                                }
                                C0921h2 c0921h2 = (C0921h2) it.next();
                                if ("_npa".equals(c0921h2.Z())) {
                                    j8 = c0921h2.U();
                                    break;
                                }
                            }
                            Iterator it2 = c0885d22.t0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C0921h2 c0921h22 = (C0921h2) it2.next();
                                if ("_npa".equals(c0921h22.Z())) {
                                    j7 = c0921h22.U();
                                    break;
                                }
                            }
                            if (j8 != j7) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            aVar.q0(query.getInt(2));
                        }
                        i10 += i02.length;
                        arrayList.add(Pair.create((C0885d2) ((com.google.android.gms.internal.measurement.Y3) aVar.p()), Long.valueOf(j9)));
                    } catch (IOException e8) {
                        e = e8;
                        G6 = j().G();
                        str2 = "Failed to merge queued bundle. appId";
                        v7 = Y1.v(str);
                        G6.c(str2, v7, e);
                        if (query.moveToNext()) {
                            break;
                        }
                        i9 = 1;
                        query.close();
                        return arrayList;
                    }
                    if (query.moveToNext() || i10 > i8) {
                        break;
                        break;
                    }
                    i9 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e9) {
                j().G().c("Error querying bundles. appId", Y1.v(str), e9);
                List emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Q0() {
        u();
        B().beginTransaction();
    }

    public final List R(String str, String str2, String str3) {
        AbstractC0328n.e(str);
        n();
        u();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void R0() {
        u();
        B().endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        j().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List S(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.S(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void S0() {
        int delete;
        n();
        u();
        if (u0()) {
            long a7 = s().f5310e.a();
            long b7 = b().b();
            if (Math.abs(b7 - a7) > ((Long) K.f4766A.a(null)).longValue()) {
                s().f5310e.b(b7);
                n();
                u();
                if (!u0() || (delete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(C0511g.M())})) <= 0) {
                    return;
                }
                j().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void T(E e7) {
        AbstractC0328n.i(e7);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e7.f4640a);
        contentValues.put("name", e7.f4641b);
        contentValues.put("lifetime_count", Long.valueOf(e7.f4642c));
        contentValues.put("current_bundle_count", Long.valueOf(e7.f4643d));
        contentValues.put("last_fire_timestamp", Long.valueOf(e7.f4645f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(e7.f4646g));
        contentValues.put("last_bundled_day", e7.f4647h);
        contentValues.put("last_sampled_complex_event_id", e7.f4648i);
        contentValues.put("last_sampling_rate", e7.f4649j);
        contentValues.put("current_session_count", Long.valueOf(e7.f4644e));
        Boolean bool = e7.f4650k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update event aggregates (got -1). appId", Y1.v(e7.f4640a));
            }
        } catch (SQLiteException e8) {
            j().G().c("Error storing event aggregates. appId", Y1.v(e7.f4640a), e8);
        }
    }

    public final void T0() {
        u();
        B().setTransactionSuccessful();
    }

    public final void U(I2 i22) {
        AbstractC0328n.i(i22);
        n();
        u();
        String t02 = i22.t0();
        AbstractC0328n.i(t02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t02);
        contentValues.put("app_instance_id", i22.u0());
        contentValues.put("gmp_app_id", i22.j());
        contentValues.put("resettable_device_id_hash", i22.l());
        contentValues.put("last_bundle_index", Long.valueOf(i22.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(i22.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(i22.i0()));
        contentValues.put("app_version", i22.h());
        contentValues.put("app_store", i22.v0());
        contentValues.put("gmp_version", Long.valueOf(i22.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(i22.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(i22.r()));
        contentValues.put("day", Long.valueOf(i22.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(i22.T()));
        contentValues.put("daily_events_count", Long.valueOf(i22.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(i22.K()));
        contentValues.put("config_fetched_time", Long.valueOf(i22.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(i22.e0()));
        contentValues.put("app_version_int", Long.valueOf(i22.z()));
        contentValues.put("firebase_instance_id", i22.i());
        contentValues.put("daily_error_events_count", Long.valueOf(i22.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(i22.W()));
        contentValues.put("health_monitor_sample", i22.k());
        contentValues.put("android_id", Long.valueOf(i22.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(i22.q()));
        contentValues.put("admob_app_id", i22.r0());
        contentValues.put("dynamite_version", Long.valueOf(i22.c0()));
        contentValues.put("session_stitching_token", i22.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(i22.t()));
        contentValues.put("target_os_version", Long.valueOf(i22.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(i22.o0()));
        if (C0917g7.a() && f().B(t02, K.f4789L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(i22.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(i22.D()));
        }
        if (C0934i6.a() && f().B(t02, K.f4815Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(i22.u()));
        }
        List n7 = i22.n();
        if (n7 != null) {
            if (n7.isEmpty()) {
                j().L().b("Safelisted events should not be an empty list. appId", t02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", n7));
            }
        }
        if (C0988o6.a() && f().s(K.f4861u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (C0979n6.a() && f().B(t02, K.f4805T0)) {
            contentValues.put("npa_metadata_value", i22.q0());
        }
        try {
            SQLiteDatabase B7 = B();
            if (B7.update("apps", contentValues, "app_id = ?", new String[]{t02}) == 0 && B7.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update app (got -1). appId", Y1.v(t02));
            }
        } catch (SQLiteException e7) {
            j().G().c("Error storing app. appId", Y1.v(t02), e7);
        }
    }

    public final boolean U0() {
        return x0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean V0() {
        return x0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void W(String str, C0643z c0643z) {
        if (C0979n6.a() && f().s(K.f4805T0)) {
            AbstractC0328n.i(str);
            AbstractC0328n.i(c0643z);
            n();
            u();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", c0643z.i());
            Y("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean W0() {
        return x0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final void X(String str, C0585q3 c0585q3) {
        AbstractC0328n.i(str);
        AbstractC0328n.i(c0585q3);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c0585q3.v());
        if (C0979n6.a() && f().s(K.f4805T0)) {
            contentValues.put("consent_source", Integer.valueOf(c0585q3.b()));
            Y("consent_settings", "app_id", contentValues);
            return;
        }
        try {
            if (B().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update consent setting (got -1). appId", Y1.v(str));
            }
        } catch (SQLiteException e7) {
            j().G().c("Error storing consent setting. appId, error", Y1.v(str), e7);
        }
    }

    public final void Y(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase B7 = B();
            if (contentValues.getAsString(str2) == null) {
                j().H().b("Value of the primary key is not set.", Y1.v(str2));
                return;
            }
            if (B7.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && B7.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                j().G().c("Failed to insert/update table (got -1). key", Y1.v(str), Y1.v(str2));
            }
        } catch (SQLiteException e7) {
            j().G().d("Error storing into table. key", Y1.v(str), Y1.v(str2), e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        r8.c(r10, r11, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.Z(java.lang.String, java.util.List):void");
    }

    public final void a0(List list) {
        n();
        u();
        AbstractC0328n.i(list);
        AbstractC0328n.k(list.size());
        if (u0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (x0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                j().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e7) {
                j().G().b("Error incrementing retry count. error", e7);
            }
        }
    }

    public final boolean b0(C0497e c0497e) {
        AbstractC0328n.i(c0497e);
        n();
        u();
        String str = c0497e.f5263o;
        AbstractC0328n.i(str);
        if (F0(str, c0497e.f5265q.f4991p) == null && x0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0497e.f5264p);
        contentValues.put("name", c0497e.f5265q.f4991p);
        V(contentValues, "value", AbstractC0328n.i(c0497e.f5265q.a()));
        contentValues.put("active", Boolean.valueOf(c0497e.f5267s));
        contentValues.put("trigger_event_name", c0497e.f5268t);
        contentValues.put("trigger_timeout", Long.valueOf(c0497e.f5270v));
        k();
        contentValues.put("timed_out_event", S5.p0(c0497e.f5269u));
        contentValues.put("creation_timestamp", Long.valueOf(c0497e.f5266r));
        k();
        contentValues.put("triggered_event", S5.p0(c0497e.f5271w));
        contentValues.put("triggered_timestamp", Long.valueOf(c0497e.f5265q.f4992q));
        contentValues.put("time_to_live", Long.valueOf(c0497e.f5272x));
        k();
        contentValues.put("expired_event", S5.p0(c0497e.f5273y));
        try {
            if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert/update conditional user property (got -1)", Y1.v(str));
            return true;
        } catch (SQLiteException e7) {
            j().G().c("Error storing conditional user property", Y1.v(str), e7);
            return true;
        }
    }

    public final boolean c0(A a7, long j7, boolean z7) {
        n();
        u();
        AbstractC0328n.i(a7);
        AbstractC0328n.e(a7.f4535a);
        byte[] h7 = o().F(a7).h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a7.f4535a);
        contentValues.put("name", a7.f4536b);
        contentValues.put("timestamp", Long.valueOf(a7.f4538d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j7));
        contentValues.put("data", h7);
        contentValues.put("realtime", Integer.valueOf(z7 ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            j().G().b("Failed to insert raw event (got -1). appId", Y1.v(a7.f4535a));
            return false;
        } catch (SQLiteException e7) {
            j().G().c("Error storing raw event. appId", Y1.v(a7.f4535a), e7);
            return false;
        }
    }

    public final boolean d0(T5 t52) {
        AbstractC0328n.i(t52);
        n();
        u();
        if (F0(t52.f5045a, t52.f5047c) == null) {
            if (S5.J0(t52.f5047c)) {
                if (x0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{t52.f5045a}) >= f().q(t52.f5045a, K.f4782I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(t52.f5047c) && x0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{t52.f5045a, t52.f5046b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t52.f5045a);
        contentValues.put("origin", t52.f5046b);
        contentValues.put("name", t52.f5047c);
        contentValues.put("set_timestamp", Long.valueOf(t52.f5048d));
        V(contentValues, "value", t52.f5049e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert/update user property (got -1). appId", Y1.v(t52.f5045a));
            return true;
        } catch (SQLiteException e7) {
            j().G().c("Error storing user property. appId", Y1.v(t52.f5045a), e7);
            return true;
        }
    }

    public final boolean e0(C0885d2 c0885d2, boolean z7) {
        C0472a2 G6;
        Object v7;
        String str;
        n();
        u();
        AbstractC0328n.i(c0885d2);
        AbstractC0328n.e(c0885d2.D3());
        AbstractC0328n.l(c0885d2.T0());
        S0();
        long a7 = b().a();
        if (c0885d2.X2() < a7 - C0511g.M() || c0885d2.X2() > C0511g.M() + a7) {
            j().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", Y1.v(c0885d2.D3()), Long.valueOf(a7), Long.valueOf(c0885d2.X2()));
        }
        try {
            byte[] g02 = o().g0(c0885d2.h());
            j().K().b("Saving bundle, size", Integer.valueOf(g02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c0885d2.D3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c0885d2.X2()));
            contentValues.put("data", g02);
            contentValues.put("has_realtime", Integer.valueOf(z7 ? 1 : 0));
            if (c0885d2.a1()) {
                contentValues.put("retry_count", Integer.valueOf(c0885d2.e2()));
            }
            try {
                if (B().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                j().G().b("Failed to insert bundle (got -1). appId", Y1.v(c0885d2.D3()));
                return false;
            } catch (SQLiteException e7) {
                e = e7;
                G6 = j().G();
                v7 = Y1.v(c0885d2.D3());
                str = "Error storing bundle. appId";
                G6.c(str, v7, e);
                return false;
            }
        } catch (IOException e8) {
            e = e8;
            G6 = j().G();
            v7 = Y1.v(c0885d2.D3());
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    public final boolean f0(String str, int i7, C1063x1 c1063x1) {
        u();
        n();
        AbstractC0328n.e(str);
        AbstractC0328n.i(c1063x1);
        if (c1063x1.P().isEmpty()) {
            j().L().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", Y1.v(str), Integer.valueOf(i7), String.valueOf(c1063x1.V() ? Integer.valueOf(c1063x1.L()) : null));
            return false;
        }
        byte[] h7 = c1063x1.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i7));
        contentValues.put("filter_id", c1063x1.V() ? Integer.valueOf(c1063x1.L()) : null);
        contentValues.put("event_name", c1063x1.P());
        contentValues.put("session_scoped", c1063x1.W() ? Boolean.valueOf(c1063x1.T()) : null);
        contentValues.put("data", h7);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert event filter (got -1). appId", Y1.v(str));
            return true;
        } catch (SQLiteException e7) {
            j().G().c("Error storing event filter. appId", Y1.v(str), e7);
            return false;
        }
    }

    public final boolean g0(String str, int i7, com.google.android.gms.internal.measurement.A1 a12) {
        u();
        n();
        AbstractC0328n.e(str);
        AbstractC0328n.i(a12);
        if (a12.L().isEmpty()) {
            j().L().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", Y1.v(str), Integer.valueOf(i7), String.valueOf(a12.P() ? Integer.valueOf(a12.k()) : null));
            return false;
        }
        byte[] h7 = a12.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i7));
        contentValues.put("filter_id", a12.P() ? Integer.valueOf(a12.k()) : null);
        contentValues.put("property_name", a12.L());
        contentValues.put("session_scoped", a12.Q() ? Boolean.valueOf(a12.O()) : null);
        contentValues.put("data", h7);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert property filter (got -1). appId", Y1.v(str));
            return false;
        } catch (SQLiteException e7) {
            j().G().c("Error storing property filter. appId", Y1.v(str), e7);
            return false;
        }
    }

    public final boolean h0(String str, C0621v5 c0621v5) {
        n();
        u();
        AbstractC0328n.i(c0621v5);
        AbstractC0328n.e(str);
        long a7 = b().a();
        if (c0621v5.f5564p < a7 - C0511g.M() || c0621v5.f5564p > C0511g.M() + a7) {
            j().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", Y1.v(str), Long.valueOf(a7), Long.valueOf(c0621v5.f5564p));
        }
        j().K().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c0621v5.f5563o);
        contentValues.put("source", Integer.valueOf(c0621v5.f5565q));
        contentValues.put("timestamp_millis", Long.valueOf(c0621v5.f5564p));
        try {
            if (B().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            j().G().b("Failed to insert trigger URI (got -1). appId", Y1.v(str));
            return false;
        } catch (SQLiteException e7) {
            j().G().c("Error storing trigger URI. appId", Y1.v(str), e7);
            return false;
        }
    }

    public final boolean i0(String str, Bundle bundle) {
        n();
        u();
        byte[] h7 = o().F(new A(this.f5424a, "", str, "dep", 0L, 0L, bundle)).h();
        j().K().c("Saving default event parameters, appId, data size", h().c(str), Integer.valueOf(h7.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h7);
        try {
            if (B().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert default event parameters (got -1). appId", Y1.v(str));
            return false;
        } catch (SQLiteException e7) {
            j().G().c("Error storing default event parameters. appId", Y1.v(str), e7);
            return false;
        }
    }

    public final boolean j0(String str, Long l7, long j7, com.google.android.gms.internal.measurement.Y1 y12) {
        n();
        u();
        AbstractC0328n.i(y12);
        AbstractC0328n.e(str);
        AbstractC0328n.i(l7);
        byte[] h7 = y12.h();
        j().K().c("Saving complex main event, appId, data size", h().c(str), Integer.valueOf(h7.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j7));
        contentValues.put("main_event", h7);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert complex main event (got -1). appId", Y1.v(str));
            return false;
        } catch (SQLiteException e7) {
            j().G().c("Error storing complex main event. appId", Y1.v(str), e7);
            return false;
        }
    }

    public final boolean u0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long v0(String str) {
        AbstractC0328n.e(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final long w0(String str, String str2) {
        AbstractC0328n.e(str);
        AbstractC0328n.e(str2);
        n();
        u();
        SQLiteDatabase B7 = B();
        B7.beginTransaction();
        long j7 = 0;
        try {
            try {
                long G6 = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (G6 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (B7.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        j().G().c("Failed to insert column (got -1). appId", Y1.v(str), str2);
                        return -1L;
                    }
                    G6 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + G6));
                    if (B7.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        j().G().c("Failed to update column (got 0). appId", Y1.v(str), str2);
                        return -1L;
                    }
                    B7.setTransactionSuccessful();
                    return G6;
                } catch (SQLiteException e7) {
                    long j8 = G6;
                    e = e7;
                    j7 = j8;
                    j().G().d("Error inserting column. appId", Y1.v(str), str2, e);
                    B7.endTransaction();
                    return j7;
                }
            } catch (SQLiteException e8) {
                e = e8;
            }
        } finally {
            B7.endTransaction();
        }
    }

    @Override // R2.C5
    public final boolean x() {
        return false;
    }

    public final long x0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j7 = rawQuery.getLong(0);
                rawQuery.close();
                return j7;
            } catch (SQLiteException e7) {
                j().G().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long y() {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j7 = cursor.getLong(0);
                cursor.close();
                return j7;
            } catch (SQLiteException e7) {
                j().G().b("Error querying raw events", e7);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        j().G().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List y0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0574p.y0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final boolean z0(String str, List list) {
        AbstractC0328n.e(str);
        u();
        n();
        SQLiteDatabase B7 = B();
        try {
            long x02 = x0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, f().u(str, K.f4780H)));
            if (x02 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                Integer num = (Integer) list.get(i7);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return B7.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e7) {
            j().G().c("Database error querying filters. appId", Y1.v(str), e7);
            return false;
        }
    }
}
