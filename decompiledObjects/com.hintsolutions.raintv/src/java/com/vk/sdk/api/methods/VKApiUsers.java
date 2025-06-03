/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.model.VKApiUserFull
 *  com.vk.sdk.api.model.VKUsersArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKParser;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VKApiUserFull;
import com.vk.sdk.api.model.VKList;
import com.vk.sdk.api.model.VKUsersArray;
import org.json.JSONObject;

public class VKApiUsers
extends VKApiBase {
    public VKRequest get() {
        return this.get(null);
    }

    public VKRequest get(VKParameters vKParameters) {
        return this.prepareRequest("get", vKParameters, new VKParser(this){
            public final VKApiUsers this$0;
            {
                this.this$0 = vKApiUsers;
            }

            @Override
            public Object createModel(JSONObject jSONObject) {
                return new VKList<VKApiUserFull>(jSONObject, VKApiUserFull.class);
            }
        });
    }

    public VKRequest getFollowers() {
        return this.getFollowers(null);
    }

    public VKRequest getFollowers(VKParameters vKParameters) {
        return this.prepareRequest("getFollowers", vKParameters);
    }

    @Override
    public String getMethodsGroup() {
        return "users";
    }

    public VKRequest getSubscriptions() {
        return this.getSubscriptions(null);
    }

    public VKRequest getSubscriptions(VKParameters vKParameters) {
        return this.prepareRequest("getSubscriptions", vKParameters);
    }

    public VKRequest isAppUser() {
        return this.prepareRequest("isAppUser", null);
    }

    public VKRequest isAppUser(int n) {
        return this.prepareRequest("isAppUser", new VKParameters(this, n){
            private static final long serialVersionUID = 7458591447441581671L;
            public final VKApiUsers this$0;
            public final int val$userID;
            {
                this.this$0 = vKApiUsers;
                this.val$userID = n;
                this.put("user_id", String.valueOf((int)n));
            }
        });
    }

    public VKRequest report(VKParameters vKParameters) {
        return this.prepareRequest("report", vKParameters);
    }

    public VKRequest search(VKParameters vKParameters) {
        return this.prepareRequest("search", vKParameters, VKUsersArray.class);
    }
}

