/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.rtm.client.DataSender
 *  com.yandex.metrica.rtm.client.IServiceReporter
 *  com.yandex.metrica.rtm.client.ReporterDescriptor
 *  com.yandex.metrica.rtm.client.Utils
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.rtm.wrapper;

import androidx.annotation.NonNull;
import com.yandex.metrica.rtm.client.DataSender;
import com.yandex.metrica.rtm.client.IServiceReporter;
import com.yandex.metrica.rtm.client.ReporterDescriptor;
import com.yandex.metrica.rtm.client.Utils;
import com.yandex.metrica.rtm.wrapper.b;
import com.yandex.metrica.rtm.wrapper.d;
import com.yandex.metrica.rtm.wrapper.k;
import com.yandex.metrica.rtm.wrapper.m;
import org.json.JSONObject;

public class g
implements d {
    @NonNull
    private final DataSender a;

    public g(@NonNull b b4) throws Throwable {
        this.a = b4.a();
    }

    public g(@NonNull k k10, @NonNull String string, boolean bl2) throws Throwable {
        this(new b(new DataSender((IServiceReporter)new m(k10), new ReporterDescriptor(string, bl2))));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void reportError(@NonNull JSONObject jSONObject) {
        try {
            this.a.sendData(jSONObject.toString(), "com.yandex.metrica.rtm.REPORT_ERROR");
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void reportEvent(@NonNull JSONObject jSONObject) {
        try {
            this.a.sendData(jSONObject.toString(), "com.yandex.metrica.rtm.REPORT_EVENT");
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void reportException(@NonNull String string, @NonNull String string2) {
        try {
            DataSender dataSender = this.a;
            JSONObject jSONObject = new JSONObject();
            dataSender.sendData(jSONObject.put("message", (Object)string).put("exception", (Object)string2).toString(), "com.yandex.metrica.rtm.REPORT_EXCEPTION");
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void reportException(@NonNull String string, @NonNull Throwable throwable) {
        try {
            DataSender dataSender = this.a;
            String string2 = Utils.getShrunkStacktrace((Throwable)throwable);
            throwable = new JSONObject();
            dataSender.sendData(throwable.put("message", (Object)string).put("exception", (Object)string2).toString(), "com.yandex.metrica.rtm.REPORT_EXCEPTION");
            return;
        }
        catch (Throwable throwable2) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void sendData(@NonNull String string) {
        try {
            this.a.sendData(string, "com.yandex.metrica.rtm.SET_DATA");
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

