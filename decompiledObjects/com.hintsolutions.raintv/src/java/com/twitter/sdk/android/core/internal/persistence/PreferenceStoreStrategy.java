/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.SharedPreferences
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.persistence;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.twitter.sdk.android.core.internal.persistence.PersistenceStrategy;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;

public class PreferenceStoreStrategy<T>
implements PersistenceStrategy<T> {
    private final String key;
    private final SerializationStrategy<T> serializer;
    private final PreferenceStore store;

    public PreferenceStoreStrategy(PreferenceStore preferenceStore, SerializationStrategy<T> serializationStrategy, String string2) {
        this.store = preferenceStore;
        this.serializer = serializationStrategy;
        this.key = string2;
    }

    @Override
    @SuppressLint(value={"CommitPrefEdits"})
    public void clear() {
        this.store.edit().remove(this.key).commit();
    }

    @Override
    public T restore() {
        SharedPreferences sharedPreferences = this.store.get();
        return this.serializer.deserialize(sharedPreferences.getString(this.key, null));
    }

    @Override
    @SuppressLint(value={"CommitPrefEdits"})
    public void save(T t) {
        PreferenceStore preferenceStore = this.store;
        preferenceStore.save(preferenceStore.edit().putString(this.key, this.serializer.serialize(t)));
    }
}

