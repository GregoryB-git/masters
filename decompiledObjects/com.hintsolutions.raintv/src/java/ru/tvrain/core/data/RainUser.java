/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package ru.tvrain.core.data;

import java.util.HashMap;

public class RainUser {
    public String device_token;
    public HashMap<String, String> onesignal_tags;
    public String user_id;

    public String getDeviceToken() {
        return this.device_token;
    }

    public boolean isAuthorized() {
        boolean bl = this.user_id != null && this.device_token != null;
        return bl;
    }
}

