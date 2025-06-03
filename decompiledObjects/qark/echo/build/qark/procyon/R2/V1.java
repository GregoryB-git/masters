// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.database.sqlite.SQLiteClosable;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class V1 extends f1
{
    public final U1 c;
    public boolean d;
    
    public V1(final N2 n2) {
        super(n2);
        this.c = new U1(this, this.a(), "google_app_measurement_local.db");
    }
    
    public static long B(final SQLiteDatabase sqLiteDatabase) {
        Cursor query = null;
        Label_0068: {
            try {
                final Cursor cursor = query = sqLiteDatabase.query("messages", new String[] { "rowid" }, "type=?", new String[] { "3" }, (String)null, (String)null, "rowid desc", "1");
                if (cursor.moveToFirst()) {
                    query = cursor;
                    final long long1 = cursor.getLong(0);
                    cursor.close();
                    return long1;
                }
                break Label_0068;
            }
            finally {
                if (query != null) {
                    query.close();
                }
                final Cursor cursor;
                cursor.close();
                return -1L;
            }
        }
    }
    
    private final boolean L() {
        return this.a().getDatabasePath("google_app_measurement_local.db").exists();
    }
    
    @Override
    public final boolean A() {
        return false;
    }
    
    public final List C(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/m3.n:()V
        //     4: aload_0        
        //     5: getfield        R2/V1.d:Z
        //     8: ifeq            13
        //    11: aconst_null    
        //    12: areturn        
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: astore          13
        //    22: aload_0        
        //    23: invokespecial   R2/V1.L:()Z
        //    26: ifne            32
        //    29: aload           13
        //    31: areturn        
        //    32: iconst_5       
        //    33: istore_1       
        //    34: iconst_0       
        //    35: istore_3       
        //    36: aconst_null    
        //    37: astore          11
        //    39: iload_3        
        //    40: iconst_5       
        //    41: if_icmpge       1027
        //    44: aload_0        
        //    45: invokevirtual   R2/V1.K:()Landroid/database/sqlite/SQLiteDatabase;
        //    48: astore          9
        //    50: aload           9
        //    52: astore          10
        //    54: aload           10
        //    56: ifnonnull       112
        //    59: aload_0        
        //    60: iconst_1       
        //    61: putfield        R2/V1.d:Z
        //    64: aload           10
        //    66: ifnull          74
        //    69: aload           10
        //    71: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //    74: aconst_null    
        //    75: areturn        
        //    76: astore          8
        //    78: aload           11
        //    80: astore          9
        //    82: goto            1002
        //    85: astore          12
        //    87: aconst_null    
        //    88: astore          9
        //    90: aload           10
        //    92: astore          8
        //    94: goto            777
        //    97: goto            748
        //   100: astore          12
        //   102: aconst_null    
        //   103: astore          9
        //   105: aload           10
        //   107: astore          8
        //   109: goto            936
        //   112: aload           10
        //   114: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   117: aload           10
        //   119: invokestatic    R2/V1.B:(Landroid/database/sqlite/SQLiteDatabase;)J
        //   122: lstore          6
        //   124: ldc2_w          -1
        //   127: lstore          4
        //   129: lload           6
        //   131: ldc2_w          -1
        //   134: lcmp           
        //   135: ifeq            159
        //   138: ldc             "rowid<?"
        //   140: astore          11
        //   142: iconst_1       
        //   143: anewarray       Ljava/lang/String;
        //   146: dup            
        //   147: iconst_0       
        //   148: lload           6
        //   150: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   153: aastore        
        //   154: astore          12
        //   156: goto            166
        //   159: aconst_null    
        //   160: astore          11
        //   162: aload           11
        //   164: astore          12
        //   166: bipush          100
        //   168: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   171: astore          14
        //   173: aload           10
        //   175: astore          8
        //   177: aload           10
        //   179: ldc             "messages"
        //   181: iconst_3       
        //   182: anewarray       Ljava/lang/String;
        //   185: dup            
        //   186: iconst_0       
        //   187: ldc             "rowid"
        //   189: aastore        
        //   190: dup            
        //   191: iconst_1       
        //   192: ldc             "type"
        //   194: aastore        
        //   195: dup            
        //   196: iconst_2       
        //   197: ldc             "entry"
        //   199: aastore        
        //   200: aload           11
        //   202: aload           12
        //   204: aconst_null    
        //   205: aconst_null    
        //   206: ldc             "rowid asc"
        //   208: aload           14
        //   210: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   213: astore          10
        //   215: aload           10
        //   217: invokeinterface android/database/Cursor.moveToNext:()Z
        //   222: ifeq            622
        //   225: aload           10
        //   227: iconst_0       
        //   228: invokeinterface android/database/Cursor.getLong:(I)J
        //   233: lstore          6
        //   235: aload           10
        //   237: iconst_1       
        //   238: invokeinterface android/database/Cursor.getInt:(I)I
        //   243: istore_2       
        //   244: aload           10
        //   246: iconst_2       
        //   247: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   252: astore          9
        //   254: iload_2        
        //   255: ifne            402
        //   258: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   261: astore          11
        //   263: aload           11
        //   265: aload           9
        //   267: iconst_0       
        //   268: aload           9
        //   270: arraylength    
        //   271: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   274: aload           11
        //   276: iconst_0       
        //   277: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   280: getstatic       R2/I.CREATOR:Landroid/os/Parcelable$Creator;
        //   283: aload           11
        //   285: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   290: checkcast       LR2/I;
        //   293: astore          9
        //   295: aload           11
        //   297: invokevirtual   android/os/Parcel.recycle:()V
        //   300: lload           6
        //   302: lstore          4
        //   304: aload           9
        //   306: ifnull          215
        //   309: aload           13
        //   311: aload           9
        //   313: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   318: pop            
        //   319: lload           6
        //   321: lstore          4
        //   323: goto            215
        //   326: astore          12
        //   328: aload           8
        //   330: astore          11
        //   332: aload           10
        //   334: astore          9
        //   336: aload           12
        //   338: astore          8
        //   340: aload           11
        //   342: astore          10
        //   344: goto            1002
        //   347: astore          12
        //   349: aload           10
        //   351: astore          9
        //   353: goto            777
        //   356: astore          12
        //   358: aload           10
        //   360: astore          9
        //   362: goto            936
        //   365: astore          9
        //   367: goto            394
        //   370: aload_0        
        //   371: invokevirtual   R2/m3.j:()LR2/Y1;
        //   374: invokevirtual   R2/Y1.G:()LR2/a2;
        //   377: ldc             "Failed to load event from local database"
        //   379: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   382: aload           11
        //   384: invokevirtual   android/os/Parcel.recycle:()V
        //   387: lload           6
        //   389: lstore          4
        //   391: goto            215
        //   394: aload           11
        //   396: invokevirtual   android/os/Parcel.recycle:()V
        //   399: aload           9
        //   401: athrow         
        //   402: iload_2        
        //   403: iconst_1       
        //   404: if_icmpne       488
        //   407: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   410: astore          11
        //   412: aload           11
        //   414: aload           9
        //   416: iconst_0       
        //   417: aload           9
        //   419: arraylength    
        //   420: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   423: aload           11
        //   425: iconst_0       
        //   426: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   429: getstatic       R2/R5.CREATOR:Landroid/os/Parcelable$Creator;
        //   432: aload           11
        //   434: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   439: checkcast       LR2/R5;
        //   442: astore          9
        //   444: aload           11
        //   446: invokevirtual   android/os/Parcel.recycle:()V
        //   449: goto            1076
        //   452: astore          9
        //   454: goto            480
        //   457: aload_0        
        //   458: invokevirtual   R2/m3.j:()LR2/Y1;
        //   461: invokevirtual   R2/Y1.G:()LR2/a2;
        //   464: ldc             "Failed to load user property from local database"
        //   466: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   469: aload           11
        //   471: invokevirtual   android/os/Parcel.recycle:()V
        //   474: aconst_null    
        //   475: astore          9
        //   477: goto            1076
        //   480: aload           11
        //   482: invokevirtual   android/os/Parcel.recycle:()V
        //   485: aload           9
        //   487: athrow         
        //   488: iload_2        
        //   489: iconst_2       
        //   490: if_icmpne       574
        //   493: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   496: astore          11
        //   498: aload           11
        //   500: aload           9
        //   502: iconst_0       
        //   503: aload           9
        //   505: arraylength    
        //   506: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   509: aload           11
        //   511: iconst_0       
        //   512: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   515: getstatic       R2/e.CREATOR:Landroid/os/Parcelable$Creator;
        //   518: aload           11
        //   520: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   525: checkcast       LR2/e;
        //   528: astore          9
        //   530: aload           11
        //   532: invokevirtual   android/os/Parcel.recycle:()V
        //   535: goto            1088
        //   538: astore          9
        //   540: goto            566
        //   543: aload_0        
        //   544: invokevirtual   R2/m3.j:()LR2/Y1;
        //   547: invokevirtual   R2/Y1.G:()LR2/a2;
        //   550: ldc             "Failed to load conditional user property from local database"
        //   552: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   555: aload           11
        //   557: invokevirtual   android/os/Parcel.recycle:()V
        //   560: aconst_null    
        //   561: astore          9
        //   563: goto            1088
        //   566: aload           11
        //   568: invokevirtual   android/os/Parcel.recycle:()V
        //   571: aload           9
        //   573: athrow         
        //   574: iload_2        
        //   575: iconst_3       
        //   576: if_icmpne       606
        //   579: aload_0        
        //   580: invokevirtual   R2/m3.j:()LR2/Y1;
        //   583: invokevirtual   R2/Y1.L:()LR2/a2;
        //   586: astore          9
        //   588: ldc             "Skipping app launch break"
        //   590: astore          11
        //   592: aload           9
        //   594: aload           11
        //   596: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   599: lload           6
        //   601: lstore          4
        //   603: goto            215
        //   606: aload_0        
        //   607: invokevirtual   R2/m3.j:()LR2/Y1;
        //   610: invokevirtual   R2/Y1.G:()LR2/a2;
        //   613: astore          9
        //   615: ldc             "Unknown record type in local database"
        //   617: astore          11
        //   619: goto            592
        //   622: aload           8
        //   624: ldc             "messages"
        //   626: ldc             "rowid <= ?"
        //   628: iconst_1       
        //   629: anewarray       Ljava/lang/String;
        //   632: dup            
        //   633: iconst_0       
        //   634: lload           4
        //   636: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   639: aastore        
        //   640: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   643: aload           13
        //   645: invokeinterface java/util/List.size:()I
        //   650: if_icmpge       665
        //   653: aload_0        
        //   654: invokevirtual   R2/m3.j:()LR2/Y1;
        //   657: invokevirtual   R2/Y1.G:()LR2/a2;
        //   660: ldc             "Fewer entries removed from local database than expected"
        //   662: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   665: aload           8
        //   667: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   670: aload           8
        //   672: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   675: aload           10
        //   677: invokeinterface android/database/Cursor.close:()V
        //   682: aload           8
        //   684: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //   687: aload           13
        //   689: areturn        
        //   690: aload           10
        //   692: astore          9
        //   694: goto            877
        //   697: astore          8
        //   699: aload           9
        //   701: astore          10
        //   703: aconst_null    
        //   704: astore          9
        //   706: goto            1002
        //   709: astore          12
        //   711: aload           9
        //   713: astore          8
        //   715: aconst_null    
        //   716: astore          9
        //   718: goto            777
        //   721: astore          12
        //   723: aload           9
        //   725: astore          8
        //   727: aconst_null    
        //   728: astore          9
        //   730: goto            936
        //   733: astore          8
        //   735: goto            699
        //   738: astore          12
        //   740: goto            711
        //   743: astore          12
        //   745: goto            723
        //   748: aload           9
        //   750: astore          8
        //   752: aconst_null    
        //   753: astore          9
        //   755: goto            877
        //   758: astore          8
        //   760: aconst_null    
        //   761: astore          9
        //   763: aconst_null    
        //   764: astore          10
        //   766: goto            1002
        //   769: astore          12
        //   771: aconst_null    
        //   772: astore          9
        //   774: aconst_null    
        //   775: astore          8
        //   777: aload           8
        //   779: ifnull          814
        //   782: aload           9
        //   784: astore          11
        //   786: aload           8
        //   788: astore          10
        //   790: aload           8
        //   792: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //   795: ifeq            814
        //   798: aload           9
        //   800: astore          11
        //   802: aload           8
        //   804: astore          10
        //   806: aload           8
        //   808: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   811: goto            814
        //   814: aload           9
        //   816: astore          11
        //   818: aload           8
        //   820: astore          10
        //   822: aload_0        
        //   823: invokevirtual   R2/m3.j:()LR2/Y1;
        //   826: invokevirtual   R2/Y1.G:()LR2/a2;
        //   829: ldc             "Error reading entries from local database"
        //   831: aload           12
        //   833: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   836: aload           9
        //   838: astore          11
        //   840: aload           8
        //   842: astore          10
        //   844: aload_0        
        //   845: iconst_1       
        //   846: putfield        R2/V1.d:Z
        //   849: aload           9
        //   851: ifnull          861
        //   854: aload           9
        //   856: invokeinterface android/database/Cursor.close:()V
        //   861: iload_1        
        //   862: istore_2       
        //   863: aload           8
        //   865: ifnull          993
        //   868: goto            918
        //   871: aconst_null    
        //   872: astore          9
        //   874: aconst_null    
        //   875: astore          8
        //   877: iload_1        
        //   878: i2l            
        //   879: lstore          4
        //   881: aload           9
        //   883: astore          11
        //   885: aload           8
        //   887: astore          10
        //   889: lload           4
        //   891: invokestatic    android/os/SystemClock.sleep:(J)V
        //   894: iload_1        
        //   895: bipush          20
        //   897: iadd           
        //   898: istore_1       
        //   899: aload           9
        //   901: ifnull          911
        //   904: aload           9
        //   906: invokeinterface android/database/Cursor.close:()V
        //   911: iload_1        
        //   912: istore_2       
        //   913: aload           8
        //   915: ifnull          993
        //   918: aload           8
        //   920: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //   923: iload_1        
        //   924: istore_2       
        //   925: goto            993
        //   928: astore          12
        //   930: aconst_null    
        //   931: astore          9
        //   933: aconst_null    
        //   934: astore          8
        //   936: aload           9
        //   938: astore          11
        //   940: aload           8
        //   942: astore          10
        //   944: aload_0        
        //   945: invokevirtual   R2/m3.j:()LR2/Y1;
        //   948: invokevirtual   R2/Y1.G:()LR2/a2;
        //   951: ldc             "Error reading entries from local database"
        //   953: aload           12
        //   955: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   958: aload           9
        //   960: astore          11
        //   962: aload           8
        //   964: astore          10
        //   966: aload_0        
        //   967: iconst_1       
        //   968: putfield        R2/V1.d:Z
        //   971: aload           9
        //   973: ifnull          983
        //   976: aload           9
        //   978: invokeinterface android/database/Cursor.close:()V
        //   983: iload_1        
        //   984: istore_2       
        //   985: aload           8
        //   987: ifnull          993
        //   990: goto            918
        //   993: iload_3        
        //   994: iconst_1       
        //   995: iadd           
        //   996: istore_3       
        //   997: iload_2        
        //   998: istore_1       
        //   999: goto            36
        //  1002: aload           9
        //  1004: ifnull          1014
        //  1007: aload           9
        //  1009: invokeinterface android/database/Cursor.close:()V
        //  1014: aload           10
        //  1016: ifnull          1024
        //  1019: aload           10
        //  1021: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1024: aload           8
        //  1026: athrow         
        //  1027: aload_0        
        //  1028: invokevirtual   R2/m3.j:()LR2/Y1;
        //  1031: invokevirtual   R2/Y1.L:()LR2/a2;
        //  1034: ldc             "Failed to read events from database in reasonable time"
        //  1036: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //  1039: aconst_null    
        //  1040: areturn        
        //  1041: astore          8
        //  1043: goto            871
        //  1046: astore          8
        //  1048: goto            97
        //  1051: astore          8
        //  1053: goto            748
        //  1056: astore          9
        //  1058: goto            690
        //  1061: astore          9
        //  1063: goto            370
        //  1066: astore          9
        //  1068: goto            457
        //  1071: astore          9
        //  1073: goto            543
        //  1076: lload           6
        //  1078: lstore          4
        //  1080: aload           9
        //  1082: ifnull          215
        //  1085: goto            309
        //  1088: lload           6
        //  1090: lstore          4
        //  1092: aload           9
        //  1094: ifnull          215
        //  1097: goto            309
        //  1100: astore          8
        //  1102: aload           11
        //  1104: astore          9
        //  1106: aload           10
        //  1108: astore          11
        //  1110: goto            340
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                   
        //  -----  -----  -----  -----  -------------------------------------------------------
        //  44     50     928    936    Landroid/database/sqlite/SQLiteFullException;
        //  44     50     1041   877    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  44     50     769    777    Landroid/database/sqlite/SQLiteException;
        //  44     50     758    769    Any
        //  59     64     100    112    Landroid/database/sqlite/SQLiteFullException;
        //  59     64     1046   100    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  59     64     85     97     Landroid/database/sqlite/SQLiteException;
        //  59     64     76     85     Any
        //  112    124    743    748    Landroid/database/sqlite/SQLiteFullException;
        //  112    124    1046   100    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  112    124    738    743    Landroid/database/sqlite/SQLiteException;
        //  112    124    733    738    Any
        //  166    173    743    748    Landroid/database/sqlite/SQLiteFullException;
        //  166    173    1046   100    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  166    173    738    743    Landroid/database/sqlite/SQLiteException;
        //  166    173    733    738    Any
        //  177    215    721    723    Landroid/database/sqlite/SQLiteFullException;
        //  177    215    1051   1056   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  177    215    709    711    Landroid/database/sqlite/SQLiteException;
        //  177    215    697    699    Any
        //  215    254    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  215    254    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  215    254    347    356    Landroid/database/sqlite/SQLiteException;
        //  215    254    326    340    Any
        //  258    263    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  258    263    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  258    263    347    356    Landroid/database/sqlite/SQLiteException;
        //  258    263    326    340    Any
        //  263    295    1061   394    LB2/b$a;
        //  263    295    365    370    Any
        //  295    300    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  295    300    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  295    300    347    356    Landroid/database/sqlite/SQLiteException;
        //  295    300    326    340    Any
        //  309    319    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  309    319    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  309    319    347    356    Landroid/database/sqlite/SQLiteException;
        //  309    319    326    340    Any
        //  370    382    365    370    Any
        //  382    387    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  382    387    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  382    387    347    356    Landroid/database/sqlite/SQLiteException;
        //  382    387    326    340    Any
        //  394    402    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  394    402    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  394    402    347    356    Landroid/database/sqlite/SQLiteException;
        //  394    402    326    340    Any
        //  407    412    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  407    412    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  407    412    347    356    Landroid/database/sqlite/SQLiteException;
        //  407    412    326    340    Any
        //  412    444    1066   480    LB2/b$a;
        //  412    444    452    457    Any
        //  444    449    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  444    449    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  444    449    347    356    Landroid/database/sqlite/SQLiteException;
        //  444    449    326    340    Any
        //  457    469    452    457    Any
        //  469    474    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  469    474    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  469    474    347    356    Landroid/database/sqlite/SQLiteException;
        //  469    474    326    340    Any
        //  480    488    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  480    488    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  480    488    347    356    Landroid/database/sqlite/SQLiteException;
        //  480    488    326    340    Any
        //  493    498    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  493    498    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  493    498    347    356    Landroid/database/sqlite/SQLiteException;
        //  493    498    326    340    Any
        //  498    530    1071   566    LB2/b$a;
        //  498    530    538    543    Any
        //  530    535    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  530    535    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  530    535    347    356    Landroid/database/sqlite/SQLiteException;
        //  530    535    326    340    Any
        //  543    555    538    543    Any
        //  555    560    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  555    560    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  555    560    347    356    Landroid/database/sqlite/SQLiteException;
        //  555    560    326    340    Any
        //  566    574    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  566    574    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  566    574    347    356    Landroid/database/sqlite/SQLiteException;
        //  566    574    326    340    Any
        //  579    588    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  579    588    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  579    588    347    356    Landroid/database/sqlite/SQLiteException;
        //  579    588    326    340    Any
        //  592    599    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  592    599    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  592    599    347    356    Landroid/database/sqlite/SQLiteException;
        //  592    599    326    340    Any
        //  606    615    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  606    615    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  606    615    347    356    Landroid/database/sqlite/SQLiteException;
        //  606    615    326    340    Any
        //  622    665    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  622    665    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  622    665    347    356    Landroid/database/sqlite/SQLiteException;
        //  622    665    326    340    Any
        //  665    675    356    365    Landroid/database/sqlite/SQLiteFullException;
        //  665    675    1056   697    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  665    675    347    356    Landroid/database/sqlite/SQLiteException;
        //  665    675    326    340    Any
        //  790    798    1100   1113   Any
        //  806    811    1100   1113   Any
        //  822    836    1100   1113   Any
        //  844    849    1100   1113   Any
        //  889    894    1100   1113   Any
        //  944    958    1100   1113   Any
        //  966    971    1100   1113   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 520 out of bounds for length 520
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
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
    
    public final boolean D(int i, byte[] k) {
        this.n();
        if (this.d) {
            return false;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", k);
        int n = 0;
        int n2 = 5;
        Object o;
        Cursor cursor;
        Cursor cursor2;
        Object o2;
        Object o3;
        long long1;
        Label_0543_Outer:Block_33_Outer:Label_0475_Outer:Label_0467_Outer:Block_31_Outer:
        while (true) {
            Label_0578: {
                if (n >= 5) {
                    break Label_0578;
                }
                o = null;
                cursor = null;
                cursor2 = null;
                o2 = null;
                o3 = null;
                Label_0434: {
                    try {
                        k = (byte[])(Object)this.K();
                        if (k != null) {
                            goto Label_0125;
                        }
                        o2 = o3;
                        o = k;
                        try {
                            try {
                                this.d = true;
                                if (k != null) {
                                    ((SQLiteClosable)(Object)k).close();
                                }
                                return false;
                            }
                            finally {}
                        }
                        catch (SQLiteException o) {
                            o3 = null;
                        }
                        catch (SQLiteFullException o3) {
                            break Label_0434;
                        }
                        catch (SQLiteDatabaseLockedException o) {
                            o3 = cursor;
                            break Label_0434;
                        }
                        try {
                            if (((Cursor)o3).moveToFirst()) {
                                long1 = ((Cursor)o3).getLong(0);
                                goto Label_0217;
                            }
                            goto Label_0214;
                        }
                        catch (SQLiteException ex) {}
                        catch (SQLiteFullException ex2) {}
                        catch (SQLiteDatabaseLockedException ex3) {}
                    }
                    catch (SQLiteException ex4) {}
                    catch (SQLiteFullException ex5) {}
                    catch (SQLiteDatabaseLockedException ex6) {}
                    try {
                        if (((SQLiteDatabase)o).inTransaction()) {
                            ((SQLiteDatabase)o).endTransaction();
                        }
                        this.j().G().b("Error writing entry to local database", o2);
                        this.d = true;
                        if (k != null) {
                            ((Cursor)(Object)k).close();
                        }
                        i = n2;
                        if (o != null) {
                            ((SQLiteClosable)o).close();
                            i = n2;
                        }
                        // iftrue(Label_0566:, o2 == null)
                        // iftrue(Label_0467:, o3 == null)
                        // iftrue(Label_0543:, k == null)
                        // iftrue(Label_0576:, o == null)
                        // iftrue(Label_0532:, cursor2 == null)
                        // iftrue(Label_0543:, k == null)
                        while (true) {
                        Label_0532:
                            while (true) {
                                Block_27: {
                                Block_30:
                                    while (true) {
                                        Label_0576: {
                                            while (true) {
                                                while (true) {
                                                    ++n;
                                                    n2 = i;
                                                    continue Label_0543_Outer;
                                                    k = null;
                                                    o3 = cursor;
                                                    break Label_0434;
                                                    ((SQLiteClosable)o).close();
                                                    break Label_0576;
                                                    ((SQLiteClosable)(Object)k).close();
                                                    continue Block_33_Outer;
                                                }
                                                Block_32: {
                                                    break Block_32;
                                                    long1 = n2;
                                                    o2 = o3;
                                                    o = k;
                                                    SystemClock.sleep(long1);
                                                    n2 += 20;
                                                    break Block_27;
                                                }
                                                ((Cursor)o2).close();
                                                Label_0566: {
                                                    break Label_0566;
                                                    i = n2;
                                                    break Label_0576;
                                                }
                                                continue Label_0475_Outer;
                                            }
                                            o2 = cursor2;
                                            o = k;
                                            this.j().G().b("Error writing entry; local database full", o3);
                                            o2 = cursor2;
                                            o = k;
                                            this.d = true;
                                            break Block_30;
                                            i = n2;
                                            continue Label_0467_Outer;
                                        }
                                        i = n2;
                                        continue Label_0467_Outer;
                                    }
                                    cursor2.close();
                                    break Label_0532;
                                }
                                ((Cursor)o3).close();
                                continue Block_31_Outer;
                            }
                            i = n2;
                            continue;
                        }
                        this.j().K().a("Failed to write entry to local database");
                        return false;
                    }
                    finally {
                        o3 = k;
                        goto Label_0186;
                    }
                }
            }
        }
    }
    
    public final boolean E(final e e) {
        this.k();
        final byte[] p = S5.p0((Parcelable)e);
        if (p.length > 131072) {
            this.j().I().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.D(2, p);
    }
    
    public final boolean F(final I i) {
        final Parcel obtain = Parcel.obtain();
        i.writeToParcel(obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.j().I().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.D(0, marshall);
    }
    
    public final boolean G(final R5 r5) {
        final Parcel obtain = Parcel.obtain();
        r5.writeToParcel(obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.j().I().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.D(1, marshall);
    }
    
    public final void H() {
        this.n();
        Label_0049: {
            try {
                final SQLiteDatabase k = this.K();
                if (k != null) {
                    final int delete = k.delete("messages", (String)null, (String[])null);
                    if (delete > 0) {
                        this.j().K().b("Reset local analytics data. records", delete);
                        return;
                    }
                }
            }
            catch (SQLiteException ex) {
                break Label_0049;
            }
            return;
        }
        final SQLiteException ex;
        this.j().G().b("Error resetting local analytics data. error", ex);
    }
    
    public final boolean I() {
        return this.D(3, new byte[0]);
    }
    
    public final boolean J() {
        this.n();
        if (this.d) {
            return false;
        }
        if (!this.L()) {
            return false;
        }
        int n = 5;
        int i = 0;
        Object o;
        Object o2;
        SQLiteDatabase k;
        Object o3 = null;
        int n2 = 0;
        final SQLiteException ex;
        final SQLiteDatabase sqLiteDatabase;
        Block_15_Outer:Label_0355_Outer:Label_0236_Outer:Label_0276_Outer:
        while (i < 5) {
            o = null;
            o2 = null;
            while (true) {
                try {
                    Label_0102: {
                        try {
                            k = this.K();
                            if (k == null) {
                                o2 = k;
                                o = k;
                                this.d = true;
                                if (k != null) {
                                    ((SQLiteClosable)k).close();
                                }
                                return false;
                            }
                            break Label_0102;
                        }
                        finally {
                            if (o2 != null) {
                                ((SQLiteClosable)o2).close();
                            }
                            // iftrue(Label_0355:, sqLiteDatabase == null)
                            // iftrue(Label_0355:, o == null)
                            // iftrue(Label_0236:, sqLiteDatabase == null || !sqLiteDatabase.inTransaction())
                        Block_14:
                            while (true) {
                                while (true) {
                                Label_0303:
                                    while (true) {
                                        o3 = o;
                                        n2 = n2;
                                        break Label_0303;
                                        k.beginTransaction();
                                        k.delete("messages", "type == ?", new String[] { Integer.toString(3) });
                                        k.setTransactionSuccessful();
                                        k.endTransaction();
                                        ((SQLiteClosable)k).close();
                                        return true;
                                        ++i;
                                        n = n2;
                                        continue Block_15_Outer;
                                        this.j().G().b("Error deleting app launch break from local database", ex);
                                        this.d = true;
                                        n2 = n;
                                        break Block_14;
                                        SystemClock.sleep((long)n);
                                        n2 = n + 20;
                                        continue Label_0355_Outer;
                                    }
                                    ((SQLiteClosable)o3).close();
                                    continue Label_0236_Outer;
                                }
                                sqLiteDatabase.endTransaction();
                                continue Label_0276_Outer;
                            }
                        }
                    }
                }
                catch (SQLiteException ex2) {}
                catch (SQLiteFullException ex3) {}
                catch (SQLiteDatabaseLockedException ex4) {}
                continue;
            }
        }
        goto Label_0377;
    }
    
    public final SQLiteDatabase K() {
        if (this.d) {
            return null;
        }
        final SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase == null) {
            this.d = true;
            return null;
        }
        return writableDatabase;
    }
}
