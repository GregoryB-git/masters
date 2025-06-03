/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.model.VKApiCommunityArray
 *  com.vk.sdk.api.model.VKUsersArray
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VKApiCommunityArray;
import com.vk.sdk.api.model.VKUsersArray;

public class VKApiGroups
extends VKApiBase {
    public VKRequest banUser(VKParameters vKParameters) {
        return this.prepareRequest("banUser", vKParameters);
    }

    public VKRequest get(VKParameters vKParameters) {
        if (vKParameters.containsKey("extended") && (Integer)vKParameters.get("extended") == 1) {
            return this.prepareRequest("get", vKParameters, VKApiCommunityArray.class);
        }
        return this.prepareRequest("get", vKParameters);
    }

    public VKRequest getBanned(VKParameters vKParameters) {
        return this.prepareRequest("getBanned", vKParameters, VKUsersArray.class);
    }

    public VKRequest getById(VKParameters vKParameters) {
        return this.prepareRequest("getById", vKParameters, VKApiCommunityArray.class);
    }

    public VKRequest getInvites(VKParameters vKParameters) {
        return this.prepareRequest("getInvites", vKParameters, VKApiCommunityArray.class);
    }

    public VKRequest getMembers(VKParameters vKParameters) {
        return this.prepareRequest("getMembers", vKParameters);
    }

    @Override
    public String getMethodsGroup() {
        return "groups";
    }

    public VKRequest isMember(VKParameters vKParameters) {
        return this.prepareRequest("isMember", vKParameters);
    }

    public VKRequest join(VKParameters vKParameters) {
        return this.prepareRequest("join", vKParameters);
    }

    public VKRequest leave(int n) {
        return this.prepareRequest("leave", new VKParameters(this, n){
            public final VKApiGroups this$0;
            public final int val$group_id;
            {
                this.this$0 = vKApiGroups;
                this.val$group_id = n;
                this.put("group_id", String.valueOf((int)n));
            }
        });
    }

    public VKRequest leave(VKParameters vKParameters) {
        return this.prepareRequest("leave", vKParameters);
    }

    public VKRequest search(VKParameters vKParameters) {
        return this.prepareRequest("search", vKParameters, VKApiCommunityArray.class);
    }

    public VKRequest unbanUser(VKParameters vKParameters) {
        return this.prepareRequest("unbanUser", vKParameters);
    }
}

