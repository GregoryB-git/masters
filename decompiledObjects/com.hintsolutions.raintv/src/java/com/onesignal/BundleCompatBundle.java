/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.onesignal.BundleCompat;

class BundleCompatBundle
implements BundleCompat<Bundle> {
    private Bundle mBundle;

    public BundleCompatBundle() {
        this.mBundle = new Bundle();
    }

    public BundleCompatBundle(Intent intent) {
        this.mBundle = intent.getExtras();
    }

    public BundleCompatBundle(Bundle bundle) {
        this.mBundle = bundle;
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
    public Bundle getBundle() {
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
        this.mBundle = (Bundle)parcelable;
    }
}

