// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.w1;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.g7;
import android.text.TextUtils;
import t.a;
import android.util.Pair;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Map;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.d2;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.Y3;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable$Creator;
import android.database.sqlite.SQLiteException;
import A2.n;
import android.content.ContentValues;
import android.database.Cursor;

public final class p extends C5
{
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public final v d;
    public final w5 e;
    
    static {
        f = new String[] { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;" };
        g = new String[] { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
        h = new String[] { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;" };
        i = new String[] { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
        j = new String[] { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
        k = new String[] { "session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;" };
        l = new String[] { "session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;" };
        m = new String[] { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
        n = new String[] { "consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;" };
        o = new String[] { "idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);" };
    }
    
    public p(final D5 d5) {
        super(d5);
        this.e = new w5(this.b());
        this.d = new v(this, this.a(), "google_app_measurement.db");
    }
    
    public static void V(final ContentValues contentValues, final String s, final Object o) {
        A2.n.e(s);
        A2.n.i(o);
        if (o instanceof String) {
            contentValues.put(s, (String)o);
            return;
        }
        if (o instanceof Long) {
            contentValues.put(s, (Long)o);
            return;
        }
        if (o instanceof Double) {
            contentValues.put(s, (Double)o);
            return;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
    
    public final long A() {
        return this.G("select max(timestamp) from raw_events", null, 0L);
    }
    
    public final e A0(final String s, final String s2) {
        while (true) {
            A2.n.e(s);
            A2.n.e(s2);
            this.n();
            this.u();
            String string = null;
            Object query = null;
            Label_0566: {
                Object o = null;
                Label_0521: {
                    while (true) {
                        Label_0580: {
                            try {
                                query = this.B().query("conditional_properties", new String[] { "origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event" }, "app_id=? and name=?", new String[] { s, s2 }, (String)null, (String)null, (String)null);
                                try {
                                    if (!((Cursor)query).moveToFirst()) {
                                        ((Cursor)query).close();
                                        return null;
                                    }
                                    string = ((Cursor)query).getString(0);
                                    if ((o = string) == null) {
                                        o = "";
                                    }
                                }
                                catch (SQLiteException o) {
                                    break Label_0521;
                                }
                                string = (String)query;
                                try {
                                    try {
                                        final Object m = this.M((Cursor)query, 1);
                                        string = (String)query;
                                        if (((Cursor)query).getInt(2) == 0) {
                                            break Label_0580;
                                        }
                                        final boolean b = true;
                                        string = (String)query;
                                        final String string2 = ((Cursor)query).getString(3);
                                        string = (String)query;
                                        final long long1 = ((Cursor)query).getLong(4);
                                        string = (String)query;
                                        final N5 o2 = this.o();
                                        string = (String)query;
                                        final byte[] blob = ((Cursor)query).getBlob(5);
                                        string = (String)query;
                                        final Parcelable$Creator<I> creator = I.CREATOR;
                                        string = (String)query;
                                        final I i = (I)o2.E(blob, creator);
                                        string = (String)query;
                                        final long long2 = ((Cursor)query).getLong(6);
                                        string = (String)query;
                                        final I j = (I)this.o().E(((Cursor)query).getBlob(7), creator);
                                        string = (String)query;
                                        final long long3 = ((Cursor)query).getLong(8);
                                        string = (String)query;
                                        final long long4 = ((Cursor)query).getLong(9);
                                        string = (String)query;
                                        final I k = (I)this.o().E(((Cursor)query).getBlob(10), creator);
                                        string = (String)query;
                                        o = new e(s, (String)o, new R5(s2, long3, m, (String)o), long2, b, string2, i, long1, j, long4, k);
                                        string = (String)query;
                                        if (!((Cursor)query).moveToNext()) {}
                                        string = (String)query;
                                        this.j().G().c("Got multiple records for conditional property, expected one", Y1.v(s), this.h().g(s2));
                                    }
                                    finally {}
                                }
                                catch (SQLiteException o) {
                                    break Label_0521;
                                }
                                final Cursor cursor;
                                cursor.close();
                                return (e)o;
                            }
                            catch (SQLiteException o) {
                                query = null;
                            }
                            finally {
                                query = string;
                                break Label_0566;
                            }
                            break Label_0521;
                        }
                        final boolean b = false;
                        continue;
                    }
                }
                this.j().G().d("Error querying conditional property", Y1.v(s), this.h().g(s2), o);
                if (query != null) {
                    ((Cursor)query).close();
                }
                return null;
            }
            if (query != null) {
                ((Cursor)query).close();
            }
            throw s;
        }
    }
    
    public final SQLiteDatabase B() {
        this.n();
        try {
            return this.d.getWritableDatabase();
        }
        catch (SQLiteException ex) {
            this.j().L().b("Error opening database", ex);
            throw ex;
        }
    }
    
    public final Bundle B0(String s) {
        this.n();
        this.u();
        Object rawQuery = null;
        Object o = null;
        Throwable t = null;
        Label_0368: {
            final SQLiteException ex2;
            try {
                final Cursor cursor = (Cursor)(rawQuery = this.B().rawQuery("select parameters from default_event_params where app_id=?", new String[] { s }));
                final Cursor cursor2;
                try {
                    try {
                        if (!cursor.moveToFirst()) {
                            rawQuery = cursor;
                            this.j().K().a("Default event parameters not found");
                            cursor.close();
                            return null;
                        }
                    }
                    finally {
                        s = (String)rawQuery;
                        rawQuery = cursor2;
                    }
                }
                catch (SQLiteException rawQuery) {}
                rawQuery = cursor2;
                final byte[] blob = cursor2.getBlob(0);
                rawQuery = cursor2;
                try {
                    final com.google.android.gms.internal.measurement.Y1 y1 = (com.google.android.gms.internal.measurement.Y1)((Y3.b)N5.H(com.google.android.gms.internal.measurement.Y1.Z(), blob)).p();
                    rawQuery = cursor2;
                    this.o();
                    rawQuery = cursor2;
                    final List c0 = y1.c0();
                    rawQuery = cursor2;
                    s = (String)new Bundle();
                    rawQuery = cursor2;
                    final Iterator<a2> iterator = c0.iterator();
                    while (true) {
                        rawQuery = cursor2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        rawQuery = cursor2;
                        final a2 a2 = iterator.next();
                        rawQuery = cursor2;
                        final String c2 = a2.c0();
                        rawQuery = cursor2;
                        if (a2.f0()) {
                            rawQuery = cursor2;
                            ((BaseBundle)s).putDouble(c2, a2.G());
                        }
                        else {
                            rawQuery = cursor2;
                            if (a2.g0()) {
                                rawQuery = cursor2;
                                ((Bundle)s).putFloat(c2, a2.R());
                            }
                            else {
                                rawQuery = cursor2;
                                if (a2.j0()) {
                                    rawQuery = cursor2;
                                    ((BaseBundle)s).putString(c2, a2.d0());
                                }
                                else {
                                    rawQuery = cursor2;
                                    if (!a2.h0()) {
                                        continue;
                                    }
                                    rawQuery = cursor2;
                                    ((BaseBundle)s).putLong(c2, a2.X());
                                }
                            }
                        }
                    }
                    cursor2.close();
                    return (Bundle)s;
                }
                catch (IOException ex) {
                    rawQuery = cursor2;
                    this.j().G().c("Failed to retrieve default event parameters. appId", Y1.v(s), ex);
                    cursor2.close();
                    return null;
                }
            }
            catch (SQLiteException ex2) {
                o = null;
            }
            finally {
                o = rawQuery;
                t = (Throwable)ex2;
                break Label_0368;
            }
            this.j().G().b("Error selecting default event parameters", ex2);
            if (o != null) {
                ((Cursor)o).close();
            }
            return null;
        }
        if (o != null) {
            ((Cursor)o).close();
        }
        throw t;
    }
    
    public final String C() {
        final SQLiteDatabase b = this.B();
        Cursor cursor3 = null;
        Label_0096: {
            String string = null;
            Cursor cursor2 = null;
            Label_0068: {
                try {
                    final Cursor rawQuery = b.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", (String[])null);
                    try {
                        try {
                            if (rawQuery.moveToFirst()) {
                                string = rawQuery.getString(0);
                                rawQuery.close();
                                return string;
                            }
                        }
                        finally {}
                    }
                    catch (SQLiteException string) {
                        break Label_0068;
                    }
                    final Cursor cursor;
                    cursor.close();
                    return null;
                }
                catch (SQLiteException string) {
                    cursor2 = null;
                }
                finally {
                    cursor3 = null;
                    break Label_0096;
                }
            }
            this.j().G().b("Database error getting next bundle app id", string);
            if (cursor2 != null) {
                cursor2.close();
            }
            return null;
        }
        if (cursor3 != null) {
            cursor3.close();
        }
    }
    
    public final E C0(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_2        
        //     6: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //     9: pop            
        //    10: aload_0        
        //    11: invokevirtual   R2/m3.n:()V
        //    14: aload_0        
        //    15: invokevirtual   R2/C5.u:()V
        //    18: new             Ljava/util/ArrayList;
        //    21: dup            
        //    22: bipush          9
        //    24: anewarray       Ljava/lang/String;
        //    27: dup            
        //    28: iconst_0       
        //    29: ldc_w           "lifetime_count"
        //    32: aastore        
        //    33: dup            
        //    34: iconst_1       
        //    35: ldc_w           "current_bundle_count"
        //    38: aastore        
        //    39: dup            
        //    40: iconst_2       
        //    41: ldc_w           "last_fire_timestamp"
        //    44: aastore        
        //    45: dup            
        //    46: iconst_3       
        //    47: ldc             "last_bundled_timestamp"
        //    49: aastore        
        //    50: dup            
        //    51: iconst_4       
        //    52: ldc             "last_bundled_day"
        //    54: aastore        
        //    55: dup            
        //    56: iconst_5       
        //    57: ldc             "last_sampled_complex_event_id"
        //    59: aastore        
        //    60: dup            
        //    61: bipush          6
        //    63: ldc             "last_sampling_rate"
        //    65: aastore        
        //    66: dup            
        //    67: bipush          7
        //    69: ldc             "last_exempt_from_sampling"
        //    71: aastore        
        //    72: dup            
        //    73: bipush          8
        //    75: ldc             "current_session_count"
        //    77: aastore        
        //    78: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    81: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //    84: astore          16
        //    86: aconst_null    
        //    87: astore          15
        //    89: aload_0        
        //    90: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    93: astore          17
        //    95: iconst_0       
        //    96: istore_3       
        //    97: aload           17
        //    99: ldc_w           "events"
        //   102: aload           16
        //   104: iconst_0       
        //   105: anewarray       Ljava/lang/String;
        //   108: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   111: checkcast       [Ljava/lang/String;
        //   114: ldc_w           "app_id=? and name=?"
        //   117: iconst_2       
        //   118: anewarray       Ljava/lang/String;
        //   121: dup            
        //   122: iconst_0       
        //   123: aload_1        
        //   124: aastore        
        //   125: dup            
        //   126: iconst_1       
        //   127: aload_2        
        //   128: aastore        
        //   129: aconst_null    
        //   130: aconst_null    
        //   131: aconst_null    
        //   132: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   135: astore          16
        //   137: aload           16
        //   139: astore          15
        //   141: aload           16
        //   143: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   148: istore          4
        //   150: iload           4
        //   152: ifne            164
        //   155: aload           16
        //   157: invokeinterface android/database/Cursor.close:()V
        //   162: aconst_null    
        //   163: areturn        
        //   164: aload           16
        //   166: astore          15
        //   168: aload           16
        //   170: iconst_0       
        //   171: invokeinterface android/database/Cursor.getLong:(I)J
        //   176: lstore          9
        //   178: aload           16
        //   180: astore          15
        //   182: aload           16
        //   184: iconst_1       
        //   185: invokeinterface android/database/Cursor.getLong:(I)J
        //   190: lstore          11
        //   192: aload           16
        //   194: astore          15
        //   196: aload           16
        //   198: iconst_2       
        //   199: invokeinterface android/database/Cursor.getLong:(I)J
        //   204: lstore          13
        //   206: aload           16
        //   208: astore          15
        //   210: aload           16
        //   212: iconst_3       
        //   213: invokeinterface android/database/Cursor.isNull:(I)Z
        //   218: ifeq            227
        //   221: lconst_0       
        //   222: lstore          5
        //   224: goto            241
        //   227: aload           16
        //   229: astore          15
        //   231: aload           16
        //   233: iconst_3       
        //   234: invokeinterface android/database/Cursor.getLong:(I)J
        //   239: lstore          5
        //   241: aload           16
        //   243: astore          15
        //   245: aload           16
        //   247: iconst_4       
        //   248: invokeinterface android/database/Cursor.isNull:(I)Z
        //   253: ifeq            262
        //   256: aconst_null    
        //   257: astore          17
        //   259: goto            279
        //   262: aload           16
        //   264: astore          15
        //   266: aload           16
        //   268: iconst_4       
        //   269: invokeinterface android/database/Cursor.getLong:(I)J
        //   274: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   277: astore          17
        //   279: aload           16
        //   281: astore          15
        //   283: aload           16
        //   285: iconst_5       
        //   286: invokeinterface android/database/Cursor.isNull:(I)Z
        //   291: ifeq            300
        //   294: aconst_null    
        //   295: astore          18
        //   297: goto            317
        //   300: aload           16
        //   302: astore          15
        //   304: aload           16
        //   306: iconst_5       
        //   307: invokeinterface android/database/Cursor.getLong:(I)J
        //   312: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   315: astore          18
        //   317: aload           16
        //   319: astore          15
        //   321: aload           16
        //   323: bipush          6
        //   325: invokeinterface android/database/Cursor.isNull:(I)Z
        //   330: ifeq            339
        //   333: aconst_null    
        //   334: astore          19
        //   336: goto            357
        //   339: aload           16
        //   341: astore          15
        //   343: aload           16
        //   345: bipush          6
        //   347: invokeinterface android/database/Cursor.getLong:(I)J
        //   352: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   355: astore          19
        //   357: aload           16
        //   359: astore          15
        //   361: aload           16
        //   363: bipush          7
        //   365: invokeinterface android/database/Cursor.isNull:(I)Z
        //   370: ifne            598
        //   373: aload           16
        //   375: astore          15
        //   377: aload           16
        //   379: bipush          7
        //   381: invokeinterface android/database/Cursor.getLong:(I)J
        //   386: lconst_1       
        //   387: lcmp           
        //   388: ifne            393
        //   391: iconst_1       
        //   392: istore_3       
        //   393: aload           16
        //   395: astore          15
        //   397: iload_3        
        //   398: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   401: astore          20
        //   403: goto            406
        //   406: aload           16
        //   408: astore          15
        //   410: aload           16
        //   412: bipush          8
        //   414: invokeinterface android/database/Cursor.isNull:(I)Z
        //   419: ifeq            428
        //   422: lconst_0       
        //   423: lstore          7
        //   425: goto            443
        //   428: aload           16
        //   430: astore          15
        //   432: aload           16
        //   434: bipush          8
        //   436: invokeinterface android/database/Cursor.getLong:(I)J
        //   441: lstore          7
        //   443: aload           16
        //   445: astore          15
        //   447: new             LR2/E;
        //   450: dup            
        //   451: aload_1        
        //   452: aload_2        
        //   453: lload           9
        //   455: lload           11
        //   457: lload           7
        //   459: lload           13
        //   461: lload           5
        //   463: aload           17
        //   465: aload           18
        //   467: aload           19
        //   469: aload           20
        //   471: invokespecial   R2/E.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        //   474: astore          17
        //   476: aload           16
        //   478: astore          15
        //   480: aload           16
        //   482: invokeinterface android/database/Cursor.moveToNext:()Z
        //   487: ifeq            511
        //   490: aload           16
        //   492: astore          15
        //   494: aload_0        
        //   495: invokevirtual   R2/m3.j:()LR2/Y1;
        //   498: invokevirtual   R2/Y1.G:()LR2/a2;
        //   501: ldc_w           "Got multiple records for event aggregates, expected one. appId"
        //   504: aload_1        
        //   505: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   508: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   511: aload           16
        //   513: invokeinterface android/database/Cursor.close:()V
        //   518: aload           17
        //   520: areturn        
        //   521: astore_1       
        //   522: goto            575
        //   525: astore          17
        //   527: aconst_null    
        //   528: astore          16
        //   530: aload           16
        //   532: astore          15
        //   534: aload_0        
        //   535: invokevirtual   R2/m3.j:()LR2/Y1;
        //   538: invokevirtual   R2/Y1.G:()LR2/a2;
        //   541: ldc_w           "Error querying events. appId"
        //   544: aload_1        
        //   545: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   548: aload_0        
        //   549: invokevirtual   R2/m3.h:()LR2/X1;
        //   552: aload_2        
        //   553: invokevirtual   R2/X1.c:(Ljava/lang/String;)Ljava/lang/String;
        //   556: aload           17
        //   558: invokevirtual   R2/a2.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   561: aload           16
        //   563: ifnull          573
        //   566: aload           16
        //   568: invokeinterface android/database/Cursor.close:()V
        //   573: aconst_null    
        //   574: areturn        
        //   575: aload           15
        //   577: ifnull          587
        //   580: aload           15
        //   582: invokeinterface android/database/Cursor.close:()V
        //   587: aload_1        
        //   588: athrow         
        //   589: astore_1       
        //   590: goto            575
        //   593: astore          17
        //   595: goto            530
        //   598: aconst_null    
        //   599: astore          20
        //   601: goto            406
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  89     95     525    530    Landroid/database/sqlite/SQLiteException;
        //  89     95     521    525    Any
        //  97     137    525    530    Landroid/database/sqlite/SQLiteException;
        //  97     137    521    525    Any
        //  141    150    593    598    Landroid/database/sqlite/SQLiteException;
        //  141    150    589    593    Any
        //  168    178    593    598    Landroid/database/sqlite/SQLiteException;
        //  168    178    589    593    Any
        //  182    192    593    598    Landroid/database/sqlite/SQLiteException;
        //  182    192    589    593    Any
        //  196    206    593    598    Landroid/database/sqlite/SQLiteException;
        //  196    206    589    593    Any
        //  210    221    593    598    Landroid/database/sqlite/SQLiteException;
        //  210    221    589    593    Any
        //  231    241    593    598    Landroid/database/sqlite/SQLiteException;
        //  231    241    589    593    Any
        //  245    256    593    598    Landroid/database/sqlite/SQLiteException;
        //  245    256    589    593    Any
        //  266    279    593    598    Landroid/database/sqlite/SQLiteException;
        //  266    279    589    593    Any
        //  283    294    593    598    Landroid/database/sqlite/SQLiteException;
        //  283    294    589    593    Any
        //  304    317    593    598    Landroid/database/sqlite/SQLiteException;
        //  304    317    589    593    Any
        //  321    333    593    598    Landroid/database/sqlite/SQLiteException;
        //  321    333    589    593    Any
        //  343    357    593    598    Landroid/database/sqlite/SQLiteException;
        //  343    357    589    593    Any
        //  361    373    593    598    Landroid/database/sqlite/SQLiteException;
        //  361    373    589    593    Any
        //  377    391    593    598    Landroid/database/sqlite/SQLiteException;
        //  377    391    589    593    Any
        //  397    403    593    598    Landroid/database/sqlite/SQLiteException;
        //  397    403    589    593    Any
        //  410    422    593    598    Landroid/database/sqlite/SQLiteException;
        //  410    422    589    593    Any
        //  432    443    593    598    Landroid/database/sqlite/SQLiteException;
        //  432    443    589    593    Any
        //  447    476    593    598    Landroid/database/sqlite/SQLiteException;
        //  447    476    589    593    Any
        //  480    490    593    598    Landroid/database/sqlite/SQLiteException;
        //  480    490    589    593    Any
        //  494    511    593    598    Landroid/database/sqlite/SQLiteException;
        //  494    511    589    593    Any
        //  534    561    589    593    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0164:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final int D(final String s, final String s2) {
        A2.n.e(s);
        A2.n.e(s2);
        this.n();
        this.u();
        try {
            return this.B().delete("conditional_properties", "app_id=? and name=?", new String[] { s, s2 });
        }
        catch (SQLiteException ex) {
            this.j().G().d("Error deleting conditional property", Y1.v(s), this.h().g(s2), ex);
            return 0;
        }
    }
    
    public final I2 D0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_0        
        //     6: invokevirtual   R2/m3.n:()V
        //     9: aload_0        
        //    10: invokevirtual   R2/C5.u:()V
        //    13: aconst_null    
        //    14: astore          7
        //    16: aload_0        
        //    17: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    20: astore          6
        //    22: iconst_0       
        //    23: istore_3       
        //    24: aload           6
        //    26: ldc_w           "apps"
        //    29: bipush          36
        //    31: anewarray       Ljava/lang/String;
        //    34: dup            
        //    35: iconst_0       
        //    36: ldc_w           "app_instance_id"
        //    39: aastore        
        //    40: dup            
        //    41: iconst_1       
        //    42: ldc_w           "gmp_app_id"
        //    45: aastore        
        //    46: dup            
        //    47: iconst_2       
        //    48: ldc_w           "resettable_device_id_hash"
        //    51: aastore        
        //    52: dup            
        //    53: iconst_3       
        //    54: ldc_w           "last_bundle_index"
        //    57: aastore        
        //    58: dup            
        //    59: iconst_4       
        //    60: ldc             "last_bundle_start_timestamp"
        //    62: aastore        
        //    63: dup            
        //    64: iconst_5       
        //    65: ldc_w           "last_bundle_end_timestamp"
        //    68: aastore        
        //    69: dup            
        //    70: bipush          6
        //    72: ldc             "app_version"
        //    74: aastore        
        //    75: dup            
        //    76: bipush          7
        //    78: ldc             "app_store"
        //    80: aastore        
        //    81: dup            
        //    82: bipush          8
        //    84: ldc             "gmp_version"
        //    86: aastore        
        //    87: dup            
        //    88: bipush          9
        //    90: ldc             "dev_cert_hash"
        //    92: aastore        
        //    93: dup            
        //    94: bipush          10
        //    96: ldc             "measurement_enabled"
        //    98: aastore        
        //    99: dup            
        //   100: bipush          11
        //   102: ldc             "day"
        //   104: aastore        
        //   105: dup            
        //   106: bipush          12
        //   108: ldc             "daily_public_events_count"
        //   110: aastore        
        //   111: dup            
        //   112: bipush          13
        //   114: ldc             "daily_events_count"
        //   116: aastore        
        //   117: dup            
        //   118: bipush          14
        //   120: ldc             "daily_conversions_count"
        //   122: aastore        
        //   123: dup            
        //   124: bipush          15
        //   126: ldc             "config_fetched_time"
        //   128: aastore        
        //   129: dup            
        //   130: bipush          16
        //   132: ldc             "failed_config_fetch_time"
        //   134: aastore        
        //   135: dup            
        //   136: bipush          17
        //   138: ldc             "app_version_int"
        //   140: aastore        
        //   141: dup            
        //   142: bipush          18
        //   144: ldc             "firebase_instance_id"
        //   146: aastore        
        //   147: dup            
        //   148: bipush          19
        //   150: ldc             "daily_error_events_count"
        //   152: aastore        
        //   153: dup            
        //   154: bipush          20
        //   156: ldc             "daily_realtime_events_count"
        //   158: aastore        
        //   159: dup            
        //   160: bipush          21
        //   162: ldc             "health_monitor_sample"
        //   164: aastore        
        //   165: dup            
        //   166: bipush          22
        //   168: ldc             "android_id"
        //   170: aastore        
        //   171: dup            
        //   172: bipush          23
        //   174: ldc             "adid_reporting_enabled"
        //   176: aastore        
        //   177: dup            
        //   178: bipush          24
        //   180: ldc             "admob_app_id"
        //   182: aastore        
        //   183: dup            
        //   184: bipush          25
        //   186: ldc             "dynamite_version"
        //   188: aastore        
        //   189: dup            
        //   190: bipush          26
        //   192: ldc             "safelisted_events"
        //   194: aastore        
        //   195: dup            
        //   196: bipush          27
        //   198: ldc             "ga_app_id"
        //   200: aastore        
        //   201: dup            
        //   202: bipush          28
        //   204: ldc             "session_stitching_token"
        //   206: aastore        
        //   207: dup            
        //   208: bipush          29
        //   210: ldc             "sgtm_upload_enabled"
        //   212: aastore        
        //   213: dup            
        //   214: bipush          30
        //   216: ldc             "target_os_version"
        //   218: aastore        
        //   219: dup            
        //   220: bipush          31
        //   222: ldc             "session_stitching_token_hash"
        //   224: aastore        
        //   225: dup            
        //   226: bipush          32
        //   228: ldc             "ad_services_version"
        //   230: aastore        
        //   231: dup            
        //   232: bipush          33
        //   234: ldc             "unmatched_first_open_without_ad_id"
        //   236: aastore        
        //   237: dup            
        //   238: bipush          34
        //   240: ldc             "npa_metadata_value"
        //   242: aastore        
        //   243: dup            
        //   244: bipush          35
        //   246: ldc             "attribution_eligibility_status"
        //   248: aastore        
        //   249: ldc_w           "app_id=?"
        //   252: iconst_1       
        //   253: anewarray       Ljava/lang/String;
        //   256: dup            
        //   257: iconst_0       
        //   258: aload_1        
        //   259: aastore        
        //   260: aconst_null    
        //   261: aconst_null    
        //   262: aconst_null    
        //   263: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   266: astore          6
        //   268: aload           6
        //   270: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   275: istore_2       
        //   276: iload_2        
        //   277: ifne            289
        //   280: aload           6
        //   282: invokeinterface android/database/Cursor.close:()V
        //   287: aconst_null    
        //   288: areturn        
        //   289: aload           6
        //   291: astore          7
        //   293: new             LR2/I2;
        //   296: dup            
        //   297: aload_0        
        //   298: getfield        R2/z5.b:LR2/D5;
        //   301: invokevirtual   R2/D5.i0:()LR2/N2;
        //   304: aload_1        
        //   305: invokespecial   R2/I2.<init>:(LR2/N2;Ljava/lang/String;)V
        //   308: astore          9
        //   310: aload           6
        //   312: astore          7
        //   314: aload           9
        //   316: aload           6
        //   318: iconst_0       
        //   319: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   324: invokevirtual   R2/I2.x:(Ljava/lang/String;)V
        //   327: aload           6
        //   329: astore          7
        //   331: aload           9
        //   333: aload           6
        //   335: iconst_1       
        //   336: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   341: invokevirtual   R2/I2.M:(Ljava/lang/String;)V
        //   344: aload           6
        //   346: astore          7
        //   348: aload           9
        //   350: aload           6
        //   352: iconst_2       
        //   353: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   358: invokevirtual   R2/I2.S:(Ljava/lang/String;)V
        //   361: aload           6
        //   363: astore          7
        //   365: aload           9
        //   367: aload           6
        //   369: iconst_3       
        //   370: invokeinterface android/database/Cursor.getLong:(I)J
        //   375: invokevirtual   R2/I2.h0:(J)V
        //   378: aload           6
        //   380: astore          7
        //   382: aload           9
        //   384: aload           6
        //   386: iconst_4       
        //   387: invokeinterface android/database/Cursor.getLong:(I)J
        //   392: invokevirtual   R2/I2.j0:(J)V
        //   395: aload           6
        //   397: astore          7
        //   399: aload           9
        //   401: aload           6
        //   403: iconst_5       
        //   404: invokeinterface android/database/Cursor.getLong:(I)J
        //   409: invokevirtual   R2/I2.f0:(J)V
        //   412: aload           6
        //   414: astore          7
        //   416: aload           9
        //   418: aload           6
        //   420: bipush          6
        //   422: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   427: invokevirtual   R2/I2.F:(Ljava/lang/String;)V
        //   430: aload           6
        //   432: astore          7
        //   434: aload           9
        //   436: aload           6
        //   438: bipush          7
        //   440: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   445: invokevirtual   R2/I2.B:(Ljava/lang/String;)V
        //   448: aload           6
        //   450: astore          7
        //   452: aload           9
        //   454: aload           6
        //   456: bipush          8
        //   458: invokeinterface android/database/Cursor.getLong:(I)J
        //   463: invokevirtual   R2/I2.d0:(J)V
        //   466: aload           6
        //   468: astore          7
        //   470: aload           9
        //   472: aload           6
        //   474: bipush          9
        //   476: invokeinterface android/database/Cursor.getLong:(I)J
        //   481: invokevirtual   R2/I2.X:(J)V
        //   484: aload           6
        //   486: astore          7
        //   488: aload           6
        //   490: bipush          10
        //   492: invokeinterface android/database/Cursor.isNull:(I)Z
        //   497: ifne            1463
        //   500: aload           6
        //   502: astore          7
        //   504: aload           6
        //   506: bipush          10
        //   508: invokeinterface android/database/Cursor.getInt:(I)I
        //   513: ifeq            1445
        //   516: goto            1463
        //   519: aload           6
        //   521: astore          7
        //   523: aload           9
        //   525: iload_2        
        //   526: invokevirtual   R2/I2.y:(Z)V
        //   529: aload           6
        //   531: astore          7
        //   533: aload           9
        //   535: aload           6
        //   537: bipush          11
        //   539: invokeinterface android/database/Cursor.getLong:(I)J
        //   544: invokevirtual   R2/I2.U:(J)V
        //   547: aload           6
        //   549: astore          7
        //   551: aload           9
        //   553: aload           6
        //   555: bipush          12
        //   557: invokeinterface android/database/Cursor.getLong:(I)J
        //   562: invokevirtual   R2/I2.O:(J)V
        //   565: aload           6
        //   567: astore          7
        //   569: aload           9
        //   571: aload           6
        //   573: bipush          13
        //   575: invokeinterface android/database/Cursor.getLong:(I)J
        //   580: invokevirtual   R2/I2.L:(J)V
        //   583: aload           6
        //   585: astore          7
        //   587: aload           9
        //   589: aload           6
        //   591: bipush          14
        //   593: invokeinterface android/database/Cursor.getLong:(I)J
        //   598: invokevirtual   R2/I2.E:(J)V
        //   601: aload           6
        //   603: astore          7
        //   605: aload           9
        //   607: aload           6
        //   609: bipush          15
        //   611: invokeinterface android/database/Cursor.getLong:(I)J
        //   616: invokevirtual   R2/I2.A:(J)V
        //   619: aload           6
        //   621: astore          7
        //   623: aload           9
        //   625: aload           6
        //   627: bipush          16
        //   629: invokeinterface android/database/Cursor.getLong:(I)J
        //   634: invokevirtual   R2/I2.b0:(J)V
        //   637: aload           6
        //   639: astore          7
        //   641: aload           6
        //   643: bipush          17
        //   645: invokeinterface android/database/Cursor.isNull:(I)Z
        //   650: ifeq            661
        //   653: ldc2_w          -2147483648
        //   656: lstore          4
        //   658: goto            677
        //   661: aload           6
        //   663: astore          7
        //   665: aload           6
        //   667: bipush          17
        //   669: invokeinterface android/database/Cursor.getInt:(I)I
        //   674: i2l            
        //   675: lstore          4
        //   677: aload           6
        //   679: astore          7
        //   681: aload           9
        //   683: lload           4
        //   685: invokevirtual   R2/I2.c:(J)V
        //   688: aload           6
        //   690: astore          7
        //   692: aload           9
        //   694: aload           6
        //   696: bipush          18
        //   698: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   703: invokevirtual   R2/I2.J:(Ljava/lang/String;)V
        //   706: aload           6
        //   708: astore          7
        //   710: aload           9
        //   712: aload           6
        //   714: bipush          19
        //   716: invokeinterface android/database/Cursor.getLong:(I)J
        //   721: invokevirtual   R2/I2.I:(J)V
        //   724: aload           6
        //   726: astore          7
        //   728: aload           9
        //   730: aload           6
        //   732: bipush          20
        //   734: invokeinterface android/database/Cursor.getLong:(I)J
        //   739: invokevirtual   R2/I2.R:(J)V
        //   742: aload           6
        //   744: astore          7
        //   746: aload           9
        //   748: aload           6
        //   750: bipush          21
        //   752: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   757: invokevirtual   R2/I2.P:(Ljava/lang/String;)V
        //   760: aload           6
        //   762: astore          7
        //   764: aload           6
        //   766: bipush          23
        //   768: invokeinterface android/database/Cursor.isNull:(I)Z
        //   773: ifne            1473
        //   776: aload           6
        //   778: astore          7
        //   780: aload           6
        //   782: bipush          23
        //   784: invokeinterface android/database/Cursor.getInt:(I)I
        //   789: ifeq            1468
        //   792: goto            1473
        //   795: aload           6
        //   797: astore          7
        //   799: aload           9
        //   801: iload_2        
        //   802: invokevirtual   R2/I2.g:(Z)V
        //   805: aload           6
        //   807: astore          7
        //   809: aload           9
        //   811: aload           6
        //   813: bipush          24
        //   815: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   820: invokevirtual   R2/I2.e:(Ljava/lang/String;)V
        //   823: aload           6
        //   825: astore          7
        //   827: aload           6
        //   829: bipush          25
        //   831: invokeinterface android/database/Cursor.isNull:(I)Z
        //   836: ifeq            845
        //   839: lconst_0       
        //   840: lstore          4
        //   842: goto            860
        //   845: aload           6
        //   847: astore          7
        //   849: aload           6
        //   851: bipush          25
        //   853: invokeinterface android/database/Cursor.getLong:(I)J
        //   858: lstore          4
        //   860: aload           6
        //   862: astore          7
        //   864: aload           9
        //   866: lload           4
        //   868: invokevirtual   R2/I2.Z:(J)V
        //   871: aload           6
        //   873: astore          7
        //   875: aload           6
        //   877: bipush          26
        //   879: invokeinterface android/database/Cursor.isNull:(I)Z
        //   884: ifne            915
        //   887: aload           6
        //   889: astore          7
        //   891: aload           9
        //   893: aload           6
        //   895: bipush          26
        //   897: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   902: ldc_w           ","
        //   905: iconst_m1      
        //   906: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   909: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   912: invokevirtual   R2/I2.f:(Ljava/util/List;)V
        //   915: aload           6
        //   917: astore          7
        //   919: invokestatic    com/google/android/gms/internal/measurement/s7.a:()Z
        //   922: ifeq            978
        //   925: aload           6
        //   927: astore          7
        //   929: aload_0        
        //   930: invokevirtual   R2/m3.f:()LR2/g;
        //   933: aload_1        
        //   934: getstatic       R2/K.y0:LR2/P1;
        //   937: invokevirtual   R2/g.B:(Ljava/lang/String;LR2/P1;)Z
        //   940: ifne            960
        //   943: aload           6
        //   945: astore          7
        //   947: aload_0        
        //   948: invokevirtual   R2/m3.f:()LR2/g;
        //   951: getstatic       R2/K.w0:LR2/P1;
        //   954: invokevirtual   R2/g.s:(LR2/P1;)Z
        //   957: ifeq            978
        //   960: aload           6
        //   962: astore          7
        //   964: aload           9
        //   966: aload           6
        //   968: bipush          28
        //   970: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   975: invokevirtual   R2/I2.V:(Ljava/lang/String;)V
        //   978: aload           6
        //   980: astore          7
        //   982: invokestatic    com/google/android/gms/internal/measurement/E7.a:()Z
        //   985: ifeq            1052
        //   988: aload           6
        //   990: astore          7
        //   992: aload_0        
        //   993: invokevirtual   R2/m3.f:()LR2/g;
        //   996: getstatic       R2/K.A0:LR2/P1;
        //   999: invokevirtual   R2/g.s:(LR2/P1;)Z
        //  1002: ifeq            1052
        //  1005: aload           6
        //  1007: astore          7
        //  1009: aload           6
        //  1011: bipush          29
        //  1013: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1018: ifne            1478
        //  1021: aload           6
        //  1023: astore          7
        //  1025: aload           6
        //  1027: bipush          29
        //  1029: invokeinterface android/database/Cursor.getInt:(I)I
        //  1034: ifeq            1478
        //  1037: iconst_1       
        //  1038: istore_2       
        //  1039: goto            1042
        //  1042: aload           6
        //  1044: astore          7
        //  1046: aload           9
        //  1048: iload_2        
        //  1049: invokevirtual   R2/I2.C:(Z)V
        //  1052: aload           6
        //  1054: astore          7
        //  1056: aload           9
        //  1058: aload           6
        //  1060: bipush          30
        //  1062: invokeinterface android/database/Cursor.getLong:(I)J
        //  1067: invokevirtual   R2/I2.n0:(J)V
        //  1070: aload           6
        //  1072: astore          7
        //  1074: aload           9
        //  1076: aload           6
        //  1078: bipush          31
        //  1080: invokeinterface android/database/Cursor.getLong:(I)J
        //  1085: invokevirtual   R2/I2.l0:(J)V
        //  1088: aload           6
        //  1090: astore          7
        //  1092: invokestatic    com/google/android/gms/internal/measurement/g7.a:()Z
        //  1095: ifeq            1152
        //  1098: aload           6
        //  1100: astore          7
        //  1102: aload_0        
        //  1103: invokevirtual   R2/m3.f:()LR2/g;
        //  1106: aload_1        
        //  1107: getstatic       R2/K.L0:LR2/P1;
        //  1110: invokevirtual   R2/g.B:(Ljava/lang/String;LR2/P1;)Z
        //  1113: ifeq            1152
        //  1116: aload           6
        //  1118: astore          7
        //  1120: aload           9
        //  1122: aload           6
        //  1124: bipush          32
        //  1126: invokeinterface android/database/Cursor.getInt:(I)I
        //  1131: invokevirtual   R2/I2.b:(I)V
        //  1134: aload           6
        //  1136: astore          7
        //  1138: aload           9
        //  1140: aload           6
        //  1142: bipush          35
        //  1144: invokeinterface android/database/Cursor.getLong:(I)J
        //  1149: invokevirtual   R2/I2.w:(J)V
        //  1152: aload           6
        //  1154: astore          7
        //  1156: invokestatic    com/google/android/gms/internal/measurement/i6.a:()Z
        //  1159: ifeq            1227
        //  1162: aload           6
        //  1164: astore          7
        //  1166: aload_0        
        //  1167: invokevirtual   R2/m3.f:()LR2/g;
        //  1170: aload_1        
        //  1171: getstatic       R2/K.Y0:LR2/P1;
        //  1174: invokevirtual   R2/g.B:(Ljava/lang/String;LR2/P1;)Z
        //  1177: ifeq            1227
        //  1180: aload           6
        //  1182: astore          7
        //  1184: aload           6
        //  1186: bipush          33
        //  1188: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1193: ifne            1483
        //  1196: aload           6
        //  1198: astore          7
        //  1200: aload           6
        //  1202: bipush          33
        //  1204: invokeinterface android/database/Cursor.getInt:(I)I
        //  1209: ifeq            1483
        //  1212: iconst_1       
        //  1213: istore_2       
        //  1214: goto            1217
        //  1217: aload           6
        //  1219: astore          7
        //  1221: aload           9
        //  1223: iload_2        
        //  1224: invokevirtual   R2/I2.G:(Z)V
        //  1227: aload           6
        //  1229: astore          7
        //  1231: invokestatic    com/google/android/gms/internal/measurement/n6.a:()Z
        //  1234: ifeq            1318
        //  1237: aload           6
        //  1239: astore          7
        //  1241: aload_0        
        //  1242: invokevirtual   R2/m3.f:()LR2/g;
        //  1245: aload_1        
        //  1246: getstatic       R2/K.T0:LR2/P1;
        //  1249: invokevirtual   R2/g.B:(Ljava/lang/String;LR2/P1;)Z
        //  1252: ifeq            1318
        //  1255: aload           6
        //  1257: astore          7
        //  1259: aload           6
        //  1261: bipush          34
        //  1263: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1268: ifeq            1277
        //  1271: aconst_null    
        //  1272: astore          8
        //  1274: goto            1307
        //  1277: iload_3        
        //  1278: istore_2       
        //  1279: aload           6
        //  1281: astore          7
        //  1283: aload           6
        //  1285: bipush          34
        //  1287: invokeinterface android/database/Cursor.getInt:(I)I
        //  1292: ifeq            1297
        //  1295: iconst_1       
        //  1296: istore_2       
        //  1297: aload           6
        //  1299: astore          7
        //  1301: iload_2        
        //  1302: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1305: astore          8
        //  1307: aload           6
        //  1309: astore          7
        //  1311: aload           9
        //  1313: aload           8
        //  1315: invokevirtual   R2/I2.d:(Ljava/lang/Boolean;)V
        //  1318: aload           6
        //  1320: astore          7
        //  1322: aload           9
        //  1324: invokevirtual   R2/I2.o:()V
        //  1327: aload           6
        //  1329: astore          7
        //  1331: aload           6
        //  1333: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1338: ifeq            1362
        //  1341: aload           6
        //  1343: astore          7
        //  1345: aload_0        
        //  1346: invokevirtual   R2/m3.j:()LR2/Y1;
        //  1349: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1352: ldc_w           "Got multiple records for app, expected one. appId"
        //  1355: aload_1        
        //  1356: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1359: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1362: aload           6
        //  1364: invokeinterface android/database/Cursor.close:()V
        //  1369: aload           9
        //  1371: areturn        
        //  1372: astore_1       
        //  1373: goto            1455
        //  1376: astore          8
        //  1378: goto            1394
        //  1381: astore_1       
        //  1382: aload           7
        //  1384: astore          6
        //  1386: goto            1431
        //  1389: astore          8
        //  1391: aconst_null    
        //  1392: astore          6
        //  1394: aload           6
        //  1396: astore          7
        //  1398: aload_0        
        //  1399: invokevirtual   R2/m3.j:()LR2/Y1;
        //  1402: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1405: ldc_w           "Error querying app. appId"
        //  1408: aload_1        
        //  1409: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1412: aload           8
        //  1414: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1417: aload           6
        //  1419: ifnull          1429
        //  1422: aload           6
        //  1424: invokeinterface android/database/Cursor.close:()V
        //  1429: aconst_null    
        //  1430: areturn        
        //  1431: aload           6
        //  1433: ifnull          1443
        //  1436: aload           6
        //  1438: invokeinterface android/database/Cursor.close:()V
        //  1443: aload_1        
        //  1444: athrow         
        //  1445: iconst_0       
        //  1446: istore_2       
        //  1447: goto            519
        //  1450: astore_1       
        //  1451: aload           7
        //  1453: astore          6
        //  1455: goto            1431
        //  1458: astore          8
        //  1460: goto            1394
        //  1463: iconst_1       
        //  1464: istore_2       
        //  1465: goto            519
        //  1468: iconst_0       
        //  1469: istore_2       
        //  1470: goto            795
        //  1473: iconst_1       
        //  1474: istore_2       
        //  1475: goto            795
        //  1478: iconst_0       
        //  1479: istore_2       
        //  1480: goto            1042
        //  1483: iconst_0       
        //  1484: istore_2       
        //  1485: goto            1217
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  16     22     1389   1394   Landroid/database/sqlite/SQLiteException;
        //  16     22     1381   1389   Any
        //  24     268    1389   1394   Landroid/database/sqlite/SQLiteException;
        //  24     268    1381   1389   Any
        //  268    276    1376   1381   Landroid/database/sqlite/SQLiteException;
        //  268    276    1372   1376   Any
        //  293    310    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  293    310    1450   1455   Any
        //  314    327    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  314    327    1450   1455   Any
        //  331    344    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  331    344    1450   1455   Any
        //  348    361    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  348    361    1450   1455   Any
        //  365    378    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  365    378    1450   1455   Any
        //  382    395    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  382    395    1450   1455   Any
        //  399    412    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  399    412    1450   1455   Any
        //  416    430    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  416    430    1450   1455   Any
        //  434    448    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  434    448    1450   1455   Any
        //  452    466    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  452    466    1450   1455   Any
        //  470    484    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  470    484    1450   1455   Any
        //  488    500    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  488    500    1450   1455   Any
        //  504    516    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  504    516    1450   1455   Any
        //  523    529    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  523    529    1450   1455   Any
        //  533    547    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  533    547    1450   1455   Any
        //  551    565    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  551    565    1450   1455   Any
        //  569    583    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  569    583    1450   1455   Any
        //  587    601    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  587    601    1450   1455   Any
        //  605    619    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  605    619    1450   1455   Any
        //  623    637    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  623    637    1450   1455   Any
        //  641    653    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  641    653    1450   1455   Any
        //  665    677    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  665    677    1450   1455   Any
        //  681    688    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  681    688    1450   1455   Any
        //  692    706    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  692    706    1450   1455   Any
        //  710    724    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  710    724    1450   1455   Any
        //  728    742    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  728    742    1450   1455   Any
        //  746    760    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  746    760    1450   1455   Any
        //  764    776    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  764    776    1450   1455   Any
        //  780    792    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  780    792    1450   1455   Any
        //  799    805    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  799    805    1450   1455   Any
        //  809    823    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  809    823    1450   1455   Any
        //  827    839    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  827    839    1450   1455   Any
        //  849    860    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  849    860    1450   1455   Any
        //  864    871    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  864    871    1450   1455   Any
        //  875    887    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  875    887    1450   1455   Any
        //  891    915    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  891    915    1450   1455   Any
        //  919    925    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  919    925    1450   1455   Any
        //  929    943    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  929    943    1450   1455   Any
        //  947    960    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  947    960    1450   1455   Any
        //  964    978    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  964    978    1450   1455   Any
        //  982    988    1458   1463   Landroid/database/sqlite/SQLiteException;
        //  982    988    1450   1455   Any
        //  992    1005   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  992    1005   1450   1455   Any
        //  1009   1021   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1009   1021   1450   1455   Any
        //  1025   1037   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1025   1037   1450   1455   Any
        //  1046   1052   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1046   1052   1450   1455   Any
        //  1056   1070   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1056   1070   1450   1455   Any
        //  1074   1088   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1074   1088   1450   1455   Any
        //  1092   1098   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1092   1098   1450   1455   Any
        //  1102   1116   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1102   1116   1450   1455   Any
        //  1120   1134   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1120   1134   1450   1455   Any
        //  1138   1152   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1138   1152   1450   1455   Any
        //  1156   1162   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1156   1162   1450   1455   Any
        //  1166   1180   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1166   1180   1450   1455   Any
        //  1184   1196   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1184   1196   1450   1455   Any
        //  1200   1212   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1200   1212   1450   1455   Any
        //  1221   1227   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1221   1227   1450   1455   Any
        //  1231   1237   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1231   1237   1450   1455   Any
        //  1241   1255   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1241   1255   1450   1455   Any
        //  1259   1271   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1259   1271   1450   1455   Any
        //  1283   1295   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1283   1295   1450   1455   Any
        //  1301   1307   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1301   1307   1450   1455   Any
        //  1311   1318   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1311   1318   1450   1455   Any
        //  1322   1327   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1322   1327   1450   1455   Any
        //  1331   1341   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1331   1341   1450   1455   Any
        //  1345   1362   1458   1463   Landroid/database/sqlite/SQLiteException;
        //  1345   1362   1450   1455   Any
        //  1398   1417   1450   1455   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0519:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final long E(final d2 d2) {
        this.n();
        this.u();
        A2.n.i(d2);
        A2.n.e(d2.D3());
        final byte[] h = d2.h();
        final long a = this.o().A(h);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d2.D3());
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put("metadata", h);
        try {
            this.B().insertWithOnConflict("raw_events_metadata", (String)null, contentValues, 4);
            return a;
        }
        catch (SQLiteException ex) {
            this.j().G().c("Error storing raw event metadata. appId", Y1.v(d2.D3()), ex);
            throw ex;
        }
    }
    
    public final r E0(String s) {
        A2.n.e(s);
        this.n();
        this.u();
        Object query = null;
        Throwable t2 = null;
        Label_0267: {
            Object blob = null;
            Throwable t = null;
            Label_0231: {
                try {
                    final Cursor cursor = (Cursor)(query = this.B().query("apps", new String[] { "remote_config", "config_last_modified_time", "e_tag" }, "app_id=?", new String[] { s }, (String)null, (String)null, (String)null));
                    String string;
                    String string2;
                    final String s2;
                    try {
                        try {
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return null;
                            }
                            query = cursor;
                            blob = cursor.getBlob(0);
                            query = cursor;
                            string = cursor.getString(1);
                            query = cursor;
                            string2 = cursor.getString(2);
                            query = cursor;
                            if (cursor.moveToNext()) {
                                query = cursor;
                                this.j().G().b("Got multiple records for app config, expected one. appId", Y1.v(s));
                            }
                        }
                        finally {
                            s = (String)query;
                            query = s2;
                        }
                    }
                    catch (SQLiteException blob) {
                        break Label_0231;
                    }
                    if (blob == null) {
                        ((Cursor)s2).close();
                        return null;
                    }
                    query = s2;
                    blob = new r((byte[])blob, string, string2);
                    ((Cursor)s2).close();
                    return (r)blob;
                }
                catch (SQLiteException blob) {
                    t = null;
                }
                finally {
                    s = (String)query;
                    t2 = t;
                    break Label_0267;
                }
            }
            this.j().G().c("Error querying remote config. appId", Y1.v(s), blob);
            if (t != null) {
                ((Cursor)t).close();
            }
            return null;
        }
        if (s != null) {
            ((Cursor)s).close();
        }
        throw t2;
    }
    
    public final long F(final String s) {
        A2.n.e(s);
        this.n();
        this.u();
        try {
            return this.B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { s, String.valueOf(Math.max(0, Math.min(1000000, this.f().u(s, K.r)))) });
        }
        catch (SQLiteException ex) {
            this.j().G().c("Error deleting over the limit events. appId", Y1.v(s), ex);
            return 0L;
        }
    }
    
    public final T5 F0(final String s, final String s2) {
        A2.n.e(s);
        A2.n.e(s2);
        this.n();
        this.u();
        Cursor query = null;
        Label_0276: {
            Cursor cursor = null;
            Object m = null;
            Label_0231: {
                try {
                    cursor = (query = this.B().query("user_attributes", new String[] { "set_timestamp", "value", "origin" }, "app_id=? and name=?", new String[] { s, s2 }, (String)null, (String)null, (String)null));
                    try {
                        try {
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return null;
                            }
                            query = cursor;
                            final long long1 = cursor.getLong(0);
                            query = cursor;
                            m = this.M(cursor, 1);
                            if (m == null) {
                                cursor.close();
                                return null;
                            }
                            query = cursor;
                            m = new T5(s, cursor.getString(2), s2, long1, m);
                            query = cursor;
                            if (cursor.moveToNext()) {
                                query = cursor;
                                this.j().G().b("Got multiple records for user property, expected one. appId", Y1.v(s));
                            }
                        }
                        finally {}
                    }
                    catch (SQLiteException m) {
                        break Label_0231;
                    }
                    cursor.close();
                    return (T5)m;
                }
                catch (SQLiteException m) {
                    cursor = null;
                }
                finally {
                    break Label_0276;
                }
            }
            this.j().G().d("Error querying user property. appId", Y1.v(s), this.h().g(s2), m);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        if (query != null) {
            query.close();
        }
    }
    
    public final long G(final String s, String[] array, long long1) {
        final SQLiteDatabase b = this.B();
        Object rawQuery = null;
        try {
            Label_0065: {
                try {
                    final Cursor cursor;
                    array = (String[])(Object)(cursor = (Cursor)(rawQuery = b.rawQuery(s, array)));
                    if (((Cursor)(Object)array).moveToFirst()) {
                        rawQuery = array;
                        long1 = ((Cursor)(Object)array).getLong(0);
                        ((Cursor)(Object)array).close();
                        return long1;
                    }
                    break Label_0065;
                }
                finally {
                    if (rawQuery != null) {
                        ((Cursor)rawQuery).close();
                    }
                    ((Cursor)(Object)array).close();
                    return long1;
                    final SQLiteException ex;
                    this.j().G().c("Database error", s, ex);
                    throw ex;
                }
            }
        }
        catch (SQLiteException ex2) {}
    }
    
    public final z G0(final String s) {
        if (n6.a() && this.f().s(K.T0)) {
            A2.n.i(s);
            this.n();
            this.u();
            return z.c(this.P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[] { s }, ""));
        }
        return z.f;
    }
    
    public final q H(final long l, final String s, final long n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        n.e(s);
        this.n();
        this.u();
        final q q = new q();
        Cursor cursor = null;
        Label_0440: {
            SQLiteDatabase b6 = null;
            try {
                b6 = this.B();
                final Cursor query = b6.query("apps", new String[] { "day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count" }, "app_id=?", new String[] { s }, (String)null, (String)null, (String)null);
                try {
                    if (!query.moveToFirst()) {
                        this.j().L().b("Not updating daily counts, app is not known. appId", Y1.v(s));
                        query.close();
                        return q;
                    }
                }
                catch (SQLiteException b6) {
                    break Label_0440;
                }
                finally {
                    break Label_0440;
                }
                if (query.getLong(0) == l) {
                    q.b = query.getLong(1);
                    q.a = query.getLong(2);
                    q.c = query.getLong(3);
                    q.d = query.getLong(4);
                    q.e = query.getLong(5);
                }
                if (b) {
                    q.b += n;
                }
                if (b2) {
                    q.a += n;
                }
                if (b3) {
                    q.c += n;
                }
                if (b4) {
                    q.d += n;
                }
                if (b5) {
                    q.e += n;
                }
                final ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(l));
                contentValues.put("daily_public_events_count", Long.valueOf(q.a));
                contentValues.put("daily_events_count", Long.valueOf(q.b));
                contentValues.put("daily_conversions_count", Long.valueOf(q.c));
                contentValues.put("daily_error_events_count", Long.valueOf(q.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(q.e));
                b6.update("apps", contentValues, "app_id=?", new String[] { s });
                query.close();
                return q;
            }
            catch (SQLiteException b6) {
                cursor = null;
            }
            finally {
                cursor = null;
                break Label_0440;
            }
            try {
                this.j().G().c("Error updating daily counts. appId", Y1.v(s), b6);
                if (cursor != null) {
                    cursor.close();
                }
                return q;
            }
            finally {}
        }
        if (cursor != null) {
            cursor.close();
        }
        throw s;
    }
    
    public final Map H0(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/C5.u:()V
        //     4: aload_0        
        //     5: invokevirtual   R2/m3.n:()V
        //     8: aload_1        
        //     9: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    12: pop            
        //    13: aload_2        
        //    14: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    17: pop            
        //    18: new             Lt/a;
        //    21: dup            
        //    22: invokespecial   t/a.<init>:()V
        //    25: astore          9
        //    27: aload_0        
        //    28: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    31: astore          7
        //    33: aconst_null    
        //    34: astore          6
        //    36: aconst_null    
        //    37: astore          5
        //    39: aload           7
        //    41: ldc_w           "event_filters"
        //    44: iconst_2       
        //    45: anewarray       Ljava/lang/String;
        //    48: dup            
        //    49: iconst_0       
        //    50: ldc_w           "audience_id"
        //    53: aastore        
        //    54: dup            
        //    55: iconst_1       
        //    56: ldc_w           "data"
        //    59: aastore        
        //    60: ldc_w           "app_id=? AND event_name=?"
        //    63: iconst_2       
        //    64: anewarray       Ljava/lang/String;
        //    67: dup            
        //    68: iconst_0       
        //    69: aload_1        
        //    70: aastore        
        //    71: dup            
        //    72: iconst_1       
        //    73: aload_2        
        //    74: aastore        
        //    75: aconst_null    
        //    76: aconst_null    
        //    77: aconst_null    
        //    78: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    81: astore_2       
        //    82: aload_2        
        //    83: astore          5
        //    85: aload_2        
        //    86: astore          6
        //    88: aload_2        
        //    89: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    94: ifne            125
        //    97: aload_2        
        //    98: astore          5
        //   100: aload_2        
        //   101: astore          6
        //   103: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   106: astore          7
        //   108: aload_2        
        //   109: invokeinterface android/database/Cursor.close:()V
        //   114: aload           7
        //   116: areturn        
        //   117: astore_1       
        //   118: goto            366
        //   121: astore_2       
        //   122: goto            322
        //   125: aload_2        
        //   126: astore          5
        //   128: aload_2        
        //   129: astore          6
        //   131: aload_2        
        //   132: iconst_1       
        //   133: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   138: astore          7
        //   140: aload_2        
        //   141: astore          5
        //   143: aload_2        
        //   144: astore          6
        //   146: invokestatic    com/google/android/gms/internal/measurement/x1.M:()Lcom/google/android/gms/internal/measurement/x1$a;
        //   149: aload           7
        //   151: invokestatic    R2/N5.H:(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
        //   154: checkcast       Lcom/google/android/gms/internal/measurement/x1$a;
        //   157: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   160: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   163: checkcast       Lcom/google/android/gms/internal/measurement/x1;
        //   166: astore          10
        //   168: aload_2        
        //   169: astore          5
        //   171: aload_2        
        //   172: astore          6
        //   174: aload_2        
        //   175: iconst_0       
        //   176: invokeinterface android/database/Cursor.getInt:(I)I
        //   181: istore_3       
        //   182: aload_2        
        //   183: astore          5
        //   185: aload_2        
        //   186: astore          6
        //   188: aload           9
        //   190: iload_3        
        //   191: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   194: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   199: checkcast       Ljava/util/List;
        //   202: astore          8
        //   204: aload           8
        //   206: astore          7
        //   208: aload           8
        //   210: ifnonnull       248
        //   213: aload_2        
        //   214: astore          5
        //   216: aload_2        
        //   217: astore          6
        //   219: new             Ljava/util/ArrayList;
        //   222: dup            
        //   223: invokespecial   java/util/ArrayList.<init>:()V
        //   226: astore          7
        //   228: aload_2        
        //   229: astore          5
        //   231: aload_2        
        //   232: astore          6
        //   234: aload           9
        //   236: iload_3        
        //   237: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   240: aload           7
        //   242: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   247: pop            
        //   248: aload_2        
        //   249: astore          5
        //   251: aload_2        
        //   252: astore          6
        //   254: aload           7
        //   256: aload           10
        //   258: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   263: pop            
        //   264: goto            294
        //   267: astore          7
        //   269: aload_2        
        //   270: astore          5
        //   272: aload_2        
        //   273: astore          6
        //   275: aload_0        
        //   276: invokevirtual   R2/m3.j:()LR2/Y1;
        //   279: invokevirtual   R2/Y1.G:()LR2/a2;
        //   282: ldc_w           "Failed to merge filter. appId"
        //   285: aload_1        
        //   286: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   289: aload           7
        //   291: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   294: aload_2        
        //   295: astore          5
        //   297: aload_2        
        //   298: astore          6
        //   300: aload_2        
        //   301: invokeinterface android/database/Cursor.moveToNext:()Z
        //   306: istore          4
        //   308: iload           4
        //   310: ifne            125
        //   313: aload_2        
        //   314: invokeinterface android/database/Cursor.close:()V
        //   319: aload           9
        //   321: areturn        
        //   322: aload           6
        //   324: astore          5
        //   326: aload_0        
        //   327: invokevirtual   R2/m3.j:()LR2/Y1;
        //   330: invokevirtual   R2/Y1.G:()LR2/a2;
        //   333: ldc_w           "Database error querying filters. appId"
        //   336: aload_1        
        //   337: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   340: aload_2        
        //   341: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   344: aload           6
        //   346: astore          5
        //   348: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   351: astore_1       
        //   352: aload           6
        //   354: ifnull          364
        //   357: aload           6
        //   359: invokeinterface android/database/Cursor.close:()V
        //   364: aload_1        
        //   365: areturn        
        //   366: aload           5
        //   368: ifnull          378
        //   371: aload           5
        //   373: invokeinterface android/database/Cursor.close:()V
        //   378: aload_1        
        //   379: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  39     82     121    366    Landroid/database/sqlite/SQLiteException;
        //  39     82     117    380    Any
        //  88     97     121    366    Landroid/database/sqlite/SQLiteException;
        //  88     97     117    380    Any
        //  103    108    121    366    Landroid/database/sqlite/SQLiteException;
        //  103    108    117    380    Any
        //  131    140    121    366    Landroid/database/sqlite/SQLiteException;
        //  131    140    117    380    Any
        //  146    168    267    294    Ljava/io/IOException;
        //  146    168    121    366    Landroid/database/sqlite/SQLiteException;
        //  146    168    117    380    Any
        //  174    182    121    366    Landroid/database/sqlite/SQLiteException;
        //  174    182    117    380    Any
        //  188    204    121    366    Landroid/database/sqlite/SQLiteException;
        //  188    204    117    380    Any
        //  219    228    121    366    Landroid/database/sqlite/SQLiteException;
        //  219    228    117    380    Any
        //  234    248    121    366    Landroid/database/sqlite/SQLiteException;
        //  234    248    117    380    Any
        //  254    264    121    366    Landroid/database/sqlite/SQLiteException;
        //  254    264    117    380    Any
        //  275    294    121    366    Landroid/database/sqlite/SQLiteException;
        //  275    294    117    380    Any
        //  300    308    121    366    Landroid/database/sqlite/SQLiteException;
        //  300    308    117    380    Any
        //  326    344    117    380    Any
        //  348    352    117    380    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 191 out of bounds for length 191
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final q I(final long n, final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        return this.H(n, s, 1L, false, false, b3, false, b5);
    }
    
    public final q3 I0(final String s) {
        A2.n.i(s);
        this.n();
        this.u();
        if (n6.a() && this.f().s(K.T0)) {
            q3 c;
            if ((c = (q3)this.N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[] { s }, R2.o.a)) == null) {
                c = q3.c;
            }
            return c;
        }
        return q3.e(this.P("select consent_state from consent_settings where app_id=? limit 1;", new String[] { s }, "G1"));
    }
    
    public final Map J0(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/C5.u:()V
        //     4: aload_0        
        //     5: invokevirtual   R2/m3.n:()V
        //     8: aload_1        
        //     9: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    12: pop            
        //    13: aload_2        
        //    14: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    17: pop            
        //    18: new             Lt/a;
        //    21: dup            
        //    22: invokespecial   t/a.<init>:()V
        //    25: astore          9
        //    27: aload_0        
        //    28: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    31: astore          7
        //    33: aconst_null    
        //    34: astore          6
        //    36: aconst_null    
        //    37: astore          5
        //    39: aload           7
        //    41: ldc_w           "property_filters"
        //    44: iconst_2       
        //    45: anewarray       Ljava/lang/String;
        //    48: dup            
        //    49: iconst_0       
        //    50: ldc_w           "audience_id"
        //    53: aastore        
        //    54: dup            
        //    55: iconst_1       
        //    56: ldc_w           "data"
        //    59: aastore        
        //    60: ldc_w           "app_id=? AND property_name=?"
        //    63: iconst_2       
        //    64: anewarray       Ljava/lang/String;
        //    67: dup            
        //    68: iconst_0       
        //    69: aload_1        
        //    70: aastore        
        //    71: dup            
        //    72: iconst_1       
        //    73: aload_2        
        //    74: aastore        
        //    75: aconst_null    
        //    76: aconst_null    
        //    77: aconst_null    
        //    78: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    81: astore_2       
        //    82: aload_2        
        //    83: astore          5
        //    85: aload_2        
        //    86: astore          6
        //    88: aload_2        
        //    89: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    94: ifne            125
        //    97: aload_2        
        //    98: astore          5
        //   100: aload_2        
        //   101: astore          6
        //   103: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   106: astore          7
        //   108: aload_2        
        //   109: invokeinterface android/database/Cursor.close:()V
        //   114: aload           7
        //   116: areturn        
        //   117: astore_1       
        //   118: goto            366
        //   121: astore_2       
        //   122: goto            322
        //   125: aload_2        
        //   126: astore          5
        //   128: aload_2        
        //   129: astore          6
        //   131: aload_2        
        //   132: iconst_1       
        //   133: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   138: astore          7
        //   140: aload_2        
        //   141: astore          5
        //   143: aload_2        
        //   144: astore          6
        //   146: invokestatic    com/google/android/gms/internal/measurement/A1.J:()Lcom/google/android/gms/internal/measurement/A1$a;
        //   149: aload           7
        //   151: invokestatic    R2/N5.H:(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
        //   154: checkcast       Lcom/google/android/gms/internal/measurement/A1$a;
        //   157: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   160: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   163: checkcast       Lcom/google/android/gms/internal/measurement/A1;
        //   166: astore          10
        //   168: aload_2        
        //   169: astore          5
        //   171: aload_2        
        //   172: astore          6
        //   174: aload_2        
        //   175: iconst_0       
        //   176: invokeinterface android/database/Cursor.getInt:(I)I
        //   181: istore_3       
        //   182: aload_2        
        //   183: astore          5
        //   185: aload_2        
        //   186: astore          6
        //   188: aload           9
        //   190: iload_3        
        //   191: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   194: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   199: checkcast       Ljava/util/List;
        //   202: astore          8
        //   204: aload           8
        //   206: astore          7
        //   208: aload           8
        //   210: ifnonnull       248
        //   213: aload_2        
        //   214: astore          5
        //   216: aload_2        
        //   217: astore          6
        //   219: new             Ljava/util/ArrayList;
        //   222: dup            
        //   223: invokespecial   java/util/ArrayList.<init>:()V
        //   226: astore          7
        //   228: aload_2        
        //   229: astore          5
        //   231: aload_2        
        //   232: astore          6
        //   234: aload           9
        //   236: iload_3        
        //   237: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   240: aload           7
        //   242: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   247: pop            
        //   248: aload_2        
        //   249: astore          5
        //   251: aload_2        
        //   252: astore          6
        //   254: aload           7
        //   256: aload           10
        //   258: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   263: pop            
        //   264: goto            294
        //   267: astore          7
        //   269: aload_2        
        //   270: astore          5
        //   272: aload_2        
        //   273: astore          6
        //   275: aload_0        
        //   276: invokevirtual   R2/m3.j:()LR2/Y1;
        //   279: invokevirtual   R2/Y1.G:()LR2/a2;
        //   282: ldc_w           "Failed to merge filter"
        //   285: aload_1        
        //   286: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   289: aload           7
        //   291: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   294: aload_2        
        //   295: astore          5
        //   297: aload_2        
        //   298: astore          6
        //   300: aload_2        
        //   301: invokeinterface android/database/Cursor.moveToNext:()Z
        //   306: istore          4
        //   308: iload           4
        //   310: ifne            125
        //   313: aload_2        
        //   314: invokeinterface android/database/Cursor.close:()V
        //   319: aload           9
        //   321: areturn        
        //   322: aload           6
        //   324: astore          5
        //   326: aload_0        
        //   327: invokevirtual   R2/m3.j:()LR2/Y1;
        //   330: invokevirtual   R2/Y1.G:()LR2/a2;
        //   333: ldc_w           "Database error querying filters. appId"
        //   336: aload_1        
        //   337: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   340: aload_2        
        //   341: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   344: aload           6
        //   346: astore          5
        //   348: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   351: astore_1       
        //   352: aload           6
        //   354: ifnull          364
        //   357: aload           6
        //   359: invokeinterface android/database/Cursor.close:()V
        //   364: aload_1        
        //   365: areturn        
        //   366: aload           5
        //   368: ifnull          378
        //   371: aload           5
        //   373: invokeinterface android/database/Cursor.close:()V
        //   378: aload_1        
        //   379: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  39     82     121    366    Landroid/database/sqlite/SQLiteException;
        //  39     82     117    380    Any
        //  88     97     121    366    Landroid/database/sqlite/SQLiteException;
        //  88     97     117    380    Any
        //  103    108    121    366    Landroid/database/sqlite/SQLiteException;
        //  103    108    117    380    Any
        //  131    140    121    366    Landroid/database/sqlite/SQLiteException;
        //  131    140    117    380    Any
        //  146    168    267    294    Ljava/io/IOException;
        //  146    168    121    366    Landroid/database/sqlite/SQLiteException;
        //  146    168    117    380    Any
        //  174    182    121    366    Landroid/database/sqlite/SQLiteException;
        //  174    182    117    380    Any
        //  188    204    121    366    Landroid/database/sqlite/SQLiteException;
        //  188    204    117    380    Any
        //  219    228    121    366    Landroid/database/sqlite/SQLiteException;
        //  219    228    117    380    Any
        //  234    248    121    366    Landroid/database/sqlite/SQLiteException;
        //  234    248    117    380    Any
        //  254    264    121    366    Landroid/database/sqlite/SQLiteException;
        //  254    264    117    380    Any
        //  275    294    121    366    Landroid/database/sqlite/SQLiteException;
        //  275    294    117    380    Any
        //  300    308    121    366    Landroid/database/sqlite/SQLiteException;
        //  300    308    117    380    Any
        //  326    344    117    380    Any
        //  348    352    117    380    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 191 out of bounds for length 191
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final List K0(final String s) {
        A2.n.e(s);
        this.n();
        this.u();
        final ArrayList<v5> list = new ArrayList<v5>();
        Cursor cursor = null;
        Cursor query = null;
        while (true) {
            try {
                try {
                    final Cursor cursor2 = cursor = (query = this.B().query("trigger_uris", new String[] { "trigger_uri", "timestamp_millis", "source" }, "app_id=?", new String[] { s }, (String)null, (String)null, "rowid", (String)null));
                    if (!cursor2.moveToFirst()) {
                        cursor2.close();
                        return list;
                    }
                    do {
                        query = cursor2;
                        cursor = cursor2;
                        String string;
                        if ((string = cursor2.getString(0)) == null) {
                            string = "";
                        }
                        query = cursor2;
                        cursor = cursor2;
                        list.add(new v5(string, cursor2.getLong(1), cursor2.getInt(2)));
                        query = cursor2;
                        cursor = cursor2;
                    } while (cursor2.moveToNext());
                    cursor2.close();
                    return list;
                    query = cursor;
                    final SQLiteException ex;
                    this.j().G().c("Error querying trigger uris. appId", Y1.v(s), ex);
                    query = cursor;
                    final List<Object> emptyList = Collections.emptyList();
                    // iftrue(Label_0251:, cursor == null)
                    // iftrue(Label_0263:, query == null)
                    Block_7: {
                        break Block_7;
                        Block_8: {
                            break Block_8;
                            Label_0251: {
                                return emptyList;
                            }
                        }
                        query.close();
                        Label_0263: {
                            throw s;
                        }
                    }
                    cursor.close();
                }
                finally {}
            }
            catch (SQLiteException ex2) {}
            final SQLiteException ex2;
            final SQLiteException ex = ex2;
            continue;
        }
    }
    
    public final Pair L(String create, final Long obj) {
        this.n();
        this.u();
        Object rawQuery = null;
        Object o = null;
        Label_0242: {
            try {
                final Cursor cursor = (Cursor)(rawQuery = this.B().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[] { create, String.valueOf(obj) }));
                try {
                    try {
                        if (!cursor.moveToFirst()) {
                            rawQuery = cursor;
                            this.j().K().a("Main event not found");
                            cursor.close();
                            return null;
                        }
                    }
                    finally {
                        create = (String)rawQuery;
                    }
                }
                catch (SQLiteException ex3) {}
                rawQuery = cursor;
                final byte[] blob = cursor.getBlob(0);
                rawQuery = cursor;
                final long long1 = cursor.getLong(1);
                rawQuery = cursor;
                try {
                    final com.google.android.gms.internal.measurement.Y1 y1 = (com.google.android.gms.internal.measurement.Y1)((Y3.b)N5.H(com.google.android.gms.internal.measurement.Y1.Z(), blob)).p();
                    rawQuery = cursor;
                    create = (String)Pair.create((Object)y1, (Object)long1);
                    cursor.close();
                    return (Pair)create;
                }
                catch (IOException ex) {
                    rawQuery = cursor;
                    this.j().G().d("Failed to merge main event. appId, eventId", Y1.v(create), obj, ex);
                    cursor.close();
                    return null;
                }
            }
            catch (SQLiteException ex2) {
                o = null;
            }
            finally {
                o = rawQuery;
                break Label_0242;
            }
            final SQLiteException ex2;
            this.j().G().b("Error selecting main event", ex2);
            if (o != null) {
                ((Cursor)o).close();
            }
            return null;
        }
        if (o != null) {
            ((Cursor)o).close();
        }
    }
    
    public final void L0(final String s, final String s2) {
        A2.n.e(s);
        A2.n.e(s2);
        this.n();
        this.u();
        try {
            this.B().delete("user_attributes", "app_id=? and name=?", new String[] { s, s2 });
        }
        catch (SQLiteException ex) {
            this.j().G().d("Error deleting user property. appId", Y1.v(s), this.h().g(s2), ex);
        }
    }
    
    public final Object M(final Cursor cursor, final int n) {
        final int type = cursor.getType(n);
        if (type == 0) {
            this.j().G().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return cursor.getLong(n);
        }
        if (type == 2) {
            return cursor.getDouble(n);
        }
        if (type == 3) {
            return cursor.getString(n);
        }
        if (type != 4) {
            this.j().G().b("Loaded invalid unknown value type, ignoring it", type);
            return null;
        }
        this.j().G().a("Loaded invalid blob type value, ignoring it");
        return null;
    }
    
    public final List M0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_0        
        //     6: invokevirtual   R2/m3.n:()V
        //     9: aload_0        
        //    10: invokevirtual   R2/C5.u:()V
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: astore          10
        //    22: aconst_null    
        //    23: astore          7
        //    25: aconst_null    
        //    26: astore          6
        //    28: aload_0        
        //    29: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    32: ldc_w           "user_attributes"
        //    35: iconst_4       
        //    36: anewarray       Ljava/lang/String;
        //    39: dup            
        //    40: iconst_0       
        //    41: ldc_w           "name"
        //    44: aastore        
        //    45: dup            
        //    46: iconst_1       
        //    47: ldc             "origin"
        //    49: aastore        
        //    50: dup            
        //    51: iconst_2       
        //    52: ldc_w           "set_timestamp"
        //    55: aastore        
        //    56: dup            
        //    57: iconst_3       
        //    58: ldc_w           "value"
        //    61: aastore        
        //    62: ldc_w           "app_id=?"
        //    65: iconst_1       
        //    66: anewarray       Ljava/lang/String;
        //    69: dup            
        //    70: iconst_0       
        //    71: aload_1        
        //    72: aastore        
        //    73: aconst_null    
        //    74: aconst_null    
        //    75: ldc_w           "rowid"
        //    78: ldc_w           "1000"
        //    81: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    84: astore          5
        //    86: aload           5
        //    88: astore          6
        //    90: aload           5
        //    92: astore          7
        //    94: aload           5
        //    96: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   101: istore_2       
        //   102: iload_2        
        //   103: ifne            116
        //   106: aload           5
        //   108: invokeinterface android/database/Cursor.close:()V
        //   113: aload           10
        //   115: areturn        
        //   116: aload           5
        //   118: astore          6
        //   120: aload           5
        //   122: astore          7
        //   124: aload           5
        //   126: iconst_0       
        //   127: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   132: astore          11
        //   134: aload           5
        //   136: astore          6
        //   138: aload           5
        //   140: astore          7
        //   142: aload           5
        //   144: iconst_1       
        //   145: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   150: astore          9
        //   152: aload           9
        //   154: astore          8
        //   156: aload           9
        //   158: ifnonnull       340
        //   161: ldc_w           ""
        //   164: astore          8
        //   166: goto            340
        //   169: aload           5
        //   171: astore          6
        //   173: aload           5
        //   175: astore          7
        //   177: aload           5
        //   179: iconst_2       
        //   180: invokeinterface android/database/Cursor.getLong:(I)J
        //   185: lstore_3       
        //   186: aload           5
        //   188: astore          6
        //   190: aload_0        
        //   191: aload           5
        //   193: iconst_3       
        //   194: invokevirtual   R2/p.M:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   197: astore          7
        //   199: aload           7
        //   201: ifnonnull       228
        //   204: aload           5
        //   206: astore          6
        //   208: aload_0        
        //   209: invokevirtual   R2/m3.j:()LR2/Y1;
        //   212: invokevirtual   R2/Y1.G:()LR2/a2;
        //   215: ldc_w           "Read invalid user property value, ignoring it. appId"
        //   218: aload_1        
        //   219: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   222: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   225: goto            255
        //   228: aload           5
        //   230: astore          6
        //   232: aload           10
        //   234: new             LR2/T5;
        //   237: dup            
        //   238: aload_1        
        //   239: aload           8
        //   241: aload           11
        //   243: lload_3        
        //   244: aload           7
        //   246: invokespecial   R2/T5.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
        //   249: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   254: pop            
        //   255: aload           5
        //   257: astore          6
        //   259: aload           5
        //   261: invokeinterface android/database/Cursor.moveToNext:()Z
        //   266: istore_2       
        //   267: iload_2        
        //   268: ifne            116
        //   271: aload           5
        //   273: invokeinterface android/database/Cursor.close:()V
        //   278: aload           10
        //   280: areturn        
        //   281: aload           5
        //   283: astore          6
        //   285: aload_0        
        //   286: invokevirtual   R2/m3.j:()LR2/Y1;
        //   289: invokevirtual   R2/Y1.G:()LR2/a2;
        //   292: ldc_w           "Error querying user properties. appId"
        //   295: aload_1        
        //   296: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   299: aload           8
        //   301: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   304: aload           5
        //   306: astore          6
        //   308: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   311: astore_1       
        //   312: aload           5
        //   314: ifnull          324
        //   317: aload           5
        //   319: invokeinterface android/database/Cursor.close:()V
        //   324: aload_1        
        //   325: areturn        
        //   326: aload           6
        //   328: ifnull          338
        //   331: aload           6
        //   333: invokeinterface android/database/Cursor.close:()V
        //   338: aload_1        
        //   339: athrow         
        //   340: goto            169
        //   343: astore_1       
        //   344: goto            326
        //   347: astore          8
        //   349: aload           7
        //   351: astore          5
        //   353: goto            281
        //   356: astore_1       
        //   357: goto            326
        //   360: astore          8
        //   362: goto            281
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  28     86     347    356    Landroid/database/sqlite/SQLiteException;
        //  28     86     343    347    Any
        //  94     102    347    356    Landroid/database/sqlite/SQLiteException;
        //  94     102    343    347    Any
        //  124    134    347    356    Landroid/database/sqlite/SQLiteException;
        //  124    134    343    347    Any
        //  142    152    347    356    Landroid/database/sqlite/SQLiteException;
        //  142    152    343    347    Any
        //  177    186    347    356    Landroid/database/sqlite/SQLiteException;
        //  177    186    343    347    Any
        //  190    199    360    365    Landroid/database/sqlite/SQLiteException;
        //  190    199    356    360    Any
        //  208    225    360    365    Landroid/database/sqlite/SQLiteException;
        //  208    225    356    360    Any
        //  232    255    360    365    Landroid/database/sqlite/SQLiteException;
        //  232    255    356    360    Any
        //  259    267    360    365    Landroid/database/sqlite/SQLiteException;
        //  259    267    356    360    Any
        //  285    304    356    360    Any
        //  308    312    356    360    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0228:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final Object N(final String s, final String[] array, s a) {
        final Cursor cursor = null;
        Cursor cursor4 = null;
        Label_0111: {
            Cursor cursor3 = null;
            Label_0083: {
                try {
                    final Cursor rawQuery = this.B().rawQuery(s, array);
                    try {
                        try {
                            if (!rawQuery.moveToFirst()) {
                                this.j().K().a("No data found");
                                rawQuery.close();
                                return null;
                            }
                        }
                        finally {}
                    }
                    catch (SQLiteException a) {
                        break Label_0083;
                    }
                    final Cursor cursor2;
                    a = (SQLiteException)((s)a).a(cursor2);
                    cursor2.close();
                    return a;
                }
                catch (SQLiteException a) {
                    cursor3 = null;
                }
                finally {
                    cursor4 = cursor;
                    break Label_0111;
                }
            }
            this.j().G().b("Error querying database.", a);
            if (cursor3 != null) {
                cursor3.close();
            }
            return null;
        }
        if (cursor4 != null) {
            cursor4.close();
        }
    }
    
    public final Map N0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/C5.u:()V
        //     4: aload_0        
        //     5: invokevirtual   R2/m3.n:()V
        //     8: aload_1        
        //     9: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    12: pop            
        //    13: aload_0        
        //    14: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    17: astore          6
        //    19: aconst_null    
        //    20: astore          5
        //    22: aconst_null    
        //    23: astore          4
        //    25: aload           6
        //    27: ldc_w           "audience_filter_values"
        //    30: iconst_2       
        //    31: anewarray       Ljava/lang/String;
        //    34: dup            
        //    35: iconst_0       
        //    36: ldc_w           "audience_id"
        //    39: aastore        
        //    40: dup            
        //    41: iconst_1       
        //    42: ldc_w           "current_results"
        //    45: aastore        
        //    46: ldc_w           "app_id=?"
        //    49: iconst_1       
        //    50: anewarray       Ljava/lang/String;
        //    53: dup            
        //    54: iconst_0       
        //    55: aload_1        
        //    56: aastore        
        //    57: aconst_null    
        //    58: aconst_null    
        //    59: aconst_null    
        //    60: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    63: astore          6
        //    65: aload           6
        //    67: astore          4
        //    69: aload           6
        //    71: astore          5
        //    73: aload           6
        //    75: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    80: ifne            115
        //    83: aload           6
        //    85: astore          4
        //    87: aload           6
        //    89: astore          5
        //    91: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //    94: astore          7
        //    96: aload           6
        //    98: invokeinterface android/database/Cursor.close:()V
        //   103: aload           7
        //   105: areturn        
        //   106: astore_1       
        //   107: goto            330
        //   110: astore          6
        //   112: goto            285
        //   115: aload           6
        //   117: astore          4
        //   119: aload           6
        //   121: astore          5
        //   123: new             Lt/a;
        //   126: dup            
        //   127: invokespecial   t/a.<init>:()V
        //   130: astore          7
        //   132: aload           6
        //   134: astore          4
        //   136: aload           6
        //   138: astore          5
        //   140: aload           6
        //   142: iconst_0       
        //   143: invokeinterface android/database/Cursor.getInt:(I)I
        //   148: istore_2       
        //   149: aload           6
        //   151: astore          4
        //   153: aload           6
        //   155: astore          5
        //   157: aload           6
        //   159: iconst_1       
        //   160: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   165: astore          8
        //   167: aload           6
        //   169: astore          4
        //   171: aload           6
        //   173: astore          5
        //   175: invokestatic    com/google/android/gms/internal/measurement/f2.V:()Lcom/google/android/gms/internal/measurement/f2$a;
        //   178: aload           8
        //   180: invokestatic    R2/N5.H:(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
        //   183: checkcast       Lcom/google/android/gms/internal/measurement/f2$a;
        //   186: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   189: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   192: checkcast       Lcom/google/android/gms/internal/measurement/f2;
        //   195: astore          8
        //   197: aload           6
        //   199: astore          4
        //   201: aload           6
        //   203: astore          5
        //   205: aload           7
        //   207: iload_2        
        //   208: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   211: aload           8
        //   213: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   218: pop            
        //   219: goto            255
        //   222: astore          8
        //   224: aload           6
        //   226: astore          4
        //   228: aload           6
        //   230: astore          5
        //   232: aload_0        
        //   233: invokevirtual   R2/m3.j:()LR2/Y1;
        //   236: invokevirtual   R2/Y1.G:()LR2/a2;
        //   239: ldc_w           "Failed to merge filter results. appId, audienceId, error"
        //   242: aload_1        
        //   243: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   246: iload_2        
        //   247: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   250: aload           8
        //   252: invokevirtual   R2/a2.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   255: aload           6
        //   257: astore          4
        //   259: aload           6
        //   261: astore          5
        //   263: aload           6
        //   265: invokeinterface android/database/Cursor.moveToNext:()Z
        //   270: istore_3       
        //   271: iload_3        
        //   272: ifne            132
        //   275: aload           6
        //   277: invokeinterface android/database/Cursor.close:()V
        //   282: aload           7
        //   284: areturn        
        //   285: aload           5
        //   287: astore          4
        //   289: aload_0        
        //   290: invokevirtual   R2/m3.j:()LR2/Y1;
        //   293: invokevirtual   R2/Y1.G:()LR2/a2;
        //   296: ldc_w           "Database error querying filter results. appId"
        //   299: aload_1        
        //   300: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   303: aload           6
        //   305: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   308: aload           5
        //   310: astore          4
        //   312: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   315: astore_1       
        //   316: aload           5
        //   318: ifnull          328
        //   321: aload           5
        //   323: invokeinterface android/database/Cursor.close:()V
        //   328: aload_1        
        //   329: areturn        
        //   330: aload           4
        //   332: ifnull          342
        //   335: aload           4
        //   337: invokeinterface android/database/Cursor.close:()V
        //   342: aload_1        
        //   343: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  25     65     110    330    Landroid/database/sqlite/SQLiteException;
        //  25     65     106    344    Any
        //  73     83     110    330    Landroid/database/sqlite/SQLiteException;
        //  73     83     106    344    Any
        //  91     96     110    330    Landroid/database/sqlite/SQLiteException;
        //  91     96     106    344    Any
        //  123    132    110    330    Landroid/database/sqlite/SQLiteException;
        //  123    132    106    344    Any
        //  140    149    110    330    Landroid/database/sqlite/SQLiteException;
        //  140    149    106    344    Any
        //  157    167    110    330    Landroid/database/sqlite/SQLiteException;
        //  157    167    106    344    Any
        //  175    197    222    255    Ljava/io/IOException;
        //  175    197    110    330    Landroid/database/sqlite/SQLiteException;
        //  175    197    106    344    Any
        //  205    219    110    330    Landroid/database/sqlite/SQLiteException;
        //  205    219    106    344    Any
        //  232    255    110    330    Landroid/database/sqlite/SQLiteException;
        //  232    255    106    344    Any
        //  263    271    110    330    Landroid/database/sqlite/SQLiteException;
        //  263    271    106    344    Any
        //  289    308    106    344    Any
        //  312    316    106    344    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 160 out of bounds for length 160
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final String O(final long l) {
        this.n();
        this.u();
        Cursor rawQuery = null;
        Label_0146: {
            String string = null;
            Cursor cursor3 = null;
            Label_0114: {
                try {
                    final Cursor cursor = rawQuery = this.B().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[] { String.valueOf(l) });
                    try {
                        try {
                            if (!cursor.moveToFirst()) {
                                rawQuery = cursor;
                                this.j().K().a("No expired configs for apps with pending events");
                                cursor.close();
                                return null;
                            }
                        }
                        finally {}
                    }
                    catch (SQLiteException string) {
                        break Label_0114;
                    }
                    final Cursor cursor2;
                    rawQuery = cursor2;
                    string = cursor2.getString(0);
                    cursor2.close();
                    return string;
                }
                catch (SQLiteException string) {
                    cursor3 = null;
                }
                finally {
                    break Label_0146;
                }
            }
            this.j().G().b("Error selecting expired configs", string);
            if (cursor3 != null) {
                cursor3.close();
            }
            return null;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
    }
    
    public final Map O0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: new             Lt/a;
        //     8: dup            
        //     9: invokespecial   t/a.<init>:()V
        //    12: astore          9
        //    14: aload_0        
        //    15: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    18: astore          6
        //    20: aconst_null    
        //    21: astore          5
        //    23: aconst_null    
        //    24: astore          4
        //    26: aload           6
        //    28: ldc_w           "event_filters"
        //    31: iconst_2       
        //    32: anewarray       Ljava/lang/String;
        //    35: dup            
        //    36: iconst_0       
        //    37: ldc_w           "audience_id"
        //    40: aastore        
        //    41: dup            
        //    42: iconst_1       
        //    43: ldc_w           "data"
        //    46: aastore        
        //    47: ldc_w           "app_id=?"
        //    50: iconst_1       
        //    51: anewarray       Ljava/lang/String;
        //    54: dup            
        //    55: iconst_0       
        //    56: aload_1        
        //    57: aastore        
        //    58: aconst_null    
        //    59: aconst_null    
        //    60: aconst_null    
        //    61: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    64: astore          6
        //    66: aload           6
        //    68: astore          4
        //    70: aload           6
        //    72: astore          5
        //    74: aload           6
        //    76: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    81: ifne            116
        //    84: aload           6
        //    86: astore          4
        //    88: aload           6
        //    90: astore          5
        //    92: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //    95: astore          7
        //    97: aload           6
        //    99: invokeinterface android/database/Cursor.close:()V
        //   104: aload           7
        //   106: areturn        
        //   107: astore_1       
        //   108: goto            394
        //   111: astore          6
        //   113: goto            349
        //   116: aload           6
        //   118: astore          4
        //   120: aload           6
        //   122: astore          5
        //   124: aload           6
        //   126: iconst_1       
        //   127: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   132: astore          7
        //   134: aload           6
        //   136: astore          4
        //   138: aload           6
        //   140: astore          5
        //   142: invokestatic    com/google/android/gms/internal/measurement/x1.M:()Lcom/google/android/gms/internal/measurement/x1$a;
        //   145: aload           7
        //   147: invokestatic    R2/N5.H:(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
        //   150: checkcast       Lcom/google/android/gms/internal/measurement/x1$a;
        //   153: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   156: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   159: checkcast       Lcom/google/android/gms/internal/measurement/x1;
        //   162: astore          10
        //   164: aload           6
        //   166: astore          4
        //   168: aload           6
        //   170: astore          5
        //   172: aload           10
        //   174: invokevirtual   com/google/android/gms/internal/measurement/x1.U:()Z
        //   177: ifeq            319
        //   180: aload           6
        //   182: astore          4
        //   184: aload           6
        //   186: astore          5
        //   188: aload           6
        //   190: iconst_0       
        //   191: invokeinterface android/database/Cursor.getInt:(I)I
        //   196: istore_2       
        //   197: aload           6
        //   199: astore          4
        //   201: aload           6
        //   203: astore          5
        //   205: aload           9
        //   207: iload_2        
        //   208: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   211: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   216: checkcast       Ljava/util/List;
        //   219: astore          8
        //   221: aload           8
        //   223: astore          7
        //   225: aload           8
        //   227: ifnonnull       269
        //   230: aload           6
        //   232: astore          4
        //   234: aload           6
        //   236: astore          5
        //   238: new             Ljava/util/ArrayList;
        //   241: dup            
        //   242: invokespecial   java/util/ArrayList.<init>:()V
        //   245: astore          7
        //   247: aload           6
        //   249: astore          4
        //   251: aload           6
        //   253: astore          5
        //   255: aload           9
        //   257: iload_2        
        //   258: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   261: aload           7
        //   263: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   268: pop            
        //   269: aload           6
        //   271: astore          4
        //   273: aload           6
        //   275: astore          5
        //   277: aload           7
        //   279: aload           10
        //   281: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   286: pop            
        //   287: goto            319
        //   290: astore          7
        //   292: aload           6
        //   294: astore          4
        //   296: aload           6
        //   298: astore          5
        //   300: aload_0        
        //   301: invokevirtual   R2/m3.j:()LR2/Y1;
        //   304: invokevirtual   R2/Y1.G:()LR2/a2;
        //   307: ldc_w           "Failed to merge filter. appId"
        //   310: aload_1        
        //   311: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   314: aload           7
        //   316: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   319: aload           6
        //   321: astore          4
        //   323: aload           6
        //   325: astore          5
        //   327: aload           6
        //   329: invokeinterface android/database/Cursor.moveToNext:()Z
        //   334: istore_3       
        //   335: iload_3        
        //   336: ifne            116
        //   339: aload           6
        //   341: invokeinterface android/database/Cursor.close:()V
        //   346: aload           9
        //   348: areturn        
        //   349: aload           5
        //   351: astore          4
        //   353: aload_0        
        //   354: invokevirtual   R2/m3.j:()LR2/Y1;
        //   357: invokevirtual   R2/Y1.G:()LR2/a2;
        //   360: ldc_w           "Database error querying filters. appId"
        //   363: aload_1        
        //   364: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   367: aload           6
        //   369: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   372: aload           5
        //   374: astore          4
        //   376: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   379: astore_1       
        //   380: aload           5
        //   382: ifnull          392
        //   385: aload           5
        //   387: invokeinterface android/database/Cursor.close:()V
        //   392: aload_1        
        //   393: areturn        
        //   394: aload           4
        //   396: ifnull          406
        //   399: aload           4
        //   401: invokeinterface android/database/Cursor.close:()V
        //   406: aload_1        
        //   407: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  26     66     111    394    Landroid/database/sqlite/SQLiteException;
        //  26     66     107    408    Any
        //  74     84     111    394    Landroid/database/sqlite/SQLiteException;
        //  74     84     107    408    Any
        //  92     97     111    394    Landroid/database/sqlite/SQLiteException;
        //  92     97     107    408    Any
        //  124    134    111    394    Landroid/database/sqlite/SQLiteException;
        //  124    134    107    408    Any
        //  142    164    290    319    Ljava/io/IOException;
        //  142    164    111    394    Landroid/database/sqlite/SQLiteException;
        //  142    164    107    408    Any
        //  172    180    111    394    Landroid/database/sqlite/SQLiteException;
        //  172    180    107    408    Any
        //  188    197    111    394    Landroid/database/sqlite/SQLiteException;
        //  188    197    107    408    Any
        //  205    221    111    394    Landroid/database/sqlite/SQLiteException;
        //  205    221    107    408    Any
        //  238    247    111    394    Landroid/database/sqlite/SQLiteException;
        //  238    247    107    408    Any
        //  255    269    111    394    Landroid/database/sqlite/SQLiteException;
        //  255    269    107    408    Any
        //  277    287    111    394    Landroid/database/sqlite/SQLiteException;
        //  277    287    107    408    Any
        //  300    319    111    394    Landroid/database/sqlite/SQLiteException;
        //  300    319    107    408    Any
        //  327    335    111    394    Landroid/database/sqlite/SQLiteException;
        //  327    335    107    408    Any
        //  353    372    107    408    Any
        //  376    380    107    408    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 187 out of bounds for length 187
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final String P(final String s, String[] array, String string) {
        final SQLiteDatabase b = this.B();
        Object rawQuery = null;
        try {
            Label_0065: {
                try {
                    final Cursor cursor;
                    array = (String[])(Object)(cursor = (Cursor)(rawQuery = b.rawQuery(s, array)));
                    if (((Cursor)(Object)array).moveToFirst()) {
                        rawQuery = array;
                        string = ((Cursor)(Object)array).getString(0);
                        ((Cursor)(Object)array).close();
                        return string;
                    }
                    break Label_0065;
                }
                finally {
                    if (rawQuery != null) {
                        ((Cursor)rawQuery).close();
                    }
                    final SQLiteException ex;
                    this.j().G().c("Database error", s, ex);
                    throw ex;
                    ((Cursor)(Object)array).close();
                    return string;
                }
            }
        }
        catch (SQLiteException ex2) {}
    }
    
    public final Map P0(final String s) {
        this.u();
        this.n();
        A2.n.e(s);
        final a a = new a();
        Object b = this.B();
        Cursor cursor = null;
        Cursor rawQuery = null;
        try {
            Label_0106: {
                try {
                    b = (cursor = (rawQuery = ((SQLiteDatabase)b).rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[] { s, s })));
                    if (!((Cursor)b).moveToFirst()) {
                        rawQuery = (Cursor)b;
                        cursor = (Cursor)b;
                        final Map<Object, Object> emptyMap = Collections.emptyMap();
                        ((Cursor)b).close();
                        return emptyMap;
                    }
                    break Label_0106;
                }
                finally {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    // iftrue(Label_0106:, b.moveToNext())
                    // iftrue(Label_0295:, cursor == null)
                    // iftrue(Label_0195:, list = (List<Integer>)a.get((Object)Integer.valueOf(int1)) != null)
                Block_8:
                    while (true) {
                        while (true) {
                            cursor.close();
                            return;
                            final List<Integer> list;
                            list.add(((Cursor)b).getInt(1));
                            break Block_8;
                            Label_0295: {
                                return emptyMap2;
                            }
                            final SQLiteException ex;
                            this.j().G().c("Database error querying scoped filters. appId", Y1.v(s), ex);
                            emptyMap2 = Collections.emptyMap();
                            continue;
                        }
                        final int int1 = ((Cursor)b).getInt(0);
                        final List<Integer> list = new ArrayList<Integer>();
                        a.put(int1, list);
                        continue;
                    }
                    ((Cursor)b).close();
                    return a;
                }
            }
        }
        catch (SQLiteException ex2) {}
    }
    
    public final List Q(final String p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/m3.n:()V
        //     4: aload_0        
        //     5: invokevirtual   R2/C5.u:()V
        //     8: iload_2        
        //     9: ifle            18
        //    12: iconst_1       
        //    13: istore          5
        //    15: goto            21
        //    18: iconst_0       
        //    19: istore          5
        //    21: iload           5
        //    23: invokestatic    A2/n.a:(Z)V
        //    26: iload_3        
        //    27: ifle            36
        //    30: iconst_1       
        //    31: istore          5
        //    33: goto            39
        //    36: iconst_0       
        //    37: istore          5
        //    39: iload           5
        //    41: invokestatic    A2/n.a:(Z)V
        //    44: aload_1        
        //    45: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    48: pop            
        //    49: aconst_null    
        //    50: astore          15
        //    52: aconst_null    
        //    53: astore          14
        //    55: aload_0        
        //    56: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    59: ldc_w           "queue"
        //    62: iconst_3       
        //    63: anewarray       Ljava/lang/String;
        //    66: dup            
        //    67: iconst_0       
        //    68: ldc_w           "rowid"
        //    71: aastore        
        //    72: dup            
        //    73: iconst_1       
        //    74: ldc_w           "data"
        //    77: aastore        
        //    78: dup            
        //    79: iconst_2       
        //    80: ldc             "retry_count"
        //    82: aastore        
        //    83: ldc_w           "app_id=?"
        //    86: iconst_1       
        //    87: anewarray       Ljava/lang/String;
        //    90: dup            
        //    91: iconst_0       
        //    92: aload_1        
        //    93: aastore        
        //    94: aconst_null    
        //    95: aconst_null    
        //    96: ldc_w           "rowid"
        //    99: iload_2        
        //   100: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   103: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   106: astore          16
        //   108: aload           16
        //   110: astore          14
        //   112: aload           16
        //   114: astore          15
        //   116: aload           16
        //   118: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   123: ifne            158
        //   126: aload           16
        //   128: astore          14
        //   130: aload           16
        //   132: astore          15
        //   134: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   137: astore          17
        //   139: aload           16
        //   141: invokeinterface android/database/Cursor.close:()V
        //   146: aload           17
        //   148: areturn        
        //   149: astore_1       
        //   150: goto            977
        //   153: astore          16
        //   155: goto            932
        //   158: aload           16
        //   160: astore          14
        //   162: aload           16
        //   164: astore          15
        //   166: new             Ljava/util/ArrayList;
        //   169: dup            
        //   170: invokespecial   java/util/ArrayList.<init>:()V
        //   173: astore          21
        //   175: iconst_0       
        //   176: istore_2       
        //   177: aload           16
        //   179: astore          14
        //   181: aload           16
        //   183: astore          15
        //   185: aload           16
        //   187: iconst_0       
        //   188: invokeinterface android/database/Cursor.getLong:(I)J
        //   193: lstore          12
        //   195: aload           16
        //   197: astore          14
        //   199: aload           16
        //   201: astore          15
        //   203: aload           16
        //   205: iconst_1       
        //   206: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   211: astore          17
        //   213: aload           16
        //   215: astore          14
        //   217: aload           16
        //   219: astore          15
        //   221: aload_0        
        //   222: invokevirtual   R2/z5.o:()LR2/N5;
        //   225: aload           17
        //   227: invokevirtual   R2/N5.i0:([B)[B
        //   230: astore          17
        //   232: aload           16
        //   234: astore          14
        //   236: aload           16
        //   238: astore          15
        //   240: aload           21
        //   242: invokeinterface java/util/List.isEmpty:()Z
        //   247: ifne            271
        //   250: aload           16
        //   252: astore          14
        //   254: aload           16
        //   256: astore          15
        //   258: aload           17
        //   260: arraylength    
        //   261: istore          4
        //   263: iload           4
        //   265: iload_2        
        //   266: iadd           
        //   267: iload_3        
        //   268: if_icmpgt       922
        //   271: aload           16
        //   273: astore          14
        //   275: aload           16
        //   277: astore          15
        //   279: invokestatic    com/google/android/gms/internal/measurement/d2.A3:()Lcom/google/android/gms/internal/measurement/d2$a;
        //   282: aload           17
        //   284: invokestatic    R2/N5.H:(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
        //   287: checkcast       Lcom/google/android/gms/internal/measurement/d2$a;
        //   290: astore          18
        //   292: aload           16
        //   294: astore          14
        //   296: aload           16
        //   298: astore          15
        //   300: invokestatic    com/google/android/gms/internal/measurement/n6.a:()Z
        //   303: ifeq            695
        //   306: aload           16
        //   308: astore          14
        //   310: aload           16
        //   312: astore          15
        //   314: aload_0        
        //   315: invokevirtual   R2/m3.f:()LR2/g;
        //   318: getstatic       R2/K.X0:LR2/P1;
        //   321: invokevirtual   R2/g.s:(LR2/P1;)Z
        //   324: ifeq            695
        //   327: aload           16
        //   329: astore          14
        //   331: aload           16
        //   333: astore          15
        //   335: aload           21
        //   337: invokeinterface java/util/List.isEmpty:()Z
        //   342: ifne            695
        //   345: aload           16
        //   347: astore          14
        //   349: aload           16
        //   351: astore          15
        //   353: aload           21
        //   355: iconst_0       
        //   356: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   361: checkcast       Landroid/util/Pair;
        //   364: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   367: checkcast       Lcom/google/android/gms/internal/measurement/d2;
        //   370: astore          20
        //   372: aload           16
        //   374: astore          14
        //   376: aload           16
        //   378: astore          15
        //   380: aload           18
        //   382: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   385: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   388: checkcast       Lcom/google/android/gms/internal/measurement/d2;
        //   391: astore          19
        //   393: aload           16
        //   395: astore          14
        //   397: aload           16
        //   399: astore          15
        //   401: aload           20
        //   403: invokevirtual   com/google/android/gms/internal/measurement/d2.f0:()Ljava/lang/String;
        //   406: aload           19
        //   408: invokevirtual   com/google/android/gms/internal/measurement/d2.f0:()Ljava/lang/String;
        //   411: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   414: ifeq            922
        //   417: aload           16
        //   419: astore          14
        //   421: aload           16
        //   423: astore          15
        //   425: aload           20
        //   427: invokevirtual   com/google/android/gms/internal/measurement/d2.e0:()Ljava/lang/String;
        //   430: aload           19
        //   432: invokevirtual   com/google/android/gms/internal/measurement/d2.e0:()Ljava/lang/String;
        //   435: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   438: ifeq            922
        //   441: aload           16
        //   443: astore          14
        //   445: aload           16
        //   447: astore          15
        //   449: aload           20
        //   451: invokevirtual   com/google/android/gms/internal/measurement/d2.v0:()Z
        //   454: aload           19
        //   456: invokevirtual   com/google/android/gms/internal/measurement/d2.v0:()Z
        //   459: if_icmpne       922
        //   462: aload           16
        //   464: astore          14
        //   466: aload           16
        //   468: astore          15
        //   470: aload           20
        //   472: invokevirtual   com/google/android/gms/internal/measurement/d2.g0:()Ljava/lang/String;
        //   475: aload           19
        //   477: invokevirtual   com/google/android/gms/internal/measurement/d2.g0:()Ljava/lang/String;
        //   480: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   483: ifeq            922
        //   486: aload           16
        //   488: astore          14
        //   490: aload           16
        //   492: astore          15
        //   494: aload           20
        //   496: invokevirtual   com/google/android/gms/internal/measurement/d2.t0:()Ljava/util/List;
        //   499: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   504: astore          20
        //   506: aload           16
        //   508: astore          14
        //   510: aload           16
        //   512: astore          15
        //   514: aload           20
        //   516: invokeinterface java/util/Iterator.hasNext:()Z
        //   521: istore          5
        //   523: ldc2_w          -1
        //   526: lstore          10
        //   528: iload           5
        //   530: ifeq            994
        //   533: aload           16
        //   535: astore          14
        //   537: aload           16
        //   539: astore          15
        //   541: aload           20
        //   543: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   548: checkcast       Lcom/google/android/gms/internal/measurement/h2;
        //   551: astore          22
        //   553: aload           16
        //   555: astore          14
        //   557: aload           16
        //   559: astore          15
        //   561: ldc_w           "_npa"
        //   564: aload           22
        //   566: invokevirtual   com/google/android/gms/internal/measurement/h2.Z:()Ljava/lang/String;
        //   569: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   572: ifeq            991
        //   575: aload           16
        //   577: astore          14
        //   579: aload           16
        //   581: astore          15
        //   583: aload           22
        //   585: invokevirtual   com/google/android/gms/internal/measurement/h2.U:()J
        //   588: lstore          6
        //   590: goto            593
        //   593: aload           16
        //   595: astore          14
        //   597: aload           16
        //   599: astore          15
        //   601: aload           19
        //   603: invokevirtual   com/google/android/gms/internal/measurement/d2.t0:()Ljava/util/List;
        //   606: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   611: astore          19
        //   613: aload           16
        //   615: astore          14
        //   617: aload           16
        //   619: astore          15
        //   621: lload           10
        //   623: lstore          8
        //   625: aload           19
        //   627: invokeinterface java/util/Iterator.hasNext:()Z
        //   632: ifeq            1002
        //   635: aload           16
        //   637: astore          14
        //   639: aload           16
        //   641: astore          15
        //   643: aload           19
        //   645: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   650: checkcast       Lcom/google/android/gms/internal/measurement/h2;
        //   653: astore          20
        //   655: aload           16
        //   657: astore          14
        //   659: aload           16
        //   661: astore          15
        //   663: ldc_w           "_npa"
        //   666: aload           20
        //   668: invokevirtual   com/google/android/gms/internal/measurement/h2.Z:()Ljava/lang/String;
        //   671: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   674: ifeq            613
        //   677: aload           16
        //   679: astore          14
        //   681: aload           16
        //   683: astore          15
        //   685: aload           20
        //   687: invokevirtual   com/google/android/gms/internal/measurement/h2.U:()J
        //   690: lstore          8
        //   692: goto            1002
        //   695: aload           16
        //   697: astore          14
        //   699: aload           16
        //   701: astore          15
        //   703: aload           16
        //   705: iconst_2       
        //   706: invokeinterface android/database/Cursor.isNull:(I)Z
        //   711: ifne            736
        //   714: aload           16
        //   716: astore          14
        //   718: aload           16
        //   720: astore          15
        //   722: aload           18
        //   724: aload           16
        //   726: iconst_2       
        //   727: invokeinterface android/database/Cursor.getInt:(I)I
        //   732: invokevirtual   com/google/android/gms/internal/measurement/d2$a.q0:(I)Lcom/google/android/gms/internal/measurement/d2$a;
        //   735: pop            
        //   736: aload           16
        //   738: astore          14
        //   740: aload           16
        //   742: astore          15
        //   744: iload_2        
        //   745: aload           17
        //   747: arraylength    
        //   748: iadd           
        //   749: istore_2       
        //   750: aload           16
        //   752: astore          14
        //   754: aload           16
        //   756: astore          15
        //   758: aload           21
        //   760: aload           18
        //   762: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   765: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   768: checkcast       Lcom/google/android/gms/internal/measurement/d2;
        //   771: lload           12
        //   773: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   776: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   779: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   784: pop            
        //   785: goto            889
        //   788: astore          17
        //   790: aload           16
        //   792: astore          14
        //   794: aload           16
        //   796: astore          15
        //   798: aload_0        
        //   799: invokevirtual   R2/m3.j:()LR2/Y1;
        //   802: invokevirtual   R2/Y1.G:()LR2/a2;
        //   805: astore          18
        //   807: ldc_w           "Failed to merge queued bundle. appId"
        //   810: astore          19
        //   812: aload           16
        //   814: astore          14
        //   816: aload           16
        //   818: astore          15
        //   820: aload_1        
        //   821: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   824: astore          20
        //   826: aload           16
        //   828: astore          14
        //   830: aload           16
        //   832: astore          15
        //   834: aload           18
        //   836: aload           19
        //   838: aload           20
        //   840: aload           17
        //   842: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   845: goto            889
        //   848: astore          17
        //   850: aload           16
        //   852: astore          14
        //   854: aload           16
        //   856: astore          15
        //   858: aload_0        
        //   859: invokevirtual   R2/m3.j:()LR2/Y1;
        //   862: invokevirtual   R2/Y1.G:()LR2/a2;
        //   865: astore          18
        //   867: ldc_w           "Failed to unzip queued bundle. appId"
        //   870: astore          19
        //   872: aload           16
        //   874: astore          14
        //   876: aload           16
        //   878: astore          15
        //   880: aload_1        
        //   881: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   884: astore          20
        //   886: goto            826
        //   889: aload           16
        //   891: astore          14
        //   893: aload           16
        //   895: astore          15
        //   897: aload           16
        //   899: invokeinterface android/database/Cursor.moveToNext:()Z
        //   904: istore          5
        //   906: iload           5
        //   908: ifeq            922
        //   911: iload_2        
        //   912: iload_3        
        //   913: if_icmple       919
        //   916: goto            922
        //   919: goto            177
        //   922: aload           16
        //   924: invokeinterface android/database/Cursor.close:()V
        //   929: aload           21
        //   931: areturn        
        //   932: aload           15
        //   934: astore          14
        //   936: aload_0        
        //   937: invokevirtual   R2/m3.j:()LR2/Y1;
        //   940: invokevirtual   R2/Y1.G:()LR2/a2;
        //   943: ldc_w           "Error querying bundles. appId"
        //   946: aload_1        
        //   947: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   950: aload           16
        //   952: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   955: aload           15
        //   957: astore          14
        //   959: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   962: astore_1       
        //   963: aload           15
        //   965: ifnull          975
        //   968: aload           15
        //   970: invokeinterface android/database/Cursor.close:()V
        //   975: aload_1        
        //   976: areturn        
        //   977: aload           14
        //   979: ifnull          989
        //   982: aload           14
        //   984: invokeinterface android/database/Cursor.close:()V
        //   989: aload_1        
        //   990: athrow         
        //   991: goto            506
        //   994: ldc2_w          -1
        //   997: lstore          6
        //   999: goto            593
        //  1002: lload           6
        //  1004: lload           8
        //  1006: lcmp           
        //  1007: ifne            922
        //  1010: goto            695
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  55     108    153    977    Landroid/database/sqlite/SQLiteException;
        //  55     108    149    991    Any
        //  116    126    153    977    Landroid/database/sqlite/SQLiteException;
        //  116    126    149    991    Any
        //  134    139    153    977    Landroid/database/sqlite/SQLiteException;
        //  134    139    149    991    Any
        //  166    175    153    977    Landroid/database/sqlite/SQLiteException;
        //  166    175    149    991    Any
        //  185    195    153    977    Landroid/database/sqlite/SQLiteException;
        //  185    195    149    991    Any
        //  203    213    848    889    Ljava/io/IOException;
        //  203    213    153    977    Landroid/database/sqlite/SQLiteException;
        //  203    213    149    991    Any
        //  221    232    848    889    Ljava/io/IOException;
        //  221    232    153    977    Landroid/database/sqlite/SQLiteException;
        //  221    232    149    991    Any
        //  240    250    153    977    Landroid/database/sqlite/SQLiteException;
        //  240    250    149    991    Any
        //  258    263    153    977    Landroid/database/sqlite/SQLiteException;
        //  258    263    149    991    Any
        //  279    292    788    826    Ljava/io/IOException;
        //  279    292    153    977    Landroid/database/sqlite/SQLiteException;
        //  279    292    149    991    Any
        //  300    306    153    977    Landroid/database/sqlite/SQLiteException;
        //  300    306    149    991    Any
        //  314    327    153    977    Landroid/database/sqlite/SQLiteException;
        //  314    327    149    991    Any
        //  335    345    153    977    Landroid/database/sqlite/SQLiteException;
        //  335    345    149    991    Any
        //  353    372    153    977    Landroid/database/sqlite/SQLiteException;
        //  353    372    149    991    Any
        //  380    393    153    977    Landroid/database/sqlite/SQLiteException;
        //  380    393    149    991    Any
        //  401    417    153    977    Landroid/database/sqlite/SQLiteException;
        //  401    417    149    991    Any
        //  425    441    153    977    Landroid/database/sqlite/SQLiteException;
        //  425    441    149    991    Any
        //  449    462    153    977    Landroid/database/sqlite/SQLiteException;
        //  449    462    149    991    Any
        //  470    486    153    977    Landroid/database/sqlite/SQLiteException;
        //  470    486    149    991    Any
        //  494    506    153    977    Landroid/database/sqlite/SQLiteException;
        //  494    506    149    991    Any
        //  514    523    153    977    Landroid/database/sqlite/SQLiteException;
        //  514    523    149    991    Any
        //  541    553    153    977    Landroid/database/sqlite/SQLiteException;
        //  541    553    149    991    Any
        //  561    575    153    977    Landroid/database/sqlite/SQLiteException;
        //  561    575    149    991    Any
        //  583    590    153    977    Landroid/database/sqlite/SQLiteException;
        //  583    590    149    991    Any
        //  601    613    153    977    Landroid/database/sqlite/SQLiteException;
        //  601    613    149    991    Any
        //  625    635    153    977    Landroid/database/sqlite/SQLiteException;
        //  625    635    149    991    Any
        //  643    655    153    977    Landroid/database/sqlite/SQLiteException;
        //  643    655    149    991    Any
        //  663    677    153    977    Landroid/database/sqlite/SQLiteException;
        //  663    677    149    991    Any
        //  685    692    153    977    Landroid/database/sqlite/SQLiteException;
        //  685    692    149    991    Any
        //  703    714    153    977    Landroid/database/sqlite/SQLiteException;
        //  703    714    149    991    Any
        //  722    736    153    977    Landroid/database/sqlite/SQLiteException;
        //  722    736    149    991    Any
        //  744    750    153    977    Landroid/database/sqlite/SQLiteException;
        //  744    750    149    991    Any
        //  758    785    153    977    Landroid/database/sqlite/SQLiteException;
        //  758    785    149    991    Any
        //  798    807    153    977    Landroid/database/sqlite/SQLiteException;
        //  798    807    149    991    Any
        //  820    826    153    977    Landroid/database/sqlite/SQLiteException;
        //  820    826    149    991    Any
        //  834    845    153    977    Landroid/database/sqlite/SQLiteException;
        //  834    845    149    991    Any
        //  858    867    153    977    Landroid/database/sqlite/SQLiteException;
        //  858    867    149    991    Any
        //  880    886    153    977    Landroid/database/sqlite/SQLiteException;
        //  880    886    149    991    Any
        //  897    906    153    977    Landroid/database/sqlite/SQLiteException;
        //  897    906    149    991    Any
        //  936    955    149    991    Any
        //  959    963    149    991    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 453 out of bounds for length 453
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void Q0() {
        this.u();
        this.B().beginTransaction();
    }
    
    public final List R(final String s, final String s2, final String str) {
        A2.n.e(s);
        this.n();
        this.u();
        final ArrayList<String> list = new ArrayList<String>(3);
        list.add(s);
        final StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            list.add(s2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty((CharSequence)str)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("*");
            list.add(sb2.toString());
            sb.append(" and name glob ?");
        }
        return this.S(sb.toString(), list.toArray(new String[list.size()]));
    }
    
    public final void R0() {
        this.u();
        this.B().endTransaction();
    }
    
    public final List S(final String p0, final String[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/m3.n:()V
        //     4: aload_0        
        //     5: invokevirtual   R2/C5.u:()V
        //     8: new             Ljava/util/ArrayList;
        //    11: dup            
        //    12: invokespecial   java/util/ArrayList.<init>:()V
        //    15: astore          12
        //    17: aload_0        
        //    18: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    21: ldc_w           "conditional_properties"
        //    24: bipush          13
        //    26: anewarray       Ljava/lang/String;
        //    29: dup            
        //    30: iconst_0       
        //    31: ldc_w           "app_id"
        //    34: aastore        
        //    35: dup            
        //    36: iconst_1       
        //    37: ldc             "origin"
        //    39: aastore        
        //    40: dup            
        //    41: iconst_2       
        //    42: ldc_w           "name"
        //    45: aastore        
        //    46: dup            
        //    47: iconst_3       
        //    48: ldc_w           "value"
        //    51: aastore        
        //    52: dup            
        //    53: iconst_4       
        //    54: ldc_w           "active"
        //    57: aastore        
        //    58: dup            
        //    59: iconst_5       
        //    60: ldc_w           "trigger_event_name"
        //    63: aastore        
        //    64: dup            
        //    65: bipush          6
        //    67: ldc_w           "trigger_timeout"
        //    70: aastore        
        //    71: dup            
        //    72: bipush          7
        //    74: ldc_w           "timed_out_event"
        //    77: aastore        
        //    78: dup            
        //    79: bipush          8
        //    81: ldc_w           "creation_timestamp"
        //    84: aastore        
        //    85: dup            
        //    86: bipush          9
        //    88: ldc_w           "triggered_event"
        //    91: aastore        
        //    92: dup            
        //    93: bipush          10
        //    95: ldc_w           "triggered_timestamp"
        //    98: aastore        
        //    99: dup            
        //   100: bipush          11
        //   102: ldc_w           "time_to_live"
        //   105: aastore        
        //   106: dup            
        //   107: bipush          12
        //   109: ldc_w           "expired_event"
        //   112: aastore        
        //   113: aload_1        
        //   114: aload_2        
        //   115: aconst_null    
        //   116: aconst_null    
        //   117: ldc_w           "rowid"
        //   120: ldc_w           "1001"
        //   123: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   126: astore_1       
        //   127: aload_1        
        //   128: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   133: istore_3       
        //   134: iload_3        
        //   135: ifne            147
        //   138: aload_1        
        //   139: invokeinterface android/database/Cursor.close:()V
        //   144: aload           12
        //   146: areturn        
        //   147: aload           12
        //   149: invokeinterface java/util/List.size:()I
        //   154: sipush          1000
        //   157: if_icmplt       182
        //   160: aload_0        
        //   161: invokevirtual   R2/m3.j:()LR2/Y1;
        //   164: invokevirtual   R2/Y1.G:()LR2/a2;
        //   167: ldc_w           "Read more than the max allowed conditional properties, ignoring extra"
        //   170: sipush          1000
        //   173: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   176: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   179: goto            418
        //   182: aload_1        
        //   183: iconst_0       
        //   184: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   189: astore_2       
        //   190: aload_1        
        //   191: iconst_1       
        //   192: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   197: astore          13
        //   199: aload_1        
        //   200: iconst_2       
        //   201: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   206: astore          14
        //   208: aload_0        
        //   209: aload_1        
        //   210: iconst_3       
        //   211: invokevirtual   R2/p.M:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   214: astore          15
        //   216: aload_1        
        //   217: iconst_4       
        //   218: invokeinterface android/database/Cursor.getInt:(I)I
        //   223: ifeq            502
        //   226: iconst_1       
        //   227: istore_3       
        //   228: goto            231
        //   231: aload_1        
        //   232: iconst_5       
        //   233: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   238: astore          16
        //   240: aload_1        
        //   241: bipush          6
        //   243: invokeinterface android/database/Cursor.getLong:(I)J
        //   248: lstore          4
        //   250: aload_0        
        //   251: invokevirtual   R2/z5.o:()LR2/N5;
        //   254: astore          18
        //   256: aload_1        
        //   257: bipush          7
        //   259: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   264: astore          19
        //   266: getstatic       R2/I.CREATOR:Landroid/os/Parcelable$Creator;
        //   269: astore          17
        //   271: aload           18
        //   273: aload           19
        //   275: aload           17
        //   277: invokevirtual   R2/N5.E:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   280: checkcast       LR2/I;
        //   283: astore          18
        //   285: aload_1        
        //   286: bipush          8
        //   288: invokeinterface android/database/Cursor.getLong:(I)J
        //   293: lstore          6
        //   295: aload_0        
        //   296: invokevirtual   R2/z5.o:()LR2/N5;
        //   299: aload_1        
        //   300: bipush          9
        //   302: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   307: aload           17
        //   309: invokevirtual   R2/N5.E:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   312: checkcast       LR2/I;
        //   315: astore          19
        //   317: aload_1        
        //   318: bipush          10
        //   320: invokeinterface android/database/Cursor.getLong:(I)J
        //   325: lstore          8
        //   327: aload_1        
        //   328: bipush          11
        //   330: invokeinterface android/database/Cursor.getLong:(I)J
        //   335: lstore          10
        //   337: aload_0        
        //   338: invokevirtual   R2/z5.o:()LR2/N5;
        //   341: aload_1        
        //   342: bipush          12
        //   344: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   349: aload           17
        //   351: invokevirtual   R2/N5.E:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   354: checkcast       LR2/I;
        //   357: astore          17
        //   359: aload           12
        //   361: new             LR2/e;
        //   364: dup            
        //   365: aload_2        
        //   366: aload           13
        //   368: new             LR2/R5;
        //   371: dup            
        //   372: aload           14
        //   374: lload           8
        //   376: aload           15
        //   378: aload           13
        //   380: invokespecial   R2/R5.<init>:(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
        //   383: lload           6
        //   385: iload_3        
        //   386: aload           16
        //   388: aload           18
        //   390: lload           4
        //   392: aload           19
        //   394: lload           10
        //   396: aload           17
        //   398: invokespecial   R2/e.<init>:(Ljava/lang/String;Ljava/lang/String;LR2/R5;JZLjava/lang/String;LR2/I;JLR2/I;JLR2/I;)V
        //   401: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   406: pop            
        //   407: aload_1        
        //   408: invokeinterface android/database/Cursor.moveToNext:()Z
        //   413: istore_3       
        //   414: iload_3        
        //   415: ifne            427
        //   418: aload_1        
        //   419: invokeinterface android/database/Cursor.close:()V
        //   424: aload           12
        //   426: areturn        
        //   427: goto            147
        //   430: astore_1       
        //   431: aconst_null    
        //   432: astore_2       
        //   433: goto            476
        //   436: astore_2       
        //   437: aconst_null    
        //   438: astore_1       
        //   439: aload_0        
        //   440: invokevirtual   R2/m3.j:()LR2/Y1;
        //   443: invokevirtual   R2/Y1.G:()LR2/a2;
        //   446: ldc_w           "Error querying conditional user property value"
        //   449: aload_2        
        //   450: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   453: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   456: astore_2       
        //   457: aload_1        
        //   458: ifnull          467
        //   461: aload_1        
        //   462: invokeinterface android/database/Cursor.close:()V
        //   467: aload_2        
        //   468: areturn        
        //   469: astore          12
        //   471: aload_1        
        //   472: astore_2       
        //   473: aload           12
        //   475: astore_1       
        //   476: aload_2        
        //   477: ifnull          486
        //   480: aload_2        
        //   481: invokeinterface android/database/Cursor.close:()V
        //   486: aload_1        
        //   487: athrow         
        //   488: astore          12
        //   490: aload_1        
        //   491: astore_2       
        //   492: aload           12
        //   494: astore_1       
        //   495: goto            476
        //   498: astore_2       
        //   499: goto            439
        //   502: iconst_0       
        //   503: istore_3       
        //   504: goto            231
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  17     127    436    439    Landroid/database/sqlite/SQLiteException;
        //  17     127    430    436    Any
        //  127    134    498    502    Landroid/database/sqlite/SQLiteException;
        //  127    134    488    498    Any
        //  147    179    498    502    Landroid/database/sqlite/SQLiteException;
        //  147    179    488    498    Any
        //  182    226    498    502    Landroid/database/sqlite/SQLiteException;
        //  182    226    488    498    Any
        //  231    414    498    502    Landroid/database/sqlite/SQLiteException;
        //  231    414    488    498    Any
        //  439    457    469    476    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0147:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void S0() {
        this.n();
        this.u();
        if (!this.u0()) {
            return;
        }
        final long a = this.s().e.a();
        final long b = this.b().b();
        if (Math.abs(b - a) > (long)K.A.a(null)) {
            this.s().e.b(b);
            this.n();
            this.u();
            if (this.u0()) {
                final int delete = this.B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(this.b().a()), String.valueOf(R2.g.M()) });
                if (delete > 0) {
                    this.j().K().b("Deleted stale rows. rowsDeleted", delete);
                }
            }
        }
    }
    
    public final void T(final E e) {
        A2.n.i(e);
        this.n();
        this.u();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e.a);
        contentValues.put("name", e.b);
        contentValues.put("lifetime_count", Long.valueOf(e.c));
        contentValues.put("current_bundle_count", Long.valueOf(e.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(e.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(e.g));
        contentValues.put("last_bundled_day", e.h);
        contentValues.put("last_sampled_complex_event_id", e.i);
        contentValues.put("last_sampling_rate", e.j);
        contentValues.put("current_session_count", Long.valueOf(e.e));
        final Boolean k = e.k;
        Long value;
        if (k != null && k) {
            value = 1L;
        }
        else {
            value = null;
        }
        contentValues.put("last_exempt_from_sampling", value);
        Label_0220: {
            try {
                if (this.B().insertWithOnConflict("events", (String)null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert/update event aggregates (got -1). appId", Y1.v(e.a));
                    return;
                }
            }
            catch (SQLiteException ex) {
                break Label_0220;
            }
            return;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing event aggregates. appId", Y1.v(e.a), ex);
    }
    
    public final void T0() {
        this.u();
        this.B().setTransactionSuccessful();
    }
    
    public final void U(final I2 i2) {
        A2.n.i(i2);
        this.n();
        this.u();
        final String t0 = i2.t0();
        A2.n.i(t0);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t0);
        contentValues.put("app_instance_id", i2.u0());
        contentValues.put("gmp_app_id", i2.j());
        contentValues.put("resettable_device_id_hash", i2.l());
        contentValues.put("last_bundle_index", Long.valueOf(i2.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(i2.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(i2.i0()));
        contentValues.put("app_version", i2.h());
        contentValues.put("app_store", i2.v0());
        contentValues.put("gmp_version", Long.valueOf(i2.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(i2.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(i2.r()));
        contentValues.put("day", Long.valueOf(i2.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(i2.T()));
        contentValues.put("daily_events_count", Long.valueOf(i2.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(i2.K()));
        contentValues.put("config_fetched_time", Long.valueOf(i2.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(i2.e0()));
        contentValues.put("app_version_int", Long.valueOf(i2.z()));
        contentValues.put("firebase_instance_id", i2.i());
        contentValues.put("daily_error_events_count", Long.valueOf(i2.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(i2.W()));
        contentValues.put("health_monitor_sample", i2.k());
        contentValues.put("android_id", Long.valueOf(i2.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(i2.q()));
        contentValues.put("admob_app_id", i2.r0());
        contentValues.put("dynamite_version", Long.valueOf(i2.c0()));
        contentValues.put("session_stitching_token", i2.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(i2.t()));
        contentValues.put("target_os_version", Long.valueOf(i2.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(i2.o0()));
        if (g7.a() && this.f().B(t0, K.L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(i2.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(i2.D()));
        }
        if (i6.a() && this.f().B(t0, K.Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(i2.u()));
        }
        final List n = i2.n();
        if (n != null) {
            if (n.isEmpty()) {
                this.j().L().b("Safelisted events should not be an empty list. appId", t0);
            }
            else {
                contentValues.put("safelisted_events", TextUtils.join((CharSequence)",", (Iterable)n));
            }
        }
        if (o6.a() && this.f().s(K.u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String)null);
        }
        if (n6.a() && this.f().B(t0, K.T0)) {
            contentValues.put("npa_metadata_value", i2.q0());
        }
        Label_0673: {
            try {
                final SQLiteDatabase b = this.B();
                if (b.update("apps", contentValues, "app_id = ?", new String[] { t0 }) == 0L && b.insertWithOnConflict("apps", (String)null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert/update app (got -1). appId", Y1.v(t0));
                    return;
                }
            }
            catch (SQLiteException ex) {
                break Label_0673;
            }
            return;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing app. appId", Y1.v(t0), ex);
    }
    
    public final boolean U0() {
        return this.x0("select count(1) > 0 from raw_events", null) != 0L;
    }
    
    public final boolean V0() {
        return this.x0("select count(1) > 0 from queue where has_realtime = 1", null) != 0L;
    }
    
    public final void W(final String s, final z z) {
        if (n6.a()) {
            if (!this.f().s(K.T0)) {
                return;
            }
            A2.n.i(s);
            A2.n.i(z);
            this.n();
            this.u();
            final ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", s);
            contentValues.put("dma_consent_settings", z.i());
            this.Y("consent_settings", "app_id", contentValues);
        }
    }
    
    public final boolean W0() {
        return this.x0("select count(1) > 0 from raw_events where realtime = 1", null) != 0L;
    }
    
    public final void X(final String s, final q3 q3) {
        A2.n.i(s);
        A2.n.i(q3);
        this.n();
        this.u();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("consent_state", q3.v());
        if (n6.a() && this.f().s(K.T0)) {
            contentValues.put("consent_source", Integer.valueOf(q3.b()));
            this.Y("consent_settings", "app_id", contentValues);
            return;
        }
        Label_0132: {
            try {
                if (this.B().insertWithOnConflict("consent_settings", (String)null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert/update consent setting (got -1). appId", Y1.v(s));
                    return;
                }
            }
            catch (SQLiteException ex) {
                break Label_0132;
            }
            return;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing consent setting. appId, error", Y1.v(s), ex);
    }
    
    public final void Y(final String s, final String str, final ContentValues contentValues) {
        while (true) {
            try {
                final SQLiteDatabase b = this.B();
                final String asString = contentValues.getAsString(str);
                if (asString == null) {
                    this.j().H().b("Value of the primary key is not set.", Y1.v(str));
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" = ?");
                if (b.update(s, contentValues, sb.toString(), new String[] { asString }) == 0L && b.insertWithOnConflict(s, (String)null, contentValues, 5) == -1L) {
                    this.j().G().c("Failed to insert/update table (got -1). key", Y1.v(s), Y1.v(str));
                }
                return;
                final SQLiteException ex;
                this.j().G().d("Error storing into table. key", Y1.v(s), Y1.v(str), ex);
            }
            catch (SQLiteException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void Z(final String s, List value) {
        A2.n.i(value);
        int j = 0;
        for (int i = 0; i < ((List)value).size(); ++i) {
            Object o2;
            Object o = o2 = ((List<w1>)value).get(i).x();
            if (((w1.a)o).w() != 0) {
                int n = 0;
                while (true) {
                    o2 = o;
                    if (n >= ((w1.a)o).w()) {
                        break;
                    }
                    final x1.a a = (x1.a)((w1.a)o).z(n).x();
                    final x1.a a2 = (x1.a)a.clone();
                    final String b = r3.b(a.A());
                    if (b != null) {
                        a2.y(b);
                        j = 1;
                    }
                    else {
                        j = 0;
                    }
                    for (int k = 0; k < a.w(); ++k) {
                        final y1 z = a.z(k);
                        final String a3 = t3.a(z.M());
                        if (a3 != null) {
                            a2.x(k, (y1)((Y3.b)((y1.a)z.x()).w(a3)).p());
                            j = 1;
                        }
                    }
                    w1.a x = (w1.a)o;
                    if (j != 0) {
                        x = ((w1.a)o).x(n, a2);
                        ((List<w1>)value).set(i, (w1)((Y3.b)x).p());
                    }
                    ++n;
                    o = x;
                }
            }
            if (((w1.a)o2).A() != 0) {
                for (int j = 0; j < ((w1.a)o2).A(); ++j, o2 = o) {
                    final A1 b2 = ((w1.a)o2).B(j);
                    final String a4 = s3.a(b2.L());
                    o = o2;
                    if (a4 != null) {
                        o = ((w1.a)o2).y(j, ((A1.a)b2.x()).w(a4));
                        ((List<w1>)value).set(i, (w1)((Y3.b)o).p());
                    }
                }
            }
        }
        while (true) {
            this.u();
            this.n();
            A2.n.e(s);
            A2.n.i(value);
            final SQLiteDatabase b3 = this.B();
            b3.beginTransaction();
            while (true) {
                int i;
                Object o2;
                Object o;
                Iterator<w1> iterator;
                String s2;
                Object o3;
                Label_0728_Outer:Label_0777_Outer:
                while (true) {
                Label_0777:
                    while (true) {
                    Label_0958:
                        while (true) {
                            Label_0953: {
                                while (true) {
                                    try {
                                        this.u();
                                        this.n();
                                        A2.n.e(s);
                                        o = this.B();
                                        ((SQLiteDatabase)o).delete("property_filters", "app_id=?", new String[] { s });
                                        ((SQLiteDatabase)o).delete("event_filters", "app_id=?", new String[] { s });
                                        iterator = ((List<w1>)value).iterator();
                                        while (iterator.hasNext()) {
                                            o = iterator.next();
                                            this.u();
                                            this.n();
                                            A2.n.e(s);
                                            A2.n.i(o);
                                            if (!((w1)o).R()) {
                                                this.j().L().b("Audience with no ID. appId", Y1.v(s));
                                            }
                                            else {
                                                i = ((w1)o).k();
                                                o2 = ((w1)o).P().iterator();
                                            Label_0599:
                                                while (true) {
                                                    while (((Iterator)o2).hasNext()) {
                                                        if (!((x1)((Iterator<w1>)o2).next()).V()) {
                                                            o = this.j().L();
                                                            s2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                                            o3 = Y1.v(s);
                                                            o2 = i;
                                                            ((R2.a2)o).c(s2, o3, o2);
                                                            continue Label_0458;
                                                        }
                                                    }
                                                    o2 = ((w1)o).Q().iterator();
                                                    while (((Iterator)o2).hasNext()) {
                                                        if (!((A1)((Iterator<w1>)o2).next()).P()) {
                                                            o = this.j().L();
                                                            s2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                                            o3 = Y1.v(s);
                                                            o2 = i;
                                                            continue Label_0599;
                                                        }
                                                    }
                                                    break;
                                                }
                                                o2 = ((w1)o).P().iterator();
                                                Block_21: {
                                                    while (((Iterator)o2).hasNext()) {
                                                        if (!this.f0(s, i, (x1)((Iterator<w1>)o2).next())) {
                                                            break Block_21;
                                                        }
                                                    }
                                                    break Label_0953;
                                                }
                                                j = 0;
                                                if (j == 0) {
                                                    break Label_0958;
                                                }
                                                o = ((w1)o).Q().iterator();
                                                while (((Iterator)o).hasNext()) {
                                                    if (!this.g0(s, i, ((Iterator<A1>)o).next())) {
                                                        break Label_0777;
                                                    }
                                                }
                                                break Label_0958;
                                                this.u();
                                                this.n();
                                                A2.n.e(s);
                                                o = this.B();
                                                ((SQLiteDatabase)o).delete("property_filters", "app_id=? and audience_id=?", new String[] { s, String.valueOf(i) });
                                                ((SQLiteDatabase)o).delete("event_filters", "app_id=? and audience_id=?", new String[] { s, String.valueOf(i) });
                                            }
                                        }
                                        o = new ArrayList<A1>();
                                        o2 = ((List<w1>)value).iterator();
                                        while (((Iterator)o2).hasNext()) {
                                            value = ((Iterator<w1>)o2).next();
                                            if (!((w1)value).R()) {
                                                break Label_0728_Outer;
                                            }
                                            value = ((w1)value).k();
                                            ((List<A1>)o).add((A1)value);
                                        }
                                        this.z0(s, (List)o);
                                        b3.setTransactionSuccessful();
                                        b3.endTransaction();
                                        return;
                                        b3.endTransaction();
                                        throw s;
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                            }
                            j = 1;
                            continue Label_0777_Outer;
                        }
                        if (j == 0) {
                            continue Label_0777;
                        }
                        break;
                    }
                    continue Label_0728_Outer;
                }
                value = null;
                continue;
            }
        }
    }
    
    public final void a0(final List list) {
        this.n();
        this.u();
        A2.n.i(list);
        A2.n.k(list.size());
        if (!this.u0()) {
            return;
        }
        final String join = TextUtils.join((CharSequence)",", (Iterable)list);
        final StringBuilder sb = new StringBuilder("(");
        sb.append(join);
        sb.append(")");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        sb2.append(string);
        sb2.append(" AND retry_count =  2147483647 LIMIT 1");
        if (this.x0(sb2.toString(), null) > 0L) {
            this.j().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            final SQLiteDatabase b = this.B();
            final StringBuilder sb3 = new StringBuilder("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
            b.execSQL(sb3.toString());
        }
        catch (SQLiteException ex) {
            this.j().G().b("Error incrementing retry count. error", ex);
        }
    }
    
    public final boolean b0(final e e) {
        A2.n.i(e);
        this.n();
        this.u();
        final String o = e.o;
        A2.n.i(o);
        if (this.F0(o, e.q.p) == null && this.x0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { o }) >= 1000L) {
            return false;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", o);
        contentValues.put("origin", e.p);
        contentValues.put("name", e.q.p);
        V(contentValues, "value", A2.n.i(e.q.a()));
        contentValues.put("active", Boolean.valueOf(e.s));
        contentValues.put("trigger_event_name", e.t);
        contentValues.put("trigger_timeout", Long.valueOf(e.v));
        this.k();
        contentValues.put("timed_out_event", S5.p0((Parcelable)e.u));
        contentValues.put("creation_timestamp", Long.valueOf(e.r));
        this.k();
        contentValues.put("triggered_event", S5.p0((Parcelable)e.w));
        contentValues.put("triggered_timestamp", Long.valueOf(e.q.q));
        contentValues.put("time_to_live", Long.valueOf(e.x));
        this.k();
        contentValues.put("expired_event", S5.p0((Parcelable)e.y));
        try {
            if (this.B().insertWithOnConflict("conditional_properties", (String)null, contentValues, 5) == -1L) {
                this.j().G().b("Failed to insert/update conditional user property (got -1)", Y1.v(o));
            }
        }
        catch (SQLiteException ex) {
            this.j().G().c("Error storing conditional user property", Y1.v(o), ex);
        }
        return true;
    }
    
    public final boolean c0(final A a, final long n, final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final boolean d0(final T5 t5) {
        A2.n.i(t5);
        this.n();
        this.u();
        if (this.F0(t5.a, t5.c) == null) {
            if (S5.J0(t5.c)) {
                if (this.x0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { t5.a }) >= this.f().q(t5.a, K.I, 25, 100)) {
                    return false;
                }
            }
            else if (!"_npa".equals(t5.c) && this.x0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { t5.a, t5.b }) >= 25L) {
                return false;
            }
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t5.a);
        contentValues.put("origin", t5.b);
        contentValues.put("name", t5.c);
        contentValues.put("set_timestamp", Long.valueOf(t5.d));
        V(contentValues, "value", t5.e);
        try {
            if (this.B().insertWithOnConflict("user_attributes", (String)null, contentValues, 5) == -1L) {
                this.j().G().b("Failed to insert/update user property (got -1). appId", Y1.v(t5.a));
            }
        }
        catch (SQLiteException ex) {
            this.j().G().c("Error storing user property. appId", Y1.v(t5.a), ex);
        }
        return true;
    }
    
    public final boolean e0(final d2 d2, final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final boolean f0(final String s, final int n, final x1 x1) {
        this.u();
        this.n();
        n.e(s);
        n.i(x1);
        final boolean empty = x1.P().isEmpty();
        final Object o = null;
        if (empty) {
            final R2.a2 l = this.j().L();
            final Object v = Y1.v(s);
            Object value = o;
            if (x1.V()) {
                value = x1.L();
            }
            l.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", v, n, String.valueOf(value));
            return false;
        }
        final byte[] h = x1.h();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("audience_id", Integer.valueOf(n));
        Integer value2;
        if (x1.V()) {
            value2 = x1.L();
        }
        else {
            value2 = null;
        }
        contentValues.put("filter_id", value2);
        contentValues.put("event_name", x1.P());
        Boolean value3;
        if (x1.W()) {
            value3 = x1.T();
        }
        else {
            value3 = null;
        }
        contentValues.put("session_scoped", value3);
        contentValues.put("data", h);
        Label_0253: {
            try {
                if (this.B().insertWithOnConflict("event_filters", (String)null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert event filter (got -1). appId", Y1.v(s));
                }
            }
            catch (SQLiteException ex) {
                break Label_0253;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing event filter. appId", Y1.v(s), ex);
        return false;
    }
    
    public final boolean g0(final String s, final int n, final A1 a1) {
        this.u();
        this.n();
        n.e(s);
        n.i(a1);
        final boolean empty = a1.L().isEmpty();
        final Object o = null;
        if (empty) {
            final R2.a2 l = this.j().L();
            final Object v = Y1.v(s);
            Object value = o;
            if (a1.P()) {
                value = a1.k();
            }
            l.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", v, n, String.valueOf(value));
            return false;
        }
        final byte[] h = a1.h();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("audience_id", Integer.valueOf(n));
        Integer value2;
        if (a1.P()) {
            value2 = a1.k();
        }
        else {
            value2 = null;
        }
        contentValues.put("filter_id", value2);
        contentValues.put("property_name", a1.L());
        Boolean value3;
        if (a1.Q()) {
            value3 = a1.O();
        }
        else {
            value3 = null;
        }
        contentValues.put("session_scoped", value3);
        contentValues.put("data", h);
        Label_0252: {
            try {
                if (this.B().insertWithOnConflict("property_filters", (String)null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert property filter (got -1). appId", Y1.v(s));
                    return false;
                }
            }
            catch (SQLiteException ex) {
                break Label_0252;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing property filter. appId", Y1.v(s), ex);
        return false;
    }
    
    public final boolean h0(final String s, final v5 v5) {
        this.n();
        this.u();
        A2.n.i(v5);
        A2.n.e(s);
        final long a = this.b().a();
        if (v5.p < a - R2.g.M() || v5.p > R2.g.M() + a) {
            this.j().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", Y1.v(s), a, v5.p);
        }
        this.j().K().a("Saving trigger URI");
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("trigger_uri", v5.o);
        contentValues.put("source", Integer.valueOf(v5.q));
        contentValues.put("timestamp_millis", Long.valueOf(v5.p));
        Label_0200: {
            try {
                if (this.B().insert("trigger_uris", (String)null, contentValues) == -1L) {
                    this.j().G().b("Failed to insert trigger URI (got -1). appId", Y1.v(s));
                    return false;
                }
            }
            catch (SQLiteException ex) {
                break Label_0200;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing trigger URI. appId", Y1.v(s), ex);
        return false;
    }
    
    public final boolean i0(final String s, final Bundle bundle) {
        this.n();
        this.u();
        final byte[] h = this.o().F(new A(super.a, "", s, "dep", 0L, 0L, bundle)).h();
        this.j().K().c("Saving default event parameters, appId, data size", this.h().c(s), h.length);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("parameters", h);
        Label_0137: {
            try {
                if (this.B().insertWithOnConflict("default_event_params", (String)null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert default event parameters (got -1). appId", Y1.v(s));
                    return false;
                }
            }
            catch (SQLiteException ex) {
                break Label_0137;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing default event parameters. appId", Y1.v(s), ex);
        return false;
    }
    
    public final boolean j0(final String s, final Long n, final long l, final com.google.android.gms.internal.measurement.Y1 y1) {
        this.n();
        this.u();
        n.i(y1);
        n.e(s);
        n.i(n);
        final byte[] h = y1.h();
        this.j().K().c("Saving complex main event, appId, data size", this.h().c(s), h.length);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("event_id", n);
        contentValues.put("children_to_process", Long.valueOf(l));
        contentValues.put("main_event", h);
        Label_0153: {
            try {
                if (this.B().insertWithOnConflict("main_event_params", (String)null, contentValues, 5) == -1L) {
                    this.j().G().b("Failed to insert complex main event (got -1). appId", Y1.v(s));
                    return false;
                }
            }
            catch (SQLiteException ex) {
                break Label_0153;
            }
            return true;
        }
        final SQLiteException ex;
        this.j().G().c("Error storing complex main event. appId", Y1.v(s), ex);
        return false;
    }
    
    public final boolean u0() {
        return this.a().getDatabasePath("google_app_measurement.db").exists();
    }
    
    public final long v0(final String s) {
        A2.n.e(s);
        return this.G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { s }, 0L);
    }
    
    public final long w0(final String s, final String str) {
        A2.n.e(s);
        A2.n.e(str);
        this.n();
        this.u();
        final SQLiteDatabase b = this.B();
        b.beginTransaction();
        final long n = 0L;
        long g = 0L;
        Label_0296: {
            Label_0195: {
                try {
                    try {
                        final StringBuilder sb = new StringBuilder("select ");
                        sb.append(str);
                        sb.append(" from app2 where app_id=?");
                        if ((g = this.G(sb.toString(), new String[] { s }, -1L)) != -1L) {
                            break Label_0195;
                        }
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", s);
                        contentValues.put("first_open_count", Integer.valueOf(0));
                        contentValues.put("previous_install_count", Integer.valueOf(0));
                        if (b.insertWithOnConflict("app2", (String)null, contentValues, 5) == -1L) {
                            this.j().G().c("Failed to insert column (got -1). appId", Y1.v(s), str);
                            b.endTransaction();
                            return -1L;
                        }
                    }
                    finally {}
                }
                catch (SQLiteException ex) {
                    g = n;
                    break Label_0296;
                }
                g = 0L;
                try {
                    final ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", s);
                    contentValues2.put(str, Long.valueOf(1L + g));
                    if (b.update("app2", contentValues2, "app_id = ?", new String[] { s }) == 0L) {
                        this.j().G().c("Failed to update column (got 0). appId", Y1.v(s), str);
                        b.endTransaction();
                        return -1L;
                    }
                }
                catch (SQLiteException ex) {
                    break Label_0296;
                }
            }
            b.setTransactionSuccessful();
            b.endTransaction();
            return g;
        }
        final SQLiteException ex;
        this.j().G().d("Error inserting column. appId", Y1.v(s), str, ex);
        b.endTransaction();
        return g;
        b.endTransaction();
    }
    
    @Override
    public final boolean x() {
        return false;
    }
    
    public final long x0(final String s, String[] array) {
        final SQLiteDatabase b = this.B();
        Object rawQuery = null;
        try {
            try {
                final Cursor cursor;
                array = (String[])(Object)(cursor = (Cursor)(rawQuery = b.rawQuery(s, array)));
                if (((Cursor)(Object)array).moveToFirst()) {
                    rawQuery = array;
                    final long long1 = ((Cursor)(Object)array).getLong(0);
                    ((Cursor)(Object)array).close();
                    return long1;
                }
                throw new SQLiteException("Database returned empty set");
            }
            finally {
                if (rawQuery != null) {
                    ((Cursor)rawQuery).close();
                }
                final SQLiteException ex;
                this.j().G().c("Database error", s, ex);
                throw ex;
            }
        }
        catch (SQLiteException ex2) {}
    }
    
    public final long y() {
        Cursor rawQuery = null;
        try {
            try {
                final Cursor cursor = rawQuery = this.B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[])null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                rawQuery = cursor;
                final long long1 = cursor.getLong(0);
                cursor.close();
                return long1;
            }
            finally {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                final Cursor cursor2;
                cursor2.close();
                return -1L;
            }
        }
        catch (SQLiteException ex) {}
    }
    
    public final List y0(final String p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_0        
        //     6: invokevirtual   R2/m3.n:()V
        //     9: aload_0        
        //    10: invokevirtual   R2/C5.u:()V
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: astore          16
        //    22: aconst_null    
        //    23: astore          12
        //    25: aconst_null    
        //    26: astore          15
        //    28: aconst_null    
        //    29: astore          11
        //    31: aload           12
        //    33: astore          13
        //    35: new             Ljava/util/ArrayList;
        //    38: dup            
        //    39: iconst_3       
        //    40: invokespecial   java/util/ArrayList.<init>:(I)V
        //    43: astore          18
        //    45: aload           12
        //    47: astore          13
        //    49: aload           18
        //    51: aload_1        
        //    52: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    57: pop            
        //    58: aload           12
        //    60: astore          13
        //    62: new             Ljava/lang/StringBuilder;
        //    65: dup            
        //    66: ldc_w           "app_id=?"
        //    69: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    72: astore          17
        //    74: aload           12
        //    76: astore          13
        //    78: aload_2        
        //    79: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    82: istore          7
        //    84: iload           7
        //    86: ifne            786
        //    89: aload_2        
        //    90: astore          11
        //    92: aload           12
        //    94: astore          13
        //    96: aload           15
        //    98: astore          14
        //   100: aload           11
        //   102: astore          10
        //   104: aload           18
        //   106: aload           11
        //   108: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   113: pop            
        //   114: aload           12
        //   116: astore          13
        //   118: aload           15
        //   120: astore          14
        //   122: aload           11
        //   124: astore          10
        //   126: aload           17
        //   128: ldc_w           " and origin=?"
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: pop            
        //   135: goto            138
        //   138: aload           12
        //   140: astore          13
        //   142: aload           15
        //   144: astore          14
        //   146: aload_2        
        //   147: astore          10
        //   149: aload_3        
        //   150: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   153: ifne            258
        //   156: aload           12
        //   158: astore          13
        //   160: aload           15
        //   162: astore          14
        //   164: aload_2        
        //   165: astore          10
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: astore          11
        //   176: aload           12
        //   178: astore          13
        //   180: aload           15
        //   182: astore          14
        //   184: aload_2        
        //   185: astore          10
        //   187: aload           11
        //   189: aload_3        
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: pop            
        //   194: aload           12
        //   196: astore          13
        //   198: aload           15
        //   200: astore          14
        //   202: aload_2        
        //   203: astore          10
        //   205: aload           11
        //   207: ldc_w           "*"
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   213: pop            
        //   214: aload           12
        //   216: astore          13
        //   218: aload           15
        //   220: astore          14
        //   222: aload_2        
        //   223: astore          10
        //   225: aload           18
        //   227: aload           11
        //   229: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   232: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   237: pop            
        //   238: aload           12
        //   240: astore          13
        //   242: aload           15
        //   244: astore          14
        //   246: aload_2        
        //   247: astore          10
        //   249: aload           17
        //   251: ldc_w           " and name glob ?"
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload           12
        //   260: astore          13
        //   262: aload           15
        //   264: astore          14
        //   266: aload_2        
        //   267: astore          10
        //   269: aload           18
        //   271: aload           18
        //   273: invokeinterface java/util/List.size:()I
        //   278: anewarray       Ljava/lang/String;
        //   281: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   286: checkcast       [Ljava/lang/String;
        //   289: astore          11
        //   291: aload           12
        //   293: astore          13
        //   295: aload           15
        //   297: astore          14
        //   299: aload_2        
        //   300: astore          10
        //   302: aload_0        
        //   303: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //   306: astore          18
        //   308: iconst_0       
        //   309: istore          6
        //   311: iconst_1       
        //   312: istore          4
        //   314: iconst_2       
        //   315: istore          5
        //   317: aload           12
        //   319: astore          13
        //   321: aload           15
        //   323: astore          14
        //   325: aload_2        
        //   326: astore          10
        //   328: aload           17
        //   330: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   333: astore          17
        //   335: aload           12
        //   337: astore          13
        //   339: aload           15
        //   341: astore          14
        //   343: aload_2        
        //   344: astore          10
        //   346: aload           18
        //   348: ldc_w           "user_attributes"
        //   351: iconst_4       
        //   352: anewarray       Ljava/lang/String;
        //   355: dup            
        //   356: iconst_0       
        //   357: ldc_w           "name"
        //   360: aastore        
        //   361: dup            
        //   362: iconst_1       
        //   363: ldc_w           "set_timestamp"
        //   366: aastore        
        //   367: dup            
        //   368: iconst_2       
        //   369: ldc_w           "value"
        //   372: aastore        
        //   373: dup            
        //   374: iconst_3       
        //   375: ldc             "origin"
        //   377: aastore        
        //   378: aload           17
        //   380: aload           11
        //   382: aconst_null    
        //   383: aconst_null    
        //   384: ldc_w           "rowid"
        //   387: ldc_w           "1001"
        //   390: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   393: astore          11
        //   395: aload           11
        //   397: astore          13
        //   399: aload           11
        //   401: astore          14
        //   403: aload_2        
        //   404: astore          10
        //   406: aload           11
        //   408: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   413: istore          7
        //   415: aload_2        
        //   416: astore          12
        //   418: iload           7
        //   420: ifne            433
        //   423: aload           11
        //   425: invokeinterface android/database/Cursor.close:()V
        //   430: aload           16
        //   432: areturn        
        //   433: aload           11
        //   435: astore          13
        //   437: aload           11
        //   439: astore          14
        //   441: aload           12
        //   443: astore          10
        //   445: aload           16
        //   447: invokeinterface java/util/List.size:()I
        //   452: sipush          1000
        //   455: if_icmplt       492
        //   458: aload           11
        //   460: astore          13
        //   462: aload           11
        //   464: astore          14
        //   466: aload           12
        //   468: astore          10
        //   470: aload_0        
        //   471: invokevirtual   R2/m3.j:()LR2/Y1;
        //   474: invokevirtual   R2/Y1.G:()LR2/a2;
        //   477: ldc_w           "Read more than the max allowed user properties, ignoring excess"
        //   480: sipush          1000
        //   483: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   486: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   489: goto            655
        //   492: aload           11
        //   494: astore          13
        //   496: aload           11
        //   498: astore          14
        //   500: aload           12
        //   502: astore          10
        //   504: aload           11
        //   506: iload           6
        //   508: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   513: astore          15
        //   515: aload           11
        //   517: astore          13
        //   519: aload           11
        //   521: astore          14
        //   523: aload           12
        //   525: astore          10
        //   527: aload           11
        //   529: iload           4
        //   531: invokeinterface android/database/Cursor.getLong:(I)J
        //   536: lstore          8
        //   538: aload           11
        //   540: astore          10
        //   542: aload_0        
        //   543: aload           11
        //   545: iload           5
        //   547: invokevirtual   R2/p.M:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   550: astore          13
        //   552: aload           11
        //   554: astore          10
        //   556: aload           11
        //   558: iconst_3       
        //   559: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   564: astore_2       
        //   565: aload           13
        //   567: ifnonnull       610
        //   570: aload           11
        //   572: astore          10
        //   574: aload_0        
        //   575: invokevirtual   R2/m3.j:()LR2/Y1;
        //   578: invokevirtual   R2/Y1.G:()LR2/a2;
        //   581: ldc_w           "(2)Read invalid user property value, ignoring it"
        //   584: aload_1        
        //   585: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   588: aload_2        
        //   589: aload_3        
        //   590: invokevirtual   R2/a2.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   593: goto            637
        //   596: astore_1       
        //   597: goto            753
        //   600: astore          10
        //   602: aload_2        
        //   603: astore_3       
        //   604: aload           10
        //   606: astore_2       
        //   607: goto            708
        //   610: aload           11
        //   612: astore          10
        //   614: aload           16
        //   616: new             LR2/T5;
        //   619: dup            
        //   620: aload_1        
        //   621: aload_2        
        //   622: aload           15
        //   624: lload           8
        //   626: aload           13
        //   628: invokespecial   R2/T5.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
        //   631: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   636: pop            
        //   637: aload           11
        //   639: astore          10
        //   641: aload           11
        //   643: invokeinterface android/database/Cursor.moveToNext:()Z
        //   648: istore          7
        //   650: iload           7
        //   652: ifne            665
        //   655: aload           11
        //   657: invokeinterface android/database/Cursor.close:()V
        //   662: aload           16
        //   664: areturn        
        //   665: aload_2        
        //   666: astore          12
        //   668: goto            433
        //   671: astore          10
        //   673: aload_2        
        //   674: astore_3       
        //   675: aload           10
        //   677: astore_2       
        //   678: goto            708
        //   681: astore_1       
        //   682: goto            673
        //   685: astore_2       
        //   686: aload           12
        //   688: astore_3       
        //   689: goto            708
        //   692: astore_3       
        //   693: aload_2        
        //   694: astore          10
        //   696: aload_3        
        //   697: astore_2       
        //   698: aload           10
        //   700: astore_3       
        //   701: goto            708
        //   704: astore_3       
        //   705: goto            693
        //   708: aload           11
        //   710: astore          10
        //   712: aload_0        
        //   713: invokevirtual   R2/m3.j:()LR2/Y1;
        //   716: invokevirtual   R2/Y1.G:()LR2/a2;
        //   719: ldc_w           "(2)Error querying user properties"
        //   722: aload_1        
        //   723: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   726: aload_3        
        //   727: aload_2        
        //   728: invokevirtual   R2/a2.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   731: aload           11
        //   733: astore          10
        //   735: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   738: astore_1       
        //   739: aload           11
        //   741: ifnull          751
        //   744: aload           11
        //   746: invokeinterface android/database/Cursor.close:()V
        //   751: aload_1        
        //   752: areturn        
        //   753: aload           10
        //   755: ifnull          765
        //   758: aload           10
        //   760: invokeinterface android/database/Cursor.close:()V
        //   765: aload_1        
        //   766: athrow         
        //   767: astore_1       
        //   768: aload           13
        //   770: astore          10
        //   772: goto            753
        //   775: astore_2       
        //   776: aload           14
        //   778: astore          11
        //   780: aload           10
        //   782: astore_3       
        //   783: goto            708
        //   786: goto            138
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  35     45     704    708    Landroid/database/sqlite/SQLiteException;
        //  35     45     767    775    Any
        //  49     58     692    693    Landroid/database/sqlite/SQLiteException;
        //  49     58     767    775    Any
        //  62     74     692    693    Landroid/database/sqlite/SQLiteException;
        //  62     74     767    775    Any
        //  78     84     692    693    Landroid/database/sqlite/SQLiteException;
        //  78     84     767    775    Any
        //  104    114    775    786    Landroid/database/sqlite/SQLiteException;
        //  104    114    767    775    Any
        //  126    135    775    786    Landroid/database/sqlite/SQLiteException;
        //  126    135    767    775    Any
        //  149    156    775    786    Landroid/database/sqlite/SQLiteException;
        //  149    156    767    775    Any
        //  167    176    775    786    Landroid/database/sqlite/SQLiteException;
        //  167    176    767    775    Any
        //  187    194    775    786    Landroid/database/sqlite/SQLiteException;
        //  187    194    767    775    Any
        //  205    214    775    786    Landroid/database/sqlite/SQLiteException;
        //  205    214    767    775    Any
        //  225    238    775    786    Landroid/database/sqlite/SQLiteException;
        //  225    238    767    775    Any
        //  249    258    775    786    Landroid/database/sqlite/SQLiteException;
        //  249    258    767    775    Any
        //  269    291    775    786    Landroid/database/sqlite/SQLiteException;
        //  269    291    767    775    Any
        //  302    308    775    786    Landroid/database/sqlite/SQLiteException;
        //  302    308    767    775    Any
        //  328    335    775    786    Landroid/database/sqlite/SQLiteException;
        //  328    335    767    775    Any
        //  346    395    775    786    Landroid/database/sqlite/SQLiteException;
        //  346    395    767    775    Any
        //  406    415    775    786    Landroid/database/sqlite/SQLiteException;
        //  406    415    767    775    Any
        //  445    458    775    786    Landroid/database/sqlite/SQLiteException;
        //  445    458    767    775    Any
        //  470    489    775    786    Landroid/database/sqlite/SQLiteException;
        //  470    489    767    775    Any
        //  504    515    775    786    Landroid/database/sqlite/SQLiteException;
        //  504    515    767    775    Any
        //  527    538    775    786    Landroid/database/sqlite/SQLiteException;
        //  527    538    767    775    Any
        //  542    552    685    692    Landroid/database/sqlite/SQLiteException;
        //  542    552    596    600    Any
        //  556    565    685    692    Landroid/database/sqlite/SQLiteException;
        //  556    565    596    600    Any
        //  574    593    600    610    Landroid/database/sqlite/SQLiteException;
        //  574    593    596    600    Any
        //  614    637    671    681    Landroid/database/sqlite/SQLiteException;
        //  614    637    596    600    Any
        //  641    650    671    681    Landroid/database/sqlite/SQLiteException;
        //  641    650    596    600    Any
        //  712    731    596    600    Any
        //  735    739    596    600    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final long z() {
        return this.G("select max(bundle_end_timestamp) from queue", null, 0L);
    }
    
    public final boolean z0(final String s, final List list) {
        A2.n.e(s);
        this.u();
        this.n();
        final SQLiteDatabase b = this.B();
        try {
            final long x0 = this.x0("select count(1) from audience_filter_values where app_id=?", new String[] { s });
            final int max = Math.max(0, Math.min(2000, this.f().u(s, K.H)));
            if (x0 <= max) {
                return false;
            }
            final ArrayList<String> list2 = new ArrayList<String>();
            for (int i = 0; i < list.size(); ++i) {
                final Integer n = list.get(i);
                if (n == null) {
                    return false;
                }
                list2.add(Integer.toString(n));
            }
            final String join = TextUtils.join((CharSequence)",", (Iterable)list2);
            final StringBuilder sb = new StringBuilder("(");
            sb.append(join);
            sb.append(")");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(string);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return b.delete("audience_filter_values", sb2.toString(), new String[] { s, Integer.toString(max) }) > 0;
        }
        catch (SQLiteException ex) {
            this.j().G().c("Database error querying filters. appId", Y1.v(s), ex);
            return false;
        }
    }
}
