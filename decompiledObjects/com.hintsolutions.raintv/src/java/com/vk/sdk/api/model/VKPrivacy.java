/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import org.json.JSONObject;

public class VKPrivacy {
    public static final int PRIVACY_ALL = 0;
    public static final int PRIVACY_FRIENDS = 1;
    public static final int PRIVACY_FRIENDS_OF_FRIENDS = 2;
    public static final int PRIVACY_NOBODY = 3;
    public static final int PRIVACY_UNKNOWN = 4;

    public static int parsePrivacy(JSONObject object) {
        int n;
        int n3 = n = 0;
        if (object != null) {
            n3 = "all".equals(object = object.optString("type")) ? n : ("friends".equals(object) ? 1 : ("friends_of_friends".equals(object) ? 2 : ("nobody".equals(object) ? 3 : 4)));
        }
        return n3;
    }
}

