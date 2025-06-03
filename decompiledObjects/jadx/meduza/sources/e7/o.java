package e7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoy;
import e7.e3;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends h6 {

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f4525o = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f4526p = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"};

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f4527q = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f4528r = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f4529s = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] t = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f4530u = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f4531v = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f4532w = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f4533x = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f4534y = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: e, reason: collision with root package name */
    public final t f4535e;
    public final pb.c f;

    public o(i6 i6Var) {
        super(i6Var);
        this.f = new pb.c(zzb());
        this.f4535e = new t(this, zza());
    }

    public static void G(ContentValues contentValues, Object obj) {
        m6.j.e("value");
        m6.j.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final Object A(int i10, Cursor cursor) {
        int type = cursor.getType(i10);
        if (type == 0) {
            zzj().f4060o.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            zzj().f4060o.c("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().f4060o.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void A0() {
        p();
        s().endTransaction();
    }

    public final String B(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = s().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e10) {
                zzj().f4060o.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void B0() {
        l();
        p();
        if (Y()) {
            long a10 = this.f4804c.f4337q.f.a();
            ((b.z) zzb()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a10) > h0.I.a(null).longValue()) {
                this.f4804c.f4337q.f.b(elapsedRealtime);
                l();
                p();
                if (Y()) {
                    SQLiteDatabase s10 = s();
                    ((b.z) zzb()).getClass();
                    int delete = s10.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(h.z())});
                    if (delete > 0) {
                        zzj().f4067w.c("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final List<n6> C(String str, d6 d6Var, int i10) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        if (!h().x(null, h0.K0)) {
            return Collections.emptyList();
        }
        m6.j.e(str);
        l();
        p();
        try {
            try {
                SQLiteDatabase s10 = s();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id"};
                List<Integer> list = d6Var.f4153a;
                Cursor query = s10.query("upload_queue", strArr, "app_id=?" + (list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list))) + " AND NOT " + Z(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (query.moveToNext()) {
                        cursor2 = query;
                        try {
                            n6 z10 = z(str, query.getLong(0), query.getBlob(2), query.getString(3), query.getString(4), query.getInt(5), query.getInt(6), query.getLong(7), query.getLong(8));
                            if (z10 != null) {
                                arrayList.add(z10);
                            }
                            query = cursor2;
                        } catch (SQLiteException e10) {
                            e = e10;
                            cursor3 = cursor2;
                            zzj().f4060o.d("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                            List<n6> emptyList = Collections.emptyList();
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            return emptyList;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    query.close();
                    return arrayList;
                } catch (SQLiteException e11) {
                    e = e11;
                    cursor2 = query;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = query;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = cursor3;
            }
        } catch (SQLiteException e12) {
            e = e12;
        }
    }

    public final void C0() {
        p();
        s().setTransactionSuccessful();
    }

    public final List<f> D(String str, String str2, String str3) {
        m6.j.e(str);
        l();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return E(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        zzj().f4060o.c("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<e7.f> E(java.lang.String r25, java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.E(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void F(ContentValues contentValues) {
        try {
            SQLiteDatabase s10 = s();
            if (contentValues.getAsString("app_id") == null) {
                zzj().f4062q.c("Value of the primary key is not set.", a1.p("app_id"));
            } else if (s10.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && s10.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzj().f4060o.d("Failed to insert/update table (got -1). key", a1.p("consent_settings"), a1.p("app_id"));
            }
        } catch (SQLiteException e10) {
            zzj().f4060o.a(a1.p("consent_settings"), a1.p("app_id"), e10, "Error storing into table. key");
        }
    }

    public final void H(zzgf.zzk zzkVar, boolean z10) {
        b1 b1Var;
        e1 p10;
        String str;
        l();
        p();
        m6.j.i(zzkVar);
        m6.j.e(zzkVar.zzab());
        if (!zzkVar.zzbm()) {
            throw new IllegalStateException();
        }
        B0();
        ((b.z) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzkVar.zzn() < currentTimeMillis - h.z() || zzkVar.zzn() > h.z() + currentTimeMillis) {
            zzj().f4063r.a(a1.p(zzkVar.zzab()), Long.valueOf(currentTimeMillis), Long.valueOf(zzkVar.zzn()), "Storing bundle outside of the max uploading time span. appId, now, timestamp");
        }
        try {
            byte[] V = m().V(zzkVar.zzce());
            zzj().f4067w.c("Saving bundle, size", Integer.valueOf(V.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.zzab());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzn()));
            contentValues.put("data", V);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzkVar.zzbt()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (s().insert("queue", null, contentValues) == -1) {
                    zzj().f4060o.c("Failed to insert bundle (got -1). appId", a1.p(zzkVar.zzab()));
                }
            } catch (SQLiteException e10) {
                e = e10;
                b1Var = zzj().f4060o;
                p10 = a1.p(zzkVar.zzab());
                str = "Error storing bundle. appId";
                b1Var.d(str, p10, e);
            }
        } catch (IOException e11) {
            e = e11;
            b1Var = zzj().f4060o;
            p10 = a1.p(zzkVar.zzab());
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    public final void I(b0 b0Var) {
        L("events", b0Var);
    }

    public final void J(k1 k1Var, boolean z10) {
        e3.a aVar = e3.a.ANALYTICS_STORAGE;
        l();
        p();
        String f = k1Var.f();
        m6.j.i(f);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f4804c.H(f).j(aVar)) {
            contentValues.put("app_instance_id", k1Var.g());
        }
        contentValues.put("gmp_app_id", k1Var.j());
        if (this.f4804c.H(f).j(e3.a.AD_STORAGE)) {
            k1Var.f4393a.zzl().l();
            contentValues.put("resettable_device_id_hash", k1Var.f4397e);
        }
        k1Var.f4393a.zzl().l();
        contentValues.put("last_bundle_index", Long.valueOf(k1Var.f4398g));
        k1Var.f4393a.zzl().l();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(k1Var.f4399h));
        k1Var.f4393a.zzl().l();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(k1Var.f4400i));
        contentValues.put("app_version", k1Var.h());
        k1Var.f4393a.zzl().l();
        contentValues.put("app_store", k1Var.f4403l);
        k1Var.f4393a.zzl().l();
        contentValues.put("gmp_version", Long.valueOf(k1Var.f4404m));
        k1Var.f4393a.zzl().l();
        contentValues.put("dev_cert_hash", Long.valueOf(k1Var.f4405n));
        k1Var.f4393a.zzl().l();
        contentValues.put("measurement_enabled", Boolean.valueOf(k1Var.f4406o));
        k1Var.f4393a.zzl().l();
        contentValues.put("day", Long.valueOf(k1Var.K));
        k1Var.f4393a.zzl().l();
        contentValues.put("daily_public_events_count", Long.valueOf(k1Var.L));
        k1Var.f4393a.zzl().l();
        contentValues.put("daily_events_count", Long.valueOf(k1Var.M));
        k1Var.f4393a.zzl().l();
        contentValues.put("daily_conversions_count", Long.valueOf(k1Var.N));
        k1Var.f4393a.zzl().l();
        contentValues.put("config_fetched_time", Long.valueOf(k1Var.S));
        k1Var.f4393a.zzl().l();
        contentValues.put("failed_config_fetch_time", Long.valueOf(k1Var.T));
        contentValues.put("app_version_int", Long.valueOf(k1Var.w()));
        contentValues.put("firebase_instance_id", k1Var.i());
        k1Var.f4393a.zzl().l();
        contentValues.put("daily_error_events_count", Long.valueOf(k1Var.O));
        k1Var.f4393a.zzl().l();
        contentValues.put("daily_realtime_events_count", Long.valueOf(k1Var.P));
        k1Var.f4393a.zzl().l();
        contentValues.put("health_monitor_sample", k1Var.Q);
        contentValues.put("android_id", (Long) 0L);
        k1Var.f4393a.zzl().l();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(k1Var.f4407p));
        contentValues.put("admob_app_id", k1Var.d());
        k1Var.f4393a.zzl().l();
        contentValues.put("dynamite_version", Long.valueOf(k1Var.f4410s));
        if (this.f4804c.H(f).j(aVar)) {
            k1Var.f4393a.zzl().l();
            contentValues.put("session_stitching_token", k1Var.f4411u);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(k1Var.l()));
        k1Var.f4393a.zzl().l();
        contentValues.put("target_os_version", Long.valueOf(k1Var.f4413w));
        k1Var.f4393a.zzl().l();
        contentValues.put("session_stitching_token_hash", Long.valueOf(k1Var.f4414x));
        if (zzoy.zza() && h().x(f, h0.Q0)) {
            k1Var.f4393a.zzl().l();
            contentValues.put("ad_services_version", Integer.valueOf(k1Var.f4415y));
            k1Var.f4393a.zzl().l();
            contentValues.put("attribution_eligibility_status", Long.valueOf(k1Var.C));
        }
        k1Var.f4393a.zzl().l();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(k1Var.f4416z));
        k1Var.f4393a.zzl().l();
        contentValues.put("npa_metadata_value", k1Var.f4409r);
        k1Var.f4393a.zzl().l();
        contentValues.put("bundle_delivery_index", Long.valueOf(k1Var.G));
        contentValues.put("sgtm_preview_key", k1Var.k());
        k1Var.f4393a.zzl().l();
        contentValues.put("dma_consent_state", Integer.valueOf(k1Var.E));
        k1Var.f4393a.zzl().l();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(k1Var.F));
        k1Var.f4393a.zzl().l();
        contentValues.put("serialized_npa_metadata", k1Var.H);
        if (h().x(f, h0.K0)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(k1Var.m()));
        }
        k1Var.f4393a.zzl().l();
        ArrayList arrayList = k1Var.t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                zzj().f4063r.c("Safelisted events should not be an empty list. appId", f);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (zzog.zza() && h().x(null, h0.F0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        k1Var.f4393a.zzl().l();
        contentValues.put("unmatched_pfo", k1Var.A);
        k1Var.f4393a.zzl().l();
        contentValues.put("unmatched_uwa", k1Var.B);
        k1Var.f4393a.zzl().l();
        contentValues.put("ad_campaign_info", k1Var.I);
        try {
            SQLiteDatabase s10 = s();
            if (s10.update("apps", contentValues, "app_id = ?", new String[]{f}) == 0 && s10.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().f4060o.c("Failed to insert/update app (got -1). appId", a1.p(f));
            }
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing app. appId", a1.p(f), e10);
        }
    }

    public final void K(Long l10) {
        l();
        p();
        m6.j.i(l10);
        if (h().x(null, h0.I0)) {
            try {
                if (s().delete("upload_queue", "rowid=?", new String[]{String.valueOf(l10)}) != 1) {
                    zzj().f4063r.b("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e10) {
                zzj().f4060o.c("Failed to delete a MeasurementBatch in a upload_queue table", e10);
                throw e10;
            }
        }
    }

    public final void L(String str, b0 b0Var) {
        m6.j.i(b0Var);
        l();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b0Var.f4087a);
        contentValues.put("name", b0Var.f4088b);
        contentValues.put("lifetime_count", Long.valueOf(b0Var.f4089c));
        contentValues.put("current_bundle_count", Long.valueOf(b0Var.f4090d));
        contentValues.put("last_fire_timestamp", Long.valueOf(b0Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(b0Var.f4092g));
        contentValues.put("last_bundled_day", b0Var.f4093h);
        contentValues.put("last_sampled_complex_event_id", b0Var.f4094i);
        contentValues.put("last_sampling_rate", b0Var.f4095j);
        contentValues.put("current_session_count", Long.valueOf(b0Var.f4091e));
        Boolean bool = b0Var.f4096k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (s().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().f4060o.c("Failed to insert/update event aggregates (got -1). appId", a1.p(b0Var.f4087a));
            }
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing event aggregates. appId", a1.p(b0Var.f4087a), e10);
        }
    }

    public final void M(String str, e3 e3Var) {
        m6.j.i(str);
        l();
        p();
        f0(str, q0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", e3Var.n());
        F(contentValues);
    }

    public final void N(String str, w5 w5Var) {
        l();
        p();
        m6.j.e(str);
        ((b.z) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = w5Var.f4741b;
        m0<Long> m0Var = h0.f4268q0;
        if (j10 < currentTimeMillis - m0Var.a(null).longValue() || w5Var.f4741b > m0Var.a(null).longValue() + currentTimeMillis) {
            zzj().f4063r.a(a1.p(str), Long.valueOf(currentTimeMillis), Long.valueOf(w5Var.f4741b), "Storing trigger URI outside of the max retention time span. appId, now, timestamp");
        }
        zzj().f4067w.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", w5Var.f4740a);
        contentValues.put("source", Integer.valueOf(w5Var.f4742c));
        contentValues.put("timestamp_millis", Long.valueOf(w5Var.f4741b));
        try {
            if (s().insert("trigger_uris", null, contentValues) == -1) {
                zzj().f4060o.c("Failed to insert trigger URI (got -1). appId", a1.p(str));
            }
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing trigger URI. appId", a1.p(str), e10);
        }
    }

    public final void O(String str, Long l10, long j10, zzgf.zzf zzfVar) {
        l();
        p();
        m6.j.i(zzfVar);
        m6.j.e(str);
        byte[] zzce = zzfVar.zzce();
        zzj().f4067w.d("Saving complex main event, appId, data size", i().c(str), Integer.valueOf(zzce.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzce);
        try {
            if (s().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzj().f4060o.c("Failed to insert complex main event (got -1). appId", a1.p(str));
            }
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing complex main event. appId", a1.p(str), e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:11|(10:13|14|15|16|17|(1:19)(11:77|78|79|81|82|(1:84)|85|86|(3:22|(3:25|(2:27|28)(1:74)|23)|75)|76|(1:30)(2:73|68))|20|(0)|76|(0)(0))(2:110|111)|31|(4:34|(2:36|37)(2:39|(2:41|42)(2:43|(2:45|46)(2:47|(2:49|50)(2:51|(2:53|54)(2:55|56)))))|38|32)|57|58|(1:60)(1:72)|61|62|63|(1:65)|66|67|68|9) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0285, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0286, code lost:
    
        zzj().f4060o.d("Error updating raw event. appId", e7.a1.p(r10.f4766a), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ef, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.P(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    public final void Q(String str, String str2) {
        m6.j.e(str);
        m6.j.e(str2);
        l();
        p();
        try {
            s().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().f4060o.a(a1.p(str), i().g(str2), e10, "Error deleting conditional property");
        }
    }

    public final void R(List<Long> list) {
        l();
        p();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (Y()) {
            String j10 = a0.j.j("(", TextUtils.join(",", list), ")");
            if (b0("SELECT COUNT(1) FROM queue WHERE rowid IN " + j10 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().f4063r.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                s().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + j10 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                zzj().f4060o.c("Error incrementing retry count. error", e10);
            }
        }
    }

    public final boolean S(f fVar) {
        l();
        p();
        String str = fVar.f4182a;
        m6.j.i(str);
        if (m0(str, fVar.f4184c.f4599b) == null && b0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", fVar.f4183b);
        contentValues.put("name", fVar.f4184c.f4599b);
        Object D = fVar.f4184c.D();
        m6.j.i(D);
        G(contentValues, D);
        contentValues.put("active", Boolean.valueOf(fVar.f4186e));
        contentValues.put("trigger_event_name", fVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(fVar.f4188p));
        k();
        contentValues.put("timed_out_event", r6.a0(fVar.f4187o));
        contentValues.put("creation_timestamp", Long.valueOf(fVar.f4185d));
        k();
        contentValues.put("triggered_event", r6.a0(fVar.f4189q));
        contentValues.put("triggered_timestamp", Long.valueOf(fVar.f4184c.f4600c));
        contentValues.put("time_to_live", Long.valueOf(fVar.f4190r));
        k();
        contentValues.put("expired_event", r6.a0(fVar.f4191s));
        try {
            if (s().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzj().f4060o.c("Failed to insert/update conditional user property (got -1)", a1.p(str));
            }
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing conditional user property", a1.p(str), e10);
        }
        return true;
    }

    public final boolean T(y yVar, long j10, boolean z10) {
        l();
        p();
        m6.j.e(yVar.f4766a);
        byte[] zzce = m().x(yVar).zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", yVar.f4766a);
        contentValues.put("name", yVar.f4767b);
        contentValues.put(Constants.TIMESTAMP, Long.valueOf(yVar.f4769d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", zzce);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (s().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().f4060o.c("Failed to insert raw event (got -1). appId", a1.p(yVar.f4766a));
            return false;
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing raw event. appId", a1.p(yVar.f4766a), e10);
            return false;
        }
    }

    public final boolean U(s6 s6Var) {
        l();
        p();
        if (m0(s6Var.f4649a, s6Var.f4651c) == null) {
            if (r6.t0(s6Var.f4651c)) {
                if (b0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{s6Var.f4649a}) >= h().m(s6Var.f4649a, h0.R, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(s6Var.f4651c) && b0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{s6Var.f4649a, s6Var.f4650b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s6Var.f4649a);
        contentValues.put("origin", s6Var.f4650b);
        contentValues.put("name", s6Var.f4651c);
        contentValues.put("set_timestamp", Long.valueOf(s6Var.f4652d));
        G(contentValues, s6Var.f4653e);
        try {
            if (s().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().f4060o.c("Failed to insert/update user property (got -1). appId", a1.p(s6Var.f4649a));
            }
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing user property. appId", a1.p(s6Var.f4649a), e10);
        }
        return true;
    }

    public final boolean V(String str, int i10, zzfw.zzb zzbVar) {
        p();
        l();
        m6.j.e(str);
        m6.j.i(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().f4063r.a(a1.p(str), Integer.valueOf(i10), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null), "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId");
            return false;
        }
        byte[] zzce = zzbVar.zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzce);
        try {
            if (s().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f4060o.c("Failed to insert event filter (got -1). appId", a1.p(str));
            return true;
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing event filter. appId", a1.p(str), e10);
            return false;
        }
    }

    public final boolean W(String str, int i10, zzfw.zze zzeVar) {
        p();
        l();
        m6.j.e(str);
        m6.j.i(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().f4063r.a(a1.p(str), Integer.valueOf(i10), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null), "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId");
            return false;
        }
        byte[] zzce = zzeVar.zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzce);
        try {
            if (s().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f4060o.c("Failed to insert property filter (got -1). appId", a1.p(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing property filter. appId", a1.p(str), e10);
            return false;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzgf$zzj;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;Ljava/lang/Long;)J */
    public final long X(String str, zzgf.zzj zzjVar, String str2, Map map, int i10, Long l10) {
        int delete;
        l();
        p();
        m6.j.i(zzjVar);
        m6.j.e(str);
        if (!h().x(null, h0.I0)) {
            return -1L;
        }
        l();
        p();
        int i11 = 1;
        if (Y()) {
            long a10 = this.f4804c.f4337q.f4471o.a();
            ((b.z) zzb()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a10) > h0.I.a(null).longValue()) {
                this.f4804c.f4337q.f4471o.b(elapsedRealtime);
                l();
                p();
                if (Y() && (delete = s().delete("upload_queue", Z(), new String[0])) > 0) {
                    zzj().f4067w.c("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                if (h().x(null, h0.K0)) {
                    m6.j.e(str);
                    l();
                    p();
                    try {
                        int q10 = h().q(str, h0.f4278w);
                        if (q10 > 0) {
                            s().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(q10)});
                        }
                    } catch (SQLiteException e10) {
                        zzj().f4060o.d("Error deleting over the limit queued batches. appId", a1.p(str), e10);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        byte[] zzce = zzjVar.zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzce);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            Object obj = arrayList.get(0);
            while (true) {
                sb2.append((CharSequence) obj);
                if (i11 >= size) {
                    break;
                }
                sb2.append((CharSequence) "\r\n");
                obj = arrayList.get(i11);
                i11++;
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(defpackage.g.a(i10)));
        ((b.z) zzb()).getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long insert = s().insert("upload_queue", null, contentValues);
            if (insert == -1) {
                zzj().f4060o.c("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            }
            return insert;
        } catch (SQLiteException e11) {
            zzj().f4060o.d("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    public final boolean Y() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final String Z() {
        ((b.z) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        return "(" + String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", 1, Long.valueOf(currentTimeMillis), Long.valueOf(h0.O.a(null).longValue())) + " OR " + String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", 1, Long.valueOf(currentTimeMillis), Long.valueOf(h.z())) + ")";
    }

    public final long a0(String str) {
        long j10;
        SQLiteException e10;
        ContentValues contentValues;
        m6.j.e(str);
        m6.j.e("first_open_count");
        l();
        p();
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            try {
                j10 = w("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j10 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (s10.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        zzj().f4060o.d("Failed to insert column (got -1). appId", a1.p(str), "first_open_count");
                        return -1L;
                    }
                    j10 = 0;
                }
            } catch (SQLiteException e11) {
                j10 = 0;
                e10 = e11;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Long.valueOf(1 + j10));
            } catch (SQLiteException e12) {
                e10 = e12;
                zzj().f4060o.a(a1.p(str), "first_open_count", e10, "Error inserting column. appId");
                return j10;
            }
            if (s10.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzj().f4060o.d("Failed to update column (got 0). appId", a1.p(str), "first_open_count");
                return -1L;
            }
            s10.setTransactionSuccessful();
            return j10;
        } finally {
            s10.endTransaction();
        }
    }

    public final long b0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = s().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                zzj().f4060o.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c0(long r5) {
        /*
            r4 = this;
            r4.l()
            r4.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.s()     // Catch: java.lang.Throwable -> L3a android.database.sqlite.SQLiteException -> L3c
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3a android.database.sqlite.SQLiteException -> L3c
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3a android.database.sqlite.SQLiteException -> L3c
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3a android.database.sqlite.SQLiteException -> L3c
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3a android.database.sqlite.SQLiteException -> L3c
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L4f
            if (r1 != 0) goto L30
            e7.a1 r6 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L4f
            e7.b1 r6 = r6.f4067w     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L4f
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.b(r1)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L4f
            r5.close()
            return r0
        L30:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L4f
            r5.close()
            return r6
        L38:
            r6 = move-exception
            goto L3e
        L3a:
            r6 = move-exception
            goto L51
        L3c:
            r6 = move-exception
            r5 = r0
        L3e:
            e7.a1 r1 = r4.zzj()     // Catch: java.lang.Throwable -> L4f
            e7.b1 r1 = r1.f4060o     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "Error selecting expired configs"
            r1.c(r2, r6)     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L4e
            r5.close()
        L4e:
            return r0
        L4f:
            r6 = move-exception
            r0 = r5
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.c0(long):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        zzj().f4060o.c("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<e7.s6> d0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void e0(Long l10) {
        l();
        p();
        m6.j.i(l10);
        if (h().x(null, h0.I0) && Y()) {
            if (b0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l10 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().f4063r.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                s().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l10 + " AND retry_count < 2147483647");
            } catch (SQLiteException e10) {
                zzj().f4060o.c("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void f0(String str, e3 e3Var) {
        m6.j.i(str);
        m6.j.i(e3Var);
        l();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", e3Var.n());
        contentValues.put("consent_source", Integer.valueOf(e3Var.f4167b));
        F(contentValues);
    }

    public final void g0(String str, ArrayList arrayList) {
        m6.j.e(str);
        p();
        l();
        SQLiteDatabase s10 = s();
        try {
            long b02 = b0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, h().q(str, h0.Q)));
            if (b02 <= max) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            s10.delete("audience_filter_values", a0.j.j("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a0.j.j("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)});
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Database error querying filters. appId", a1.p(str), e10);
        }
    }

    public final long h0(String str) {
        m6.j.e(str);
        return w("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.f i0(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.i0(java.lang.String, java.lang.String):e7.f");
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0143: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:324), block:B:69:0x0143 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.b0 j0(java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.j0(java.lang.String, java.lang.String, java.lang.String):e7.b0");
    }

    public final b0 k0(String str, String str2) {
        return j0("events", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x040e A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0439 A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04bb A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e8 A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a7 A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x025a A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01c5 A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269 A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0287 A[Catch: SQLiteException -> 0x02a8, all -> 0x04fd, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x02a8, blocks: (B:5:0x0081, B:10:0x008b, B:12:0x00a2, B:13:0x00a9, B:15:0x00be, B:16:0x00c6, B:18:0x0108, B:22:0x0112, B:25:0x012f, B:28:0x014e, B:31:0x016d, B:34:0x018c, B:36:0x01a0, B:39:0x01b4, B:41:0x01bb, B:44:0x01ca, B:47:0x01f0, B:50:0x020f, B:52:0x0225, B:56:0x022f, B:59:0x0241, B:61:0x0248, B:64:0x025e, B:66:0x0269, B:67:0x027b, B:69:0x0287, B:71:0x028d, B:80:0x02af, B:82:0x02b5, B:86:0x02be, B:89:0x02d0, B:91:0x02d7, B:93:0x02e4, B:96:0x02f6, B:98:0x02fd, B:100:0x0301, B:103:0x0315, B:105:0x031c, B:107:0x0320, B:110:0x0334, B:111:0x0339, B:113:0x033f, B:115:0x034b, B:117:0x0351, B:120:0x0363, B:122:0x036a, B:127:0x0375, B:129:0x037d, B:133:0x0386, B:136:0x0398, B:138:0x039f, B:142:0x03b4, B:144:0x03cd, B:148:0x03ef, B:151:0x0401, B:153:0x0408, B:155:0x040e, B:157:0x0416, B:161:0x0433, B:163:0x0439, B:165:0x0441, B:169:0x045e, B:171:0x0462, B:174:0x0474, B:175:0x0479, B:177:0x0485, B:179:0x048d, B:181:0x0491, B:184:0x04a2, B:188:0x04aa, B:190:0x04bb, B:200:0x03e8, B:203:0x03a7, B:206:0x03b0, B:225:0x025a, B:232:0x01c5), top: B:4:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.k1 l0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.l0(java.lang.String):e7.k1");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.s6 m0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            m6.j.e(r19)
            m6.j.e(r20)
            r18.l()
            r18.p()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.s()     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            if (r3 != 0) goto L3d
            r10.close()
            return r9
        L3d:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            r11 = r18
            java.lang.Object r7 = r11.A(r2, r10)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            if (r7 != 0) goto L4d
            r10.close()
            return r9
        L4d:
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            e7.s6 r0 = new e7.s6     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            if (r1 == 0) goto L70
            e7.a1 r1 = r18.zzj()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            e7.b1 r1 = r1.f4060o     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            e7.e1 r3 = e7.a1.p(r19)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
            r1.c(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La3
        L70:
            r10.close()
            return r0
        L74:
            r0 = move-exception
            goto L86
        L76:
            r0 = move-exception
            r11 = r18
            goto La4
        L7a:
            r0 = move-exception
            r11 = r18
            goto L86
        L7e:
            r0 = move-exception
            r11 = r18
            goto La5
        L82:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L86:
            e7.a1 r1 = r18.zzj()     // Catch: java.lang.Throwable -> La3
            e7.b1 r1 = r1.f4060o     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = "Error querying user property. appId"
            e7.e1 r3 = e7.a1.p(r19)     // Catch: java.lang.Throwable -> La3
            e7.x0 r4 = r18.i()     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = r4.g(r8)     // Catch: java.lang.Throwable -> La3
            r1.a(r3, r4, r0, r2)     // Catch: java.lang.Throwable -> La3
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r9
        La3:
            r0 = move-exception
        La4:
            r9 = r10
        La5:
            if (r9 == 0) goto Laa
            r9.close()
        Laa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.m0(java.lang.String, java.lang.String):e7.s6");
    }

    public final Map<Integer, List<zzfw.zzb>> n0(String str, String str2) {
        Cursor cursor;
        SQLiteException e10;
        p();
        l();
        m6.j.e(str);
        m6.j.e(str2);
        r.b bVar = new r.b();
        Cursor cursor2 = null;
        try {
            try {
                cursor = s().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        Map<Integer, List<zzfw.zzb>> emptyMap = Collections.emptyMap();
                        cursor.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzfw.zzb zzbVar = (zzfw.zzb) ((zzkg) ((zzfw.zzb.zza) o6.z(zzfw.zzb.zzc(), cursor.getBlob(1))).zzaj());
                            int i10 = cursor.getInt(0);
                            List list = (List) bVar.getOrDefault(Integer.valueOf(i10), null);
                            if (list == null) {
                                list = new ArrayList();
                                bVar.put(Integer.valueOf(i10), list);
                            }
                            list.add(zzbVar);
                        } catch (IOException e11) {
                            zzj().f4060o.d("Failed to merge filter. appId", a1.p(str), e11);
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return bVar;
                } catch (SQLiteException e12) {
                    e10 = e12;
                    cursor2 = cursor;
                    zzj().f4060o.d("Database error querying filters. appId", a1.p(str), e10);
                    Map<Integer, List<zzfw.zzb>> emptyMap2 = Collections.emptyMap();
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return emptyMap2;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
            }
        } catch (SQLiteException e13) {
            e10 = e13;
        }
    }

    public final e3 o0(String str) {
        m6.j.i(str);
        l();
        p();
        return e3.l(B("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final Map<Integer, List<zzfw.zze>> p0(String str, String str2) {
        Cursor cursor;
        SQLiteException e10;
        p();
        l();
        m6.j.e(str);
        m6.j.e(str2);
        r.b bVar = new r.b();
        Cursor cursor2 = null;
        try {
            try {
                cursor = s().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        Map<Integer, List<zzfw.zze>> emptyMap = Collections.emptyMap();
                        cursor.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzfw.zze zzeVar = (zzfw.zze) ((zzkg) ((zzfw.zze.zza) o6.z(zzfw.zze.zzc(), cursor.getBlob(1))).zzaj());
                            int i10 = cursor.getInt(0);
                            List list = (List) bVar.getOrDefault(Integer.valueOf(i10), null);
                            if (list == null) {
                                list = new ArrayList();
                                bVar.put(Integer.valueOf(i10), list);
                            }
                            list.add(zzeVar);
                        } catch (IOException e11) {
                            zzj().f4060o.d("Failed to merge filter", a1.p(str), e11);
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return bVar;
                } catch (SQLiteException e12) {
                    e10 = e12;
                    cursor2 = cursor;
                    zzj().f4060o.d("Database error querying filters. appId", a1.p(str), e10);
                    Map<Integer, List<zzfw.zze>> emptyMap2 = Collections.emptyMap();
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return emptyMap2;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
            }
        } catch (SQLiteException e13) {
            e10 = e13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r0 == 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.e3 q0(java.lang.String r7) {
        /*
            r6 = this;
            m6.j.i(r7)
            r6.l()
            r6.p()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
            r2[r3] = r7
            r7 = 0
            android.database.sqlite.SQLiteDatabase r4 = r6.s()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            if (r2 != 0) goto L2c
            e7.a1 r1 = r6.zzj()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            e7.b1 r1 = r1.f4067w     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            java.lang.String r2 = "No data found"
            r1.b(r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            goto L4f
        L2c:
            java.lang.String r2 = r0.getString(r3)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            e7.e3 r7 = e7.e3.c(r1, r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            goto L4f
        L39:
            r7 = move-exception
            goto L57
        L3b:
            r1 = move-exception
            goto L42
        L3d:
            r0 = move-exception
            goto L5a
        L3f:
            r0 = move-exception
            r1 = r0
            r0 = r7
        L42:
            e7.a1 r2 = r6.zzj()     // Catch: java.lang.Throwable -> L39
            e7.b1 r2 = r2.f4060o     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "Error querying database."
            r2.c(r3, r1)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L52
        L4f:
            r0.close()
        L52:
            if (r7 != 0) goto L56
            e7.e3 r7 = e7.e3.f4165c
        L56:
            return r7
        L57:
            r5 = r0
            r0 = r7
            r7 = r5
        L5a:
            if (r7 == 0) goto L5f
            r7.close()
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.q0(java.lang.String):e7.e3");
    }

    @Override // e7.h6
    public final boolean r() {
        return false;
    }

    public final void r0(String str, String str2) {
        m6.j.e(str);
        m6.j.e(str2);
        l();
        p();
        try {
            s().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().f4060o.a(a1.p(str), i().g(str2), e10, "Error deleting user property. appId");
        }
    }

    public final SQLiteDatabase s() {
        l();
        try {
            return this.f4535e.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzj().f4063r.c("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.n6 s0(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.s0(java.lang.String):e7.n6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String t() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.s()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L38
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L38
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L39
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            e7.a1 r3 = r6.zzj()     // Catch: java.lang.Throwable -> L38
            e7.b1 r3 = r3.f4060o     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r4, r2)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L37
            r0.close()
        L37:
            return r1
        L38:
            r1 = move-exception
        L39:
            if (r0 == 0) goto L3e
            r0.close()
        L3e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.t():java.lang.String");
    }

    public final boolean t0(String str, String str2) {
        return b0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long u(zzgf.zzk zzkVar) {
        l();
        p();
        m6.j.i(zzkVar);
        m6.j.e(zzkVar.zzab());
        byte[] zzce = zzkVar.zzce();
        long t10 = m().t(zzce);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.zzab());
        contentValues.put("metadata_fingerprint", Long.valueOf(t10));
        contentValues.put("metadata", zzce);
        try {
            s().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return t10;
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error storing raw event metadata. appId", a1.p(zzkVar.zzab()), e10);
            throw e10;
        }
    }

    public final void u0(String str, String str2) {
        m6.j.e(str2);
        l();
        p();
        try {
            s().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error deleting snapshot. appId", a1.p(str2), e10);
        }
    }

    public final long v(String str) {
        m6.j.e(str);
        l();
        p();
        try {
            return s().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, h().q(str, h0.f4267q))))});
        } catch (SQLiteException e10) {
            zzj().f4060o.d("Error deleting over the limit events. appId", a1.p(str), e10);
            return 0L;
        }
    }

    public final List<s6> v0(String str) {
        m6.j.e(str);
        l();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = s().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object A = A(3, cursor);
                    if (A == null) {
                        zzj().f4060o.c("Read invalid user property value, ignoring it. appId", a1.p(str));
                    } else {
                        arrayList.add(new s6(str, str2, string, j10, A));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().f4060o.d("Error querying user properties. appId", a1.p(str), e10);
                List<s6> emptyList = Collections.emptyList();
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

    public final long w(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = s().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                zzj().f4060o.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void w0(String str) {
        b0 k02;
        u0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = s().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (k02 = k0(str, string)) != null) {
                        L("events_snapshot", k02);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e10) {
                zzj().f4060o.d("Error creating snapshot. appId", a1.p(str), e10);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final p x(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        m6.j.e(str);
        l();
        p();
        String[] strArr = {str};
        p pVar = new p();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase s10 = s();
                Cursor query = s10.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzj().f4063r.c("Not updating daily counts, app is not known. appId", a1.p(str));
                    query.close();
                    return pVar;
                }
                if (query.getLong(0) == j10) {
                    pVar.f4551b = query.getLong(1);
                    pVar.f4550a = query.getLong(2);
                    pVar.f4552c = query.getLong(3);
                    pVar.f4553d = query.getLong(4);
                    pVar.f4554e = query.getLong(5);
                    pVar.f = query.getLong(6);
                    pVar.f4555g = query.getLong(7);
                }
                if (z10) {
                    pVar.f4551b += j11;
                }
                if (z11) {
                    pVar.f4550a += j11;
                }
                if (z12) {
                    pVar.f4552c += j11;
                }
                if (z13) {
                    pVar.f4553d += j11;
                }
                if (z14) {
                    pVar.f4554e += j11;
                }
                if (z15) {
                    pVar.f += j11;
                }
                if (z16) {
                    pVar.f4555g += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(pVar.f4550a));
                contentValues.put("daily_events_count", Long.valueOf(pVar.f4551b));
                contentValues.put("daily_conversions_count", Long.valueOf(pVar.f4552c));
                contentValues.put("daily_error_events_count", Long.valueOf(pVar.f4553d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(pVar.f4554e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(pVar.f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(pVar.f4555g));
                s10.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return pVar;
            } catch (SQLiteException e10) {
                zzj().f4060o.d("Error updating daily counts. appId", a1.p(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return pVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.x0(java.lang.String):void");
    }

    public final p y(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        return x(j10, str, 1L, false, false, z10, false, z11, z12, z13);
    }

    public final void y0() {
        p();
        s().beginTransaction();
    }

    public final n6 z(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12) {
        int i12;
        if (TextUtils.isEmpty(str2)) {
            zzj().f4066v.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzgf.zzj.zzb zzbVar = (zzgf.zzj.zzb) o6.z(zzgf.zzj.zzb(), bArr);
            int[] d10 = q0.g.d(6);
            int length = d10.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i12 = 6;
                    break;
                }
                int i14 = d10[i13];
                if (defpackage.g.a(i14) == i10) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            if (i12 != 2 && i12 != 5 && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<zzgf.zzk> it = zzbVar.zzd().iterator();
                while (it.hasNext()) {
                    zzgf.zzk.zza zzch = it.next().zzch();
                    zzch.zzi(i11);
                    arrayList.add((zzgf.zzk) ((zzkg) zzch.zzaj()));
                }
                zzbVar.zzb();
                zzbVar.zza(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        break;
                    }
                    String str4 = split[i15];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        zzj().f4060o.c("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i15++;
                }
            }
            return new n6(j10, (zzgf.zzj) ((zzkg) zzbVar.zzaj()), str2, hashMap, i12, j12);
        } catch (IOException e10) {
            zzj().f4060o.d("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    public final boolean z0(String str) {
        if (!h().x(null, h0.I0)) {
            return false;
        }
        if (!h().x(null, h0.K0)) {
            return b0(defpackage.f.j("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", Z()), new String[]{str}) != 0;
        }
        int[] iArr = {2};
        ArrayList arrayList = new ArrayList(1);
        for (int i10 = 0; i10 <= 0; i10++) {
            arrayList.add(Integer.valueOf(defpackage.g.a(iArr[0])));
        }
        String format = arrayList.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", arrayList));
        String Z = Z();
        StringBuilder sb2 = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(format);
        sb2.append(" AND NOT ");
        sb2.append(Z);
        return b0(sb2.toString(), new String[]{str}) != 0;
    }
}
