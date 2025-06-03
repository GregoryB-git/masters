package R2;

import A2.n;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.A1.a;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Y3.b;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.w1;
import com.google.android.gms.internal.measurement.w1.a;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.x1.a;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.y1.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class p
  extends C5
{
  public static final String[] f = { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;" };
  public static final String[] g = { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
  public static final String[] h = { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;" };
  public static final String[] i = { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
  public static final String[] j = { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
  public static final String[] k = { "session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;" };
  public static final String[] l = { "session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;" };
  public static final String[] m = { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
  public static final String[] n = { "consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;" };
  public static final String[] o = { "idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);" };
  public final v d = new v(this, a(), "google_app_measurement.db");
  public final w5 e = new w5(b());
  
  public p(D5 paramD5)
  {
    super(paramD5);
  }
  
  public static void V(ContentValues paramContentValues, String paramString, Object paramObject)
  {
    n.e(paramString);
    n.i(paramObject);
    if ((paramObject instanceof String))
    {
      paramContentValues.put(paramString, (String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramContentValues.put(paramString, (Long)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramContentValues.put(paramString, (Double)paramObject);
      return;
    }
    throw new IllegalArgumentException("Invalid value type");
  }
  
  public final long A()
  {
    return G("select max(timestamp) from raw_events", null, 0L);
  }
  
  /* Error */
  public final e A0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 357	R2/m3:n	()V
    //   14: aload_0
    //   15: invokevirtual 360	R2/C5:u	()V
    //   18: aconst_null
    //   19: astore_3
    //   20: aload_0
    //   21: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: ldc_w 366
    //   27: bipush 11
    //   29: anewarray 23	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: ldc 51
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: ldc_w 368
    //   42: aastore
    //   43: dup
    //   44: iconst_2
    //   45: ldc_w 370
    //   48: aastore
    //   49: dup
    //   50: iconst_3
    //   51: ldc_w 372
    //   54: aastore
    //   55: dup
    //   56: iconst_4
    //   57: ldc_w 374
    //   60: aastore
    //   61: dup
    //   62: iconst_5
    //   63: ldc_w 376
    //   66: aastore
    //   67: dup
    //   68: bipush 6
    //   70: ldc_w 378
    //   73: aastore
    //   74: dup
    //   75: bipush 7
    //   77: ldc_w 380
    //   80: aastore
    //   81: dup
    //   82: bipush 8
    //   84: ldc_w 382
    //   87: aastore
    //   88: dup
    //   89: bipush 9
    //   91: ldc_w 384
    //   94: aastore
    //   95: dup
    //   96: bipush 10
    //   98: ldc_w 386
    //   101: aastore
    //   102: ldc_w 388
    //   105: iconst_2
    //   106: anewarray 23	java/lang/String
    //   109: dup
    //   110: iconst_0
    //   111: aload_1
    //   112: aastore
    //   113: dup
    //   114: iconst_1
    //   115: aload_2
    //   116: aastore
    //   117: aconst_null
    //   118: aconst_null
    //   119: aconst_null
    //   120: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   123: astore 4
    //   125: aload 4
    //   127: invokeinterface 398 1 0
    //   132: istore 5
    //   134: iload 5
    //   136: ifne +12 -> 148
    //   139: aload 4
    //   141: invokeinterface 401 1 0
    //   146: aconst_null
    //   147: areturn
    //   148: aload 4
    //   150: iconst_0
    //   151: invokeinterface 288 2 0
    //   156: astore_3
    //   157: aload_3
    //   158: astore 6
    //   160: aload_3
    //   161: ifnonnull +8 -> 169
    //   164: ldc_w 403
    //   167: astore 6
    //   169: goto +12 -> 181
    //   172: astore_1
    //   173: goto +392 -> 565
    //   176: astore 6
    //   178: goto +343 -> 521
    //   181: aload 4
    //   183: astore_3
    //   184: aload_0
    //   185: aload 4
    //   187: iconst_1
    //   188: invokevirtual 407	R2/p:M	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   191: astore 7
    //   193: aload 4
    //   195: astore_3
    //   196: aload 4
    //   198: iconst_2
    //   199: invokeinterface 292 2 0
    //   204: ifeq +9 -> 213
    //   207: iconst_1
    //   208: istore 5
    //   210: goto +6 -> 216
    //   213: iconst_0
    //   214: istore 5
    //   216: aload 4
    //   218: astore_3
    //   219: aload 4
    //   221: iconst_3
    //   222: invokeinterface 288 2 0
    //   227: astore 8
    //   229: aload 4
    //   231: astore_3
    //   232: aload 4
    //   234: iconst_4
    //   235: invokeinterface 411 2 0
    //   240: lstore 9
    //   242: aload 4
    //   244: astore_3
    //   245: aload_0
    //   246: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   249: astore 11
    //   251: aload 4
    //   253: astore_3
    //   254: aload 4
    //   256: iconst_5
    //   257: invokeinterface 420 2 0
    //   262: astore 12
    //   264: aload 4
    //   266: astore_3
    //   267: getstatic 426	R2/I:CREATOR	Landroid/os/Parcelable$Creator;
    //   270: astore 13
    //   272: aload 4
    //   274: astore_3
    //   275: aload 11
    //   277: aload 12
    //   279: aload 13
    //   281: invokevirtual 432	R2/N5:E	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   284: checkcast 422	R2/I
    //   287: astore 11
    //   289: aload 4
    //   291: astore_3
    //   292: aload 4
    //   294: bipush 6
    //   296: invokeinterface 411 2 0
    //   301: lstore 14
    //   303: aload 4
    //   305: astore_3
    //   306: aload_0
    //   307: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   310: aload 4
    //   312: bipush 7
    //   314: invokeinterface 420 2 0
    //   319: aload 13
    //   321: invokevirtual 432	R2/N5:E	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   324: checkcast 422	R2/I
    //   327: astore 12
    //   329: aload 4
    //   331: astore_3
    //   332: aload 4
    //   334: bipush 8
    //   336: invokeinterface 411 2 0
    //   341: lstore 16
    //   343: aload 4
    //   345: astore_3
    //   346: aload 4
    //   348: bipush 9
    //   350: invokeinterface 411 2 0
    //   355: lstore 18
    //   357: aload 4
    //   359: astore_3
    //   360: aload_0
    //   361: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   364: aload 4
    //   366: bipush 10
    //   368: invokeinterface 420 2 0
    //   373: aload 13
    //   375: invokevirtual 432	R2/N5:E	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   378: checkcast 422	R2/I
    //   381: astore 20
    //   383: aload 4
    //   385: astore_3
    //   386: new 434	R2/R5
    //   389: astore 13
    //   391: aload 4
    //   393: astore_3
    //   394: aload 13
    //   396: aload_2
    //   397: lload 16
    //   399: aload 7
    //   401: aload 6
    //   403: invokespecial 437	R2/R5:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   406: aload 4
    //   408: astore_3
    //   409: new 439	R2/e
    //   412: astore 7
    //   414: aload 4
    //   416: astore_3
    //   417: aload 7
    //   419: aload_1
    //   420: aload 6
    //   422: aload 13
    //   424: lload 14
    //   426: iload 5
    //   428: aload 8
    //   430: aload 11
    //   432: lload 9
    //   434: aload 12
    //   436: lload 18
    //   438: aload 20
    //   440: invokespecial 442	R2/e:<init>	(Ljava/lang/String;Ljava/lang/String;LR2/R5;JZLjava/lang/String;LR2/I;JLR2/I;JLR2/I;)V
    //   443: aload 4
    //   445: astore_3
    //   446: aload 4
    //   448: invokeinterface 445 1 0
    //   453: ifeq +46 -> 499
    //   456: aload 4
    //   458: astore_3
    //   459: aload_0
    //   460: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   463: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   466: ldc_w 455
    //   469: aload_1
    //   470: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   473: aload_0
    //   474: invokevirtual 462	R2/m3:h	()LR2/X1;
    //   477: aload_2
    //   478: invokevirtual 466	R2/X1:g	(Ljava/lang/String;)Ljava/lang/String;
    //   481: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   484: goto +15 -> 499
    //   487: astore_1
    //   488: aload_3
    //   489: astore 4
    //   491: goto -318 -> 173
    //   494: astore 6
    //   496: goto +25 -> 521
    //   499: aload 4
    //   501: invokeinterface 401 1 0
    //   506: aload 7
    //   508: areturn
    //   509: astore_1
    //   510: aload_3
    //   511: astore 4
    //   513: goto +52 -> 565
    //   516: astore 6
    //   518: aconst_null
    //   519: astore 4
    //   521: aload 4
    //   523: astore_3
    //   524: aload_0
    //   525: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   528: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   531: ldc_w 474
    //   534: aload_1
    //   535: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   538: aload_0
    //   539: invokevirtual 462	R2/m3:h	()LR2/X1;
    //   542: aload_2
    //   543: invokevirtual 466	R2/X1:g	(Ljava/lang/String;)Ljava/lang/String;
    //   546: aload 6
    //   548: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   551: aload 4
    //   553: ifnull +10 -> 563
    //   556: aload 4
    //   558: invokeinterface 401 1 0
    //   563: aconst_null
    //   564: areturn
    //   565: aload 4
    //   567: ifnull +10 -> 577
    //   570: aload 4
    //   572: invokeinterface 401 1 0
    //   577: aload_1
    //   578: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	579	0	this	p
    //   0	579	1	paramString1	String
    //   0	579	2	paramString2	String
    //   19	505	3	localObject1	Object
    //   123	448	4	localObject2	Object
    //   132	295	5	bool	boolean
    //   158	10	6	localObject3	Object
    //   176	245	6	localSQLiteException1	SQLiteException
    //   494	1	6	localSQLiteException2	SQLiteException
    //   516	31	6	localSQLiteException3	SQLiteException
    //   191	316	7	localObject4	Object
    //   227	202	8	str	String
    //   240	193	9	l1	long
    //   249	182	11	localObject5	Object
    //   262	173	12	localObject6	Object
    //   270	153	13	localObject7	Object
    //   301	124	14	l2	long
    //   341	57	16	l3	long
    //   355	82	18	l4	long
    //   381	58	20	localI	I
    // Exception table:
    //   from	to	target	type
    //   125	134	172	finally
    //   148	157	172	finally
    //   125	134	176	android/database/sqlite/SQLiteException
    //   148	157	176	android/database/sqlite/SQLiteException
    //   184	193	487	finally
    //   196	207	487	finally
    //   219	229	487	finally
    //   232	242	487	finally
    //   245	251	487	finally
    //   254	264	487	finally
    //   267	272	487	finally
    //   275	289	487	finally
    //   292	303	487	finally
    //   306	329	487	finally
    //   332	343	487	finally
    //   346	357	487	finally
    //   360	383	487	finally
    //   386	391	487	finally
    //   394	406	487	finally
    //   409	414	487	finally
    //   417	443	487	finally
    //   446	456	487	finally
    //   459	484	487	finally
    //   524	551	487	finally
    //   184	193	494	android/database/sqlite/SQLiteException
    //   196	207	494	android/database/sqlite/SQLiteException
    //   219	229	494	android/database/sqlite/SQLiteException
    //   232	242	494	android/database/sqlite/SQLiteException
    //   245	251	494	android/database/sqlite/SQLiteException
    //   254	264	494	android/database/sqlite/SQLiteException
    //   267	272	494	android/database/sqlite/SQLiteException
    //   275	289	494	android/database/sqlite/SQLiteException
    //   292	303	494	android/database/sqlite/SQLiteException
    //   306	329	494	android/database/sqlite/SQLiteException
    //   332	343	494	android/database/sqlite/SQLiteException
    //   346	357	494	android/database/sqlite/SQLiteException
    //   360	383	494	android/database/sqlite/SQLiteException
    //   386	391	494	android/database/sqlite/SQLiteException
    //   394	406	494	android/database/sqlite/SQLiteException
    //   409	414	494	android/database/sqlite/SQLiteException
    //   417	443	494	android/database/sqlite/SQLiteException
    //   446	456	494	android/database/sqlite/SQLiteException
    //   459	484	494	android/database/sqlite/SQLiteException
    //   20	125	509	finally
    //   20	125	516	android/database/sqlite/SQLiteException
  }
  
  public final SQLiteDatabase B()
  {
    n();
    try
    {
      SQLiteDatabase localSQLiteDatabase = d.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      j().L().b("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  /* Error */
  public final Bundle B0(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 357	R2/m3:n	()V
    //   4: aload_0
    //   5: invokevirtual 360	R2/C5:u	()V
    //   8: aconst_null
    //   9: astore_2
    //   10: aload_0
    //   11: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 494
    //   17: iconst_1
    //   18: anewarray 23	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: astore 4
    //   32: aload_3
    //   33: invokeinterface 398 1 0
    //   38: ifne +47 -> 85
    //   41: aload_3
    //   42: astore 4
    //   44: aload_0
    //   45: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   48: invokevirtual 500	R2/Y1:K	()LR2/a2;
    //   51: ldc_w 502
    //   54: invokevirtual 504	R2/a2:a	(Ljava/lang/String;)V
    //   57: aload_3
    //   58: invokeinterface 401 1 0
    //   63: aconst_null
    //   64: areturn
    //   65: astore_3
    //   66: aload 4
    //   68: astore_1
    //   69: aload_3
    //   70: astore 4
    //   72: goto +310 -> 382
    //   75: astore 4
    //   77: aload_3
    //   78: astore_1
    //   79: aload 4
    //   81: astore_3
    //   82: goto +271 -> 353
    //   85: aload_3
    //   86: astore 4
    //   88: aload_3
    //   89: iconst_0
    //   90: invokeinterface 420 2 0
    //   95: astore_2
    //   96: aload_3
    //   97: astore 4
    //   99: invokestatic 510	com/google/android/gms/internal/measurement/Y1:Z	()Lcom/google/android/gms/internal/measurement/Y1$a;
    //   102: aload_2
    //   103: invokestatic 514	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   106: checkcast 516	com/google/android/gms/internal/measurement/Y1$a
    //   109: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   112: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   115: checkcast 506	com/google/android/gms/internal/measurement/Y1
    //   118: astore_2
    //   119: aload_3
    //   120: astore 4
    //   122: aload_0
    //   123: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   126: pop
    //   127: aload_3
    //   128: astore 4
    //   130: aload_2
    //   131: invokevirtual 528	com/google/android/gms/internal/measurement/Y1:c0	()Ljava/util/List;
    //   134: astore_2
    //   135: aload_3
    //   136: astore 4
    //   138: new 530	android/os/Bundle
    //   141: astore_1
    //   142: aload_3
    //   143: astore 4
    //   145: aload_1
    //   146: invokespecial 532	android/os/Bundle:<init>	()V
    //   149: aload_3
    //   150: astore 4
    //   152: aload_2
    //   153: invokeinterface 538 1 0
    //   158: astore 5
    //   160: aload_3
    //   161: astore 4
    //   163: aload 5
    //   165: invokeinterface 543 1 0
    //   170: ifeq +135 -> 305
    //   173: aload_3
    //   174: astore 4
    //   176: aload 5
    //   178: invokeinterface 547 1 0
    //   183: checkcast 549	com/google/android/gms/internal/measurement/a2
    //   186: astore 6
    //   188: aload_3
    //   189: astore 4
    //   191: aload 6
    //   193: invokevirtual 552	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   196: astore_2
    //   197: aload_3
    //   198: astore 4
    //   200: aload 6
    //   202: invokevirtual 555	com/google/android/gms/internal/measurement/a2:f0	()Z
    //   205: ifeq +19 -> 224
    //   208: aload_3
    //   209: astore 4
    //   211: aload_1
    //   212: aload_2
    //   213: aload 6
    //   215: invokevirtual 558	com/google/android/gms/internal/measurement/a2:G	()D
    //   218: invokevirtual 564	android/os/BaseBundle:putDouble	(Ljava/lang/String;D)V
    //   221: goto -61 -> 160
    //   224: aload_3
    //   225: astore 4
    //   227: aload 6
    //   229: invokevirtual 567	com/google/android/gms/internal/measurement/a2:g0	()Z
    //   232: ifeq +19 -> 251
    //   235: aload_3
    //   236: astore 4
    //   238: aload_1
    //   239: aload_2
    //   240: aload 6
    //   242: invokevirtual 571	com/google/android/gms/internal/measurement/a2:R	()F
    //   245: invokevirtual 575	android/os/Bundle:putFloat	(Ljava/lang/String;F)V
    //   248: goto -88 -> 160
    //   251: aload_3
    //   252: astore 4
    //   254: aload 6
    //   256: invokevirtual 578	com/google/android/gms/internal/measurement/a2:j0	()Z
    //   259: ifeq +19 -> 278
    //   262: aload_3
    //   263: astore 4
    //   265: aload_1
    //   266: aload_2
    //   267: aload 6
    //   269: invokevirtual 581	com/google/android/gms/internal/measurement/a2:d0	()Ljava/lang/String;
    //   272: invokevirtual 584	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   275: goto -115 -> 160
    //   278: aload_3
    //   279: astore 4
    //   281: aload 6
    //   283: invokevirtual 587	com/google/android/gms/internal/measurement/a2:h0	()Z
    //   286: ifeq -126 -> 160
    //   289: aload_3
    //   290: astore 4
    //   292: aload_1
    //   293: aload_2
    //   294: aload 6
    //   296: invokevirtual 590	com/google/android/gms/internal/measurement/a2:X	()J
    //   299: invokevirtual 594	android/os/BaseBundle:putLong	(Ljava/lang/String;J)V
    //   302: goto -142 -> 160
    //   305: aload_3
    //   306: invokeinterface 401 1 0
    //   311: aload_1
    //   312: areturn
    //   313: astore_2
    //   314: aload_3
    //   315: astore 4
    //   317: aload_0
    //   318: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   321: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   324: ldc_w 596
    //   327: aload_1
    //   328: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   331: aload_2
    //   332: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   335: aload_3
    //   336: invokeinterface 401 1 0
    //   341: aconst_null
    //   342: areturn
    //   343: astore 4
    //   345: aload_2
    //   346: astore_1
    //   347: goto +35 -> 382
    //   350: astore_3
    //   351: aconst_null
    //   352: astore_1
    //   353: aload_1
    //   354: astore 4
    //   356: aload_0
    //   357: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   360: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   363: ldc_w 598
    //   366: aload_3
    //   367: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   370: aload_1
    //   371: ifnull +9 -> 380
    //   374: aload_1
    //   375: invokeinterface 401 1 0
    //   380: aconst_null
    //   381: areturn
    //   382: aload_1
    //   383: ifnull +9 -> 392
    //   386: aload_1
    //   387: invokeinterface 401 1 0
    //   392: aload 4
    //   394: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	395	0	this	p
    //   0	395	1	paramString	String
    //   9	285	2	localObject1	Object
    //   313	33	2	localIOException	IOException
    //   28	30	3	localCursor	Cursor
    //   65	13	3	localObject2	Object
    //   81	255	3	localObject3	Object
    //   350	17	3	localSQLiteException1	SQLiteException
    //   30	41	4	localObject4	Object
    //   75	5	4	localSQLiteException2	SQLiteException
    //   86	230	4	localObject5	Object
    //   343	1	4	localObject6	Object
    //   354	39	4	str	String
    //   158	19	5	localIterator	Iterator
    //   186	109	6	locala2	com.google.android.gms.internal.measurement.a2
    // Exception table:
    //   from	to	target	type
    //   32	41	65	finally
    //   44	57	65	finally
    //   88	96	65	finally
    //   99	119	65	finally
    //   122	127	65	finally
    //   130	135	65	finally
    //   138	142	65	finally
    //   145	149	65	finally
    //   152	160	65	finally
    //   163	173	65	finally
    //   176	188	65	finally
    //   191	197	65	finally
    //   200	208	65	finally
    //   211	221	65	finally
    //   227	235	65	finally
    //   238	248	65	finally
    //   254	262	65	finally
    //   265	275	65	finally
    //   281	289	65	finally
    //   292	302	65	finally
    //   317	335	65	finally
    //   356	370	65	finally
    //   32	41	75	android/database/sqlite/SQLiteException
    //   44	57	75	android/database/sqlite/SQLiteException
    //   88	96	75	android/database/sqlite/SQLiteException
    //   99	119	75	android/database/sqlite/SQLiteException
    //   122	127	75	android/database/sqlite/SQLiteException
    //   130	135	75	android/database/sqlite/SQLiteException
    //   138	142	75	android/database/sqlite/SQLiteException
    //   145	149	75	android/database/sqlite/SQLiteException
    //   152	160	75	android/database/sqlite/SQLiteException
    //   163	173	75	android/database/sqlite/SQLiteException
    //   176	188	75	android/database/sqlite/SQLiteException
    //   191	197	75	android/database/sqlite/SQLiteException
    //   200	208	75	android/database/sqlite/SQLiteException
    //   211	221	75	android/database/sqlite/SQLiteException
    //   227	235	75	android/database/sqlite/SQLiteException
    //   238	248	75	android/database/sqlite/SQLiteException
    //   254	262	75	android/database/sqlite/SQLiteException
    //   265	275	75	android/database/sqlite/SQLiteException
    //   281	289	75	android/database/sqlite/SQLiteException
    //   292	302	75	android/database/sqlite/SQLiteException
    //   317	335	75	android/database/sqlite/SQLiteException
    //   99	119	313	java/io/IOException
    //   10	29	343	finally
    //   10	29	350	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final String C()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_1
    //   5: aload_1
    //   6: ldc_w 601
    //   9: aconst_null
    //   10: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   13: astore_2
    //   14: aload_2
    //   15: astore_1
    //   16: aload_2
    //   17: invokeinterface 398 1 0
    //   22: ifeq +29 -> 51
    //   25: aload_2
    //   26: astore_1
    //   27: aload_2
    //   28: iconst_0
    //   29: invokeinterface 288 2 0
    //   34: astore_3
    //   35: aload_2
    //   36: invokeinterface 401 1 0
    //   41: aload_3
    //   42: areturn
    //   43: astore_2
    //   44: goto +52 -> 96
    //   47: astore_3
    //   48: goto +20 -> 68
    //   51: aload_2
    //   52: invokeinterface 401 1 0
    //   57: aconst_null
    //   58: areturn
    //   59: astore_2
    //   60: aconst_null
    //   61: astore_1
    //   62: goto +34 -> 96
    //   65: astore_3
    //   66: aconst_null
    //   67: astore_2
    //   68: aload_2
    //   69: astore_1
    //   70: aload_0
    //   71: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   74: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   77: ldc_w 603
    //   80: aload_3
    //   81: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   84: aload_2
    //   85: ifnull +9 -> 94
    //   88: aload_2
    //   89: invokeinterface 401 1 0
    //   94: aconst_null
    //   95: areturn
    //   96: aload_1
    //   97: ifnull +9 -> 106
    //   100: aload_1
    //   101: invokeinterface 401 1 0
    //   106: aload_2
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	p
    //   4	97	1	localObject1	Object
    //   13	23	2	localCursor	Cursor
    //   43	9	2	localObject2	Object
    //   59	1	2	localObject3	Object
    //   67	40	2	localObject4	Object
    //   34	8	3	str	String
    //   47	1	3	localSQLiteException1	SQLiteException
    //   65	16	3	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   16	25	43	finally
    //   27	35	43	finally
    //   70	84	43	finally
    //   16	25	47	android/database/sqlite/SQLiteException
    //   27	35	47	android/database/sqlite/SQLiteException
    //   5	14	59	finally
    //   5	14	65	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final E C0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 357	R2/m3:n	()V
    //   14: aload_0
    //   15: invokevirtual 360	R2/C5:u	()V
    //   18: new 607	java/util/ArrayList
    //   21: dup
    //   22: bipush 9
    //   24: anewarray 23	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: ldc_w 609
    //   32: aastore
    //   33: dup
    //   34: iconst_1
    //   35: ldc_w 611
    //   38: aastore
    //   39: dup
    //   40: iconst_2
    //   41: ldc_w 613
    //   44: aastore
    //   45: dup
    //   46: iconst_3
    //   47: ldc 25
    //   49: aastore
    //   50: dup
    //   51: iconst_4
    //   52: ldc 29
    //   54: aastore
    //   55: dup
    //   56: iconst_5
    //   57: ldc 33
    //   59: aastore
    //   60: dup
    //   61: bipush 6
    //   63: ldc 37
    //   65: aastore
    //   66: dup
    //   67: bipush 7
    //   69: ldc 41
    //   71: aastore
    //   72: dup
    //   73: bipush 8
    //   75: ldc 45
    //   77: aastore
    //   78: invokestatic 619	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   81: invokespecial 622	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   84: astore_3
    //   85: aconst_null
    //   86: astore 4
    //   88: aload_0
    //   89: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   92: astore 5
    //   94: iconst_0
    //   95: istore 6
    //   97: aload 5
    //   99: ldc_w 624
    //   102: aload_3
    //   103: iconst_0
    //   104: anewarray 23	java/lang/String
    //   107: invokevirtual 628	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   110: checkcast 629	[Ljava/lang/String;
    //   113: ldc_w 388
    //   116: iconst_2
    //   117: anewarray 23	java/lang/String
    //   120: dup
    //   121: iconst_0
    //   122: aload_1
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: aload_2
    //   127: aastore
    //   128: aconst_null
    //   129: aconst_null
    //   130: aconst_null
    //   131: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   134: astore_3
    //   135: aload_3
    //   136: astore 4
    //   138: aload_3
    //   139: invokeinterface 398 1 0
    //   144: istore 7
    //   146: iload 7
    //   148: ifne +11 -> 159
    //   151: aload_3
    //   152: invokeinterface 401 1 0
    //   157: aconst_null
    //   158: areturn
    //   159: aload_3
    //   160: astore 4
    //   162: aload_3
    //   163: iconst_0
    //   164: invokeinterface 411 2 0
    //   169: lstore 8
    //   171: aload_3
    //   172: astore 4
    //   174: aload_3
    //   175: iconst_1
    //   176: invokeinterface 411 2 0
    //   181: lstore 10
    //   183: aload_3
    //   184: astore 4
    //   186: aload_3
    //   187: iconst_2
    //   188: invokeinterface 411 2 0
    //   193: lstore 12
    //   195: aload_3
    //   196: astore 4
    //   198: aload_3
    //   199: iconst_3
    //   200: invokeinterface 633 2 0
    //   205: ifeq +9 -> 214
    //   208: lconst_0
    //   209: lstore 14
    //   211: goto +15 -> 226
    //   214: aload_3
    //   215: astore 4
    //   217: aload_3
    //   218: iconst_3
    //   219: invokeinterface 411 2 0
    //   224: lstore 14
    //   226: aload_3
    //   227: astore 4
    //   229: aload_3
    //   230: iconst_4
    //   231: invokeinterface 633 2 0
    //   236: ifeq +9 -> 245
    //   239: aconst_null
    //   240: astore 5
    //   242: goto +18 -> 260
    //   245: aload_3
    //   246: astore 4
    //   248: aload_3
    //   249: iconst_4
    //   250: invokeinterface 411 2 0
    //   255: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   258: astore 5
    //   260: aload_3
    //   261: astore 4
    //   263: aload_3
    //   264: iconst_5
    //   265: invokeinterface 633 2 0
    //   270: ifeq +9 -> 279
    //   273: aconst_null
    //   274: astore 16
    //   276: goto +18 -> 294
    //   279: aload_3
    //   280: astore 4
    //   282: aload_3
    //   283: iconst_5
    //   284: invokeinterface 411 2 0
    //   289: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   292: astore 16
    //   294: aload_3
    //   295: astore 4
    //   297: aload_3
    //   298: bipush 6
    //   300: invokeinterface 633 2 0
    //   305: ifeq +9 -> 314
    //   308: aconst_null
    //   309: astore 17
    //   311: goto +19 -> 330
    //   314: aload_3
    //   315: astore 4
    //   317: aload_3
    //   318: bipush 6
    //   320: invokeinterface 411 2 0
    //   325: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   328: astore 17
    //   330: aload_3
    //   331: astore 4
    //   333: aload_3
    //   334: bipush 7
    //   336: invokeinterface 633 2 0
    //   341: ifne +44 -> 385
    //   344: aload_3
    //   345: astore 4
    //   347: aload_3
    //   348: bipush 7
    //   350: invokeinterface 411 2 0
    //   355: lconst_1
    //   356: lcmp
    //   357: ifne +6 -> 363
    //   360: iconst_1
    //   361: istore 6
    //   363: aload_3
    //   364: astore 4
    //   366: iload 6
    //   368: invokestatic 642	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   371: astore 18
    //   373: goto +15 -> 388
    //   376: astore_1
    //   377: goto +171 -> 548
    //   380: astore 5
    //   382: goto +124 -> 506
    //   385: aconst_null
    //   386: astore 18
    //   388: aload_3
    //   389: astore 4
    //   391: aload_3
    //   392: bipush 8
    //   394: invokeinterface 633 2 0
    //   399: ifeq +9 -> 408
    //   402: lconst_0
    //   403: lstore 19
    //   405: goto +16 -> 421
    //   408: aload_3
    //   409: astore 4
    //   411: aload_3
    //   412: bipush 8
    //   414: invokeinterface 411 2 0
    //   419: lstore 19
    //   421: aload_3
    //   422: astore 4
    //   424: new 644	R2/E
    //   427: astore 21
    //   429: aload_3
    //   430: astore 4
    //   432: aload 21
    //   434: aload_1
    //   435: aload_2
    //   436: lload 8
    //   438: lload 10
    //   440: lload 19
    //   442: lload 12
    //   444: lload 14
    //   446: aload 5
    //   448: aload 16
    //   450: aload 17
    //   452: aload 18
    //   454: invokespecial 647	R2/E:<init>	(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    //   457: aload_3
    //   458: astore 4
    //   460: aload_3
    //   461: invokeinterface 445 1 0
    //   466: ifeq +23 -> 489
    //   469: aload_3
    //   470: astore 4
    //   472: aload_0
    //   473: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   476: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   479: ldc_w 649
    //   482: aload_1
    //   483: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   486: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   489: aload_3
    //   490: invokeinterface 401 1 0
    //   495: aload 21
    //   497: areturn
    //   498: astore_1
    //   499: goto +49 -> 548
    //   502: astore 5
    //   504: aconst_null
    //   505: astore_3
    //   506: aload_3
    //   507: astore 4
    //   509: aload_0
    //   510: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   513: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   516: ldc_w 651
    //   519: aload_1
    //   520: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   523: aload_0
    //   524: invokevirtual 462	R2/m3:h	()LR2/X1;
    //   527: aload_2
    //   528: invokevirtual 653	R2/X1:c	(Ljava/lang/String;)Ljava/lang/String;
    //   531: aload 5
    //   533: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   536: aload_3
    //   537: ifnull +9 -> 546
    //   540: aload_3
    //   541: invokeinterface 401 1 0
    //   546: aconst_null
    //   547: areturn
    //   548: aload 4
    //   550: ifnull +10 -> 560
    //   553: aload 4
    //   555: invokeinterface 401 1 0
    //   560: aload_1
    //   561: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	562	0	this	p
    //   0	562	1	paramString1	String
    //   0	562	2	paramString2	String
    //   84	457	3	localObject1	Object
    //   86	468	4	localObject2	Object
    //   92	167	5	localObject3	Object
    //   380	67	5	localSQLiteException1	SQLiteException
    //   502	30	5	localSQLiteException2	SQLiteException
    //   95	272	6	bool1	boolean
    //   144	3	7	bool2	boolean
    //   169	268	8	l1	long
    //   181	258	10	l2	long
    //   193	250	12	l3	long
    //   209	236	14	l4	long
    //   274	175	16	localLong1	Long
    //   309	142	17	localLong2	Long
    //   371	82	18	localBoolean	Boolean
    //   403	38	19	l5	long
    //   427	69	21	localE	E
    // Exception table:
    //   from	to	target	type
    //   138	146	376	finally
    //   162	171	376	finally
    //   174	183	376	finally
    //   186	195	376	finally
    //   198	208	376	finally
    //   217	226	376	finally
    //   229	239	376	finally
    //   248	260	376	finally
    //   263	273	376	finally
    //   282	294	376	finally
    //   297	308	376	finally
    //   317	330	376	finally
    //   333	344	376	finally
    //   347	360	376	finally
    //   366	373	376	finally
    //   391	402	376	finally
    //   411	421	376	finally
    //   424	429	376	finally
    //   432	457	376	finally
    //   460	469	376	finally
    //   472	489	376	finally
    //   509	536	376	finally
    //   138	146	380	android/database/sqlite/SQLiteException
    //   162	171	380	android/database/sqlite/SQLiteException
    //   174	183	380	android/database/sqlite/SQLiteException
    //   186	195	380	android/database/sqlite/SQLiteException
    //   198	208	380	android/database/sqlite/SQLiteException
    //   217	226	380	android/database/sqlite/SQLiteException
    //   229	239	380	android/database/sqlite/SQLiteException
    //   248	260	380	android/database/sqlite/SQLiteException
    //   263	273	380	android/database/sqlite/SQLiteException
    //   282	294	380	android/database/sqlite/SQLiteException
    //   297	308	380	android/database/sqlite/SQLiteException
    //   317	330	380	android/database/sqlite/SQLiteException
    //   333	344	380	android/database/sqlite/SQLiteException
    //   347	360	380	android/database/sqlite/SQLiteException
    //   366	373	380	android/database/sqlite/SQLiteException
    //   391	402	380	android/database/sqlite/SQLiteException
    //   411	421	380	android/database/sqlite/SQLiteException
    //   424	429	380	android/database/sqlite/SQLiteException
    //   432	457	380	android/database/sqlite/SQLiteException
    //   460	469	380	android/database/sqlite/SQLiteException
    //   472	489	380	android/database/sqlite/SQLiteException
    //   88	94	498	finally
    //   97	135	498	finally
    //   88	94	502	android/database/sqlite/SQLiteException
    //   97	135	502	android/database/sqlite/SQLiteException
  }
  
  public final int D(String paramString1, String paramString2)
  {
    n.e(paramString1);
    n.e(paramString2);
    n();
    u();
    try
    {
      int i1 = B().delete("conditional_properties", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      return i1;
    }
    catch (SQLiteException localSQLiteException)
    {
      j().G().d("Error deleting conditional property", Y1.v(paramString1), h().g(paramString2), localSQLiteException);
    }
    return 0;
  }
  
  /* Error */
  public final I2 D0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 357	R2/m3:n	()V
    //   9: aload_0
    //   10: invokevirtual 360	R2/C5:u	()V
    //   13: aconst_null
    //   14: astore_2
    //   15: aload_0
    //   16: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   19: astore_3
    //   20: iconst_0
    //   21: istore 4
    //   23: aload_3
    //   24: ldc_w 665
    //   27: bipush 36
    //   29: anewarray 23	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: ldc_w 667
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: ldc_w 669
    //   43: aastore
    //   44: dup
    //   45: iconst_2
    //   46: ldc_w 671
    //   49: aastore
    //   50: dup
    //   51: iconst_3
    //   52: ldc_w 673
    //   55: aastore
    //   56: dup
    //   57: iconst_4
    //   58: ldc 77
    //   60: aastore
    //   61: dup
    //   62: iconst_5
    //   63: ldc_w 675
    //   66: aastore
    //   67: dup
    //   68: bipush 6
    //   70: ldc 57
    //   72: aastore
    //   73: dup
    //   74: bipush 7
    //   76: ldc 61
    //   78: aastore
    //   79: dup
    //   80: bipush 8
    //   82: ldc 65
    //   84: aastore
    //   85: dup
    //   86: bipush 9
    //   88: ldc 69
    //   90: aastore
    //   91: dup
    //   92: bipush 10
    //   94: ldc 73
    //   96: aastore
    //   97: dup
    //   98: bipush 11
    //   100: ldc 81
    //   102: aastore
    //   103: dup
    //   104: bipush 12
    //   106: ldc 85
    //   108: aastore
    //   109: dup
    //   110: bipush 13
    //   112: ldc 89
    //   114: aastore
    //   115: dup
    //   116: bipush 14
    //   118: ldc 93
    //   120: aastore
    //   121: dup
    //   122: bipush 15
    //   124: ldc 101
    //   126: aastore
    //   127: dup
    //   128: bipush 16
    //   130: ldc 105
    //   132: aastore
    //   133: dup
    //   134: bipush 17
    //   136: ldc 109
    //   138: aastore
    //   139: dup
    //   140: bipush 18
    //   142: ldc 113
    //   144: aastore
    //   145: dup
    //   146: bipush 19
    //   148: ldc 117
    //   150: aastore
    //   151: dup
    //   152: bipush 20
    //   154: ldc 121
    //   156: aastore
    //   157: dup
    //   158: bipush 21
    //   160: ldc 125
    //   162: aastore
    //   163: dup
    //   164: bipush 22
    //   166: ldc -127
    //   168: aastore
    //   169: dup
    //   170: bipush 23
    //   172: ldc -123
    //   174: aastore
    //   175: dup
    //   176: bipush 24
    //   178: ldc -115
    //   180: aastore
    //   181: dup
    //   182: bipush 25
    //   184: ldc -107
    //   186: aastore
    //   187: dup
    //   188: bipush 26
    //   190: ldc -103
    //   192: aastore
    //   193: dup
    //   194: bipush 27
    //   196: ldc -99
    //   198: aastore
    //   199: dup
    //   200: bipush 28
    //   202: ldc -87
    //   204: aastore
    //   205: dup
    //   206: bipush 29
    //   208: ldc -83
    //   210: aastore
    //   211: dup
    //   212: bipush 30
    //   214: ldc -79
    //   216: aastore
    //   217: dup
    //   218: bipush 31
    //   220: ldc -75
    //   222: aastore
    //   223: dup
    //   224: bipush 32
    //   226: ldc -71
    //   228: aastore
    //   229: dup
    //   230: bipush 33
    //   232: ldc -67
    //   234: aastore
    //   235: dup
    //   236: bipush 34
    //   238: ldc -63
    //   240: aastore
    //   241: dup
    //   242: bipush 35
    //   244: ldc -59
    //   246: aastore
    //   247: ldc_w 677
    //   250: iconst_1
    //   251: anewarray 23	java/lang/String
    //   254: dup
    //   255: iconst_0
    //   256: aload_1
    //   257: aastore
    //   258: aconst_null
    //   259: aconst_null
    //   260: aconst_null
    //   261: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   264: astore_3
    //   265: aload_3
    //   266: invokeinterface 398 1 0
    //   271: istore 5
    //   273: iload 5
    //   275: ifne +11 -> 286
    //   278: aload_3
    //   279: invokeinterface 401 1 0
    //   284: aconst_null
    //   285: areturn
    //   286: new 679	R2/I2
    //   289: astore 6
    //   291: aload_3
    //   292: astore_2
    //   293: aload 6
    //   295: aload_0
    //   296: getfield 682	R2/z5:b	LR2/D5;
    //   299: invokevirtual 688	R2/D5:i0	()LR2/N2;
    //   302: aload_1
    //   303: invokespecial 691	R2/I2:<init>	(LR2/N2;Ljava/lang/String;)V
    //   306: aload_3
    //   307: astore_2
    //   308: aload 6
    //   310: aload_3
    //   311: iconst_0
    //   312: invokeinterface 288 2 0
    //   317: invokevirtual 694	R2/I2:x	(Ljava/lang/String;)V
    //   320: aload_3
    //   321: astore_2
    //   322: aload 6
    //   324: aload_3
    //   325: iconst_1
    //   326: invokeinterface 288 2 0
    //   331: invokevirtual 696	R2/I2:M	(Ljava/lang/String;)V
    //   334: aload_3
    //   335: astore_2
    //   336: aload 6
    //   338: aload_3
    //   339: iconst_2
    //   340: invokeinterface 288 2 0
    //   345: invokevirtual 699	R2/I2:S	(Ljava/lang/String;)V
    //   348: aload_3
    //   349: astore_2
    //   350: aload 6
    //   352: aload_3
    //   353: iconst_3
    //   354: invokeinterface 411 2 0
    //   359: invokevirtual 702	R2/I2:h0	(J)V
    //   362: aload_3
    //   363: astore_2
    //   364: aload 6
    //   366: aload_3
    //   367: iconst_4
    //   368: invokeinterface 411 2 0
    //   373: invokevirtual 704	R2/I2:j0	(J)V
    //   376: aload_3
    //   377: astore_2
    //   378: aload 6
    //   380: aload_3
    //   381: iconst_5
    //   382: invokeinterface 411 2 0
    //   387: invokevirtual 706	R2/I2:f0	(J)V
    //   390: aload_3
    //   391: astore_2
    //   392: aload 6
    //   394: aload_3
    //   395: bipush 6
    //   397: invokeinterface 288 2 0
    //   402: invokevirtual 709	R2/I2:F	(Ljava/lang/String;)V
    //   405: aload_3
    //   406: astore_2
    //   407: aload 6
    //   409: aload_3
    //   410: bipush 7
    //   412: invokeinterface 288 2 0
    //   417: invokevirtual 711	R2/I2:B	(Ljava/lang/String;)V
    //   420: aload_3
    //   421: astore_2
    //   422: aload 6
    //   424: aload_3
    //   425: bipush 8
    //   427: invokeinterface 411 2 0
    //   432: invokevirtual 713	R2/I2:d0	(J)V
    //   435: aload_3
    //   436: astore_2
    //   437: aload 6
    //   439: aload_3
    //   440: bipush 9
    //   442: invokeinterface 411 2 0
    //   447: invokevirtual 715	R2/I2:X	(J)V
    //   450: aload_3
    //   451: astore_2
    //   452: aload_3
    //   453: bipush 10
    //   455: invokeinterface 633 2 0
    //   460: ifne +36 -> 496
    //   463: aload_3
    //   464: astore_2
    //   465: aload_3
    //   466: bipush 10
    //   468: invokeinterface 292 2 0
    //   473: ifeq +6 -> 479
    //   476: goto +20 -> 496
    //   479: iconst_0
    //   480: istore 5
    //   482: goto +17 -> 499
    //   485: astore_1
    //   486: aload_2
    //   487: astore_3
    //   488: goto +805 -> 1293
    //   491: astore 7
    //   493: goto +767 -> 1260
    //   496: iconst_1
    //   497: istore 5
    //   499: aload_3
    //   500: astore_2
    //   501: aload 6
    //   503: iload 5
    //   505: invokevirtual 719	R2/I2:y	(Z)V
    //   508: aload_3
    //   509: astore_2
    //   510: aload 6
    //   512: aload_3
    //   513: bipush 11
    //   515: invokeinterface 411 2 0
    //   520: invokevirtual 722	R2/I2:U	(J)V
    //   523: aload_3
    //   524: astore_2
    //   525: aload 6
    //   527: aload_3
    //   528: bipush 12
    //   530: invokeinterface 411 2 0
    //   535: invokevirtual 725	R2/I2:O	(J)V
    //   538: aload_3
    //   539: astore_2
    //   540: aload 6
    //   542: aload_3
    //   543: bipush 13
    //   545: invokeinterface 411 2 0
    //   550: invokevirtual 727	R2/I2:L	(J)V
    //   553: aload_3
    //   554: astore_2
    //   555: aload 6
    //   557: aload_3
    //   558: bipush 14
    //   560: invokeinterface 411 2 0
    //   565: invokevirtual 729	R2/I2:E	(J)V
    //   568: aload_3
    //   569: astore_2
    //   570: aload 6
    //   572: aload_3
    //   573: bipush 15
    //   575: invokeinterface 411 2 0
    //   580: invokevirtual 731	R2/I2:A	(J)V
    //   583: aload_3
    //   584: astore_2
    //   585: aload 6
    //   587: aload_3
    //   588: bipush 16
    //   590: invokeinterface 411 2 0
    //   595: invokevirtual 734	R2/I2:b0	(J)V
    //   598: aload_3
    //   599: astore_2
    //   600: aload_3
    //   601: bipush 17
    //   603: invokeinterface 633 2 0
    //   608: ifeq +11 -> 619
    //   611: ldc2_w 735
    //   614: lstore 8
    //   616: goto +16 -> 632
    //   619: aload_3
    //   620: astore_2
    //   621: aload_3
    //   622: bipush 17
    //   624: invokeinterface 292 2 0
    //   629: i2l
    //   630: lstore 8
    //   632: aload_3
    //   633: astore_2
    //   634: aload 6
    //   636: lload 8
    //   638: invokevirtual 738	R2/I2:c	(J)V
    //   641: aload_3
    //   642: astore_2
    //   643: aload 6
    //   645: aload_3
    //   646: bipush 18
    //   648: invokeinterface 288 2 0
    //   653: invokevirtual 740	R2/I2:J	(Ljava/lang/String;)V
    //   656: aload_3
    //   657: astore_2
    //   658: aload 6
    //   660: aload_3
    //   661: bipush 19
    //   663: invokeinterface 411 2 0
    //   668: invokevirtual 743	R2/I2:I	(J)V
    //   671: aload_3
    //   672: astore_2
    //   673: aload 6
    //   675: aload_3
    //   676: bipush 20
    //   678: invokeinterface 411 2 0
    //   683: invokevirtual 745	R2/I2:R	(J)V
    //   686: aload_3
    //   687: astore_2
    //   688: aload 6
    //   690: aload_3
    //   691: bipush 21
    //   693: invokeinterface 288 2 0
    //   698: invokevirtual 748	R2/I2:P	(Ljava/lang/String;)V
    //   701: aload_3
    //   702: astore_2
    //   703: aload_3
    //   704: bipush 23
    //   706: invokeinterface 633 2 0
    //   711: ifne +25 -> 736
    //   714: aload_3
    //   715: astore_2
    //   716: aload_3
    //   717: bipush 23
    //   719: invokeinterface 292 2 0
    //   724: ifeq +6 -> 730
    //   727: goto +9 -> 736
    //   730: iconst_0
    //   731: istore 5
    //   733: goto +6 -> 739
    //   736: iconst_1
    //   737: istore 5
    //   739: aload_3
    //   740: astore_2
    //   741: aload 6
    //   743: iload 5
    //   745: invokevirtual 750	R2/I2:g	(Z)V
    //   748: aload_3
    //   749: astore_2
    //   750: aload 6
    //   752: aload_3
    //   753: bipush 24
    //   755: invokeinterface 288 2 0
    //   760: invokevirtual 752	R2/I2:e	(Ljava/lang/String;)V
    //   763: aload_3
    //   764: astore_2
    //   765: aload_3
    //   766: bipush 25
    //   768: invokeinterface 633 2 0
    //   773: ifeq +9 -> 782
    //   776: lconst_0
    //   777: lstore 8
    //   779: goto +15 -> 794
    //   782: aload_3
    //   783: astore_2
    //   784: aload_3
    //   785: bipush 25
    //   787: invokeinterface 411 2 0
    //   792: lstore 8
    //   794: aload_3
    //   795: astore_2
    //   796: aload 6
    //   798: lload 8
    //   800: invokevirtual 754	R2/I2:Z	(J)V
    //   803: aload_3
    //   804: astore_2
    //   805: aload_3
    //   806: bipush 26
    //   808: invokeinterface 633 2 0
    //   813: ifne +28 -> 841
    //   816: aload_3
    //   817: astore_2
    //   818: aload 6
    //   820: aload_3
    //   821: bipush 26
    //   823: invokeinterface 288 2 0
    //   828: ldc_w 756
    //   831: iconst_m1
    //   832: invokevirtual 760	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   835: invokestatic 619	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   838: invokevirtual 763	R2/I2:f	(Ljava/util/List;)V
    //   841: aload_3
    //   842: astore_2
    //   843: invokestatic 767	com/google/android/gms/internal/measurement/s7:a	()Z
    //   846: ifeq +49 -> 895
    //   849: aload_3
    //   850: astore_2
    //   851: aload_0
    //   852: invokevirtual 770	R2/m3:f	()LR2/g;
    //   855: aload_1
    //   856: getstatic 776	R2/K:y0	LR2/P1;
    //   859: invokevirtual 781	R2/g:B	(Ljava/lang/String;LR2/P1;)Z
    //   862: ifne +18 -> 880
    //   865: aload_3
    //   866: astore_2
    //   867: aload_0
    //   868: invokevirtual 770	R2/m3:f	()LR2/g;
    //   871: getstatic 784	R2/K:w0	LR2/P1;
    //   874: invokevirtual 788	R2/g:s	(LR2/P1;)Z
    //   877: ifeq +18 -> 895
    //   880: aload_3
    //   881: astore_2
    //   882: aload 6
    //   884: aload_3
    //   885: bipush 28
    //   887: invokeinterface 288 2 0
    //   892: invokevirtual 790	R2/I2:V	(Ljava/lang/String;)V
    //   895: aload_3
    //   896: astore_2
    //   897: invokestatic 793	com/google/android/gms/internal/measurement/E7:a	()Z
    //   900: ifeq +62 -> 962
    //   903: aload_3
    //   904: astore_2
    //   905: aload_0
    //   906: invokevirtual 770	R2/m3:f	()LR2/g;
    //   909: getstatic 795	R2/K:A0	LR2/P1;
    //   912: invokevirtual 788	R2/g:s	(LR2/P1;)Z
    //   915: ifeq +47 -> 962
    //   918: aload_3
    //   919: astore_2
    //   920: aload_3
    //   921: bipush 29
    //   923: invokeinterface 633 2 0
    //   928: ifne +22 -> 950
    //   931: aload_3
    //   932: astore_2
    //   933: aload_3
    //   934: bipush 29
    //   936: invokeinterface 292 2 0
    //   941: ifeq +9 -> 950
    //   944: iconst_1
    //   945: istore 5
    //   947: goto +6 -> 953
    //   950: iconst_0
    //   951: istore 5
    //   953: aload_3
    //   954: astore_2
    //   955: aload 6
    //   957: iload 5
    //   959: invokevirtual 797	R2/I2:C	(Z)V
    //   962: aload_3
    //   963: astore_2
    //   964: aload 6
    //   966: aload_3
    //   967: bipush 30
    //   969: invokeinterface 411 2 0
    //   974: invokevirtual 799	R2/I2:n0	(J)V
    //   977: aload_3
    //   978: astore_2
    //   979: aload 6
    //   981: aload_3
    //   982: bipush 31
    //   984: invokeinterface 411 2 0
    //   989: invokevirtual 801	R2/I2:l0	(J)V
    //   992: aload_3
    //   993: astore_2
    //   994: invokestatic 804	com/google/android/gms/internal/measurement/g7:a	()Z
    //   997: ifeq +49 -> 1046
    //   1000: aload_3
    //   1001: astore_2
    //   1002: aload_0
    //   1003: invokevirtual 770	R2/m3:f	()LR2/g;
    //   1006: aload_1
    //   1007: getstatic 807	R2/K:L0	LR2/P1;
    //   1010: invokevirtual 781	R2/g:B	(Ljava/lang/String;LR2/P1;)Z
    //   1013: ifeq +33 -> 1046
    //   1016: aload_3
    //   1017: astore_2
    //   1018: aload 6
    //   1020: aload_3
    //   1021: bipush 32
    //   1023: invokeinterface 292 2 0
    //   1028: invokevirtual 810	R2/I2:b	(I)V
    //   1031: aload_3
    //   1032: astore_2
    //   1033: aload 6
    //   1035: aload_3
    //   1036: bipush 35
    //   1038: invokeinterface 411 2 0
    //   1043: invokevirtual 813	R2/I2:w	(J)V
    //   1046: aload_3
    //   1047: astore_2
    //   1048: invokestatic 816	com/google/android/gms/internal/measurement/i6:a	()Z
    //   1051: ifeq +63 -> 1114
    //   1054: aload_3
    //   1055: astore_2
    //   1056: aload_0
    //   1057: invokevirtual 770	R2/m3:f	()LR2/g;
    //   1060: aload_1
    //   1061: getstatic 819	R2/K:Y0	LR2/P1;
    //   1064: invokevirtual 781	R2/g:B	(Ljava/lang/String;LR2/P1;)Z
    //   1067: ifeq +47 -> 1114
    //   1070: aload_3
    //   1071: astore_2
    //   1072: aload_3
    //   1073: bipush 33
    //   1075: invokeinterface 633 2 0
    //   1080: ifne +22 -> 1102
    //   1083: aload_3
    //   1084: astore_2
    //   1085: aload_3
    //   1086: bipush 33
    //   1088: invokeinterface 292 2 0
    //   1093: ifeq +9 -> 1102
    //   1096: iconst_1
    //   1097: istore 5
    //   1099: goto +6 -> 1105
    //   1102: iconst_0
    //   1103: istore 5
    //   1105: aload_3
    //   1106: astore_2
    //   1107: aload 6
    //   1109: iload 5
    //   1111: invokevirtual 821	R2/I2:G	(Z)V
    //   1114: aload_3
    //   1115: astore_2
    //   1116: invokestatic 824	com/google/android/gms/internal/measurement/n6:a	()Z
    //   1119: ifeq +76 -> 1195
    //   1122: aload_3
    //   1123: astore_2
    //   1124: aload_0
    //   1125: invokevirtual 770	R2/m3:f	()LR2/g;
    //   1128: aload_1
    //   1129: getstatic 827	R2/K:T0	LR2/P1;
    //   1132: invokevirtual 781	R2/g:B	(Ljava/lang/String;LR2/P1;)Z
    //   1135: ifeq +60 -> 1195
    //   1138: aload_3
    //   1139: astore_2
    //   1140: aload_3
    //   1141: bipush 34
    //   1143: invokeinterface 633 2 0
    //   1148: ifeq +9 -> 1157
    //   1151: aconst_null
    //   1152: astore 7
    //   1154: goto +32 -> 1186
    //   1157: aload_3
    //   1158: astore_2
    //   1159: iload 4
    //   1161: istore 5
    //   1163: aload_3
    //   1164: bipush 34
    //   1166: invokeinterface 292 2 0
    //   1171: ifeq +6 -> 1177
    //   1174: iconst_1
    //   1175: istore 5
    //   1177: aload_3
    //   1178: astore_2
    //   1179: iload 5
    //   1181: invokestatic 642	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1184: astore 7
    //   1186: aload_3
    //   1187: astore_2
    //   1188: aload 6
    //   1190: aload 7
    //   1192: invokevirtual 830	R2/I2:d	(Ljava/lang/Boolean;)V
    //   1195: aload_3
    //   1196: astore_2
    //   1197: aload 6
    //   1199: invokevirtual 832	R2/I2:o	()V
    //   1202: aload_3
    //   1203: astore_2
    //   1204: aload_3
    //   1205: invokeinterface 445 1 0
    //   1210: ifeq +22 -> 1232
    //   1213: aload_3
    //   1214: astore_2
    //   1215: aload_0
    //   1216: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   1219: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   1222: ldc_w 834
    //   1225: aload_1
    //   1226: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   1229: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1232: aload_3
    //   1233: invokeinterface 401 1 0
    //   1238: aload 6
    //   1240: areturn
    //   1241: astore_1
    //   1242: goto -754 -> 488
    //   1245: astore 7
    //   1247: goto +13 -> 1260
    //   1250: astore_1
    //   1251: aload_2
    //   1252: astore_3
    //   1253: goto +40 -> 1293
    //   1256: astore 7
    //   1258: aconst_null
    //   1259: astore_3
    //   1260: aload_3
    //   1261: astore_2
    //   1262: aload_0
    //   1263: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   1266: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   1269: ldc_w 836
    //   1272: aload_1
    //   1273: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   1276: aload 7
    //   1278: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1281: aload_3
    //   1282: ifnull +9 -> 1291
    //   1285: aload_3
    //   1286: invokeinterface 401 1 0
    //   1291: aconst_null
    //   1292: areturn
    //   1293: aload_3
    //   1294: ifnull +9 -> 1303
    //   1297: aload_3
    //   1298: invokeinterface 401 1 0
    //   1303: aload_1
    //   1304: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1305	0	this	p
    //   0	1305	1	paramString	String
    //   14	1248	2	localObject1	Object
    //   19	1279	3	localObject2	Object
    //   21	1139	4	bool1	boolean
    //   271	909	5	bool2	boolean
    //   289	950	6	localI2	I2
    //   491	1	7	localSQLiteException1	SQLiteException
    //   1152	39	7	localBoolean	Boolean
    //   1245	1	7	localSQLiteException2	SQLiteException
    //   1256	21	7	localSQLiteException3	SQLiteException
    //   614	185	8	l1	long
    // Exception table:
    //   from	to	target	type
    //   293	306	485	finally
    //   308	320	485	finally
    //   322	334	485	finally
    //   336	348	485	finally
    //   350	362	485	finally
    //   364	376	485	finally
    //   378	390	485	finally
    //   392	405	485	finally
    //   407	420	485	finally
    //   422	435	485	finally
    //   437	450	485	finally
    //   452	463	485	finally
    //   465	476	485	finally
    //   501	508	485	finally
    //   510	523	485	finally
    //   525	538	485	finally
    //   540	553	485	finally
    //   555	568	485	finally
    //   570	583	485	finally
    //   585	598	485	finally
    //   600	611	485	finally
    //   621	632	485	finally
    //   634	641	485	finally
    //   643	656	485	finally
    //   658	671	485	finally
    //   673	686	485	finally
    //   688	701	485	finally
    //   703	714	485	finally
    //   716	727	485	finally
    //   741	748	485	finally
    //   750	763	485	finally
    //   765	776	485	finally
    //   784	794	485	finally
    //   796	803	485	finally
    //   805	816	485	finally
    //   818	841	485	finally
    //   843	849	485	finally
    //   851	865	485	finally
    //   867	880	485	finally
    //   882	895	485	finally
    //   897	903	485	finally
    //   905	918	485	finally
    //   920	931	485	finally
    //   933	944	485	finally
    //   955	962	485	finally
    //   964	977	485	finally
    //   979	992	485	finally
    //   994	1000	485	finally
    //   1002	1016	485	finally
    //   1018	1031	485	finally
    //   1033	1046	485	finally
    //   1048	1054	485	finally
    //   1056	1070	485	finally
    //   1072	1083	485	finally
    //   1085	1096	485	finally
    //   1107	1114	485	finally
    //   1116	1122	485	finally
    //   1124	1138	485	finally
    //   1140	1151	485	finally
    //   1163	1174	485	finally
    //   1179	1186	485	finally
    //   1188	1195	485	finally
    //   1197	1202	485	finally
    //   1204	1213	485	finally
    //   1215	1232	485	finally
    //   1262	1281	485	finally
    //   293	306	491	android/database/sqlite/SQLiteException
    //   308	320	491	android/database/sqlite/SQLiteException
    //   322	334	491	android/database/sqlite/SQLiteException
    //   336	348	491	android/database/sqlite/SQLiteException
    //   350	362	491	android/database/sqlite/SQLiteException
    //   364	376	491	android/database/sqlite/SQLiteException
    //   378	390	491	android/database/sqlite/SQLiteException
    //   392	405	491	android/database/sqlite/SQLiteException
    //   407	420	491	android/database/sqlite/SQLiteException
    //   422	435	491	android/database/sqlite/SQLiteException
    //   437	450	491	android/database/sqlite/SQLiteException
    //   452	463	491	android/database/sqlite/SQLiteException
    //   465	476	491	android/database/sqlite/SQLiteException
    //   501	508	491	android/database/sqlite/SQLiteException
    //   510	523	491	android/database/sqlite/SQLiteException
    //   525	538	491	android/database/sqlite/SQLiteException
    //   540	553	491	android/database/sqlite/SQLiteException
    //   555	568	491	android/database/sqlite/SQLiteException
    //   570	583	491	android/database/sqlite/SQLiteException
    //   585	598	491	android/database/sqlite/SQLiteException
    //   600	611	491	android/database/sqlite/SQLiteException
    //   621	632	491	android/database/sqlite/SQLiteException
    //   634	641	491	android/database/sqlite/SQLiteException
    //   643	656	491	android/database/sqlite/SQLiteException
    //   658	671	491	android/database/sqlite/SQLiteException
    //   673	686	491	android/database/sqlite/SQLiteException
    //   688	701	491	android/database/sqlite/SQLiteException
    //   703	714	491	android/database/sqlite/SQLiteException
    //   716	727	491	android/database/sqlite/SQLiteException
    //   741	748	491	android/database/sqlite/SQLiteException
    //   750	763	491	android/database/sqlite/SQLiteException
    //   765	776	491	android/database/sqlite/SQLiteException
    //   784	794	491	android/database/sqlite/SQLiteException
    //   796	803	491	android/database/sqlite/SQLiteException
    //   805	816	491	android/database/sqlite/SQLiteException
    //   818	841	491	android/database/sqlite/SQLiteException
    //   843	849	491	android/database/sqlite/SQLiteException
    //   851	865	491	android/database/sqlite/SQLiteException
    //   867	880	491	android/database/sqlite/SQLiteException
    //   882	895	491	android/database/sqlite/SQLiteException
    //   897	903	491	android/database/sqlite/SQLiteException
    //   905	918	491	android/database/sqlite/SQLiteException
    //   920	931	491	android/database/sqlite/SQLiteException
    //   933	944	491	android/database/sqlite/SQLiteException
    //   955	962	491	android/database/sqlite/SQLiteException
    //   964	977	491	android/database/sqlite/SQLiteException
    //   979	992	491	android/database/sqlite/SQLiteException
    //   994	1000	491	android/database/sqlite/SQLiteException
    //   1002	1016	491	android/database/sqlite/SQLiteException
    //   1018	1031	491	android/database/sqlite/SQLiteException
    //   1033	1046	491	android/database/sqlite/SQLiteException
    //   1048	1054	491	android/database/sqlite/SQLiteException
    //   1056	1070	491	android/database/sqlite/SQLiteException
    //   1072	1083	491	android/database/sqlite/SQLiteException
    //   1085	1096	491	android/database/sqlite/SQLiteException
    //   1107	1114	491	android/database/sqlite/SQLiteException
    //   1116	1122	491	android/database/sqlite/SQLiteException
    //   1124	1138	491	android/database/sqlite/SQLiteException
    //   1140	1151	491	android/database/sqlite/SQLiteException
    //   1163	1174	491	android/database/sqlite/SQLiteException
    //   1179	1186	491	android/database/sqlite/SQLiteException
    //   1188	1195	491	android/database/sqlite/SQLiteException
    //   1197	1202	491	android/database/sqlite/SQLiteException
    //   1204	1213	491	android/database/sqlite/SQLiteException
    //   1215	1232	491	android/database/sqlite/SQLiteException
    //   265	273	1241	finally
    //   286	291	1241	finally
    //   265	273	1245	android/database/sqlite/SQLiteException
    //   286	291	1245	android/database/sqlite/SQLiteException
    //   15	20	1250	finally
    //   23	265	1250	finally
    //   15	20	1256	android/database/sqlite/SQLiteException
    //   23	265	1256	android/database/sqlite/SQLiteException
  }
  
  public final long E(d2 paramd2)
  {
    n();
    u();
    n.i(paramd2);
    n.e(paramd2.D3());
    byte[] arrayOfByte = paramd2.h();
    long l1 = o().A(arrayOfByte);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramd2.D3());
    localContentValues.put("metadata_fingerprint", Long.valueOf(l1));
    localContentValues.put("metadata", arrayOfByte);
    try
    {
      B().insertWithOnConflict("raw_events_metadata", null, localContentValues, 4);
      return l1;
    }
    catch (SQLiteException localSQLiteException)
    {
      j().G().c("Error storing raw event metadata. appId", Y1.v(paramd2.D3()), localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  /* Error */
  public final r E0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 357	R2/m3:n	()V
    //   9: aload_0
    //   10: invokevirtual 360	R2/C5:u	()V
    //   13: aconst_null
    //   14: astore_2
    //   15: aload_0
    //   16: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   19: ldc_w 665
    //   22: iconst_3
    //   23: anewarray 23	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: ldc 97
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: ldc -95
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: ldc -91
    //   40: aastore
    //   41: ldc_w 677
    //   44: iconst_1
    //   45: anewarray 23	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: aconst_null
    //   53: aconst_null
    //   54: aconst_null
    //   55: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   58: astore_3
    //   59: aload_3
    //   60: astore 4
    //   62: aload_3
    //   63: invokeinterface 398 1 0
    //   68: istore 5
    //   70: iload 5
    //   72: ifne +11 -> 83
    //   75: aload_3
    //   76: invokeinterface 401 1 0
    //   81: aconst_null
    //   82: areturn
    //   83: aload_3
    //   84: astore 4
    //   86: aload_3
    //   87: iconst_0
    //   88: invokeinterface 420 2 0
    //   93: astore_2
    //   94: aload_3
    //   95: astore 4
    //   97: aload_3
    //   98: iconst_1
    //   99: invokeinterface 288 2 0
    //   104: astore 6
    //   106: aload_3
    //   107: astore 4
    //   109: aload_3
    //   110: iconst_2
    //   111: invokeinterface 288 2 0
    //   116: astore 7
    //   118: aload_3
    //   119: astore 4
    //   121: aload_3
    //   122: invokeinterface 445 1 0
    //   127: ifeq +40 -> 167
    //   130: aload_3
    //   131: astore 4
    //   133: aload_0
    //   134: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   137: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   140: ldc_w 872
    //   143: aload_1
    //   144: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   147: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   150: goto +17 -> 167
    //   153: astore_3
    //   154: aload 4
    //   156: astore_1
    //   157: aload_3
    //   158: astore 4
    //   160: goto +86 -> 246
    //   163: astore_2
    //   164: goto +49 -> 213
    //   167: aload_2
    //   168: ifnonnull +11 -> 179
    //   171: aload_3
    //   172: invokeinterface 401 1 0
    //   177: aconst_null
    //   178: areturn
    //   179: aload_3
    //   180: astore 4
    //   182: new 874	R2/r
    //   185: dup
    //   186: aload_2
    //   187: aload 6
    //   189: aload 7
    //   191: invokespecial 877	R2/r:<init>	([BLjava/lang/String;Ljava/lang/String;)V
    //   194: astore_2
    //   195: aload_3
    //   196: invokeinterface 401 1 0
    //   201: aload_2
    //   202: areturn
    //   203: astore 4
    //   205: aload_2
    //   206: astore_1
    //   207: goto +39 -> 246
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_3
    //   213: aload_3
    //   214: astore 4
    //   216: aload_0
    //   217: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   220: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   223: ldc_w 879
    //   226: aload_1
    //   227: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   230: aload_2
    //   231: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   234: aload_3
    //   235: ifnull +9 -> 244
    //   238: aload_3
    //   239: invokeinterface 401 1 0
    //   244: aconst_null
    //   245: areturn
    //   246: aload_1
    //   247: ifnull +9 -> 256
    //   250: aload_1
    //   251: invokeinterface 401 1 0
    //   256: aload 4
    //   258: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	p
    //   0	259	1	paramString	String
    //   14	80	2	arrayOfByte	byte[]
    //   163	24	2	localSQLiteException1	SQLiteException
    //   194	12	2	localr	r
    //   210	21	2	localSQLiteException2	SQLiteException
    //   58	73	3	localCursor	Cursor
    //   153	43	3	localObject1	Object
    //   212	27	3	localObject2	Object
    //   60	121	4	localObject3	Object
    //   203	1	4	localObject4	Object
    //   214	43	4	localObject5	Object
    //   68	3	5	bool	boolean
    //   104	84	6	str1	String
    //   116	74	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   62	70	153	finally
    //   86	94	153	finally
    //   97	106	153	finally
    //   109	118	153	finally
    //   121	130	153	finally
    //   133	150	153	finally
    //   182	195	153	finally
    //   216	234	153	finally
    //   62	70	163	android/database/sqlite/SQLiteException
    //   86	94	163	android/database/sqlite/SQLiteException
    //   97	106	163	android/database/sqlite/SQLiteException
    //   109	118	163	android/database/sqlite/SQLiteException
    //   121	130	163	android/database/sqlite/SQLiteException
    //   133	150	163	android/database/sqlite/SQLiteException
    //   182	195	163	android/database/sqlite/SQLiteException
    //   15	59	203	finally
    //   15	59	210	android/database/sqlite/SQLiteException
  }
  
  public final long F(String paramString)
  {
    n.e(paramString);
    n();
    u();
    try
    {
      int i1 = B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { paramString, String.valueOf(Math.max(0, Math.min(1000000, f().u(paramString, K.r)))) });
      return i1;
    }
    catch (SQLiteException localSQLiteException)
    {
      j().G().c("Error deleting over the limit events. appId", Y1.v(paramString), localSQLiteException);
    }
    return 0L;
  }
  
  /* Error */
  public final T5 F0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 357	R2/m3:n	()V
    //   14: aload_0
    //   15: invokevirtual 360	R2/C5:u	()V
    //   18: aconst_null
    //   19: astore_3
    //   20: aload_0
    //   21: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: ldc_w 908
    //   27: iconst_3
    //   28: anewarray 23	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc_w 910
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: ldc_w 368
    //   42: aastore
    //   43: dup
    //   44: iconst_2
    //   45: ldc 51
    //   47: aastore
    //   48: ldc_w 388
    //   51: iconst_2
    //   52: anewarray 23	java/lang/String
    //   55: dup
    //   56: iconst_0
    //   57: aload_1
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: aload_2
    //   62: aastore
    //   63: aconst_null
    //   64: aconst_null
    //   65: aconst_null
    //   66: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   69: astore 4
    //   71: aload 4
    //   73: astore_3
    //   74: aload 4
    //   76: invokeinterface 398 1 0
    //   81: istore 5
    //   83: iload 5
    //   85: ifne +12 -> 97
    //   88: aload 4
    //   90: invokeinterface 401 1 0
    //   95: aconst_null
    //   96: areturn
    //   97: aload 4
    //   99: astore_3
    //   100: aload 4
    //   102: iconst_0
    //   103: invokeinterface 411 2 0
    //   108: lstore 6
    //   110: aload 4
    //   112: astore_3
    //   113: aload_0
    //   114: aload 4
    //   116: iconst_1
    //   117: invokevirtual 407	R2/p:M	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   120: astore 8
    //   122: aload 8
    //   124: ifnonnull +12 -> 136
    //   127: aload 4
    //   129: invokeinterface 401 1 0
    //   134: aconst_null
    //   135: areturn
    //   136: aload 4
    //   138: astore_3
    //   139: aload 4
    //   141: iconst_2
    //   142: invokeinterface 288 2 0
    //   147: astore 9
    //   149: aload 4
    //   151: astore_3
    //   152: new 912	R2/T5
    //   155: astore 10
    //   157: aload 4
    //   159: astore_3
    //   160: aload 10
    //   162: aload_1
    //   163: aload 9
    //   165: aload_2
    //   166: lload 6
    //   168: aload 8
    //   170: invokespecial 915	R2/T5:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   173: aload 4
    //   175: astore_3
    //   176: aload 4
    //   178: invokeinterface 445 1 0
    //   183: ifeq +35 -> 218
    //   186: aload 4
    //   188: astore_3
    //   189: aload_0
    //   190: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   193: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   196: ldc_w 917
    //   199: aload_1
    //   200: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   203: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   206: goto +12 -> 218
    //   209: astore_1
    //   210: goto +71 -> 281
    //   213: astore 8
    //   215: goto +22 -> 237
    //   218: aload 4
    //   220: invokeinterface 401 1 0
    //   225: aload 10
    //   227: areturn
    //   228: astore_1
    //   229: goto +52 -> 281
    //   232: astore 8
    //   234: aconst_null
    //   235: astore 4
    //   237: aload 4
    //   239: astore_3
    //   240: aload_0
    //   241: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   244: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   247: ldc_w 919
    //   250: aload_1
    //   251: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   254: aload_0
    //   255: invokevirtual 462	R2/m3:h	()LR2/X1;
    //   258: aload_2
    //   259: invokevirtual 466	R2/X1:g	(Ljava/lang/String;)Ljava/lang/String;
    //   262: aload 8
    //   264: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   267: aload 4
    //   269: ifnull +10 -> 279
    //   272: aload 4
    //   274: invokeinterface 401 1 0
    //   279: aconst_null
    //   280: areturn
    //   281: aload_3
    //   282: ifnull +9 -> 291
    //   285: aload_3
    //   286: invokeinterface 401 1 0
    //   291: aload_1
    //   292: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	293	0	this	p
    //   0	293	1	paramString1	String
    //   0	293	2	paramString2	String
    //   19	267	3	localObject1	Object
    //   69	204	4	localCursor	Cursor
    //   81	3	5	bool	boolean
    //   108	59	6	l1	long
    //   120	49	8	localObject2	Object
    //   213	1	8	localSQLiteException1	SQLiteException
    //   232	31	8	localSQLiteException2	SQLiteException
    //   147	17	9	str	String
    //   155	71	10	localT5	T5
    // Exception table:
    //   from	to	target	type
    //   74	83	209	finally
    //   100	110	209	finally
    //   113	122	209	finally
    //   139	149	209	finally
    //   152	157	209	finally
    //   160	173	209	finally
    //   176	186	209	finally
    //   189	206	209	finally
    //   240	267	209	finally
    //   74	83	213	android/database/sqlite/SQLiteException
    //   100	110	213	android/database/sqlite/SQLiteException
    //   113	122	213	android/database/sqlite/SQLiteException
    //   139	149	213	android/database/sqlite/SQLiteException
    //   152	157	213	android/database/sqlite/SQLiteException
    //   160	173	213	android/database/sqlite/SQLiteException
    //   176	186	213	android/database/sqlite/SQLiteException
    //   189	206	213	android/database/sqlite/SQLiteException
    //   20	71	228	finally
    //   20	71	232	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final long G(String paramString, String[] paramArrayOfString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aconst_null
    //   10: astore 7
    //   12: aload 5
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: astore 7
    //   23: aload_2
    //   24: astore 6
    //   26: aload_2
    //   27: invokeinterface 398 1 0
    //   32: ifeq +33 -> 65
    //   35: aload_2
    //   36: astore 7
    //   38: aload_2
    //   39: astore 6
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface 411 2 0
    //   48: lstore_3
    //   49: aload_2
    //   50: invokeinterface 401 1 0
    //   55: lload_3
    //   56: lreturn
    //   57: astore_1
    //   58: goto +40 -> 98
    //   61: astore_2
    //   62: goto +11 -> 73
    //   65: aload_2
    //   66: invokeinterface 401 1 0
    //   71: lload_3
    //   72: lreturn
    //   73: aload 6
    //   75: astore 7
    //   77: aload_0
    //   78: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   81: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   84: ldc_w 921
    //   87: aload_1
    //   88: aload_2
    //   89: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   92: aload 6
    //   94: astore 7
    //   96: aload_2
    //   97: athrow
    //   98: aload 7
    //   100: ifnull +10 -> 110
    //   103: aload 7
    //   105: invokeinterface 401 1 0
    //   110: aload_1
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	p
    //   0	112	1	paramString	String
    //   0	112	2	paramArrayOfString	String[]
    //   0	112	3	paramLong	long
    //   4	9	5	localSQLiteDatabase	SQLiteDatabase
    //   7	86	6	arrayOfString1	String[]
    //   10	94	7	arrayOfString2	String[]
    // Exception table:
    //   from	to	target	type
    //   12	20	57	finally
    //   26	35	57	finally
    //   41	49	57	finally
    //   77	92	57	finally
    //   96	98	57	finally
    //   12	20	61	android/database/sqlite/SQLiteException
    //   26	35	61	android/database/sqlite/SQLiteException
    //   41	49	61	android/database/sqlite/SQLiteException
  }
  
  public final z G0(String paramString)
  {
    if ((n6.a()) && (f().s(K.T0)))
    {
      n.i(paramString);
      n();
      u();
      return z.c(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[] { paramString }, ""));
    }
    return z.f;
  }
  
  /* Error */
  public final q H(long paramLong1, String paramString, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 357	R2/m3:n	()V
    //   9: aload_0
    //   10: invokevirtual 360	R2/C5:u	()V
    //   13: new 938	R2/q
    //   16: dup
    //   17: invokespecial 939	R2/q:<init>	()V
    //   20: astore 11
    //   22: aload_0
    //   23: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   26: astore 12
    //   28: aload 12
    //   30: ldc_w 665
    //   33: bipush 6
    //   35: anewarray 23	java/lang/String
    //   38: dup
    //   39: iconst_0
    //   40: ldc 81
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: ldc 89
    //   47: aastore
    //   48: dup
    //   49: iconst_2
    //   50: ldc 85
    //   52: aastore
    //   53: dup
    //   54: iconst_3
    //   55: ldc 93
    //   57: aastore
    //   58: dup
    //   59: iconst_4
    //   60: ldc 117
    //   62: aastore
    //   63: dup
    //   64: iconst_5
    //   65: ldc 121
    //   67: aastore
    //   68: ldc_w 677
    //   71: iconst_1
    //   72: anewarray 23	java/lang/String
    //   75: dup
    //   76: iconst_0
    //   77: aload_3
    //   78: aastore
    //   79: aconst_null
    //   80: aconst_null
    //   81: aconst_null
    //   82: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore 13
    //   87: aload 13
    //   89: invokeinterface 398 1 0
    //   94: ifne +39 -> 133
    //   97: aload_0
    //   98: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   101: invokevirtual 483	R2/Y1:L	()LR2/a2;
    //   104: ldc_w 941
    //   107: aload_3
    //   108: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   111: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   114: aload 13
    //   116: invokeinterface 401 1 0
    //   121: aload 11
    //   123: areturn
    //   124: astore_3
    //   125: goto +351 -> 476
    //   128: astore 14
    //   130: goto +311 -> 441
    //   133: aload 13
    //   135: iconst_0
    //   136: invokeinterface 411 2 0
    //   141: lload_1
    //   142: lcmp
    //   143: ifne +68 -> 211
    //   146: aload 11
    //   148: aload 13
    //   150: iconst_1
    //   151: invokeinterface 411 2 0
    //   156: putfield 943	R2/q:b	J
    //   159: aload 11
    //   161: aload 13
    //   163: iconst_2
    //   164: invokeinterface 411 2 0
    //   169: putfield 945	R2/q:a	J
    //   172: aload 11
    //   174: aload 13
    //   176: iconst_3
    //   177: invokeinterface 411 2 0
    //   182: putfield 947	R2/q:c	J
    //   185: aload 11
    //   187: aload 13
    //   189: iconst_4
    //   190: invokeinterface 411 2 0
    //   195: putfield 949	R2/q:d	J
    //   198: aload 11
    //   200: aload 13
    //   202: iconst_5
    //   203: invokeinterface 411 2 0
    //   208: putfield 951	R2/q:e	J
    //   211: iload 6
    //   213: ifeq +16 -> 229
    //   216: aload 11
    //   218: aload 11
    //   220: getfield 943	R2/q:b	J
    //   223: lload 4
    //   225: ladd
    //   226: putfield 943	R2/q:b	J
    //   229: iload 7
    //   231: ifeq +16 -> 247
    //   234: aload 11
    //   236: aload 11
    //   238: getfield 945	R2/q:a	J
    //   241: lload 4
    //   243: ladd
    //   244: putfield 945	R2/q:a	J
    //   247: iload 8
    //   249: ifeq +16 -> 265
    //   252: aload 11
    //   254: aload 11
    //   256: getfield 947	R2/q:c	J
    //   259: lload 4
    //   261: ladd
    //   262: putfield 947	R2/q:c	J
    //   265: iload 9
    //   267: ifeq +16 -> 283
    //   270: aload 11
    //   272: aload 11
    //   274: getfield 949	R2/q:d	J
    //   277: lload 4
    //   279: ladd
    //   280: putfield 949	R2/q:d	J
    //   283: iload 10
    //   285: ifeq +16 -> 301
    //   288: aload 11
    //   290: aload 11
    //   292: getfield 951	R2/q:e	J
    //   295: lload 4
    //   297: ladd
    //   298: putfield 951	R2/q:e	J
    //   301: new 311	android/content/ContentValues
    //   304: astore 14
    //   306: aload 14
    //   308: invokespecial 851	android/content/ContentValues:<init>	()V
    //   311: aload 14
    //   313: ldc 81
    //   315: lload_1
    //   316: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   319: invokevirtual 320	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   322: aload 14
    //   324: ldc 85
    //   326: aload 11
    //   328: getfield 945	R2/q:a	J
    //   331: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   334: invokevirtual 320	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   337: aload 14
    //   339: ldc 89
    //   341: aload 11
    //   343: getfield 943	R2/q:b	J
    //   346: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   349: invokevirtual 320	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   352: aload 14
    //   354: ldc 93
    //   356: aload 11
    //   358: getfield 947	R2/q:c	J
    //   361: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   364: invokevirtual 320	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   367: aload 14
    //   369: ldc 117
    //   371: aload 11
    //   373: getfield 949	R2/q:d	J
    //   376: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   379: invokevirtual 320	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   382: aload 14
    //   384: ldc 121
    //   386: aload 11
    //   388: getfield 951	R2/q:e	J
    //   391: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   394: invokevirtual 320	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   397: aload 12
    //   399: ldc_w 665
    //   402: aload 14
    //   404: ldc_w 677
    //   407: iconst_1
    //   408: anewarray 23	java/lang/String
    //   411: dup
    //   412: iconst_0
    //   413: aload_3
    //   414: aastore
    //   415: invokevirtual 955	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   418: pop
    //   419: aload 13
    //   421: invokeinterface 401 1 0
    //   426: aload 11
    //   428: areturn
    //   429: astore_3
    //   430: aconst_null
    //   431: astore 13
    //   433: goto +43 -> 476
    //   436: astore 14
    //   438: aconst_null
    //   439: astore 13
    //   441: aload_0
    //   442: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   445: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   448: ldc_w 957
    //   451: aload_3
    //   452: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   455: aload 14
    //   457: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   460: aload 13
    //   462: ifnull +10 -> 472
    //   465: aload 13
    //   467: invokeinterface 401 1 0
    //   472: aload 11
    //   474: areturn
    //   475: astore_3
    //   476: aload 13
    //   478: ifnull +10 -> 488
    //   481: aload 13
    //   483: invokeinterface 401 1 0
    //   488: aload_3
    //   489: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	490	0	this	p
    //   0	490	1	paramLong1	long
    //   0	490	3	paramString	String
    //   0	490	4	paramLong2	long
    //   0	490	6	paramBoolean1	boolean
    //   0	490	7	paramBoolean2	boolean
    //   0	490	8	paramBoolean3	boolean
    //   0	490	9	paramBoolean4	boolean
    //   0	490	10	paramBoolean5	boolean
    //   20	453	11	localq	q
    //   26	372	12	localSQLiteDatabase	SQLiteDatabase
    //   85	397	13	localCursor	Cursor
    //   128	1	14	localSQLiteException1	SQLiteException
    //   304	99	14	localContentValues	ContentValues
    //   436	20	14	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   87	114	124	finally
    //   133	211	124	finally
    //   216	229	124	finally
    //   234	247	124	finally
    //   252	265	124	finally
    //   270	283	124	finally
    //   288	301	124	finally
    //   301	419	124	finally
    //   87	114	128	android/database/sqlite/SQLiteException
    //   133	211	128	android/database/sqlite/SQLiteException
    //   216	229	128	android/database/sqlite/SQLiteException
    //   234	247	128	android/database/sqlite/SQLiteException
    //   252	265	128	android/database/sqlite/SQLiteException
    //   270	283	128	android/database/sqlite/SQLiteException
    //   288	301	128	android/database/sqlite/SQLiteException
    //   301	419	128	android/database/sqlite/SQLiteException
    //   22	87	429	finally
    //   22	87	436	android/database/sqlite/SQLiteException
    //   441	460	475	finally
  }
  
  /* Error */
  public final java.util.Map H0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 360	R2/C5:u	()V
    //   4: aload_0
    //   5: invokevirtual 357	R2/m3:n	()V
    //   8: aload_1
    //   9: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 961	t/a
    //   21: dup
    //   22: invokespecial 962	t/a:<init>	()V
    //   25: astore_3
    //   26: aload_0
    //   27: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 4
    //   32: aconst_null
    //   33: astore 5
    //   35: aconst_null
    //   36: astore 6
    //   38: aload 4
    //   40: ldc_w 964
    //   43: iconst_2
    //   44: anewarray 23	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: ldc_w 966
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: ldc_w 968
    //   58: aastore
    //   59: ldc_w 970
    //   62: iconst_2
    //   63: anewarray 23	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_2
    //   73: aastore
    //   74: aconst_null
    //   75: aconst_null
    //   76: aconst_null
    //   77: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   80: astore_2
    //   81: aload_2
    //   82: astore 6
    //   84: aload_2
    //   85: astore 5
    //   87: aload_2
    //   88: invokeinterface 398 1 0
    //   93: ifne +31 -> 124
    //   96: aload_2
    //   97: astore 6
    //   99: aload_2
    //   100: astore 5
    //   102: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   105: astore 4
    //   107: aload_2
    //   108: invokeinterface 401 1 0
    //   113: aload 4
    //   115: areturn
    //   116: astore_1
    //   117: goto +255 -> 372
    //   120: astore_2
    //   121: goto +207 -> 328
    //   124: aload_2
    //   125: astore 6
    //   127: aload_2
    //   128: astore 5
    //   130: aload_2
    //   131: iconst_1
    //   132: invokeinterface 420 2 0
    //   137: astore 4
    //   139: aload_2
    //   140: astore 6
    //   142: aload_2
    //   143: astore 5
    //   145: invokestatic 981	com/google/android/gms/internal/measurement/x1:M	()Lcom/google/android/gms/internal/measurement/x1$a;
    //   148: aload 4
    //   150: invokestatic 514	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   153: checkcast 983	com/google/android/gms/internal/measurement/x1$a
    //   156: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   159: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   162: checkcast 978	com/google/android/gms/internal/measurement/x1
    //   165: astore 7
    //   167: aload_2
    //   168: astore 6
    //   170: aload_2
    //   171: astore 5
    //   173: aload_2
    //   174: iconst_0
    //   175: invokeinterface 292 2 0
    //   180: istore 8
    //   182: aload_2
    //   183: astore 6
    //   185: aload_2
    //   186: astore 5
    //   188: aload_3
    //   189: iload 8
    //   191: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   194: invokeinterface 993 2 0
    //   199: checkcast 534	java/util/List
    //   202: astore 9
    //   204: aload 9
    //   206: astore 4
    //   208: aload 9
    //   210: ifnonnull +45 -> 255
    //   213: aload_2
    //   214: astore 6
    //   216: aload_2
    //   217: astore 5
    //   219: new 607	java/util/ArrayList
    //   222: astore 4
    //   224: aload_2
    //   225: astore 6
    //   227: aload_2
    //   228: astore 5
    //   230: aload 4
    //   232: invokespecial 994	java/util/ArrayList:<init>	()V
    //   235: aload_2
    //   236: astore 6
    //   238: aload_2
    //   239: astore 5
    //   241: aload_3
    //   242: iload 8
    //   244: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: aload 4
    //   249: invokeinterface 997 3 0
    //   254: pop
    //   255: aload_2
    //   256: astore 6
    //   258: aload_2
    //   259: astore 5
    //   261: aload 4
    //   263: aload 7
    //   265: invokeinterface 1001 2 0
    //   270: pop
    //   271: goto +30 -> 301
    //   274: astore 4
    //   276: aload_2
    //   277: astore 6
    //   279: aload_2
    //   280: astore 5
    //   282: aload_0
    //   283: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   286: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   289: ldc_w 1003
    //   292: aload_1
    //   293: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   296: aload 4
    //   298: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   301: aload_2
    //   302: astore 6
    //   304: aload_2
    //   305: astore 5
    //   307: aload_2
    //   308: invokeinterface 445 1 0
    //   313: istore 10
    //   315: iload 10
    //   317: ifne -193 -> 124
    //   320: aload_2
    //   321: invokeinterface 401 1 0
    //   326: aload_3
    //   327: areturn
    //   328: aload 5
    //   330: astore 6
    //   332: aload_0
    //   333: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   336: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   339: ldc_w 1005
    //   342: aload_1
    //   343: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   346: aload_2
    //   347: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   350: aload 5
    //   352: astore 6
    //   354: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   357: astore_1
    //   358: aload 5
    //   360: ifnull +10 -> 370
    //   363: aload 5
    //   365: invokeinterface 401 1 0
    //   370: aload_1
    //   371: areturn
    //   372: aload 6
    //   374: ifnull +10 -> 384
    //   377: aload 6
    //   379: invokeinterface 401 1 0
    //   384: aload_1
    //   385: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	386	0	this	p
    //   0	386	1	paramString1	String
    //   0	386	2	paramString2	String
    //   25	302	3	locala	t.a
    //   30	232	4	localObject	Object
    //   274	23	4	localIOException	IOException
    //   33	331	5	str1	String
    //   36	342	6	str2	String
    //   165	99	7	localx1	x1
    //   180	63	8	i1	int
    //   202	7	9	localList	List
    //   313	3	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   38	81	116	finally
    //   87	96	116	finally
    //   102	107	116	finally
    //   130	139	116	finally
    //   145	167	116	finally
    //   173	182	116	finally
    //   188	204	116	finally
    //   219	224	116	finally
    //   230	235	116	finally
    //   241	255	116	finally
    //   261	271	116	finally
    //   282	301	116	finally
    //   307	315	116	finally
    //   332	350	116	finally
    //   354	358	116	finally
    //   38	81	120	android/database/sqlite/SQLiteException
    //   87	96	120	android/database/sqlite/SQLiteException
    //   102	107	120	android/database/sqlite/SQLiteException
    //   130	139	120	android/database/sqlite/SQLiteException
    //   145	167	120	android/database/sqlite/SQLiteException
    //   173	182	120	android/database/sqlite/SQLiteException
    //   188	204	120	android/database/sqlite/SQLiteException
    //   219	224	120	android/database/sqlite/SQLiteException
    //   230	235	120	android/database/sqlite/SQLiteException
    //   241	255	120	android/database/sqlite/SQLiteException
    //   261	271	120	android/database/sqlite/SQLiteException
    //   282	301	120	android/database/sqlite/SQLiteException
    //   307	315	120	android/database/sqlite/SQLiteException
    //   145	167	274	java/io/IOException
  }
  
  public final q I(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    return H(paramLong, paramString, 1L, false, false, paramBoolean3, false, paramBoolean5);
  }
  
  public final q3 I0(String paramString)
  {
    n.i(paramString);
    n();
    u();
    if ((n6.a()) && (f().s(K.T0)))
    {
      Object localObject = o.a;
      localObject = (q3)N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[] { paramString }, (s)localObject);
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = q3.c;
      }
      return paramString;
    }
    return q3.e(P("select consent_state from consent_settings where app_id=? limit 1;", new String[] { paramString }, "G1"));
  }
  
  /* Error */
  public final java.util.Map J0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 360	R2/C5:u	()V
    //   4: aload_0
    //   5: invokevirtual 357	R2/m3:n	()V
    //   8: aload_1
    //   9: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 961	t/a
    //   21: dup
    //   22: invokespecial 962	t/a:<init>	()V
    //   25: astore_3
    //   26: aload_0
    //   27: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 4
    //   32: aconst_null
    //   33: astore 5
    //   35: aconst_null
    //   36: astore 6
    //   38: aload 4
    //   40: ldc_w 1033
    //   43: iconst_2
    //   44: anewarray 23	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: ldc_w 966
    //   52: aastore
    //   53: dup
    //   54: iconst_1
    //   55: ldc_w 968
    //   58: aastore
    //   59: ldc_w 1035
    //   62: iconst_2
    //   63: anewarray 23	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_2
    //   73: aastore
    //   74: aconst_null
    //   75: aconst_null
    //   76: aconst_null
    //   77: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   80: astore_2
    //   81: aload_2
    //   82: astore 6
    //   84: aload_2
    //   85: astore 5
    //   87: aload_2
    //   88: invokeinterface 398 1 0
    //   93: ifne +31 -> 124
    //   96: aload_2
    //   97: astore 6
    //   99: aload_2
    //   100: astore 5
    //   102: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   105: astore 4
    //   107: aload_2
    //   108: invokeinterface 401 1 0
    //   113: aload 4
    //   115: areturn
    //   116: astore_1
    //   117: goto +255 -> 372
    //   120: astore_2
    //   121: goto +207 -> 328
    //   124: aload_2
    //   125: astore 6
    //   127: aload_2
    //   128: astore 5
    //   130: aload_2
    //   131: iconst_1
    //   132: invokeinterface 420 2 0
    //   137: astore 4
    //   139: aload_2
    //   140: astore 6
    //   142: aload_2
    //   143: astore 5
    //   145: invokestatic 1040	com/google/android/gms/internal/measurement/A1:J	()Lcom/google/android/gms/internal/measurement/A1$a;
    //   148: aload 4
    //   150: invokestatic 514	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   153: checkcast 1042	com/google/android/gms/internal/measurement/A1$a
    //   156: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   159: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   162: checkcast 1037	com/google/android/gms/internal/measurement/A1
    //   165: astore 7
    //   167: aload_2
    //   168: astore 6
    //   170: aload_2
    //   171: astore 5
    //   173: aload_2
    //   174: iconst_0
    //   175: invokeinterface 292 2 0
    //   180: istore 8
    //   182: aload_2
    //   183: astore 6
    //   185: aload_2
    //   186: astore 5
    //   188: aload_3
    //   189: iload 8
    //   191: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   194: invokeinterface 993 2 0
    //   199: checkcast 534	java/util/List
    //   202: astore 9
    //   204: aload 9
    //   206: astore 4
    //   208: aload 9
    //   210: ifnonnull +45 -> 255
    //   213: aload_2
    //   214: astore 6
    //   216: aload_2
    //   217: astore 5
    //   219: new 607	java/util/ArrayList
    //   222: astore 4
    //   224: aload_2
    //   225: astore 6
    //   227: aload_2
    //   228: astore 5
    //   230: aload 4
    //   232: invokespecial 994	java/util/ArrayList:<init>	()V
    //   235: aload_2
    //   236: astore 6
    //   238: aload_2
    //   239: astore 5
    //   241: aload_3
    //   242: iload 8
    //   244: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: aload 4
    //   249: invokeinterface 997 3 0
    //   254: pop
    //   255: aload_2
    //   256: astore 6
    //   258: aload_2
    //   259: astore 5
    //   261: aload 4
    //   263: aload 7
    //   265: invokeinterface 1001 2 0
    //   270: pop
    //   271: goto +30 -> 301
    //   274: astore 4
    //   276: aload_2
    //   277: astore 6
    //   279: aload_2
    //   280: astore 5
    //   282: aload_0
    //   283: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   286: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   289: ldc_w 1044
    //   292: aload_1
    //   293: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   296: aload 4
    //   298: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   301: aload_2
    //   302: astore 6
    //   304: aload_2
    //   305: astore 5
    //   307: aload_2
    //   308: invokeinterface 445 1 0
    //   313: istore 10
    //   315: iload 10
    //   317: ifne -193 -> 124
    //   320: aload_2
    //   321: invokeinterface 401 1 0
    //   326: aload_3
    //   327: areturn
    //   328: aload 5
    //   330: astore 6
    //   332: aload_0
    //   333: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   336: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   339: ldc_w 1005
    //   342: aload_1
    //   343: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   346: aload_2
    //   347: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   350: aload 5
    //   352: astore 6
    //   354: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   357: astore_1
    //   358: aload 5
    //   360: ifnull +10 -> 370
    //   363: aload 5
    //   365: invokeinterface 401 1 0
    //   370: aload_1
    //   371: areturn
    //   372: aload 6
    //   374: ifnull +10 -> 384
    //   377: aload 6
    //   379: invokeinterface 401 1 0
    //   384: aload_1
    //   385: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	386	0	this	p
    //   0	386	1	paramString1	String
    //   0	386	2	paramString2	String
    //   25	302	3	locala	t.a
    //   30	232	4	localObject	Object
    //   274	23	4	localIOException	IOException
    //   33	331	5	str1	String
    //   36	342	6	str2	String
    //   165	99	7	localA1	A1
    //   180	63	8	i1	int
    //   202	7	9	localList	List
    //   313	3	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   38	81	116	finally
    //   87	96	116	finally
    //   102	107	116	finally
    //   130	139	116	finally
    //   145	167	116	finally
    //   173	182	116	finally
    //   188	204	116	finally
    //   219	224	116	finally
    //   230	235	116	finally
    //   241	255	116	finally
    //   261	271	116	finally
    //   282	301	116	finally
    //   307	315	116	finally
    //   332	350	116	finally
    //   354	358	116	finally
    //   38	81	120	android/database/sqlite/SQLiteException
    //   87	96	120	android/database/sqlite/SQLiteException
    //   102	107	120	android/database/sqlite/SQLiteException
    //   130	139	120	android/database/sqlite/SQLiteException
    //   145	167	120	android/database/sqlite/SQLiteException
    //   173	182	120	android/database/sqlite/SQLiteException
    //   188	204	120	android/database/sqlite/SQLiteException
    //   219	224	120	android/database/sqlite/SQLiteException
    //   230	235	120	android/database/sqlite/SQLiteException
    //   241	255	120	android/database/sqlite/SQLiteException
    //   261	271	120	android/database/sqlite/SQLiteException
    //   282	301	120	android/database/sqlite/SQLiteException
    //   307	315	120	android/database/sqlite/SQLiteException
    //   145	167	274	java/io/IOException
  }
  
  /* Error */
  public final List K0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 357	R2/m3:n	()V
    //   9: aload_0
    //   10: invokevirtual 360	R2/C5:u	()V
    //   13: new 607	java/util/ArrayList
    //   16: dup
    //   17: invokespecial 994	java/util/ArrayList:<init>	()V
    //   20: astore_2
    //   21: aconst_null
    //   22: astore_3
    //   23: aconst_null
    //   24: astore 4
    //   26: aload_0
    //   27: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: ldc_w 1048
    //   33: iconst_3
    //   34: anewarray 23	java/lang/String
    //   37: dup
    //   38: iconst_0
    //   39: ldc_w 1050
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: ldc_w 1052
    //   48: aastore
    //   49: dup
    //   50: iconst_2
    //   51: ldc_w 1054
    //   54: aastore
    //   55: ldc_w 677
    //   58: iconst_1
    //   59: anewarray 23	java/lang/String
    //   62: dup
    //   63: iconst_0
    //   64: aload_1
    //   65: aastore
    //   66: aconst_null
    //   67: aconst_null
    //   68: ldc_w 1056
    //   71: aconst_null
    //   72: invokevirtual 1059	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 5
    //   77: aload 5
    //   79: astore 4
    //   81: aload 5
    //   83: astore_3
    //   84: aload 5
    //   86: invokeinterface 398 1 0
    //   91: istore 6
    //   93: iload 6
    //   95: ifne +12 -> 107
    //   98: aload 5
    //   100: invokeinterface 401 1 0
    //   105: aload_2
    //   106: areturn
    //   107: aload 5
    //   109: astore 4
    //   111: aload 5
    //   113: astore_3
    //   114: aload 5
    //   116: iconst_0
    //   117: invokeinterface 288 2 0
    //   122: astore 7
    //   124: aload 7
    //   126: astore 8
    //   128: aload 7
    //   130: ifnonnull +20 -> 150
    //   133: ldc_w 403
    //   136: astore 8
    //   138: goto +12 -> 150
    //   141: astore_1
    //   142: goto +159 -> 301
    //   145: astore 5
    //   147: goto +113 -> 260
    //   150: aload 5
    //   152: astore 4
    //   154: aload 5
    //   156: astore_3
    //   157: aload 5
    //   159: iconst_1
    //   160: invokeinterface 411 2 0
    //   165: lstore 9
    //   167: aload 5
    //   169: astore 4
    //   171: aload 5
    //   173: astore_3
    //   174: aload 5
    //   176: iconst_2
    //   177: invokeinterface 292 2 0
    //   182: istore 11
    //   184: aload 5
    //   186: astore 4
    //   188: aload 5
    //   190: astore_3
    //   191: new 1061	R2/v5
    //   194: astore 7
    //   196: aload 5
    //   198: astore 4
    //   200: aload 5
    //   202: astore_3
    //   203: aload 7
    //   205: aload 8
    //   207: lload 9
    //   209: iload 11
    //   211: invokespecial 1064	R2/v5:<init>	(Ljava/lang/String;JI)V
    //   214: aload 5
    //   216: astore 4
    //   218: aload 5
    //   220: astore_3
    //   221: aload_2
    //   222: aload 7
    //   224: invokeinterface 1001 2 0
    //   229: pop
    //   230: aload 5
    //   232: astore 4
    //   234: aload 5
    //   236: astore_3
    //   237: aload 5
    //   239: invokeinterface 445 1 0
    //   244: istore 6
    //   246: iload 6
    //   248: ifne -141 -> 107
    //   251: aload 5
    //   253: invokeinterface 401 1 0
    //   258: aload_2
    //   259: areturn
    //   260: aload_3
    //   261: astore 4
    //   263: aload_0
    //   264: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   267: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   270: ldc_w 1066
    //   273: aload_1
    //   274: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   277: aload 5
    //   279: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   282: aload_3
    //   283: astore 4
    //   285: invokestatic 1069	java/util/Collections:emptyList	()Ljava/util/List;
    //   288: astore_1
    //   289: aload_3
    //   290: ifnull +9 -> 299
    //   293: aload_3
    //   294: invokeinterface 401 1 0
    //   299: aload_1
    //   300: areturn
    //   301: aload 4
    //   303: ifnull +10 -> 313
    //   306: aload 4
    //   308: invokeinterface 401 1 0
    //   313: aload_1
    //   314: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	315	0	this	p
    //   0	315	1	paramString	String
    //   20	239	2	localArrayList	ArrayList
    //   22	272	3	localObject1	Object
    //   24	283	4	localObject2	Object
    //   75	40	5	localCursor	Cursor
    //   145	133	5	localSQLiteException	SQLiteException
    //   91	156	6	bool	boolean
    //   122	101	7	localObject3	Object
    //   126	80	8	localObject4	Object
    //   165	43	9	l1	long
    //   182	28	11	i1	int
    // Exception table:
    //   from	to	target	type
    //   26	77	141	finally
    //   84	93	141	finally
    //   114	124	141	finally
    //   157	167	141	finally
    //   174	184	141	finally
    //   191	196	141	finally
    //   203	214	141	finally
    //   221	230	141	finally
    //   237	246	141	finally
    //   263	282	141	finally
    //   285	289	141	finally
    //   26	77	145	android/database/sqlite/SQLiteException
    //   84	93	145	android/database/sqlite/SQLiteException
    //   114	124	145	android/database/sqlite/SQLiteException
    //   157	167	145	android/database/sqlite/SQLiteException
    //   174	184	145	android/database/sqlite/SQLiteException
    //   191	196	145	android/database/sqlite/SQLiteException
    //   203	214	145	android/database/sqlite/SQLiteException
    //   221	230	145	android/database/sqlite/SQLiteException
    //   237	246	145	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final android.util.Pair L(String paramString, Long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 357	R2/m3:n	()V
    //   4: aload_0
    //   5: invokevirtual 360	R2/C5:u	()V
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 1072
    //   17: iconst_2
    //   18: anewarray 23	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: aload_2
    //   28: invokestatic 1075	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   31: aastore
    //   32: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   35: astore 4
    //   37: aload 4
    //   39: astore_3
    //   40: aload 4
    //   42: invokeinterface 398 1 0
    //   47: ifne +41 -> 88
    //   50: aload 4
    //   52: astore_3
    //   53: aload_0
    //   54: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   57: invokevirtual 500	R2/Y1:K	()LR2/a2;
    //   60: ldc_w 1077
    //   63: invokevirtual 504	R2/a2:a	(Ljava/lang/String;)V
    //   66: aload 4
    //   68: invokeinterface 401 1 0
    //   73: aconst_null
    //   74: areturn
    //   75: astore_1
    //   76: aload_3
    //   77: astore_2
    //   78: goto +155 -> 233
    //   81: astore_2
    //   82: aload 4
    //   84: astore_1
    //   85: goto +120 -> 205
    //   88: aload 4
    //   90: astore_3
    //   91: aload 4
    //   93: iconst_0
    //   94: invokeinterface 420 2 0
    //   99: astore 5
    //   101: aload 4
    //   103: astore_3
    //   104: aload 4
    //   106: iconst_1
    //   107: invokeinterface 411 2 0
    //   112: lstore 6
    //   114: aload 4
    //   116: astore_3
    //   117: invokestatic 510	com/google/android/gms/internal/measurement/Y1:Z	()Lcom/google/android/gms/internal/measurement/Y1$a;
    //   120: aload 5
    //   122: invokestatic 514	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   125: checkcast 516	com/google/android/gms/internal/measurement/Y1$a
    //   128: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   131: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   134: checkcast 506	com/google/android/gms/internal/measurement/Y1
    //   137: astore 5
    //   139: aload 4
    //   141: astore_3
    //   142: aload 5
    //   144: lload 6
    //   146: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   149: invokestatic 1083	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   152: astore_1
    //   153: aload 4
    //   155: invokeinterface 401 1 0
    //   160: aload_1
    //   161: areturn
    //   162: astore 5
    //   164: aload 4
    //   166: astore_3
    //   167: aload_0
    //   168: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   171: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   174: ldc_w 1085
    //   177: aload_1
    //   178: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   181: aload_2
    //   182: aload 5
    //   184: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   187: aload 4
    //   189: invokeinterface 401 1 0
    //   194: aconst_null
    //   195: areturn
    //   196: astore_1
    //   197: aload_3
    //   198: astore_2
    //   199: goto +34 -> 233
    //   202: astore_2
    //   203: aconst_null
    //   204: astore_1
    //   205: aload_1
    //   206: astore_3
    //   207: aload_0
    //   208: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   211: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   214: ldc_w 1087
    //   217: aload_2
    //   218: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   221: aload_1
    //   222: ifnull +9 -> 231
    //   225: aload_1
    //   226: invokeinterface 401 1 0
    //   231: aconst_null
    //   232: areturn
    //   233: aload_2
    //   234: ifnull +9 -> 243
    //   237: aload_2
    //   238: invokeinterface 401 1 0
    //   243: aload_1
    //   244: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	245	0	this	p
    //   0	245	1	paramString	String
    //   0	245	2	paramLong	Long
    //   9	198	3	localObject1	Object
    //   35	153	4	localCursor	Cursor
    //   99	44	5	localObject2	Object
    //   162	21	5	localIOException	IOException
    //   112	33	6	l1	long
    // Exception table:
    //   from	to	target	type
    //   40	50	75	finally
    //   53	66	75	finally
    //   91	101	75	finally
    //   104	114	75	finally
    //   117	139	75	finally
    //   142	153	75	finally
    //   167	187	75	finally
    //   207	221	75	finally
    //   40	50	81	android/database/sqlite/SQLiteException
    //   53	66	81	android/database/sqlite/SQLiteException
    //   91	101	81	android/database/sqlite/SQLiteException
    //   104	114	81	android/database/sqlite/SQLiteException
    //   117	139	81	android/database/sqlite/SQLiteException
    //   142	153	81	android/database/sqlite/SQLiteException
    //   167	187	81	android/database/sqlite/SQLiteException
    //   117	139	162	java/io/IOException
    //   10	37	196	finally
    //   10	37	202	android/database/sqlite/SQLiteException
  }
  
  public final void L0(String paramString1, String paramString2)
  {
    n.e(paramString1);
    n.e(paramString2);
    n();
    u();
    try
    {
      B().delete("user_attributes", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      j().G().d("Error deleting user property. appId", Y1.v(paramString1), h().g(paramString2), localSQLiteException);
    }
  }
  
  public final Object M(Cursor paramCursor, int paramInt)
  {
    int i1 = paramCursor.getType(paramInt);
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4)
            {
              j().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(i1));
              return null;
            }
            j().G().a("Loaded invalid blob type value, ignoring it");
            return null;
          }
          return paramCursor.getString(paramInt);
        }
        return Double.valueOf(paramCursor.getDouble(paramInt));
      }
      return Long.valueOf(paramCursor.getLong(paramInt));
    }
    j().G().a("Loaded invalid null value from database");
    return null;
  }
  
  /* Error */
  public final List M0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 357	R2/m3:n	()V
    //   9: aload_0
    //   10: invokevirtual 360	R2/C5:u	()V
    //   13: new 607	java/util/ArrayList
    //   16: dup
    //   17: invokespecial 994	java/util/ArrayList:<init>	()V
    //   20: astore_2
    //   21: aconst_null
    //   22: astore_3
    //   23: aconst_null
    //   24: astore 4
    //   26: aload_0
    //   27: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: ldc_w 908
    //   33: iconst_4
    //   34: anewarray 23	java/lang/String
    //   37: dup
    //   38: iconst_0
    //   39: ldc_w 1108
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: ldc 51
    //   47: aastore
    //   48: dup
    //   49: iconst_2
    //   50: ldc_w 910
    //   53: aastore
    //   54: dup
    //   55: iconst_3
    //   56: ldc_w 368
    //   59: aastore
    //   60: ldc_w 677
    //   63: iconst_1
    //   64: anewarray 23	java/lang/String
    //   67: dup
    //   68: iconst_0
    //   69: aload_1
    //   70: aastore
    //   71: aconst_null
    //   72: aconst_null
    //   73: ldc_w 1056
    //   76: ldc_w 1110
    //   79: invokevirtual 1059	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   82: astore 5
    //   84: aload 5
    //   86: astore 4
    //   88: aload 5
    //   90: astore_3
    //   91: aload 5
    //   93: invokeinterface 398 1 0
    //   98: istore 6
    //   100: iload 6
    //   102: ifne +12 -> 114
    //   105: aload 5
    //   107: invokeinterface 401 1 0
    //   112: aload_2
    //   113: areturn
    //   114: aload 5
    //   116: astore 4
    //   118: aload 5
    //   120: astore_3
    //   121: aload 5
    //   123: iconst_0
    //   124: invokeinterface 288 2 0
    //   129: astore 7
    //   131: aload 5
    //   133: astore 4
    //   135: aload 5
    //   137: astore_3
    //   138: aload 5
    //   140: iconst_1
    //   141: invokeinterface 288 2 0
    //   146: astore 8
    //   148: aload 8
    //   150: astore 9
    //   152: aload 8
    //   154: ifnonnull +8 -> 162
    //   157: ldc_w 403
    //   160: astore 9
    //   162: goto +15 -> 177
    //   165: astore_1
    //   166: goto +188 -> 354
    //   169: astore 9
    //   171: aload_3
    //   172: astore 5
    //   174: goto +135 -> 309
    //   177: aload 5
    //   179: astore 4
    //   181: aload 5
    //   183: astore_3
    //   184: aload 5
    //   186: iconst_2
    //   187: invokeinterface 411 2 0
    //   192: lstore 10
    //   194: aload 5
    //   196: astore 4
    //   198: aload_0
    //   199: aload 5
    //   201: iconst_3
    //   202: invokevirtual 407	R2/p:M	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   205: astore_3
    //   206: aload_3
    //   207: ifnonnull +36 -> 243
    //   210: aload 5
    //   212: astore 4
    //   214: aload_0
    //   215: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   218: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   221: ldc_w 1112
    //   224: aload_1
    //   225: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   228: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   231: goto +51 -> 282
    //   234: astore_1
    //   235: goto +119 -> 354
    //   238: astore 9
    //   240: goto +69 -> 309
    //   243: aload 5
    //   245: astore 4
    //   247: new 912	R2/T5
    //   250: astore 8
    //   252: aload 5
    //   254: astore 4
    //   256: aload 8
    //   258: aload_1
    //   259: aload 9
    //   261: aload 7
    //   263: lload 10
    //   265: aload_3
    //   266: invokespecial 915	R2/T5:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   269: aload 5
    //   271: astore 4
    //   273: aload_2
    //   274: aload 8
    //   276: invokeinterface 1001 2 0
    //   281: pop
    //   282: aload 5
    //   284: astore 4
    //   286: aload 5
    //   288: invokeinterface 445 1 0
    //   293: istore 6
    //   295: iload 6
    //   297: ifne -183 -> 114
    //   300: aload 5
    //   302: invokeinterface 401 1 0
    //   307: aload_2
    //   308: areturn
    //   309: aload 5
    //   311: astore 4
    //   313: aload_0
    //   314: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   317: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   320: ldc_w 1114
    //   323: aload_1
    //   324: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   327: aload 9
    //   329: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   332: aload 5
    //   334: astore 4
    //   336: invokestatic 1069	java/util/Collections:emptyList	()Ljava/util/List;
    //   339: astore_1
    //   340: aload 5
    //   342: ifnull +10 -> 352
    //   345: aload 5
    //   347: invokeinterface 401 1 0
    //   352: aload_1
    //   353: areturn
    //   354: aload 4
    //   356: ifnull +10 -> 366
    //   359: aload 4
    //   361: invokeinterface 401 1 0
    //   366: aload_1
    //   367: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	368	0	this	p
    //   0	368	1	paramString	String
    //   20	288	2	localArrayList	ArrayList
    //   22	244	3	localObject1	Object
    //   24	336	4	localObject2	Object
    //   82	264	5	localObject3	Object
    //   98	198	6	bool	boolean
    //   129	133	7	str	String
    //   146	129	8	localObject4	Object
    //   150	11	9	localObject5	Object
    //   169	1	9	localSQLiteException1	SQLiteException
    //   238	90	9	localSQLiteException2	SQLiteException
    //   192	72	10	l1	long
    // Exception table:
    //   from	to	target	type
    //   26	84	165	finally
    //   91	100	165	finally
    //   121	131	165	finally
    //   138	148	165	finally
    //   184	194	165	finally
    //   26	84	169	android/database/sqlite/SQLiteException
    //   91	100	169	android/database/sqlite/SQLiteException
    //   121	131	169	android/database/sqlite/SQLiteException
    //   138	148	169	android/database/sqlite/SQLiteException
    //   184	194	169	android/database/sqlite/SQLiteException
    //   198	206	234	finally
    //   214	231	234	finally
    //   247	252	234	finally
    //   256	269	234	finally
    //   273	282	234	finally
    //   286	295	234	finally
    //   313	332	234	finally
    //   336	340	234	finally
    //   198	206	238	android/database/sqlite/SQLiteException
    //   214	231	238	android/database/sqlite/SQLiteException
    //   247	252	238	android/database/sqlite/SQLiteException
    //   256	269	238	android/database/sqlite/SQLiteException
    //   273	282	238	android/database/sqlite/SQLiteException
    //   286	295	238	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final Object N(String paramString, String[] paramArrayOfString, s params)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: aload_1
    //   8: aload_2
    //   9: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   12: astore_2
    //   13: aload_2
    //   14: astore_1
    //   15: aload_2
    //   16: invokeinterface 398 1 0
    //   21: ifne +34 -> 55
    //   24: aload_2
    //   25: astore_1
    //   26: aload_0
    //   27: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   30: invokevirtual 500	R2/Y1:K	()LR2/a2;
    //   33: ldc_w 1116
    //   36: invokevirtual 504	R2/a2:a	(Ljava/lang/String;)V
    //   39: aload_2
    //   40: invokeinterface 401 1 0
    //   45: aconst_null
    //   46: areturn
    //   47: astore_2
    //   48: goto +63 -> 111
    //   51: astore_3
    //   52: goto +31 -> 83
    //   55: aload_2
    //   56: astore_1
    //   57: aload_3
    //   58: aload_2
    //   59: invokeinterface 1121 2 0
    //   64: astore_3
    //   65: aload_2
    //   66: invokeinterface 401 1 0
    //   71: aload_3
    //   72: areturn
    //   73: astore_2
    //   74: aload 4
    //   76: astore_1
    //   77: goto +34 -> 111
    //   80: astore_3
    //   81: aconst_null
    //   82: astore_2
    //   83: aload_2
    //   84: astore_1
    //   85: aload_0
    //   86: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   89: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   92: ldc_w 1123
    //   95: aload_3
    //   96: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   99: aload_2
    //   100: ifnull +9 -> 109
    //   103: aload_2
    //   104: invokeinterface 401 1 0
    //   109: aconst_null
    //   110: areturn
    //   111: aload_1
    //   112: ifnull +9 -> 121
    //   115: aload_1
    //   116: invokeinterface 401 1 0
    //   121: aload_2
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	p
    //   0	123	1	paramString	String
    //   0	123	2	paramArrayOfString	String[]
    //   0	123	3	params	s
    //   1	74	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	24	47	finally
    //   26	39	47	finally
    //   57	65	47	finally
    //   85	99	47	finally
    //   15	24	51	android/database/sqlite/SQLiteException
    //   26	39	51	android/database/sqlite/SQLiteException
    //   57	65	51	android/database/sqlite/SQLiteException
    //   3	13	73	finally
    //   3	13	80	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final java.util.Map N0(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 360	R2/C5:u	()V
    //   4: aload_0
    //   5: invokevirtual 357	R2/m3:n	()V
    //   8: aload_1
    //   9: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_0
    //   14: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore_2
    //   18: aconst_null
    //   19: astore_3
    //   20: aconst_null
    //   21: astore 4
    //   23: aload_2
    //   24: ldc_w 1127
    //   27: iconst_2
    //   28: anewarray 23	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc_w 966
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: ldc_w 1129
    //   42: aastore
    //   43: ldc_w 677
    //   46: iconst_1
    //   47: anewarray 23	java/lang/String
    //   50: dup
    //   51: iconst_0
    //   52: aload_1
    //   53: aastore
    //   54: aconst_null
    //   55: aconst_null
    //   56: aconst_null
    //   57: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   60: astore_2
    //   61: aload_2
    //   62: astore 4
    //   64: aload_2
    //   65: astore_3
    //   66: aload_2
    //   67: invokeinterface 398 1 0
    //   72: ifne +30 -> 102
    //   75: aload_2
    //   76: astore 4
    //   78: aload_2
    //   79: astore_3
    //   80: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   83: astore 5
    //   85: aload_2
    //   86: invokeinterface 401 1 0
    //   91: aload 5
    //   93: areturn
    //   94: astore_1
    //   95: goto +203 -> 298
    //   98: astore_2
    //   99: goto +159 -> 258
    //   102: aload_2
    //   103: astore 4
    //   105: aload_2
    //   106: astore_3
    //   107: new 961	t/a
    //   110: astore 5
    //   112: aload_2
    //   113: astore 4
    //   115: aload_2
    //   116: astore_3
    //   117: aload 5
    //   119: invokespecial 962	t/a:<init>	()V
    //   122: aload_2
    //   123: astore 4
    //   125: aload_2
    //   126: astore_3
    //   127: aload_2
    //   128: iconst_0
    //   129: invokeinterface 292 2 0
    //   134: istore 6
    //   136: aload_2
    //   137: astore 4
    //   139: aload_2
    //   140: astore_3
    //   141: aload_2
    //   142: iconst_1
    //   143: invokeinterface 420 2 0
    //   148: astore 7
    //   150: aload_2
    //   151: astore 4
    //   153: aload_2
    //   154: astore_3
    //   155: invokestatic 1134	com/google/android/gms/internal/measurement/f2:V	()Lcom/google/android/gms/internal/measurement/f2$a;
    //   158: aload 7
    //   160: invokestatic 514	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   163: checkcast 1136	com/google/android/gms/internal/measurement/f2$a
    //   166: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   169: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   172: checkcast 1131	com/google/android/gms/internal/measurement/f2
    //   175: astore 7
    //   177: aload_2
    //   178: astore 4
    //   180: aload_2
    //   181: astore_3
    //   182: aload 5
    //   184: iload 6
    //   186: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: aload 7
    //   191: invokeinterface 997 3 0
    //   196: pop
    //   197: goto +34 -> 231
    //   200: astore 7
    //   202: aload_2
    //   203: astore 4
    //   205: aload_2
    //   206: astore_3
    //   207: aload_0
    //   208: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   211: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   214: ldc_w 1138
    //   217: aload_1
    //   218: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   221: iload 6
    //   223: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   226: aload 7
    //   228: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   231: aload_2
    //   232: astore 4
    //   234: aload_2
    //   235: astore_3
    //   236: aload_2
    //   237: invokeinterface 445 1 0
    //   242: istore 8
    //   244: iload 8
    //   246: ifne -124 -> 122
    //   249: aload_2
    //   250: invokeinterface 401 1 0
    //   255: aload 5
    //   257: areturn
    //   258: aload_3
    //   259: astore 4
    //   261: aload_0
    //   262: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   265: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   268: ldc_w 1140
    //   271: aload_1
    //   272: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   275: aload_2
    //   276: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   279: aload_3
    //   280: astore 4
    //   282: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   285: astore_1
    //   286: aload_3
    //   287: ifnull +9 -> 296
    //   290: aload_3
    //   291: invokeinterface 401 1 0
    //   296: aload_1
    //   297: areturn
    //   298: aload 4
    //   300: ifnull +10 -> 310
    //   303: aload 4
    //   305: invokeinterface 401 1 0
    //   310: aload_1
    //   311: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	this	p
    //   0	312	1	paramString	String
    //   17	69	2	localObject1	Object
    //   98	178	2	localSQLiteException	SQLiteException
    //   19	272	3	localObject2	Object
    //   21	283	4	localObject3	Object
    //   83	173	5	localObject4	Object
    //   134	88	6	i1	int
    //   148	42	7	localObject5	Object
    //   200	27	7	localIOException	IOException
    //   242	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   23	61	94	finally
    //   66	75	94	finally
    //   80	85	94	finally
    //   107	112	94	finally
    //   117	122	94	finally
    //   127	136	94	finally
    //   141	150	94	finally
    //   155	177	94	finally
    //   182	197	94	finally
    //   207	231	94	finally
    //   236	244	94	finally
    //   261	279	94	finally
    //   282	286	94	finally
    //   23	61	98	android/database/sqlite/SQLiteException
    //   66	75	98	android/database/sqlite/SQLiteException
    //   80	85	98	android/database/sqlite/SQLiteException
    //   107	112	98	android/database/sqlite/SQLiteException
    //   117	122	98	android/database/sqlite/SQLiteException
    //   127	136	98	android/database/sqlite/SQLiteException
    //   141	150	98	android/database/sqlite/SQLiteException
    //   155	177	98	android/database/sqlite/SQLiteException
    //   182	197	98	android/database/sqlite/SQLiteException
    //   207	231	98	android/database/sqlite/SQLiteException
    //   236	244	98	android/database/sqlite/SQLiteException
    //   155	177	200	java/io/IOException
  }
  
  /* Error */
  public final String O(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 357	R2/m3:n	()V
    //   4: aload_0
    //   5: invokevirtual 360	R2/C5:u	()V
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: ldc_w 1143
    //   17: iconst_1
    //   18: anewarray 23	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: lload_1
    //   24: invokestatic 1145	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   27: aastore
    //   28: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore 4
    //   33: aload 4
    //   35: astore_3
    //   36: aload 4
    //   38: invokeinterface 398 1 0
    //   43: ifne +38 -> 81
    //   46: aload 4
    //   48: astore_3
    //   49: aload_0
    //   50: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   53: invokevirtual 500	R2/Y1:K	()LR2/a2;
    //   56: ldc_w 1147
    //   59: invokevirtual 504	R2/a2:a	(Ljava/lang/String;)V
    //   62: aload 4
    //   64: invokeinterface 401 1 0
    //   69: aconst_null
    //   70: areturn
    //   71: astore 4
    //   73: goto +73 -> 146
    //   76: astore 5
    //   78: goto +36 -> 114
    //   81: aload 4
    //   83: astore_3
    //   84: aload 4
    //   86: iconst_0
    //   87: invokeinterface 288 2 0
    //   92: astore 5
    //   94: aload 4
    //   96: invokeinterface 401 1 0
    //   101: aload 5
    //   103: areturn
    //   104: astore 4
    //   106: goto +40 -> 146
    //   109: astore 5
    //   111: aconst_null
    //   112: astore 4
    //   114: aload 4
    //   116: astore_3
    //   117: aload_0
    //   118: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   121: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   124: ldc_w 1149
    //   127: aload 5
    //   129: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   132: aload 4
    //   134: ifnull +10 -> 144
    //   137: aload 4
    //   139: invokeinterface 401 1 0
    //   144: aconst_null
    //   145: areturn
    //   146: aload_3
    //   147: ifnull +9 -> 156
    //   150: aload_3
    //   151: invokeinterface 401 1 0
    //   156: aload 4
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	p
    //   0	159	1	paramLong	long
    //   9	142	3	localObject1	Object
    //   31	32	4	localCursor	Cursor
    //   71	24	4	localObject2	Object
    //   104	1	4	localObject3	Object
    //   112	45	4	localObject4	Object
    //   76	1	5	localSQLiteException1	SQLiteException
    //   92	10	5	str	String
    //   109	19	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   36	46	71	finally
    //   49	62	71	finally
    //   84	94	71	finally
    //   117	132	71	finally
    //   36	46	76	android/database/sqlite/SQLiteException
    //   49	62	76	android/database/sqlite/SQLiteException
    //   84	94	76	android/database/sqlite/SQLiteException
    //   10	33	104	finally
    //   10	33	109	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final java.util.Map O0(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: new 961	t/a
    //   8: dup
    //   9: invokespecial 962	t/a:<init>	()V
    //   12: astore_2
    //   13: aload_0
    //   14: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore_3
    //   18: aconst_null
    //   19: astore 4
    //   21: aconst_null
    //   22: astore 5
    //   24: aload_3
    //   25: ldc_w 964
    //   28: iconst_2
    //   29: anewarray 23	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: ldc_w 966
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: ldc_w 968
    //   43: aastore
    //   44: ldc_w 677
    //   47: iconst_1
    //   48: anewarray 23	java/lang/String
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: aconst_null
    //   56: aconst_null
    //   57: aconst_null
    //   58: invokevirtual 394	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   61: astore_3
    //   62: aload_3
    //   63: astore 5
    //   65: aload_3
    //   66: astore 4
    //   68: aload_3
    //   69: invokeinterface 398 1 0
    //   74: ifne +31 -> 105
    //   77: aload_3
    //   78: astore 5
    //   80: aload_3
    //   81: astore 4
    //   83: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   86: astore 6
    //   88: aload_3
    //   89: invokeinterface 401 1 0
    //   94: aload 6
    //   96: areturn
    //   97: astore_1
    //   98: goto +269 -> 367
    //   101: astore_3
    //   102: goto +221 -> 323
    //   105: aload_3
    //   106: astore 5
    //   108: aload_3
    //   109: astore 4
    //   111: aload_3
    //   112: iconst_1
    //   113: invokeinterface 420 2 0
    //   118: astore 6
    //   120: aload_3
    //   121: astore 5
    //   123: aload_3
    //   124: astore 4
    //   126: invokestatic 981	com/google/android/gms/internal/measurement/x1:M	()Lcom/google/android/gms/internal/measurement/x1$a;
    //   129: aload 6
    //   131: invokestatic 514	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   134: checkcast 983	com/google/android/gms/internal/measurement/x1$a
    //   137: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   140: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   143: checkcast 978	com/google/android/gms/internal/measurement/x1
    //   146: astore 7
    //   148: aload_3
    //   149: astore 5
    //   151: aload_3
    //   152: astore 4
    //   154: aload 7
    //   156: invokevirtual 1152	com/google/android/gms/internal/measurement/x1:U	()Z
    //   159: ifeq +137 -> 296
    //   162: aload_3
    //   163: astore 5
    //   165: aload_3
    //   166: astore 4
    //   168: aload_3
    //   169: iconst_0
    //   170: invokeinterface 292 2 0
    //   175: istore 8
    //   177: aload_3
    //   178: astore 5
    //   180: aload_3
    //   181: astore 4
    //   183: aload_2
    //   184: iload 8
    //   186: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: invokeinterface 993 2 0
    //   194: checkcast 534	java/util/List
    //   197: astore 9
    //   199: aload 9
    //   201: astore 6
    //   203: aload 9
    //   205: ifnonnull +45 -> 250
    //   208: aload_3
    //   209: astore 5
    //   211: aload_3
    //   212: astore 4
    //   214: new 607	java/util/ArrayList
    //   217: astore 6
    //   219: aload_3
    //   220: astore 5
    //   222: aload_3
    //   223: astore 4
    //   225: aload 6
    //   227: invokespecial 994	java/util/ArrayList:<init>	()V
    //   230: aload_3
    //   231: astore 5
    //   233: aload_3
    //   234: astore 4
    //   236: aload_2
    //   237: iload 8
    //   239: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   242: aload 6
    //   244: invokeinterface 997 3 0
    //   249: pop
    //   250: aload_3
    //   251: astore 5
    //   253: aload_3
    //   254: astore 4
    //   256: aload 6
    //   258: aload 7
    //   260: invokeinterface 1001 2 0
    //   265: pop
    //   266: goto +30 -> 296
    //   269: astore 6
    //   271: aload_3
    //   272: astore 5
    //   274: aload_3
    //   275: astore 4
    //   277: aload_0
    //   278: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   281: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   284: ldc_w 1003
    //   287: aload_1
    //   288: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   291: aload 6
    //   293: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   296: aload_3
    //   297: astore 5
    //   299: aload_3
    //   300: astore 4
    //   302: aload_3
    //   303: invokeinterface 445 1 0
    //   308: istore 10
    //   310: iload 10
    //   312: ifne -207 -> 105
    //   315: aload_3
    //   316: invokeinterface 401 1 0
    //   321: aload_2
    //   322: areturn
    //   323: aload 4
    //   325: astore 5
    //   327: aload_0
    //   328: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   331: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   334: ldc_w 1005
    //   337: aload_1
    //   338: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   341: aload_3
    //   342: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   345: aload 4
    //   347: astore 5
    //   349: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   352: astore_1
    //   353: aload 4
    //   355: ifnull +10 -> 365
    //   358: aload 4
    //   360: invokeinterface 401 1 0
    //   365: aload_1
    //   366: areturn
    //   367: aload 5
    //   369: ifnull +10 -> 379
    //   372: aload 5
    //   374: invokeinterface 401 1 0
    //   379: aload_1
    //   380: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	381	0	this	p
    //   0	381	1	paramString	String
    //   12	310	2	locala	t.a
    //   17	72	3	localObject1	Object
    //   101	241	3	localSQLiteException	SQLiteException
    //   19	340	4	localObject2	Object
    //   22	351	5	localObject3	Object
    //   86	171	6	localObject4	Object
    //   269	23	6	localIOException	IOException
    //   146	113	7	localx1	x1
    //   175	63	8	i1	int
    //   197	7	9	localList	List
    //   308	3	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   24	62	97	finally
    //   68	77	97	finally
    //   83	88	97	finally
    //   111	120	97	finally
    //   126	148	97	finally
    //   154	162	97	finally
    //   168	177	97	finally
    //   183	199	97	finally
    //   214	219	97	finally
    //   225	230	97	finally
    //   236	250	97	finally
    //   256	266	97	finally
    //   277	296	97	finally
    //   302	310	97	finally
    //   327	345	97	finally
    //   349	353	97	finally
    //   24	62	101	android/database/sqlite/SQLiteException
    //   68	77	101	android/database/sqlite/SQLiteException
    //   83	88	101	android/database/sqlite/SQLiteException
    //   111	120	101	android/database/sqlite/SQLiteException
    //   126	148	101	android/database/sqlite/SQLiteException
    //   154	162	101	android/database/sqlite/SQLiteException
    //   168	177	101	android/database/sqlite/SQLiteException
    //   183	199	101	android/database/sqlite/SQLiteException
    //   214	219	101	android/database/sqlite/SQLiteException
    //   225	230	101	android/database/sqlite/SQLiteException
    //   236	250	101	android/database/sqlite/SQLiteException
    //   256	266	101	android/database/sqlite/SQLiteException
    //   277	296	101	android/database/sqlite/SQLiteException
    //   302	310	101	android/database/sqlite/SQLiteException
    //   126	148	269	java/io/IOException
  }
  
  /* Error */
  public final String P(String paramString1, String[] paramArrayOfString, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 4
    //   6: aconst_null
    //   7: astore 5
    //   9: aconst_null
    //   10: astore 6
    //   12: aload 4
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: astore 6
    //   23: aload_2
    //   24: astore 5
    //   26: aload_2
    //   27: invokeinterface 398 1 0
    //   32: ifeq +33 -> 65
    //   35: aload_2
    //   36: astore 6
    //   38: aload_2
    //   39: astore 5
    //   41: aload_2
    //   42: iconst_0
    //   43: invokeinterface 288 2 0
    //   48: astore_3
    //   49: aload_2
    //   50: invokeinterface 401 1 0
    //   55: aload_3
    //   56: areturn
    //   57: astore_1
    //   58: goto +40 -> 98
    //   61: astore_2
    //   62: goto +11 -> 73
    //   65: aload_2
    //   66: invokeinterface 401 1 0
    //   71: aload_3
    //   72: areturn
    //   73: aload 5
    //   75: astore 6
    //   77: aload_0
    //   78: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   81: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   84: ldc_w 921
    //   87: aload_1
    //   88: aload_2
    //   89: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   92: aload 5
    //   94: astore 6
    //   96: aload_2
    //   97: athrow
    //   98: aload 6
    //   100: ifnull +10 -> 110
    //   103: aload 6
    //   105: invokeinterface 401 1 0
    //   110: aload_1
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	p
    //   0	112	1	paramString1	String
    //   0	112	2	paramArrayOfString	String[]
    //   0	112	3	paramString2	String
    //   4	9	4	localSQLiteDatabase	SQLiteDatabase
    //   7	86	5	arrayOfString1	String[]
    //   10	94	6	arrayOfString2	String[]
    // Exception table:
    //   from	to	target	type
    //   12	20	57	finally
    //   26	35	57	finally
    //   41	49	57	finally
    //   77	92	57	finally
    //   96	98	57	finally
    //   12	20	61	android/database/sqlite/SQLiteException
    //   26	35	61	android/database/sqlite/SQLiteException
    //   41	49	61	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final java.util.Map P0(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 360	R2/C5:u	()V
    //   4: aload_0
    //   5: invokevirtual 357	R2/m3:n	()V
    //   8: aload_1
    //   9: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: new 961	t/a
    //   16: dup
    //   17: invokespecial 962	t/a:<init>	()V
    //   20: astore_2
    //   21: aload_0
    //   22: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: astore_3
    //   26: aconst_null
    //   27: astore 4
    //   29: aconst_null
    //   30: astore 5
    //   32: aload_3
    //   33: ldc_w 1155
    //   36: iconst_2
    //   37: anewarray 23	java/lang/String
    //   40: dup
    //   41: iconst_0
    //   42: aload_1
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: aload_1
    //   47: aastore
    //   48: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore_3
    //   52: aload_3
    //   53: astore 5
    //   55: aload_3
    //   56: astore 4
    //   58: aload_3
    //   59: invokeinterface 398 1 0
    //   64: ifne +31 -> 95
    //   67: aload_3
    //   68: astore 5
    //   70: aload_3
    //   71: astore 4
    //   73: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   76: astore 6
    //   78: aload_3
    //   79: invokeinterface 401 1 0
    //   84: aload 6
    //   86: areturn
    //   87: astore_1
    //   88: goto +190 -> 278
    //   91: astore_3
    //   92: goto +142 -> 234
    //   95: aload_3
    //   96: astore 5
    //   98: aload_3
    //   99: astore 4
    //   101: aload_3
    //   102: iconst_0
    //   103: invokeinterface 292 2 0
    //   108: istore 7
    //   110: aload_3
    //   111: astore 5
    //   113: aload_3
    //   114: astore 4
    //   116: aload_2
    //   117: iload 7
    //   119: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   122: invokeinterface 993 2 0
    //   127: checkcast 534	java/util/List
    //   130: astore 8
    //   132: aload 8
    //   134: astore 6
    //   136: aload 8
    //   138: ifnonnull +45 -> 183
    //   141: aload_3
    //   142: astore 5
    //   144: aload_3
    //   145: astore 4
    //   147: new 607	java/util/ArrayList
    //   150: astore 6
    //   152: aload_3
    //   153: astore 5
    //   155: aload_3
    //   156: astore 4
    //   158: aload 6
    //   160: invokespecial 994	java/util/ArrayList:<init>	()V
    //   163: aload_3
    //   164: astore 5
    //   166: aload_3
    //   167: astore 4
    //   169: aload_2
    //   170: iload 7
    //   172: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   175: aload 6
    //   177: invokeinterface 997 3 0
    //   182: pop
    //   183: aload_3
    //   184: astore 5
    //   186: aload_3
    //   187: astore 4
    //   189: aload 6
    //   191: aload_3
    //   192: iconst_1
    //   193: invokeinterface 292 2 0
    //   198: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   201: invokeinterface 1001 2 0
    //   206: pop
    //   207: aload_3
    //   208: astore 5
    //   210: aload_3
    //   211: astore 4
    //   213: aload_3
    //   214: invokeinterface 445 1 0
    //   219: istore 9
    //   221: iload 9
    //   223: ifne -128 -> 95
    //   226: aload_3
    //   227: invokeinterface 401 1 0
    //   232: aload_2
    //   233: areturn
    //   234: aload 4
    //   236: astore 5
    //   238: aload_0
    //   239: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   242: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   245: ldc_w 1157
    //   248: aload_1
    //   249: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   252: aload_3
    //   253: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   256: aload 4
    //   258: astore 5
    //   260: invokestatic 976	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   263: astore_1
    //   264: aload 4
    //   266: ifnull +10 -> 276
    //   269: aload 4
    //   271: invokeinterface 401 1 0
    //   276: aload_1
    //   277: areturn
    //   278: aload 5
    //   280: ifnull +10 -> 290
    //   283: aload 5
    //   285: invokeinterface 401 1 0
    //   290: aload_1
    //   291: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	this	p
    //   0	292	1	paramString	String
    //   20	213	2	locala	t.a
    //   25	54	3	localObject1	Object
    //   91	162	3	localSQLiteException	SQLiteException
    //   27	243	4	localObject2	Object
    //   30	254	5	localObject3	Object
    //   76	114	6	localObject4	Object
    //   108	63	7	i1	int
    //   130	7	8	localList	List
    //   219	3	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   32	52	87	finally
    //   58	67	87	finally
    //   73	78	87	finally
    //   101	110	87	finally
    //   116	132	87	finally
    //   147	152	87	finally
    //   158	163	87	finally
    //   169	183	87	finally
    //   189	207	87	finally
    //   213	221	87	finally
    //   238	256	87	finally
    //   260	264	87	finally
    //   32	52	91	android/database/sqlite/SQLiteException
    //   58	67	91	android/database/sqlite/SQLiteException
    //   73	78	91	android/database/sqlite/SQLiteException
    //   101	110	91	android/database/sqlite/SQLiteException
    //   116	132	91	android/database/sqlite/SQLiteException
    //   147	152	91	android/database/sqlite/SQLiteException
    //   158	163	91	android/database/sqlite/SQLiteException
    //   169	183	91	android/database/sqlite/SQLiteException
    //   189	207	91	android/database/sqlite/SQLiteException
    //   213	221	91	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final List Q(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 357	R2/m3:n	()V
    //   4: aload_0
    //   5: invokevirtual 360	R2/C5:u	()V
    //   8: iload_2
    //   9: ifle +9 -> 18
    //   12: iconst_1
    //   13: istore 4
    //   15: goto +6 -> 21
    //   18: iconst_0
    //   19: istore 4
    //   21: iload 4
    //   23: invokestatic 1161	A2/n:a	(Z)V
    //   26: iload_3
    //   27: ifle +9 -> 36
    //   30: iconst_1
    //   31: istore 4
    //   33: goto +6 -> 39
    //   36: iconst_0
    //   37: istore 4
    //   39: iload 4
    //   41: invokestatic 1161	A2/n:a	(Z)V
    //   44: aload_1
    //   45: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   48: pop
    //   49: aconst_null
    //   50: astore 5
    //   52: aconst_null
    //   53: astore 6
    //   55: aload_0
    //   56: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   59: ldc_w 1163
    //   62: iconst_3
    //   63: anewarray 23	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: ldc_w 1056
    //   71: aastore
    //   72: dup
    //   73: iconst_1
    //   74: ldc_w 968
    //   77: aastore
    //   78: dup
    //   79: iconst_2
    //   80: ldc -43
    //   82: aastore
    //   83: ldc_w 677
    //   86: iconst_1
    //   87: anewarray 23	java/lang/String
    //   90: dup
    //   91: iconst_0
    //   92: aload_1
    //   93: aastore
    //   94: aconst_null
    //   95: aconst_null
    //   96: ldc_w 1056
    //   99: iload_2
    //   100: invokestatic 902	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   103: invokevirtual 1059	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   106: astore 7
    //   108: aload 7
    //   110: astore 6
    //   112: aload 7
    //   114: astore 5
    //   116: aload 7
    //   118: invokeinterface 398 1 0
    //   123: ifne +35 -> 158
    //   126: aload 7
    //   128: astore 6
    //   130: aload 7
    //   132: astore 5
    //   134: invokestatic 1069	java/util/Collections:emptyList	()Ljava/util/List;
    //   137: astore 8
    //   139: aload 7
    //   141: invokeinterface 401 1 0
    //   146: aload 8
    //   148: areturn
    //   149: astore_1
    //   150: goto +849 -> 999
    //   153: astore 7
    //   155: goto +799 -> 954
    //   158: aload 7
    //   160: astore 6
    //   162: aload 7
    //   164: astore 5
    //   166: new 607	java/util/ArrayList
    //   169: astore 9
    //   171: aload 7
    //   173: astore 6
    //   175: aload 7
    //   177: astore 5
    //   179: aload 9
    //   181: invokespecial 994	java/util/ArrayList:<init>	()V
    //   184: iconst_0
    //   185: istore_2
    //   186: aload 7
    //   188: astore 6
    //   190: aload 7
    //   192: astore 5
    //   194: aload 7
    //   196: iconst_0
    //   197: invokeinterface 411 2 0
    //   202: lstore 10
    //   204: aload 7
    //   206: astore 6
    //   208: aload 7
    //   210: astore 5
    //   212: aload 7
    //   214: iconst_1
    //   215: invokeinterface 420 2 0
    //   220: astore 8
    //   222: aload 7
    //   224: astore 6
    //   226: aload 7
    //   228: astore 5
    //   230: aload_0
    //   231: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   234: aload 8
    //   236: invokevirtual 1166	R2/N5:i0	([B)[B
    //   239: astore 8
    //   241: aload 7
    //   243: astore 6
    //   245: aload 7
    //   247: astore 5
    //   249: aload 9
    //   251: invokeinterface 1169 1 0
    //   256: ifne +24 -> 280
    //   259: aload 7
    //   261: astore 6
    //   263: aload 7
    //   265: astore 5
    //   267: aload 8
    //   269: arraylength
    //   270: istore 12
    //   272: iload 12
    //   274: iload_2
    //   275: iadd
    //   276: iload_3
    //   277: if_icmpgt +667 -> 944
    //   280: aload 7
    //   282: astore 6
    //   284: aload 7
    //   286: astore 5
    //   288: invokestatic 1173	com/google/android/gms/internal/measurement/d2:A3	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   291: aload 8
    //   293: invokestatic 514	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   296: checkcast 1175	com/google/android/gms/internal/measurement/d2$a
    //   299: astore 13
    //   301: aload 7
    //   303: astore 6
    //   305: aload 7
    //   307: astore 5
    //   309: invokestatic 824	com/google/android/gms/internal/measurement/n6:a	()Z
    //   312: ifeq +405 -> 717
    //   315: aload 7
    //   317: astore 6
    //   319: aload 7
    //   321: astore 5
    //   323: aload_0
    //   324: invokevirtual 770	R2/m3:f	()LR2/g;
    //   327: getstatic 1178	R2/K:X0	LR2/P1;
    //   330: invokevirtual 788	R2/g:s	(LR2/P1;)Z
    //   333: ifeq +384 -> 717
    //   336: aload 7
    //   338: astore 6
    //   340: aload 7
    //   342: astore 5
    //   344: aload 9
    //   346: invokeinterface 1169 1 0
    //   351: ifne +366 -> 717
    //   354: aload 7
    //   356: astore 6
    //   358: aload 7
    //   360: astore 5
    //   362: aload 9
    //   364: iconst_0
    //   365: invokeinterface 1181 2 0
    //   370: checkcast 1079	android/util/Pair
    //   373: getfield 1185	android/util/Pair:first	Ljava/lang/Object;
    //   376: checkcast 839	com/google/android/gms/internal/measurement/d2
    //   379: astore 14
    //   381: aload 7
    //   383: astore 6
    //   385: aload 7
    //   387: astore 5
    //   389: aload 13
    //   391: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   394: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   397: checkcast 839	com/google/android/gms/internal/measurement/d2
    //   400: astore 15
    //   402: aload 7
    //   404: astore 6
    //   406: aload 7
    //   408: astore 5
    //   410: aload 14
    //   412: invokevirtual 1187	com/google/android/gms/internal/measurement/d2:f0	()Ljava/lang/String;
    //   415: aload 15
    //   417: invokevirtual 1187	com/google/android/gms/internal/measurement/d2:f0	()Ljava/lang/String;
    //   420: invokevirtual 1190	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   423: ifeq +521 -> 944
    //   426: aload 7
    //   428: astore 6
    //   430: aload 7
    //   432: astore 5
    //   434: aload 14
    //   436: invokevirtual 1193	com/google/android/gms/internal/measurement/d2:e0	()Ljava/lang/String;
    //   439: aload 15
    //   441: invokevirtual 1193	com/google/android/gms/internal/measurement/d2:e0	()Ljava/lang/String;
    //   444: invokevirtual 1190	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   447: ifeq +497 -> 944
    //   450: aload 7
    //   452: astore 6
    //   454: aload 7
    //   456: astore 5
    //   458: aload 14
    //   460: invokevirtual 1196	com/google/android/gms/internal/measurement/d2:v0	()Z
    //   463: aload 15
    //   465: invokevirtual 1196	com/google/android/gms/internal/measurement/d2:v0	()Z
    //   468: if_icmpne +476 -> 944
    //   471: aload 7
    //   473: astore 6
    //   475: aload 7
    //   477: astore 5
    //   479: aload 14
    //   481: invokevirtual 1198	com/google/android/gms/internal/measurement/d2:g0	()Ljava/lang/String;
    //   484: aload 15
    //   486: invokevirtual 1198	com/google/android/gms/internal/measurement/d2:g0	()Ljava/lang/String;
    //   489: invokevirtual 1190	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   492: ifeq +452 -> 944
    //   495: aload 7
    //   497: astore 6
    //   499: aload 7
    //   501: astore 5
    //   503: aload 14
    //   505: invokevirtual 1200	com/google/android/gms/internal/measurement/d2:t0	()Ljava/util/List;
    //   508: invokeinterface 538 1 0
    //   513: astore 16
    //   515: aload 7
    //   517: astore 6
    //   519: aload 7
    //   521: astore 5
    //   523: aload 16
    //   525: invokeinterface 543 1 0
    //   530: istore 4
    //   532: ldc2_w 1201
    //   535: lstore 17
    //   537: iload 4
    //   539: ifeq +66 -> 605
    //   542: aload 7
    //   544: astore 6
    //   546: aload 7
    //   548: astore 5
    //   550: aload 16
    //   552: invokeinterface 547 1 0
    //   557: checkcast 1204	com/google/android/gms/internal/measurement/h2
    //   560: astore 14
    //   562: aload 7
    //   564: astore 6
    //   566: aload 7
    //   568: astore 5
    //   570: ldc_w 1206
    //   573: aload 14
    //   575: invokevirtual 1208	com/google/android/gms/internal/measurement/h2:Z	()Ljava/lang/String;
    //   578: invokevirtual 1190	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   581: ifeq +21 -> 602
    //   584: aload 7
    //   586: astore 6
    //   588: aload 7
    //   590: astore 5
    //   592: aload 14
    //   594: invokevirtual 1210	com/google/android/gms/internal/measurement/h2:U	()J
    //   597: lstore 19
    //   599: goto +11 -> 610
    //   602: goto -87 -> 515
    //   605: ldc2_w 1201
    //   608: lstore 19
    //   610: aload 7
    //   612: astore 6
    //   614: aload 7
    //   616: astore 5
    //   618: aload 15
    //   620: invokevirtual 1200	com/google/android/gms/internal/measurement/d2:t0	()Ljava/util/List;
    //   623: invokeinterface 538 1 0
    //   628: astore 15
    //   630: aload 7
    //   632: astore 6
    //   634: aload 7
    //   636: astore 5
    //   638: lload 17
    //   640: lstore 21
    //   642: aload 15
    //   644: invokeinterface 543 1 0
    //   649: ifeq +60 -> 709
    //   652: aload 7
    //   654: astore 6
    //   656: aload 7
    //   658: astore 5
    //   660: aload 15
    //   662: invokeinterface 547 1 0
    //   667: checkcast 1204	com/google/android/gms/internal/measurement/h2
    //   670: astore 14
    //   672: aload 7
    //   674: astore 6
    //   676: aload 7
    //   678: astore 5
    //   680: ldc_w 1206
    //   683: aload 14
    //   685: invokevirtual 1208	com/google/android/gms/internal/measurement/h2:Z	()Ljava/lang/String;
    //   688: invokevirtual 1190	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   691: ifeq -61 -> 630
    //   694: aload 7
    //   696: astore 6
    //   698: aload 7
    //   700: astore 5
    //   702: aload 14
    //   704: invokevirtual 1210	com/google/android/gms/internal/measurement/h2:U	()J
    //   707: lstore 21
    //   709: lload 19
    //   711: lload 21
    //   713: lcmp
    //   714: ifne +230 -> 944
    //   717: aload 7
    //   719: astore 6
    //   721: aload 7
    //   723: astore 5
    //   725: aload 7
    //   727: iconst_2
    //   728: invokeinterface 633 2 0
    //   733: ifne +25 -> 758
    //   736: aload 7
    //   738: astore 6
    //   740: aload 7
    //   742: astore 5
    //   744: aload 13
    //   746: aload 7
    //   748: iconst_2
    //   749: invokeinterface 292 2 0
    //   754: invokevirtual 1213	com/google/android/gms/internal/measurement/d2$a:q0	(I)Lcom/google/android/gms/internal/measurement/d2$a;
    //   757: pop
    //   758: aload 7
    //   760: astore 6
    //   762: aload 7
    //   764: astore 5
    //   766: iload_2
    //   767: aload 8
    //   769: arraylength
    //   770: iadd
    //   771: istore_2
    //   772: aload 7
    //   774: astore 6
    //   776: aload 7
    //   778: astore 5
    //   780: aload 9
    //   782: aload 13
    //   784: invokevirtual 522	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   787: checkcast 524	com/google/android/gms/internal/measurement/Y3
    //   790: checkcast 839	com/google/android/gms/internal/measurement/d2
    //   793: lload 10
    //   795: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   798: invokestatic 1083	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   801: invokeinterface 1001 2 0
    //   806: pop
    //   807: goto +104 -> 911
    //   810: astore 8
    //   812: aload 7
    //   814: astore 6
    //   816: aload 7
    //   818: astore 5
    //   820: aload_0
    //   821: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   824: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   827: astore 15
    //   829: ldc_w 1215
    //   832: astore 14
    //   834: aload 7
    //   836: astore 6
    //   838: aload 7
    //   840: astore 5
    //   842: aload_1
    //   843: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   846: astore 13
    //   848: aload 7
    //   850: astore 6
    //   852: aload 7
    //   854: astore 5
    //   856: aload 15
    //   858: aload 14
    //   860: aload 13
    //   862: aload 8
    //   864: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   867: goto +44 -> 911
    //   870: astore 8
    //   872: aload 7
    //   874: astore 6
    //   876: aload 7
    //   878: astore 5
    //   880: aload_0
    //   881: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   884: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   887: astore 15
    //   889: ldc_w 1217
    //   892: astore 14
    //   894: aload 7
    //   896: astore 6
    //   898: aload 7
    //   900: astore 5
    //   902: aload_1
    //   903: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   906: astore 13
    //   908: goto -60 -> 848
    //   911: aload 7
    //   913: astore 6
    //   915: aload 7
    //   917: astore 5
    //   919: aload 7
    //   921: invokeinterface 445 1 0
    //   926: istore 4
    //   928: iload 4
    //   930: ifeq +14 -> 944
    //   933: iload_2
    //   934: iload_3
    //   935: if_icmple +6 -> 941
    //   938: goto +6 -> 944
    //   941: goto -755 -> 186
    //   944: aload 7
    //   946: invokeinterface 401 1 0
    //   951: aload 9
    //   953: areturn
    //   954: aload 5
    //   956: astore 6
    //   958: aload_0
    //   959: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   962: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   965: ldc_w 1219
    //   968: aload_1
    //   969: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   972: aload 7
    //   974: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   977: aload 5
    //   979: astore 6
    //   981: invokestatic 1069	java/util/Collections:emptyList	()Ljava/util/List;
    //   984: astore_1
    //   985: aload 5
    //   987: ifnull +10 -> 997
    //   990: aload 5
    //   992: invokeinterface 401 1 0
    //   997: aload_1
    //   998: areturn
    //   999: aload 6
    //   1001: ifnull +10 -> 1011
    //   1004: aload 6
    //   1006: invokeinterface 401 1 0
    //   1011: aload_1
    //   1012: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1013	0	this	p
    //   0	1013	1	paramString	String
    //   0	1013	2	paramInt1	int
    //   0	1013	3	paramInt2	int
    //   13	916	4	bool	boolean
    //   50	941	5	localObject1	Object
    //   53	952	6	localObject2	Object
    //   106	34	7	localCursor	Cursor
    //   153	820	7	localSQLiteException	SQLiteException
    //   137	631	8	localObject3	Object
    //   810	53	8	localIOException1	IOException
    //   870	1	8	localIOException2	IOException
    //   169	783	9	localArrayList	ArrayList
    //   202	592	10	l1	long
    //   270	6	12	i1	int
    //   299	608	13	localObject4	Object
    //   379	514	14	localObject5	Object
    //   400	488	15	localObject6	Object
    //   513	38	16	localIterator	Iterator
    //   535	104	17	l2	long
    //   597	113	19	l3	long
    //   640	72	21	l4	long
    // Exception table:
    //   from	to	target	type
    //   55	108	149	finally
    //   116	126	149	finally
    //   134	139	149	finally
    //   166	171	149	finally
    //   179	184	149	finally
    //   194	204	149	finally
    //   212	222	149	finally
    //   230	241	149	finally
    //   249	259	149	finally
    //   267	272	149	finally
    //   288	301	149	finally
    //   309	315	149	finally
    //   323	336	149	finally
    //   344	354	149	finally
    //   362	381	149	finally
    //   389	402	149	finally
    //   410	426	149	finally
    //   434	450	149	finally
    //   458	471	149	finally
    //   479	495	149	finally
    //   503	515	149	finally
    //   523	532	149	finally
    //   550	562	149	finally
    //   570	584	149	finally
    //   592	599	149	finally
    //   618	630	149	finally
    //   642	652	149	finally
    //   660	672	149	finally
    //   680	694	149	finally
    //   702	709	149	finally
    //   725	736	149	finally
    //   744	758	149	finally
    //   766	772	149	finally
    //   780	807	149	finally
    //   820	829	149	finally
    //   842	848	149	finally
    //   856	867	149	finally
    //   880	889	149	finally
    //   902	908	149	finally
    //   919	928	149	finally
    //   958	977	149	finally
    //   981	985	149	finally
    //   55	108	153	android/database/sqlite/SQLiteException
    //   116	126	153	android/database/sqlite/SQLiteException
    //   134	139	153	android/database/sqlite/SQLiteException
    //   166	171	153	android/database/sqlite/SQLiteException
    //   179	184	153	android/database/sqlite/SQLiteException
    //   194	204	153	android/database/sqlite/SQLiteException
    //   212	222	153	android/database/sqlite/SQLiteException
    //   230	241	153	android/database/sqlite/SQLiteException
    //   249	259	153	android/database/sqlite/SQLiteException
    //   267	272	153	android/database/sqlite/SQLiteException
    //   288	301	153	android/database/sqlite/SQLiteException
    //   309	315	153	android/database/sqlite/SQLiteException
    //   323	336	153	android/database/sqlite/SQLiteException
    //   344	354	153	android/database/sqlite/SQLiteException
    //   362	381	153	android/database/sqlite/SQLiteException
    //   389	402	153	android/database/sqlite/SQLiteException
    //   410	426	153	android/database/sqlite/SQLiteException
    //   434	450	153	android/database/sqlite/SQLiteException
    //   458	471	153	android/database/sqlite/SQLiteException
    //   479	495	153	android/database/sqlite/SQLiteException
    //   503	515	153	android/database/sqlite/SQLiteException
    //   523	532	153	android/database/sqlite/SQLiteException
    //   550	562	153	android/database/sqlite/SQLiteException
    //   570	584	153	android/database/sqlite/SQLiteException
    //   592	599	153	android/database/sqlite/SQLiteException
    //   618	630	153	android/database/sqlite/SQLiteException
    //   642	652	153	android/database/sqlite/SQLiteException
    //   660	672	153	android/database/sqlite/SQLiteException
    //   680	694	153	android/database/sqlite/SQLiteException
    //   702	709	153	android/database/sqlite/SQLiteException
    //   725	736	153	android/database/sqlite/SQLiteException
    //   744	758	153	android/database/sqlite/SQLiteException
    //   766	772	153	android/database/sqlite/SQLiteException
    //   780	807	153	android/database/sqlite/SQLiteException
    //   820	829	153	android/database/sqlite/SQLiteException
    //   842	848	153	android/database/sqlite/SQLiteException
    //   856	867	153	android/database/sqlite/SQLiteException
    //   880	889	153	android/database/sqlite/SQLiteException
    //   902	908	153	android/database/sqlite/SQLiteException
    //   919	928	153	android/database/sqlite/SQLiteException
    //   288	301	810	java/io/IOException
    //   212	222	870	java/io/IOException
    //   230	241	870	java/io/IOException
  }
  
  public final void Q0()
  {
    u();
    B().beginTransaction();
  }
  
  public final List R(String paramString1, String paramString2, String paramString3)
  {
    n.e(paramString1);
    n();
    u();
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
    return S(paramString1.toString(), paramString2);
  }
  
  public final void R0()
  {
    u();
    B().endTransaction();
  }
  
  /* Error */
  public final List S(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 357	R2/m3:n	()V
    //   4: aload_0
    //   5: invokevirtual 360	R2/C5:u	()V
    //   8: new 607	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 994	java/util/ArrayList:<init>	()V
    //   15: astore_3
    //   16: aload_0
    //   17: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   20: ldc_w 366
    //   23: bipush 13
    //   25: anewarray 23	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: ldc_w 853
    //   33: aastore
    //   34: dup
    //   35: iconst_1
    //   36: ldc 51
    //   38: aastore
    //   39: dup
    //   40: iconst_2
    //   41: ldc_w 1108
    //   44: aastore
    //   45: dup
    //   46: iconst_3
    //   47: ldc_w 368
    //   50: aastore
    //   51: dup
    //   52: iconst_4
    //   53: ldc_w 370
    //   56: aastore
    //   57: dup
    //   58: iconst_5
    //   59: ldc_w 372
    //   62: aastore
    //   63: dup
    //   64: bipush 6
    //   66: ldc_w 374
    //   69: aastore
    //   70: dup
    //   71: bipush 7
    //   73: ldc_w 376
    //   76: aastore
    //   77: dup
    //   78: bipush 8
    //   80: ldc_w 378
    //   83: aastore
    //   84: dup
    //   85: bipush 9
    //   87: ldc_w 380
    //   90: aastore
    //   91: dup
    //   92: bipush 10
    //   94: ldc_w 382
    //   97: aastore
    //   98: dup
    //   99: bipush 11
    //   101: ldc_w 384
    //   104: aastore
    //   105: dup
    //   106: bipush 12
    //   108: ldc_w 386
    //   111: aastore
    //   112: aload_1
    //   113: aload_2
    //   114: aconst_null
    //   115: aconst_null
    //   116: ldc_w 1056
    //   119: ldc_w 1262
    //   122: invokevirtual 1059	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   125: astore_1
    //   126: aload_1
    //   127: invokeinterface 398 1 0
    //   132: istore 4
    //   134: iload 4
    //   136: ifne +11 -> 147
    //   139: aload_1
    //   140: invokeinterface 401 1 0
    //   145: aload_3
    //   146: areturn
    //   147: aload_3
    //   148: invokeinterface 1252 1 0
    //   153: sipush 1000
    //   156: if_icmplt +37 -> 193
    //   159: aload_0
    //   160: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   163: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   166: ldc_w 1264
    //   169: sipush 1000
    //   172: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   175: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   178: goto +266 -> 444
    //   181: astore_3
    //   182: aload_1
    //   183: astore_2
    //   184: aload_3
    //   185: astore_1
    //   186: goto +313 -> 499
    //   189: astore_2
    //   190: goto +274 -> 464
    //   193: aload_1
    //   194: iconst_0
    //   195: invokeinterface 288 2 0
    //   200: astore 5
    //   202: aload_1
    //   203: iconst_1
    //   204: invokeinterface 288 2 0
    //   209: astore_2
    //   210: aload_1
    //   211: iconst_2
    //   212: invokeinterface 288 2 0
    //   217: astore 6
    //   219: aload_0
    //   220: aload_1
    //   221: iconst_3
    //   222: invokevirtual 407	R2/p:M	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   225: astore 7
    //   227: aload_1
    //   228: iconst_4
    //   229: invokeinterface 292 2 0
    //   234: ifeq +9 -> 243
    //   237: iconst_1
    //   238: istore 4
    //   240: goto +6 -> 246
    //   243: iconst_0
    //   244: istore 4
    //   246: aload_1
    //   247: iconst_5
    //   248: invokeinterface 288 2 0
    //   253: astore 8
    //   255: aload_1
    //   256: bipush 6
    //   258: invokeinterface 411 2 0
    //   263: lstore 9
    //   265: aload_0
    //   266: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   269: astore 11
    //   271: aload_1
    //   272: bipush 7
    //   274: invokeinterface 420 2 0
    //   279: astore 12
    //   281: getstatic 426	R2/I:CREATOR	Landroid/os/Parcelable$Creator;
    //   284: astore 13
    //   286: aload 11
    //   288: aload 12
    //   290: aload 13
    //   292: invokevirtual 432	R2/N5:E	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   295: checkcast 422	R2/I
    //   298: astore 12
    //   300: aload_1
    //   301: bipush 8
    //   303: invokeinterface 411 2 0
    //   308: lstore 14
    //   310: aload_0
    //   311: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   314: aload_1
    //   315: bipush 9
    //   317: invokeinterface 420 2 0
    //   322: aload 13
    //   324: invokevirtual 432	R2/N5:E	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   327: checkcast 422	R2/I
    //   330: astore 11
    //   332: aload_1
    //   333: bipush 10
    //   335: invokeinterface 411 2 0
    //   340: lstore 16
    //   342: aload_1
    //   343: bipush 11
    //   345: invokeinterface 411 2 0
    //   350: lstore 18
    //   352: aload_0
    //   353: invokevirtual 416	R2/z5:o	()LR2/N5;
    //   356: aload_1
    //   357: bipush 12
    //   359: invokeinterface 420 2 0
    //   364: aload 13
    //   366: invokevirtual 432	R2/N5:E	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   369: checkcast 422	R2/I
    //   372: astore 13
    //   374: new 434	R2/R5
    //   377: astore 20
    //   379: aload 20
    //   381: aload 6
    //   383: lload 16
    //   385: aload 7
    //   387: aload_2
    //   388: invokespecial 437	R2/R5:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   391: new 439	R2/e
    //   394: astore 6
    //   396: aload 6
    //   398: aload 5
    //   400: aload_2
    //   401: aload 20
    //   403: lload 14
    //   405: iload 4
    //   407: aload 8
    //   409: aload 12
    //   411: lload 9
    //   413: aload 11
    //   415: lload 18
    //   417: aload 13
    //   419: invokespecial 442	R2/e:<init>	(Ljava/lang/String;Ljava/lang/String;LR2/R5;JZLjava/lang/String;LR2/I;JLR2/I;JLR2/I;)V
    //   422: aload_3
    //   423: aload 6
    //   425: invokeinterface 1001 2 0
    //   430: pop
    //   431: aload_1
    //   432: invokeinterface 445 1 0
    //   437: istore 4
    //   439: iload 4
    //   441: ifne +11 -> 452
    //   444: aload_1
    //   445: invokeinterface 401 1 0
    //   450: aload_3
    //   451: areturn
    //   452: goto -305 -> 147
    //   455: astore_1
    //   456: aconst_null
    //   457: astore_2
    //   458: goto +41 -> 499
    //   461: astore_2
    //   462: aconst_null
    //   463: astore_1
    //   464: aload_0
    //   465: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   468: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   471: ldc_w 1266
    //   474: aload_2
    //   475: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   478: invokestatic 1069	java/util/Collections:emptyList	()Ljava/util/List;
    //   481: astore_2
    //   482: aload_1
    //   483: ifnull +9 -> 492
    //   486: aload_1
    //   487: invokeinterface 401 1 0
    //   492: aload_2
    //   493: areturn
    //   494: astore_3
    //   495: aload_1
    //   496: astore_2
    //   497: aload_3
    //   498: astore_1
    //   499: aload_2
    //   500: ifnull +9 -> 509
    //   503: aload_2
    //   504: invokeinterface 401 1 0
    //   509: aload_1
    //   510: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	511	0	this	p
    //   0	511	1	paramString	String
    //   0	511	2	paramArrayOfString	String[]
    //   15	133	3	localArrayList	ArrayList
    //   181	270	3	localList	List
    //   494	4	3	localObject1	Object
    //   132	308	4	bool	boolean
    //   200	199	5	str1	String
    //   217	207	6	localObject2	Object
    //   225	161	7	localObject3	Object
    //   253	155	8	str2	String
    //   263	149	9	l1	long
    //   269	145	11	localObject4	Object
    //   279	131	12	localObject5	Object
    //   284	134	13	localObject6	Object
    //   308	96	14	l2	long
    //   340	44	16	l3	long
    //   350	66	18	l4	long
    //   377	25	20	localR5	R5
    // Exception table:
    //   from	to	target	type
    //   126	134	181	finally
    //   147	178	181	finally
    //   193	237	181	finally
    //   246	439	181	finally
    //   126	134	189	android/database/sqlite/SQLiteException
    //   147	178	189	android/database/sqlite/SQLiteException
    //   193	237	189	android/database/sqlite/SQLiteException
    //   246	439	189	android/database/sqlite/SQLiteException
    //   16	126	455	finally
    //   16	126	461	android/database/sqlite/SQLiteException
    //   464	482	494	finally
  }
  
  public final void S0()
  {
    n();
    u();
    if (!u0()) {
      return;
    }
    long l1 = se.a();
    long l2 = b().b();
    if (Math.abs(l2 - l1) > ((Long)K.A.a(null)).longValue())
    {
      se.b(l2);
      n();
      u();
      if (u0())
      {
        int i1 = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(b().a()), String.valueOf(g.M()) });
        if (i1 > 0) {
          j().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(i1));
        }
      }
    }
  }
  
  public final void T(E paramE)
  {
    n.i(paramE);
    n();
    u();
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
      if (B().insertWithOnConflict("events", null, localContentValues, 5) == -1L) {
        j().G().b("Failed to insert/update event aggregates (got -1). appId", Y1.v(a));
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      break label222;
    }
    return;
    label222:
    j().G().c("Error storing event aggregates. appId", Y1.v(a), localSQLiteException);
  }
  
  public final void T0()
  {
    u();
    B().setTransactionSuccessful();
  }
  
  public final void U(I2 paramI2)
  {
    n.i(paramI2);
    n();
    u();
    String str = paramI2.t0();
    n.i(str);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", str);
    localContentValues.put("app_instance_id", paramI2.u0());
    localContentValues.put("gmp_app_id", paramI2.j());
    localContentValues.put("resettable_device_id_hash", paramI2.l());
    localContentValues.put("last_bundle_index", Long.valueOf(paramI2.k0()));
    localContentValues.put("last_bundle_start_timestamp", Long.valueOf(paramI2.m0()));
    localContentValues.put("last_bundle_end_timestamp", Long.valueOf(paramI2.i0()));
    localContentValues.put("app_version", paramI2.h());
    localContentValues.put("app_store", paramI2.v0());
    localContentValues.put("gmp_version", Long.valueOf(paramI2.g0()));
    localContentValues.put("dev_cert_hash", Long.valueOf(paramI2.a0()));
    localContentValues.put("measurement_enabled", Boolean.valueOf(paramI2.r()));
    localContentValues.put("day", Long.valueOf(paramI2.Y()));
    localContentValues.put("daily_public_events_count", Long.valueOf(paramI2.T()));
    localContentValues.put("daily_events_count", Long.valueOf(paramI2.Q()));
    localContentValues.put("daily_conversions_count", Long.valueOf(paramI2.K()));
    localContentValues.put("config_fetched_time", Long.valueOf(paramI2.H()));
    localContentValues.put("failed_config_fetch_time", Long.valueOf(paramI2.e0()));
    localContentValues.put("app_version_int", Long.valueOf(paramI2.z()));
    localContentValues.put("firebase_instance_id", paramI2.i());
    localContentValues.put("daily_error_events_count", Long.valueOf(paramI2.N()));
    localContentValues.put("daily_realtime_events_count", Long.valueOf(paramI2.W()));
    localContentValues.put("health_monitor_sample", paramI2.k());
    localContentValues.put("android_id", Long.valueOf(paramI2.v()));
    localContentValues.put("adid_reporting_enabled", Boolean.valueOf(paramI2.q()));
    localContentValues.put("admob_app_id", paramI2.r0());
    localContentValues.put("dynamite_version", Long.valueOf(paramI2.c0()));
    localContentValues.put("session_stitching_token", paramI2.m());
    localContentValues.put("sgtm_upload_enabled", Boolean.valueOf(paramI2.t()));
    localContentValues.put("target_os_version", Long.valueOf(paramI2.p0()));
    localContentValues.put("session_stitching_token_hash", Long.valueOf(paramI2.o0()));
    if ((g7.a()) && (f().B(str, K.L0)))
    {
      localContentValues.put("ad_services_version", Integer.valueOf(paramI2.a()));
      localContentValues.put("attribution_eligibility_status", Long.valueOf(paramI2.D()));
    }
    if ((i6.a()) && (f().B(str, K.Y0))) {
      localContentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(paramI2.u()));
    }
    List localList = paramI2.n();
    if (localList != null) {
      if (localList.isEmpty()) {
        j().L().b("Safelisted events should not be an empty list. appId", str);
      } else {
        localContentValues.put("safelisted_events", TextUtils.join(",", localList));
      }
    }
    if ((o6.a()) && (f().s(K.u0)) && (!localContentValues.containsKey("safelisted_events"))) {
      localContentValues.put("safelisted_events", null);
    }
    if ((n6.a()) && (f().B(str, K.T0))) {
      localContentValues.put("npa_metadata_value", paramI2.q0());
    }
    try
    {
      paramI2 = B();
      if ((paramI2.update("apps", localContentValues, "app_id = ?", new String[] { str }) == 0L) && (paramI2.insertWithOnConflict("apps", null, localContentValues, 5) == -1L)) {
        j().G().b("Failed to insert/update app (got -1). appId", Y1.v(str));
      }
    }
    catch (SQLiteException paramI2)
    {
      break label675;
    }
    return;
    label675:
    j().G().c("Error storing app. appId", Y1.v(str), paramI2);
  }
  
  public final boolean U0()
  {
    return x0("select count(1) > 0 from raw_events", null) != 0L;
  }
  
  public final boolean V0()
  {
    return x0("select count(1) > 0 from queue where has_realtime = 1", null) != 0L;
  }
  
  public final void W(String paramString, z paramz)
  {
    if ((n6.a()) && (f().s(K.T0)))
    {
      n.i(paramString);
      n.i(paramz);
      n();
      u();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("app_id", paramString);
      localContentValues.put("dma_consent_settings", paramz.i());
      Y("consent_settings", "app_id", localContentValues);
    }
  }
  
  public final boolean W0()
  {
    return x0("select count(1) > 0 from raw_events where realtime = 1", null) != 0L;
  }
  
  public final void X(String paramString, q3 paramq3)
  {
    n.i(paramString);
    n.i(paramq3);
    n();
    u();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramString);
    localContentValues.put("consent_state", paramq3.v());
    if ((n6.a()) && (f().s(K.T0)))
    {
      localContentValues.put("consent_source", Integer.valueOf(paramq3.b()));
      Y("consent_settings", "app_id", localContentValues);
      return;
    }
    try
    {
      if (B().insertWithOnConflict("consent_settings", null, localContentValues, 5) == -1L) {
        j().G().b("Failed to insert/update consent setting (got -1). appId", Y1.v(paramString));
      }
    }
    catch (SQLiteException paramq3)
    {
      break label134;
    }
    return;
    label134:
    j().G().c("Error storing consent setting. appId, error", Y1.v(paramString), paramq3);
  }
  
  public final void Y(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    try
    {
      localSQLiteDatabase = B();
      str = paramContentValues.getAsString(paramString2);
      if (str == null)
      {
        j().H().b("Value of the primary key is not set.", Y1.v(paramString2));
        return;
      }
    }
    catch (SQLiteException paramContentValues)
    {
      SQLiteDatabase localSQLiteDatabase;
      String str;
      break label131;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(paramString2);
      localStringBuilder.append(" = ?");
      if ((localSQLiteDatabase.update(paramString1, paramContentValues, localStringBuilder.toString(), new String[] { str }) == 0L) && (localSQLiteDatabase.insertWithOnConflict(paramString1, null, paramContentValues, 5) == -1L)) {
        j().G().c("Failed to insert/update table (got -1). key", Y1.v(paramString1), Y1.v(paramString2));
      }
      return;
      label131:
      j().G().d("Error storing into table. key", Y1.v(paramString1), Y1.v(paramString2), paramContentValues);
    }
  }
  
  public final void Z(String paramString, List paramList)
  {
    n.i(paramList);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i3;
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      localObject1 = (w1.a)((w1)paramList.get(i1)).x();
      localObject2 = localObject1;
      if (((w1.a)localObject1).w() != 0)
      {
        int i2 = 0;
        for (;;)
        {
          localObject2 = localObject1;
          if (i2 >= ((w1.a)localObject1).w()) {
            break;
          }
          localObject2 = (x1.a)((w1.a)localObject1).z(i2).x();
          localObject3 = (x1.a)((k3)localObject2).clone();
          localObject4 = r3.b(((x1.a)localObject2).A());
          if (localObject4 != null)
          {
            ((x1.a)localObject3).y((String)localObject4);
            i3 = 1;
          }
          else
          {
            i3 = 0;
          }
          for (int i4 = 0; i4 < ((x1.a)localObject2).w(); i4++)
          {
            localObject5 = ((x1.a)localObject2).z(i4);
            localObject4 = t3.a(((y1)localObject5).M());
            if (localObject4 != null)
            {
              ((x1.a)localObject3).x(i4, (y1)((y1.a)((Y3)localObject5).x()).w((String)localObject4).p());
              i3 = 1;
            }
          }
          localObject2 = localObject1;
          if (i3 != 0)
          {
            localObject2 = ((w1.a)localObject1).x(i2, (x1.a)localObject3);
            paramList.set(i1, (w1)((Y3.b)localObject2).p());
          }
          i2++;
          localObject1 = localObject2;
        }
      }
      if (((w1.a)localObject2).A() != 0)
      {
        i3 = 0;
        while (i3 < ((w1.a)localObject2).A())
        {
          localObject3 = ((w1.a)localObject2).B(i3);
          localObject4 = s3.a(((A1)localObject3).L());
          localObject1 = localObject2;
          if (localObject4 != null)
          {
            localObject1 = ((w1.a)localObject2).y(i3, ((A1.a)((Y3)localObject3).x()).w((String)localObject4));
            paramList.set(i1, (w1)((Y3.b)localObject1).p());
          }
          i3++;
          localObject2 = localObject1;
        }
      }
    }
    u();
    n();
    n.e(paramString);
    n.i(paramList);
    Object localObject5 = B();
    ((SQLiteDatabase)localObject5).beginTransaction();
    try
    {
      u();
      n();
      n.e(paramString);
      localObject1 = B();
      ((SQLiteDatabase)localObject1).delete("property_filters", "app_id=?", new String[] { paramString });
      ((SQLiteDatabase)localObject1).delete("event_filters", "app_id=?", new String[] { paramString });
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label858;
        }
        localObject1 = (w1)localIterator.next();
        u();
        n();
        n.e(paramString);
        n.i(localObject1);
        if (((w1)localObject1).R()) {
          break;
        }
        j().L().b("Audience with no ID. appId", Y1.v(paramString));
      }
    }
    finally
    {
      for (;;)
      {
        break;
        i1 = ((w1)localObject1).k();
        localObject2 = ((w1)localObject1).P().iterator();
        while (((Iterator)localObject2).hasNext()) {
          if (!((x1)((Iterator)localObject2).next()).V())
          {
            localObject2 = j().L();
            localObject1 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
            localObject4 = Y1.v(paramString);
          }
        }
        for (localObject3 = Integer.valueOf(i1);; localObject3 = Integer.valueOf(i1))
        {
          ((a2)localObject2).c((String)localObject1, localObject4, localObject3);
          break;
          localObject2 = ((w1)localObject1).Q().iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
          } while (((A1)((Iterator)localObject2).next()).P());
          localObject2 = j().L();
          localObject1 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
          localObject4 = Y1.v(paramString);
        }
        localObject2 = ((w1)localObject1).P().iterator();
        while (((Iterator)localObject2).hasNext()) {
          if (!f0(paramString, i1, (x1)((Iterator)localObject2).next()))
          {
            i3 = 0;
            break label725;
          }
        }
        i3 = 1;
        label725:
        if (i3 != 0)
        {
          localObject1 = ((w1)localObject1).Q().iterator();
          while (((Iterator)localObject1).hasNext()) {
            if (!g0(paramString, i1, (A1)((Iterator)localObject1).next())) {
              break label779;
            }
          }
        }
        if (i3 == 0)
        {
          label779:
          u();
          n();
          n.e(paramString);
          localObject1 = B();
          ((SQLiteDatabase)localObject1).delete("property_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(i1) });
          ((SQLiteDatabase)localObject1).delete("event_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(i1) });
        }
        else
        {
          continue;
          label858:
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject2 = paramList.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            paramList = (w1)((Iterator)localObject2).next();
            if (paramList.R()) {
              paramList = Integer.valueOf(paramList.k());
            } else {
              paramList = null;
            }
            ((List)localObject1).add(paramList);
          }
          z0(paramString, (List)localObject1);
          ((SQLiteDatabase)localObject5).setTransactionSuccessful();
          ((SQLiteDatabase)localObject5).endTransaction();
          return;
        }
      }
      ((SQLiteDatabase)localObject5).endTransaction();
    }
  }
  
  public final void a0(List paramList)
  {
    n();
    u();
    n.i(paramList);
    n.k(paramList.size());
    if (!u0()) {
      return;
    }
    paramList = TextUtils.join(",", paramList);
    StringBuilder localStringBuilder = new StringBuilder("(");
    localStringBuilder.append(paramList);
    localStringBuilder.append(")");
    paramList = localStringBuilder.toString();
    localStringBuilder = new StringBuilder("SELECT COUNT(1) FROM queue WHERE rowid IN ");
    localStringBuilder.append(paramList);
    localStringBuilder.append(" AND retry_count =  2147483647 LIMIT 1");
    if (x0(localStringBuilder.toString(), null) > 0L) {
      j().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
    }
    try
    {
      SQLiteDatabase localSQLiteDatabase = B();
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
      localStringBuilder.append(paramList);
      localStringBuilder.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
      localSQLiteDatabase.execSQL(localStringBuilder.toString());
      return;
    }
    catch (SQLiteException paramList)
    {
      j().G().b("Error incrementing retry count. error", paramList);
    }
  }
  
  public final boolean b0(e parame)
  {
    n.i(parame);
    n();
    u();
    String str = o;
    n.i(str);
    if (F0(str, q.p) == null) {
      if (x0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { str }) >= 1000L) {
        return false;
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", str);
    localContentValues.put("origin", p);
    localContentValues.put("name", q.p);
    V(localContentValues, "value", n.i(q.a()));
    localContentValues.put("active", Boolean.valueOf(s));
    localContentValues.put("trigger_event_name", t);
    localContentValues.put("trigger_timeout", Long.valueOf(v));
    k();
    localContentValues.put("timed_out_event", S5.p0(u));
    localContentValues.put("creation_timestamp", Long.valueOf(r));
    k();
    localContentValues.put("triggered_event", S5.p0(w));
    localContentValues.put("triggered_timestamp", Long.valueOf(q.q));
    localContentValues.put("time_to_live", Long.valueOf(x));
    k();
    localContentValues.put("expired_event", S5.p0(y));
    try
    {
      if (B().insertWithOnConflict("conditional_properties", null, localContentValues, 5) == -1L) {
        j().G().b("Failed to insert/update conditional user property (got -1)", Y1.v(str));
      }
    }
    catch (SQLiteException parame)
    {
      j().G().c("Error storing conditional user property", Y1.v(str), parame);
    }
    return true;
  }
  
  public final boolean c0(A paramA, long paramLong, boolean paramBoolean)
  {
    n();
    u();
    n.i(paramA);
    n.e(a);
    byte[] arrayOfByte = o().F(paramA).h();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", a);
    localContentValues.put("name", b);
    localContentValues.put("timestamp", Long.valueOf(d));
    localContentValues.put("metadata_fingerprint", Long.valueOf(paramLong));
    localContentValues.put("data", arrayOfByte);
    localContentValues.put("realtime", Integer.valueOf(paramBoolean));
    try
    {
      if (B().insert("raw_events", null, localContentValues) == -1L)
      {
        j().G().b("Failed to insert raw event (got -1). appId", Y1.v(a));
        return false;
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      break label165;
      return true;
      label165:
      j().G().c("Error storing raw event. appId", Y1.v(a), localSQLiteException);
    }
    return false;
  }
  
  public final boolean d0(T5 paramT5)
  {
    n.i(paramT5);
    n();
    u();
    if (F0(a, c) == null) {
      if (S5.J0(c))
      {
        if (x0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { a }) >= f().q(a, K.I, 25, 100)) {
          return false;
        }
      }
      else if (!"_npa".equals(c)) {
        if (x0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { a, b }) >= 25L) {
          return false;
        }
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", a);
    localContentValues.put("origin", b);
    localContentValues.put("name", c);
    localContentValues.put("set_timestamp", Long.valueOf(d));
    V(localContentValues, "value", e);
    try
    {
      if (B().insertWithOnConflict("user_attributes", null, localContentValues, 5) == -1L) {
        j().G().b("Failed to insert/update user property (got -1). appId", Y1.v(a));
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      j().G().c("Error storing user property. appId", Y1.v(a), localSQLiteException);
    }
    return true;
  }
  
  public final boolean e0(d2 paramd2, boolean paramBoolean)
  {
    n();
    u();
    n.i(paramd2);
    n.e(paramd2.D3());
    n.l(paramd2.T0());
    S0();
    long l1 = b().a();
    if ((paramd2.X2() < l1 - g.M()) || (paramd2.X2() > g.M() + l1)) {
      j().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", Y1.v(paramd2.D3()), Long.valueOf(l1), Long.valueOf(paramd2.X2()));
    }
    byte[] arrayOfByte = paramd2.h();
    try
    {
      arrayOfByte = o().g0(arrayOfByte);
      j().K().b("Saving bundle, size", Integer.valueOf(arrayOfByte.length));
      localObject1 = new ContentValues();
      ((ContentValues)localObject1).put("app_id", paramd2.D3());
      ((ContentValues)localObject1).put("bundle_end_timestamp", Long.valueOf(paramd2.X2()));
      ((ContentValues)localObject1).put("data", arrayOfByte);
      ((ContentValues)localObject1).put("has_realtime", Integer.valueOf(paramBoolean));
      if (paramd2.a1()) {
        ((ContentValues)localObject1).put("retry_count", Integer.valueOf(paramd2.e2()));
      }
      try
      {
        if (B().insert("queue", null, (ContentValues)localObject1) == -1L)
        {
          j().G().b("Failed to insert bundle (got -1). appId", Y1.v(paramd2.D3()));
          return false;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        break label262;
        return true;
        label262:
        localObject2 = j().G();
        localObject3 = Y1.v(paramd2.D3());
        localObject1 = "Error storing bundle. appId";
        paramd2 = (d2)localObject2;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1 = j().G();
        Object localObject3 = Y1.v(paramd2.D3());
        Object localObject2 = "Data loss. Failed to serialize bundle. appId";
        paramd2 = (d2)localObject1;
        localObject1 = localObject2;
      }
    }
    paramd2.c((String)localObject1, localObject3, localSQLiteException);
    return false;
  }
  
  public final boolean f0(String paramString, int paramInt, x1 paramx1)
  {
    u();
    n();
    n.e(paramString);
    n.i(paramx1);
    boolean bool = paramx1.P().isEmpty();
    Integer localInteger = null;
    if (bool)
    {
      localObject1 = j().L();
      localObject2 = Y1.v(paramString);
      paramString = localInteger;
      if (paramx1.V()) {
        paramString = Integer.valueOf(paramx1.L());
      }
      ((a2)localObject1).d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", localObject2, Integer.valueOf(paramInt), String.valueOf(paramString));
      return false;
    }
    Object localObject2 = paramx1.h();
    Object localObject1 = new ContentValues();
    ((ContentValues)localObject1).put("app_id", paramString);
    ((ContentValues)localObject1).put("audience_id", Integer.valueOf(paramInt));
    if (paramx1.V()) {
      localInteger = Integer.valueOf(paramx1.L());
    } else {
      localInteger = null;
    }
    ((ContentValues)localObject1).put("filter_id", localInteger);
    ((ContentValues)localObject1).put("event_name", paramx1.P());
    if (paramx1.W()) {
      paramx1 = Boolean.valueOf(paramx1.T());
    } else {
      paramx1 = null;
    }
    ((ContentValues)localObject1).put("session_scoped", paramx1);
    ((ContentValues)localObject1).put("data", (byte[])localObject2);
    try
    {
      if (B().insertWithOnConflict("event_filters", null, (ContentValues)localObject1, 5) == -1L) {
        j().G().b("Failed to insert event filter (got -1). appId", Y1.v(paramString));
      }
    }
    catch (SQLiteException paramx1)
    {
      break label253;
    }
    return true;
    label253:
    j().G().c("Error storing event filter. appId", Y1.v(paramString), paramx1);
    return false;
  }
  
  public final boolean g0(String paramString, int paramInt, A1 paramA1)
  {
    u();
    n();
    n.e(paramString);
    n.i(paramA1);
    boolean bool = paramA1.L().isEmpty();
    Integer localInteger = null;
    if (bool)
    {
      localObject1 = j().L();
      localObject2 = Y1.v(paramString);
      paramString = localInteger;
      if (paramA1.P()) {
        paramString = Integer.valueOf(paramA1.k());
      }
      ((a2)localObject1).d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", localObject2, Integer.valueOf(paramInt), String.valueOf(paramString));
      return false;
    }
    Object localObject2 = paramA1.h();
    Object localObject1 = new ContentValues();
    ((ContentValues)localObject1).put("app_id", paramString);
    ((ContentValues)localObject1).put("audience_id", Integer.valueOf(paramInt));
    if (paramA1.P()) {
      localInteger = Integer.valueOf(paramA1.k());
    } else {
      localInteger = null;
    }
    ((ContentValues)localObject1).put("filter_id", localInteger);
    ((ContentValues)localObject1).put("property_name", paramA1.L());
    if (paramA1.Q()) {
      paramA1 = Boolean.valueOf(paramA1.O());
    } else {
      paramA1 = null;
    }
    ((ContentValues)localObject1).put("session_scoped", paramA1);
    ((ContentValues)localObject1).put("data", (byte[])localObject2);
    try
    {
      if (B().insertWithOnConflict("property_filters", null, (ContentValues)localObject1, 5) == -1L)
      {
        j().G().b("Failed to insert property filter (got -1). appId", Y1.v(paramString));
        return false;
      }
    }
    catch (SQLiteException paramA1)
    {
      break label252;
      return true;
      label252:
      j().G().c("Error storing property filter. appId", Y1.v(paramString), paramA1);
    }
    return false;
  }
  
  public final boolean h0(String paramString, v5 paramv5)
  {
    n();
    u();
    n.i(paramv5);
    n.e(paramString);
    long l1 = b().a();
    if ((p < l1 - g.M()) || (p > g.M() + l1)) {
      j().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", Y1.v(paramString), Long.valueOf(l1), Long.valueOf(p));
    }
    j().K().a("Saving trigger URI");
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramString);
    localContentValues.put("trigger_uri", o);
    localContentValues.put("source", Integer.valueOf(q));
    localContentValues.put("timestamp_millis", Long.valueOf(p));
    try
    {
      if (B().insert("trigger_uris", null, localContentValues) == -1L)
      {
        j().G().b("Failed to insert trigger URI (got -1). appId", Y1.v(paramString));
        return false;
      }
    }
    catch (SQLiteException paramv5)
    {
      break label200;
      return true;
      label200:
      j().G().c("Error storing trigger URI. appId", Y1.v(paramString), paramv5);
    }
    return false;
  }
  
  public final boolean i0(String paramString, Bundle paramBundle)
  {
    n();
    u();
    paramBundle = new A(a, "", paramString, "dep", 0L, 0L, paramBundle);
    byte[] arrayOfByte = o().F(paramBundle).h();
    j().K().c("Saving default event parameters, appId, data size", h().c(paramString), Integer.valueOf(arrayOfByte.length));
    paramBundle = new ContentValues();
    paramBundle.put("app_id", paramString);
    paramBundle.put("parameters", arrayOfByte);
    try
    {
      if (B().insertWithOnConflict("default_event_params", null, paramBundle, 5) == -1L)
      {
        j().G().b("Failed to insert default event parameters (got -1). appId", Y1.v(paramString));
        return false;
      }
    }
    catch (SQLiteException paramBundle)
    {
      break label137;
      return true;
      label137:
      j().G().c("Error storing default event parameters. appId", Y1.v(paramString), paramBundle);
    }
    return false;
  }
  
  public final boolean j0(String paramString, Long paramLong, long paramLong1, com.google.android.gms.internal.measurement.Y1 paramY1)
  {
    n();
    u();
    n.i(paramY1);
    n.e(paramString);
    n.i(paramLong);
    byte[] arrayOfByte = paramY1.h();
    j().K().c("Saving complex main event, appId, data size", h().c(paramString), Integer.valueOf(arrayOfByte.length));
    paramY1 = new ContentValues();
    paramY1.put("app_id", paramString);
    paramY1.put("event_id", paramLong);
    paramY1.put("children_to_process", Long.valueOf(paramLong1));
    paramY1.put("main_event", arrayOfByte);
    try
    {
      if (B().insertWithOnConflict("main_event_params", null, paramY1, 5) == -1L)
      {
        j().G().b("Failed to insert complex main event (got -1). appId", Y1.v(paramString));
        return false;
      }
    }
    catch (SQLiteException paramLong)
    {
      break label153;
      return true;
      label153:
      j().G().c("Error storing complex main event. appId", Y1.v(paramString), paramLong);
    }
    return false;
  }
  
  public final boolean u0()
  {
    return a().getDatabasePath("google_app_measurement.db").exists();
  }
  
  public final long v0(String paramString)
  {
    n.e(paramString);
    return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { paramString }, 0L);
  }
  
  /* Error */
  public final long w0(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 357	R2/m3:n	()V
    //   14: aload_0
    //   15: invokevirtual 360	R2/C5:u	()V
    //   18: aload_0
    //   19: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: astore_3
    //   23: aload_3
    //   24: invokevirtual 1223	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   27: lconst_0
    //   28: lstore 4
    //   30: new 1228	java/lang/StringBuilder
    //   33: astore 6
    //   35: aload 6
    //   37: ldc_w 1834
    //   40: invokespecial 1229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: aload 6
    //   45: aload_2
    //   46: invokevirtual 1240	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: aload 6
    //   52: ldc_w 1836
    //   55: invokevirtual 1240	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_0
    //   60: aload 6
    //   62: invokevirtual 1246	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: iconst_1
    //   66: anewarray 23	java/lang/String
    //   69: dup
    //   70: iconst_0
    //   71: aload_1
    //   72: aastore
    //   73: ldc2_w 1201
    //   76: invokevirtual 351	R2/p:G	(Ljava/lang/String;[Ljava/lang/String;J)J
    //   79: lstore 7
    //   81: lload 7
    //   83: lstore 9
    //   85: lload 7
    //   87: ldc2_w 1201
    //   90: lcmp
    //   91: ifne +105 -> 196
    //   94: new 311	android/content/ContentValues
    //   97: astore 6
    //   99: aload 6
    //   101: invokespecial 851	android/content/ContentValues:<init>	()V
    //   104: aload 6
    //   106: ldc_w 853
    //   109: aload_1
    //   110: invokevirtual 315	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload 6
    //   115: ldc_w 1838
    //   118: iconst_0
    //   119: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   122: invokevirtual 1419	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   125: aload 6
    //   127: ldc -27
    //   129: iconst_0
    //   130: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: invokevirtual 1419	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   136: aload_3
    //   137: ldc_w 1840
    //   140: aconst_null
    //   141: aload 6
    //   143: iconst_5
    //   144: invokevirtual 866	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   147: ldc2_w 1201
    //   150: lcmp
    //   151: ifne +42 -> 193
    //   154: aload_0
    //   155: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   158: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   161: ldc_w 1842
    //   164: aload_1
    //   165: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   168: aload_2
    //   169: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   172: aload_3
    //   173: invokevirtual 1260	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   176: ldc2_w 1201
    //   179: lreturn
    //   180: astore_1
    //   181: goto +142 -> 323
    //   184: astore 6
    //   186: lload 4
    //   188: lstore 9
    //   190: goto +106 -> 296
    //   193: lconst_0
    //   194: lstore 9
    //   196: new 311	android/content/ContentValues
    //   199: astore 6
    //   201: aload 6
    //   203: invokespecial 851	android/content/ContentValues:<init>	()V
    //   206: aload 6
    //   208: ldc_w 853
    //   211: aload_1
    //   212: invokevirtual 315	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: aload 6
    //   217: aload_2
    //   218: lconst_1
    //   219: lload 9
    //   221: ladd
    //   222: invokestatic 637	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   225: invokevirtual 320	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   228: aload_3
    //   229: ldc_w 1840
    //   232: aload 6
    //   234: ldc_w 1445
    //   237: iconst_1
    //   238: anewarray 23	java/lang/String
    //   241: dup
    //   242: iconst_0
    //   243: aload_1
    //   244: aastore
    //   245: invokevirtual 955	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   248: i2l
    //   249: lconst_0
    //   250: lcmp
    //   251: ifne +34 -> 285
    //   254: aload_0
    //   255: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   258: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   261: ldc_w 1844
    //   264: aload_1
    //   265: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   268: aload_2
    //   269: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   272: aload_3
    //   273: invokevirtual 1260	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   276: ldc2_w 1201
    //   279: lreturn
    //   280: astore 6
    //   282: goto +14 -> 296
    //   285: aload_3
    //   286: invokevirtual 1342	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   289: aload_3
    //   290: invokevirtual 1260	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   293: goto +27 -> 320
    //   296: aload_0
    //   297: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   300: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   303: ldc_w 1846
    //   306: aload_1
    //   307: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   310: aload_2
    //   311: aload 6
    //   313: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   316: aload_3
    //   317: invokevirtual 1260	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   320: lload 9
    //   322: lreturn
    //   323: aload_3
    //   324: invokevirtual 1260	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   327: aload_1
    //   328: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	329	0	this	p
    //   0	329	1	paramString1	String
    //   0	329	2	paramString2	String
    //   22	302	3	localSQLiteDatabase	SQLiteDatabase
    //   28	159	4	l1	long
    //   33	109	6	localObject	Object
    //   184	1	6	localSQLiteException1	SQLiteException
    //   199	34	6	localContentValues	ContentValues
    //   280	32	6	localSQLiteException2	SQLiteException
    //   79	7	7	l2	long
    //   83	238	9	l3	long
    // Exception table:
    //   from	to	target	type
    //   30	81	180	finally
    //   94	172	180	finally
    //   196	272	180	finally
    //   285	289	180	finally
    //   296	316	180	finally
    //   30	81	184	android/database/sqlite/SQLiteException
    //   94	172	184	android/database/sqlite/SQLiteException
    //   196	272	280	android/database/sqlite/SQLiteException
    //   285	289	280	android/database/sqlite/SQLiteException
  }
  
  public final boolean x()
  {
    return false;
  }
  
  /* Error */
  public final long x0(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 5
    //   11: aload_3
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   17: astore_2
    //   18: aload_2
    //   19: astore 5
    //   21: aload_2
    //   22: astore 4
    //   24: aload_2
    //   25: invokeinterface 398 1 0
    //   30: ifeq +35 -> 65
    //   33: aload_2
    //   34: astore 5
    //   36: aload_2
    //   37: astore 4
    //   39: aload_2
    //   40: iconst_0
    //   41: invokeinterface 411 2 0
    //   46: lstore 6
    //   48: aload_2
    //   49: invokeinterface 401 1 0
    //   54: lload 6
    //   56: lreturn
    //   57: astore_1
    //   58: goto +63 -> 121
    //   61: astore_2
    //   62: goto +34 -> 96
    //   65: aload_2
    //   66: astore 5
    //   68: aload_2
    //   69: astore 4
    //   71: new 355	android/database/sqlite/SQLiteException
    //   74: astore_3
    //   75: aload_2
    //   76: astore 5
    //   78: aload_2
    //   79: astore 4
    //   81: aload_3
    //   82: ldc_w 1848
    //   85: invokespecial 1849	android/database/sqlite/SQLiteException:<init>	(Ljava/lang/String;)V
    //   88: aload_2
    //   89: astore 5
    //   91: aload_2
    //   92: astore 4
    //   94: aload_3
    //   95: athrow
    //   96: aload 4
    //   98: astore 5
    //   100: aload_0
    //   101: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   104: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   107: ldc_w 921
    //   110: aload_1
    //   111: aload_2
    //   112: invokevirtual 472	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   115: aload 4
    //   117: astore 5
    //   119: aload_2
    //   120: athrow
    //   121: aload 5
    //   123: ifnull +10 -> 133
    //   126: aload 5
    //   128: invokeinterface 401 1 0
    //   133: aload_1
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	p
    //   0	135	1	paramString	String
    //   0	135	2	paramArrayOfString	String[]
    //   4	91	3	localObject	Object
    //   6	110	4	arrayOfString1	String[]
    //   9	118	5	arrayOfString2	String[]
    //   46	9	6	l1	long
    // Exception table:
    //   from	to	target	type
    //   11	18	57	finally
    //   24	33	57	finally
    //   39	48	57	finally
    //   71	75	57	finally
    //   81	88	57	finally
    //   94	96	57	finally
    //   100	115	57	finally
    //   119	121	57	finally
    //   11	18	61	android/database/sqlite/SQLiteException
    //   24	33	61	android/database/sqlite/SQLiteException
    //   39	48	61	android/database/sqlite/SQLiteException
    //   71	75	61	android/database/sqlite/SQLiteException
    //   81	88	61	android/database/sqlite/SQLiteException
    //   94	96	61	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final long y()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   8: ldc_w 1851
    //   11: aconst_null
    //   12: invokevirtual 498	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   15: astore_3
    //   16: aload_3
    //   17: astore_2
    //   18: aload_3
    //   19: astore_1
    //   20: aload_3
    //   21: invokeinterface 398 1 0
    //   26: istore 4
    //   28: iload 4
    //   30: ifne +13 -> 43
    //   33: aload_3
    //   34: invokeinterface 401 1 0
    //   39: ldc2_w 1201
    //   42: lreturn
    //   43: aload_3
    //   44: astore_2
    //   45: aload_3
    //   46: astore_1
    //   47: aload_3
    //   48: iconst_0
    //   49: invokeinterface 411 2 0
    //   54: lstore 5
    //   56: aload_3
    //   57: invokeinterface 401 1 0
    //   62: lload 5
    //   64: lreturn
    //   65: astore_1
    //   66: goto +34 -> 100
    //   69: astore_3
    //   70: aload_1
    //   71: astore_2
    //   72: aload_0
    //   73: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   76: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   79: ldc_w 1853
    //   82: aload_3
    //   83: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   86: aload_1
    //   87: ifnull +9 -> 96
    //   90: aload_1
    //   91: invokeinterface 401 1 0
    //   96: ldc2_w 1201
    //   99: lreturn
    //   100: aload_2
    //   101: ifnull +9 -> 110
    //   104: aload_2
    //   105: invokeinterface 401 1 0
    //   110: aload_1
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	p
    //   1	46	1	localObject1	Object
    //   65	46	1	localObject2	Object
    //   3	102	2	localObject3	Object
    //   15	42	3	localCursor	Cursor
    //   69	14	3	localSQLiteException	SQLiteException
    //   26	3	4	bool	boolean
    //   54	9	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   4	16	65	finally
    //   20	28	65	finally
    //   47	56	65	finally
    //   72	86	65	finally
    //   4	16	69	android/database/sqlite/SQLiteException
    //   20	28	69	android/database/sqlite/SQLiteException
    //   47	56	69	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final List y0(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 306	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 357	R2/m3:n	()V
    //   9: aload_0
    //   10: invokevirtual 360	R2/C5:u	()V
    //   13: new 607	java/util/ArrayList
    //   16: dup
    //   17: invokespecial 994	java/util/ArrayList:<init>	()V
    //   20: astore 4
    //   22: aconst_null
    //   23: astore 5
    //   25: aconst_null
    //   26: astore 6
    //   28: aconst_null
    //   29: astore 7
    //   31: aload 7
    //   33: astore 8
    //   35: new 607	java/util/ArrayList
    //   38: astore 9
    //   40: aload 7
    //   42: astore 8
    //   44: aload 9
    //   46: iconst_3
    //   47: invokespecial 1226	java/util/ArrayList:<init>	(I)V
    //   50: aload 7
    //   52: astore 8
    //   54: aload 9
    //   56: aload_1
    //   57: invokeinterface 1001 2 0
    //   62: pop
    //   63: aload 7
    //   65: astore 8
    //   67: new 1228	java/lang/StringBuilder
    //   70: astore 10
    //   72: aload 7
    //   74: astore 8
    //   76: aload 10
    //   78: ldc_w 677
    //   81: invokespecial 1229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   84: aload 7
    //   86: astore 8
    //   88: aload_2
    //   89: invokestatic 1234	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   92: istore 11
    //   94: iload 11
    //   96: ifne +71 -> 167
    //   99: aload_2
    //   100: astore 6
    //   102: aload 7
    //   104: astore 8
    //   106: aload 5
    //   108: astore 12
    //   110: aload 6
    //   112: astore 13
    //   114: aload 9
    //   116: aload 6
    //   118: invokeinterface 1001 2 0
    //   123: pop
    //   124: aload 7
    //   126: astore 8
    //   128: aload 5
    //   130: astore 12
    //   132: aload 6
    //   134: astore 13
    //   136: aload 10
    //   138: ldc_w 1236
    //   141: invokevirtual 1240	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: goto +22 -> 167
    //   148: astore_1
    //   149: aload 8
    //   151: astore 13
    //   153: goto +656 -> 809
    //   156: astore_2
    //   157: aload 12
    //   159: astore 6
    //   161: aload 13
    //   163: astore_3
    //   164: goto +600 -> 764
    //   167: aload 7
    //   169: astore 8
    //   171: aload 5
    //   173: astore 12
    //   175: aload_2
    //   176: astore 13
    //   178: aload_3
    //   179: invokestatic 1234	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   182: ifne +117 -> 299
    //   185: aload 7
    //   187: astore 8
    //   189: aload 5
    //   191: astore 12
    //   193: aload_2
    //   194: astore 13
    //   196: new 1228	java/lang/StringBuilder
    //   199: astore 6
    //   201: aload 7
    //   203: astore 8
    //   205: aload 5
    //   207: astore 12
    //   209: aload_2
    //   210: astore 13
    //   212: aload 6
    //   214: invokespecial 1241	java/lang/StringBuilder:<init>	()V
    //   217: aload 7
    //   219: astore 8
    //   221: aload 5
    //   223: astore 12
    //   225: aload_2
    //   226: astore 13
    //   228: aload 6
    //   230: aload_3
    //   231: invokevirtual 1240	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload 7
    //   237: astore 8
    //   239: aload 5
    //   241: astore 12
    //   243: aload_2
    //   244: astore 13
    //   246: aload 6
    //   248: ldc_w 1243
    //   251: invokevirtual 1240	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: aload 7
    //   257: astore 8
    //   259: aload 5
    //   261: astore 12
    //   263: aload_2
    //   264: astore 13
    //   266: aload 9
    //   268: aload 6
    //   270: invokevirtual 1246	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: invokeinterface 1001 2 0
    //   278: pop
    //   279: aload 7
    //   281: astore 8
    //   283: aload 5
    //   285: astore 12
    //   287: aload_2
    //   288: astore 13
    //   290: aload 10
    //   292: ldc_w 1248
    //   295: invokevirtual 1240	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: pop
    //   299: aload 7
    //   301: astore 8
    //   303: aload 5
    //   305: astore 12
    //   307: aload_2
    //   308: astore 13
    //   310: aload 9
    //   312: aload 9
    //   314: invokeinterface 1252 1 0
    //   319: anewarray 23	java/lang/String
    //   322: invokeinterface 1253 2 0
    //   327: checkcast 629	[Ljava/lang/String;
    //   330: astore 6
    //   332: aload 7
    //   334: astore 8
    //   336: aload 5
    //   338: astore 12
    //   340: aload_2
    //   341: astore 13
    //   343: aload_0
    //   344: invokevirtual 364	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   347: astore 9
    //   349: iconst_0
    //   350: istore 14
    //   352: iconst_1
    //   353: istore 15
    //   355: iconst_2
    //   356: istore 16
    //   358: aload 7
    //   360: astore 8
    //   362: aload 5
    //   364: astore 12
    //   366: aload_2
    //   367: astore 13
    //   369: aload 10
    //   371: invokevirtual 1246	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   374: astore 10
    //   376: aload 7
    //   378: astore 8
    //   380: aload 5
    //   382: astore 12
    //   384: aload_2
    //   385: astore 13
    //   387: aload 9
    //   389: ldc_w 908
    //   392: iconst_4
    //   393: anewarray 23	java/lang/String
    //   396: dup
    //   397: iconst_0
    //   398: ldc_w 1108
    //   401: aastore
    //   402: dup
    //   403: iconst_1
    //   404: ldc_w 910
    //   407: aastore
    //   408: dup
    //   409: iconst_2
    //   410: ldc_w 368
    //   413: aastore
    //   414: dup
    //   415: iconst_3
    //   416: ldc 51
    //   418: aastore
    //   419: aload 10
    //   421: aload 6
    //   423: aconst_null
    //   424: aconst_null
    //   425: ldc_w 1056
    //   428: ldc_w 1262
    //   431: invokevirtual 1059	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   434: astore 6
    //   436: aload 6
    //   438: astore 8
    //   440: aload 6
    //   442: astore 12
    //   444: aload_2
    //   445: astore 13
    //   447: aload 6
    //   449: invokeinterface 398 1 0
    //   454: istore 11
    //   456: aload_2
    //   457: astore 7
    //   459: iload 11
    //   461: ifne +13 -> 474
    //   464: aload 6
    //   466: invokeinterface 401 1 0
    //   471: aload 4
    //   473: areturn
    //   474: aload 6
    //   476: astore 8
    //   478: aload 6
    //   480: astore 12
    //   482: aload 7
    //   484: astore 13
    //   486: aload 4
    //   488: invokeinterface 1252 1 0
    //   493: sipush 1000
    //   496: if_icmplt +37 -> 533
    //   499: aload 6
    //   501: astore 8
    //   503: aload 6
    //   505: astore 12
    //   507: aload 7
    //   509: astore 13
    //   511: aload_0
    //   512: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   515: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   518: ldc_w 1855
    //   521: sipush 1000
    //   524: invokestatic 988	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   527: invokevirtual 488	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   530: goto +179 -> 709
    //   533: aload 6
    //   535: astore 8
    //   537: aload 6
    //   539: astore 12
    //   541: aload 7
    //   543: astore 13
    //   545: aload 6
    //   547: iload 14
    //   549: invokeinterface 288 2 0
    //   554: astore 5
    //   556: aload 6
    //   558: astore 8
    //   560: aload 6
    //   562: astore 12
    //   564: aload 7
    //   566: astore 13
    //   568: aload 6
    //   570: iload 15
    //   572: invokeinterface 411 2 0
    //   577: lstore 17
    //   579: aload 6
    //   581: astore 13
    //   583: aload_0
    //   584: aload 6
    //   586: iload 16
    //   588: invokevirtual 407	R2/p:M	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   591: astore 8
    //   593: aload 6
    //   595: astore 13
    //   597: aload 6
    //   599: iconst_3
    //   600: invokeinterface 288 2 0
    //   605: astore_2
    //   606: aload 8
    //   608: ifnonnull +43 -> 651
    //   611: aload 6
    //   613: astore 13
    //   615: aload_0
    //   616: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   619: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   622: ldc_w 1857
    //   625: aload_1
    //   626: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   629: aload_2
    //   630: aload_3
    //   631: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   634: goto +57 -> 691
    //   637: astore_1
    //   638: goto +171 -> 809
    //   641: astore 13
    //   643: aload_2
    //   644: astore_3
    //   645: aload 13
    //   647: astore_2
    //   648: goto +116 -> 764
    //   651: aload 6
    //   653: astore 13
    //   655: new 912	R2/T5
    //   658: astore 7
    //   660: aload 6
    //   662: astore 13
    //   664: aload 7
    //   666: aload_1
    //   667: aload_2
    //   668: aload 5
    //   670: lload 17
    //   672: aload 8
    //   674: invokespecial 915	R2/T5:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   677: aload 6
    //   679: astore 13
    //   681: aload 4
    //   683: aload 7
    //   685: invokeinterface 1001 2 0
    //   690: pop
    //   691: aload 6
    //   693: astore 13
    //   695: aload 6
    //   697: invokeinterface 445 1 0
    //   702: istore 11
    //   704: iload 11
    //   706: ifne +13 -> 719
    //   709: aload 6
    //   711: invokeinterface 401 1 0
    //   716: aload 4
    //   718: areturn
    //   719: aload_2
    //   720: astore 7
    //   722: goto -248 -> 474
    //   725: astore_3
    //   726: aload_2
    //   727: astore 13
    //   729: aload_3
    //   730: astore_2
    //   731: aload 13
    //   733: astore_3
    //   734: goto +30 -> 764
    //   737: astore_3
    //   738: goto -12 -> 726
    //   741: astore_2
    //   742: aload 7
    //   744: astore_3
    //   745: goto +19 -> 764
    //   748: astore_3
    //   749: aload_2
    //   750: astore 13
    //   752: aload_3
    //   753: astore_2
    //   754: aload 13
    //   756: astore_3
    //   757: goto +7 -> 764
    //   760: astore_3
    //   761: goto -12 -> 749
    //   764: aload 6
    //   766: astore 13
    //   768: aload_0
    //   769: invokevirtual 448	R2/m3:j	()LR2/Y1;
    //   772: invokevirtual 453	R2/Y1:G	()LR2/a2;
    //   775: ldc_w 1859
    //   778: aload_1
    //   779: invokestatic 459	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   782: aload_3
    //   783: aload_2
    //   784: invokevirtual 477	R2/a2:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   787: aload 6
    //   789: astore 13
    //   791: invokestatic 1069	java/util/Collections:emptyList	()Ljava/util/List;
    //   794: astore_1
    //   795: aload 6
    //   797: ifnull +10 -> 807
    //   800: aload 6
    //   802: invokeinterface 401 1 0
    //   807: aload_1
    //   808: areturn
    //   809: aload 13
    //   811: ifnull +10 -> 821
    //   814: aload 13
    //   816: invokeinterface 401 1 0
    //   821: aload_1
    //   822: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	823	0	this	p
    //   0	823	1	paramString1	String
    //   0	823	2	paramString2	String
    //   0	823	3	paramString3	String
    //   20	697	4	localArrayList	ArrayList
    //   23	646	5	str	String
    //   26	775	6	localObject1	Object
    //   29	714	7	localObject2	Object
    //   33	640	8	localObject3	Object
    //   38	350	9	localObject4	Object
    //   70	350	10	localObject5	Object
    //   92	613	11	bool	boolean
    //   108	455	12	localObject6	Object
    //   112	502	13	localObject7	Object
    //   641	5	13	localSQLiteException	SQLiteException
    //   653	162	13	localObject8	Object
    //   350	198	14	i1	int
    //   353	218	15	i2	int
    //   356	231	16	i3	int
    //   577	94	17	l1	long
    // Exception table:
    //   from	to	target	type
    //   35	40	148	finally
    //   44	50	148	finally
    //   54	63	148	finally
    //   67	72	148	finally
    //   76	84	148	finally
    //   88	94	148	finally
    //   114	124	148	finally
    //   136	145	148	finally
    //   178	185	148	finally
    //   196	201	148	finally
    //   212	217	148	finally
    //   228	235	148	finally
    //   246	255	148	finally
    //   266	279	148	finally
    //   290	299	148	finally
    //   310	332	148	finally
    //   343	349	148	finally
    //   369	376	148	finally
    //   387	436	148	finally
    //   447	456	148	finally
    //   486	499	148	finally
    //   511	530	148	finally
    //   545	556	148	finally
    //   568	579	148	finally
    //   114	124	156	android/database/sqlite/SQLiteException
    //   136	145	156	android/database/sqlite/SQLiteException
    //   178	185	156	android/database/sqlite/SQLiteException
    //   196	201	156	android/database/sqlite/SQLiteException
    //   212	217	156	android/database/sqlite/SQLiteException
    //   228	235	156	android/database/sqlite/SQLiteException
    //   246	255	156	android/database/sqlite/SQLiteException
    //   266	279	156	android/database/sqlite/SQLiteException
    //   290	299	156	android/database/sqlite/SQLiteException
    //   310	332	156	android/database/sqlite/SQLiteException
    //   343	349	156	android/database/sqlite/SQLiteException
    //   369	376	156	android/database/sqlite/SQLiteException
    //   387	436	156	android/database/sqlite/SQLiteException
    //   447	456	156	android/database/sqlite/SQLiteException
    //   486	499	156	android/database/sqlite/SQLiteException
    //   511	530	156	android/database/sqlite/SQLiteException
    //   545	556	156	android/database/sqlite/SQLiteException
    //   568	579	156	android/database/sqlite/SQLiteException
    //   583	593	637	finally
    //   597	606	637	finally
    //   615	634	637	finally
    //   655	660	637	finally
    //   664	677	637	finally
    //   681	691	637	finally
    //   695	704	637	finally
    //   768	787	637	finally
    //   791	795	637	finally
    //   615	634	641	android/database/sqlite/SQLiteException
    //   664	677	725	android/database/sqlite/SQLiteException
    //   681	691	725	android/database/sqlite/SQLiteException
    //   695	704	725	android/database/sqlite/SQLiteException
    //   655	660	737	android/database/sqlite/SQLiteException
    //   583	593	741	android/database/sqlite/SQLiteException
    //   597	606	741	android/database/sqlite/SQLiteException
    //   54	63	748	android/database/sqlite/SQLiteException
    //   67	72	748	android/database/sqlite/SQLiteException
    //   76	84	748	android/database/sqlite/SQLiteException
    //   88	94	748	android/database/sqlite/SQLiteException
    //   35	40	760	android/database/sqlite/SQLiteException
    //   44	50	760	android/database/sqlite/SQLiteException
  }
  
  public final long z()
  {
    return G("select max(bundle_end_timestamp) from queue", null, 0L);
  }
  
  public final boolean z0(String paramString, List paramList)
  {
    n.e(paramString);
    u();
    n();
    SQLiteDatabase localSQLiteDatabase = B();
    try
    {
      long l1 = x0("select count(1) from audience_filter_values where app_id=?", new String[] { paramString });
      int i1 = Math.max(0, Math.min(2000, f().u(paramString, K.H)));
      if (l1 <= i1) {
        return false;
      }
      ArrayList localArrayList = new ArrayList();
      for (int i2 = 0; i2 < paramList.size(); i2++)
      {
        localObject = (Integer)paramList.get(i2);
        if (localObject == null) {
          return false;
        }
        localArrayList.add(Integer.toString(((Integer)localObject).intValue()));
      }
      Object localObject = TextUtils.join(",", localArrayList);
      paramList = new StringBuilder("(");
      paramList.append((String)localObject);
      paramList.append(")");
      paramList = paramList.toString();
      localObject = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
      ((StringBuilder)localObject).append(paramList);
      ((StringBuilder)localObject).append(" order by rowid desc limit -1 offset ?)");
      return localSQLiteDatabase.delete("audience_filter_values", ((StringBuilder)localObject).toString(), new String[] { paramString, Integer.toString(i1) }) > 0;
    }
    catch (SQLiteException paramList)
    {
      j().G().c("Database error querying filters. appId", Y1.v(paramString), paramList);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     R2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */