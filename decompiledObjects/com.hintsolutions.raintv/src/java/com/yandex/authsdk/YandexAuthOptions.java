/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.authsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class YandexAuthOptions
implements Parcelable {
    public static final Parcelable.Creator<YandexAuthOptions> CREATOR = new Parcelable.Creator<YandexAuthOptions>(){

        @NonNull
        public YandexAuthOptions createFromParcel(@NonNull Parcel parcel) {
            return new YandexAuthOptions(parcel);
        }

        @NonNull
        public YandexAuthOptions[] newArray(int n) {
            return new YandexAuthOptions[n];
        }
    };
    @NonNull
    private final String clientId;
    @Nullable
    private final Context context;
    private final boolean loggingEnabled;

    public YandexAuthOptions(@NonNull Context context, boolean bl) {
        Object object;
        try {
            object = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new RuntimeException((Throwable)nameNotFoundException);
        }
        object = object.metaData.getString("com.yandex.auth.CLIENT_ID");
        if (object != null) {
            this.clientId = object;
            this.loggingEnabled = bl;
            this.context = context;
            return;
        }
        throw new IllegalStateException(String.format((String)"Application should provide %s in AndroidManifest.xml", (Object[])new Object[]{"com.yandex.auth.CLIENT_ID"}));
    }

    public YandexAuthOptions(@NonNull Parcel parcel) {
        this.clientId = parcel.readString();
        boolean bl = parcel.readByte() != 0;
        this.loggingEnabled = bl;
        this.context = null;
    }

    public int describeContents() {
        return 0;
    }

    @NonNull
    public String getClientId() {
        return this.clientId;
    }

    @Deprecated
    @Nullable
    public Context getContext() {
        return this.context;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public void writeToParcel(@NonNull Parcel parcel, int n) {
        parcel.writeString(this.clientId);
        parcel.writeByte((byte)(this.loggingEnabled ? 1 : 0));
    }
}

