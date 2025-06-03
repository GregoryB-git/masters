/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteCantOpenDatabaseException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.os.SystemClock
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSLogWrapper;
import com.onesignal.OSLogger;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.outcomes.data.OSOutcomeTableProvider;
import java.util.ArrayList;

class OneSignalDbHelper
extends SQLiteOpenHelper
implements OneSignalDb {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    public static final int DATABASE_VERSION = 8;
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final Object LOCK = new Object();
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    public static final String[] SQL_INDEX_ENTRIES = new String[]{"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private static OSLogger logger = new OSLogWrapper();
    private static OSOutcomeTableProvider outcomeTableProvider = new OSOutcomeTableProvider();
    private static OneSignalDbHelper sInstance;

    public OneSignalDbHelper(Context context) {
        super(context, DATABASE_NAME, null, OneSignalDbHelper.getDbVersion());
    }

    private static int getDbVersion() {
        return 8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OneSignalDbHelper getInstance(Context context) {
        Object object;
        if (sInstance != null) return sInstance;
        Object object2 = object = LOCK;
        synchronized (object2) {
            OneSignalDbHelper oneSignalDbHelper;
            if (sInstance != null) return sInstance;
            sInstance = oneSignalDbHelper = new OneSignalDbHelper(context.getApplicationContext());
            return sInstance;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private SQLiteDatabase getSQLiteDatabase() {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            try {
                void var1_7;
                try {
                    return this.getWritableDatabase();
                }
                catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
                    throw var1_7;
                }
                catch (SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {
                    // empty catch block
                    throw var1_7;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private SQLiteDatabase getSQLiteDatabaseWithRetries() {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            Throwable throwable2;
            SQLiteDatabase sQLiteDatabase = null;
            int n = 0;
            while (true) {
                try {
                    return this.getSQLiteDatabase();
                }
                catch (Throwable throwable2) {
                    break;
                }
                catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
                }
                catch (SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {
                    // empty catch block
                }
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                if (sQLiteDatabase == null) {
                    SQLiteDatabase sQLiteDatabase3;
                    sQLiteDatabase2 = sQLiteDatabase3;
                }
                if (++n >= 5) throw sQLiteDatabase2;
                {
                    SystemClock.sleep((long)(n * 400));
                    sQLiteDatabase = sQLiteDatabase2;
                    continue;
                }
                break;
            }
            throw throwable2;
        }
    }

    private void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int n) {
        if (n < 2) {
            OneSignalDbHelper.upgradeToV2(sQLiteDatabase);
        }
        if (n < 3) {
            OneSignalDbHelper.upgradeToV3(sQLiteDatabase);
        }
        if (n < 4) {
            OneSignalDbHelper.upgradeToV4(sQLiteDatabase);
        }
        if (n < 5) {
            OneSignalDbHelper.upgradeToV5(sQLiteDatabase);
        }
        if (n == 5) {
            OneSignalDbHelper.upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (n < 7) {
            OneSignalDbHelper.upgradeToV7(sQLiteDatabase);
        }
        if (n < 8) {
            this.upgradeToV8(sQLiteDatabase);
        }
    }

    public static StringBuilder recentUninteractedWithNotificationsWhere() {
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("created_time > ");
        stringBuilder.append(l - 604800L);
        stringBuilder.append(" AND ");
        stringBuilder.append("dismissed");
        a.C(stringBuilder, " = 0 AND ", "opened", " = 0 AND ", "is_summary");
        stringBuilder.append(" = 0");
        stringBuilder = new StringBuilder(stringBuilder.toString());
        if (OneSignal.getRemoteParamController().isRestoreTTLFilterActive()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" AND expire_time > ");
            stringBuilder2.append(l);
            stringBuilder.append(stringBuilder2.toString());
        }
        return stringBuilder;
    }

    private static void safeExecSQL(SQLiteDatabase sQLiteDatabase, String string2) {
        try {
            sQLiteDatabase.execSQL(string2);
        }
        catch (SQLiteException sQLiteException) {
            sQLiteException.printStackTrace();
        }
    }

    private static void upgradeFromV5ToV6(SQLiteDatabase sQLiteDatabase) {
        outcomeTableProvider.upgradeOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private static void upgradeToV2(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    private static void upgradeToV3(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    private static void upgradeToV4(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    private static void upgradeToV5(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        OneSignalDbHelper.upgradeFromV5ToV6(sQLiteDatabase);
    }

    private static void upgradeToV7(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        outcomeTableProvider.upgradeOutcomeTableRevision2To3(sQLiteDatabase);
        outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(sQLiteDatabase);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void delete(@NonNull String var1_1, @Nullable String var2_11, @Nullable String[] var3_14) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [11 : 86->163)] java.lang.Throwable
         *     at kb.g.H1(SourceFile:239)
         *     at ib.f.d(SourceFile:57)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    @Override
    public void insert(@NonNull String var1_1, @Nullable String var2_11, @Nullable ContentValues var3_14) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [11 : 86->163)] java.lang.Throwable
         *     at kb.g.H1(SourceFile:239)
         *     at ib.f.d(SourceFile:57)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    @Override
    public void insertOrThrow(@NonNull String var1_1, @Nullable String var2_11, @Nullable ContentValues var3_14) throws SQLException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [11 : 86->163)] java.lang.Throwable
         *     at kb.g.H1(SourceFile:239)
         *     at ib.f.d(SourceFile:57)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
            String[] stringArray = SQL_INDEX_ENTRIES;
            int n = stringArray.length;
            int n2 = 0;
            while (n2 < n) {
                sQLiteDatabase.execSQL(stringArray[n2]);
                ++n2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
        Object object;
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        Object object2 = object = LOCK;
        synchronized (object2) {
            Cursor cursor = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add((Object)cursor.getString(0));
            }
            for (String string2 : arrayList) {
                if (string2.startsWith("sqlite_")) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DROP TABLE IF EXISTS ");
                stringBuilder.append(string2);
                sQLiteDatabase.execSQL(stringBuilder.toString());
            }
            this.onCreate(sQLiteDatabase);
            return;
            finally {
                cursor.close();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
        Object object = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal Database onUpgrade from: ");
        stringBuilder.append(n);
        stringBuilder.append(" to: ");
        stringBuilder.append(n2);
        OneSignal.Log(object, stringBuilder.toString());
        Object object2 = object = LOCK;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        this.internalOnUpgrade(sQLiteDatabase, n);
                    }
                    catch (SQLiteException sQLiteException) {
                        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error in upgrade, migration may have already run! Skipping!", sQLiteException);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Cursor query(@NonNull String string2, @Nullable String[] stringArray, @Nullable String string3, String[] stringArray2, @Nullable String string4, @Nullable String string5, @Nullable String string6) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return this.getSQLiteDatabaseWithRetries().query(string2, stringArray, string3, stringArray2, string4, string5, string6);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Cursor query(@NonNull String string2, @Nullable String[] stringArray, @Nullable String string3, @Nullable String[] stringArray2, @Nullable String string4, @Nullable String string5, @Nullable String string6, @Nullable String string7) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return this.getSQLiteDatabaseWithRetries().query(string2, stringArray, string3, stringArray2, string4, string5, string6, string7);
        }
    }

    public void setOutcomeTableProvider(OSOutcomeTableProvider oSOutcomeTableProvider) {
        outcomeTableProvider = oSOutcomeTableProvider;
    }

    /*
     * Exception decompiling
     */
    @Override
    public int update(@NonNull String var1_1, @NonNull ContentValues var2_11, @Nullable String var3_15, @Nullable String[] var4_16) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [17 : 151->228)] java.lang.Throwable
         *     at kb.g.H1(SourceFile:239)
         *     at ib.f.d(SourceFile:57)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

