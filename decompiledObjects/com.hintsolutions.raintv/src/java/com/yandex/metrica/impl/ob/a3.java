/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 *  android.os.ResultReceiver
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.f0
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.UUID
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.f0;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class A3
implements Parcelable {
    public static final Parcelable.Creator<A3> CREATOR;
    public static final String c;
    @NonNull
    private final ContentValues a;
    @Nullable
    private ResultReceiver b;

    static {
        c = UUID.randomUUID().toString();
        CREATOR = new Parcelable.Creator<A3>(){

            public Object createFromParcel(Parcel parcel) {
                parcel = parcel.readBundle(f0.class.getClassLoader());
                return new A3((ContentValues)parcel.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver)parcel.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
            }

            public Object[] newArray(int n2) {
                return new A3[n2];
            }
        };
    }

    public A3(@NonNull ContentValues contentValues, @Nullable ResultReceiver resultReceiver) {
        ContentValues contentValues2 = contentValues;
        if (contentValues == null) {
            contentValues2 = new ContentValues();
        }
        this.a = contentValues2;
        this.b = resultReceiver;
    }

    public A3(Context context, @Nullable ResultReceiver resultReceiver) {
        ContentValues contentValues;
        this.a = contentValues = new ContentValues();
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf((int)Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf((int)YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.b = resultReceiver;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public A3(A3 a3) {
        A3 a32 = a3;
        synchronized (a32) {
            ContentValues contentValues;
            this.a = contentValues = new ContentValues(a3.a);
            this.b = a3.b;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static A3 a(Bundle object) {
        if (object == null) return null;
        try {
            return (A3)object.getParcelable("PROCESS_CFG_OBJ");
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(@NonNull i object) {
        if (!A2.a((Object)((i)object).c)) return;
        object = ((i)object).c;
        A3 a3 = this;
        synchronized (a3) {
            this.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", (String)object);
        }
        a3 = this;
        synchronized (a3) {
            this.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            return;
        }
    }

    @Nullable
    public Map<String, String> a() {
        return Gl.d(this.a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public void a(@Nullable String string) {
        A3 a3 = this;
        synchronized (a3) {
            this.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", string);
            return;
        }
    }

    public void a(@Nullable List<String> list) {
        A3 a3 = this;
        synchronized (a3) {
            this.a.put("PROCESS_CFG_CUSTOM_HOSTS", Gl.c(list));
            return;
        }
    }

    public void a(@Nullable Map<String, String> map) {
        A3 a3 = this;
        synchronized (a3) {
            this.a.put("PROCESS_CFG_CLIDS", Gl.g(map));
            return;
        }
    }

    @Nullable
    public List<String> b() {
        Object object = this.a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        object = TextUtils.isEmpty((CharSequence)object) ? null : Gl.c((String)object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b(@Nullable i i2) {
        List<String> list;
        A3 a3 = this;
        // MONITORENTER : a3
        if (A2.a(i2.d)) {
            list = i2.d;
            a3 = this;
            // MONITORENTER : a3
            this.a.put("PROCESS_CFG_CUSTOM_HOSTS", Gl.c(list));
            // MONITOREXIT : a3
        }
        if (A2.a(i2.b)) {
            list = Gl.i(i2.b);
            a3 = this;
            // MONITORENTER : a3
            this.a.put("PROCESS_CFG_CLIDS", Gl.g(list));
            // MONITOREXIT : a3
        }
        this.a(i2);
        // MONITOREXIT : a3
    }

    public void b(@Nullable String string) {
        A3 a3 = this;
        synchronized (a3) {
            this.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", string);
            return;
        }
    }

    @Nullable
    public ResultReceiver c() {
        return this.b;
    }

    @Nullable
    public String d() {
        return this.a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public int describeContents() {
        return 0;
    }

    @Nullable
    public String e() {
        return this.a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    @NonNull
    public String f() {
        return this.a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    @NonNull
    public Integer g() {
        return this.a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    @NonNull
    public String h() {
        return this.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public int i() {
        return this.a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL");
    }

    public boolean j() {
        return this.a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ProcessConfiguration{mParamsMapping=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mDataResultReceiver=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", (Parcelable)this.a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", (Parcelable)this.b);
        parcel.writeBundle(bundle);
    }
}

