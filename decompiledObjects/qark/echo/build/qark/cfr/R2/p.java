/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Pair
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package R2;

import A2.n;
import R2.A;
import R2.C5;
import R2.D5;
import R2.E;
import R2.I;
import R2.I2;
import R2.K;
import R2.N2;
import R2.N5;
import R2.P1;
import R2.R5;
import R2.S5;
import R2.T5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.e;
import R2.g;
import R2.g5;
import R2.m3;
import R2.o;
import R2.q;
import R2.q2;
import R2.q3;
import R2.r;
import R2.r3;
import R2.s;
import R2.s3;
import R2.t3;
import R2.v;
import R2.v5;
import R2.w5;
import R2.z;
import R2.z5;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.w1;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.y1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.a;

public final class p
extends C5 {
    public static final String[] f = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] h = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
    public static final String[] i = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] j = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] l = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] n = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
    public static final String[] o = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final v d;
    public final w5 e;

    public p(D5 d52) {
        super(d52);
        this.e = new w5(this.b());
        this.d = new v(this, this.a(), "google_app_measurement.db");
    }

    public static /* synthetic */ q3 J(Cursor cursor) {
        return q3.f(cursor.getString(0), cursor.getInt(1));
    }

    public static void V(ContentValues contentValues, String string2, Object object) {
        n.e(string2);
        n.i(object);
        if (object instanceof String) {
            contentValues.put(string2, (String)object);
            return;
        }
        if (object instanceof Long) {
            contentValues.put(string2, (Long)object);
            return;
        }
        if (object instanceof Double) {
            contentValues.put(string2, (Double)object);
            return;
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public final long A() {
        return this.G("select max(timestamp) from raw_events", null, 0L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final e A0(String string2, String string3) {
        void var1_3;
        Cursor cursor;
        block13 : {
            Object object;
            block14 : {
                Object object2;
                block15 : {
                    boolean bl;
                    block12 : {
                        block11 : {
                            n.e(string2);
                            n.e(string3);
                            this.n();
                            this.u();
                            object = null;
                            cursor = this.B().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{string2, string3}, null, null, null);
                            bl = cursor.moveToFirst();
                            if (bl) break block11;
                            cursor.close();
                            return null;
                        }
                        try {
                            object2 = object = cursor.getString(0);
                            if (object != null) break block12;
                            object2 = "";
                        }
                        catch (Throwable throwable) {
                            break block13;
                        }
                        catch (SQLiteException sQLiteException) {
                            break block14;
                        }
                    }
                    object = cursor;
                    try {
                        Object object3 = this.M(cursor, 1);
                        object = cursor;
                        bl = cursor.getInt(2) != 0;
                        object = cursor;
                        String string4 = cursor.getString(3);
                        object = cursor;
                        long l8 = cursor.getLong(4);
                        object = cursor;
                        Object object4 = this.o();
                        object = cursor;
                        Object object5 = cursor.getBlob(5);
                        object = cursor;
                        Object object6 = I.CREATOR;
                        object = cursor;
                        object4 = (I)object4.E((byte[])object5, (Parcelable.Creator)object6);
                        object = cursor;
                        long l9 = cursor.getLong(6);
                        object = cursor;
                        object5 = (I)this.o().E(cursor.getBlob(7), (Parcelable.Creator)object6);
                        object = cursor;
                        long l10 = cursor.getLong(8);
                        object = cursor;
                        long l11 = cursor.getLong(9);
                        object = cursor;
                        object6 = (I)this.o().E(cursor.getBlob(10), (Parcelable.Creator)object6);
                        object = cursor;
                        object2 = new e(string2, (String)object2, new R5(string3, l10, object3, (String)object2), l9, bl, string4, (I)object4, l8, (I)object5, l11, (I)object6);
                        object = cursor;
                        if (!cursor.moveToNext()) break block15;
                        object = cursor;
                        this.j().G().c("Got multiple records for conditional property, expected one", Y1.v(string2), this.h().g(string3));
                    }
                    catch (Throwable throwable) {
                        cursor = object;
                        break block13;
                    }
                    catch (SQLiteException sQLiteException) {}
                }
                cursor.close();
                return object2;
                catch (Throwable throwable) {
                    cursor = object;
                    break block13;
                }
                catch (SQLiteException sQLiteException) {
                    cursor = null;
                }
            }
            object = cursor;
            {
                void var14_14;
                this.j().G().d("Error querying conditional property", Y1.v(string2), this.h().g(string3), var14_14);
                if (cursor == null) return null;
            }
            cursor.close();
            return null;
        }
        if (cursor == null) throw var1_3;
        cursor.close();
        throw var1_3;
    }

    public final SQLiteDatabase B() {
        this.n();
        try {
            SQLiteDatabase sQLiteDatabase = this.d.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (SQLiteException sQLiteException) {
            this.j().L().b("Error opening database", (Object)sQLiteException);
            throw sQLiteException;
        }
    }

    /*
     * Exception decompiling
     */
    public final Bundle B0(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 8[CATCHBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final String C() {
        void var2_5;
        SQLiteDatabase sQLiteDatabase;
        block8 : {
            Cursor cursor;
            block7 : {
                String string2;
                sQLiteDatabase = this.B();
                cursor = sQLiteDatabase.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                sQLiteDatabase = cursor;
                try {
                    if (!cursor.moveToFirst()) break block7;
                    sQLiteDatabase = cursor;
                    string2 = cursor.getString(0);
                }
                catch (Throwable throwable) {
                    break block8;
                }
                catch (SQLiteException sQLiteException) {}
                cursor.close();
                return string2;
            }
            cursor.close();
            return null;
            catch (Throwable throwable) {
                sQLiteDatabase = null;
                break block8;
            }
            catch (SQLiteException sQLiteException) {
                cursor = null;
            }
            sQLiteDatabase = cursor;
            {
                void var3_9;
                this.j().G().b("Database error getting next bundle app id", var3_9);
                if (cursor == null) return null;
            }
            cursor.close();
            return null;
        }
        if (sQLiteDatabase == null) throw var2_5;
        sQLiteDatabase.close();
        throw var2_5;
    }

    /*
     * Exception decompiling
     */
    public final E C0(String var1_1, String var2_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 5[CATCHBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final int D(String string2, String string3) {
        n.e(string2);
        n.e(string3);
        this.n();
        this.u();
        try {
            int n8 = this.B().delete("conditional_properties", "app_id=? and name=?", new String[]{string2, string3});
            return n8;
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().d("Error deleting conditional property", Y1.v(string2), this.h().g(string3), (Object)sQLiteException);
            return 0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final I2 D0(String var1_1) {
        block33 : {
            block34 : {
                block32 : {
                    n.e(var1_1);
                    this.n();
                    this.u();
                    var7_6 = null;
                    var6_7 = this.B();
                    var3_8 = false;
                    var6_7 = var6_7.query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status"}, "app_id=?", new String[]{var1_1}, null, null, null);
                    var2_9 = var6_7.moveToFirst();
                    if (var2_9) break block32;
                    var6_7.close();
                    return null;
                }
                var7_6 = var6_7;
                try {
                    block41 : {
                        block40 : {
                            block38 : {
                                block39 : {
                                    block37 : {
                                        block35 : {
                                            block36 : {
                                                var9_10 = new I2(this.b.i0(), var1_1);
                                                var7_6 = var6_7;
                                                var9_10.x(var6_7.getString(0));
                                                var7_6 = var6_7;
                                                var9_10.M(var6_7.getString(1));
                                                var7_6 = var6_7;
                                                var9_10.S(var6_7.getString(2));
                                                var7_6 = var6_7;
                                                var9_10.h0(var6_7.getLong(3));
                                                var7_6 = var6_7;
                                                var9_10.j0(var6_7.getLong(4));
                                                var7_6 = var6_7;
                                                var9_10.f0(var6_7.getLong(5));
                                                var7_6 = var6_7;
                                                var9_10.F(var6_7.getString(6));
                                                var7_6 = var6_7;
                                                var9_10.B(var6_7.getString(7));
                                                var7_6 = var6_7;
                                                var9_10.d0(var6_7.getLong(8));
                                                var7_6 = var6_7;
                                                var9_10.X(var6_7.getLong(9));
                                                var7_6 = var6_7;
                                                if (var6_7.isNull(10)) break block35;
                                                var7_6 = var6_7;
                                                if (var6_7.getInt(10) == 0) break block36;
                                                break block35;
                                                catch (Throwable var1_2) {
                                                    ** GOTO lbl197
                                                }
                                                catch (SQLiteException var8_13) {
                                                    break block33;
                                                }
                                                catch (Throwable var1_3) {
                                                    var6_7 = var7_6;
                                                    ** GOTO lbl197
                                                }
                                                catch (SQLiteException var8_14) {
                                                    var6_7 = null;
                                                    break block33;
                                                }
                                            }
                                            var2_9 = false;
                                            break block37;
                                        }
                                        var2_9 = true;
                                    }
                                    var7_6 = var6_7;
                                    var9_10.y(var2_9);
                                    var7_6 = var6_7;
                                    var9_10.U(var6_7.getLong(11));
                                    var7_6 = var6_7;
                                    var9_10.O(var6_7.getLong(12));
                                    var7_6 = var6_7;
                                    var9_10.L(var6_7.getLong(13));
                                    var7_6 = var6_7;
                                    var9_10.E(var6_7.getLong(14));
                                    var7_6 = var6_7;
                                    var9_10.A(var6_7.getLong(15));
                                    var7_6 = var6_7;
                                    var9_10.b0(var6_7.getLong(16));
                                    var7_6 = var6_7;
                                    if (var6_7.isNull(17)) {
                                        var4_11 = Integer.MIN_VALUE;
                                    } else {
                                        var7_6 = var6_7;
                                        var4_11 = var6_7.getInt(17);
                                    }
                                    var7_6 = var6_7;
                                    var9_10.c(var4_11);
                                    var7_6 = var6_7;
                                    var9_10.J(var6_7.getString(18));
                                    var7_6 = var6_7;
                                    var9_10.I(var6_7.getLong(19));
                                    var7_6 = var6_7;
                                    var9_10.R(var6_7.getLong(20));
                                    var7_6 = var6_7;
                                    var9_10.P(var6_7.getString(21));
                                    var7_6 = var6_7;
                                    if (var6_7.isNull(23)) ** GOTO lbl-1000
                                    var7_6 = var6_7;
                                    if (var6_7.getInt(23) == 0) {
                                        var2_9 = false;
                                    } else lbl-1000: // 2 sources:
                                    {
                                        var2_9 = true;
                                    }
                                    var7_6 = var6_7;
                                    var9_10.g(var2_9);
                                    var7_6 = var6_7;
                                    var9_10.e(var6_7.getString(24));
                                    var7_6 = var6_7;
                                    if (var6_7.isNull(25)) {
                                        var4_11 = 0L;
                                    } else {
                                        var7_6 = var6_7;
                                        var4_11 = var6_7.getLong(25);
                                    }
                                    var7_6 = var6_7;
                                    var9_10.Z(var4_11);
                                    var7_6 = var6_7;
                                    if (!var6_7.isNull(26)) {
                                        var7_6 = var6_7;
                                        var9_10.f(Arrays.asList((Object[])var6_7.getString(26).split(",", -1)));
                                    }
                                    var7_6 = var6_7;
                                    if (!s7.a()) break block38;
                                    var7_6 = var6_7;
                                    if (this.f().B(var1_1, K.y0)) break block39;
                                    var7_6 = var6_7;
                                    if (!this.f().s(K.w0)) break block38;
                                }
                                var7_6 = var6_7;
                                var9_10.V(var6_7.getString(28));
                            }
                            var7_6 = var6_7;
                            if (!E7.a()) break block40;
                            var7_6 = var6_7;
                            if (!this.f().s(K.A0)) break block40;
                            var7_6 = var6_7;
                            if (var6_7.isNull(29)) ** GOTO lbl-1000
                            var7_6 = var6_7;
                            if (var6_7.getInt(29) != 0) {
                                var2_9 = true;
                            } else lbl-1000: // 2 sources:
                            {
                                var2_9 = false;
                            }
                            var7_6 = var6_7;
                            var9_10.C(var2_9);
                        }
                        var7_6 = var6_7;
                        var9_10.n0(var6_7.getLong(30));
                        var7_6 = var6_7;
                        var9_10.l0(var6_7.getLong(31));
                        var7_6 = var6_7;
                        if (g7.a()) {
                            var7_6 = var6_7;
                            if (this.f().B(var1_1, K.L0)) {
                                var7_6 = var6_7;
                                var9_10.b(var6_7.getInt(32));
                                var7_6 = var6_7;
                                var9_10.w(var6_7.getLong(35));
                            }
                        }
                        var7_6 = var6_7;
                        if (!i6.a()) break block41;
                        var7_6 = var6_7;
                        if (!this.f().B(var1_1, K.Y0)) break block41;
                        var7_6 = var6_7;
                        if (var6_7.isNull(33)) ** GOTO lbl-1000
                        var7_6 = var6_7;
                        if (var6_7.getInt(33) != 0) {
                            var2_9 = true;
                        } else lbl-1000: // 2 sources:
                        {
                            var2_9 = false;
                        }
                        var7_6 = var6_7;
                        var9_10.G(var2_9);
                    }
                    var7_6 = var6_7;
                    if (n6.a()) {
                        var7_6 = var6_7;
                        if (this.f().B(var1_1, K.T0)) {
                            var7_6 = var6_7;
                            if (var6_7.isNull(34)) {
                                var8_12 = null;
                            } else {
                                var2_9 = var3_8;
                                var7_6 = var6_7;
                                if (var6_7.getInt(34) != 0) {
                                    var2_9 = true;
                                }
                                var7_6 = var6_7;
                                var8_12 = var2_9;
                            }
                            var7_6 = var6_7;
                            var9_10.d(var8_12);
                        }
                    }
                    var7_6 = var6_7;
                    var9_10.o();
                    var7_6 = var6_7;
                    if (!var6_7.moveToNext()) break block34;
                    var7_6 = var6_7;
                    this.j().G().b("Got multiple records for app, expected one. appId", Y1.v(var1_1));
                }
                catch (SQLiteException var8_16) {
                    ** continue;
                }
            }
            var6_7.close();
            return var9_10;
        }
lbl188: // 2 sources:
        do {
            var7_6 = var6_7;
            try {
                this.j().G().c("Error querying app. appId", Y1.v(var1_1), var8_15);
                if (var6_7 == null) return null;
            }
            catch (Throwable var1_5) {
                var6_7 = var7_6;
            }
            var6_7.close();
            return null;
lbl197: // 3 sources:
            if (var6_7 == null) throw var1_4;
            var6_7.close();
            throw var1_4;
            break;
        } while (true);
    }

    public final long E(d2 d22) {
        this.n();
        this.u();
        n.i(d22);
        n.e(d22.D3());
        byte[] arrby = d22.h();
        long l8 = this.o().A(arrby);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d22.D3());
        contentValues.put("metadata_fingerprint", Long.valueOf((long)l8));
        contentValues.put("metadata", arrby);
        try {
            this.B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return l8;
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().c("Error storing raw event metadata. appId", Y1.v(d22.D3()), (Object)sQLiteException);
            throw sQLiteException;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final r E0(String string2) {
        Throwable throwable;
        block12 : {
            Cursor cursor;
            String string3;
            String string4;
            Object object;
            block11 : {
                block10 : {
                    n.e(string2);
                    this.n();
                    this.u();
                    throwable = null;
                    cursor = this.B().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{string2}, null, null, null);
                    throwable = cursor;
                    boolean bl = cursor.moveToFirst();
                    if (bl) break block10;
                    cursor.close();
                    return null;
                }
                throwable = cursor;
                object = cursor.getBlob(0);
                throwable = cursor;
                string4 = cursor.getString(1);
                throwable = cursor;
                string3 = cursor.getString(2);
                throwable = cursor;
                if (cursor.moveToNext()) {
                    throwable = cursor;
                    this.j().G().b("Got multiple records for app config, expected one. appId", Y1.v(string2));
                }
                if (object != null) break block11;
                cursor.close();
                return null;
            }
            throwable = cursor;
            try {
                object = new r((byte[])object, string4, string3);
            }
            catch (Throwable throwable2) {
                string2 = throwable;
                throwable = throwable2;
                break block12;
            }
            catch (SQLiteException sQLiteException) {}
            cursor.close();
            return object;
            catch (Throwable throwable3) {
                string2 = throwable;
                throwable = throwable3;
                break block12;
            }
            catch (SQLiteException sQLiteException) {
                cursor = null;
            }
            throwable = cursor;
            {
                void var5_10;
                this.j().G().c("Error querying remote config. appId", Y1.v(string2), var5_10);
                if (cursor == null) return null;
            }
            cursor.close();
            return null;
        }
        if (string2 == null) throw throwable;
        string2.close();
        throw throwable;
    }

    public final long F(String string2) {
        int n8;
        n.e(string2);
        this.n();
        this.u();
        try {
            n8 = this.B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{string2, String.valueOf((int)Math.max((int)0, (int)Math.min((int)1000000, (int)this.f().u(string2, K.r))))});
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().c("Error deleting over the limit events. appId", Y1.v(string2), (Object)sQLiteException);
            return 0L;
        }
        return n8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final T5 F0(String string2, String string3) {
        void var1_4;
        Cursor cursor;
        block12 : {
            Cursor cursor2;
            Object object;
            block11 : {
                long l8;
                block10 : {
                    block9 : {
                        n.e(string2);
                        n.e(string3);
                        this.n();
                        this.u();
                        cursor = null;
                        cursor = cursor2 = this.B().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{string2, string3}, null, null, null);
                        boolean bl = cursor2.moveToFirst();
                        if (bl) break block9;
                        cursor2.close();
                        return null;
                    }
                    cursor = cursor2;
                    l8 = cursor2.getLong(0);
                    cursor = cursor2;
                    object = this.M(cursor2, 1);
                    if (object != null) break block10;
                    cursor2.close();
                    return null;
                }
                cursor = cursor2;
                try {
                    object = new T5(string2, cursor2.getString(2), string3, l8, object);
                    cursor = cursor2;
                    if (!cursor2.moveToNext()) break block11;
                    cursor = cursor2;
                    this.j().G().b("Got multiple records for user property, expected one. appId", Y1.v(string2));
                }
                catch (Throwable throwable) {
                    break block12;
                }
                catch (SQLiteException sQLiteException) {}
            }
            cursor2.close();
            return object;
            catch (Throwable throwable) {
                break block12;
            }
            catch (SQLiteException sQLiteException) {
                cursor2 = null;
            }
            cursor = cursor2;
            {
                void var8_13;
                this.j().G().d("Error querying user property. appId", Y1.v(string2), this.h().g(string3), var8_13);
                if (cursor2 == null) return null;
            }
            cursor2.close();
            return null;
        }
        if (cursor == null) throw var1_4;
        cursor.close();
        throw var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long G(String string2, String[] cursor, long l8) {
        Cursor cursor2;
        Throwable throwable2;
        block6 : {
            SQLiteException sQLiteException2;
            Cursor cursor3;
            block5 : {
                SQLiteDatabase sQLiteDatabase = this.B();
                cursor3 = null;
                cursor2 = null;
                try {
                    cursor2 = cursor = sQLiteDatabase.rawQuery(string2, (String[])cursor);
                    cursor3 = cursor;
                    if (!cursor.moveToFirst()) break block5;
                    cursor2 = cursor;
                    cursor3 = cursor;
                    l8 = cursor.getLong(0);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (SQLiteException sQLiteException2) {}
                cursor.close();
                return l8;
            }
            cursor.close();
            return l8;
            cursor2 = cursor3;
            {
                this.j().G().c("Database error", string2, (Object)sQLiteException2);
                cursor2 = cursor3;
                throw sQLiteException2;
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        throw throwable2;
    }

    public final z G0(String string2) {
        if (n6.a() && this.f().s(K.T0)) {
            n.i(string2);
            this.n();
            this.u();
            return z.c(this.P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{string2}, ""));
        }
        return z.f;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final q H(long l8, String string2, long l9, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Cursor cursor;
        void var3_6;
        block16 : {
            q q8;
            block17 : {
                SQLiteDatabase sQLiteDatabase;
                block15 : {
                    n.e(string2);
                    this.n();
                    this.u();
                    q8 = new q();
                    sQLiteDatabase = this.B();
                    cursor = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{string2}, null, null, null);
                    if (cursor.moveToFirst()) break block15;
                    this.j().L().b("Not updating daily counts, app is not known. appId", Y1.v(string2));
                    cursor.close();
                    return q8;
                }
                try {
                    if (cursor.getLong(0) == l8) {
                        q8.b = cursor.getLong(1);
                        q8.a = cursor.getLong(2);
                        q8.c = cursor.getLong(3);
                        q8.d = cursor.getLong(4);
                        q8.e = cursor.getLong(5);
                    }
                    if (bl) {
                        q8.b += l9;
                    }
                    if (bl2) {
                        q8.a += l9;
                    }
                    if (bl3) {
                        q8.c += l9;
                    }
                    if (bl4) {
                        q8.d += l9;
                    }
                    if (bl5) {
                        q8.e += l9;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf((long)l8));
                    contentValues.put("daily_public_events_count", Long.valueOf((long)q8.a));
                    contentValues.put("daily_events_count", Long.valueOf((long)q8.b));
                    contentValues.put("daily_conversions_count", Long.valueOf((long)q8.c));
                    contentValues.put("daily_error_events_count", Long.valueOf((long)q8.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf((long)q8.e));
                    sQLiteDatabase.update("apps", contentValues, "app_id=?", new String[]{string2});
                }
                catch (Throwable throwable) {
                    break block16;
                }
                catch (SQLiteException sQLiteException) {
                    break block17;
                }
                cursor.close();
                return q8;
                catch (Throwable throwable) {
                    cursor = null;
                    break block16;
                }
                catch (SQLiteException sQLiteException) {
                    cursor = null;
                }
            }
            try {
                void var12_17;
                this.j().G().c("Error updating daily counts. appId", Y1.v(string2), var12_17);
                if (cursor == null) return q8;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            cursor.close();
            return q8;
        }
        if (cursor == null) throw var3_6;
        cursor.close();
        throw var3_6;
    }

    /*
     * Exception decompiling
     */
    public final Map H0(String var1_1, String var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final q I(long l8, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        return this.H(l8, string2, 1L, false, false, bl3, false, bl5);
    }

    public final q3 I0(String object) {
        n.i(object);
        this.n();
        this.u();
        if (n6.a() && this.f().s(K.T0)) {
            Object object2 = o.a;
            object = object2 = (q3)this.N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{object}, (s)object2);
            if (object2 == null) {
                object = q3.c;
            }
            return object;
        }
        return q3.e(this.P("select consent_state from consent_settings where app_id=? limit 1;", new String[]{object}, "G1"));
    }

    /*
     * Exception decompiling
     */
    public final Map J0(String var1_1, String var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List K0(String var1_1) {
        block8 : {
            n.e(var1_1);
            this.n();
            this.u();
            var8_3 = new ArrayList();
            var4_4 = null;
            var3_5 = null;
            try {
                var3_5 = var5_6 = this.B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{var1_1}, null, null, "rowid", null);
                var4_4 = var5_6;
                var2_8 = var5_6.moveToFirst();
                if (var2_8) break block8;
            }
            catch (SQLiteException var5_7) {
                ** continue;
            }
            var5_6.close();
            return var8_3;
        }
        do {
            var3_5 = var5_6;
            var4_4 = var5_6;
            var6_9 = var7_10 = var5_6.getString(0);
            if (var7_10 == null) {
                var6_9 = "";
            }
            var3_5 = var5_6;
            var4_4 = var5_6;
            var8_3.add((Object)new v5(var6_9, var5_6.getLong(1), var5_6.getInt(2)));
            var3_5 = var5_6;
            var4_4 = var5_6;
            if (var2_8 = var5_6.moveToNext()) continue;
            break;
        } while (true);
        var5_6.close();
        return var8_3;
lbl30: // 1 sources:
        do {
            var3_5 = var4_4;
            try {
                this.j().G().c("Error querying trigger uris. appId", Y1.v(var1_1), (Object)var5_7);
                var3_5 = var4_4;
                var1_1 = Collections.emptyList();
                if (var4_4 == null) return var1_1;
            }
            catch (Throwable var1_2) {}
            var4_4.close();
            return var1_1;
            if (var3_5 == null) throw var1_2;
            var3_5.close();
            throw var1_2;
            break;
        } while (true);
    }

    /*
     * Exception decompiling
     */
    public final Pair L(String var1_1, Long var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 8[CATCHBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void L0(String string2, String string3) {
        n.e(string2);
        n.e(string3);
        this.n();
        this.u();
        try {
            this.B().delete("user_attributes", "app_id=? and name=?", new String[]{string2, string3});
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().d("Error deleting user property. appId", Y1.v(string2), this.h().g(string3), (Object)sQLiteException);
            return;
        }
    }

    public final Object M(Cursor cursor, int n8) {
        int n9 = cursor.getType(n8);
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 != 4) {
                            this.j().G().b("Loaded invalid unknown value type, ignoring it", n9);
                            return null;
                        }
                        this.j().G().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(n8);
                }
                return cursor.getDouble(n8);
            }
            return cursor.getLong(n8);
        }
        this.j().G().a("Loaded invalid null value from database");
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List M0(String var1_1) {
        block13 : {
            n.e(var1_1);
            this.n();
            this.u();
            var10_5 = new ArrayList();
            var7_6 = null;
            var6_7 = null;
            try {
                var6_7 = var5_8 = this.B().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{var1_1}, null, null, "rowid", "1000");
                var7_6 = var5_8;
                var2_9 = var5_8.moveToFirst();
                if (var2_9) break block13;
            }
            catch (Throwable var1_3) {
                ** GOTO lbl55
            }
            catch (SQLiteException var8_13) {
                var5_8 = var7_6;
            }
            var5_8.close();
            return var10_5;
        }
        do {
            var6_7 = var5_8;
            var7_6 = var5_8;
            var11_16 = var5_8.getString(0);
            var6_7 = var5_8;
            var7_6 = var5_8;
            var8_11 = var9_15 = var5_8.getString(1);
            if (var9_15 == null) {
                var8_11 = "";
            }
            var6_7 = var5_8;
            var7_6 = var5_8;
            var3_10 = var5_8.getLong(2);
            var6_7 = var5_8;
            var7_6 = this.M(var5_8, 3);
            if (var7_6 == null) {
                var6_7 = var5_8;
                this.j().G().b("Read invalid user property value, ignoring it. appId", Y1.v(var1_1));
            } else {
                var6_7 = var5_8;
                var10_5.add((Object)new T5(var1_1, var8_11, var11_16, var3_10, var7_6));
            }
            var6_7 = var5_8;
            if (var2_9 = var5_8.moveToNext()) continue;
            break;
        } while (true);
        var5_8.close();
        return var10_5;
lbl45: // 2 sources:
        do {
            var6_7 = var5_8;
            try {
                this.j().G().c("Error querying user properties. appId", Y1.v(var1_1), var8_12);
                var6_7 = var5_8;
                var1_1 = Collections.emptyList();
                if (var5_8 == null) return var1_1;
            }
            catch (Throwable var1_4) {}
            var5_8.close();
            return var1_1;
lbl55: // 2 sources:
            if (var6_7 == null) throw var1_2;
            var6_7.close();
            throw var1_2;
            break;
        } while (true);
        catch (SQLiteException var8_14) {
            ** continue;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object N(String string2, String[] cursor, s object) {
        void var2_5;
        block9 : {
            Object var4_10;
            block8 : {
                var4_10 = null;
                cursor = this.B().rawQuery(string2, (String[])cursor);
                string2 = cursor;
                if (cursor.moveToFirst()) break block8;
                string2 = cursor;
                this.j().K().a("No data found");
                cursor.close();
                return null;
            }
            string2 = cursor;
            try {
                object = object.a(cursor);
            }
            catch (Throwable throwable) {
                break block9;
            }
            catch (SQLiteException sQLiteException) {}
            cursor.close();
            return object;
            catch (Throwable throwable) {
                string2 = var4_10;
                break block9;
            }
            catch (SQLiteException sQLiteException) {
                cursor = null;
            }
            string2 = cursor;
            {
                void var3_9;
                this.j().G().b("Error querying database.", var3_9);
                if (cursor == null) return null;
            }
            cursor.close();
            return null;
        }
        if (string2 == null) throw var2_5;
        string2.close();
        throw var2_5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map N0(String string2) {
        SQLiteDatabase sQLiteDatabase;
        a a8;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        boolean bl;
        block10 : {
            Throwable throwable2;
            block11 : {
                block12 : {
                    block9 : {
                        this.u();
                        this.n();
                        n.e(string2);
                        sQLiteDatabase3 = this.B();
                        sQLiteDatabase = null;
                        sQLiteDatabase2 = null;
                        sQLiteDatabase2 = sQLiteDatabase3 = sQLiteDatabase3.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{string2}, null, null, null);
                        sQLiteDatabase = sQLiteDatabase3;
                        if (sQLiteDatabase3.moveToFirst()) break block9;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        sQLiteDatabase = sQLiteDatabase3;
                        Map map = Collections.emptyMap();
                        sQLiteDatabase3.close();
                        return map;
                    }
                    sQLiteDatabase2 = sQLiteDatabase3;
                    sQLiteDatabase = sQLiteDatabase3;
                    try {
                        a8 = new a();
                        break block10;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    catch (SQLiteException sQLiteException) {}
                    sQLiteDatabase2 = sQLiteDatabase;
                    {
                        this.j().G().c("Database error querying filter results. appId", Y1.v(string2), (Object)sQLiteException);
                        sQLiteDatabase2 = sQLiteDatabase;
                        string2 = Collections.emptyMap();
                        if (sQLiteDatabase == null) break block12;
                    }
                    sQLiteDatabase.close();
                }
                return string2;
            }
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            throw throwable2;
        }
        do {
            sQLiteDatabase2 = sQLiteDatabase3;
            sQLiteDatabase = sQLiteDatabase3;
            int n8 = sQLiteDatabase3.getInt(0);
            sQLiteDatabase2 = sQLiteDatabase3;
            sQLiteDatabase = sQLiteDatabase3;
            Object object = sQLiteDatabase3.getBlob(1);
            sQLiteDatabase2 = sQLiteDatabase3;
            sQLiteDatabase = sQLiteDatabase3;
            try {
                object = (f2)((Y3)((f2.a)N5.H(f2.V(), (byte[])object)).p());
                sQLiteDatabase2 = sQLiteDatabase3;
                sQLiteDatabase = sQLiteDatabase3;
            }
            catch (IOException iOException) {
                sQLiteDatabase2 = sQLiteDatabase3;
                sQLiteDatabase = sQLiteDatabase3;
                this.j().G().d("Failed to merge filter results. appId, audienceId, error", Y1.v(string2), n8, (Object)iOException);
            }
            a8.put((Object)n8, object);
            sQLiteDatabase2 = sQLiteDatabase3;
            sQLiteDatabase = sQLiteDatabase3;
        } while (bl = sQLiteDatabase3.moveToNext());
        sQLiteDatabase3.close();
        return a8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final String O(long l8) {
        Cursor cursor;
        void var4_6;
        block9 : {
            Cursor cursor2;
            String string2;
            block8 : {
                this.n();
                this.u();
                cursor = null;
                cursor = cursor2 = this.B().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long)l8)});
                if (cursor2.moveToFirst()) break block8;
                cursor = cursor2;
                this.j().K().a("No expired configs for apps with pending events");
                cursor2.close();
                return null;
            }
            cursor = cursor2;
            try {
                string2 = cursor2.getString(0);
            }
            catch (Throwable throwable) {
                break block9;
            }
            catch (SQLiteException sQLiteException) {}
            cursor2.close();
            return string2;
            catch (Throwable throwable) {
                break block9;
            }
            catch (SQLiteException sQLiteException) {
                cursor2 = null;
            }
            cursor = cursor2;
            {
                void var5_10;
                this.j().G().b("Error selecting expired configs", var5_10);
                if (cursor2 == null) return null;
            }
            cursor2.close();
            return null;
        }
        if (cursor == null) throw var4_6;
        cursor.close();
        throw var4_6;
    }

    /*
     * Exception decompiling
     */
    public final Map O0(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 10[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String P(String string2, String[] cursor, String string3) {
        Cursor cursor2;
        Throwable throwable2;
        block6 : {
            SQLiteException sQLiteException2;
            Cursor cursor3;
            block5 : {
                SQLiteDatabase sQLiteDatabase = this.B();
                cursor3 = null;
                cursor2 = null;
                try {
                    cursor2 = cursor = sQLiteDatabase.rawQuery(string2, (String[])cursor);
                    cursor3 = cursor;
                    if (!cursor.moveToFirst()) break block5;
                    cursor2 = cursor;
                    cursor3 = cursor;
                    string3 = cursor.getString(0);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (SQLiteException sQLiteException2) {}
                cursor.close();
                return string3;
            }
            cursor.close();
            return string3;
            cursor2 = cursor3;
            {
                this.j().G().c("Database error", string2, (Object)sQLiteException2);
                cursor2 = cursor3;
                throw sQLiteException2;
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        throw throwable2;
    }

    /*
     * Exception decompiling
     */
    public final Map P0(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 7[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List Q(String string2, int n8, int n9) {
        boolean bl;
        ArrayList arrayList;
        Cursor cursor3;
        Cursor cursor2;
        Cursor cursor;
        block16 : {
            block15 : {
                this.n();
                this.u();
                bl = n8 > 0;
                n.a(bl);
                bl = n9 > 0;
                n.a(bl);
                n.e(string2);
                cursor3 = null;
                cursor = null;
                cursor = cursor2 = this.B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{string2}, null, null, "rowid", String.valueOf((int)n8));
                cursor3 = cursor2;
                if (cursor2.moveToFirst()) break block15;
                cursor = cursor2;
                cursor3 = cursor2;
                List list = Collections.emptyList();
                cursor2.close();
                return list;
            }
            cursor = cursor2;
            cursor3 = cursor2;
            try {
                arrayList = new ArrayList();
                n8 = 0;
                break block16;
            }
            catch (Throwable throwable) {}
            if (cursor == null) throw throwable;
            cursor.close();
            throw throwable;
            catch (SQLiteException sQLiteException) {}
            cursor = cursor3;
            {
                this.j().G().c("Error querying bundles. appId", Y1.v(string2), (Object)sQLiteException);
                cursor = cursor3;
                string2 = Collections.emptyList();
                if (cursor3 == null) return string2;
            }
            cursor3.close();
            return string2;
        }
        do {
            cursor = cursor2;
            cursor3 = cursor2;
            long l8 = cursor2.getLong(0);
            cursor = cursor2;
            cursor3 = cursor2;
            byte[] arrby = cursor2.getBlob(1);
            cursor = cursor2;
            cursor3 = cursor2;
            arrby = this.o().i0(arrby);
            cursor = cursor2;
            cursor3 = cursor2;
            if (!arrayList.isEmpty()) {
                cursor = cursor2;
                cursor3 = cursor2;
                int n10 = arrby.length;
                if (n10 + n8 > n9) break;
            }
            cursor = cursor2;
            cursor3 = cursor2;
            {
                block22 : {
                    Object object;
                    block19 : {
                        long l10;
                        long l9;
                        block18 : {
                            Object object3;
                            Object object2;
                            long l11;
                            block20 : {
                                block17 : {
                                    h2 h22;
                                    try {
                                        object = (d2.a)N5.H(d2.A3(), arrby);
                                        cursor = cursor2;
                                        cursor3 = cursor2;
                                    }
                                    catch (IOException iOException) {
                                        block21 : {
                                            cursor = cursor2;
                                            cursor3 = cursor2;
                                            object = this.j().G();
                                            object3 = "Failed to merge queued bundle. appId";
                                            cursor = cursor2;
                                            cursor3 = cursor2;
                                            object2 = Y1.v(string2);
                                            break block21;
                                            catch (IOException iOException2) {
                                                cursor = cursor2;
                                                cursor3 = cursor2;
                                                object = this.j().G();
                                                object3 = "Failed to unzip queued bundle. appId";
                                                cursor = cursor2;
                                                cursor3 = cursor2;
                                                object2 = Y1.v(string2);
                                            }
                                        }
                                        cursor = cursor2;
                                        cursor3 = cursor2;
                                        object.c((String)object3, object2, arrby);
                                    }
                                    if (!n6.a()) break block19;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    if (!this.f().s(K.X0)) break block19;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    if (arrayList.isEmpty()) break block19;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    object2 = (d2)((Pair)arrayList.get((int)0)).first;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    object3 = (d2)((Y3)object.p());
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    if (!object2.f0().equals((Object)object3.f0())) break;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    if (!object2.e0().equals((Object)object3.e0())) break;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    if (object2.v0() != object3.v0()) break;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    if (!object2.g0().equals((Object)object3.g0())) break;
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    object2 = object2.t0().iterator();
                                    do {
                                        cursor = cursor2;
                                        cursor3 = cursor2;
                                        bl = object2.hasNext();
                                        l11 = -1L;
                                        if (!bl) break block17;
                                        cursor = cursor2;
                                        cursor3 = cursor2;
                                        h22 = (h2)object2.next();
                                        cursor = cursor2;
                                        cursor3 = cursor2;
                                    } while (!"_npa".equals((Object)h22.Z()));
                                    cursor = cursor2;
                                    cursor3 = cursor2;
                                    l9 = h22.U();
                                    break block20;
                                    break block22;
                                }
                                l9 = -1L;
                            }
                            cursor = cursor2;
                            cursor3 = cursor2;
                            object3 = object3.t0().iterator();
                            do {
                                cursor = cursor2;
                                cursor3 = cursor2;
                                l10 = l11;
                                if (!object3.hasNext()) break block18;
                                cursor = cursor2;
                                cursor3 = cursor2;
                                object2 = (h2)object3.next();
                                cursor = cursor2;
                                cursor3 = cursor2;
                            } while (!"_npa".equals((Object)object2.Z()));
                            cursor = cursor2;
                            cursor3 = cursor2;
                            l10 = object2.U();
                        }
                        if (l9 != l10) break;
                    }
                    cursor = cursor2;
                    cursor3 = cursor2;
                    if (!cursor2.isNull(2)) {
                        cursor = cursor2;
                        cursor3 = cursor2;
                        object.q0(cursor2.getInt(2));
                    }
                    cursor = cursor2;
                    cursor3 = cursor2;
                    n8 += arrby.length;
                    cursor = cursor2;
                    cursor3 = cursor2;
                    arrayList.add((Object)Pair.create((Object)((d2)((Y3)object.p())), (Object)l8));
                }
                cursor = cursor2;
                cursor3 = cursor2;
                if ((bl = cursor2.moveToNext()) && n8 <= n9) continue;
            }
            break;
        } while (true);
        cursor2.close();
        return arrayList;
    }

    public final void Q0() {
        this.u();
        this.B().beginTransaction();
    }

    public final List R(String string2, String arrstring, String string3) {
        n.e(string2);
        this.n();
        this.u();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((Object)string2);
        string2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty((CharSequence)arrstring)) {
            arrayList.add((Object)arrstring);
            string2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            arrstring = new StringBuilder();
            arrstring.append(string3);
            arrstring.append("*");
            arrayList.add((Object)arrstring.toString());
            string2.append(" and name glob ?");
        }
        arrstring = (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
        return this.S(string2.toString(), arrstring);
    }

    public final void R0() {
        this.u();
        this.B().endTransaction();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List S(String var1_1, String[] var2_3) {
        block12 : {
            this.n();
            this.u();
            var12_6 = new ArrayList();
            var1_1 = this.B().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, var1_1, (String[])var2_3, null, null, "rowid", "1001");
            var3_9 = var1_1.moveToFirst();
            ** if (var3_9) goto lbl11
lbl-1000: // 1 sources:
            {
                var1_1.close();
                return var12_6;
            }
lbl11: // 1 sources:
            ** GOTO lbl18
            catch (Throwable var1_2) {
                var2_3 = null;
            }
            catch (SQLiteException var2_4) {
                block13 : {
                    var1_1 = null;
                    break block13;
lbl18: // 1 sources:
                    try {
                        do {
                            if (var12_6.size() >= 1000) {
                                this.j().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                                break;
                            }
                            var2_3 = var1_1.getString(0);
                            var13_14 = var1_1.getString(1);
                            var14_15 = var1_1.getString(2);
                            var15_16 = this.M((Cursor)var1_1, 3);
                            var3_9 = var1_1.getInt(4) != 0;
                            var16_17 = var1_1.getString(5);
                            var4_10 = var1_1.getLong(6);
                            var18_19 = this.o();
                            var19_20 = var1_1.getBlob(7);
                            var17_18 = I.CREATOR;
                            var18_19 = (I)var18_19.E((byte[])var19_20, (Parcelable.Creator)var17_18);
                            var6_11 = var1_1.getLong(8);
                            var19_20 = (I)this.o().E(var1_1.getBlob(9), (Parcelable.Creator)var17_18);
                            var8_12 = var1_1.getLong(10);
                            var10_13 = var1_1.getLong(11);
                            var17_18 = (I)this.o().E(var1_1.getBlob(12), (Parcelable.Creator)var17_18);
                            var12_6.add((Object)new e((String)var2_3, var13_14, new R5(var14_15, var8_12, var15_16, var13_14), var6_11, var3_9, var16_17, (I)var18_19, var4_10, (I)var19_20, var10_13, (I)var17_18));
                        } while (var3_9 = var1_1.moveToNext());
                    }
                    catch (Throwable var12_8) {
                        var2_3 = var1_1;
                        var1_1 = var12_8;
                        break block12;
                    }
                    catch (SQLiteException var2_5) {}
                    var1_1.close();
                    return var12_6;
                }
                try {
                    this.j().G().b("Error querying conditional user property value", var2_3);
                    var2_3 = Collections.emptyList();
                    if (var1_1 == null) return var2_3;
                }
                catch (Throwable var12_7) {
                    var2_3 = var1_1;
                    var1_1 = var12_7;
                }
                var1_1.close();
                return var2_3;
            }
        }
        if (var2_3 == null) throw var1_1;
        var2_3.close();
        throw var1_1;
    }

    public final void S0() {
        this.n();
        this.u();
        if (!this.u0()) {
            return;
        }
        long l8 = this.s().e.a();
        long l9 = this.b().b();
        if (Math.abs((long)(l9 - l8)) > (Long)K.A.a(null)) {
            int n8;
            this.s().e.b(l9);
            this.n();
            this.u();
            if (this.u0() && (n8 = this.B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf((long)this.b().a()), String.valueOf((long)g.M())})) > 0) {
                this.j().K().b("Deleted stale rows. rowsDeleted", n8);
            }
        }
    }

    public final void T(E e8) {
        SQLiteException sQLiteException2;
        block3 : {
            n.i(e8);
            this.n();
            this.u();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", e8.a);
            contentValues.put("name", e8.b);
            contentValues.put("lifetime_count", Long.valueOf((long)e8.c));
            contentValues.put("current_bundle_count", Long.valueOf((long)e8.d));
            contentValues.put("last_fire_timestamp", Long.valueOf((long)e8.f));
            contentValues.put("last_bundled_timestamp", Long.valueOf((long)e8.g));
            contentValues.put("last_bundled_day", e8.h);
            contentValues.put("last_sampled_complex_event_id", e8.i);
            contentValues.put("last_sampling_rate", e8.j);
            contentValues.put("current_session_count", Long.valueOf((long)e8.e));
            Boolean bl = e8.k;
            bl = bl != null && bl != false ? Long.valueOf((long)1L) : null;
            contentValues.put("last_exempt_from_sampling", (Long)bl);
            try {
                if (this.B().insertWithOnConflict("events", null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert/update event aggregates (got -1). appId", Y1.v(e8.a));
                    return;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            return;
        }
        this.j().G().c("Error storing event aggregates. appId", Y1.v(e8.a), (Object)sQLiteException2);
    }

    public final void T0() {
        this.u();
        this.B().setTransactionSuccessful();
    }

    public final void U(I2 i22) {
        SQLiteException sQLiteException2;
        String string2;
        block10 : {
            List list;
            n.i(i22);
            this.n();
            this.u();
            string2 = i22.t0();
            n.i(string2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string2);
            contentValues.put("app_instance_id", i22.u0());
            contentValues.put("gmp_app_id", i22.j());
            contentValues.put("resettable_device_id_hash", i22.l());
            contentValues.put("last_bundle_index", Long.valueOf((long)i22.k0()));
            contentValues.put("last_bundle_start_timestamp", Long.valueOf((long)i22.m0()));
            contentValues.put("last_bundle_end_timestamp", Long.valueOf((long)i22.i0()));
            contentValues.put("app_version", i22.h());
            contentValues.put("app_store", i22.v0());
            contentValues.put("gmp_version", Long.valueOf((long)i22.g0()));
            contentValues.put("dev_cert_hash", Long.valueOf((long)i22.a0()));
            contentValues.put("measurement_enabled", Boolean.valueOf((boolean)i22.r()));
            contentValues.put("day", Long.valueOf((long)i22.Y()));
            contentValues.put("daily_public_events_count", Long.valueOf((long)i22.T()));
            contentValues.put("daily_events_count", Long.valueOf((long)i22.Q()));
            contentValues.put("daily_conversions_count", Long.valueOf((long)i22.K()));
            contentValues.put("config_fetched_time", Long.valueOf((long)i22.H()));
            contentValues.put("failed_config_fetch_time", Long.valueOf((long)i22.e0()));
            contentValues.put("app_version_int", Long.valueOf((long)i22.z()));
            contentValues.put("firebase_instance_id", i22.i());
            contentValues.put("daily_error_events_count", Long.valueOf((long)i22.N()));
            contentValues.put("daily_realtime_events_count", Long.valueOf((long)i22.W()));
            contentValues.put("health_monitor_sample", i22.k());
            contentValues.put("android_id", Long.valueOf((long)i22.v()));
            contentValues.put("adid_reporting_enabled", Boolean.valueOf((boolean)i22.q()));
            contentValues.put("admob_app_id", i22.r0());
            contentValues.put("dynamite_version", Long.valueOf((long)i22.c0()));
            contentValues.put("session_stitching_token", i22.m());
            contentValues.put("sgtm_upload_enabled", Boolean.valueOf((boolean)i22.t()));
            contentValues.put("target_os_version", Long.valueOf((long)i22.p0()));
            contentValues.put("session_stitching_token_hash", Long.valueOf((long)i22.o0()));
            if (g7.a() && this.f().B(string2, K.L0)) {
                contentValues.put("ad_services_version", Integer.valueOf((int)i22.a()));
                contentValues.put("attribution_eligibility_status", Long.valueOf((long)i22.D()));
            }
            if (i6.a() && this.f().B(string2, K.Y0)) {
                contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf((boolean)i22.u()));
            }
            if ((list = i22.n()) != null) {
                if (list.isEmpty()) {
                    this.j().L().b("Safelisted events should not be an empty list. appId", string2);
                } else {
                    contentValues.put("safelisted_events", TextUtils.join((CharSequence)",", (Iterable)list));
                }
            }
            if (o6.a() && this.f().s(K.u0) && !contentValues.containsKey("safelisted_events")) {
                contentValues.put("safelisted_events", null);
            }
            if (n6.a() && this.f().B(string2, K.T0)) {
                contentValues.put("npa_metadata_value", i22.q0());
            }
            try {
                i22 = this.B();
                if ((long)i22.update("apps", contentValues, "app_id = ?", new String[]{string2}) == 0L && i22.insertWithOnConflict("apps", null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert/update app (got -1). appId", Y1.v(string2));
                    return;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block10;
            }
            return;
        }
        this.j().G().c("Error storing app. appId", Y1.v(string2), (Object)sQLiteException2);
    }

    public final boolean U0() {
        if (this.x0("select count(1) > 0 from raw_events", null) != 0L) {
            return true;
        }
        return false;
    }

    public final boolean V0() {
        if (this.x0("select count(1) > 0 from queue where has_realtime = 1", null) != 0L) {
            return true;
        }
        return false;
    }

    public final void W(String string2, z z8) {
        if (n6.a()) {
            if (!this.f().s(K.T0)) {
                return;
            }
            n.i(string2);
            n.i(z8);
            this.n();
            this.u();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string2);
            contentValues.put("dma_consent_settings", z8.i());
            this.Y("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean W0() {
        if (this.x0("select count(1) > 0 from raw_events where realtime = 1", null) != 0L) {
            return true;
        }
        return false;
    }

    public final void X(String string2, q3 q32) {
        SQLiteException sQLiteException2;
        block4 : {
            n.i(string2);
            n.i(q32);
            this.n();
            this.u();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string2);
            contentValues.put("consent_state", q32.v());
            if (n6.a() && this.f().s(K.T0)) {
                contentValues.put("consent_source", Integer.valueOf((int)q32.b()));
                this.Y("consent_settings", "app_id", contentValues);
                return;
            }
            try {
                if (this.B().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert/update consent setting (got -1). appId", Y1.v(string2));
                    return;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block4;
            }
            return;
        }
        this.j().G().c("Error storing consent setting. appId, error", Y1.v(string2), (Object)sQLiteException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Y(String string2, String string3, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabase = this.B();
            String string4 = contentValues.getAsString(string3);
            if (string4 == null) {
                this.j().H().b("Value of the primary key is not set.", Y1.v(string3));
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(" = ?");
            if ((long)sQLiteDatabase.update(string2, contentValues, stringBuilder.toString(), new String[]{string4}) == 0L && sQLiteDatabase.insertWithOnConflict(string2, null, contentValues, 5) == -1L) {
                this.j().G().c("Failed to insert/update table (got -1). key", Y1.v(string2), Y1.v(string3));
            }
            return;
        }
        catch (SQLiteException sQLiteException) {}
        this.j().G().d("Error storing into table. key", Y1.v(string2), Y1.v(string3), (Object)sQLiteException);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void Z(String var1_1, List var2_3) {
        n.i(var2_3);
        var4_4 = 0;
        do {
            block22 : {
                block23 : {
                    block21 : {
                        if (var4_4 >= var2_3.size()) break block21;
                        var7_8 = (w1.a)((w1)var2_3.get(var4_4)).x();
                        var8_9 = var7_8;
                        if (var7_8.w() == 0) break block22;
                        break block23;
                    }
                    this.u();
                    this.n();
                    n.e(var1_1);
                    n.i(var2_3);
                    var11_12 = this.B();
                    var11_12.beginTransaction();
                    try {
                        this.u();
                        this.n();
                        n.e(var1_1);
                        var7_8 = this.B();
                        var7_8.delete("property_filters", "app_id=?", new String[]{var1_1});
                        var7_8.delete("event_filters", "app_id=?", new String[]{var1_1});
                        var12_13 = var2_3.iterator();
                        break;
                    }
                    catch (Throwable var1_2) {}
                    var11_12.endTransaction();
                    throw var1_2;
                }
                var5_6 = 0;
                do {
                    var8_9 = var7_8;
                    if (var5_6 >= var7_8.w()) break;
                    var8_9 = (x1.a)var7_8.z(var5_6).x();
                    var9_10 = (x1.a)((Y3.b)var8_9.clone());
                    var10_11 = r3.b(var8_9.A());
                    if (var10_11 != null) {
                        var9_10.y((String)var10_11);
                        var3_5 = 1;
                    } else {
                        var3_5 = 0;
                    }
                    for (var6_7 = 0; var6_7 < var8_9.w(); ++var6_7) {
                        var10_11 = var8_9.z(var6_7);
                        var11_12 = t3.a(var10_11.M());
                        if (var11_12 == null) continue;
                        var9_10.x(var6_7, (y1)((Y3)((y1.a)var10_11.x()).w((String)var11_12).p()));
                        var3_5 = 1;
                    }
                    var8_9 = var7_8;
                    if (var3_5 != 0) {
                        var8_9 = var7_8.x(var5_6, (x1.a)var9_10);
                        var2_3.set(var4_4, (Object)((w1)((Y3)var8_9.p())));
                    }
                    ++var5_6;
                    var7_8 = var8_9;
                } while (true);
            }
            if (var8_9.A() != 0) {
                for (var3_5 = 0; var3_5 < var8_9.A(); ++var3_5) {
                    var9_10 = var8_9.B(var3_5);
                    var10_11 = s3.a(var9_10.L());
                    var7_8 = var8_9;
                    if (var10_11 != null) {
                        var7_8 = var8_9.y(var3_5, ((A1.a)var9_10.x()).w((String)var10_11));
                        var2_3.set(var4_4, (Object)((w1)((Y3)var7_8.p())));
                    }
                    var8_9 = var7_8;
                }
            }
            ++var4_4;
        } while (true);
        block6 : do {
            block20 : {
                block25 : {
                    block24 : {
                        if (!var12_13.hasNext()) break block24;
                        var7_8 = (w1)var12_13.next();
                        this.u();
                        this.n();
                        n.e(var1_1);
                        n.i(var7_8);
                        if (!var7_8.R()) {
                            this.j().L().b("Audience with no ID. appId", Y1.v(var1_1));
                            continue;
                        }
                        var4_4 = var7_8.k();
                        var8_9 = var7_8.P().iterator();
                        while (var8_9.hasNext()) {
                            if (((x1)var8_9.next()).V()) continue;
                            var7_8 = this.j().L();
                            var9_10 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            var10_11 = Y1.v(var1_1);
                            var8_9 = Integer.valueOf((int)var4_4);
                            ** GOTO lbl94
                        }
                        var8_9 = var7_8.Q().iterator();
                        while (var8_9.hasNext()) {
                            if (((A1)var8_9.next()).P()) continue;
                            var7_8 = this.j().L();
                            var9_10 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                            var10_11 = Y1.v(var1_1);
                            var8_9 = Integer.valueOf((int)var4_4);
lbl94: // 2 sources:
                            var7_8.c((String)var9_10, var10_11, var8_9);
                            continue block6;
                        }
                        var8_9 = var7_8.P().iterator();
                        while (var8_9.hasNext()) {
                            if (this.f0(var1_1, var4_4, (x1)var8_9.next())) continue;
                            var3_5 = 0;
                            break block20;
                        }
                        break block25;
                    }
                    var7_8 = new ArrayList();
                    var8_9 = var2_3.iterator();
                    while (var8_9.hasNext()) {
                        var2_3 = (w1)var8_9.next();
                        var2_3 = var2_3.R() != false ? Integer.valueOf((int)var2_3.k()) : null;
                        var7_8.add(var2_3);
                    }
                    this.z0(var1_1, (List)var7_8);
                    var11_12.setTransactionSuccessful();
                    var11_12.endTransaction();
                    return;
                }
                var3_5 = 1;
            }
            if (var3_5 != 0) {
                var7_8 = var7_8.Q().iterator();
                while (var7_8.hasNext()) {
                    if (this.g0(var1_1, var4_4, (A1)var7_8.next())) continue;
                    break;
                }
            } else if (var3_5 != 0) continue;
            this.u();
            this.n();
            n.e(var1_1);
            var7_8 = this.B();
            var7_8.delete("property_filters", "app_id=? and audience_id=?", new String[]{var1_1, String.valueOf((int)var4_4)});
            var7_8.delete("event_filters", "app_id=? and audience_id=?", new String[]{var1_1, String.valueOf((int)var4_4)});
        } while (true);
    }

    public final void a0(List object) {
        this.n();
        this.u();
        n.i(object);
        n.k(object.size());
        if (!this.u0()) {
            return;
        }
        object = TextUtils.join((CharSequence)",", (Iterable)object);
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        object = stringBuilder.toString();
        stringBuilder = new StringBuilder("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        stringBuilder.append((String)object);
        stringBuilder.append(" AND retry_count =  2147483647 LIMIT 1");
        if (this.x0(stringBuilder.toString(), null) > 0L) {
            this.j().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            stringBuilder = this.B();
            StringBuilder stringBuilder2 = new StringBuilder("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            stringBuilder2.append((String)object);
            stringBuilder2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
            stringBuilder.execSQL(stringBuilder2.toString());
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().b("Error incrementing retry count. error", (Object)sQLiteException);
            return;
        }
    }

    public final boolean b0(e e8) {
        n.i(e8);
        this.n();
        this.u();
        String string2 = e8.o;
        n.i(string2);
        if (this.F0(string2, e8.q.p) == null && this.x0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{string2}) >= 1000L) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string2);
        contentValues.put("origin", e8.p);
        contentValues.put("name", e8.q.p);
        p.V(contentValues, "value", n.i(e8.q.a()));
        contentValues.put("active", Boolean.valueOf((boolean)e8.s));
        contentValues.put("trigger_event_name", e8.t);
        contentValues.put("trigger_timeout", Long.valueOf((long)e8.v));
        this.k();
        contentValues.put("timed_out_event", S5.p0(e8.u));
        contentValues.put("creation_timestamp", Long.valueOf((long)e8.r));
        this.k();
        contentValues.put("triggered_event", S5.p0(e8.w));
        contentValues.put("triggered_timestamp", Long.valueOf((long)e8.q.q));
        contentValues.put("time_to_live", Long.valueOf((long)e8.x));
        this.k();
        contentValues.put("expired_event", S5.p0(e8.y));
        try {
            if (this.B().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1L) {
                this.j().G().b("Failed to insert/update conditional user property (got -1)", Y1.v(string2));
            }
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().c("Error storing conditional user property", Y1.v(string2), (Object)sQLiteException);
        }
        return true;
    }

    public final boolean c0(A a8, long l8, boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final boolean d0(T5 t52) {
        n.i(t52);
        this.n();
        this.u();
        if (this.F0(t52.a, t52.c) == null && (S5.J0(t52.c) ? this.x0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{t52.a}) >= (long)this.f().q(t52.a, K.I, 25, 100) : !"_npa".equals((Object)t52.c) && this.x0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{t52.a, t52.b}) >= 25L)) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t52.a);
        contentValues.put("origin", t52.b);
        contentValues.put("name", t52.c);
        contentValues.put("set_timestamp", Long.valueOf((long)t52.d));
        p.V(contentValues, "value", t52.e);
        try {
            if (this.B().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1L) {
                this.j().G().b("Failed to insert/update user property (got -1). appId", Y1.v(t52.a));
            }
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().c("Error storing user property. appId", Y1.v(t52.a), (Object)sQLiteException);
        }
        return true;
    }

    public final boolean e0(d2 d22, boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final boolean f0(String string2, int n8, x1 x12) {
        SQLiteException sQLiteException2;
        block5 : {
            block4 : {
                this.u();
                this.n();
                n.e(string2);
                n.i(x12);
                boolean bl = x12.P().isEmpty();
                Integer n9 = null;
                if (bl) {
                    a2 a22 = this.j().L();
                    Object object = Y1.v(string2);
                    string2 = n9;
                    if (x12.V()) {
                        string2 = Integer.valueOf((int)x12.L());
                    }
                    a22.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", object, n8, String.valueOf((Object)string2));
                    return false;
                }
                byte[] arrby = x12.h();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", string2);
                contentValues.put("audience_id", Integer.valueOf((int)n8));
                n9 = x12.V() ? Integer.valueOf((int)x12.L()) : null;
                contentValues.put("filter_id", n9);
                contentValues.put("event_name", x12.P());
                x12 = x12.W() ? Boolean.valueOf((boolean)x12.T()) : null;
                contentValues.put("session_scoped", (Boolean)x12);
                contentValues.put("data", arrby);
                try {
                    if (this.B().insertWithOnConflict("event_filters", null, contentValues, 5) != -1L) break block4;
                    this.j().G().b("Failed to insert event filter (got -1). appId", Y1.v(string2));
                }
                catch (SQLiteException sQLiteException2) {
                    break block5;
                }
            }
            return true;
        }
        this.j().G().c("Error storing event filter. appId", Y1.v(string2), (Object)sQLiteException2);
        return false;
    }

    public final boolean g0(String string2, int n8, A1 a12) {
        SQLiteException sQLiteException2;
        block5 : {
            this.u();
            this.n();
            n.e(string2);
            n.i(a12);
            boolean bl = a12.L().isEmpty();
            Integer n9 = null;
            if (bl) {
                a2 a22 = this.j().L();
                Object object = Y1.v(string2);
                string2 = n9;
                if (a12.P()) {
                    string2 = Integer.valueOf((int)a12.k());
                }
                a22.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", object, n8, String.valueOf((Object)string2));
                return false;
            }
            byte[] arrby = a12.h();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string2);
            contentValues.put("audience_id", Integer.valueOf((int)n8));
            n9 = a12.P() ? Integer.valueOf((int)a12.k()) : null;
            contentValues.put("filter_id", n9);
            contentValues.put("property_name", a12.L());
            a12 = a12.Q() ? Boolean.valueOf((boolean)a12.O()) : null;
            contentValues.put("session_scoped", (Boolean)a12);
            contentValues.put("data", arrby);
            try {
                if (this.B().insertWithOnConflict("property_filters", null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert property filter (got -1). appId", Y1.v(string2));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block5;
            }
            return true;
        }
        this.j().G().c("Error storing property filter. appId", Y1.v(string2), (Object)sQLiteException2);
        return false;
    }

    public final boolean h0(String string2, v5 v52) {
        SQLiteException sQLiteException2;
        block4 : {
            this.n();
            this.u();
            n.i(v52);
            n.e(string2);
            long l8 = this.b().a();
            if (v52.p < l8 - g.M() || v52.p > g.M() + l8) {
                this.j().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", Y1.v(string2), l8, v52.p);
            }
            this.j().K().a("Saving trigger URI");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string2);
            contentValues.put("trigger_uri", v52.o);
            contentValues.put("source", Integer.valueOf((int)v52.q));
            contentValues.put("timestamp_millis", Long.valueOf((long)v52.p));
            try {
                if (this.B().insert("trigger_uris", null, contentValues) == -1L) {
                    this.j().G().b("Failed to insert trigger URI (got -1). appId", Y1.v(string2));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block4;
            }
            return true;
        }
        this.j().G().c("Error storing trigger URI. appId", Y1.v(string2), (Object)sQLiteException2);
        return false;
    }

    public final boolean i0(String string2, Bundle arrby) {
        SQLiteException sQLiteException2;
        block3 : {
            this.n();
            this.u();
            arrby = new A(this.a, "", string2, "dep", 0L, 0L, (Bundle)arrby);
            arrby = this.o().F((A)arrby).h();
            this.j().K().c("Saving default event parameters, appId, data size", this.h().c(string2), arrby.length);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string2);
            contentValues.put("parameters", arrby);
            try {
                if (this.B().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert default event parameters (got -1). appId", Y1.v(string2));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            return true;
        }
        this.j().G().c("Error storing default event parameters. appId", Y1.v(string2), (Object)sQLiteException2);
        return false;
    }

    public final boolean j0(String string2, Long l8, long l9, com.google.android.gms.internal.measurement.Y1 arrby) {
        SQLiteException sQLiteException2;
        block3 : {
            this.n();
            this.u();
            n.i(arrby);
            n.e(string2);
            n.i((Object)l8);
            arrby = arrby.h();
            this.j().K().c("Saving complex main event, appId, data size", this.h().c(string2), arrby.length);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string2);
            contentValues.put("event_id", l8);
            contentValues.put("children_to_process", Long.valueOf((long)l9));
            contentValues.put("main_event", arrby);
            try {
                if (this.B().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert complex main event (got -1). appId", Y1.v(string2));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            return true;
        }
        this.j().G().c("Error storing complex main event. appId", Y1.v(string2), (Object)sQLiteException2);
        return false;
    }

    public final boolean u0() {
        return this.a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long v0(String string2) {
        n.e(string2);
        return this.G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{string2}, 0L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final long w0(String var1_1, String var2_3) {
        block10 : {
            block9 : {
                block7 : {
                    block8 : {
                        n.e(var1_1);
                        n.e(var2_3);
                        this.n();
                        this.u();
                        var10_4 = this.B();
                        var10_4.beginTransaction();
                        var5_5 = 0L;
                        var9_6 = new StringBuilder("select ");
                        var9_6.append(var2_3);
                        var9_6.append(" from app2 where app_id=?");
                        var3_11 = var7_10 = this.G(var9_6.toString(), new String[]{var1_1}, -1L);
                        if (var7_10 != -1L) break block7;
                        var9_6 = new ContentValues();
                        var9_6.put("app_id", var1_1);
                        var9_6.put("first_open_count", Integer.valueOf((int)0));
                        var9_6.put("previous_install_count", Integer.valueOf((int)0));
                        if (var10_4.insertWithOnConflict("app2", null, (ContentValues)var9_6, 5) != -1L) break block8;
                        this.j().G().c("Failed to insert column (got -1). appId", Y1.v(var1_1), var2_3);
                        var10_4.endTransaction();
                        return -1L;
                    }
                    var3_11 = 0L;
                }
                var9_6 = new ContentValues();
                var9_6.put("app_id", var1_1);
                var9_6.put(var2_3, Long.valueOf((long)(1L + var3_11)));
                if ((long)var10_4.update("app2", (ContentValues)var9_6, "app_id = ?", new String[]{var1_1}) != 0L) break block9;
                this.j().G().c("Failed to update column (got 0). appId", Y1.v(var1_1), var2_3);
                var10_4.endTransaction();
                return -1L;
            }
            try {
                var10_4.setTransactionSuccessful();
            }
            catch (Throwable var1_2) {
                break block10;
            }
            var10_4.endTransaction();
            return var3_11;
            catch (SQLiteException var9_7) {
                var3_11 = var5_5;
                ** GOTO lbl-1000
            }
            catch (SQLiteException var9_8) {}
lbl-1000: // 2 sources:
            {
                this.j().G().d("Error inserting column. appId", Y1.v(var1_1), var2_3, var9_9);
            }
            var10_4.endTransaction();
            return var3_11;
        }
        var10_4.endTransaction();
        throw var1_2;
    }

    @Override
    public final boolean x() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final long x0(String var1_1, String[] var2_3) {
        block6 : {
            block5 : {
                var7_5 = this.B();
                var6_6 = null;
                var5_7 = null;
                var5_7 = var2_3 = var7_5.rawQuery(var1_1, (String[])var2_3);
                var6_6 = var2_3;
                if (!var2_3.moveToFirst()) break block5;
                var5_7 = var2_3;
                var6_6 = var2_3;
                var3_8 = var2_3.getLong(0);
                var2_3.close();
                return var3_8;
            }
            var5_7 = var2_3;
            var6_6 = var2_3;
            try {
                ** try [egrp 2[TRYBLOCK] [6 : 71->82)] { 
lbl18: // 1 sources:
                throw new SQLiteException("Database returned empty set");
            }
            catch (Throwable var1_2) {
                break block6;
            }
lbl21: // 2 sources:
            catch (SQLiteException var2_4) {}
            var5_7 = var6_6;
            this.j().G().c("Database error", var1_1, (Object)var2_4);
            var5_7 = var6_6;
            throw var2_4;
        }
        if (var5_7 == null) throw var1_2;
        var5_7.close();
        throw var1_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final long y() {
        Throwable throwable222;
        Cursor cursor;
        block6 : {
            Cursor cursor2;
            Cursor cursor3;
            block5 : {
                cursor3 = null;
                cursor = null;
                cursor = cursor2 = this.B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                cursor3 = cursor2;
                boolean bl = cursor2.moveToFirst();
                if (bl) break block5;
                cursor2.close();
                return -1L;
            }
            cursor = cursor2;
            cursor3 = cursor2;
            long l8 = cursor2.getLong(0);
            cursor2.close();
            return l8;
            {
                catch (Throwable throwable222) {
                    break block6;
                }
                catch (SQLiteException sQLiteException) {}
                cursor = cursor3;
                {
                    this.j().G().b("Error querying raw events", (Object)sQLiteException);
                    if (cursor3 == null) return -1L;
                }
                cursor3.close();
                return -1L;
            }
        }
        if (cursor == null) throw throwable222;
        cursor.close();
        throw throwable222;
    }

    /*
     * Exception decompiling
     */
    public final List y0(String var1_1, String var2_5, String var3_8) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[UNCONDITIONALDOLOOP]], but top level block is 5[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final long z() {
        return this.G("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final boolean z0(String string2, List object) {
        long l8;
        n.e(string2);
        this.u();
        this.n();
        SQLiteDatabase sQLiteDatabase = this.B();
        try {
            l8 = this.x0("select count(1) from audience_filter_values where app_id=?", new String[]{string2});
        }
        catch (SQLiteException sQLiteException) {
            this.j().G().c("Database error querying filters. appId", Y1.v(string2), (Object)sQLiteException);
            return false;
        }
        int n8 = Math.max((int)0, (int)Math.min((int)2000, (int)this.f().u(string2, K.H)));
        if (l8 <= (long)n8) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < object.size(); ++i8) {
            Integer n9 = (Integer)object.get(i8);
            if (n9 == null) {
                return false;
            }
            arrayList.add((Object)Integer.toString((int)n9));
        }
        object = TextUtils.join((CharSequence)",", (Iterable)arrayList);
        arrayList = new StringBuilder("(");
        arrayList.append((String)object);
        arrayList.append(")");
        object = arrayList.toString();
        arrayList = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
        arrayList.append((String)object);
        arrayList.append(" order by rowid desc limit -1 offset ?)");
        if (sQLiteDatabase.delete("audience_filter_values", arrayList.toString(), new String[]{string2, Integer.toString((int)n8)}) > 0) {
            return true;
        }
        return false;
    }
}

