package e7;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.internal.measurement.zzfw.zzb;
import com.google.android.gms.internal.measurement.zzfw.zze;
import com.google.android.gms.internal.measurement.zzgf.zzf;
import com.google.android.gms.internal.measurement.zzgf.zzj;
import com.google.android.gms.internal.measurement.zzgf.zzj.zzb;
import com.google.android.gms.internal.measurement.zzgf.zzk;
import com.google.android.gms.internal.measurement.zzgf.zzk.zza;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg.zza;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoy;
import d2.q;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import pb.c;

public final class o
  extends h6
{
  public static final String[] o = { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;" };
  public static final String[] p = { "associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;" };
  public static final String[] q = { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
  public static final String[] r = { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;" };
  public static final String[] s = { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
  public static final String[] t = { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
  public static final String[] u = { "session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;" };
  public static final String[] v = { "session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;" };
  public static final String[] w = { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
  public static final String[] x = { "consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;" };
  public static final String[] y = { "idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);" };
  public final t e = new t(this, zza());
  public final c f = new c(zzb());
  
  public o(i6 parami6)
  {
    super(parami6);
  }
  
  public static void G(ContentValues paramContentValues, Object paramObject)
  {
    m6.j.e("value");
    m6.j.i(paramObject);
    if ((paramObject instanceof String))
    {
      paramContentValues.put("value", (String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramContentValues.put("value", (Long)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramContentValues.put("value", (Double)paramObject);
      return;
    }
    throw new IllegalArgumentException("Invalid value type");
  }
  
  public final Object A(int paramInt, Cursor paramCursor)
  {
    int i = paramCursor.getType(paramInt);
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              zzjo.c("Loaded invalid unknown value type, ignoring it", Integer.valueOf(i));
              return null;
            }
            zzjo.b("Loaded invalid blob type value, ignoring it");
            return null;
          }
          return paramCursor.getString(paramInt);
        }
        return Double.valueOf(paramCursor.getDouble(paramInt));
      }
      return Long.valueOf(paramCursor.getLong(paramInt));
    }
    zzjo.b("Loaded invalid null value from database");
    return null;
  }
  
  public final void A0()
  {
    p();
    s().endTransaction();
  }
  
  /* Error */
  public final String B(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 5
    //   11: aload_3
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual 439	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   17: astore_2
    //   18: aload_2
    //   19: astore 5
    //   21: aload_2
    //   22: astore 4
    //   24: aload_2
    //   25: invokeinterface 443 1 0
    //   30: ifeq +25 -> 55
    //   33: aload_2
    //   34: astore 5
    //   36: aload_2
    //   37: astore 4
    //   39: aload_2
    //   40: iconst_0
    //   41: invokeinterface 404 2 0
    //   46: astore_3
    //   47: aload_2
    //   48: invokeinterface 446 1 0
    //   53: aload_3
    //   54: areturn
    //   55: aload_2
    //   56: invokeinterface 446 1 0
    //   61: ldc_w 448
    //   64: areturn
    //   65: astore_1
    //   66: goto +29 -> 95
    //   69: astore_2
    //   70: aload 4
    //   72: astore 5
    //   74: aload_0
    //   75: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   78: getfield 381	e7/a1:o	Le7/b1;
    //   81: ldc_w 450
    //   84: aload_1
    //   85: aload_2
    //   86: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   89: aload 4
    //   91: astore 5
    //   93: aload_2
    //   94: athrow
    //   95: aload 5
    //   97: ifnull +10 -> 107
    //   100: aload 5
    //   102: invokeinterface 446 1 0
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	o
    //   0	109	1	paramString	String
    //   0	109	2	paramArrayOfString	String[]
    //   4	50	3	localObject	Object
    //   6	84	4	arrayOfString1	String[]
    //   9	92	5	arrayOfString2	String[]
    // Exception table:
    //   from	to	target	type
    //   11	18	65	finally
    //   24	33	65	finally
    //   39	47	65	finally
    //   74	89	65	finally
    //   93	95	65	finally
    //   11	18	69	android/database/sqlite/SQLiteException
    //   24	33	69	android/database/sqlite/SQLiteException
    //   39	47	69	android/database/sqlite/SQLiteException
  }
  
  public final void B0()
  {
    l();
    p();
    if (!Y()) {
      return;
    }
    long l1 = c.q.f.a();
    ((z)zzb()).getClass();
    long l2 = SystemClock.elapsedRealtime();
    if (Math.abs(l2 - l1) > ((Long)h0.I.a(null)).longValue())
    {
      c.q.f.b(l2);
      l();
      p();
      if (Y())
      {
        SQLiteDatabase localSQLiteDatabase = s();
        ((z)zzb()).getClass();
        int i = localSQLiteDatabase.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(System.currentTimeMillis()), String.valueOf(h.z()) });
        if (i > 0) {
          zzjw.c("Deleted stale rows. rowsDeleted", Integer.valueOf(i));
        }
      }
    }
  }
  
  /* Error */
  public final List<n6> C(String paramString, d6 paramd6, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 549	d2/q:h	()Le7/h;
    //   4: astore 4
    //   6: getstatic 552	e7/h0:K0	Le7/m0;
    //   9: astore 5
    //   11: aconst_null
    //   12: astore 6
    //   14: aconst_null
    //   15: astore 7
    //   17: aload 4
    //   19: aconst_null
    //   20: aload 5
    //   22: invokevirtual 555	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   25: ifne +7 -> 32
    //   28: invokestatic 561	java/util/Collections:emptyList	()Ljava/util/List;
    //   31: areturn
    //   32: aload_1
    //   33: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   36: aload_0
    //   37: invokevirtual 458	d2/q:l	()V
    //   40: aload_0
    //   41: invokevirtual 423	e7/h6:p	()V
    //   44: aload 7
    //   46: astore 5
    //   48: aload_0
    //   49: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   52: astore 4
    //   54: aload 7
    //   56: astore 5
    //   58: aload_2
    //   59: getfield 566	e7/d6:a	Ljava/util/List;
    //   62: astore_2
    //   63: aload 7
    //   65: astore 5
    //   67: aload_2
    //   68: invokeinterface 571 1 0
    //   73: ifeq +18 -> 91
    //   76: ldc_w 448
    //   79: astore_2
    //   80: goto +36 -> 116
    //   83: astore 7
    //   85: aload 6
    //   87: astore_2
    //   88: goto +452 -> 540
    //   91: aload 7
    //   93: astore 5
    //   95: ldc_w 573
    //   98: iconst_1
    //   99: anewarray 486	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: ldc_w 575
    //   107: aload_2
    //   108: invokestatic 581	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   111: aastore
    //   112: invokestatic 585	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   115: astore_2
    //   116: aload 7
    //   118: astore 5
    //   120: aload_0
    //   121: invokevirtual 589	e7/o:Z	()Ljava/lang/String;
    //   124: astore 8
    //   126: aload 7
    //   128: astore 5
    //   130: new 591	java/lang/StringBuilder
    //   133: astore 9
    //   135: aload 7
    //   137: astore 5
    //   139: aload 9
    //   141: ldc_w 593
    //   144: invokespecial 594	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   147: aload 7
    //   149: astore 5
    //   151: aload 9
    //   153: aload_2
    //   154: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload 7
    //   160: astore 5
    //   162: aload 9
    //   164: ldc_w 600
    //   167: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload 7
    //   173: astore 5
    //   175: aload 9
    //   177: aload 8
    //   179: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload 7
    //   185: astore 5
    //   187: aload 9
    //   189: invokevirtual 603	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: astore 9
    //   194: iload_3
    //   195: ifle +15 -> 210
    //   198: aload 7
    //   200: astore 5
    //   202: iload_3
    //   203: invokestatic 605	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   206: astore_2
    //   207: goto +5 -> 212
    //   210: aconst_null
    //   211: astore_2
    //   212: aload 7
    //   214: astore 5
    //   216: aload 4
    //   218: ldc_w 607
    //   221: bipush 9
    //   223: anewarray 24	java/lang/String
    //   226: dup
    //   227: iconst_0
    //   228: ldc_w 609
    //   231: aastore
    //   232: dup
    //   233: iconst_1
    //   234: ldc_w 611
    //   237: aastore
    //   238: dup
    //   239: iconst_2
    //   240: ldc_w 613
    //   243: aastore
    //   244: dup
    //   245: iconst_3
    //   246: ldc_w 615
    //   249: aastore
    //   250: dup
    //   251: iconst_4
    //   252: ldc_w 617
    //   255: aastore
    //   256: dup
    //   257: iconst_5
    //   258: ldc_w 619
    //   261: aastore
    //   262: dup
    //   263: bipush 6
    //   265: ldc_w 260
    //   268: aastore
    //   269: dup
    //   270: bipush 7
    //   272: ldc_w 621
    //   275: aastore
    //   276: dup
    //   277: bipush 8
    //   279: ldc 52
    //   281: aastore
    //   282: aload 9
    //   284: iconst_1
    //   285: anewarray 24	java/lang/String
    //   288: dup
    //   289: iconst_0
    //   290: aload_1
    //   291: aastore
    //   292: aconst_null
    //   293: aconst_null
    //   294: ldc_w 623
    //   297: aload_2
    //   298: invokevirtual 627	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   301: astore_2
    //   302: aload_2
    //   303: astore 5
    //   305: aload_2
    //   306: astore 7
    //   308: new 629	java/util/ArrayList
    //   311: astore 6
    //   313: aload_2
    //   314: astore 5
    //   316: aload_2
    //   317: astore 7
    //   319: aload 6
    //   321: invokespecial 631	java/util/ArrayList:<init>	()V
    //   324: aload_2
    //   325: astore 5
    //   327: aload_2
    //   328: astore 7
    //   330: aload_2
    //   331: invokeinterface 634 1 0
    //   336: ifeq +172 -> 508
    //   339: aload_2
    //   340: astore 5
    //   342: aload_2
    //   343: astore 7
    //   345: aload_2
    //   346: iconst_0
    //   347: invokeinterface 415 2 0
    //   352: lstore 10
    //   354: aload_2
    //   355: astore 5
    //   357: aload_2
    //   358: astore 7
    //   360: aload_2
    //   361: iconst_2
    //   362: invokeinterface 638 2 0
    //   367: astore 8
    //   369: aload_2
    //   370: astore 5
    //   372: aload_2
    //   373: astore 7
    //   375: aload_2
    //   376: iconst_3
    //   377: invokeinterface 404 2 0
    //   382: astore 9
    //   384: aload_2
    //   385: astore 5
    //   387: aload_2
    //   388: astore 7
    //   390: aload_2
    //   391: iconst_4
    //   392: invokeinterface 404 2 0
    //   397: astore 4
    //   399: aload_2
    //   400: astore 5
    //   402: aload_2
    //   403: astore 7
    //   405: aload_2
    //   406: iconst_5
    //   407: invokeinterface 641 2 0
    //   412: istore 12
    //   414: aload_2
    //   415: astore 5
    //   417: aload_2
    //   418: astore 7
    //   420: aload_2
    //   421: bipush 6
    //   423: invokeinterface 641 2 0
    //   428: istore_3
    //   429: aload_2
    //   430: astore 5
    //   432: aload_2
    //   433: astore 7
    //   435: aload_2
    //   436: bipush 7
    //   438: invokeinterface 415 2 0
    //   443: lstore 13
    //   445: aload_2
    //   446: astore 5
    //   448: aload_2
    //   449: astore 7
    //   451: aload_2
    //   452: bipush 8
    //   454: invokeinterface 415 2 0
    //   459: lstore 15
    //   461: aload_0
    //   462: aload_1
    //   463: lload 10
    //   465: aload 8
    //   467: aload 9
    //   469: aload 4
    //   471: iload 12
    //   473: iload_3
    //   474: lload 13
    //   476: lload 15
    //   478: invokevirtual 644	e7/o:z	(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJ)Le7/n6;
    //   481: astore 5
    //   483: aload 5
    //   485: ifnull +11 -> 496
    //   488: aload 6
    //   490: aload 5
    //   492: invokevirtual 648	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   495: pop
    //   496: goto -172 -> 324
    //   499: astore_1
    //   500: goto +21 -> 521
    //   503: astore 5
    //   505: goto +24 -> 529
    //   508: aload_2
    //   509: invokeinterface 446 1 0
    //   514: aload 6
    //   516: areturn
    //   517: astore_1
    //   518: aload 5
    //   520: astore_2
    //   521: goto +60 -> 581
    //   524: astore 5
    //   526: aload 7
    //   528: astore_2
    //   529: aload 5
    //   531: astore 7
    //   533: goto +7 -> 540
    //   536: astore_1
    //   537: goto +41 -> 578
    //   540: aload_2
    //   541: astore 5
    //   543: aload_0
    //   544: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   547: getfield 381	e7/a1:o	Le7/b1;
    //   550: ldc_w 650
    //   553: aload_1
    //   554: aload 7
    //   556: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   559: aload_2
    //   560: astore 5
    //   562: invokestatic 561	java/util/Collections:emptyList	()Ljava/util/List;
    //   565: astore_1
    //   566: aload_2
    //   567: ifnull +9 -> 576
    //   570: aload_2
    //   571: invokeinterface 446 1 0
    //   576: aload_1
    //   577: areturn
    //   578: aload 5
    //   580: astore_2
    //   581: aload_2
    //   582: ifnull +9 -> 591
    //   585: aload_2
    //   586: invokeinterface 446 1 0
    //   591: aload_1
    //   592: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	593	0	this	o
    //   0	593	1	paramString	String
    //   0	593	2	paramd6	d6
    //   0	593	3	paramInt	int
    //   4	466	4	localObject1	Object
    //   9	482	5	localObject2	Object
    //   503	16	5	localSQLiteException1	SQLiteException
    //   524	6	5	localSQLiteException2	SQLiteException
    //   541	38	5	locald6	d6
    //   12	503	6	localArrayList	ArrayList
    //   15	49	7	localObject3	Object
    //   83	130	7	localSQLiteException3	SQLiteException
    //   306	249	7	localObject4	Object
    //   124	342	8	localObject5	Object
    //   133	335	9	localObject6	Object
    //   352	112	10	l1	long
    //   412	60	12	i	int
    //   443	32	13	l2	long
    //   459	18	15	l3	long
    // Exception table:
    //   from	to	target	type
    //   48	54	83	android/database/sqlite/SQLiteException
    //   58	63	83	android/database/sqlite/SQLiteException
    //   67	76	83	android/database/sqlite/SQLiteException
    //   95	116	83	android/database/sqlite/SQLiteException
    //   120	126	83	android/database/sqlite/SQLiteException
    //   130	135	83	android/database/sqlite/SQLiteException
    //   139	147	83	android/database/sqlite/SQLiteException
    //   151	158	83	android/database/sqlite/SQLiteException
    //   162	171	83	android/database/sqlite/SQLiteException
    //   175	183	83	android/database/sqlite/SQLiteException
    //   187	194	83	android/database/sqlite/SQLiteException
    //   202	207	83	android/database/sqlite/SQLiteException
    //   216	302	83	android/database/sqlite/SQLiteException
    //   461	483	499	finally
    //   488	496	499	finally
    //   461	483	503	android/database/sqlite/SQLiteException
    //   488	496	503	android/database/sqlite/SQLiteException
    //   308	313	517	finally
    //   319	324	517	finally
    //   330	339	517	finally
    //   345	354	517	finally
    //   360	369	517	finally
    //   375	384	517	finally
    //   390	399	517	finally
    //   405	414	517	finally
    //   420	429	517	finally
    //   435	445	517	finally
    //   451	461	517	finally
    //   308	313	524	android/database/sqlite/SQLiteException
    //   319	324	524	android/database/sqlite/SQLiteException
    //   330	339	524	android/database/sqlite/SQLiteException
    //   345	354	524	android/database/sqlite/SQLiteException
    //   360	369	524	android/database/sqlite/SQLiteException
    //   375	384	524	android/database/sqlite/SQLiteException
    //   390	399	524	android/database/sqlite/SQLiteException
    //   405	414	524	android/database/sqlite/SQLiteException
    //   420	429	524	android/database/sqlite/SQLiteException
    //   435	445	524	android/database/sqlite/SQLiteException
    //   451	461	524	android/database/sqlite/SQLiteException
    //   48	54	536	finally
    //   58	63	536	finally
    //   67	76	536	finally
    //   95	116	536	finally
    //   120	126	536	finally
    //   130	135	536	finally
    //   139	147	536	finally
    //   151	158	536	finally
    //   162	171	536	finally
    //   175	183	536	finally
    //   187	194	536	finally
    //   202	207	536	finally
    //   216	302	536	finally
    //   543	559	536	finally
    //   562	566	536	finally
  }
  
  public final void C0()
  {
    p();
    s().setTransactionSuccessful();
  }
  
  public final List<f> D(String paramString1, String paramString2, String paramString3)
  {
    m6.j.e(paramString1);
    l();
    p();
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramString1);
    paramString1 = new StringBuilder("app_id=?");
    if (!TextUtils.isEmpty(paramString2))
    {
      localArrayList.add(paramString2);
      paramString1.append(" and origin=?");
    }
    if (!TextUtils.isEmpty(paramString3))
    {
      paramString2 = new StringBuilder();
      paramString2.append(paramString3);
      paramString2.append("*");
      localArrayList.add(paramString2.toString());
      paramString1.append(" and name glob ?");
    }
    paramString2 = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    return E(paramString1.toString(), paramString2);
  }
  
  /* Error */
  public final List<f> E(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 458	d2/q:l	()V
    //   4: aload_0
    //   5: invokevirtual 423	e7/h6:p	()V
    //   8: new 629	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 631	java/util/ArrayList:<init>	()V
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_0
    //   23: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   26: ldc_w 687
    //   29: bipush 13
    //   31: anewarray 24	java/lang/String
    //   34: dup
    //   35: iconst_0
    //   36: ldc_w 611
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: ldc 58
    //   44: aastore
    //   45: dup
    //   46: iconst_2
    //   47: ldc_w 689
    //   50: aastore
    //   51: dup
    //   52: iconst_3
    //   53: ldc_w 333
    //   56: aastore
    //   57: dup
    //   58: iconst_4
    //   59: ldc_w 691
    //   62: aastore
    //   63: dup
    //   64: iconst_5
    //   65: ldc_w 693
    //   68: aastore
    //   69: dup
    //   70: bipush 6
    //   72: ldc_w 695
    //   75: aastore
    //   76: dup
    //   77: bipush 7
    //   79: ldc_w 697
    //   82: aastore
    //   83: dup
    //   84: bipush 8
    //   86: ldc_w 621
    //   89: aastore
    //   90: dup
    //   91: bipush 9
    //   93: ldc_w 699
    //   96: aastore
    //   97: dup
    //   98: bipush 10
    //   100: ldc_w 701
    //   103: aastore
    //   104: dup
    //   105: bipush 11
    //   107: ldc_w 703
    //   110: aastore
    //   111: dup
    //   112: bipush 12
    //   114: ldc_w 705
    //   117: aastore
    //   118: aload_1
    //   119: aload_2
    //   120: aconst_null
    //   121: aconst_null
    //   122: ldc_w 707
    //   125: ldc_w 709
    //   128: invokevirtual 627	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   131: astore_1
    //   132: aload_1
    //   133: astore 5
    //   135: aload_1
    //   136: astore 4
    //   138: aload_1
    //   139: invokeinterface 443 1 0
    //   144: istore 6
    //   146: iload 6
    //   148: ifne +11 -> 159
    //   151: aload_1
    //   152: invokeinterface 446 1 0
    //   157: aload_3
    //   158: areturn
    //   159: aload_1
    //   160: astore 5
    //   162: aload_1
    //   163: astore 4
    //   165: aload_3
    //   166: invokevirtual 675	java/util/ArrayList:size	()I
    //   169: sipush 1000
    //   172: if_icmplt +31 -> 203
    //   175: aload_1
    //   176: astore 5
    //   178: aload_1
    //   179: astore 4
    //   181: aload_0
    //   182: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   185: getfield 381	e7/a1:o	Le7/b1;
    //   188: ldc_w 711
    //   191: sipush 1000
    //   194: invokestatic 389	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   197: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   200: goto +382 -> 582
    //   203: iconst_0
    //   204: istore 6
    //   206: aload_1
    //   207: astore 5
    //   209: aload_1
    //   210: astore 4
    //   212: aload_1
    //   213: iconst_0
    //   214: invokeinterface 404 2 0
    //   219: astore_2
    //   220: aload_1
    //   221: astore 5
    //   223: aload_1
    //   224: astore 4
    //   226: aload_1
    //   227: iconst_1
    //   228: invokeinterface 404 2 0
    //   233: astore 7
    //   235: aload_1
    //   236: astore 5
    //   238: aload_1
    //   239: astore 4
    //   241: aload_1
    //   242: iconst_2
    //   243: invokeinterface 404 2 0
    //   248: astore 8
    //   250: aload_1
    //   251: astore 5
    //   253: aload_1
    //   254: astore 4
    //   256: aload_0
    //   257: iconst_3
    //   258: aload_1
    //   259: invokevirtual 713	e7/o:A	(ILandroid/database/Cursor;)Ljava/lang/Object;
    //   262: astore 9
    //   264: aload_1
    //   265: astore 5
    //   267: aload_1
    //   268: astore 4
    //   270: aload_1
    //   271: iconst_4
    //   272: invokeinterface 641 2 0
    //   277: ifeq +6 -> 283
    //   280: iconst_1
    //   281: istore 6
    //   283: aload_1
    //   284: astore 5
    //   286: aload_1
    //   287: astore 4
    //   289: aload_1
    //   290: iconst_5
    //   291: invokeinterface 404 2 0
    //   296: astore 10
    //   298: aload_1
    //   299: astore 5
    //   301: aload_1
    //   302: astore 4
    //   304: aload_1
    //   305: bipush 6
    //   307: invokeinterface 415 2 0
    //   312: lstore 11
    //   314: aload_1
    //   315: astore 5
    //   317: aload_1
    //   318: astore 4
    //   320: aload_0
    //   321: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   324: astore 13
    //   326: aload_1
    //   327: astore 5
    //   329: aload_1
    //   330: astore 4
    //   332: aload_1
    //   333: bipush 7
    //   335: invokeinterface 638 2 0
    //   340: astore 14
    //   342: aload_1
    //   343: astore 5
    //   345: aload_1
    //   346: astore 4
    //   348: getstatic 723	e7/f0:CREATOR	Landroid/os/Parcelable$Creator;
    //   351: astore 15
    //   353: aload_1
    //   354: astore 5
    //   356: aload_1
    //   357: astore 4
    //   359: aload 13
    //   361: aload 14
    //   363: aload 15
    //   365: invokevirtual 728	e7/o6:w	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   368: checkcast 719	e7/f0
    //   371: astore 14
    //   373: aload_1
    //   374: astore 5
    //   376: aload_1
    //   377: astore 4
    //   379: aload_1
    //   380: bipush 8
    //   382: invokeinterface 415 2 0
    //   387: lstore 16
    //   389: aload_1
    //   390: astore 5
    //   392: aload_1
    //   393: astore 4
    //   395: aload_0
    //   396: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   399: aload_1
    //   400: bipush 9
    //   402: invokeinterface 638 2 0
    //   407: aload 15
    //   409: invokevirtual 728	e7/o6:w	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   412: checkcast 719	e7/f0
    //   415: astore 13
    //   417: aload_1
    //   418: astore 5
    //   420: aload_1
    //   421: astore 4
    //   423: aload_1
    //   424: bipush 10
    //   426: invokeinterface 415 2 0
    //   431: lstore 18
    //   433: aload_1
    //   434: astore 5
    //   436: aload_1
    //   437: astore 4
    //   439: aload_1
    //   440: bipush 11
    //   442: invokeinterface 415 2 0
    //   447: lstore 20
    //   449: aload_1
    //   450: astore 5
    //   452: aload_1
    //   453: astore 4
    //   455: aload_0
    //   456: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   459: aload_1
    //   460: bipush 12
    //   462: invokeinterface 638 2 0
    //   467: aload 15
    //   469: invokevirtual 728	e7/o6:w	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   472: checkcast 719	e7/f0
    //   475: astore 15
    //   477: aload_1
    //   478: astore 5
    //   480: aload_1
    //   481: astore 4
    //   483: new 730	e7/q6
    //   486: astore 22
    //   488: aload_1
    //   489: astore 5
    //   491: aload_1
    //   492: astore 4
    //   494: aload 22
    //   496: aload 8
    //   498: aload 7
    //   500: lload 18
    //   502: aload 9
    //   504: invokespecial 733	e7/q6:<init>	(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   507: aload_1
    //   508: astore 5
    //   510: aload_1
    //   511: astore 4
    //   513: new 735	e7/f
    //   516: astore 8
    //   518: aload_1
    //   519: astore 5
    //   521: aload_1
    //   522: astore 4
    //   524: aload 8
    //   526: aload_2
    //   527: aload 7
    //   529: aload 22
    //   531: lload 16
    //   533: iload 6
    //   535: aload 10
    //   537: aload 14
    //   539: lload 11
    //   541: aload 13
    //   543: lload 20
    //   545: aload 15
    //   547: invokespecial 738	e7/f:<init>	(Ljava/lang/String;Ljava/lang/String;Le7/q6;JZLjava/lang/String;Le7/f0;JLe7/f0;JLe7/f0;)V
    //   550: aload_1
    //   551: astore 5
    //   553: aload_1
    //   554: astore 4
    //   556: aload_3
    //   557: aload 8
    //   559: invokevirtual 648	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   562: pop
    //   563: aload_1
    //   564: astore 5
    //   566: aload_1
    //   567: astore 4
    //   569: aload_1
    //   570: invokeinterface 634 1 0
    //   575: istore 6
    //   577: iload 6
    //   579: ifne -420 -> 159
    //   582: aload_1
    //   583: invokeinterface 446 1 0
    //   588: aload_3
    //   589: areturn
    //   590: astore_1
    //   591: goto +44 -> 635
    //   594: astore_1
    //   595: aload 4
    //   597: astore 5
    //   599: aload_0
    //   600: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   603: getfield 381	e7/a1:o	Le7/b1;
    //   606: ldc_w 740
    //   609: aload_1
    //   610: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   613: aload 4
    //   615: astore 5
    //   617: invokestatic 561	java/util/Collections:emptyList	()Ljava/util/List;
    //   620: astore_1
    //   621: aload 4
    //   623: ifnull +10 -> 633
    //   626: aload 4
    //   628: invokeinterface 446 1 0
    //   633: aload_1
    //   634: areturn
    //   635: aload 5
    //   637: ifnull +10 -> 647
    //   640: aload 5
    //   642: invokeinterface 446 1 0
    //   647: aload_1
    //   648: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	649	0	this	o
    //   0	649	1	paramString	String
    //   0	649	2	paramArrayOfString	String[]
    //   15	574	3	localArrayList	ArrayList
    //   17	610	4	str1	String
    //   20	621	5	str2	String
    //   144	434	6	bool	boolean
    //   233	295	7	str3	String
    //   248	310	8	localObject1	Object
    //   262	241	9	localObject2	Object
    //   296	240	10	str4	String
    //   312	228	11	l1	long
    //   324	218	13	localObject3	Object
    //   340	198	14	localObject4	Object
    //   351	195	15	localObject5	Object
    //   387	145	16	l2	long
    //   431	70	18	l3	long
    //   447	97	20	l4	long
    //   486	44	22	localq6	q6
    // Exception table:
    //   from	to	target	type
    //   22	132	590	finally
    //   138	146	590	finally
    //   165	175	590	finally
    //   181	200	590	finally
    //   212	220	590	finally
    //   226	235	590	finally
    //   241	250	590	finally
    //   256	264	590	finally
    //   270	280	590	finally
    //   289	298	590	finally
    //   304	314	590	finally
    //   320	326	590	finally
    //   332	342	590	finally
    //   348	353	590	finally
    //   359	373	590	finally
    //   379	389	590	finally
    //   395	417	590	finally
    //   423	433	590	finally
    //   439	449	590	finally
    //   455	477	590	finally
    //   483	488	590	finally
    //   494	507	590	finally
    //   513	518	590	finally
    //   524	550	590	finally
    //   556	563	590	finally
    //   569	577	590	finally
    //   599	613	590	finally
    //   617	621	590	finally
    //   22	132	594	android/database/sqlite/SQLiteException
    //   138	146	594	android/database/sqlite/SQLiteException
    //   165	175	594	android/database/sqlite/SQLiteException
    //   181	200	594	android/database/sqlite/SQLiteException
    //   212	220	594	android/database/sqlite/SQLiteException
    //   226	235	594	android/database/sqlite/SQLiteException
    //   241	250	594	android/database/sqlite/SQLiteException
    //   256	264	594	android/database/sqlite/SQLiteException
    //   270	280	594	android/database/sqlite/SQLiteException
    //   289	298	594	android/database/sqlite/SQLiteException
    //   304	314	594	android/database/sqlite/SQLiteException
    //   320	326	594	android/database/sqlite/SQLiteException
    //   332	342	594	android/database/sqlite/SQLiteException
    //   348	353	594	android/database/sqlite/SQLiteException
    //   359	373	594	android/database/sqlite/SQLiteException
    //   379	389	594	android/database/sqlite/SQLiteException
    //   395	417	594	android/database/sqlite/SQLiteException
    //   423	433	594	android/database/sqlite/SQLiteException
    //   439	449	594	android/database/sqlite/SQLiteException
    //   455	477	594	android/database/sqlite/SQLiteException
    //   483	488	594	android/database/sqlite/SQLiteException
    //   494	507	594	android/database/sqlite/SQLiteException
    //   513	518	594	android/database/sqlite/SQLiteException
    //   524	550	594	android/database/sqlite/SQLiteException
    //   556	563	594	android/database/sqlite/SQLiteException
    //   569	577	594	android/database/sqlite/SQLiteException
  }
  
  public final void F(ContentValues paramContentValues)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = s();
      String str = paramContentValues.getAsString("app_id");
      if (str == null)
      {
        zzjq.c("Value of the primary key is not set.", a1.p("app_id"));
        return;
      }
      if ((localSQLiteDatabase.update("consent_settings", paramContentValues, "app_id = ?", new String[] { str }) == 0L) && (localSQLiteDatabase.insertWithOnConflict("consent_settings", null, paramContentValues, 5) == -1L)) {
        zzjo.d("Failed to insert/update table (got -1). key", a1.p("consent_settings"), a1.p("app_id"));
      }
      return;
    }
    catch (SQLiteException paramContentValues)
    {
      zzjo.a(a1.p("consent_settings"), a1.p("app_id"), paramContentValues, "Error storing into table. key");
    }
  }
  
  public final void H(zzgf.zzk paramzzk, boolean paramBoolean)
  {
    l();
    p();
    m6.j.i(paramzzk);
    m6.j.e(paramzzk.zzab());
    if (paramzzk.zzbm())
    {
      B0();
      ((z)zzb()).getClass();
      long l = System.currentTimeMillis();
      if ((paramzzk.zzn() < l - h.z()) || (paramzzk.zzn() > h.z() + l)) {
        zzjr.a(a1.p(paramzzk.zzab()), Long.valueOf(l), Long.valueOf(paramzzk.zzn()), "Storing bundle outside of the max uploading time span. appId, now, timestamp");
      }
      byte[] arrayOfByte = paramzzk.zzce();
      try
      {
        arrayOfByte = m().V(arrayOfByte);
        zzjw.c("Saving bundle, size", Integer.valueOf(arrayOfByte.length));
        Object localObject1 = new ContentValues();
        ((ContentValues)localObject1).put("app_id", paramzzk.zzab());
        ((ContentValues)localObject1).put("bundle_end_timestamp", Long.valueOf(paramzzk.zzn()));
        ((ContentValues)localObject1).put("data", arrayOfByte);
        ((ContentValues)localObject1).put("has_realtime", Integer.valueOf(paramBoolean));
        if (paramzzk.zzbt()) {
          ((ContentValues)localObject1).put("retry_count", Integer.valueOf(paramzzk.zzg()));
        }
        Object localObject2;
        Object localObject3;
        try
        {
          if (s().insert("queue", null, (ContentValues)localObject1) == -1L) {
            zzjo.c("Failed to insert bundle (got -1). appId", a1.p(paramzzk.zzab()));
          }
          return;
        }
        catch (SQLiteException localSQLiteException)
        {
          localObject2 = zzjo;
          localObject1 = a1.p(paramzzk.zzab());
          localObject3 = "Error storing bundle. appId";
          paramzzk = (zzgf.zzk)localObject2;
          localObject2 = localObject3;
        }
        paramzzk.d((String)localObject2, localObject1, localIOException);
      }
      catch (IOException localIOException)
      {
        localObject3 = zzjo;
        localObject1 = a1.p(paramzzk.zzab());
        localObject2 = "Data loss. Failed to serialize bundle. appId";
        paramzzk = (zzgf.zzk)localObject3;
      }
      return;
    }
    throw new IllegalStateException();
  }
  
  public final void I(b0 paramb0)
  {
    L("events", paramb0);
  }
  
  public final void J(k1 paramk1, boolean paramBoolean)
  {
    Object localObject = e3.a.c;
    l();
    p();
    String str = paramk1.f();
    m6.j.i(str);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", str);
    if (paramBoolean) {
      localContentValues.put("app_instance_id", null);
    } else if (c.H(str).j((e3.a)localObject)) {
      localContentValues.put("app_instance_id", paramk1.g());
    }
    localContentValues.put("gmp_app_id", paramk1.j());
    if (c.H(str).j(e3.a.b))
    {
      a.zzl().l();
      localContentValues.put("resettable_device_id_hash", e);
    }
    a.zzl().l();
    localContentValues.put("last_bundle_index", Long.valueOf(g));
    a.zzl().l();
    localContentValues.put("last_bundle_start_timestamp", Long.valueOf(h));
    a.zzl().l();
    localContentValues.put("last_bundle_end_timestamp", Long.valueOf(i));
    localContentValues.put("app_version", paramk1.h());
    a.zzl().l();
    localContentValues.put("app_store", l);
    a.zzl().l();
    localContentValues.put("gmp_version", Long.valueOf(m));
    a.zzl().l();
    localContentValues.put("dev_cert_hash", Long.valueOf(n));
    a.zzl().l();
    localContentValues.put("measurement_enabled", Boolean.valueOf(o));
    a.zzl().l();
    localContentValues.put("day", Long.valueOf(K));
    a.zzl().l();
    localContentValues.put("daily_public_events_count", Long.valueOf(L));
    a.zzl().l();
    localContentValues.put("daily_events_count", Long.valueOf(M));
    a.zzl().l();
    localContentValues.put("daily_conversions_count", Long.valueOf(N));
    a.zzl().l();
    localContentValues.put("config_fetched_time", Long.valueOf(S));
    a.zzl().l();
    localContentValues.put("failed_config_fetch_time", Long.valueOf(T));
    localContentValues.put("app_version_int", Long.valueOf(paramk1.w()));
    localContentValues.put("firebase_instance_id", paramk1.i());
    a.zzl().l();
    localContentValues.put("daily_error_events_count", Long.valueOf(O));
    a.zzl().l();
    localContentValues.put("daily_realtime_events_count", Long.valueOf(P));
    a.zzl().l();
    localContentValues.put("health_monitor_sample", Q);
    localContentValues.put("android_id", Long.valueOf(0L));
    a.zzl().l();
    localContentValues.put("adid_reporting_enabled", Boolean.valueOf(p));
    localContentValues.put("admob_app_id", paramk1.d());
    a.zzl().l();
    localContentValues.put("dynamite_version", Long.valueOf(s));
    if (c.H(str).j((e3.a)localObject))
    {
      a.zzl().l();
      localContentValues.put("session_stitching_token", u);
    }
    localContentValues.put("sgtm_upload_enabled", Boolean.valueOf(paramk1.l()));
    a.zzl().l();
    localContentValues.put("target_os_version", Long.valueOf(w));
    a.zzl().l();
    localContentValues.put("session_stitching_token_hash", Long.valueOf(x));
    if ((zzoy.zza()) && (h().x(str, h0.Q0)))
    {
      a.zzl().l();
      localContentValues.put("ad_services_version", Integer.valueOf(y));
      a.zzl().l();
      localContentValues.put("attribution_eligibility_status", Long.valueOf(C));
    }
    a.zzl().l();
    localContentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(z));
    a.zzl().l();
    localContentValues.put("npa_metadata_value", r);
    a.zzl().l();
    localContentValues.put("bundle_delivery_index", Long.valueOf(G));
    localContentValues.put("sgtm_preview_key", paramk1.k());
    a.zzl().l();
    localContentValues.put("dma_consent_state", Integer.valueOf(E));
    a.zzl().l();
    localContentValues.put("daily_realtime_dcu_count", Integer.valueOf(F));
    a.zzl().l();
    localContentValues.put("serialized_npa_metadata", H);
    if (h().x(str, h0.K0)) {
      localContentValues.put("client_upload_eligibility", Integer.valueOf(paramk1.m()));
    }
    a.zzl().l();
    localObject = t;
    if (localObject != null) {
      if (((List)localObject).isEmpty()) {
        zzjr.c("Safelisted events should not be an empty list. appId", str);
      } else {
        localContentValues.put("safelisted_events", TextUtils.join(",", (Iterable)localObject));
      }
    }
    if ((zzog.zza()) && (h().x(null, h0.F0)) && (!localContentValues.containsKey("safelisted_events"))) {
      localContentValues.put("safelisted_events", null);
    }
    a.zzl().l();
    localContentValues.put("unmatched_pfo", A);
    a.zzl().l();
    localContentValues.put("unmatched_uwa", B);
    a.zzl().l();
    localContentValues.put("ad_campaign_info", I);
    try
    {
      paramk1 = s();
      if ((paramk1.update("apps", localContentValues, "app_id = ?", new String[] { str }) == 0L) && (paramk1.insertWithOnConflict("apps", null, localContentValues, 5) == -1L)) {
        zzjo.c("Failed to insert/update app (got -1). appId", a1.p(str));
      }
      return;
    }
    catch (SQLiteException paramk1)
    {
      zzjo.d("Error storing app. appId", a1.p(str), paramk1);
    }
  }
  
  public final void K(Long paramLong)
  {
    l();
    p();
    m6.j.i(paramLong);
    if (!h().x(null, h0.I0)) {
      return;
    }
    SQLiteDatabase localSQLiteDatabase = s();
    paramLong = String.valueOf(paramLong);
    try
    {
      if (localSQLiteDatabase.delete("upload_queue", "rowid=?", new String[] { paramLong }) != 1) {
        zzjr.b("Deleted fewer rows from upload_queue than expected");
      }
      return;
    }
    catch (SQLiteException paramLong)
    {
      zzjo.c("Failed to delete a MeasurementBatch in a upload_queue table", paramLong);
      throw paramLong;
    }
  }
  
  public final void L(String paramString, b0 paramb0)
  {
    m6.j.i(paramb0);
    l();
    p();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", a);
    localContentValues.put("name", b);
    localContentValues.put("lifetime_count", Long.valueOf(c));
    localContentValues.put("current_bundle_count", Long.valueOf(d));
    localContentValues.put("last_fire_timestamp", Long.valueOf(f));
    localContentValues.put("last_bundled_timestamp", Long.valueOf(g));
    localContentValues.put("last_bundled_day", h);
    localContentValues.put("last_sampled_complex_event_id", i);
    localContentValues.put("last_sampling_rate", j);
    localContentValues.put("current_session_count", Long.valueOf(e));
    Object localObject = k;
    if ((localObject != null) && (((Boolean)localObject).booleanValue())) {
      localObject = Long.valueOf(1L);
    } else {
      localObject = null;
    }
    localContentValues.put("last_exempt_from_sampling", (Long)localObject);
    try
    {
      if (s().insertWithOnConflict(paramString, null, localContentValues, 5) == -1L) {
        zzjo.c("Failed to insert/update event aggregates (got -1). appId", a1.p(a));
      }
      return;
    }
    catch (SQLiteException paramString)
    {
      zzjo.d("Error storing event aggregates. appId", a1.p(a), paramString);
    }
  }
  
  public final void M(String paramString, e3 parame3)
  {
    m6.j.i(paramString);
    l();
    p();
    f0(paramString, q0(paramString));
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramString);
    localContentValues.put("storage_consent_at_bundling", parame3.n());
    F(localContentValues);
  }
  
  public final void N(String paramString, w5 paramw5)
  {
    l();
    p();
    m6.j.e(paramString);
    ((z)zzb()).getClass();
    long l1 = System.currentTimeMillis();
    long l2 = b;
    Object localObject = h0.q0;
    if ((l2 < l1 - ((Long)((m0)localObject).a(null)).longValue()) || (b > ((Long)((m0)localObject).a(null)).longValue() + l1)) {
      zzjr.a(a1.p(paramString), Long.valueOf(l1), Long.valueOf(b), "Storing trigger URI outside of the max retention time span. appId, now, timestamp");
    }
    zzjw.b("Saving trigger URI");
    localObject = new ContentValues();
    ((ContentValues)localObject).put("app_id", paramString);
    ((ContentValues)localObject).put("trigger_uri", a);
    ((ContentValues)localObject).put("source", Integer.valueOf(c));
    ((ContentValues)localObject).put("timestamp_millis", Long.valueOf(b));
    try
    {
      if (s().insert("trigger_uris", null, (ContentValues)localObject) == -1L) {
        zzjo.c("Failed to insert trigger URI (got -1). appId", a1.p(paramString));
      }
      return;
    }
    catch (SQLiteException paramw5)
    {
      zzjo.d("Error storing trigger URI. appId", a1.p(paramString), paramw5);
    }
  }
  
  public final void O(String paramString, Long paramLong, long paramLong1, zzgf.zzf paramzzf)
  {
    l();
    p();
    m6.j.i(paramzzf);
    m6.j.e(paramString);
    byte[] arrayOfByte = paramzzf.zzce();
    zzjw.d("Saving complex main event, appId, data size", i().c(paramString), Integer.valueOf(arrayOfByte.length));
    paramzzf = new ContentValues();
    paramzzf.put("app_id", paramString);
    paramzzf.put("event_id", paramLong);
    paramzzf.put("children_to_process", Long.valueOf(paramLong1));
    paramzzf.put("main_event", arrayOfByte);
    try
    {
      if (s().insertWithOnConflict("main_event_params", null, paramzzf, 5) == -1L) {
        zzjo.c("Failed to insert complex main event (got -1). appId", a1.p(paramString));
      }
      return;
    }
    catch (SQLiteException paramLong)
    {
      zzjo.d("Error storing complex main event. appId", a1.p(paramString), paramLong);
    }
  }
  
  /* Error */
  public final void P(String paramString1, Long paramLong, String paramString2, android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: astore 5
    //   3: aload 4
    //   5: invokestatic 342	m6/j:i	(Ljava/lang/Object;)V
    //   8: aload_0
    //   9: invokevirtual 458	d2/q:l	()V
    //   12: aload_0
    //   13: invokevirtual 423	e7/h6:p	()V
    //   16: aload_0
    //   17: invokevirtual 549	d2/q:h	()Le7/h;
    //   20: aconst_null
    //   21: getstatic 1138	e7/h0:a1	Le7/m0;
    //   24: invokevirtual 555	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   27: ifeq +26 -> 53
    //   30: aload_2
    //   31: ifnull +22 -> 53
    //   34: new 1140	e7/r
    //   37: dup
    //   38: aload 5
    //   40: aload_1
    //   41: aload_2
    //   42: invokevirtual 515	java/lang/Long:longValue	()J
    //   45: invokespecial 1143	e7/r:<init>	(Le7/o;Ljava/lang/String;J)V
    //   48: astore 6
    //   50: goto +15 -> 65
    //   53: new 1140	e7/r
    //   56: dup
    //   57: aload 5
    //   59: aload_1
    //   60: invokespecial 1146	e7/r:<init>	(Le7/o;Ljava/lang/String;)V
    //   63: astore 6
    //   65: aload 6
    //   67: invokevirtual 1148	e7/r:a	()Ljava/util/List;
    //   70: astore_2
    //   71: aload_2
    //   72: invokeinterface 571 1 0
    //   77: ifne +918 -> 995
    //   80: aload_2
    //   81: invokeinterface 1152 1 0
    //   86: astore 7
    //   88: aconst_null
    //   89: astore_2
    //   90: aload 7
    //   92: invokeinterface 1157 1 0
    //   97: ifeq +889 -> 986
    //   100: aload 7
    //   102: invokeinterface 1161 1 0
    //   107: checkcast 1163	e7/q
    //   110: astore 8
    //   112: aload_3
    //   113: invokestatic 664	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   116: ifne +342 -> 458
    //   119: aload 8
    //   121: getfield 1164	e7/q:b	J
    //   124: lstore 9
    //   126: aload_0
    //   127: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   130: astore 11
    //   132: lload 9
    //   134: invokestatic 1166	java/lang/Long:toString	(J)Ljava/lang/String;
    //   137: astore 5
    //   139: aload 11
    //   141: ldc_w 1168
    //   144: iconst_1
    //   145: anewarray 24	java/lang/String
    //   148: dup
    //   149: iconst_0
    //   150: ldc_w 1170
    //   153: aastore
    //   154: ldc_w 1172
    //   157: iconst_2
    //   158: anewarray 24	java/lang/String
    //   161: dup
    //   162: iconst_0
    //   163: aload_1
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: aload 5
    //   169: aastore
    //   170: aconst_null
    //   171: aconst_null
    //   172: ldc_w 707
    //   175: ldc_w 1174
    //   178: invokevirtual 627	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   181: astore 5
    //   183: aload 5
    //   185: invokeinterface 443 1 0
    //   190: ifne +23 -> 213
    //   193: aload_0
    //   194: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   197: getfield 381	e7/a1:o	Le7/b1;
    //   200: ldc_w 1176
    //   203: aload_1
    //   204: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   207: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   210: goto +97 -> 307
    //   213: aload 5
    //   215: iconst_0
    //   216: invokeinterface 638 2 0
    //   221: astore_2
    //   222: invokestatic 1180	com/google/android/gms/internal/measurement/zzgf$zzk:zzx	()Lcom/google/android/gms/internal/measurement/zzgf$zzk$zza;
    //   225: aload_2
    //   226: invokestatic 1183	e7/o6:z	(Lcom/google/android/gms/internal/measurement/zzkg$zza;[B)Lcom/google/android/gms/internal/measurement/zzlp;
    //   229: checkcast 1185	com/google/android/gms/internal/measurement/zzgf$zzk$zza
    //   232: invokevirtual 1191	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   235: checkcast 1193	com/google/android/gms/internal/measurement/zzkg
    //   238: checkcast 781	com/google/android/gms/internal/measurement/zzgf$zzk
    //   241: astore_2
    //   242: aload 5
    //   244: invokeinterface 634 1 0
    //   249: ifeq +20 -> 269
    //   252: aload_0
    //   253: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   256: getfield 794	e7/a1:r	Le7/b1;
    //   259: ldc_w 1195
    //   262: aload_1
    //   263: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   266: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   269: aload 5
    //   271: invokeinterface 446 1 0
    //   276: goto +90 -> 366
    //   279: astore 11
    //   281: goto +58 -> 339
    //   284: astore_1
    //   285: goto +159 -> 444
    //   288: astore_2
    //   289: aload_0
    //   290: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   293: getfield 381	e7/a1:o	Le7/b1;
    //   296: ldc_w 1197
    //   299: aload_1
    //   300: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   303: aload_2
    //   304: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   307: aload 5
    //   309: invokeinterface 446 1 0
    //   314: aconst_null
    //   315: astore 11
    //   317: goto +59 -> 376
    //   320: astore 11
    //   322: aconst_null
    //   323: astore_2
    //   324: goto +15 -> 339
    //   327: astore_1
    //   328: goto +113 -> 441
    //   331: astore 11
    //   333: aconst_null
    //   334: astore 5
    //   336: aload 5
    //   338: astore_2
    //   339: aload_0
    //   340: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   343: getfield 381	e7/a1:o	Le7/b1;
    //   346: ldc_w 1199
    //   349: aload_1
    //   350: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   353: aload 11
    //   355: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   358: aload_2
    //   359: astore 11
    //   361: aload 5
    //   363: ifnull +13 -> 376
    //   366: aload 5
    //   368: invokeinterface 446 1 0
    //   373: aload_2
    //   374: astore 11
    //   376: aload 11
    //   378: ifnull +48 -> 426
    //   381: aload 11
    //   383: invokevirtual 1202	com/google/android/gms/internal/measurement/zzgf$zzk:zzau	()Ljava/util/List;
    //   386: invokeinterface 1152 1 0
    //   391: astore_2
    //   392: aload_2
    //   393: invokeinterface 1157 1 0
    //   398: ifeq +28 -> 426
    //   401: aload_2
    //   402: invokeinterface 1161 1 0
    //   407: checkcast 1204	com/google/android/gms/internal/measurement/zzgf$zzp
    //   410: invokevirtual 1206	com/google/android/gms/internal/measurement/zzgf$zzp:zzg	()Ljava/lang/String;
    //   413: aload_3
    //   414: invokevirtual 1209	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   417: ifeq -25 -> 392
    //   420: iconst_1
    //   421: istore 12
    //   423: goto +6 -> 429
    //   426: iconst_0
    //   427: istore 12
    //   429: iload 12
    //   431: ifne -343 -> 88
    //   434: goto +24 -> 458
    //   437: astore_1
    //   438: aload 5
    //   440: astore_2
    //   441: aload_2
    //   442: astore 5
    //   444: aload 5
    //   446: ifnull +10 -> 456
    //   449: aload 5
    //   451: invokeinterface 446 1 0
    //   456: aload_1
    //   457: athrow
    //   458: aload_0
    //   459: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   462: astore 13
    //   464: aload 8
    //   466: getfield 1212	e7/q:d	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   469: astore 5
    //   471: new 1214	android/os/Bundle
    //   474: dup
    //   475: invokespecial 1215	android/os/Bundle:<init>	()V
    //   478: astore 11
    //   480: aload 5
    //   482: invokevirtual 1220	com/google/android/gms/internal/measurement/zzgf$zzf:zzh	()Ljava/util/List;
    //   485: invokeinterface 1152 1 0
    //   490: astore_2
    //   491: aload_2
    //   492: invokeinterface 1157 1 0
    //   497: ifeq +171 -> 668
    //   500: aload_2
    //   501: invokeinterface 1161 1 0
    //   506: checkcast 1222	com/google/android/gms/internal/measurement/zzgf$zzh
    //   509: astore 14
    //   511: aload 14
    //   513: invokevirtual 1224	com/google/android/gms/internal/measurement/zzgf$zzh:zzj	()Z
    //   516: ifeq +21 -> 537
    //   519: aload 11
    //   521: aload 14
    //   523: invokevirtual 1225	com/google/android/gms/internal/measurement/zzgf$zzh:zzg	()Ljava/lang/String;
    //   526: aload 14
    //   528: invokevirtual 1228	com/google/android/gms/internal/measurement/zzgf$zzh:zza	()D
    //   531: invokevirtual 1234	android/os/BaseBundle:putDouble	(Ljava/lang/String;D)V
    //   534: goto +131 -> 665
    //   537: aload 14
    //   539: invokevirtual 1237	com/google/android/gms/internal/measurement/zzgf$zzh:zzk	()Z
    //   542: ifeq +21 -> 563
    //   545: aload 11
    //   547: aload 14
    //   549: invokevirtual 1225	com/google/android/gms/internal/measurement/zzgf$zzh:zzg	()Ljava/lang/String;
    //   552: aload 14
    //   554: invokevirtual 1240	com/google/android/gms/internal/measurement/zzgf$zzh:zzb	()F
    //   557: invokevirtual 1244	android/os/Bundle:putFloat	(Ljava/lang/String;F)V
    //   560: goto +105 -> 665
    //   563: aload 14
    //   565: invokevirtual 1246	com/google/android/gms/internal/measurement/zzgf$zzh:zzl	()Z
    //   568: ifeq +21 -> 589
    //   571: aload 11
    //   573: aload 14
    //   575: invokevirtual 1225	com/google/android/gms/internal/measurement/zzgf$zzh:zzg	()Ljava/lang/String;
    //   578: aload 14
    //   580: invokevirtual 1249	com/google/android/gms/internal/measurement/zzgf$zzh:zzd	()J
    //   583: invokevirtual 1253	android/os/BaseBundle:putLong	(Ljava/lang/String;J)V
    //   586: goto +79 -> 665
    //   589: aload 14
    //   591: invokevirtual 1255	com/google/android/gms/internal/measurement/zzgf$zzh:zzn	()Z
    //   594: ifeq +21 -> 615
    //   597: aload 11
    //   599: aload 14
    //   601: invokevirtual 1225	com/google/android/gms/internal/measurement/zzgf$zzh:zzg	()Ljava/lang/String;
    //   604: aload 14
    //   606: invokevirtual 1257	com/google/android/gms/internal/measurement/zzgf$zzh:zzh	()Ljava/lang/String;
    //   609: invokevirtual 1260	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   612: goto +53 -> 665
    //   615: aload 14
    //   617: invokevirtual 1263	com/google/android/gms/internal/measurement/zzgf$zzh:zzi	()Ljava/util/List;
    //   620: invokeinterface 571 1 0
    //   625: ifne +24 -> 649
    //   628: aload 11
    //   630: aload 14
    //   632: invokevirtual 1225	com/google/android/gms/internal/measurement/zzgf$zzh:zzg	()Ljava/lang/String;
    //   635: aload 14
    //   637: invokevirtual 1263	com/google/android/gms/internal/measurement/zzgf$zzh:zzi	()Ljava/util/List;
    //   640: invokestatic 1267	e7/o6:W	(Ljava/util/List;)[Landroid/os/Bundle;
    //   643: invokevirtual 1271	android/os/Bundle:putParcelableArray	(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //   646: goto +19 -> 665
    //   649: aload 13
    //   651: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   654: getfield 381	e7/a1:o	Le7/b1;
    //   657: ldc_w 1273
    //   660: aload 14
    //   662: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   665: goto -174 -> 491
    //   668: aload 11
    //   670: ldc_w 1275
    //   673: invokevirtual 1277	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   676: astore_2
    //   677: aload 11
    //   679: ldc_w 1275
    //   682: invokevirtual 1280	android/os/Bundle:remove	(Ljava/lang/String;)V
    //   685: aload 5
    //   687: invokevirtual 1281	com/google/android/gms/internal/measurement/zzgf$zzf:zzg	()Ljava/lang/String;
    //   690: pop
    //   691: aload_2
    //   692: ifnonnull +10 -> 702
    //   695: ldc_w 448
    //   698: astore_2
    //   699: goto +3 -> 702
    //   702: aload 5
    //   704: invokevirtual 1282	com/google/android/gms/internal/measurement/zzgf$zzf:zzd	()J
    //   707: pop2
    //   708: aload_0
    //   709: invokevirtual 1285	d2/q:k	()Le7/r6;
    //   712: aload 11
    //   714: aload 4
    //   716: invokevirtual 1290	e7/r6:D	(Landroid/os/Bundle;Landroid/os/Bundle;)V
    //   719: new 1292	e7/y
    //   722: dup
    //   723: aload_0
    //   724: getfield 1295	d2/q:b	Ljava/lang/Object;
    //   727: checkcast 881	e7/j2
    //   730: aload_2
    //   731: aload_1
    //   732: aload 8
    //   734: getfield 1212	e7/q:d	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   737: invokevirtual 1281	com/google/android/gms/internal/measurement/zzgf$zzf:zzg	()Ljava/lang/String;
    //   740: aload 8
    //   742: getfield 1212	e7/q:d	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   745: invokevirtual 1282	com/google/android/gms/internal/measurement/zzgf$zzf:zzd	()J
    //   748: aload 8
    //   750: getfield 1212	e7/q:d	Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   753: invokevirtual 1298	com/google/android/gms/internal/measurement/zzgf$zzf:zzc	()J
    //   756: aload 11
    //   758: invokespecial 1301	e7/y:<init>	(Le7/j2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V
    //   761: astore_2
    //   762: aload 8
    //   764: getfield 1303	e7/q:a	J
    //   767: lstore 9
    //   769: aload 8
    //   771: getfield 1164	e7/q:b	J
    //   774: lstore 15
    //   776: aload 8
    //   778: getfield 1305	e7/q:c	Z
    //   781: istore 12
    //   783: aload_0
    //   784: invokevirtual 458	d2/q:l	()V
    //   787: aload_0
    //   788: invokevirtual 423	e7/h6:p	()V
    //   791: aload_2
    //   792: getfield 1306	e7/y:a	Ljava/lang/String;
    //   795: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   798: aload_0
    //   799: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   802: aload_2
    //   803: invokevirtual 1309	e7/o6:x	(Le7/y;)Lcom/google/android/gms/internal/measurement/zzgf$zzf;
    //   806: invokevirtual 802	com/google/android/gms/internal/measurement/zzio:zzce	()[B
    //   809: astore 11
    //   811: new 344	android/content/ContentValues
    //   814: dup
    //   815: invokespecial 809	android/content/ContentValues:<init>	()V
    //   818: astore 5
    //   820: aload 5
    //   822: ldc_w 611
    //   825: aload_2
    //   826: getfield 1306	e7/y:a	Ljava/lang/String;
    //   829: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   832: aload 5
    //   834: ldc_w 689
    //   837: aload_2
    //   838: getfield 1310	e7/y:b	Ljava/lang/String;
    //   841: invokevirtual 348	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   844: aload 5
    //   846: ldc_w 1312
    //   849: aload_2
    //   850: getfield 1313	e7/y:d	J
    //   853: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   856: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   859: aload 5
    //   861: ldc_w 1315
    //   864: lload 15
    //   866: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   869: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   872: aload 5
    //   874: ldc_w 813
    //   877: aload 11
    //   879: invokevirtual 816	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   882: aload 5
    //   884: ldc -6
    //   886: iload 12
    //   888: invokestatic 389	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   891: invokevirtual 819	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   894: aload_0
    //   895: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   898: ldc_w 1317
    //   901: aload 5
    //   903: ldc_w 1319
    //   906: iconst_1
    //   907: anewarray 24	java/lang/String
    //   910: dup
    //   911: iconst_0
    //   912: lload 9
    //   914: invokestatic 530	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   917: aastore
    //   918: invokevirtual 762	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   921: i2l
    //   922: lstore 9
    //   924: lload 9
    //   926: lconst_1
    //   927: lcmp
    //   928: ifeq +55 -> 983
    //   931: aload_0
    //   932: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   935: getfield 381	e7/a1:o	Le7/b1;
    //   938: ldc_w 1321
    //   941: aload_2
    //   942: getfield 1306	e7/y:a	Ljava/lang/String;
    //   945: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   948: lload 9
    //   950: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   953: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   956: goto +27 -> 983
    //   959: astore 5
    //   961: aload_0
    //   962: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   965: getfield 381	e7/a1:o	Le7/b1;
    //   968: ldc_w 1323
    //   971: aload_2
    //   972: getfield 1306	e7/y:a	Ljava/lang/String;
    //   975: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   978: aload 5
    //   980: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   983: goto -895 -> 88
    //   986: aload 6
    //   988: invokevirtual 1148	e7/r:a	()Ljava/util/List;
    //   991: astore_2
    //   992: goto -921 -> 71
    //   995: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	996	0	this	o
    //   0	996	1	paramString1	String
    //   0	996	2	paramLong	Long
    //   0	996	3	paramString2	String
    //   0	996	4	paramBundle	android.os.Bundle
    //   1	901	5	localObject1	Object
    //   959	20	5	localSQLiteException1	SQLiteException
    //   48	939	6	localr	r
    //   86	15	7	localIterator	Iterator
    //   110	667	8	localq	q
    //   124	825	9	l1	long
    //   130	10	11	localSQLiteDatabase	SQLiteDatabase
    //   279	1	11	localSQLiteException2	SQLiteException
    //   315	1	11	localObject2	Object
    //   320	1	11	localSQLiteException3	SQLiteException
    //   331	23	11	localSQLiteException4	SQLiteException
    //   359	519	11	localObject3	Object
    //   421	466	12	i	int
    //   462	188	13	localo6	o6
    //   509	152	14	localzzh	com.google.android.gms.internal.measurement.zzgf.zzh
    //   774	91	15	l2	long
    // Exception table:
    //   from	to	target	type
    //   242	269	279	android/database/sqlite/SQLiteException
    //   269	276	279	android/database/sqlite/SQLiteException
    //   183	210	284	finally
    //   213	222	284	finally
    //   222	242	284	finally
    //   242	269	284	finally
    //   269	276	284	finally
    //   289	307	284	finally
    //   222	242	288	java/io/IOException
    //   183	210	320	android/database/sqlite/SQLiteException
    //   213	222	320	android/database/sqlite/SQLiteException
    //   222	242	320	android/database/sqlite/SQLiteException
    //   289	307	320	android/database/sqlite/SQLiteException
    //   126	183	327	finally
    //   126	183	331	android/database/sqlite/SQLiteException
    //   339	358	437	finally
    //   894	924	959	android/database/sqlite/SQLiteException
    //   931	956	959	android/database/sqlite/SQLiteException
  }
  
  public final void Q(String paramString1, String paramString2)
  {
    m6.j.e(paramString1);
    m6.j.e(paramString2);
    l();
    p();
    try
    {
      s().delete("conditional_properties", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjo.a(a1.p(paramString1), i().g(paramString2), localSQLiteException, "Error deleting conditional property");
    }
  }
  
  public final void R(List<Long> paramList)
  {
    l();
    p();
    if (paramList.size() != 0)
    {
      if (!Y()) {
        return;
      }
      paramList = a0.j.j("(", TextUtils.join(",", paramList), ")");
      Object localObject = new StringBuilder("SELECT COUNT(1) FROM queue WHERE rowid IN ");
      ((StringBuilder)localObject).append(paramList);
      ((StringBuilder)localObject).append(" AND retry_count =  2147483647 LIMIT 1");
      if (b0(((StringBuilder)localObject).toString(), null) > 0L) {
        zzjr.b("The number of upload retries exceeds the limit. Will remain unchanged.");
      }
      try
      {
        localObject = s();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
        localStringBuilder.append(paramList);
        localStringBuilder.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
        ((SQLiteDatabase)localObject).execSQL(localStringBuilder.toString());
        return;
      }
      catch (SQLiteException paramList)
      {
        zzjo.c("Error incrementing retry count. error", paramList);
        return;
      }
    }
    throw new IllegalArgumentException("Given Integer is zero");
  }
  
  public final boolean S(f paramf)
  {
    l();
    p();
    String str = a;
    m6.j.i(str);
    if (m0(str, c.b) == null) {
      if (b0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { str }) >= 1000L) {
        return false;
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", str);
    localContentValues.put("origin", b);
    localContentValues.put("name", c.b);
    Object localObject = c.D();
    m6.j.i(localObject);
    G(localContentValues, localObject);
    localContentValues.put("active", Boolean.valueOf(e));
    localContentValues.put("trigger_event_name", f);
    localContentValues.put("trigger_timeout", Long.valueOf(p));
    k();
    localContentValues.put("timed_out_event", r6.a0(o));
    localContentValues.put("creation_timestamp", Long.valueOf(d));
    k();
    localContentValues.put("triggered_event", r6.a0(q));
    localContentValues.put("triggered_timestamp", Long.valueOf(c.c));
    localContentValues.put("time_to_live", Long.valueOf(r));
    k();
    localContentValues.put("expired_event", r6.a0(s));
    try
    {
      if (s().insertWithOnConflict("conditional_properties", null, localContentValues, 5) == -1L) {
        zzjo.c("Failed to insert/update conditional user property (got -1)", a1.p(str));
      }
    }
    catch (SQLiteException paramf)
    {
      zzjo.d("Error storing conditional user property", a1.p(str), paramf);
    }
    return true;
  }
  
  public final boolean T(y paramy, long paramLong, boolean paramBoolean)
  {
    l();
    p();
    m6.j.e(a);
    byte[] arrayOfByte = m().x(paramy).zzce();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", a);
    localContentValues.put("name", b);
    localContentValues.put("timestamp", Long.valueOf(d));
    localContentValues.put("metadata_fingerprint", Long.valueOf(paramLong));
    localContentValues.put("data", arrayOfByte);
    localContentValues.put("realtime", Integer.valueOf(paramBoolean));
    try
    {
      if (s().insert("raw_events", null, localContentValues) == -1L)
      {
        zzjo.c("Failed to insert raw event (got -1). appId", a1.p(a));
        return false;
      }
      return true;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjo.d("Error storing raw event. appId", a1.p(a), localSQLiteException);
    }
    return false;
  }
  
  public final boolean U(s6 params6)
  {
    l();
    p();
    if (m0(a, c) == null) {
      if (r6.t0(c))
      {
        if (b0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { a }) >= h().m(a, h0.R, 25, 100)) {
          return false;
        }
      }
      else if (!"_npa".equals(c)) {
        if (b0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { a, b }) >= 25L) {
          return false;
        }
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", a);
    localContentValues.put("origin", b);
    localContentValues.put("name", c);
    localContentValues.put("set_timestamp", Long.valueOf(d));
    G(localContentValues, e);
    try
    {
      if (s().insertWithOnConflict("user_attributes", null, localContentValues, 5) == -1L) {
        zzjo.c("Failed to insert/update user property (got -1). appId", a1.p(a));
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjo.d("Error storing user property. appId", a1.p(a), localSQLiteException);
    }
    return true;
  }
  
  public final boolean V(String paramString, int paramInt, zzfw.zzb paramzzb)
  {
    p();
    l();
    m6.j.e(paramString);
    m6.j.i(paramzzb);
    boolean bool = paramzzb.zzf().isEmpty();
    Integer localInteger = null;
    if (bool)
    {
      localObject1 = zzjr;
      localObject2 = a1.p(paramString);
      paramString = localInteger;
      if (paramzzb.zzl()) {
        paramString = Integer.valueOf(paramzzb.zzb());
      }
      ((b1)localObject1).a(localObject2, Integer.valueOf(paramInt), String.valueOf(paramString), "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId");
      return false;
    }
    Object localObject2 = paramzzb.zzce();
    Object localObject1 = new ContentValues();
    ((ContentValues)localObject1).put("app_id", paramString);
    ((ContentValues)localObject1).put("audience_id", Integer.valueOf(paramInt));
    if (paramzzb.zzl()) {
      localInteger = Integer.valueOf(paramzzb.zzb());
    } else {
      localInteger = null;
    }
    ((ContentValues)localObject1).put("filter_id", localInteger);
    ((ContentValues)localObject1).put("event_name", paramzzb.zzf());
    if (paramzzb.zzm()) {
      paramzzb = Boolean.valueOf(paramzzb.zzj());
    } else {
      paramzzb = null;
    }
    ((ContentValues)localObject1).put("session_scoped", paramzzb);
    ((ContentValues)localObject1).put("data", (byte[])localObject2);
    try
    {
      if (s().insertWithOnConflict("event_filters", null, (ContentValues)localObject1, 5) == -1L) {
        zzjo.c("Failed to insert event filter (got -1). appId", a1.p(paramString));
      }
      return true;
    }
    catch (SQLiteException paramzzb)
    {
      zzjo.d("Error storing event filter. appId", a1.p(paramString), paramzzb);
    }
    return false;
  }
  
  public final boolean W(String paramString, int paramInt, zzfw.zze paramzze)
  {
    p();
    l();
    m6.j.e(paramString);
    m6.j.i(paramzze);
    boolean bool = paramzze.zze().isEmpty();
    Integer localInteger = null;
    if (bool)
    {
      localObject1 = zzjr;
      localObject2 = a1.p(paramString);
      paramString = localInteger;
      if (paramzze.zzi()) {
        paramString = Integer.valueOf(paramzze.zza());
      }
      ((b1)localObject1).a(localObject2, Integer.valueOf(paramInt), String.valueOf(paramString), "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId");
      return false;
    }
    Object localObject1 = paramzze.zzce();
    Object localObject2 = new ContentValues();
    ((ContentValues)localObject2).put("app_id", paramString);
    ((ContentValues)localObject2).put("audience_id", Integer.valueOf(paramInt));
    if (paramzze.zzi()) {
      localInteger = Integer.valueOf(paramzze.zza());
    } else {
      localInteger = null;
    }
    ((ContentValues)localObject2).put("filter_id", localInteger);
    ((ContentValues)localObject2).put("property_name", paramzze.zze());
    if (paramzze.zzj()) {
      paramzze = Boolean.valueOf(paramzze.zzh());
    } else {
      paramzze = null;
    }
    ((ContentValues)localObject2).put("session_scoped", paramzze);
    ((ContentValues)localObject2).put("data", (byte[])localObject1);
    try
    {
      if (s().insertWithOnConflict("property_filters", null, (ContentValues)localObject2, 5) == -1L)
      {
        zzjo.c("Failed to insert property filter (got -1). appId", a1.p(paramString));
        return false;
      }
      return true;
    }
    catch (SQLiteException paramzze)
    {
      zzjo.d("Error storing property filter. appId", a1.p(paramString), paramzze);
    }
    return false;
  }
  
  public final long X(String paramString1, zzgf.zzj paramzzj, String paramString2, Map<String, String> paramMap, Object paramObject, Long paramLong)
  {
    l();
    p();
    m6.j.i(paramzzj);
    m6.j.e(paramString1);
    if (!h().x(null, h0.I0)) {
      return -1L;
    }
    l();
    p();
    boolean bool = Y();
    int i = 1;
    long l2;
    if (bool)
    {
      long l1 = c.q.o.a();
      ((z)zzb()).getClass();
      l2 = SystemClock.elapsedRealtime();
      if (Math.abs(l2 - l1) > ((Long)h0.I.a(null)).longValue())
      {
        c.q.o.b(l2);
        l();
        p();
        if (Y())
        {
          j = s().delete("upload_queue", Z(), new String[0]);
          if (j > 0) {
            zzjw.c("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(j));
          }
        }
        if (h().x(null, h0.K0))
        {
          m6.j.e(paramString1);
          l();
          p();
          try
          {
            j = h().q(paramString1, h0.w);
            if (j > 0) {
              s().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[] { paramString1, String.valueOf(j) });
            }
          }
          catch (SQLiteException localSQLiteException)
          {
            zzjo.d("Error deleting over the limit queued batches. appId", a1.p(paramString1), localSQLiteException);
          }
        }
      }
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      paramMap = (String)((Map.Entry)localObject).getKey();
      String str = (String)((Map.Entry)localObject).getValue();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramMap);
      ((StringBuilder)localObject).append("=");
      ((StringBuilder)localObject).append(str);
      localArrayList.add(((StringBuilder)localObject).toString());
    }
    paramzzj = paramzzj.zzce();
    paramMap = new ContentValues();
    paramMap.put("app_id", paramString1);
    paramMap.put("measurement_batch", paramzzj);
    paramMap.put("upload_uri", paramString2);
    paramString2 = new StringBuilder();
    int j = localArrayList.size();
    if (j > 0)
    {
      paramzzj = localArrayList.get(0);
      for (;;)
      {
        paramString2.append((CharSequence)paramzzj);
        if (i >= j) {
          break;
        }
        paramString2.append("\r\n");
        paramzzj = localArrayList.get(i);
        i++;
      }
    }
    paramMap.put("upload_headers", paramString2.toString());
    paramMap.put("upload_type", Integer.valueOf(g.a(paramObject)));
    ((z)zzb()).getClass();
    paramMap.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
    paramMap.put("retry_count", Integer.valueOf(0));
    if (paramLong != null) {
      paramMap.put("associated_row_id", paramLong);
    }
    try
    {
      l2 = s().insert("upload_queue", null, paramMap);
      if (l2 == -1L) {
        zzjo.c("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", paramString1);
      }
      return l2;
    }
    catch (SQLiteException paramzzj)
    {
      zzjo.d("Error storing MeasurementBatch to upload_queue. appId", paramString1, paramzzj);
    }
    return -1L;
  }
  
  public final boolean Y()
  {
    return zza().getDatabasePath("google_app_measurement.db").exists();
  }
  
  public final String Z()
  {
    ((z)zzb()).getClass();
    long l = System.currentTimeMillis();
    Object localObject = Locale.US;
    String str1 = String.format((Locale)localObject, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", new Object[] { Integer.valueOf(1), Long.valueOf(l), Long.valueOf(((Long)h0.O.a(null)).longValue()) });
    String str2 = String.format((Locale)localObject, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", new Object[] { Integer.valueOf(1), Long.valueOf(l), Long.valueOf(h.z()) });
    localObject = new StringBuilder("(");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(" OR ");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(")");
    return ((StringBuilder)localObject).toString();
  }
  
  public final long a0(String paramString)
  {
    m6.j.e(paramString);
    m6.j.e("first_open_count");
    l();
    p();
    SQLiteDatabase localSQLiteDatabase = s();
    localSQLiteDatabase.beginTransaction();
    try
    {
      long l2;
      try
      {
        long l1 = w("select first_open_count from app2 where app_id=?", new String[] { paramString }, -1L);
        l2 = l1;
        ContentValues localContentValues;
        if (l1 == -1L)
        {
          localContentValues = new android/content/ContentValues;
          localContentValues.<init>();
          localContentValues.put("app_id", paramString);
          localContentValues.put("first_open_count", Integer.valueOf(0));
          localContentValues.put("previous_install_count", Integer.valueOf(0));
          if (localSQLiteDatabase.insertWithOnConflict("app2", null, localContentValues, 5) == -1L)
          {
            zzjo.d("Failed to insert column (got -1). appId", a1.p(paramString), "first_open_count");
            return -1L;
          }
          l2 = 0L;
        }
        try
        {
          localContentValues = new android/content/ContentValues;
          localContentValues.<init>();
          localContentValues.put("app_id", paramString);
          localContentValues.put("first_open_count", Long.valueOf(1L + l2));
          if (localSQLiteDatabase.update("app2", localContentValues, "app_id = ?", new String[] { paramString }) == 0L)
          {
            zzjo.d("Failed to update column (got 0). appId", a1.p(paramString), "first_open_count");
            return -1L;
          }
        }
        catch (SQLiteException localSQLiteException1) {}
        zzjo.a(a1.p(paramString), "first_open_count", localSQLiteException2, "Error inserting column. appId");
      }
      catch (SQLiteException localSQLiteException2)
      {
        l2 = 0L;
      }
      return l2;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  /* Error */
  public final long b0(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 5
    //   11: aload_3
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual 439	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   17: astore_2
    //   18: aload_2
    //   19: astore 5
    //   21: aload_2
    //   22: astore 4
    //   24: aload_2
    //   25: invokeinterface 443 1 0
    //   30: ifeq +27 -> 57
    //   33: aload_2
    //   34: astore 5
    //   36: aload_2
    //   37: astore 4
    //   39: aload_2
    //   40: iconst_0
    //   41: invokeinterface 415 2 0
    //   46: lstore 6
    //   48: aload_2
    //   49: invokeinterface 446 1 0
    //   54: lload 6
    //   56: lreturn
    //   57: aload_2
    //   58: astore 5
    //   60: aload_2
    //   61: astore 4
    //   63: new 435	android/database/sqlite/SQLiteException
    //   66: astore_3
    //   67: aload_2
    //   68: astore 5
    //   70: aload_2
    //   71: astore 4
    //   73: aload_3
    //   74: ldc_w 1602
    //   77: invokespecial 1603	android/database/sqlite/SQLiteException:<init>	(Ljava/lang/String;)V
    //   80: aload_2
    //   81: astore 5
    //   83: aload_2
    //   84: astore 4
    //   86: aload_3
    //   87: athrow
    //   88: astore_1
    //   89: goto +29 -> 118
    //   92: astore_2
    //   93: aload 4
    //   95: astore 5
    //   97: aload_0
    //   98: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   101: getfield 381	e7/a1:o	Le7/b1;
    //   104: ldc_w 450
    //   107: aload_1
    //   108: aload_2
    //   109: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   112: aload 4
    //   114: astore 5
    //   116: aload_2
    //   117: athrow
    //   118: aload 5
    //   120: ifnull +10 -> 130
    //   123: aload 5
    //   125: invokeinterface 446 1 0
    //   130: aload_1
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	o
    //   0	132	1	paramString	String
    //   0	132	2	paramArrayOfString	String[]
    //   4	83	3	localObject	Object
    //   6	107	4	arrayOfString1	String[]
    //   9	115	5	arrayOfString2	String[]
    //   46	9	6	l	long
    // Exception table:
    //   from	to	target	type
    //   11	18	88	finally
    //   24	33	88	finally
    //   39	48	88	finally
    //   63	67	88	finally
    //   73	80	88	finally
    //   86	88	88	finally
    //   97	112	88	finally
    //   116	118	88	finally
    //   11	18	92	android/database/sqlite/SQLiteException
    //   24	33	92	android/database/sqlite/SQLiteException
    //   39	48	92	android/database/sqlite/SQLiteException
    //   63	67	92	android/database/sqlite/SQLiteException
    //   73	80	92	android/database/sqlite/SQLiteException
    //   86	88	92	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final String c0(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 458	d2/q:l	()V
    //   4: aload_0
    //   5: invokevirtual 423	e7/h6:p	()V
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 1606
    //   17: iconst_1
    //   18: anewarray 24	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: lload_1
    //   24: invokestatic 530	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   27: aastore
    //   28: invokevirtual 439	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore 4
    //   33: aload 4
    //   35: astore_3
    //   36: aload 4
    //   38: invokeinterface 443 1 0
    //   43: ifne +28 -> 71
    //   46: aload 4
    //   48: astore_3
    //   49: aload_0
    //   50: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   53: getfield 541	e7/a1:w	Le7/b1;
    //   56: ldc_w 1608
    //   59: invokevirtual 400	e7/b1:b	(Ljava/lang/String;)V
    //   62: aload 4
    //   64: invokeinterface 446 1 0
    //   69: aconst_null
    //   70: areturn
    //   71: aload 4
    //   73: astore_3
    //   74: aload 4
    //   76: iconst_0
    //   77: invokeinterface 404 2 0
    //   82: astore 5
    //   84: aload 4
    //   86: invokeinterface 446 1 0
    //   91: aload 5
    //   93: areturn
    //   94: astore 5
    //   96: goto +13 -> 109
    //   99: astore 4
    //   101: goto +42 -> 143
    //   104: astore 5
    //   106: aconst_null
    //   107: astore 4
    //   109: aload 4
    //   111: astore_3
    //   112: aload_0
    //   113: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   116: getfield 381	e7/a1:o	Le7/b1;
    //   119: ldc_w 1610
    //   122: aload 5
    //   124: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   127: aload 4
    //   129: ifnull +10 -> 139
    //   132: aload 4
    //   134: invokeinterface 446 1 0
    //   139: aconst_null
    //   140: areturn
    //   141: astore 4
    //   143: aload_3
    //   144: ifnull +9 -> 153
    //   147: aload_3
    //   148: invokeinterface 446 1 0
    //   153: aload 4
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	o
    //   0	156	1	paramLong	long
    //   9	139	3	localObject1	Object
    //   31	54	4	localCursor	Cursor
    //   99	1	4	localObject2	Object
    //   107	26	4	localObject3	Object
    //   141	13	4	localObject4	Object
    //   82	10	5	str	String
    //   94	1	5	localSQLiteException1	SQLiteException
    //   104	19	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   36	46	94	android/database/sqlite/SQLiteException
    //   49	62	94	android/database/sqlite/SQLiteException
    //   74	84	94	android/database/sqlite/SQLiteException
    //   10	33	99	finally
    //   10	33	104	android/database/sqlite/SQLiteException
    //   36	46	141	finally
    //   49	62	141	finally
    //   74	84	141	finally
    //   112	127	141	finally
  }
  
  /* Error */
  public final List<s6> d0(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_0
    //   9: invokevirtual 423	e7/h6:p	()V
    //   12: new 629	java/util/ArrayList
    //   15: dup
    //   16: invokespecial 631	java/util/ArrayList:<init>	()V
    //   19: astore 4
    //   21: aconst_null
    //   22: astore 5
    //   24: aconst_null
    //   25: astore 6
    //   27: aconst_null
    //   28: astore 7
    //   30: aload 5
    //   32: astore 8
    //   34: new 629	java/util/ArrayList
    //   37: astore 9
    //   39: aload 5
    //   41: astore 8
    //   43: aload 9
    //   45: iconst_3
    //   46: invokespecial 661	java/util/ArrayList:<init>	(I)V
    //   49: aload 5
    //   51: astore 8
    //   53: aload 9
    //   55: aload_1
    //   56: invokevirtual 648	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   59: pop
    //   60: aload 5
    //   62: astore 8
    //   64: new 591	java/lang/StringBuilder
    //   67: astore 10
    //   69: aload 5
    //   71: astore 8
    //   73: aload 10
    //   75: ldc_w 593
    //   78: invokespecial 594	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   81: aload 5
    //   83: astore 8
    //   85: aload_2
    //   86: invokestatic 664	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   89: istore 11
    //   91: iload 11
    //   93: ifne +50 -> 143
    //   96: aload_2
    //   97: astore 6
    //   99: aload 7
    //   101: astore 12
    //   103: aload 6
    //   105: astore 13
    //   107: aload 5
    //   109: astore 8
    //   111: aload 9
    //   113: aload 6
    //   115: invokevirtual 648	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   118: pop
    //   119: aload 7
    //   121: astore 12
    //   123: aload 6
    //   125: astore 13
    //   127: aload 5
    //   129: astore 8
    //   131: aload 10
    //   133: ldc_w 666
    //   136: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: goto +3 -> 143
    //   143: aload_2
    //   144: astore 6
    //   146: aload 7
    //   148: astore 12
    //   150: aload 6
    //   152: astore 13
    //   154: aload 5
    //   156: astore 8
    //   158: aload_3
    //   159: invokestatic 664	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   162: ifne +116 -> 278
    //   165: aload 7
    //   167: astore 12
    //   169: aload 6
    //   171: astore 13
    //   173: aload 5
    //   175: astore 8
    //   177: new 591	java/lang/StringBuilder
    //   180: astore_2
    //   181: aload 7
    //   183: astore 12
    //   185: aload 6
    //   187: astore 13
    //   189: aload 5
    //   191: astore 8
    //   193: aload_2
    //   194: invokespecial 667	java/lang/StringBuilder:<init>	()V
    //   197: aload 7
    //   199: astore 12
    //   201: aload 6
    //   203: astore 13
    //   205: aload 5
    //   207: astore 8
    //   209: aload_2
    //   210: aload_3
    //   211: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload 7
    //   217: astore 12
    //   219: aload 6
    //   221: astore 13
    //   223: aload 5
    //   225: astore 8
    //   227: aload_2
    //   228: ldc_w 669
    //   231: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload 7
    //   237: astore 12
    //   239: aload 6
    //   241: astore 13
    //   243: aload 5
    //   245: astore 8
    //   247: aload 9
    //   249: aload_2
    //   250: invokevirtual 603	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   253: invokevirtual 648	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   256: pop
    //   257: aload 7
    //   259: astore 12
    //   261: aload 6
    //   263: astore 13
    //   265: aload 5
    //   267: astore 8
    //   269: aload 10
    //   271: ldc_w 671
    //   274: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: pop
    //   278: aload 7
    //   280: astore 12
    //   282: aload 6
    //   284: astore 13
    //   286: aload 5
    //   288: astore 8
    //   290: aload 9
    //   292: aload 9
    //   294: invokevirtual 675	java/util/ArrayList:size	()I
    //   297: anewarray 24	java/lang/String
    //   300: invokevirtual 679	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   303: checkcast 680	[Ljava/lang/String;
    //   306: astore 9
    //   308: aload 7
    //   310: astore 12
    //   312: aload 6
    //   314: astore 13
    //   316: aload 5
    //   318: astore 8
    //   320: aload_0
    //   321: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   324: astore_2
    //   325: aload 7
    //   327: astore 12
    //   329: aload 6
    //   331: astore 13
    //   333: aload 5
    //   335: astore 8
    //   337: aload 10
    //   339: invokevirtual 603	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: astore 10
    //   344: aload 7
    //   346: astore 12
    //   348: aload 6
    //   350: astore 13
    //   352: aload 5
    //   354: astore 8
    //   356: aload_2
    //   357: ldc_w 1443
    //   360: iconst_4
    //   361: anewarray 24	java/lang/String
    //   364: dup
    //   365: iconst_0
    //   366: ldc_w 689
    //   369: aastore
    //   370: dup
    //   371: iconst_1
    //   372: ldc_w 1438
    //   375: aastore
    //   376: dup
    //   377: iconst_2
    //   378: ldc_w 333
    //   381: aastore
    //   382: dup
    //   383: iconst_3
    //   384: ldc 58
    //   386: aastore
    //   387: aload 10
    //   389: aload 9
    //   391: aconst_null
    //   392: aconst_null
    //   393: ldc_w 707
    //   396: ldc_w 709
    //   399: invokevirtual 627	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   402: astore_2
    //   403: aload_2
    //   404: astore 12
    //   406: aload 6
    //   408: astore 13
    //   410: aload_2
    //   411: astore 8
    //   413: aload_2
    //   414: invokeinterface 443 1 0
    //   419: istore 11
    //   421: iload 11
    //   423: ifne +12 -> 435
    //   426: aload_2
    //   427: invokeinterface 446 1 0
    //   432: aload 4
    //   434: areturn
    //   435: aload_2
    //   436: astore 12
    //   438: aload 6
    //   440: astore 13
    //   442: aload_2
    //   443: astore 8
    //   445: aload 4
    //   447: invokevirtual 675	java/util/ArrayList:size	()I
    //   450: sipush 1000
    //   453: if_icmplt +35 -> 488
    //   456: aload_2
    //   457: astore 12
    //   459: aload 6
    //   461: astore 13
    //   463: aload_2
    //   464: astore 8
    //   466: aload_0
    //   467: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   470: getfield 381	e7/a1:o	Le7/b1;
    //   473: ldc_w 1613
    //   476: sipush 1000
    //   479: invokestatic 389	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   482: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   485: goto +147 -> 632
    //   488: aload_2
    //   489: astore 12
    //   491: aload 6
    //   493: astore 13
    //   495: aload_2
    //   496: astore 8
    //   498: aload_2
    //   499: iconst_0
    //   500: invokeinterface 404 2 0
    //   505: astore 7
    //   507: aload_2
    //   508: astore 12
    //   510: aload 6
    //   512: astore 13
    //   514: aload_2
    //   515: astore 8
    //   517: aload_2
    //   518: iconst_1
    //   519: invokeinterface 415 2 0
    //   524: lstore 14
    //   526: aload_2
    //   527: astore 8
    //   529: aload_0
    //   530: iconst_2
    //   531: aload_2
    //   532: invokevirtual 713	e7/o:A	(ILandroid/database/Cursor;)Ljava/lang/Object;
    //   535: astore 12
    //   537: aload_2
    //   538: astore 8
    //   540: aload_2
    //   541: iconst_3
    //   542: invokeinterface 404 2 0
    //   547: astore 13
    //   549: aload 12
    //   551: ifnonnull +29 -> 580
    //   554: aload_2
    //   555: astore 8
    //   557: aload_0
    //   558: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   561: getfield 381	e7/a1:o	Le7/b1;
    //   564: aload_1
    //   565: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   568: aload 13
    //   570: aload_3
    //   571: ldc_w 1615
    //   574: invokevirtual 775	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   577: goto +39 -> 616
    //   580: aload_2
    //   581: astore 8
    //   583: new 1416	e7/s6
    //   586: astore 6
    //   588: aload_2
    //   589: astore 8
    //   591: aload 6
    //   593: aload_1
    //   594: aload 13
    //   596: aload 7
    //   598: lload 14
    //   600: aload 12
    //   602: invokespecial 1618	e7/s6:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   605: aload_2
    //   606: astore 8
    //   608: aload 4
    //   610: aload 6
    //   612: invokevirtual 648	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   615: pop
    //   616: aload_2
    //   617: astore 8
    //   619: aload_2
    //   620: invokeinterface 634 1 0
    //   625: istore 11
    //   627: iload 11
    //   629: ifne +12 -> 641
    //   632: aload_2
    //   633: invokeinterface 446 1 0
    //   638: aload 4
    //   640: areturn
    //   641: aload 13
    //   643: astore 6
    //   645: goto -210 -> 435
    //   648: astore_3
    //   649: goto +36 -> 685
    //   652: astore_3
    //   653: aload 6
    //   655: astore 13
    //   657: goto +28 -> 685
    //   660: astore_3
    //   661: aload 12
    //   663: astore_2
    //   664: goto +21 -> 685
    //   667: astore_3
    //   668: aload_2
    //   669: astore 13
    //   671: aload 6
    //   673: astore_2
    //   674: goto +11 -> 685
    //   677: astore_1
    //   678: goto +50 -> 728
    //   681: astore_3
    //   682: goto -14 -> 668
    //   685: aload_2
    //   686: astore 8
    //   688: aload_0
    //   689: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   692: getfield 381	e7/a1:o	Le7/b1;
    //   695: aload_1
    //   696: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   699: aload 13
    //   701: aload_3
    //   702: ldc_w 1620
    //   705: invokevirtual 775	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   708: aload_2
    //   709: astore 8
    //   711: invokestatic 561	java/util/Collections:emptyList	()Ljava/util/List;
    //   714: astore_1
    //   715: aload_2
    //   716: ifnull +9 -> 725
    //   719: aload_2
    //   720: invokeinterface 446 1 0
    //   725: aload_1
    //   726: areturn
    //   727: astore_1
    //   728: aload 8
    //   730: ifnull +10 -> 740
    //   733: aload 8
    //   735: invokeinterface 446 1 0
    //   740: aload_1
    //   741: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	742	0	this	o
    //   0	742	1	paramString1	String
    //   0	742	2	paramString2	String
    //   0	742	3	paramString3	String
    //   19	620	4	localArrayList	ArrayList
    //   22	331	5	localObject1	Object
    //   25	647	6	localObject2	Object
    //   28	569	7	str	String
    //   32	702	8	localObject3	Object
    //   37	353	9	localObject4	Object
    //   67	321	10	localObject5	Object
    //   89	539	11	bool	boolean
    //   101	561	12	localObject6	Object
    //   105	595	13	localObject7	Object
    //   524	75	14	l	long
    // Exception table:
    //   from	to	target	type
    //   557	577	648	android/database/sqlite/SQLiteException
    //   583	588	648	android/database/sqlite/SQLiteException
    //   591	605	648	android/database/sqlite/SQLiteException
    //   608	616	648	android/database/sqlite/SQLiteException
    //   619	627	648	android/database/sqlite/SQLiteException
    //   529	537	652	android/database/sqlite/SQLiteException
    //   540	549	652	android/database/sqlite/SQLiteException
    //   111	119	660	android/database/sqlite/SQLiteException
    //   131	140	660	android/database/sqlite/SQLiteException
    //   158	165	660	android/database/sqlite/SQLiteException
    //   177	181	660	android/database/sqlite/SQLiteException
    //   193	197	660	android/database/sqlite/SQLiteException
    //   209	215	660	android/database/sqlite/SQLiteException
    //   227	235	660	android/database/sqlite/SQLiteException
    //   247	257	660	android/database/sqlite/SQLiteException
    //   269	278	660	android/database/sqlite/SQLiteException
    //   290	308	660	android/database/sqlite/SQLiteException
    //   320	325	660	android/database/sqlite/SQLiteException
    //   337	344	660	android/database/sqlite/SQLiteException
    //   356	403	660	android/database/sqlite/SQLiteException
    //   413	421	660	android/database/sqlite/SQLiteException
    //   445	456	660	android/database/sqlite/SQLiteException
    //   466	485	660	android/database/sqlite/SQLiteException
    //   498	507	660	android/database/sqlite/SQLiteException
    //   517	526	660	android/database/sqlite/SQLiteException
    //   53	60	667	android/database/sqlite/SQLiteException
    //   64	69	667	android/database/sqlite/SQLiteException
    //   73	81	667	android/database/sqlite/SQLiteException
    //   85	91	667	android/database/sqlite/SQLiteException
    //   34	39	677	finally
    //   43	49	677	finally
    //   53	60	677	finally
    //   64	69	677	finally
    //   73	81	677	finally
    //   85	91	677	finally
    //   111	119	677	finally
    //   131	140	677	finally
    //   158	165	677	finally
    //   177	181	677	finally
    //   193	197	677	finally
    //   209	215	677	finally
    //   227	235	677	finally
    //   247	257	677	finally
    //   269	278	677	finally
    //   290	308	677	finally
    //   320	325	677	finally
    //   337	344	677	finally
    //   356	403	677	finally
    //   413	421	677	finally
    //   445	456	677	finally
    //   466	485	677	finally
    //   498	507	677	finally
    //   517	526	677	finally
    //   34	39	681	android/database/sqlite/SQLiteException
    //   43	49	681	android/database/sqlite/SQLiteException
    //   529	537	727	finally
    //   540	549	727	finally
    //   557	577	727	finally
    //   583	588	727	finally
    //   591	605	727	finally
    //   608	616	727	finally
    //   619	627	727	finally
    //   688	708	727	finally
    //   711	715	727	finally
  }
  
  public final void e0(Long paramLong)
  {
    l();
    p();
    m6.j.i(paramLong);
    if (!h().x(null, h0.I0)) {
      return;
    }
    if (!Y()) {
      return;
    }
    Object localObject = new StringBuilder("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
    ((StringBuilder)localObject).append(paramLong);
    ((StringBuilder)localObject).append(" AND retry_count =  2147483647 LIMIT 1");
    if (b0(((StringBuilder)localObject).toString(), null) > 0L) {
      zzjr.b("The number of upload retries exceeds the limit. Will remain unchanged.");
    }
    try
    {
      localObject = s();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = ");
      localStringBuilder.append(paramLong);
      localStringBuilder.append(" AND retry_count < 2147483647");
      ((SQLiteDatabase)localObject).execSQL(localStringBuilder.toString());
      return;
    }
    catch (SQLiteException paramLong)
    {
      zzjo.c("Error incrementing retry count. error", paramLong);
    }
  }
  
  public final void f0(String paramString, e3 parame3)
  {
    m6.j.i(paramString);
    m6.j.i(parame3);
    l();
    p();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramString);
    localContentValues.put("consent_state", parame3.n());
    localContentValues.put("consent_source", Integer.valueOf(b));
    F(localContentValues);
  }
  
  public final void g0(String paramString, ArrayList paramArrayList)
  {
    m6.j.e(paramString);
    p();
    l();
    SQLiteDatabase localSQLiteDatabase = s();
    try
    {
      long l = b0("select count(1) from audience_filter_values where app_id=?", new String[] { paramString });
      int i = Math.max(0, Math.min(2000, h().q(paramString, h0.Q)));
      if (l <= i) {
        return;
      }
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < paramArrayList.size(); j++)
      {
        Integer localInteger = (Integer)paramArrayList.get(j);
        if (localInteger == null) {
          return;
        }
        localArrayList.add(Integer.toString(localInteger.intValue()));
      }
      localSQLiteDatabase.delete("audience_filter_values", a0.j.j("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a0.j.j("(", TextUtils.join(",", localArrayList), ")"), " order by rowid desc limit -1 offset ?)"), new String[] { paramString, Integer.toString(i) });
      return;
    }
    catch (SQLiteException paramArrayList)
    {
      zzjo.d("Database error querying filters. appId", a1.p(paramString), paramArrayList);
    }
  }
  
  public final long h0(String paramString)
  {
    m6.j.e(paramString);
    return w("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { paramString }, 0L);
  }
  
  /* Error */
  public final f i0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_2
    //   5: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   8: aload_0
    //   9: invokevirtual 458	d2/q:l	()V
    //   12: aload_0
    //   13: invokevirtual 423	e7/h6:p	()V
    //   16: aconst_null
    //   17: astore_3
    //   18: aload_0
    //   19: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: ldc_w 687
    //   25: bipush 11
    //   27: anewarray 24	java/lang/String
    //   30: dup
    //   31: iconst_0
    //   32: ldc 58
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: ldc_w 333
    //   40: aastore
    //   41: dup
    //   42: iconst_2
    //   43: ldc_w 691
    //   46: aastore
    //   47: dup
    //   48: iconst_3
    //   49: ldc_w 693
    //   52: aastore
    //   53: dup
    //   54: iconst_4
    //   55: ldc_w 695
    //   58: aastore
    //   59: dup
    //   60: iconst_5
    //   61: ldc_w 697
    //   64: aastore
    //   65: dup
    //   66: bipush 6
    //   68: ldc_w 621
    //   71: aastore
    //   72: dup
    //   73: bipush 7
    //   75: ldc_w 699
    //   78: aastore
    //   79: dup
    //   80: bipush 8
    //   82: ldc_w 701
    //   85: aastore
    //   86: dup
    //   87: bipush 9
    //   89: ldc_w 703
    //   92: aastore
    //   93: dup
    //   94: bipush 10
    //   96: ldc_w 705
    //   99: aastore
    //   100: ldc_w 1325
    //   103: iconst_2
    //   104: anewarray 24	java/lang/String
    //   107: dup
    //   108: iconst_0
    //   109: aload_1
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: aload_2
    //   114: aastore
    //   115: aconst_null
    //   116: aconst_null
    //   117: aconst_null
    //   118: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   121: astore 4
    //   123: aload 4
    //   125: invokeinterface 443 1 0
    //   130: istore 5
    //   132: iload 5
    //   134: ifne +12 -> 146
    //   137: aload 4
    //   139: invokeinterface 446 1 0
    //   144: aconst_null
    //   145: areturn
    //   146: aload 4
    //   148: iconst_0
    //   149: invokeinterface 404 2 0
    //   154: astore_3
    //   155: aload_3
    //   156: astore 6
    //   158: aload_3
    //   159: ifnonnull +8 -> 167
    //   162: ldc_w 448
    //   165: astore 6
    //   167: aload 4
    //   169: astore_3
    //   170: aload_0
    //   171: iconst_1
    //   172: aload 4
    //   174: invokevirtual 713	e7/o:A	(ILandroid/database/Cursor;)Ljava/lang/Object;
    //   177: astore 7
    //   179: aload 4
    //   181: astore_3
    //   182: aload 4
    //   184: iconst_2
    //   185: invokeinterface 641 2 0
    //   190: ifeq +9 -> 199
    //   193: iconst_1
    //   194: istore 5
    //   196: goto +6 -> 202
    //   199: iconst_0
    //   200: istore 5
    //   202: aload 4
    //   204: astore_3
    //   205: aload 4
    //   207: iconst_3
    //   208: invokeinterface 404 2 0
    //   213: astore 8
    //   215: aload 4
    //   217: astore_3
    //   218: aload 4
    //   220: iconst_4
    //   221: invokeinterface 415 2 0
    //   226: lstore 9
    //   228: aload 4
    //   230: astore_3
    //   231: aload_0
    //   232: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   235: astore 11
    //   237: aload 4
    //   239: astore_3
    //   240: aload 4
    //   242: iconst_5
    //   243: invokeinterface 638 2 0
    //   248: astore 12
    //   250: aload 4
    //   252: astore_3
    //   253: getstatic 723	e7/f0:CREATOR	Landroid/os/Parcelable$Creator;
    //   256: astore 13
    //   258: aload 4
    //   260: astore_3
    //   261: aload 11
    //   263: aload 12
    //   265: aload 13
    //   267: invokevirtual 728	e7/o6:w	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   270: checkcast 719	e7/f0
    //   273: astore 12
    //   275: aload 4
    //   277: astore_3
    //   278: aload 4
    //   280: bipush 6
    //   282: invokeinterface 415 2 0
    //   287: lstore 14
    //   289: aload 4
    //   291: astore_3
    //   292: aload_0
    //   293: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   296: aload 4
    //   298: bipush 7
    //   300: invokeinterface 638 2 0
    //   305: aload 13
    //   307: invokevirtual 728	e7/o6:w	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   310: checkcast 719	e7/f0
    //   313: astore 11
    //   315: aload 4
    //   317: astore_3
    //   318: aload 4
    //   320: bipush 8
    //   322: invokeinterface 415 2 0
    //   327: lstore 16
    //   329: aload 4
    //   331: astore_3
    //   332: aload 4
    //   334: bipush 9
    //   336: invokeinterface 415 2 0
    //   341: lstore 18
    //   343: aload 4
    //   345: astore_3
    //   346: aload_0
    //   347: invokevirtual 717	e7/z5:m	()Le7/o6;
    //   350: aload 4
    //   352: bipush 10
    //   354: invokeinterface 638 2 0
    //   359: aload 13
    //   361: invokevirtual 728	e7/o6:w	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   364: checkcast 719	e7/f0
    //   367: astore 13
    //   369: aload 4
    //   371: astore_3
    //   372: new 730	e7/q6
    //   375: astore 20
    //   377: aload 4
    //   379: astore_3
    //   380: aload 20
    //   382: aload_2
    //   383: aload 6
    //   385: lload 16
    //   387: aload 7
    //   389: invokespecial 733	e7/q6:<init>	(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   392: aload 4
    //   394: astore_3
    //   395: new 735	e7/f
    //   398: astore 7
    //   400: aload 4
    //   402: astore_3
    //   403: aload 7
    //   405: aload_1
    //   406: aload 6
    //   408: aload 20
    //   410: lload 14
    //   412: iload 5
    //   414: aload 8
    //   416: aload 12
    //   418: lload 9
    //   420: aload 11
    //   422: lload 18
    //   424: aload 13
    //   426: invokespecial 738	e7/f:<init>	(Ljava/lang/String;Ljava/lang/String;Le7/q6;JZLjava/lang/String;Le7/f0;JLe7/f0;JLe7/f0;)V
    //   429: aload 4
    //   431: astore_3
    //   432: aload 4
    //   434: invokeinterface 634 1 0
    //   439: ifeq +31 -> 470
    //   442: aload 4
    //   444: astore_3
    //   445: aload_0
    //   446: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   449: getfield 381	e7/a1:o	Le7/b1;
    //   452: ldc_w 1671
    //   455: aload_1
    //   456: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   459: aload_0
    //   460: invokevirtual 1118	d2/q:i	()Le7/x0;
    //   463: aload_2
    //   464: invokevirtual 1327	e7/x0:g	(Ljava/lang/String;)Ljava/lang/String;
    //   467: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   470: aload 4
    //   472: invokeinterface 446 1 0
    //   477: aload 7
    //   479: areturn
    //   480: astore 6
    //   482: goto +23 -> 505
    //   485: astore_1
    //   486: goto +67 -> 553
    //   489: astore 6
    //   491: goto +14 -> 505
    //   494: astore_1
    //   495: aload_3
    //   496: astore_2
    //   497: goto +59 -> 556
    //   500: astore 6
    //   502: aconst_null
    //   503: astore 4
    //   505: aload 4
    //   507: astore_3
    //   508: aload_0
    //   509: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   512: getfield 381	e7/a1:o	Le7/b1;
    //   515: aload_1
    //   516: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   519: aload_0
    //   520: invokevirtual 1118	d2/q:i	()Le7/x0;
    //   523: aload_2
    //   524: invokevirtual 1327	e7/x0:g	(Ljava/lang/String;)Ljava/lang/String;
    //   527: aload 6
    //   529: ldc_w 1673
    //   532: invokevirtual 775	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   535: aload 4
    //   537: ifnull +10 -> 547
    //   540: aload 4
    //   542: invokeinterface 446 1 0
    //   547: aconst_null
    //   548: areturn
    //   549: astore_1
    //   550: aload_3
    //   551: astore 4
    //   553: aload 4
    //   555: astore_2
    //   556: aload_2
    //   557: ifnull +9 -> 566
    //   560: aload_2
    //   561: invokeinterface 446 1 0
    //   566: aload_1
    //   567: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	568	0	this	o
    //   0	568	1	paramString1	String
    //   0	568	2	paramString2	String
    //   17	534	3	localObject1	Object
    //   121	433	4	localObject2	Object
    //   130	283	5	bool	boolean
    //   156	251	6	localObject3	Object
    //   480	1	6	localSQLiteException1	SQLiteException
    //   489	1	6	localSQLiteException2	SQLiteException
    //   500	28	6	localSQLiteException3	SQLiteException
    //   177	301	7	localObject4	Object
    //   213	202	8	str	String
    //   226	193	9	l1	long
    //   235	186	11	localObject5	Object
    //   248	169	12	localObject6	Object
    //   256	169	13	localObject7	Object
    //   287	124	14	l2	long
    //   327	59	16	l3	long
    //   341	82	18	l4	long
    //   375	34	20	localq6	q6
    // Exception table:
    //   from	to	target	type
    //   170	179	480	android/database/sqlite/SQLiteException
    //   182	193	480	android/database/sqlite/SQLiteException
    //   205	215	480	android/database/sqlite/SQLiteException
    //   218	228	480	android/database/sqlite/SQLiteException
    //   231	237	480	android/database/sqlite/SQLiteException
    //   240	250	480	android/database/sqlite/SQLiteException
    //   253	258	480	android/database/sqlite/SQLiteException
    //   261	275	480	android/database/sqlite/SQLiteException
    //   278	289	480	android/database/sqlite/SQLiteException
    //   292	315	480	android/database/sqlite/SQLiteException
    //   318	329	480	android/database/sqlite/SQLiteException
    //   332	343	480	android/database/sqlite/SQLiteException
    //   346	369	480	android/database/sqlite/SQLiteException
    //   372	377	480	android/database/sqlite/SQLiteException
    //   380	392	480	android/database/sqlite/SQLiteException
    //   395	400	480	android/database/sqlite/SQLiteException
    //   403	429	480	android/database/sqlite/SQLiteException
    //   432	442	480	android/database/sqlite/SQLiteException
    //   445	470	480	android/database/sqlite/SQLiteException
    //   123	132	485	finally
    //   146	155	485	finally
    //   123	132	489	android/database/sqlite/SQLiteException
    //   146	155	489	android/database/sqlite/SQLiteException
    //   18	123	494	finally
    //   18	123	500	android/database/sqlite/SQLiteException
    //   170	179	549	finally
    //   182	193	549	finally
    //   205	215	549	finally
    //   218	228	549	finally
    //   231	237	549	finally
    //   240	250	549	finally
    //   253	258	549	finally
    //   261	275	549	finally
    //   278	289	549	finally
    //   292	315	549	finally
    //   318	329	549	finally
    //   332	343	549	finally
    //   346	369	549	finally
    //   372	377	549	finally
    //   380	392	549	finally
    //   395	400	549	finally
    //   403	429	549	finally
    //   432	442	549	finally
    //   445	470	549	finally
    //   508	535	549	finally
  }
  
  /* Error */
  public final b0 j0(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_3
    //   5: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   8: aload_0
    //   9: invokevirtual 458	d2/q:l	()V
    //   12: aload_0
    //   13: invokevirtual 423	e7/h6:p	()V
    //   16: new 629	java/util/ArrayList
    //   19: dup
    //   20: bipush 9
    //   22: anewarray 24	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc_w 1047
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: ldc_w 1051
    //   36: aastore
    //   37: dup
    //   38: iconst_2
    //   39: ldc_w 1055
    //   42: aastore
    //   43: dup
    //   44: iconst_3
    //   45: ldc 26
    //   47: aastore
    //   48: dup
    //   49: iconst_4
    //   50: ldc 30
    //   52: aastore
    //   53: dup
    //   54: iconst_5
    //   55: ldc 34
    //   57: aastore
    //   58: dup
    //   59: bipush 6
    //   61: ldc 38
    //   63: aastore
    //   64: dup
    //   65: bipush 7
    //   67: ldc 42
    //   69: aastore
    //   70: dup
    //   71: bipush 8
    //   73: ldc 46
    //   75: aastore
    //   76: invokestatic 1681	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   79: invokespecial 1684	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   82: astore 4
    //   84: aconst_null
    //   85: astore 5
    //   87: aload_0
    //   88: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   91: astore 6
    //   93: iconst_0
    //   94: istore 7
    //   96: aload 6
    //   98: aload_1
    //   99: aload 4
    //   101: iconst_0
    //   102: anewarray 24	java/lang/String
    //   105: invokevirtual 679	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   108: checkcast 680	[Ljava/lang/String;
    //   111: ldc_w 1325
    //   114: iconst_2
    //   115: anewarray 24	java/lang/String
    //   118: dup
    //   119: iconst_0
    //   120: aload_2
    //   121: aastore
    //   122: dup
    //   123: iconst_1
    //   124: aload_3
    //   125: aastore
    //   126: aconst_null
    //   127: aconst_null
    //   128: aconst_null
    //   129: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   132: astore 6
    //   134: aload 6
    //   136: astore_1
    //   137: aload_1
    //   138: invokeinterface 443 1 0
    //   143: istore 8
    //   145: iload 8
    //   147: ifne +11 -> 158
    //   150: aload_1
    //   151: invokeinterface 446 1 0
    //   156: aconst_null
    //   157: areturn
    //   158: aload_1
    //   159: iconst_0
    //   160: invokeinterface 415 2 0
    //   165: lstore 9
    //   167: aload_1
    //   168: iconst_1
    //   169: invokeinterface 415 2 0
    //   174: lstore 11
    //   176: aload_1
    //   177: iconst_2
    //   178: invokeinterface 415 2 0
    //   183: lstore 13
    //   185: aload_1
    //   186: iconst_3
    //   187: invokeinterface 1688 2 0
    //   192: ifeq +9 -> 201
    //   195: lconst_0
    //   196: lstore 15
    //   198: goto +12 -> 210
    //   201: aload_1
    //   202: iconst_3
    //   203: invokeinterface 415 2 0
    //   208: lstore 15
    //   210: aload_1
    //   211: iconst_4
    //   212: invokeinterface 1688 2 0
    //   217: ifeq +9 -> 226
    //   220: aconst_null
    //   221: astore 4
    //   223: goto +15 -> 238
    //   226: aload_1
    //   227: iconst_4
    //   228: invokeinterface 415 2 0
    //   233: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   236: astore 4
    //   238: aload_1
    //   239: iconst_5
    //   240: invokeinterface 1688 2 0
    //   245: ifeq +9 -> 254
    //   248: aconst_null
    //   249: astore 17
    //   251: goto +15 -> 266
    //   254: aload_1
    //   255: iconst_5
    //   256: invokeinterface 415 2 0
    //   261: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   264: astore 17
    //   266: aload_1
    //   267: bipush 6
    //   269: invokeinterface 1688 2 0
    //   274: ifeq +9 -> 283
    //   277: aconst_null
    //   278: astore 18
    //   280: goto +16 -> 296
    //   283: aload_1
    //   284: bipush 6
    //   286: invokeinterface 415 2 0
    //   291: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   294: astore 18
    //   296: aload_1
    //   297: bipush 7
    //   299: invokeinterface 1688 2 0
    //   304: istore 8
    //   306: iload 8
    //   308: ifne +37 -> 345
    //   311: aload_1
    //   312: astore 5
    //   314: aload_1
    //   315: bipush 7
    //   317: invokeinterface 415 2 0
    //   322: lconst_1
    //   323: lcmp
    //   324: ifne +6 -> 330
    //   327: iconst_1
    //   328: istore 7
    //   330: iload 7
    //   332: invokestatic 919	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   335: astore 5
    //   337: goto +11 -> 348
    //   340: astore 6
    //   342: goto +138 -> 480
    //   345: aconst_null
    //   346: astore 5
    //   348: aload_1
    //   349: bipush 8
    //   351: invokeinterface 1688 2 0
    //   356: ifeq +9 -> 365
    //   359: lconst_0
    //   360: lstore 19
    //   362: goto +13 -> 375
    //   365: aload_1
    //   366: bipush 8
    //   368: invokeinterface 415 2 0
    //   373: lstore 19
    //   375: new 1041	e7/b0
    //   378: astore 21
    //   380: aload 21
    //   382: aload_2
    //   383: aload_3
    //   384: lload 9
    //   386: lload 11
    //   388: lload 19
    //   390: lload 13
    //   392: lload 15
    //   394: aload 4
    //   396: aload 17
    //   398: aload 18
    //   400: aload 5
    //   402: invokespecial 1691	e7/b0:<init>	(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    //   405: aload_1
    //   406: invokeinterface 634 1 0
    //   411: ifeq +20 -> 431
    //   414: aload_0
    //   415: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   418: getfield 381	e7/a1:o	Le7/b1;
    //   421: ldc_w 1693
    //   424: aload_2
    //   425: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   428: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   431: aload_1
    //   432: invokeinterface 446 1 0
    //   437: aload 21
    //   439: areturn
    //   440: astore_1
    //   441: goto +8 -> 449
    //   444: astore_1
    //   445: goto +11 -> 456
    //   448: astore_1
    //   449: aload 6
    //   451: astore_2
    //   452: goto +74 -> 526
    //   455: astore_1
    //   456: aload 6
    //   458: astore 5
    //   460: aload_1
    //   461: astore 6
    //   463: aload 5
    //   465: astore_1
    //   466: goto +14 -> 480
    //   469: astore_1
    //   470: aload 5
    //   472: astore_2
    //   473: goto +53 -> 526
    //   476: astore 6
    //   478: aconst_null
    //   479: astore_1
    //   480: aload_1
    //   481: astore 5
    //   483: aload_0
    //   484: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   487: getfield 381	e7/a1:o	Le7/b1;
    //   490: aload_2
    //   491: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   494: aload_0
    //   495: invokevirtual 1118	d2/q:i	()Le7/x0;
    //   498: aload_3
    //   499: invokevirtual 1122	e7/x0:c	(Ljava/lang/String;)Ljava/lang/String;
    //   502: aload 6
    //   504: ldc_w 1695
    //   507: invokevirtual 775	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   510: aload_1
    //   511: ifnull +9 -> 520
    //   514: aload_1
    //   515: invokeinterface 446 1 0
    //   520: aconst_null
    //   521: areturn
    //   522: astore_1
    //   523: aload 5
    //   525: astore_2
    //   526: aload_2
    //   527: ifnull +9 -> 536
    //   530: aload_2
    //   531: invokeinterface 446 1 0
    //   536: aload_1
    //   537: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	538	0	this	o
    //   0	538	1	paramString1	String
    //   0	538	2	paramString2	String
    //   0	538	3	paramString3	String
    //   82	313	4	localObject1	Object
    //   85	439	5	localObject2	Object
    //   91	44	6	localObject3	Object
    //   340	117	6	localSQLiteException1	SQLiteException
    //   461	1	6	str	String
    //   476	27	6	localSQLiteException2	SQLiteException
    //   94	237	7	bool1	boolean
    //   143	164	8	bool2	boolean
    //   165	220	9	l1	long
    //   174	213	11	l2	long
    //   183	208	13	l3	long
    //   196	197	15	l4	long
    //   249	148	17	localLong1	Long
    //   278	121	18	localLong2	Long
    //   360	29	19	l5	long
    //   378	60	21	localb0	b0
    // Exception table:
    //   from	to	target	type
    //   314	327	340	android/database/sqlite/SQLiteException
    //   380	431	440	finally
    //   380	431	444	android/database/sqlite/SQLiteException
    //   137	145	448	finally
    //   158	195	448	finally
    //   201	210	448	finally
    //   210	220	448	finally
    //   226	238	448	finally
    //   238	248	448	finally
    //   254	266	448	finally
    //   266	277	448	finally
    //   283	296	448	finally
    //   296	306	448	finally
    //   348	359	448	finally
    //   365	375	448	finally
    //   375	380	448	finally
    //   137	145	455	android/database/sqlite/SQLiteException
    //   158	195	455	android/database/sqlite/SQLiteException
    //   201	210	455	android/database/sqlite/SQLiteException
    //   210	220	455	android/database/sqlite/SQLiteException
    //   226	238	455	android/database/sqlite/SQLiteException
    //   238	248	455	android/database/sqlite/SQLiteException
    //   254	266	455	android/database/sqlite/SQLiteException
    //   266	277	455	android/database/sqlite/SQLiteException
    //   283	296	455	android/database/sqlite/SQLiteException
    //   296	306	455	android/database/sqlite/SQLiteException
    //   348	359	455	android/database/sqlite/SQLiteException
    //   365	375	455	android/database/sqlite/SQLiteException
    //   375	380	455	android/database/sqlite/SQLiteException
    //   87	93	469	finally
    //   96	134	469	finally
    //   87	93	476	android/database/sqlite/SQLiteException
    //   96	134	476	android/database/sqlite/SQLiteException
    //   314	327	522	finally
    //   483	510	522	finally
  }
  
  public final b0 k0(String paramString1, String paramString2)
  {
    return j0("events", paramString1, paramString2);
  }
  
  /* Error */
  public final k1 l0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_0
    //   9: invokevirtual 423	e7/h6:p	()V
    //   12: aconst_null
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore_3
    //   19: iconst_1
    //   20: istore 4
    //   22: aload_3
    //   23: ldc_w 1022
    //   26: bipush 45
    //   28: anewarray 24	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc_w 858
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: ldc_w 872
    //   42: aastore
    //   43: dup
    //   44: iconst_2
    //   45: ldc_w 890
    //   48: aastore
    //   49: dup
    //   50: iconst_3
    //   51: ldc_w 895
    //   54: aastore
    //   55: dup
    //   56: iconst_4
    //   57: ldc 84
    //   59: aastore
    //   60: dup
    //   61: iconst_5
    //   62: ldc_w 901
    //   65: aastore
    //   66: dup
    //   67: bipush 6
    //   69: ldc 64
    //   71: aastore
    //   72: dup
    //   73: bipush 7
    //   75: ldc 68
    //   77: aastore
    //   78: dup
    //   79: bipush 8
    //   81: ldc 72
    //   83: aastore
    //   84: dup
    //   85: bipush 9
    //   87: ldc 76
    //   89: aastore
    //   90: dup
    //   91: bipush 10
    //   93: ldc 80
    //   95: aastore
    //   96: dup
    //   97: bipush 11
    //   99: ldc 88
    //   101: aastore
    //   102: dup
    //   103: bipush 12
    //   105: ldc 92
    //   107: aastore
    //   108: dup
    //   109: bipush 13
    //   111: ldc 96
    //   113: aastore
    //   114: dup
    //   115: bipush 14
    //   117: ldc 100
    //   119: aastore
    //   120: dup
    //   121: bipush 15
    //   123: ldc 108
    //   125: aastore
    //   126: dup
    //   127: bipush 16
    //   129: ldc 112
    //   131: aastore
    //   132: dup
    //   133: bipush 17
    //   135: ldc 116
    //   137: aastore
    //   138: dup
    //   139: bipush 18
    //   141: ldc 120
    //   143: aastore
    //   144: dup
    //   145: bipush 19
    //   147: ldc 124
    //   149: aastore
    //   150: dup
    //   151: bipush 20
    //   153: ldc -128
    //   155: aastore
    //   156: dup
    //   157: bipush 21
    //   159: ldc -124
    //   161: aastore
    //   162: dup
    //   163: bipush 22
    //   165: ldc -120
    //   167: aastore
    //   168: dup
    //   169: bipush 23
    //   171: ldc -116
    //   173: aastore
    //   174: dup
    //   175: bipush 24
    //   177: ldc -108
    //   179: aastore
    //   180: dup
    //   181: bipush 25
    //   183: ldc -100
    //   185: aastore
    //   186: dup
    //   187: bipush 26
    //   189: ldc -96
    //   191: aastore
    //   192: dup
    //   193: bipush 27
    //   195: ldc -92
    //   197: aastore
    //   198: dup
    //   199: bipush 28
    //   201: ldc -80
    //   203: aastore
    //   204: dup
    //   205: bipush 29
    //   207: ldc -76
    //   209: aastore
    //   210: dup
    //   211: bipush 30
    //   213: ldc -72
    //   215: aastore
    //   216: dup
    //   217: bipush 31
    //   219: ldc -68
    //   221: aastore
    //   222: dup
    //   223: bipush 32
    //   225: ldc -64
    //   227: aastore
    //   228: dup
    //   229: bipush 33
    //   231: ldc -60
    //   233: aastore
    //   234: dup
    //   235: bipush 34
    //   237: ldc -56
    //   239: aastore
    //   240: dup
    //   241: bipush 35
    //   243: ldc -52
    //   245: aastore
    //   246: dup
    //   247: bipush 36
    //   249: ldc -48
    //   251: aastore
    //   252: dup
    //   253: bipush 37
    //   255: ldc -44
    //   257: aastore
    //   258: dup
    //   259: bipush 38
    //   261: ldc -40
    //   263: aastore
    //   264: dup
    //   265: bipush 39
    //   267: ldc -36
    //   269: aastore
    //   270: dup
    //   271: bipush 40
    //   273: ldc -32
    //   275: aastore
    //   276: dup
    //   277: bipush 41
    //   279: ldc -28
    //   281: aastore
    //   282: dup
    //   283: bipush 42
    //   285: ldc -24
    //   287: aastore
    //   288: dup
    //   289: bipush 43
    //   291: ldc -20
    //   293: aastore
    //   294: dup
    //   295: bipush 44
    //   297: ldc -12
    //   299: aastore
    //   300: ldc_w 593
    //   303: iconst_1
    //   304: anewarray 24	java/lang/String
    //   307: dup
    //   308: iconst_0
    //   309: aload_1
    //   310: aastore
    //   311: aconst_null
    //   312: aconst_null
    //   313: aconst_null
    //   314: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   317: astore_3
    //   318: aload_3
    //   319: astore_2
    //   320: aload_3
    //   321: invokeinterface 443 1 0
    //   326: istore 5
    //   328: iload 5
    //   330: ifne +11 -> 341
    //   333: aload_3
    //   334: invokeinterface 446 1 0
    //   339: aconst_null
    //   340: areturn
    //   341: aload_3
    //   342: astore_2
    //   343: new 854	e7/k1
    //   346: astore 6
    //   348: aload_3
    //   349: astore_2
    //   350: aload 6
    //   352: aload_0
    //   353: getfield 466	e7/z5:c	Le7/i6;
    //   356: getfield 1703	e7/i6:t	Le7/j2;
    //   359: aload_1
    //   360: invokespecial 1706	e7/k1:<init>	(Le7/j2;Ljava/lang/String;)V
    //   363: aload_3
    //   364: astore_2
    //   365: aload_0
    //   366: getfield 466	e7/z5:c	Le7/i6;
    //   369: aload_1
    //   370: invokevirtual 861	e7/i6:H	(Ljava/lang/String;)Le7/e3;
    //   373: astore 7
    //   375: aload_3
    //   376: astore_2
    //   377: getstatic 852	e7/e3$a:c	Le7/e3$a;
    //   380: astore 8
    //   382: aload_3
    //   383: astore_2
    //   384: aload 7
    //   386: aload 8
    //   388: invokevirtual 867	e7/e3:j	(Le7/e3$a;)Z
    //   391: ifeq +17 -> 408
    //   394: aload_3
    //   395: astore_2
    //   396: aload 6
    //   398: aload_3
    //   399: iconst_0
    //   400: invokeinterface 404 2 0
    //   405: invokevirtual 1708	e7/k1:o	(Ljava/lang/String;)V
    //   408: aload_3
    //   409: astore_2
    //   410: aload 6
    //   412: aload_3
    //   413: iconst_1
    //   414: invokeinterface 404 2 0
    //   419: invokevirtual 1710	e7/k1:y	(Ljava/lang/String;)V
    //   422: aload_3
    //   423: astore_2
    //   424: aload_0
    //   425: getfield 466	e7/z5:c	Le7/i6;
    //   428: aload_1
    //   429: invokevirtual 861	e7/i6:H	(Ljava/lang/String;)Le7/e3;
    //   432: getstatic 876	e7/e3$a:b	Le7/e3$a;
    //   435: invokevirtual 867	e7/e3:j	(Le7/e3$a;)Z
    //   438: ifeq +17 -> 455
    //   441: aload_3
    //   442: astore_2
    //   443: aload 6
    //   445: aload_3
    //   446: iconst_2
    //   447: invokeinterface 404 2 0
    //   452: invokevirtual 1712	e7/k1:A	(Ljava/lang/String;)V
    //   455: aload_3
    //   456: astore_2
    //   457: aload 6
    //   459: aload_3
    //   460: iconst_3
    //   461: invokeinterface 415 2 0
    //   466: invokevirtual 1714	e7/k1:G	(J)V
    //   469: aload_3
    //   470: astore_2
    //   471: aload 6
    //   473: aload_3
    //   474: iconst_4
    //   475: invokeinterface 415 2 0
    //   480: invokevirtual 1716	e7/k1:H	(J)V
    //   483: aload_3
    //   484: astore_2
    //   485: aload 6
    //   487: aload_3
    //   488: iconst_5
    //   489: invokeinterface 415 2 0
    //   494: invokevirtual 1718	e7/k1:F	(J)V
    //   497: aload_3
    //   498: astore_2
    //   499: aload 6
    //   501: aload_3
    //   502: bipush 6
    //   504: invokeinterface 404 2 0
    //   509: invokevirtual 1720	e7/k1:v	(Ljava/lang/String;)V
    //   512: aload_3
    //   513: astore_2
    //   514: aload 6
    //   516: aload_3
    //   517: bipush 7
    //   519: invokeinterface 404 2 0
    //   524: invokevirtual 1722	e7/k1:s	(Ljava/lang/String;)V
    //   527: aload_3
    //   528: astore_2
    //   529: aload 6
    //   531: aload_3
    //   532: bipush 8
    //   534: invokeinterface 415 2 0
    //   539: invokevirtual 1724	e7/k1:D	(J)V
    //   542: aload_3
    //   543: astore_2
    //   544: aload 6
    //   546: aload_3
    //   547: bipush 9
    //   549: invokeinterface 415 2 0
    //   554: invokevirtual 1726	e7/k1:B	(J)V
    //   557: aload_3
    //   558: astore_2
    //   559: aload_3
    //   560: bipush 10
    //   562: invokeinterface 1688 2 0
    //   567: ifne +25 -> 592
    //   570: aload_3
    //   571: astore_2
    //   572: aload_3
    //   573: bipush 10
    //   575: invokeinterface 641 2 0
    //   580: ifeq +6 -> 586
    //   583: goto +9 -> 592
    //   586: iconst_0
    //   587: istore 5
    //   589: goto +6 -> 595
    //   592: iconst_1
    //   593: istore 5
    //   595: aload_3
    //   596: astore_2
    //   597: aload 6
    //   599: iload 5
    //   601: invokevirtual 1729	e7/k1:p	(Z)V
    //   604: aload_3
    //   605: astore_2
    //   606: aload_3
    //   607: bipush 11
    //   609: invokeinterface 415 2 0
    //   614: lstore 9
    //   616: aload_3
    //   617: astore_2
    //   618: aload 6
    //   620: getfield 879	e7/k1:a	Le7/j2;
    //   623: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   626: invokevirtual 888	e7/e2:l	()V
    //   629: aload_3
    //   630: astore_2
    //   631: aload 6
    //   633: getfield 1731	e7/k1:R	Z
    //   636: istore 5
    //   638: aload_3
    //   639: astore_2
    //   640: aload 6
    //   642: getfield 925	e7/k1:K	J
    //   645: lload 9
    //   647: lcmp
    //   648: ifeq +9 -> 657
    //   651: iconst_1
    //   652: istore 11
    //   654: goto +6 -> 660
    //   657: iconst_0
    //   658: istore 11
    //   660: aload_3
    //   661: astore_2
    //   662: aload 6
    //   664: iload 5
    //   666: iload 11
    //   668: ior
    //   669: putfield 1731	e7/k1:R	Z
    //   672: aload_3
    //   673: astore_2
    //   674: aload 6
    //   676: lload 9
    //   678: putfield 925	e7/k1:K	J
    //   681: aload_3
    //   682: astore_2
    //   683: aload_3
    //   684: bipush 12
    //   686: invokeinterface 415 2 0
    //   691: lstore 9
    //   693: aload_3
    //   694: astore_2
    //   695: aload 6
    //   697: getfield 879	e7/k1:a	Le7/j2;
    //   700: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   703: invokevirtual 888	e7/e2:l	()V
    //   706: aload_3
    //   707: astore_2
    //   708: aload 6
    //   710: getfield 1731	e7/k1:R	Z
    //   713: istore 5
    //   715: aload_3
    //   716: astore_2
    //   717: aload 6
    //   719: getfield 927	e7/k1:L	J
    //   722: lload 9
    //   724: lcmp
    //   725: ifeq +9 -> 734
    //   728: iconst_1
    //   729: istore 11
    //   731: goto +6 -> 737
    //   734: iconst_0
    //   735: istore 11
    //   737: aload_3
    //   738: astore_2
    //   739: aload 6
    //   741: iload 5
    //   743: iload 11
    //   745: ior
    //   746: putfield 1731	e7/k1:R	Z
    //   749: aload_3
    //   750: astore_2
    //   751: aload 6
    //   753: lload 9
    //   755: putfield 927	e7/k1:L	J
    //   758: aload_3
    //   759: astore_2
    //   760: aload_3
    //   761: bipush 13
    //   763: invokeinterface 415 2 0
    //   768: lstore 9
    //   770: aload_3
    //   771: astore_2
    //   772: aload 6
    //   774: getfield 879	e7/k1:a	Le7/j2;
    //   777: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   780: invokevirtual 888	e7/e2:l	()V
    //   783: aload_3
    //   784: astore_2
    //   785: aload 6
    //   787: getfield 1731	e7/k1:R	Z
    //   790: istore 5
    //   792: aload_3
    //   793: astore_2
    //   794: aload 6
    //   796: getfield 930	e7/k1:M	J
    //   799: lload 9
    //   801: lcmp
    //   802: ifeq +9 -> 811
    //   805: iconst_1
    //   806: istore 11
    //   808: goto +6 -> 814
    //   811: iconst_0
    //   812: istore 11
    //   814: aload_3
    //   815: astore_2
    //   816: aload 6
    //   818: iload 5
    //   820: iload 11
    //   822: ior
    //   823: putfield 1731	e7/k1:R	Z
    //   826: aload_3
    //   827: astore_2
    //   828: aload 6
    //   830: lload 9
    //   832: putfield 930	e7/k1:M	J
    //   835: aload_3
    //   836: astore_2
    //   837: aload_3
    //   838: bipush 14
    //   840: invokeinterface 415 2 0
    //   845: lstore 9
    //   847: aload_3
    //   848: astore_2
    //   849: aload 6
    //   851: getfield 879	e7/k1:a	Le7/j2;
    //   854: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   857: invokevirtual 888	e7/e2:l	()V
    //   860: aload_3
    //   861: astore_2
    //   862: aload 6
    //   864: getfield 1731	e7/k1:R	Z
    //   867: istore 5
    //   869: aload_3
    //   870: astore_2
    //   871: aload 6
    //   873: getfield 933	e7/k1:N	J
    //   876: lload 9
    //   878: lcmp
    //   879: ifeq +9 -> 888
    //   882: iconst_1
    //   883: istore 11
    //   885: goto +6 -> 891
    //   888: iconst_0
    //   889: istore 11
    //   891: aload_3
    //   892: astore_2
    //   893: aload 6
    //   895: iload 5
    //   897: iload 11
    //   899: ior
    //   900: putfield 1731	e7/k1:R	Z
    //   903: aload_3
    //   904: astore_2
    //   905: aload 6
    //   907: lload 9
    //   909: putfield 933	e7/k1:N	J
    //   912: aload_3
    //   913: astore_2
    //   914: aload 6
    //   916: aload_3
    //   917: bipush 15
    //   919: invokeinterface 415 2 0
    //   924: invokevirtual 1733	e7/k1:u	(J)V
    //   927: aload_3
    //   928: astore_2
    //   929: aload_3
    //   930: bipush 16
    //   932: invokeinterface 415 2 0
    //   937: lstore 9
    //   939: aload 6
    //   941: getfield 879	e7/k1:a	Le7/j2;
    //   944: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   947: invokevirtual 888	e7/e2:l	()V
    //   950: aload 6
    //   952: getfield 1731	e7/k1:R	Z
    //   955: istore 5
    //   957: aload 6
    //   959: getfield 939	e7/k1:T	J
    //   962: lload 9
    //   964: lcmp
    //   965: ifeq +9 -> 974
    //   968: iconst_1
    //   969: istore 11
    //   971: goto +6 -> 977
    //   974: iconst_0
    //   975: istore 11
    //   977: aload 6
    //   979: iload 5
    //   981: iload 11
    //   983: ior
    //   984: putfield 1731	e7/k1:R	Z
    //   987: aload 6
    //   989: lload 9
    //   991: putfield 939	e7/k1:T	J
    //   994: aload_3
    //   995: astore_2
    //   996: aload_3
    //   997: bipush 17
    //   999: invokeinterface 1688 2 0
    //   1004: ifeq +11 -> 1015
    //   1007: ldc2_w 1734
    //   1010: lstore 9
    //   1012: goto +16 -> 1028
    //   1015: aload_3
    //   1016: astore_2
    //   1017: aload_3
    //   1018: bipush 17
    //   1020: invokeinterface 641 2 0
    //   1025: i2l
    //   1026: lstore 9
    //   1028: aload_3
    //   1029: astore_2
    //   1030: aload 6
    //   1032: lload 9
    //   1034: invokevirtual 1737	e7/k1:n	(J)V
    //   1037: aload_3
    //   1038: astore_2
    //   1039: aload 6
    //   1041: aload_3
    //   1042: bipush 18
    //   1044: invokeinterface 404 2 0
    //   1049: invokevirtual 1739	e7/k1:x	(Ljava/lang/String;)V
    //   1052: aload_3
    //   1053: astore_2
    //   1054: aload_3
    //   1055: bipush 19
    //   1057: invokeinterface 415 2 0
    //   1062: lstore 9
    //   1064: aload_3
    //   1065: astore_2
    //   1066: aload 6
    //   1068: getfield 879	e7/k1:a	Le7/j2;
    //   1071: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1074: invokevirtual 888	e7/e2:l	()V
    //   1077: aload_3
    //   1078: astore_2
    //   1079: aload 6
    //   1081: getfield 1731	e7/k1:R	Z
    //   1084: istore 5
    //   1086: aload_3
    //   1087: astore_2
    //   1088: aload 6
    //   1090: getfield 946	e7/k1:O	J
    //   1093: lload 9
    //   1095: lcmp
    //   1096: ifeq +9 -> 1105
    //   1099: iconst_1
    //   1100: istore 11
    //   1102: goto +6 -> 1108
    //   1105: iconst_0
    //   1106: istore 11
    //   1108: aload_3
    //   1109: astore_2
    //   1110: aload 6
    //   1112: iload 5
    //   1114: iload 11
    //   1116: ior
    //   1117: putfield 1731	e7/k1:R	Z
    //   1120: aload_3
    //   1121: astore_2
    //   1122: aload 6
    //   1124: lload 9
    //   1126: putfield 946	e7/k1:O	J
    //   1129: aload_3
    //   1130: astore_2
    //   1131: aload_3
    //   1132: bipush 20
    //   1134: invokeinterface 415 2 0
    //   1139: lstore 9
    //   1141: aload_3
    //   1142: astore_2
    //   1143: aload 6
    //   1145: getfield 879	e7/k1:a	Le7/j2;
    //   1148: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1151: invokevirtual 888	e7/e2:l	()V
    //   1154: aload_3
    //   1155: astore_2
    //   1156: aload 6
    //   1158: getfield 1731	e7/k1:R	Z
    //   1161: istore 5
    //   1163: aload_3
    //   1164: astore_2
    //   1165: aload 6
    //   1167: getfield 949	e7/k1:P	J
    //   1170: lload 9
    //   1172: lcmp
    //   1173: ifeq +9 -> 1182
    //   1176: iconst_1
    //   1177: istore 11
    //   1179: goto +6 -> 1185
    //   1182: iconst_0
    //   1183: istore 11
    //   1185: aload_3
    //   1186: astore_2
    //   1187: aload 6
    //   1189: iload 5
    //   1191: iload 11
    //   1193: ior
    //   1194: putfield 1731	e7/k1:R	Z
    //   1197: aload_3
    //   1198: astore_2
    //   1199: aload 6
    //   1201: lload 9
    //   1203: putfield 949	e7/k1:P	J
    //   1206: aload_3
    //   1207: astore_2
    //   1208: aload 6
    //   1210: aload_3
    //   1211: bipush 21
    //   1213: invokeinterface 404 2 0
    //   1218: invokevirtual 1741	e7/k1:z	(Ljava/lang/String;)V
    //   1221: aload_3
    //   1222: astore_2
    //   1223: aload_3
    //   1224: bipush 23
    //   1226: invokeinterface 1688 2 0
    //   1231: ifne +29 -> 1260
    //   1234: aload_3
    //   1235: astore_2
    //   1236: aload_3
    //   1237: bipush 23
    //   1239: invokeinterface 641 2 0
    //   1244: istore 11
    //   1246: iload 11
    //   1248: ifeq +6 -> 1254
    //   1251: goto +9 -> 1260
    //   1254: iconst_0
    //   1255: istore 5
    //   1257: goto +6 -> 1263
    //   1260: iconst_1
    //   1261: istore 5
    //   1263: aload 6
    //   1265: getfield 879	e7/k1:a	Le7/j2;
    //   1268: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1271: invokevirtual 888	e7/e2:l	()V
    //   1274: aload 6
    //   1276: getfield 1731	e7/k1:R	Z
    //   1279: istore 12
    //   1281: aload 6
    //   1283: getfield 954	e7/k1:p	Z
    //   1286: iload 5
    //   1288: if_icmpeq +9 -> 1297
    //   1291: iconst_1
    //   1292: istore 11
    //   1294: goto +6 -> 1300
    //   1297: iconst_0
    //   1298: istore 11
    //   1300: aload 6
    //   1302: iload 12
    //   1304: iload 11
    //   1306: ior
    //   1307: putfield 1731	e7/k1:R	Z
    //   1310: aload 6
    //   1312: iload 5
    //   1314: putfield 954	e7/k1:p	Z
    //   1317: aload_3
    //   1318: astore_2
    //   1319: aload 6
    //   1321: aload_3
    //   1322: bipush 24
    //   1324: invokeinterface 404 2 0
    //   1329: invokevirtual 1742	e7/k1:b	(Ljava/lang/String;)V
    //   1332: aload_3
    //   1333: astore_2
    //   1334: aload_3
    //   1335: bipush 25
    //   1337: invokeinterface 1688 2 0
    //   1342: ifeq +9 -> 1351
    //   1345: lconst_0
    //   1346: lstore 9
    //   1348: goto +15 -> 1363
    //   1351: aload_3
    //   1352: astore_2
    //   1353: aload_3
    //   1354: bipush 25
    //   1356: invokeinterface 415 2 0
    //   1361: lstore 9
    //   1363: aload_3
    //   1364: astore_2
    //   1365: aload 6
    //   1367: lload 9
    //   1369: invokevirtual 1744	e7/k1:C	(J)V
    //   1372: aload_3
    //   1373: astore_2
    //   1374: aload_3
    //   1375: bipush 26
    //   1377: invokeinterface 1688 2 0
    //   1382: ifne +28 -> 1410
    //   1385: aload_3
    //   1386: astore_2
    //   1387: aload 6
    //   1389: aload_3
    //   1390: bipush 26
    //   1392: invokeinterface 404 2 0
    //   1397: ldc_w 1002
    //   1400: iconst_m1
    //   1401: invokevirtual 1748	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   1404: invokestatic 1681	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   1407: invokevirtual 1750	e7/k1:c	(Ljava/util/List;)V
    //   1410: aload_3
    //   1411: astore_2
    //   1412: aload_0
    //   1413: getfield 466	e7/z5:c	Le7/i6;
    //   1416: aload_1
    //   1417: invokevirtual 861	e7/i6:H	(Ljava/lang/String;)Le7/e3;
    //   1420: aload 8
    //   1422: invokevirtual 867	e7/e3:j	(Le7/e3$a;)Z
    //   1425: ifeq +71 -> 1496
    //   1428: aload_3
    //   1429: astore_2
    //   1430: aload_3
    //   1431: bipush 28
    //   1433: invokeinterface 404 2 0
    //   1438: astore 8
    //   1440: aload 6
    //   1442: getfield 879	e7/k1:a	Le7/j2;
    //   1445: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1448: invokevirtual 888	e7/e2:l	()V
    //   1451: aload 6
    //   1453: aload 6
    //   1455: getfield 1731	e7/k1:R	Z
    //   1458: aload 6
    //   1460: getfield 960	e7/k1:u	Ljava/lang/String;
    //   1463: aload 8
    //   1465: invokestatic 1755	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1468: iconst_1
    //   1469: ixor
    //   1470: ior
    //   1471: putfield 1731	e7/k1:R	Z
    //   1474: aload 6
    //   1476: aload 8
    //   1478: putfield 960	e7/k1:u	Ljava/lang/String;
    //   1481: goto +15 -> 1496
    //   1484: goto +1171 -> 2655
    //   1487: astore 8
    //   1489: goto -5 -> 1484
    //   1492: astore_1
    //   1493: goto +1198 -> 2691
    //   1496: aload_3
    //   1497: astore_2
    //   1498: aload_3
    //   1499: bipush 29
    //   1501: invokeinterface 1688 2 0
    //   1506: ifne +26 -> 1532
    //   1509: aload_3
    //   1510: astore_2
    //   1511: aload_3
    //   1512: bipush 29
    //   1514: invokeinterface 641 2 0
    //   1519: istore 11
    //   1521: iload 11
    //   1523: ifeq +9 -> 1532
    //   1526: iconst_1
    //   1527: istore 5
    //   1529: goto +6 -> 1535
    //   1532: iconst_0
    //   1533: istore 5
    //   1535: aload 6
    //   1537: getfield 879	e7/k1:a	Le7/j2;
    //   1540: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1543: invokevirtual 888	e7/e2:l	()V
    //   1546: aload 6
    //   1548: getfield 1731	e7/k1:R	Z
    //   1551: istore 12
    //   1553: aload 6
    //   1555: getfield 1757	e7/k1:v	Z
    //   1558: iload 5
    //   1560: if_icmpeq +9 -> 1569
    //   1563: iconst_1
    //   1564: istore 11
    //   1566: goto +6 -> 1572
    //   1569: iconst_0
    //   1570: istore 11
    //   1572: aload 6
    //   1574: iload 12
    //   1576: iload 11
    //   1578: ior
    //   1579: putfield 1731	e7/k1:R	Z
    //   1582: aload 6
    //   1584: iload 5
    //   1586: putfield 1757	e7/k1:v	Z
    //   1589: aload_3
    //   1590: astore_2
    //   1591: aload 6
    //   1593: aload_3
    //   1594: bipush 39
    //   1596: invokeinterface 415 2 0
    //   1601: invokevirtual 1759	e7/k1:E	(J)V
    //   1604: aload_3
    //   1605: astore_2
    //   1606: aload_3
    //   1607: bipush 36
    //   1609: invokeinterface 404 2 0
    //   1614: astore 8
    //   1616: aload 6
    //   1618: getfield 879	e7/k1:a	Le7/j2;
    //   1621: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1624: invokevirtual 888	e7/e2:l	()V
    //   1627: aload 6
    //   1629: getfield 1731	e7/k1:R	Z
    //   1632: istore 5
    //   1634: aload 6
    //   1636: getfield 1761	e7/k1:D	Ljava/lang/String;
    //   1639: aload 8
    //   1641: if_acmpeq +9 -> 1650
    //   1644: iconst_1
    //   1645: istore 11
    //   1647: goto +6 -> 1653
    //   1650: iconst_0
    //   1651: istore 11
    //   1653: aload 6
    //   1655: iload 5
    //   1657: iload 11
    //   1659: ior
    //   1660: putfield 1731	e7/k1:R	Z
    //   1663: aload 6
    //   1665: aload 8
    //   1667: putfield 1761	e7/k1:D	Ljava/lang/String;
    //   1670: aload_3
    //   1671: astore_2
    //   1672: aload_3
    //   1673: bipush 30
    //   1675: invokeinterface 415 2 0
    //   1680: lstore 9
    //   1682: aload 6
    //   1684: getfield 879	e7/k1:a	Le7/j2;
    //   1687: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1690: invokevirtual 888	e7/e2:l	()V
    //   1693: aload 6
    //   1695: getfield 1731	e7/k1:R	Z
    //   1698: istore 5
    //   1700: aload 6
    //   1702: getfield 964	e7/k1:w	J
    //   1705: lload 9
    //   1707: lcmp
    //   1708: ifeq +9 -> 1717
    //   1711: iconst_1
    //   1712: istore 11
    //   1714: goto +6 -> 1720
    //   1717: iconst_0
    //   1718: istore 11
    //   1720: aload 6
    //   1722: iload 5
    //   1724: iload 11
    //   1726: ior
    //   1727: putfield 1731	e7/k1:R	Z
    //   1730: aload 6
    //   1732: lload 9
    //   1734: putfield 964	e7/k1:w	J
    //   1737: aload_3
    //   1738: astore_2
    //   1739: aload_3
    //   1740: bipush 31
    //   1742: invokeinterface 415 2 0
    //   1747: lstore 9
    //   1749: aload 6
    //   1751: getfield 879	e7/k1:a	Le7/j2;
    //   1754: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1757: invokevirtual 888	e7/e2:l	()V
    //   1760: aload 6
    //   1762: getfield 1731	e7/k1:R	Z
    //   1765: istore 5
    //   1767: aload 6
    //   1769: getfield 966	e7/k1:x	J
    //   1772: lload 9
    //   1774: lcmp
    //   1775: ifeq +9 -> 1784
    //   1778: iconst_1
    //   1779: istore 11
    //   1781: goto +6 -> 1787
    //   1784: iconst_0
    //   1785: istore 11
    //   1787: aload 6
    //   1789: iload 5
    //   1791: iload 11
    //   1793: ior
    //   1794: putfield 1731	e7/k1:R	Z
    //   1797: aload 6
    //   1799: lload 9
    //   1801: putfield 966	e7/k1:x	J
    //   1804: aload_3
    //   1805: astore_2
    //   1806: invokestatic 970	com/google/android/gms/internal/measurement/zzoy:zza	()Z
    //   1809: ifeq +107 -> 1916
    //   1812: aload_3
    //   1813: astore_2
    //   1814: aload_0
    //   1815: invokevirtual 549	d2/q:h	()Le7/h;
    //   1818: aload_1
    //   1819: getstatic 973	e7/h0:Q0	Le7/m0;
    //   1822: invokevirtual 555	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   1825: ifeq +91 -> 1916
    //   1828: aload_3
    //   1829: astore_2
    //   1830: aload_3
    //   1831: bipush 32
    //   1833: invokeinterface 641 2 0
    //   1838: istore 13
    //   1840: aload 6
    //   1842: getfield 879	e7/k1:a	Le7/j2;
    //   1845: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1848: invokevirtual 888	e7/e2:l	()V
    //   1851: aload 6
    //   1853: getfield 1731	e7/k1:R	Z
    //   1856: istore 5
    //   1858: aload 6
    //   1860: getfield 975	e7/k1:y	I
    //   1863: iload 13
    //   1865: if_icmpeq +9 -> 1874
    //   1868: iconst_1
    //   1869: istore 11
    //   1871: goto +6 -> 1877
    //   1874: iconst_0
    //   1875: istore 11
    //   1877: aload 6
    //   1879: iload 5
    //   1881: iload 11
    //   1883: ior
    //   1884: putfield 1731	e7/k1:R	Z
    //   1887: aload 6
    //   1889: iload 13
    //   1891: putfield 975	e7/k1:y	I
    //   1894: aload_3
    //   1895: astore_2
    //   1896: aload 6
    //   1898: aload_3
    //   1899: bipush 35
    //   1901: invokeinterface 415 2 0
    //   1906: invokevirtual 1763	e7/k1:r	(J)V
    //   1909: goto +7 -> 1916
    //   1912: astore_1
    //   1913: goto +778 -> 2691
    //   1916: aload_3
    //   1917: astore_2
    //   1918: aload_3
    //   1919: bipush 33
    //   1921: invokeinterface 1688 2 0
    //   1926: ifne +26 -> 1952
    //   1929: aload_3
    //   1930: astore_2
    //   1931: aload_3
    //   1932: bipush 33
    //   1934: invokeinterface 641 2 0
    //   1939: istore 11
    //   1941: iload 11
    //   1943: ifeq +9 -> 1952
    //   1946: iconst_1
    //   1947: istore 5
    //   1949: goto +6 -> 1955
    //   1952: iconst_0
    //   1953: istore 5
    //   1955: aload 6
    //   1957: getfield 879	e7/k1:a	Le7/j2;
    //   1960: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   1963: invokevirtual 888	e7/e2:l	()V
    //   1966: aload 6
    //   1968: getfield 1731	e7/k1:R	Z
    //   1971: istore 12
    //   1973: aload 6
    //   1975: getfield 979	e7/k1:z	Z
    //   1978: iload 5
    //   1980: if_icmpeq +9 -> 1989
    //   1983: iconst_1
    //   1984: istore 11
    //   1986: goto +6 -> 1992
    //   1989: iconst_0
    //   1990: istore 11
    //   1992: aload 6
    //   1994: iload 12
    //   1996: iload 11
    //   1998: ior
    //   1999: putfield 1731	e7/k1:R	Z
    //   2002: aload 6
    //   2004: iload 5
    //   2006: putfield 979	e7/k1:z	Z
    //   2009: aload_3
    //   2010: astore_2
    //   2011: aload_3
    //   2012: bipush 34
    //   2014: invokeinterface 1688 2 0
    //   2019: ifeq +8 -> 2027
    //   2022: aconst_null
    //   2023: astore_2
    //   2024: goto +37 -> 2061
    //   2027: aload_3
    //   2028: astore_2
    //   2029: aload_3
    //   2030: bipush 34
    //   2032: invokeinterface 641 2 0
    //   2037: ifeq +9 -> 2046
    //   2040: iconst_1
    //   2041: istore 5
    //   2043: goto +6 -> 2049
    //   2046: iconst_0
    //   2047: istore 5
    //   2049: aload_3
    //   2050: astore_2
    //   2051: iload 5
    //   2053: invokestatic 919	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2056: astore 8
    //   2058: aload 8
    //   2060: astore_2
    //   2061: aload 6
    //   2063: getfield 879	e7/k1:a	Le7/j2;
    //   2066: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   2069: invokevirtual 888	e7/e2:l	()V
    //   2072: aload 6
    //   2074: aload 6
    //   2076: getfield 1731	e7/k1:R	Z
    //   2079: aload 6
    //   2081: getfield 982	e7/k1:r	Ljava/lang/Boolean;
    //   2084: aload_2
    //   2085: invokestatic 1755	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2088: iconst_1
    //   2089: ixor
    //   2090: ior
    //   2091: putfield 1731	e7/k1:R	Z
    //   2094: aload 6
    //   2096: aload_2
    //   2097: putfield 982	e7/k1:r	Ljava/lang/Boolean;
    //   2100: aload_3
    //   2101: astore_2
    //   2102: aload 6
    //   2104: aload_3
    //   2105: bipush 37
    //   2107: invokeinterface 641 2 0
    //   2112: invokevirtual 1765	e7/k1:t	(I)V
    //   2115: aload_3
    //   2116: astore_2
    //   2117: aload 6
    //   2119: aload_3
    //   2120: bipush 38
    //   2122: invokeinterface 641 2 0
    //   2127: invokevirtual 1767	e7/k1:q	(I)V
    //   2130: aload_3
    //   2131: astore_2
    //   2132: aload_3
    //   2133: bipush 40
    //   2135: invokeinterface 1688 2 0
    //   2140: ifeq +10 -> 2150
    //   2143: ldc_w 448
    //   2146: astore_2
    //   2147: goto +25 -> 2172
    //   2150: aload_3
    //   2151: astore_2
    //   2152: aload_3
    //   2153: bipush 40
    //   2155: invokeinterface 404 2 0
    //   2160: astore 8
    //   2162: aload_3
    //   2163: astore_2
    //   2164: aload 8
    //   2166: invokestatic 342	m6/j:i	(Ljava/lang/Object;)V
    //   2169: aload 8
    //   2171: astore_2
    //   2172: aload 6
    //   2174: getfield 879	e7/k1:a	Le7/j2;
    //   2177: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   2180: invokevirtual 888	e7/e2:l	()V
    //   2183: aload 6
    //   2185: getfield 1731	e7/k1:R	Z
    //   2188: istore 5
    //   2190: aload 6
    //   2192: getfield 993	e7/k1:H	Ljava/lang/String;
    //   2195: aload_2
    //   2196: if_acmpeq +9 -> 2205
    //   2199: iconst_1
    //   2200: istore 11
    //   2202: goto +6 -> 2208
    //   2205: iconst_0
    //   2206: istore 11
    //   2208: aload 6
    //   2210: iload 5
    //   2212: iload 11
    //   2214: ior
    //   2215: putfield 1731	e7/k1:R	Z
    //   2218: aload 6
    //   2220: aload_2
    //   2221: putfield 993	e7/k1:H	Ljava/lang/String;
    //   2224: aload_3
    //   2225: astore_2
    //   2226: aload_3
    //   2227: bipush 41
    //   2229: invokeinterface 1688 2 0
    //   2234: ifne +66 -> 2300
    //   2237: aload_3
    //   2238: astore_2
    //   2239: aload_3
    //   2240: bipush 41
    //   2242: invokeinterface 415 2 0
    //   2247: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2250: astore 8
    //   2252: aload 6
    //   2254: getfield 879	e7/k1:a	Le7/j2;
    //   2257: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   2260: invokevirtual 888	e7/e2:l	()V
    //   2263: aload 6
    //   2265: aload 6
    //   2267: getfield 1731	e7/k1:R	Z
    //   2270: aload 6
    //   2272: getfield 1015	e7/k1:A	Ljava/lang/Long;
    //   2275: aload 8
    //   2277: invokestatic 1755	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2280: iconst_1
    //   2281: ixor
    //   2282: ior
    //   2283: putfield 1731	e7/k1:R	Z
    //   2286: aload 6
    //   2288: aload 8
    //   2290: putfield 1015	e7/k1:A	Ljava/lang/Long;
    //   2293: goto +7 -> 2300
    //   2296: astore_1
    //   2297: goto +394 -> 2691
    //   2300: aload_3
    //   2301: astore_2
    //   2302: aload_3
    //   2303: bipush 42
    //   2305: invokeinterface 1688 2 0
    //   2310: ifne +66 -> 2376
    //   2313: aload_3
    //   2314: astore_2
    //   2315: aload_3
    //   2316: bipush 42
    //   2318: invokeinterface 415 2 0
    //   2323: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2326: astore 8
    //   2328: aload 6
    //   2330: getfield 879	e7/k1:a	Le7/j2;
    //   2333: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   2336: invokevirtual 888	e7/e2:l	()V
    //   2339: aload 6
    //   2341: aload 6
    //   2343: getfield 1731	e7/k1:R	Z
    //   2346: aload 6
    //   2348: getfield 1017	e7/k1:B	Ljava/lang/Long;
    //   2351: aload 8
    //   2353: invokestatic 1755	java/util/Objects:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2356: iconst_1
    //   2357: ixor
    //   2358: ior
    //   2359: putfield 1731	e7/k1:R	Z
    //   2362: aload 6
    //   2364: aload 8
    //   2366: putfield 1017	e7/k1:B	Ljava/lang/Long;
    //   2369: goto +7 -> 2376
    //   2372: astore_1
    //   2373: goto +318 -> 2691
    //   2376: aload_3
    //   2377: astore_2
    //   2378: aload_3
    //   2379: bipush 43
    //   2381: invokeinterface 638 2 0
    //   2386: astore 8
    //   2388: aload 6
    //   2390: getfield 879	e7/k1:a	Le7/j2;
    //   2393: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   2396: invokevirtual 888	e7/e2:l	()V
    //   2399: aload 6
    //   2401: getfield 1731	e7/k1:R	Z
    //   2404: istore 5
    //   2406: aload 6
    //   2408: getfield 1020	e7/k1:I	[B
    //   2411: aload 8
    //   2413: if_acmpeq +9 -> 2422
    //   2416: iconst_1
    //   2417: istore 11
    //   2419: goto +6 -> 2425
    //   2422: iconst_0
    //   2423: istore 11
    //   2425: aload 6
    //   2427: iload 5
    //   2429: iload 11
    //   2431: ior
    //   2432: putfield 1731	e7/k1:R	Z
    //   2435: aload 6
    //   2437: aload 8
    //   2439: putfield 1020	e7/k1:I	[B
    //   2442: aload_3
    //   2443: astore_2
    //   2444: aload_0
    //   2445: invokevirtual 549	d2/q:h	()Le7/h;
    //   2448: aload_1
    //   2449: getstatic 552	e7/h0:K0	Le7/m0;
    //   2452: invokevirtual 555	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   2455: ifeq +90 -> 2545
    //   2458: aload_3
    //   2459: astore_2
    //   2460: aload_3
    //   2461: bipush 44
    //   2463: invokeinterface 1688 2 0
    //   2468: ifne +77 -> 2545
    //   2471: aload_3
    //   2472: astore_2
    //   2473: aload_3
    //   2474: bipush 44
    //   2476: invokeinterface 641 2 0
    //   2481: istore 13
    //   2483: aload 6
    //   2485: getfield 879	e7/k1:a	Le7/j2;
    //   2488: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   2491: invokevirtual 888	e7/e2:l	()V
    //   2494: aload 6
    //   2496: getfield 1731	e7/k1:R	Z
    //   2499: istore 5
    //   2501: aload 6
    //   2503: getfield 1769	e7/k1:J	I
    //   2506: iload 13
    //   2508: if_icmpeq +10 -> 2518
    //   2511: iload 4
    //   2513: istore 11
    //   2515: goto +6 -> 2521
    //   2518: iconst_0
    //   2519: istore 11
    //   2521: aload 6
    //   2523: iload 5
    //   2525: iload 11
    //   2527: ior
    //   2528: putfield 1731	e7/k1:R	Z
    //   2531: aload 6
    //   2533: iload 13
    //   2535: putfield 1769	e7/k1:J	I
    //   2538: goto +7 -> 2545
    //   2541: astore_1
    //   2542: goto +149 -> 2691
    //   2545: aload_3
    //   2546: astore_2
    //   2547: aload 6
    //   2549: getfield 879	e7/k1:a	Le7/j2;
    //   2552: invokevirtual 885	e7/j2:zzl	()Le7/e2;
    //   2555: invokevirtual 888	e7/e2:l	()V
    //   2558: aload_3
    //   2559: astore_2
    //   2560: aload 6
    //   2562: iconst_0
    //   2563: putfield 1731	e7/k1:R	Z
    //   2566: aload_3
    //   2567: astore_2
    //   2568: aload_3
    //   2569: invokeinterface 634 1 0
    //   2574: ifeq +22 -> 2596
    //   2577: aload_3
    //   2578: astore_2
    //   2579: aload_0
    //   2580: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   2583: getfield 381	e7/a1:o	Le7/b1;
    //   2586: ldc_w 1771
    //   2589: aload_1
    //   2590: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   2593: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2596: aload_3
    //   2597: invokeinterface 446 1 0
    //   2602: aload 6
    //   2604: areturn
    //   2605: astore_1
    //   2606: goto +85 -> 2691
    //   2609: astore_1
    //   2610: goto +81 -> 2691
    //   2613: astore_1
    //   2614: goto +77 -> 2691
    //   2617: astore_1
    //   2618: goto +73 -> 2691
    //   2621: astore_1
    //   2622: goto +69 -> 2691
    //   2625: astore_1
    //   2626: goto +65 -> 2691
    //   2629: astore_1
    //   2630: goto +61 -> 2691
    //   2633: astore_1
    //   2634: goto +57 -> 2691
    //   2637: astore_1
    //   2638: goto +53 -> 2691
    //   2641: astore_1
    //   2642: goto +49 -> 2691
    //   2645: astore_1
    //   2646: aload_2
    //   2647: astore_3
    //   2648: goto +43 -> 2691
    //   2651: astore 8
    //   2653: aconst_null
    //   2654: astore_3
    //   2655: aload_3
    //   2656: astore_2
    //   2657: aload_0
    //   2658: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   2661: getfield 381	e7/a1:o	Le7/b1;
    //   2664: ldc_w 1773
    //   2667: aload_1
    //   2668: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   2671: aload 8
    //   2673: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2676: aload_3
    //   2677: ifnull +9 -> 2686
    //   2680: aload_3
    //   2681: invokeinterface 446 1 0
    //   2686: aconst_null
    //   2687: areturn
    //   2688: astore_1
    //   2689: aload_2
    //   2690: astore_3
    //   2691: aload_3
    //   2692: ifnull +9 -> 2701
    //   2695: aload_3
    //   2696: invokeinterface 446 1 0
    //   2701: aload_1
    //   2702: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2703	0	this	o
    //   0	2703	1	paramString	String
    //   13	2677	2	localObject1	Object
    //   18	2678	3	localObject2	Object
    //   20	2492	4	i	int
    //   326	2202	5	j	int
    //   346	2257	6	localk1	k1
    //   373	12	7	locale3	e3
    //   380	1097	8	localObject3	Object
    //   1487	1	8	localSQLiteException1	SQLiteException
    //   1614	824	8	localObject4	Object
    //   2651	21	8	localSQLiteException2	SQLiteException
    //   614	1186	9	l	long
    //   652	542	11	bool	boolean
    //   1244	416	11	k	int
    //   1712	15	11	m	int
    //   1779	15	11	n	int
    //   1869	15	11	i1	int
    //   1939	276	11	i2	int
    //   2417	97	11	i3	int
    //   2519	9	11	i4	int
    //   1279	28	12	i5	int
    //   1551	28	12	i6	int
    //   1971	28	12	i7	int
    //   1838	696	13	i8	int
    // Exception table:
    //   from	to	target	type
    //   320	328	1487	android/database/sqlite/SQLiteException
    //   343	348	1487	android/database/sqlite/SQLiteException
    //   350	363	1487	android/database/sqlite/SQLiteException
    //   365	375	1487	android/database/sqlite/SQLiteException
    //   377	382	1487	android/database/sqlite/SQLiteException
    //   384	394	1487	android/database/sqlite/SQLiteException
    //   396	408	1487	android/database/sqlite/SQLiteException
    //   410	422	1487	android/database/sqlite/SQLiteException
    //   424	441	1487	android/database/sqlite/SQLiteException
    //   443	455	1487	android/database/sqlite/SQLiteException
    //   457	469	1487	android/database/sqlite/SQLiteException
    //   471	483	1487	android/database/sqlite/SQLiteException
    //   485	497	1487	android/database/sqlite/SQLiteException
    //   499	512	1487	android/database/sqlite/SQLiteException
    //   514	527	1487	android/database/sqlite/SQLiteException
    //   529	542	1487	android/database/sqlite/SQLiteException
    //   544	557	1487	android/database/sqlite/SQLiteException
    //   559	570	1487	android/database/sqlite/SQLiteException
    //   572	583	1487	android/database/sqlite/SQLiteException
    //   597	604	1487	android/database/sqlite/SQLiteException
    //   606	616	1487	android/database/sqlite/SQLiteException
    //   618	629	1487	android/database/sqlite/SQLiteException
    //   631	638	1487	android/database/sqlite/SQLiteException
    //   640	651	1487	android/database/sqlite/SQLiteException
    //   662	672	1487	android/database/sqlite/SQLiteException
    //   674	681	1487	android/database/sqlite/SQLiteException
    //   683	693	1487	android/database/sqlite/SQLiteException
    //   695	706	1487	android/database/sqlite/SQLiteException
    //   708	715	1487	android/database/sqlite/SQLiteException
    //   717	728	1487	android/database/sqlite/SQLiteException
    //   739	749	1487	android/database/sqlite/SQLiteException
    //   751	758	1487	android/database/sqlite/SQLiteException
    //   760	770	1487	android/database/sqlite/SQLiteException
    //   772	783	1487	android/database/sqlite/SQLiteException
    //   785	792	1487	android/database/sqlite/SQLiteException
    //   794	805	1487	android/database/sqlite/SQLiteException
    //   816	826	1487	android/database/sqlite/SQLiteException
    //   828	835	1487	android/database/sqlite/SQLiteException
    //   837	847	1487	android/database/sqlite/SQLiteException
    //   849	860	1487	android/database/sqlite/SQLiteException
    //   862	869	1487	android/database/sqlite/SQLiteException
    //   871	882	1487	android/database/sqlite/SQLiteException
    //   893	903	1487	android/database/sqlite/SQLiteException
    //   905	912	1487	android/database/sqlite/SQLiteException
    //   914	927	1487	android/database/sqlite/SQLiteException
    //   929	939	1487	android/database/sqlite/SQLiteException
    //   939	968	1487	android/database/sqlite/SQLiteException
    //   977	994	1487	android/database/sqlite/SQLiteException
    //   996	1007	1487	android/database/sqlite/SQLiteException
    //   1017	1028	1487	android/database/sqlite/SQLiteException
    //   1030	1037	1487	android/database/sqlite/SQLiteException
    //   1039	1052	1487	android/database/sqlite/SQLiteException
    //   1054	1064	1487	android/database/sqlite/SQLiteException
    //   1066	1077	1487	android/database/sqlite/SQLiteException
    //   1079	1086	1487	android/database/sqlite/SQLiteException
    //   1088	1099	1487	android/database/sqlite/SQLiteException
    //   1110	1120	1487	android/database/sqlite/SQLiteException
    //   1122	1129	1487	android/database/sqlite/SQLiteException
    //   1131	1141	1487	android/database/sqlite/SQLiteException
    //   1143	1154	1487	android/database/sqlite/SQLiteException
    //   1156	1163	1487	android/database/sqlite/SQLiteException
    //   1165	1176	1487	android/database/sqlite/SQLiteException
    //   1187	1197	1487	android/database/sqlite/SQLiteException
    //   1199	1206	1487	android/database/sqlite/SQLiteException
    //   1208	1221	1487	android/database/sqlite/SQLiteException
    //   1223	1234	1487	android/database/sqlite/SQLiteException
    //   1236	1246	1487	android/database/sqlite/SQLiteException
    //   1263	1291	1487	android/database/sqlite/SQLiteException
    //   1300	1317	1487	android/database/sqlite/SQLiteException
    //   1319	1332	1487	android/database/sqlite/SQLiteException
    //   1334	1345	1487	android/database/sqlite/SQLiteException
    //   1353	1363	1487	android/database/sqlite/SQLiteException
    //   1365	1372	1487	android/database/sqlite/SQLiteException
    //   1374	1385	1487	android/database/sqlite/SQLiteException
    //   1387	1410	1487	android/database/sqlite/SQLiteException
    //   1412	1428	1487	android/database/sqlite/SQLiteException
    //   1430	1440	1487	android/database/sqlite/SQLiteException
    //   1440	1481	1487	android/database/sqlite/SQLiteException
    //   1498	1509	1487	android/database/sqlite/SQLiteException
    //   1511	1521	1487	android/database/sqlite/SQLiteException
    //   1535	1563	1487	android/database/sqlite/SQLiteException
    //   1572	1589	1487	android/database/sqlite/SQLiteException
    //   1591	1604	1487	android/database/sqlite/SQLiteException
    //   1606	1616	1487	android/database/sqlite/SQLiteException
    //   1616	1644	1487	android/database/sqlite/SQLiteException
    //   1653	1670	1487	android/database/sqlite/SQLiteException
    //   1672	1682	1487	android/database/sqlite/SQLiteException
    //   1682	1711	1487	android/database/sqlite/SQLiteException
    //   1720	1737	1487	android/database/sqlite/SQLiteException
    //   1739	1749	1487	android/database/sqlite/SQLiteException
    //   1749	1778	1487	android/database/sqlite/SQLiteException
    //   1787	1804	1487	android/database/sqlite/SQLiteException
    //   1806	1812	1487	android/database/sqlite/SQLiteException
    //   1814	1828	1487	android/database/sqlite/SQLiteException
    //   1830	1840	1487	android/database/sqlite/SQLiteException
    //   1840	1868	1487	android/database/sqlite/SQLiteException
    //   1877	1894	1487	android/database/sqlite/SQLiteException
    //   1896	1909	1487	android/database/sqlite/SQLiteException
    //   1918	1929	1487	android/database/sqlite/SQLiteException
    //   1931	1941	1487	android/database/sqlite/SQLiteException
    //   1955	1983	1487	android/database/sqlite/SQLiteException
    //   1992	2009	1487	android/database/sqlite/SQLiteException
    //   2011	2022	1487	android/database/sqlite/SQLiteException
    //   2029	2040	1487	android/database/sqlite/SQLiteException
    //   2051	2058	1487	android/database/sqlite/SQLiteException
    //   2061	2100	1487	android/database/sqlite/SQLiteException
    //   2102	2115	1487	android/database/sqlite/SQLiteException
    //   2117	2130	1487	android/database/sqlite/SQLiteException
    //   2132	2143	1487	android/database/sqlite/SQLiteException
    //   2152	2162	1487	android/database/sqlite/SQLiteException
    //   2164	2169	1487	android/database/sqlite/SQLiteException
    //   2172	2199	1487	android/database/sqlite/SQLiteException
    //   2208	2224	1487	android/database/sqlite/SQLiteException
    //   2226	2237	1487	android/database/sqlite/SQLiteException
    //   2239	2252	1487	android/database/sqlite/SQLiteException
    //   2252	2293	1487	android/database/sqlite/SQLiteException
    //   2302	2313	1487	android/database/sqlite/SQLiteException
    //   2315	2328	1487	android/database/sqlite/SQLiteException
    //   2328	2369	1487	android/database/sqlite/SQLiteException
    //   2378	2388	1487	android/database/sqlite/SQLiteException
    //   2388	2416	1487	android/database/sqlite/SQLiteException
    //   2425	2442	1487	android/database/sqlite/SQLiteException
    //   2444	2458	1487	android/database/sqlite/SQLiteException
    //   2460	2471	1487	android/database/sqlite/SQLiteException
    //   2473	2483	1487	android/database/sqlite/SQLiteException
    //   2483	2511	1487	android/database/sqlite/SQLiteException
    //   2521	2538	1487	android/database/sqlite/SQLiteException
    //   2547	2558	1487	android/database/sqlite/SQLiteException
    //   2560	2566	1487	android/database/sqlite/SQLiteException
    //   2568	2577	1487	android/database/sqlite/SQLiteException
    //   2579	2596	1487	android/database/sqlite/SQLiteException
    //   1440	1481	1492	finally
    //   1840	1868	1912	finally
    //   1877	1894	1912	finally
    //   2252	2293	2296	finally
    //   2328	2369	2372	finally
    //   2483	2511	2541	finally
    //   2521	2538	2541	finally
    //   2388	2416	2605	finally
    //   2425	2442	2605	finally
    //   2172	2199	2609	finally
    //   2208	2224	2609	finally
    //   2061	2100	2613	finally
    //   1955	1983	2617	finally
    //   1992	2009	2617	finally
    //   1749	1778	2621	finally
    //   1787	1804	2621	finally
    //   1682	1711	2625	finally
    //   1720	1737	2625	finally
    //   1616	1644	2629	finally
    //   1653	1670	2629	finally
    //   1535	1563	2633	finally
    //   1572	1589	2633	finally
    //   1263	1291	2637	finally
    //   1300	1317	2637	finally
    //   939	968	2641	finally
    //   977	994	2641	finally
    //   14	19	2645	finally
    //   22	318	2645	finally
    //   14	19	2651	android/database/sqlite/SQLiteException
    //   22	318	2651	android/database/sqlite/SQLiteException
    //   320	328	2688	finally
    //   343	348	2688	finally
    //   350	363	2688	finally
    //   365	375	2688	finally
    //   377	382	2688	finally
    //   384	394	2688	finally
    //   396	408	2688	finally
    //   410	422	2688	finally
    //   424	441	2688	finally
    //   443	455	2688	finally
    //   457	469	2688	finally
    //   471	483	2688	finally
    //   485	497	2688	finally
    //   499	512	2688	finally
    //   514	527	2688	finally
    //   529	542	2688	finally
    //   544	557	2688	finally
    //   559	570	2688	finally
    //   572	583	2688	finally
    //   597	604	2688	finally
    //   606	616	2688	finally
    //   618	629	2688	finally
    //   631	638	2688	finally
    //   640	651	2688	finally
    //   662	672	2688	finally
    //   674	681	2688	finally
    //   683	693	2688	finally
    //   695	706	2688	finally
    //   708	715	2688	finally
    //   717	728	2688	finally
    //   739	749	2688	finally
    //   751	758	2688	finally
    //   760	770	2688	finally
    //   772	783	2688	finally
    //   785	792	2688	finally
    //   794	805	2688	finally
    //   816	826	2688	finally
    //   828	835	2688	finally
    //   837	847	2688	finally
    //   849	860	2688	finally
    //   862	869	2688	finally
    //   871	882	2688	finally
    //   893	903	2688	finally
    //   905	912	2688	finally
    //   914	927	2688	finally
    //   929	939	2688	finally
    //   996	1007	2688	finally
    //   1017	1028	2688	finally
    //   1030	1037	2688	finally
    //   1039	1052	2688	finally
    //   1054	1064	2688	finally
    //   1066	1077	2688	finally
    //   1079	1086	2688	finally
    //   1088	1099	2688	finally
    //   1110	1120	2688	finally
    //   1122	1129	2688	finally
    //   1131	1141	2688	finally
    //   1143	1154	2688	finally
    //   1156	1163	2688	finally
    //   1165	1176	2688	finally
    //   1187	1197	2688	finally
    //   1199	1206	2688	finally
    //   1208	1221	2688	finally
    //   1223	1234	2688	finally
    //   1236	1246	2688	finally
    //   1319	1332	2688	finally
    //   1334	1345	2688	finally
    //   1353	1363	2688	finally
    //   1365	1372	2688	finally
    //   1374	1385	2688	finally
    //   1387	1410	2688	finally
    //   1412	1428	2688	finally
    //   1430	1440	2688	finally
    //   1498	1509	2688	finally
    //   1511	1521	2688	finally
    //   1591	1604	2688	finally
    //   1606	1616	2688	finally
    //   1672	1682	2688	finally
    //   1739	1749	2688	finally
    //   1806	1812	2688	finally
    //   1814	1828	2688	finally
    //   1830	1840	2688	finally
    //   1896	1909	2688	finally
    //   1918	1929	2688	finally
    //   1931	1941	2688	finally
    //   2011	2022	2688	finally
    //   2029	2040	2688	finally
    //   2051	2058	2688	finally
    //   2102	2115	2688	finally
    //   2117	2130	2688	finally
    //   2132	2143	2688	finally
    //   2152	2162	2688	finally
    //   2164	2169	2688	finally
    //   2226	2237	2688	finally
    //   2239	2252	2688	finally
    //   2302	2313	2688	finally
    //   2315	2328	2688	finally
    //   2378	2388	2688	finally
    //   2444	2458	2688	finally
    //   2460	2471	2688	finally
    //   2473	2483	2688	finally
    //   2547	2558	2688	finally
    //   2560	2566	2688	finally
    //   2568	2577	2688	finally
    //   2579	2596	2688	finally
    //   2657	2676	2688	finally
  }
  
  /* Error */
  public final s6 m0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_2
    //   5: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   8: aload_0
    //   9: invokevirtual 458	d2/q:l	()V
    //   12: aload_0
    //   13: invokevirtual 423	e7/h6:p	()V
    //   16: aconst_null
    //   17: astore_3
    //   18: aload_0
    //   19: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: ldc_w 1443
    //   25: iconst_3
    //   26: anewarray 24	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: ldc_w 1438
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: ldc_w 333
    //   40: aastore
    //   41: dup
    //   42: iconst_2
    //   43: ldc 58
    //   45: aastore
    //   46: ldc_w 1325
    //   49: iconst_2
    //   50: anewarray 24	java/lang/String
    //   53: dup
    //   54: iconst_0
    //   55: aload_1
    //   56: aastore
    //   57: dup
    //   58: iconst_1
    //   59: aload_2
    //   60: aastore
    //   61: aconst_null
    //   62: aconst_null
    //   63: aconst_null
    //   64: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   67: astore 4
    //   69: aload 4
    //   71: invokeinterface 443 1 0
    //   76: istore 5
    //   78: iload 5
    //   80: ifne +12 -> 92
    //   83: aload 4
    //   85: invokeinterface 446 1 0
    //   90: aconst_null
    //   91: areturn
    //   92: aload 4
    //   94: iconst_0
    //   95: invokeinterface 415 2 0
    //   100: lstore 6
    //   102: aload 4
    //   104: astore_3
    //   105: aload_0
    //   106: iconst_1
    //   107: aload 4
    //   109: invokevirtual 713	e7/o:A	(ILandroid/database/Cursor;)Ljava/lang/Object;
    //   112: astore 8
    //   114: aload 8
    //   116: ifnonnull +12 -> 128
    //   119: aload 4
    //   121: invokeinterface 446 1 0
    //   126: aconst_null
    //   127: areturn
    //   128: aload 4
    //   130: astore_3
    //   131: aload 4
    //   133: iconst_2
    //   134: invokeinterface 404 2 0
    //   139: astore 9
    //   141: aload 4
    //   143: astore_3
    //   144: new 1416	e7/s6
    //   147: astore 10
    //   149: aload 4
    //   151: astore_3
    //   152: aload 10
    //   154: aload_1
    //   155: aload 9
    //   157: aload_2
    //   158: lload 6
    //   160: aload 8
    //   162: invokespecial 1618	e7/s6:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   165: aload 4
    //   167: astore_3
    //   168: aload 4
    //   170: invokeinterface 634 1 0
    //   175: ifeq +23 -> 198
    //   178: aload 4
    //   180: astore_3
    //   181: aload_0
    //   182: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   185: getfield 381	e7/a1:o	Le7/b1;
    //   188: ldc_w 1775
    //   191: aload_1
    //   192: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   195: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   198: aload 4
    //   200: invokeinterface 446 1 0
    //   205: aload 10
    //   207: areturn
    //   208: astore 8
    //   210: goto +23 -> 233
    //   213: astore_1
    //   214: goto +67 -> 281
    //   217: astore 8
    //   219: goto +14 -> 233
    //   222: astore_1
    //   223: aload_3
    //   224: astore_2
    //   225: goto +59 -> 284
    //   228: astore 8
    //   230: aconst_null
    //   231: astore 4
    //   233: aload 4
    //   235: astore_3
    //   236: aload_0
    //   237: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   240: getfield 381	e7/a1:o	Le7/b1;
    //   243: aload_1
    //   244: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   247: aload_0
    //   248: invokevirtual 1118	d2/q:i	()Le7/x0;
    //   251: aload_2
    //   252: invokevirtual 1327	e7/x0:g	(Ljava/lang/String;)Ljava/lang/String;
    //   255: aload 8
    //   257: ldc_w 1777
    //   260: invokevirtual 775	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   263: aload 4
    //   265: ifnull +10 -> 275
    //   268: aload 4
    //   270: invokeinterface 446 1 0
    //   275: aconst_null
    //   276: areturn
    //   277: astore_1
    //   278: aload_3
    //   279: astore 4
    //   281: aload 4
    //   283: astore_2
    //   284: aload_2
    //   285: ifnull +9 -> 294
    //   288: aload_2
    //   289: invokeinterface 446 1 0
    //   294: aload_1
    //   295: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	296	0	this	o
    //   0	296	1	paramString1	String
    //   0	296	2	paramString2	String
    //   17	262	3	localObject1	Object
    //   67	215	4	localObject2	Object
    //   76	3	5	bool	boolean
    //   100	59	6	l	long
    //   112	49	8	localObject3	Object
    //   208	1	8	localSQLiteException1	SQLiteException
    //   217	1	8	localSQLiteException2	SQLiteException
    //   228	28	8	localSQLiteException3	SQLiteException
    //   139	17	9	str	String
    //   147	59	10	locals6	s6
    // Exception table:
    //   from	to	target	type
    //   105	114	208	android/database/sqlite/SQLiteException
    //   131	141	208	android/database/sqlite/SQLiteException
    //   144	149	208	android/database/sqlite/SQLiteException
    //   152	165	208	android/database/sqlite/SQLiteException
    //   168	178	208	android/database/sqlite/SQLiteException
    //   181	198	208	android/database/sqlite/SQLiteException
    //   69	78	213	finally
    //   92	102	213	finally
    //   69	78	217	android/database/sqlite/SQLiteException
    //   92	102	217	android/database/sqlite/SQLiteException
    //   18	69	222	finally
    //   18	69	228	android/database/sqlite/SQLiteException
    //   105	114	277	finally
    //   131	141	277	finally
    //   144	149	277	finally
    //   152	165	277	finally
    //   168	178	277	finally
    //   181	198	277	finally
    //   236	263	277	finally
  }
  
  /* Error */
  public final Map<Integer, List<zzfw.zzb>> n0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 423	e7/h6:p	()V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_1
    //   9: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   12: aload_2
    //   13: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   16: new 1781	r/b
    //   19: dup
    //   20: invokespecial 1782	r/b:<init>	()V
    //   23: astore_3
    //   24: aload_0
    //   25: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   28: astore 4
    //   30: aconst_null
    //   31: astore 5
    //   33: aconst_null
    //   34: astore 6
    //   36: aload 4
    //   38: ldc_w 1471
    //   41: iconst_2
    //   42: anewarray 24	java/lang/String
    //   45: dup
    //   46: iconst_0
    //   47: ldc_w 1461
    //   50: aastore
    //   51: dup
    //   52: iconst_1
    //   53: ldc_w 813
    //   56: aastore
    //   57: ldc_w 1784
    //   60: iconst_2
    //   61: anewarray 24	java/lang/String
    //   64: dup
    //   65: iconst_0
    //   66: aload_1
    //   67: aastore
    //   68: dup
    //   69: iconst_1
    //   70: aload_2
    //   71: aastore
    //   72: aconst_null
    //   73: aconst_null
    //   74: aconst_null
    //   75: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore_2
    //   79: aload_2
    //   80: invokeinterface 443 1 0
    //   85: ifne +17 -> 102
    //   88: invokestatic 1788	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   91: astore 6
    //   93: aload_2
    //   94: invokeinterface 446 1 0
    //   99: aload 6
    //   101: areturn
    //   102: aload_2
    //   103: iconst_1
    //   104: invokeinterface 638 2 0
    //   109: astore 6
    //   111: invokestatic 1791	com/google/android/gms/internal/measurement/zzfw$zzb:zzc	()Lcom/google/android/gms/internal/measurement/zzfw$zzb$zza;
    //   114: aload 6
    //   116: invokestatic 1183	e7/o6:z	(Lcom/google/android/gms/internal/measurement/zzkg$zza;[B)Lcom/google/android/gms/internal/measurement/zzlp;
    //   119: checkcast 1793	com/google/android/gms/internal/measurement/zzfw$zzb$zza
    //   122: invokevirtual 1191	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   125: checkcast 1193	com/google/android/gms/internal/measurement/zzkg
    //   128: checkcast 1450	com/google/android/gms/internal/measurement/zzfw$zzb
    //   131: astore 5
    //   133: aload_2
    //   134: iconst_0
    //   135: invokeinterface 641 2 0
    //   140: istore 7
    //   142: aload_3
    //   143: iload 7
    //   145: invokestatic 389	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   148: aconst_null
    //   149: invokevirtual 1799	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   152: checkcast 568	java/util/List
    //   155: astore 4
    //   157: aload 4
    //   159: astore 6
    //   161: aload 4
    //   163: ifnonnull +25 -> 188
    //   166: new 629	java/util/ArrayList
    //   169: astore 6
    //   171: aload 6
    //   173: invokespecial 631	java/util/ArrayList:<init>	()V
    //   176: aload_3
    //   177: iload 7
    //   179: invokestatic 389	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: aload 6
    //   184: invokevirtual 1801	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: aload 6
    //   190: aload 5
    //   192: invokeinterface 1802 2 0
    //   197: pop
    //   198: goto +28 -> 226
    //   201: astore_1
    //   202: goto +103 -> 305
    //   205: astore 6
    //   207: aload_0
    //   208: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   211: getfield 381	e7/a1:o	Le7/b1;
    //   214: ldc_w 1804
    //   217: aload_1
    //   218: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   221: aload 6
    //   223: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   226: aload_2
    //   227: invokeinterface 634 1 0
    //   232: istore 8
    //   234: iload 8
    //   236: ifne -134 -> 102
    //   239: aload_2
    //   240: invokeinterface 446 1 0
    //   245: aload_3
    //   246: areturn
    //   247: astore 4
    //   249: goto +12 -> 261
    //   252: astore_1
    //   253: goto +49 -> 302
    //   256: astore 4
    //   258: aload 5
    //   260: astore_2
    //   261: aload_2
    //   262: astore 6
    //   264: aload_0
    //   265: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   268: getfield 381	e7/a1:o	Le7/b1;
    //   271: ldc_w 1661
    //   274: aload_1
    //   275: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   278: aload 4
    //   280: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   283: aload_2
    //   284: astore 6
    //   286: invokestatic 1788	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   289: astore_1
    //   290: aload_2
    //   291: ifnull +9 -> 300
    //   294: aload_2
    //   295: invokeinterface 446 1 0
    //   300: aload_1
    //   301: areturn
    //   302: aload 6
    //   304: astore_2
    //   305: aload_2
    //   306: ifnull +9 -> 315
    //   309: aload_2
    //   310: invokeinterface 446 1 0
    //   315: aload_1
    //   316: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	317	0	this	o
    //   0	317	1	paramString1	String
    //   0	317	2	paramString2	String
    //   23	223	3	localb	r.b
    //   28	134	4	localObject1	Object
    //   247	1	4	localSQLiteException1	SQLiteException
    //   256	23	4	localSQLiteException2	SQLiteException
    //   31	228	5	localzzb	zzfw.zzb
    //   34	155	6	localObject2	Object
    //   205	17	6	localIOException	IOException
    //   262	41	6	str	String
    //   140	38	7	i	int
    //   232	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   79	93	201	finally
    //   102	111	201	finally
    //   111	133	201	finally
    //   133	157	201	finally
    //   166	188	201	finally
    //   188	198	201	finally
    //   207	226	201	finally
    //   226	234	201	finally
    //   111	133	205	java/io/IOException
    //   79	93	247	android/database/sqlite/SQLiteException
    //   102	111	247	android/database/sqlite/SQLiteException
    //   111	133	247	android/database/sqlite/SQLiteException
    //   133	157	247	android/database/sqlite/SQLiteException
    //   166	188	247	android/database/sqlite/SQLiteException
    //   188	198	247	android/database/sqlite/SQLiteException
    //   207	226	247	android/database/sqlite/SQLiteException
    //   226	234	247	android/database/sqlite/SQLiteException
    //   36	79	252	finally
    //   264	283	252	finally
    //   286	290	252	finally
    //   36	79	256	android/database/sqlite/SQLiteException
  }
  
  public final e3 o0(String paramString)
  {
    m6.j.i(paramString);
    l();
    p();
    return e3.l(B("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[] { paramString }));
  }
  
  /* Error */
  public final Map<Integer, List<zzfw.zze>> p0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 423	e7/h6:p	()V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_1
    //   9: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   12: aload_2
    //   13: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   16: new 1781	r/b
    //   19: dup
    //   20: invokespecial 1782	r/b:<init>	()V
    //   23: astore_3
    //   24: aload_0
    //   25: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   28: astore 4
    //   30: aconst_null
    //   31: astore 5
    //   33: aconst_null
    //   34: astore 6
    //   36: aload 4
    //   38: ldc_w 1494
    //   41: iconst_2
    //   42: anewarray 24	java/lang/String
    //   45: dup
    //   46: iconst_0
    //   47: ldc_w 1461
    //   50: aastore
    //   51: dup
    //   52: iconst_1
    //   53: ldc_w 813
    //   56: aastore
    //   57: ldc_w 1815
    //   60: iconst_2
    //   61: anewarray 24	java/lang/String
    //   64: dup
    //   65: iconst_0
    //   66: aload_1
    //   67: aastore
    //   68: dup
    //   69: iconst_1
    //   70: aload_2
    //   71: aastore
    //   72: aconst_null
    //   73: aconst_null
    //   74: aconst_null
    //   75: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore_2
    //   79: aload_2
    //   80: invokeinterface 443 1 0
    //   85: ifne +17 -> 102
    //   88: invokestatic 1788	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   91: astore 6
    //   93: aload_2
    //   94: invokeinterface 446 1 0
    //   99: aload 6
    //   101: areturn
    //   102: aload_2
    //   103: iconst_1
    //   104: invokeinterface 638 2 0
    //   109: astore 6
    //   111: invokestatic 1818	com/google/android/gms/internal/measurement/zzfw$zze:zzc	()Lcom/google/android/gms/internal/measurement/zzfw$zze$zza;
    //   114: aload 6
    //   116: invokestatic 1183	e7/o6:z	(Lcom/google/android/gms/internal/measurement/zzkg$zza;[B)Lcom/google/android/gms/internal/measurement/zzlp;
    //   119: checkcast 1820	com/google/android/gms/internal/measurement/zzfw$zze$zza
    //   122: invokevirtual 1191	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   125: checkcast 1193	com/google/android/gms/internal/measurement/zzkg
    //   128: checkcast 1478	com/google/android/gms/internal/measurement/zzfw$zze
    //   131: astore 5
    //   133: aload_2
    //   134: iconst_0
    //   135: invokeinterface 641 2 0
    //   140: istore 7
    //   142: aload_3
    //   143: iload 7
    //   145: invokestatic 389	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   148: aconst_null
    //   149: invokevirtual 1799	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   152: checkcast 568	java/util/List
    //   155: astore 4
    //   157: aload 4
    //   159: astore 6
    //   161: aload 4
    //   163: ifnonnull +25 -> 188
    //   166: new 629	java/util/ArrayList
    //   169: astore 6
    //   171: aload 6
    //   173: invokespecial 631	java/util/ArrayList:<init>	()V
    //   176: aload_3
    //   177: iload 7
    //   179: invokestatic 389	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: aload 6
    //   184: invokevirtual 1801	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: aload 6
    //   190: aload 5
    //   192: invokeinterface 1802 2 0
    //   197: pop
    //   198: goto +28 -> 226
    //   201: astore_1
    //   202: goto +103 -> 305
    //   205: astore 6
    //   207: aload_0
    //   208: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   211: getfield 381	e7/a1:o	Le7/b1;
    //   214: ldc_w 1822
    //   217: aload_1
    //   218: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   221: aload 6
    //   223: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   226: aload_2
    //   227: invokeinterface 634 1 0
    //   232: istore 8
    //   234: iload 8
    //   236: ifne -134 -> 102
    //   239: aload_2
    //   240: invokeinterface 446 1 0
    //   245: aload_3
    //   246: areturn
    //   247: astore 4
    //   249: goto +12 -> 261
    //   252: astore_1
    //   253: goto +49 -> 302
    //   256: astore 4
    //   258: aload 5
    //   260: astore_2
    //   261: aload_2
    //   262: astore 6
    //   264: aload_0
    //   265: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   268: getfield 381	e7/a1:o	Le7/b1;
    //   271: ldc_w 1661
    //   274: aload_1
    //   275: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   278: aload 4
    //   280: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   283: aload_2
    //   284: astore 6
    //   286: invokestatic 1788	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   289: astore_1
    //   290: aload_2
    //   291: ifnull +9 -> 300
    //   294: aload_2
    //   295: invokeinterface 446 1 0
    //   300: aload_1
    //   301: areturn
    //   302: aload 6
    //   304: astore_2
    //   305: aload_2
    //   306: ifnull +9 -> 315
    //   309: aload_2
    //   310: invokeinterface 446 1 0
    //   315: aload_1
    //   316: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	317	0	this	o
    //   0	317	1	paramString1	String
    //   0	317	2	paramString2	String
    //   23	223	3	localb	r.b
    //   28	134	4	localObject1	Object
    //   247	1	4	localSQLiteException1	SQLiteException
    //   256	23	4	localSQLiteException2	SQLiteException
    //   31	228	5	localzze	zzfw.zze
    //   34	155	6	localObject2	Object
    //   205	17	6	localIOException	IOException
    //   262	41	6	str	String
    //   140	38	7	i	int
    //   232	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   79	93	201	finally
    //   102	111	201	finally
    //   111	133	201	finally
    //   133	157	201	finally
    //   166	188	201	finally
    //   188	198	201	finally
    //   207	226	201	finally
    //   226	234	201	finally
    //   111	133	205	java/io/IOException
    //   79	93	247	android/database/sqlite/SQLiteException
    //   102	111	247	android/database/sqlite/SQLiteException
    //   111	133	247	android/database/sqlite/SQLiteException
    //   133	157	247	android/database/sqlite/SQLiteException
    //   166	188	247	android/database/sqlite/SQLiteException
    //   188	198	247	android/database/sqlite/SQLiteException
    //   207	226	247	android/database/sqlite/SQLiteException
    //   226	234	247	android/database/sqlite/SQLiteException
    //   36	79	252	finally
    //   264	283	252	finally
    //   286	290	252	finally
    //   36	79	256	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final e3 q0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 342	m6/j:i	(Ljava/lang/Object;)V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_0
    //   9: invokevirtual 423	e7/h6:p	()V
    //   12: aconst_null
    //   13: astore_2
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aload_0
    //   20: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: ldc_w 1825
    //   26: iconst_1
    //   27: anewarray 24	java/lang/String
    //   30: dup
    //   31: iconst_0
    //   32: aload_1
    //   33: aastore
    //   34: invokevirtual 439	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore_1
    //   38: aload_1
    //   39: astore_3
    //   40: aload_1
    //   41: invokeinterface 443 1 0
    //   46: ifne +24 -> 70
    //   49: aload_1
    //   50: astore_3
    //   51: aload_0
    //   52: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   55: getfield 541	e7/a1:w	Le7/b1;
    //   58: ldc_w 1827
    //   61: invokevirtual 400	e7/b1:b	(Ljava/lang/String;)V
    //   64: aload 4
    //   66: astore_3
    //   67: goto +79 -> 146
    //   70: aload_1
    //   71: astore_3
    //   72: aload_1
    //   73: iconst_0
    //   74: invokeinterface 404 2 0
    //   79: astore 5
    //   81: aload_1
    //   82: astore_3
    //   83: aload_1
    //   84: iconst_1
    //   85: invokeinterface 641 2 0
    //   90: aload 5
    //   92: invokestatic 1830	e7/e3:c	(ILjava/lang/String;)Le7/e3;
    //   95: astore 5
    //   97: aload 5
    //   99: astore_3
    //   100: goto +46 -> 146
    //   103: astore_1
    //   104: goto +60 -> 164
    //   107: astore 5
    //   109: goto +11 -> 120
    //   112: astore_1
    //   113: goto +51 -> 164
    //   116: astore 5
    //   118: aconst_null
    //   119: astore_1
    //   120: aload_1
    //   121: astore_3
    //   122: aload_0
    //   123: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   126: getfield 381	e7/a1:o	Le7/b1;
    //   129: ldc_w 1832
    //   132: aload 5
    //   134: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   137: aload_2
    //   138: astore_3
    //   139: aload_1
    //   140: ifnull +12 -> 152
    //   143: aload 4
    //   145: astore_3
    //   146: aload_1
    //   147: invokeinterface 446 1 0
    //   152: aload_3
    //   153: astore_1
    //   154: aload_3
    //   155: ifnonnull +7 -> 162
    //   158: getstatic 1835	e7/e3:c	Le7/e3;
    //   161: astore_1
    //   162: aload_1
    //   163: areturn
    //   164: aload_3
    //   165: ifnull +9 -> 174
    //   168: aload_3
    //   169: invokeinterface 446 1 0
    //   174: aload_1
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	o
    //   0	176	1	paramString	String
    //   13	125	2	localObject1	Object
    //   15	154	3	localObject2	Object
    //   17	127	4	localObject3	Object
    //   79	19	5	localObject4	Object
    //   107	1	5	localSQLiteException1	SQLiteException
    //   116	17	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   40	49	103	finally
    //   51	64	103	finally
    //   72	81	103	finally
    //   83	97	103	finally
    //   122	137	103	finally
    //   40	49	107	android/database/sqlite/SQLiteException
    //   51	64	107	android/database/sqlite/SQLiteException
    //   72	81	107	android/database/sqlite/SQLiteException
    //   83	97	107	android/database/sqlite/SQLiteException
    //   19	38	112	finally
    //   19	38	116	android/database/sqlite/SQLiteException
  }
  
  public final boolean r()
  {
    return false;
  }
  
  public final void r0(String paramString1, String paramString2)
  {
    m6.j.e(paramString1);
    m6.j.e(paramString2);
    l();
    p();
    try
    {
      s().delete("user_attributes", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjo.a(a1.p(paramString1), i().g(paramString2), localSQLiteException, "Error deleting user property. appId");
    }
  }
  
  public final SQLiteDatabase s()
  {
    l();
    try
    {
      SQLiteDatabase localSQLiteDatabase = e.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjr.c("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  /* Error */
  public final n6 s0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_0
    //   9: invokevirtual 423	e7/h6:p	()V
    //   12: aload_0
    //   13: invokevirtual 549	d2/q:h	()Le7/h;
    //   16: astore_2
    //   17: getstatic 1030	e7/h0:I0	Le7/m0;
    //   20: astore_3
    //   21: aconst_null
    //   22: astore 4
    //   24: aload_2
    //   25: aconst_null
    //   26: aload_3
    //   27: invokevirtual 555	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   30: ifne +5 -> 35
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: invokevirtual 549	d2/q:h	()Le7/h;
    //   39: aconst_null
    //   40: getstatic 552	e7/h0:K0	Le7/m0;
    //   43: invokevirtual 555	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   46: ifeq +42 -> 88
    //   49: aload_0
    //   50: aload_1
    //   51: iconst_1
    //   52: newarray <illegal type>
    //   54: dup
    //   55: iconst_0
    //   56: iconst_2
    //   57: iastore
    //   58: invokestatic 1848	e7/d6:D	([I)Le7/d6;
    //   61: iconst_1
    //   62: invokevirtual 1850	e7/o:C	(Ljava/lang/String;Le7/d6;I)Ljava/util/List;
    //   65: astore_1
    //   66: aload_1
    //   67: invokeinterface 571 1 0
    //   72: ifeq +5 -> 77
    //   75: aconst_null
    //   76: areturn
    //   77: aload_1
    //   78: iconst_0
    //   79: invokeinterface 1851 2 0
    //   84: checkcast 1853	e7/n6
    //   87: areturn
    //   88: aload_0
    //   89: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   92: astore_2
    //   93: aload_0
    //   94: invokevirtual 589	e7/o:Z	()Ljava/lang/String;
    //   97: astore 5
    //   99: new 591	java/lang/StringBuilder
    //   102: astore_3
    //   103: aload_3
    //   104: ldc_w 1855
    //   107: invokespecial 594	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   110: aload_3
    //   111: aload 5
    //   113: invokevirtual 598	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload_3
    //   118: invokevirtual 603	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: astore_3
    //   122: aload_2
    //   123: ldc_w 607
    //   126: bipush 9
    //   128: anewarray 24	java/lang/String
    //   131: dup
    //   132: iconst_0
    //   133: ldc_w 609
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: ldc_w 611
    //   142: aastore
    //   143: dup
    //   144: iconst_2
    //   145: ldc_w 613
    //   148: aastore
    //   149: dup
    //   150: iconst_3
    //   151: ldc_w 615
    //   154: aastore
    //   155: dup
    //   156: iconst_4
    //   157: ldc_w 617
    //   160: aastore
    //   161: dup
    //   162: iconst_5
    //   163: ldc_w 619
    //   166: aastore
    //   167: dup
    //   168: bipush 6
    //   170: ldc_w 260
    //   173: aastore
    //   174: dup
    //   175: bipush 7
    //   177: ldc_w 621
    //   180: aastore
    //   181: dup
    //   182: bipush 8
    //   184: ldc 52
    //   186: aastore
    //   187: aload_3
    //   188: iconst_1
    //   189: anewarray 24	java/lang/String
    //   192: dup
    //   193: iconst_0
    //   194: aload_1
    //   195: aastore
    //   196: aconst_null
    //   197: aconst_null
    //   198: ldc_w 623
    //   201: ldc_w 1857
    //   204: invokevirtual 627	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   207: astore_2
    //   208: aload_2
    //   209: invokeinterface 443 1 0
    //   214: istore 6
    //   216: iload 6
    //   218: ifne +11 -> 229
    //   221: aload_2
    //   222: invokeinterface 446 1 0
    //   227: aconst_null
    //   228: areturn
    //   229: aload_2
    //   230: iconst_0
    //   231: invokeinterface 415 2 0
    //   236: lstore 7
    //   238: aload_2
    //   239: iconst_2
    //   240: invokeinterface 638 2 0
    //   245: astore 5
    //   247: aload_2
    //   248: iconst_3
    //   249: invokeinterface 404 2 0
    //   254: astore_3
    //   255: aload_2
    //   256: iconst_4
    //   257: invokeinterface 404 2 0
    //   262: astore 4
    //   264: aload_2
    //   265: iconst_5
    //   266: invokeinterface 641 2 0
    //   271: istore 9
    //   273: aload_2
    //   274: bipush 6
    //   276: invokeinterface 641 2 0
    //   281: istore 10
    //   283: aload_2
    //   284: bipush 7
    //   286: invokeinterface 415 2 0
    //   291: lstore 11
    //   293: aload_2
    //   294: bipush 8
    //   296: invokeinterface 415 2 0
    //   301: lstore 13
    //   303: aload_0
    //   304: aload_1
    //   305: lload 7
    //   307: aload 5
    //   309: aload_3
    //   310: aload 4
    //   312: iload 9
    //   314: iload 10
    //   316: lload 11
    //   318: lload 13
    //   320: invokevirtual 644	e7/o:z	(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJ)Le7/n6;
    //   323: astore 4
    //   325: aload_2
    //   326: invokeinterface 446 1 0
    //   331: aload 4
    //   333: areturn
    //   334: astore_1
    //   335: goto +9 -> 344
    //   338: astore 4
    //   340: goto +12 -> 352
    //   343: astore_1
    //   344: aload_2
    //   345: astore 4
    //   347: goto +54 -> 401
    //   350: astore 4
    //   352: aload_2
    //   353: astore_3
    //   354: aload 4
    //   356: astore_2
    //   357: aload_3
    //   358: astore 4
    //   360: goto +11 -> 371
    //   363: astore_1
    //   364: goto +37 -> 401
    //   367: astore_2
    //   368: aconst_null
    //   369: astore 4
    //   371: aload_0
    //   372: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   375: getfield 381	e7/a1:o	Le7/b1;
    //   378: ldc_w 650
    //   381: aload_1
    //   382: aload_2
    //   383: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   386: aload 4
    //   388: ifnull +10 -> 398
    //   391: aload 4
    //   393: invokeinterface 446 1 0
    //   398: aconst_null
    //   399: areturn
    //   400: astore_1
    //   401: aload 4
    //   403: ifnull +10 -> 413
    //   406: aload 4
    //   408: invokeinterface 446 1 0
    //   413: aload_1
    //   414: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	415	0	this	o
    //   0	415	1	paramString	String
    //   16	341	2	localObject1	Object
    //   367	16	2	localSQLiteException1	SQLiteException
    //   20	338	3	localObject2	Object
    //   22	310	4	localObject3	Object
    //   338	1	4	localSQLiteException2	SQLiteException
    //   345	1	4	localObject4	Object
    //   350	5	4	localSQLiteException3	SQLiteException
    //   358	49	4	localObject5	Object
    //   97	211	5	localObject6	Object
    //   214	3	6	bool	boolean
    //   236	70	7	l1	long
    //   271	42	9	i	int
    //   281	34	10	j	int
    //   291	26	11	l2	long
    //   301	18	13	l3	long
    // Exception table:
    //   from	to	target	type
    //   303	325	334	finally
    //   303	325	338	android/database/sqlite/SQLiteException
    //   208	216	343	finally
    //   229	303	343	finally
    //   208	216	350	android/database/sqlite/SQLiteException
    //   229	303	350	android/database/sqlite/SQLiteException
    //   88	208	363	finally
    //   88	208	367	android/database/sqlite/SQLiteException
    //   371	386	400	finally
  }
  
  /* Error */
  public final String t()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_1
    //   5: aload_1
    //   6: ldc_w 1859
    //   9: aconst_null
    //   10: invokevirtual 439	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   13: astore_2
    //   14: aload_2
    //   15: astore_1
    //   16: aload_2
    //   17: invokeinterface 443 1 0
    //   22: ifeq +21 -> 43
    //   25: aload_2
    //   26: astore_1
    //   27: aload_2
    //   28: iconst_0
    //   29: invokeinterface 404 2 0
    //   34: astore_3
    //   35: aload_2
    //   36: invokeinterface 446 1 0
    //   41: aload_3
    //   42: areturn
    //   43: aload_2
    //   44: invokeinterface 446 1 0
    //   49: aconst_null
    //   50: areturn
    //   51: astore_3
    //   52: goto +14 -> 66
    //   55: astore_1
    //   56: aconst_null
    //   57: astore_2
    //   58: aload_1
    //   59: astore_3
    //   60: goto +37 -> 97
    //   63: astore_3
    //   64: aconst_null
    //   65: astore_2
    //   66: aload_2
    //   67: astore_1
    //   68: aload_0
    //   69: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   72: getfield 381	e7/a1:o	Le7/b1;
    //   75: ldc_w 1861
    //   78: aload_3
    //   79: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   82: aload_2
    //   83: ifnull +9 -> 92
    //   86: aload_2
    //   87: invokeinterface 446 1 0
    //   92: aconst_null
    //   93: areturn
    //   94: astore_3
    //   95: aload_1
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +9 -> 107
    //   101: aload_2
    //   102: invokeinterface 446 1 0
    //   107: aload_3
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	o
    //   4	23	1	localObject1	Object
    //   55	4	1	localObject2	Object
    //   67	29	1	localObject3	Object
    //   13	89	2	localObject4	Object
    //   34	8	3	str	String
    //   51	1	3	localSQLiteException1	SQLiteException
    //   59	1	3	localObject5	Object
    //   63	16	3	localSQLiteException2	SQLiteException
    //   94	14	3	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   16	25	51	android/database/sqlite/SQLiteException
    //   27	35	51	android/database/sqlite/SQLiteException
    //   5	14	55	finally
    //   5	14	63	android/database/sqlite/SQLiteException
    //   16	25	94	finally
    //   27	35	94	finally
    //   68	82	94	finally
  }
  
  public final boolean t0(String paramString1, String paramString2)
  {
    return b0("select count(1) from raw_events where app_id = ? and name = ?", new String[] { paramString1, paramString2 }) > 0L;
  }
  
  public final long u(zzgf.zzk paramzzk)
  {
    l();
    p();
    m6.j.i(paramzzk);
    m6.j.e(paramzzk.zzab());
    byte[] arrayOfByte = paramzzk.zzce();
    long l = m().t(arrayOfByte);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramzzk.zzab());
    localContentValues.put("metadata_fingerprint", Long.valueOf(l));
    localContentValues.put("metadata", arrayOfByte);
    try
    {
      s().insertWithOnConflict("raw_events_metadata", null, localContentValues, 4);
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjo.d("Error storing raw event metadata. appId", a1.p(paramzzk.zzab()), localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  public final void u0(String paramString1, String paramString2)
  {
    m6.j.e(paramString2);
    l();
    p();
    try
    {
      s().delete(paramString1, "app_id=?", new String[] { paramString2 });
      return;
    }
    catch (SQLiteException paramString1)
    {
      zzjo.d("Error deleting snapshot. appId", a1.p(paramString2), paramString1);
    }
  }
  
  public final long v(String paramString)
  {
    m6.j.e(paramString);
    l();
    p();
    try
    {
      int i = s().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { paramString, String.valueOf(Math.max(0, Math.min(1000000, h().q(paramString, h0.q)))) });
      return i;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzjo.d("Error deleting over the limit events. appId", a1.p(paramString), localSQLiteException);
    }
    return 0L;
  }
  
  /* Error */
  public final List<s6> v0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_0
    //   9: invokevirtual 423	e7/h6:p	()V
    //   12: new 629	java/util/ArrayList
    //   15: dup
    //   16: invokespecial 631	java/util/ArrayList:<init>	()V
    //   19: astore_2
    //   20: aconst_null
    //   21: astore_3
    //   22: aconst_null
    //   23: astore 4
    //   25: aload_0
    //   26: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   29: ldc_w 1443
    //   32: iconst_4
    //   33: anewarray 24	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: ldc_w 689
    //   41: aastore
    //   42: dup
    //   43: iconst_1
    //   44: ldc 58
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: ldc_w 1438
    //   52: aastore
    //   53: dup
    //   54: iconst_3
    //   55: ldc_w 333
    //   58: aastore
    //   59: ldc_w 593
    //   62: iconst_1
    //   63: anewarray 24	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: aconst_null
    //   71: aconst_null
    //   72: ldc_w 707
    //   75: ldc_w 1884
    //   78: invokevirtual 627	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   81: astore 5
    //   83: aload 5
    //   85: astore 4
    //   87: aload 5
    //   89: astore_3
    //   90: aload 5
    //   92: invokeinterface 443 1 0
    //   97: istore 6
    //   99: iload 6
    //   101: ifne +12 -> 113
    //   104: aload 5
    //   106: invokeinterface 446 1 0
    //   111: aload_2
    //   112: areturn
    //   113: aload 5
    //   115: astore 4
    //   117: aload 5
    //   119: astore_3
    //   120: aload 5
    //   122: iconst_0
    //   123: invokeinterface 404 2 0
    //   128: astore 7
    //   130: aload 5
    //   132: astore 4
    //   134: aload 5
    //   136: astore_3
    //   137: aload 5
    //   139: iconst_1
    //   140: invokeinterface 404 2 0
    //   145: astore 8
    //   147: aload 8
    //   149: astore 9
    //   151: aload 8
    //   153: ifnonnull +8 -> 161
    //   156: ldc_w 448
    //   159: astore 9
    //   161: aload 5
    //   163: astore 4
    //   165: aload 5
    //   167: astore_3
    //   168: aload 5
    //   170: iconst_2
    //   171: invokeinterface 415 2 0
    //   176: lstore 10
    //   178: aload 5
    //   180: astore 4
    //   182: aload 5
    //   184: astore_3
    //   185: aload_0
    //   186: iconst_3
    //   187: aload 5
    //   189: invokevirtual 713	e7/o:A	(ILandroid/database/Cursor;)Ljava/lang/Object;
    //   192: astore 12
    //   194: aload 12
    //   196: ifnonnull +30 -> 226
    //   199: aload 5
    //   201: astore 4
    //   203: aload 5
    //   205: astore_3
    //   206: aload_0
    //   207: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   210: getfield 381	e7/a1:o	Le7/b1;
    //   213: ldc_w 1886
    //   216: aload_1
    //   217: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   220: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   223: goto +50 -> 273
    //   226: aload 5
    //   228: astore 4
    //   230: aload 5
    //   232: astore_3
    //   233: new 1416	e7/s6
    //   236: astore 8
    //   238: aload 5
    //   240: astore 4
    //   242: aload 5
    //   244: astore_3
    //   245: aload 8
    //   247: aload_1
    //   248: aload 9
    //   250: aload 7
    //   252: lload 10
    //   254: aload 12
    //   256: invokespecial 1618	e7/s6:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   259: aload 5
    //   261: astore 4
    //   263: aload 5
    //   265: astore_3
    //   266: aload_2
    //   267: aload 8
    //   269: invokevirtual 648	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   272: pop
    //   273: aload 5
    //   275: astore 4
    //   277: aload 5
    //   279: astore_3
    //   280: aload 5
    //   282: invokeinterface 634 1 0
    //   287: istore 6
    //   289: iload 6
    //   291: ifne -178 -> 113
    //   294: aload 5
    //   296: invokeinterface 446 1 0
    //   301: aload_2
    //   302: areturn
    //   303: astore_1
    //   304: goto +46 -> 350
    //   307: astore 5
    //   309: aload_3
    //   310: astore 4
    //   312: aload_0
    //   313: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   316: getfield 381	e7/a1:o	Le7/b1;
    //   319: ldc_w 1888
    //   322: aload_1
    //   323: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   326: aload 5
    //   328: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   331: aload_3
    //   332: astore 4
    //   334: invokestatic 561	java/util/Collections:emptyList	()Ljava/util/List;
    //   337: astore_1
    //   338: aload_3
    //   339: ifnull +9 -> 348
    //   342: aload_3
    //   343: invokeinterface 446 1 0
    //   348: aload_1
    //   349: areturn
    //   350: aload 4
    //   352: ifnull +10 -> 362
    //   355: aload 4
    //   357: invokeinterface 446 1 0
    //   362: aload_1
    //   363: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	this	o
    //   0	364	1	paramString	String
    //   19	283	2	localArrayList	ArrayList
    //   21	322	3	localObject1	Object
    //   23	333	4	localObject2	Object
    //   81	214	5	localCursor	Cursor
    //   307	20	5	localSQLiteException	SQLiteException
    //   97	193	6	bool	boolean
    //   128	123	7	str	String
    //   145	123	8	localObject3	Object
    //   149	100	9	localObject4	Object
    //   176	77	10	l	long
    //   192	63	12	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   25	83	303	finally
    //   90	99	303	finally
    //   120	130	303	finally
    //   137	147	303	finally
    //   168	178	303	finally
    //   185	194	303	finally
    //   206	223	303	finally
    //   233	238	303	finally
    //   245	259	303	finally
    //   266	273	303	finally
    //   280	289	303	finally
    //   312	331	303	finally
    //   334	338	303	finally
    //   25	83	307	android/database/sqlite/SQLiteException
    //   90	99	307	android/database/sqlite/SQLiteException
    //   120	130	307	android/database/sqlite/SQLiteException
    //   137	147	307	android/database/sqlite/SQLiteException
    //   168	178	307	android/database/sqlite/SQLiteException
    //   185	194	307	android/database/sqlite/SQLiteException
    //   206	223	307	android/database/sqlite/SQLiteException
    //   233	238	307	android/database/sqlite/SQLiteException
    //   245	259	307	android/database/sqlite/SQLiteException
    //   266	273	307	android/database/sqlite/SQLiteException
    //   280	289	307	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final long w(String paramString, String[] paramArrayOfString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aconst_null
    //   10: astore 7
    //   12: aload 5
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 439	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: astore 7
    //   23: aload_2
    //   24: astore 6
    //   26: aload_2
    //   27: invokeinterface 443 1 0
    //   32: ifeq +25 -> 57
    //   35: aload_2
    //   36: astore 7
    //   38: aload_2
    //   39: astore 6
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface 415 2 0
    //   48: lstore_3
    //   49: aload_2
    //   50: invokeinterface 446 1 0
    //   55: lload_3
    //   56: lreturn
    //   57: aload_2
    //   58: invokeinterface 446 1 0
    //   63: lload_3
    //   64: lreturn
    //   65: astore_1
    //   66: goto +29 -> 95
    //   69: astore_2
    //   70: aload 6
    //   72: astore 7
    //   74: aload_0
    //   75: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   78: getfield 381	e7/a1:o	Le7/b1;
    //   81: ldc_w 450
    //   84: aload_1
    //   85: aload_2
    //   86: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   89: aload 6
    //   91: astore 7
    //   93: aload_2
    //   94: athrow
    //   95: aload 7
    //   97: ifnull +10 -> 107
    //   100: aload 7
    //   102: invokeinterface 446 1 0
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	o
    //   0	109	1	paramString	String
    //   0	109	2	paramArrayOfString	String[]
    //   0	109	3	paramLong	long
    //   4	9	5	localSQLiteDatabase	SQLiteDatabase
    //   7	83	6	arrayOfString1	String[]
    //   10	91	7	arrayOfString2	String[]
    // Exception table:
    //   from	to	target	type
    //   12	20	65	finally
    //   26	35	65	finally
    //   41	49	65	finally
    //   74	89	65	finally
    //   93	95	65	finally
    //   12	20	69	android/database/sqlite/SQLiteException
    //   26	35	69	android/database/sqlite/SQLiteException
    //   41	49	69	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final void w0(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 1892
    //   4: aload_1
    //   5: invokevirtual 1894	e7/o:u0	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: ldc_w 689
    //   11: invokestatic 1898	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   14: astore_2
    //   15: aconst_null
    //   16: astore_3
    //   17: aconst_null
    //   18: astore 4
    //   20: aload_0
    //   21: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: ldc_w 841
    //   27: aload_2
    //   28: iconst_0
    //   29: anewarray 24	java/lang/String
    //   32: invokeinterface 1899 2 0
    //   37: checkcast 680	[Ljava/lang/String;
    //   40: ldc_w 593
    //   43: iconst_1
    //   44: anewarray 24	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: aload_1
    //   50: aastore
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   57: astore_2
    //   58: aload_2
    //   59: astore 4
    //   61: aload_2
    //   62: astore_3
    //   63: aload_2
    //   64: invokeinterface 443 1 0
    //   69: istore 5
    //   71: iload 5
    //   73: ifne +10 -> 83
    //   76: aload_2
    //   77: invokeinterface 446 1 0
    //   82: return
    //   83: aload_2
    //   84: astore 4
    //   86: aload_2
    //   87: astore_3
    //   88: aload_2
    //   89: iconst_0
    //   90: invokeinterface 404 2 0
    //   95: astore 6
    //   97: aload 6
    //   99: ifnull +36 -> 135
    //   102: aload_2
    //   103: astore 4
    //   105: aload_2
    //   106: astore_3
    //   107: aload_0
    //   108: aload_1
    //   109: aload 6
    //   111: invokevirtual 1901	e7/o:k0	(Ljava/lang/String;Ljava/lang/String;)Le7/b0;
    //   114: astore 6
    //   116: aload 6
    //   118: ifnull +17 -> 135
    //   121: aload_2
    //   122: astore 4
    //   124: aload_2
    //   125: astore_3
    //   126: aload_0
    //   127: ldc_w 1892
    //   130: aload 6
    //   132: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   135: aload_2
    //   136: astore 4
    //   138: aload_2
    //   139: astore_3
    //   140: aload_2
    //   141: invokeinterface 634 1 0
    //   146: istore 5
    //   148: iload 5
    //   150: ifne -67 -> 83
    //   153: aload_2
    //   154: invokeinterface 446 1 0
    //   159: return
    //   160: astore_1
    //   161: goto +36 -> 197
    //   164: astore_2
    //   165: aload_3
    //   166: astore 4
    //   168: aload_0
    //   169: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   172: getfield 381	e7/a1:o	Le7/b1;
    //   175: ldc_w 1903
    //   178: aload_1
    //   179: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   182: aload_2
    //   183: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   186: aload_3
    //   187: ifnull +9 -> 196
    //   190: aload_3
    //   191: invokeinterface 446 1 0
    //   196: return
    //   197: aload 4
    //   199: ifnull +10 -> 209
    //   202: aload 4
    //   204: invokeinterface 446 1 0
    //   209: aload_1
    //   210: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	o
    //   0	211	1	paramString	String
    //   14	140	2	localObject1	Object
    //   164	19	2	localSQLiteException	SQLiteException
    //   16	175	3	localObject2	Object
    //   18	185	4	localObject3	Object
    //   69	80	5	bool	boolean
    //   95	36	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   20	58	160	finally
    //   63	71	160	finally
    //   88	97	160	finally
    //   107	116	160	finally
    //   126	135	160	finally
    //   140	148	160	finally
    //   168	186	160	finally
    //   20	58	164	android/database/sqlite/SQLiteException
    //   63	71	164	android/database/sqlite/SQLiteException
    //   88	97	164	android/database/sqlite/SQLiteException
    //   107	116	164	android/database/sqlite/SQLiteException
    //   126	135	164	android/database/sqlite/SQLiteException
    //   140	148	164	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final p x(long paramLong1, String paramString, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic 338	m6/j:e	(Ljava/lang/String;)V
    //   4: aload_0
    //   5: invokevirtual 458	d2/q:l	()V
    //   8: aload_0
    //   9: invokevirtual 423	e7/h6:p	()V
    //   12: new 1906	e7/p
    //   15: dup
    //   16: invokespecial 1907	e7/p:<init>	()V
    //   19: astore 13
    //   21: aconst_null
    //   22: astore 14
    //   24: aconst_null
    //   25: astore 15
    //   27: aload 15
    //   29: astore 16
    //   31: aload 14
    //   33: astore 17
    //   35: aload_0
    //   36: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   39: astore 18
    //   41: aload 15
    //   43: astore 16
    //   45: aload 14
    //   47: astore 17
    //   49: aload 18
    //   51: ldc_w 1022
    //   54: bipush 8
    //   56: anewarray 24	java/lang/String
    //   59: dup
    //   60: iconst_0
    //   61: ldc 88
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: ldc 96
    //   68: aastore
    //   69: dup
    //   70: iconst_2
    //   71: ldc 92
    //   73: aastore
    //   74: dup
    //   75: iconst_3
    //   76: ldc 100
    //   78: aastore
    //   79: dup
    //   80: iconst_4
    //   81: ldc 124
    //   83: aastore
    //   84: dup
    //   85: iconst_5
    //   86: ldc -128
    //   88: aastore
    //   89: dup
    //   90: bipush 6
    //   92: ldc -40
    //   94: aastore
    //   95: dup
    //   96: bipush 7
    //   98: ldc -16
    //   100: aastore
    //   101: ldc_w 593
    //   104: iconst_1
    //   105: anewarray 24	java/lang/String
    //   108: dup
    //   109: iconst_0
    //   110: aload_3
    //   111: aastore
    //   112: aconst_null
    //   113: aconst_null
    //   114: aconst_null
    //   115: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore 15
    //   120: aload 15
    //   122: astore 16
    //   124: aload 15
    //   126: astore 17
    //   128: aload 15
    //   130: invokeinterface 443 1 0
    //   135: ifne +38 -> 173
    //   138: aload 15
    //   140: astore 16
    //   142: aload 15
    //   144: astore 17
    //   146: aload_0
    //   147: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   150: getfield 794	e7/a1:r	Le7/b1;
    //   153: ldc_w 1909
    //   156: aload_3
    //   157: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   160: invokevirtual 395	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   163: aload 15
    //   165: invokeinterface 446 1 0
    //   170: aload 13
    //   172: areturn
    //   173: aload 15
    //   175: astore 16
    //   177: aload 15
    //   179: astore 17
    //   181: aload 15
    //   183: iconst_0
    //   184: invokeinterface 415 2 0
    //   189: lload_1
    //   190: lcmp
    //   191: ifne +152 -> 343
    //   194: aload 15
    //   196: astore 16
    //   198: aload 15
    //   200: astore 17
    //   202: aload 13
    //   204: aload 15
    //   206: iconst_1
    //   207: invokeinterface 415 2 0
    //   212: putfield 1910	e7/p:b	J
    //   215: aload 15
    //   217: astore 16
    //   219: aload 15
    //   221: astore 17
    //   223: aload 13
    //   225: aload 15
    //   227: iconst_2
    //   228: invokeinterface 415 2 0
    //   233: putfield 1911	e7/p:a	J
    //   236: aload 15
    //   238: astore 16
    //   240: aload 15
    //   242: astore 17
    //   244: aload 13
    //   246: aload 15
    //   248: iconst_3
    //   249: invokeinterface 415 2 0
    //   254: putfield 1912	e7/p:c	J
    //   257: aload 15
    //   259: astore 16
    //   261: aload 15
    //   263: astore 17
    //   265: aload 13
    //   267: aload 15
    //   269: iconst_4
    //   270: invokeinterface 415 2 0
    //   275: putfield 1913	e7/p:d	J
    //   278: aload 15
    //   280: astore 16
    //   282: aload 15
    //   284: astore 17
    //   286: aload 13
    //   288: aload 15
    //   290: iconst_5
    //   291: invokeinterface 415 2 0
    //   296: putfield 1914	e7/p:e	J
    //   299: aload 15
    //   301: astore 16
    //   303: aload 15
    //   305: astore 17
    //   307: aload 13
    //   309: aload 15
    //   311: bipush 6
    //   313: invokeinterface 415 2 0
    //   318: putfield 1915	e7/p:f	J
    //   321: aload 15
    //   323: astore 16
    //   325: aload 15
    //   327: astore 17
    //   329: aload 13
    //   331: aload 15
    //   333: bipush 7
    //   335: invokeinterface 415 2 0
    //   340: putfield 1916	e7/p:g	J
    //   343: iload 6
    //   345: ifeq +24 -> 369
    //   348: aload 15
    //   350: astore 16
    //   352: aload 15
    //   354: astore 17
    //   356: aload 13
    //   358: aload 13
    //   360: getfield 1910	e7/p:b	J
    //   363: lload 4
    //   365: ladd
    //   366: putfield 1910	e7/p:b	J
    //   369: iload 7
    //   371: ifeq +24 -> 395
    //   374: aload 15
    //   376: astore 16
    //   378: aload 15
    //   380: astore 17
    //   382: aload 13
    //   384: aload 13
    //   386: getfield 1911	e7/p:a	J
    //   389: lload 4
    //   391: ladd
    //   392: putfield 1911	e7/p:a	J
    //   395: iload 8
    //   397: ifeq +24 -> 421
    //   400: aload 15
    //   402: astore 16
    //   404: aload 15
    //   406: astore 17
    //   408: aload 13
    //   410: aload 13
    //   412: getfield 1912	e7/p:c	J
    //   415: lload 4
    //   417: ladd
    //   418: putfield 1912	e7/p:c	J
    //   421: iload 9
    //   423: ifeq +24 -> 447
    //   426: aload 15
    //   428: astore 16
    //   430: aload 15
    //   432: astore 17
    //   434: aload 13
    //   436: aload 13
    //   438: getfield 1913	e7/p:d	J
    //   441: lload 4
    //   443: ladd
    //   444: putfield 1913	e7/p:d	J
    //   447: iload 10
    //   449: ifeq +24 -> 473
    //   452: aload 15
    //   454: astore 16
    //   456: aload 15
    //   458: astore 17
    //   460: aload 13
    //   462: aload 13
    //   464: getfield 1914	e7/p:e	J
    //   467: lload 4
    //   469: ladd
    //   470: putfield 1914	e7/p:e	J
    //   473: iload 11
    //   475: ifeq +24 -> 499
    //   478: aload 15
    //   480: astore 16
    //   482: aload 15
    //   484: astore 17
    //   486: aload 13
    //   488: aload 13
    //   490: getfield 1915	e7/p:f	J
    //   493: lload 4
    //   495: ladd
    //   496: putfield 1915	e7/p:f	J
    //   499: iload 12
    //   501: ifeq +24 -> 525
    //   504: aload 15
    //   506: astore 16
    //   508: aload 15
    //   510: astore 17
    //   512: aload 13
    //   514: aload 13
    //   516: getfield 1916	e7/p:g	J
    //   519: lload 4
    //   521: ladd
    //   522: putfield 1916	e7/p:g	J
    //   525: aload 15
    //   527: astore 16
    //   529: aload 15
    //   531: astore 17
    //   533: new 344	android/content/ContentValues
    //   536: astore 14
    //   538: aload 15
    //   540: astore 16
    //   542: aload 15
    //   544: astore 17
    //   546: aload 14
    //   548: invokespecial 809	android/content/ContentValues:<init>	()V
    //   551: aload 15
    //   553: astore 16
    //   555: aload 15
    //   557: astore 17
    //   559: aload 14
    //   561: ldc 88
    //   563: lload_1
    //   564: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   567: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   570: aload 15
    //   572: astore 16
    //   574: aload 15
    //   576: astore 17
    //   578: aload 14
    //   580: ldc 92
    //   582: aload 13
    //   584: getfield 1911	e7/p:a	J
    //   587: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   590: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   593: aload 15
    //   595: astore 16
    //   597: aload 15
    //   599: astore 17
    //   601: aload 14
    //   603: ldc 96
    //   605: aload 13
    //   607: getfield 1910	e7/p:b	J
    //   610: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   613: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   616: aload 15
    //   618: astore 16
    //   620: aload 15
    //   622: astore 17
    //   624: aload 14
    //   626: ldc 100
    //   628: aload 13
    //   630: getfield 1912	e7/p:c	J
    //   633: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   636: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   639: aload 15
    //   641: astore 16
    //   643: aload 15
    //   645: astore 17
    //   647: aload 14
    //   649: ldc 124
    //   651: aload 13
    //   653: getfield 1913	e7/p:d	J
    //   656: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   659: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   662: aload 15
    //   664: astore 16
    //   666: aload 15
    //   668: astore 17
    //   670: aload 14
    //   672: ldc -128
    //   674: aload 13
    //   676: getfield 1914	e7/p:e	J
    //   679: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   682: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   685: aload 15
    //   687: astore 16
    //   689: aload 15
    //   691: astore 17
    //   693: aload 14
    //   695: ldc -40
    //   697: aload 13
    //   699: getfield 1915	e7/p:f	J
    //   702: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   705: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   708: aload 15
    //   710: astore 16
    //   712: aload 15
    //   714: astore 17
    //   716: aload 14
    //   718: ldc -16
    //   720: aload 13
    //   722: getfield 1916	e7/p:g	J
    //   725: invokestatic 418	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   728: invokevirtual 353	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   731: aload 15
    //   733: astore 16
    //   735: aload 15
    //   737: astore 17
    //   739: aload 18
    //   741: ldc_w 1022
    //   744: aload 14
    //   746: ldc_w 593
    //   749: iconst_1
    //   750: anewarray 24	java/lang/String
    //   753: dup
    //   754: iconst_0
    //   755: aload_3
    //   756: aastore
    //   757: invokevirtual 762	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   760: pop
    //   761: aload 15
    //   763: invokeinterface 446 1 0
    //   768: aload 13
    //   770: areturn
    //   771: astore_3
    //   772: goto +43 -> 815
    //   775: astore 15
    //   777: aload 17
    //   779: astore 16
    //   781: aload_0
    //   782: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   785: getfield 381	e7/a1:o	Le7/b1;
    //   788: ldc_w 1918
    //   791: aload_3
    //   792: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   795: aload 15
    //   797: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   800: aload 17
    //   802: ifnull +10 -> 812
    //   805: aload 17
    //   807: invokeinterface 446 1 0
    //   812: aload 13
    //   814: areturn
    //   815: aload 16
    //   817: ifnull +10 -> 827
    //   820: aload 16
    //   822: invokeinterface 446 1 0
    //   827: aload_3
    //   828: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	829	0	this	o
    //   0	829	1	paramLong1	long
    //   0	829	3	paramString	String
    //   0	829	4	paramLong2	long
    //   0	829	6	paramBoolean1	boolean
    //   0	829	7	paramBoolean2	boolean
    //   0	829	8	paramBoolean3	boolean
    //   0	829	9	paramBoolean4	boolean
    //   0	829	10	paramBoolean5	boolean
    //   0	829	11	paramBoolean6	boolean
    //   0	829	12	paramBoolean7	boolean
    //   19	794	13	localp	p
    //   22	723	14	localContentValues	ContentValues
    //   25	737	15	localCursor	Cursor
    //   775	21	15	localSQLiteException	SQLiteException
    //   29	792	16	localObject1	Object
    //   33	773	17	localObject2	Object
    //   39	701	18	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   35	41	771	finally
    //   49	120	771	finally
    //   128	138	771	finally
    //   146	163	771	finally
    //   181	194	771	finally
    //   202	215	771	finally
    //   223	236	771	finally
    //   244	257	771	finally
    //   265	278	771	finally
    //   286	299	771	finally
    //   307	321	771	finally
    //   329	343	771	finally
    //   356	369	771	finally
    //   382	395	771	finally
    //   408	421	771	finally
    //   434	447	771	finally
    //   460	473	771	finally
    //   486	499	771	finally
    //   512	525	771	finally
    //   533	538	771	finally
    //   546	551	771	finally
    //   559	570	771	finally
    //   578	593	771	finally
    //   601	616	771	finally
    //   624	639	771	finally
    //   647	662	771	finally
    //   670	685	771	finally
    //   693	708	771	finally
    //   716	731	771	finally
    //   739	761	771	finally
    //   781	800	771	finally
    //   35	41	775	android/database/sqlite/SQLiteException
    //   49	120	775	android/database/sqlite/SQLiteException
    //   128	138	775	android/database/sqlite/SQLiteException
    //   146	163	775	android/database/sqlite/SQLiteException
    //   181	194	775	android/database/sqlite/SQLiteException
    //   202	215	775	android/database/sqlite/SQLiteException
    //   223	236	775	android/database/sqlite/SQLiteException
    //   244	257	775	android/database/sqlite/SQLiteException
    //   265	278	775	android/database/sqlite/SQLiteException
    //   286	299	775	android/database/sqlite/SQLiteException
    //   307	321	775	android/database/sqlite/SQLiteException
    //   329	343	775	android/database/sqlite/SQLiteException
    //   356	369	775	android/database/sqlite/SQLiteException
    //   382	395	775	android/database/sqlite/SQLiteException
    //   408	421	775	android/database/sqlite/SQLiteException
    //   434	447	775	android/database/sqlite/SQLiteException
    //   460	473	775	android/database/sqlite/SQLiteException
    //   486	499	775	android/database/sqlite/SQLiteException
    //   512	525	775	android/database/sqlite/SQLiteException
    //   533	538	775	android/database/sqlite/SQLiteException
    //   546	551	775	android/database/sqlite/SQLiteException
    //   559	570	775	android/database/sqlite/SQLiteException
    //   578	593	775	android/database/sqlite/SQLiteException
    //   601	616	775	android/database/sqlite/SQLiteException
    //   624	639	775	android/database/sqlite/SQLiteException
    //   647	662	775	android/database/sqlite/SQLiteException
    //   670	685	775	android/database/sqlite/SQLiteException
    //   693	708	775	android/database/sqlite/SQLiteException
    //   716	731	775	android/database/sqlite/SQLiteException
    //   739	761	775	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final void x0(String paramString)
  {
    // Byte code:
    //   0: new 629	java/util/ArrayList
    //   3: dup
    //   4: iconst_2
    //   5: anewarray 24	java/lang/String
    //   8: dup
    //   9: iconst_0
    //   10: ldc_w 689
    //   13: aastore
    //   14: dup
    //   15: iconst_1
    //   16: ldc_w 1047
    //   19: aastore
    //   20: invokestatic 1681	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   23: invokespecial 1684	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   26: astore_2
    //   27: aload_0
    //   28: aload_1
    //   29: ldc_w 1921
    //   32: invokevirtual 1901	e7/o:k0	(Ljava/lang/String;Ljava/lang/String;)Le7/b0;
    //   35: astore_3
    //   36: aload_0
    //   37: aload_1
    //   38: ldc_w 1923
    //   41: invokevirtual 1901	e7/o:k0	(Ljava/lang/String;Ljava/lang/String;)Le7/b0;
    //   44: astore 4
    //   46: aload_0
    //   47: ldc_w 841
    //   50: aload_1
    //   51: invokevirtual 1894	e7/o:u0	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: iconst_0
    //   55: istore 5
    //   57: iconst_0
    //   58: istore 6
    //   60: aconst_null
    //   61: astore 7
    //   63: aconst_null
    //   64: astore 8
    //   66: aload_0
    //   67: invokevirtual 426	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   70: ldc_w 1892
    //   73: aload_2
    //   74: iconst_0
    //   75: anewarray 24	java/lang/String
    //   78: invokevirtual 679	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   81: checkcast 680	[Ljava/lang/String;
    //   84: ldc_w 593
    //   87: iconst_1
    //   88: anewarray 24	java/lang/String
    //   91: dup
    //   92: iconst_0
    //   93: aload_1
    //   94: aastore
    //   95: aconst_null
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokevirtual 1669	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   101: astore_2
    //   102: aload_2
    //   103: astore 8
    //   105: aload_2
    //   106: astore 7
    //   108: aload_2
    //   109: invokeinterface 443 1 0
    //   114: istore 9
    //   116: iload 9
    //   118: ifne +47 -> 165
    //   121: aload_2
    //   122: invokeinterface 446 1 0
    //   127: aload_3
    //   128: ifnull +14 -> 142
    //   131: aload_0
    //   132: ldc_w 841
    //   135: aload_3
    //   136: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   139: goto +17 -> 156
    //   142: aload 4
    //   144: ifnull +12 -> 156
    //   147: aload_0
    //   148: ldc_w 841
    //   151: aload 4
    //   153: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   156: aload_0
    //   157: ldc_w 1892
    //   160: aload_1
    //   161: invokevirtual 1894	e7/o:u0	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: return
    //   165: iconst_0
    //   166: istore 5
    //   168: iload 5
    //   170: istore 6
    //   172: iload 5
    //   174: istore 10
    //   176: iload 6
    //   178: istore 11
    //   180: iload 5
    //   182: istore 12
    //   184: iload 6
    //   186: istore 13
    //   188: aload_2
    //   189: iconst_0
    //   190: invokeinterface 404 2 0
    //   195: astore 8
    //   197: iload 5
    //   199: istore 14
    //   201: iload 6
    //   203: istore 15
    //   205: iload 5
    //   207: istore 10
    //   209: iload 6
    //   211: istore 11
    //   213: iload 5
    //   215: istore 12
    //   217: iload 6
    //   219: istore 13
    //   221: aload_2
    //   222: iconst_1
    //   223: invokeinterface 415 2 0
    //   228: lconst_1
    //   229: lcmp
    //   230: iflt +82 -> 312
    //   233: iload 5
    //   235: istore 10
    //   237: iload 6
    //   239: istore 11
    //   241: iload 5
    //   243: istore 12
    //   245: iload 6
    //   247: istore 13
    //   249: ldc_w 1921
    //   252: aload 8
    //   254: invokevirtual 1209	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   257: ifeq +13 -> 270
    //   260: iconst_1
    //   261: istore 14
    //   263: iload 6
    //   265: istore 15
    //   267: goto +45 -> 312
    //   270: iload 5
    //   272: istore 14
    //   274: iload 6
    //   276: istore 15
    //   278: iload 5
    //   280: istore 10
    //   282: iload 6
    //   284: istore 11
    //   286: iload 5
    //   288: istore 12
    //   290: iload 6
    //   292: istore 13
    //   294: ldc_w 1923
    //   297: aload 8
    //   299: invokevirtual 1209	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   302: ifeq +10 -> 312
    //   305: iconst_1
    //   306: istore 15
    //   308: iload 5
    //   310: istore 14
    //   312: aload 8
    //   314: ifnull +61 -> 375
    //   317: iload 14
    //   319: istore 10
    //   321: iload 15
    //   323: istore 11
    //   325: iload 14
    //   327: istore 12
    //   329: iload 15
    //   331: istore 13
    //   333: aload_0
    //   334: ldc_w 1892
    //   337: aload_1
    //   338: aload 8
    //   340: invokevirtual 1699	e7/o:j0	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le7/b0;
    //   343: astore 8
    //   345: aload 8
    //   347: ifnull +28 -> 375
    //   350: iload 14
    //   352: istore 10
    //   354: iload 15
    //   356: istore 11
    //   358: iload 14
    //   360: istore 12
    //   362: iload 15
    //   364: istore 13
    //   366: aload_0
    //   367: ldc_w 841
    //   370: aload 8
    //   372: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   375: iload 14
    //   377: istore 10
    //   379: iload 15
    //   381: istore 11
    //   383: iload 14
    //   385: istore 12
    //   387: iload 15
    //   389: istore 13
    //   391: aload_2
    //   392: invokeinterface 634 1 0
    //   397: istore 9
    //   399: iload 14
    //   401: istore 5
    //   403: iload 15
    //   405: istore 6
    //   407: iload 9
    //   409: ifne -237 -> 172
    //   412: aload_2
    //   413: invokeinterface 446 1 0
    //   418: iload 14
    //   420: ifne +18 -> 438
    //   423: aload_3
    //   424: ifnull +14 -> 438
    //   427: aload_0
    //   428: ldc_w 841
    //   431: aload_3
    //   432: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   435: goto +22 -> 457
    //   438: iload 15
    //   440: ifne +17 -> 457
    //   443: aload 4
    //   445: ifnull +12 -> 457
    //   448: aload_0
    //   449: ldc_w 841
    //   452: aload 4
    //   454: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   457: aload_0
    //   458: ldc_w 1892
    //   461: aload_1
    //   462: invokevirtual 1894	e7/o:u0	(Ljava/lang/String;Ljava/lang/String;)V
    //   465: return
    //   466: astore 7
    //   468: iload 10
    //   470: istore 6
    //   472: iload 11
    //   474: istore 13
    //   476: goto +114 -> 590
    //   479: astore 8
    //   481: iload 12
    //   483: istore 6
    //   485: goto +26 -> 511
    //   488: astore 7
    //   490: iconst_0
    //   491: istore 13
    //   493: iload 5
    //   495: istore 6
    //   497: aload 8
    //   499: astore_2
    //   500: goto +90 -> 590
    //   503: astore 8
    //   505: iconst_0
    //   506: istore 13
    //   508: aload 7
    //   510: astore_2
    //   511: aload_0
    //   512: invokevirtual 376	d2/q:zzj	()Le7/a1;
    //   515: getfield 381	e7/a1:o	Le7/b1;
    //   518: ldc_w 1925
    //   521: aload_1
    //   522: invokestatic 754	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   525: aload 8
    //   527: invokevirtual 454	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   530: aload_2
    //   531: ifnull +9 -> 540
    //   534: aload_2
    //   535: invokeinterface 446 1 0
    //   540: iload 6
    //   542: ifne +18 -> 560
    //   545: aload_3
    //   546: ifnull +14 -> 560
    //   549: aload_0
    //   550: ldc_w 841
    //   553: aload_3
    //   554: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   557: goto +22 -> 579
    //   560: iload 13
    //   562: ifne +17 -> 579
    //   565: aload 4
    //   567: ifnull +12 -> 579
    //   570: aload_0
    //   571: ldc_w 841
    //   574: aload 4
    //   576: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   579: aload_0
    //   580: ldc_w 1892
    //   583: aload_1
    //   584: invokevirtual 1894	e7/o:u0	(Ljava/lang/String;Ljava/lang/String;)V
    //   587: return
    //   588: astore 7
    //   590: aload_2
    //   591: ifnull +9 -> 600
    //   594: aload_2
    //   595: invokeinterface 446 1 0
    //   600: iload 6
    //   602: ifne +21 -> 623
    //   605: aload_3
    //   606: ifnonnull +6 -> 612
    //   609: goto +14 -> 623
    //   612: aload_0
    //   613: ldc_w 841
    //   616: aload_3
    //   617: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   620: goto +22 -> 642
    //   623: iload 13
    //   625: ifne +17 -> 642
    //   628: aload 4
    //   630: ifnull +12 -> 642
    //   633: aload_0
    //   634: ldc_w 841
    //   637: aload 4
    //   639: invokevirtual 845	e7/o:L	(Ljava/lang/String;Le7/b0;)V
    //   642: aload_0
    //   643: ldc_w 1892
    //   646: aload_1
    //   647: invokevirtual 1894	e7/o:u0	(Ljava/lang/String;Ljava/lang/String;)V
    //   650: aload 7
    //   652: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	653	0	this	o
    //   0	653	1	paramString	String
    //   26	569	2	localObject1	Object
    //   35	582	3	localb01	b0
    //   44	594	4	localb02	b0
    //   55	439	5	i	int
    //   58	543	6	j	int
    //   61	46	7	localObject2	Object
    //   466	1	7	localObject3	Object
    //   488	21	7	localObject4	Object
    //   588	63	7	localObject5	Object
    //   64	307	8	localObject6	Object
    //   479	19	8	localSQLiteException1	SQLiteException
    //   503	23	8	localSQLiteException2	SQLiteException
    //   114	294	9	bool	boolean
    //   174	295	10	k	int
    //   178	295	11	m	int
    //   182	300	12	n	int
    //   186	438	13	i1	int
    //   199	220	14	i2	int
    //   203	236	15	i3	int
    // Exception table:
    //   from	to	target	type
    //   188	197	466	finally
    //   221	233	466	finally
    //   249	260	466	finally
    //   294	305	466	finally
    //   333	345	466	finally
    //   366	375	466	finally
    //   391	399	466	finally
    //   188	197	479	android/database/sqlite/SQLiteException
    //   221	233	479	android/database/sqlite/SQLiteException
    //   249	260	479	android/database/sqlite/SQLiteException
    //   294	305	479	android/database/sqlite/SQLiteException
    //   333	345	479	android/database/sqlite/SQLiteException
    //   366	375	479	android/database/sqlite/SQLiteException
    //   391	399	479	android/database/sqlite/SQLiteException
    //   66	102	488	finally
    //   108	116	488	finally
    //   66	102	503	android/database/sqlite/SQLiteException
    //   108	116	503	android/database/sqlite/SQLiteException
    //   511	530	588	finally
  }
  
  public final p y(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    return x(paramLong, paramString, 1L, false, false, paramBoolean1, false, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  public final void y0()
  {
    p();
    s().beginTransaction();
  }
  
  public final n6 z(String paramString1, long paramLong1, byte[] paramArrayOfByte, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong2, long paramLong3)
  {
    if (TextUtils.isEmpty(paramString2))
    {
      zzjv.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
      return null;
    }
    try
    {
      paramArrayOfByte = (zzgf.zzj.zzb)o6.z(zzgf.zzj.zzb(), paramArrayOfByte);
      for (int k : q0.g.d(6)) {
        if (g.a(k) == paramInt1)
        {
          paramInt1 = k;
          break label92;
        }
      }
      paramInt1 = 6;
      label92:
      ArrayList localArrayList;
      Object localObject2;
      if ((paramInt1 != 2) && (paramInt1 != 5) && (paramInt2 > 0))
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject2 = paramArrayOfByte.zzd().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ??? = (zzgf.zzk.zza)((zzgf.zzk)((Iterator)localObject2).next()).zzch();
          ((zzgf.zzk.zza)???).zzi(paramInt2);
          localArrayList.add((zzgf.zzk)((zzkg.zza)???).zzaj());
        }
        paramArrayOfByte.zzb();
        paramArrayOfByte.zza(localArrayList);
      }
      ??? = new java/util/HashMap;
      ((HashMap)???).<init>();
      if (paramString3 != null) {
        for (localArrayList : paramString3.split("\r\n"))
        {
          if (localArrayList.isEmpty()) {
            break;
          }
          paramString3 = localArrayList.split("=", 2);
          if (paramString3.length != 2)
          {
            zzjo.c("Invalid upload header: ", localArrayList);
            break;
          }
          ((HashMap)???).put(paramString3[0], paramString3[1]);
        }
      }
      paramArrayOfByte = new n6(paramLong1, (zzgf.zzj)paramArrayOfByte.zzaj(), paramString2, (Map)???, paramInt1, paramLong3);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      zzjo.d("Failed to queued MeasurementBatch from upload_queue. appId", paramString1, paramArrayOfByte);
    }
    return null;
  }
  
  public final boolean z0(String paramString)
  {
    if (!h().x(null, h0.I0)) {
      return false;
    }
    if (h().x(null, h0.K0))
    {
      Object localObject = new ArrayList(1);
      for (int i = 0; i <= 0; i++) {
        ((ArrayList)localObject).add(Integer.valueOf(g.a(new int[] { 2 }[0])));
      }
      if (((ArrayList)localObject).isEmpty()) {
        localObject = "";
      } else {
        localObject = String.format(" AND (upload_type IN (%s))", new Object[] { TextUtils.join(", ", (Iterable)localObject) });
      }
      String str = Z();
      StringBuilder localStringBuilder = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" AND NOT ");
      localStringBuilder.append(str);
      return b0(localStringBuilder.toString(), new String[] { paramString }) != 0L;
    }
    return b0(f.j("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", Z()), new String[] { paramString }) != 0L;
  }
}

/* Location:
 * Qualified Name:     e7.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */