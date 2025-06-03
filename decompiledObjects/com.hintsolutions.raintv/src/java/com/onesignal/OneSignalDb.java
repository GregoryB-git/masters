/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.SQLException
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface OneSignalDb {
    public void delete(@NonNull String var1, @Nullable String var2, @Nullable String[] var3);

    public void insert(@NonNull String var1, @Nullable String var2, @Nullable ContentValues var3);

    public void insertOrThrow(@NonNull String var1, @Nullable String var2, @Nullable ContentValues var3) throws SQLException;

    public Cursor query(@NonNull String var1, @Nullable String[] var2, @Nullable String var3, String[] var4, @Nullable String var5, @Nullable String var6, @Nullable String var7);

    public Cursor query(@NonNull String var1, @Nullable String[] var2, @Nullable String var3, @Nullable String[] var4, @Nullable String var5, @Nullable String var6, @Nullable String var7, @Nullable String var8);

    public int update(@NonNull String var1, @NonNull ContentValues var2, @Nullable String var3, @Nullable String[] var4);
}

