/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal.outcomes.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2={"Lcom/onesignal/outcomes/data/OutcomesDbContract;", "", "()V", "CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_INFLUENCE_ID", "", "CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_TYPE", "CACHE_UNIQUE_OUTCOME_TABLE", "FLOAT_TYPE", "INTEGER_PRIMARY_KEY_TYPE", "INT_TYPE", "OUTCOME_EVENT_TABLE", "SQL_CREATE_OUTCOME_ENTRIES_V1", "SQL_CREATE_OUTCOME_ENTRIES_V2", "SQL_CREATE_OUTCOME_ENTRIES_V3", "SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V1", "SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2", "TEXT_TYPE", "TIMESTAMP_TYPE", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OutcomesDbContract {
    @NotNull
    public static final String CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_INFLUENCE_ID = "channel_influence_id";
    @NotNull
    public static final String CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_TYPE = "channel_type";
    @NotNull
    public static final String CACHE_UNIQUE_OUTCOME_TABLE = "cached_unique_outcome";
    @NotNull
    private static final String FLOAT_TYPE = " FLOAT";
    @NotNull
    public static final OutcomesDbContract INSTANCE = new OutcomesDbContract();
    @NotNull
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    @NotNull
    private static final String INT_TYPE = " INTEGER";
    @NotNull
    public static final String OUTCOME_EVENT_TABLE = "outcome";
    @NotNull
    public static final String SQL_CREATE_OUTCOME_ENTRIES_V1 = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);";
    @NotNull
    public static final String SQL_CREATE_OUTCOME_ENTRIES_V2 = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);";
    @NotNull
    public static final String SQL_CREATE_OUTCOME_ENTRIES_V3 = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);";
    @NotNull
    public static final String SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V1 = "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);";
    @NotNull
    public static final String SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2 = "CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);";
    @NotNull
    private static final String TEXT_TYPE = " TEXT";
    @NotNull
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";

    private OutcomesDbContract() {
    }
}

