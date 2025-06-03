/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  android.os.PersistableBundle
 *  androidx.annotation.RequiresApi
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.onesignal;

import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import com.onesignal.BundleCompat;

@RequiresApi(api=22)
class BundleCompatPersistableBundle
implements BundleCompat<PersistableBundle> {
    private PersistableBundle mBundle;

    public BundleCompatPersistableBundle() {
        this.mBundle = new PersistableBundle();
    }

    public BundleCompatPersistableBundle(PersistableBundle persistableBundle) {
        this.mBundle = persistableBundle;
    }

    @Override
    public boolean containsKey(String string) {
        return this.mBundle.containsKey(string);
    }

    @Override
    public boolean getBoolean(String string) {
        return this.mBundle.getBoolean(string);
    }

    @Override
    public boolean getBoolean(String string, boolean bl) {
        return this.mBundle.getBoolean(string, bl);
    }

    @Override
    public PersistableBundle getBundle() {
        return this.mBundle;
    }

    @Override
    public Integer getInt(String string) {
        return this.mBundle.getInt(string);
    }

    @Override
    public Long getLong(String string) {
        return this.mBundle.getLong(string);
    }

    @Override
    public String getString(String string) {
        return this.mBundle.getString(string);
    }

    @Override
    public void putBoolean(String string, Boolean bl) {
        this.mBundle.putBoolean(string, bl.booleanValue());
    }

    @Override
    public void putInt(String string, Integer n) {
        this.mBundle.putInt(string, n.intValue());
    }

    @Override
    public void putLong(String string, Long l) {
        this.mBundle.putLong(string, l.longValue());
    }

    @Override
    public void putString(String string, String string2) {
        this.mBundle.putString(string, string2);
    }

    @Override
    public void setBundle(Parcelable parcelable) {
        this.mBundle = (PersistableBundle)parcelable;
    }
}

