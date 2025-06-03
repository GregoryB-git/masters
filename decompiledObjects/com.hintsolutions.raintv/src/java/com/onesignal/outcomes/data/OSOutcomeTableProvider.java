/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal.outcomes.data;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.onesignal.influence.domain.OSInfluenceChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeTableProvider;", "", "()V", "upgradeCacheOutcomeTableRevision1To2", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "upgradeOutcomeTableRevision1To2", "upgradeOutcomeTableRevision2To3", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSOutcomeTableProvider {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void upgradeCacheOutcomeTableRevision1To2(@NotNull SQLiteDatabase sQLiteDatabase) {
        Throwable throwable2;
        block4: {
            Intrinsics.checkNotNullParameter((Object)sQLiteDatabase, (String)"db");
            String string2 = Intrinsics.stringPlus((String)"_id,name", (Object)",notification_id");
            String string3 = Intrinsics.stringPlus((String)"_id,name", (Object)",channel_influence_id");
            try {
                try {
                    sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                    sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("INSERT INTO cached_unique_outcome(");
                    stringBuilder.append(string3);
                    stringBuilder.append(") SELECT ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" FROM ");
                    stringBuilder.append("cached_unique_outcome_notification");
                    stringBuilder.append(';');
                    sQLiteDatabase.execSQL(stringBuilder.toString());
                    string3 = new StringBuilder();
                    string3.append("UPDATE cached_unique_outcome SET channel_type = '");
                    string3.append((Object)OSInfluenceChannel.NOTIFICATION);
                    string3.append("';");
                    sQLiteDatabase.execSQL(string3.toString());
                    sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteException.printStackTrace();
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            sQLiteDatabase.execSQL("COMMIT;");
            return;
        }
        sQLiteDatabase.execSQL("COMMIT;");
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void upgradeOutcomeTableRevision1To2(@NotNull SQLiteDatabase sQLiteDatabase) {
        Throwable throwable2;
        block4: {
            Intrinsics.checkNotNullParameter((Object)sQLiteDatabase, (String)"db");
            try {
                try {
                    sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                    sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                    sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                    sQLiteDatabase.execSQL("DROP TABLE outcome;");
                    sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                    sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                    sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteException.printStackTrace();
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            sQLiteDatabase.execSQL("COMMIT;");
            return;
        }
        sQLiteDatabase.execSQL("COMMIT;");
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void upgradeOutcomeTableRevision2To3(@NotNull SQLiteDatabase sQLiteDatabase) {
        Throwable throwable2;
        block4: {
            Intrinsics.checkNotNullParameter((Object)sQLiteDatabase, (String)"db");
            String string2 = Intrinsics.stringPlus((String)"_id,name,timestamp,notification_ids,weight", (Object)",session");
            String string3 = Intrinsics.stringPlus((String)"_id,name,timestamp,notification_ids,weight", (Object)",notification_influence_type");
            try {
                try {
                    sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                    sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                    sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("INSERT INTO outcome(");
                    stringBuilder.append(string3);
                    stringBuilder.append(") SELECT ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" FROM ");
                    stringBuilder.append("outcome_aux");
                    stringBuilder.append(';');
                    sQLiteDatabase.execSQL(stringBuilder.toString());
                    sQLiteDatabase.execSQL("DROP TABLE outcome_aux;");
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteException.printStackTrace();
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            sQLiteDatabase.execSQL("COMMIT;");
            return;
        }
        sQLiteDatabase.execSQL("COMMIT;");
        throw throwable2;
    }
}

