/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

public interface OSSharedPreferences {
    public boolean getBool(String var1, String var2, boolean var3);

    public int getInt(String var1, String var2, int var3);

    public long getLong(String var1, String var2, long var3);

    public Object getObject(String var1, String var2, Object var3);

    public String getOutcomesV2KeyName();

    public String getPreferencesName();

    public String getString(String var1, String var2, String var3);

    @Nullable
    public Set<String> getStringSet(@NonNull String var1, @NonNull String var2, @Nullable Set<String> var3);

    public void saveBool(String var1, String var2, boolean var3);

    public void saveInt(String var1, String var2, int var3);

    public void saveLong(String var1, String var2, long var3);

    public void saveObject(String var1, String var2, Object var3);

    public void saveString(String var1, String var2, String var3);

    public void saveStringSet(@NonNull String var1, @NonNull String var2, @NonNull Set<String> var3);
}

