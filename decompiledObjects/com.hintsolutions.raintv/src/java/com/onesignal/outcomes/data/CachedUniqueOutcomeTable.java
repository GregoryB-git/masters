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

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/onesignal/outcomes/data/CachedUniqueOutcomeTable;", "", "()V", "COLUMN_CHANNEL_INFLUENCE_ID", "", "COLUMN_CHANNEL_TYPE", "COLUMN_NAME_NAME", "COLUMN_NAME_NOTIFICATION_ID", "ID", "TABLE_NAME", "TABLE_NAME_V1", "TABLE_NAME_V2", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class CachedUniqueOutcomeTable {
    @NotNull
    public static final String COLUMN_CHANNEL_INFLUENCE_ID = "channel_influence_id";
    @NotNull
    public static final String COLUMN_CHANNEL_TYPE = "channel_type";
    @NotNull
    public static final String COLUMN_NAME_NAME = "name";
    @NotNull
    public static final String COLUMN_NAME_NOTIFICATION_ID = "notification_id";
    @NotNull
    public static final String ID = "_id";
    @NotNull
    public static final CachedUniqueOutcomeTable INSTANCE = new CachedUniqueOutcomeTable();
    @NotNull
    public static final String TABLE_NAME = "cached_unique_outcome";
    @NotNull
    public static final String TABLE_NAME_V1 = "cached_unique_outcome_notification";
    @NotNull
    public static final String TABLE_NAME_V2 = "cached_unique_outcome";

    private CachedUniqueOutcomeTable() {
    }
}

