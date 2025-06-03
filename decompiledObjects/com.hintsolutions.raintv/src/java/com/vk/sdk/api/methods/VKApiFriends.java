/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.model.VKUsersArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VKUsersArray;

public class VKApiFriends
extends VKApiBase {
    public VKRequest add(VKParameters vKParameters) {
        return this.prepareRequest("add", vKParameters);
    }

    public VKRequest addList(VKParameters vKParameters) {
        return this.prepareRequest("addList", vKParameters);
    }

    public VKRequest areFriends(VKParameters vKParameters) {
        return this.prepareRequest("areFriends", vKParameters);
    }

    public VKRequest delete(VKParameters vKParameters) {
        return this.prepareRequest("delete", vKParameters);
    }

    public VKRequest deleteAllRequests(VKParameters vKParameters) {
        return this.prepareRequest("deleteAllRequests", vKParameters);
    }

    public VKRequest deleteList(VKParameters vKParameters) {
        return this.prepareRequest("deleteList", vKParameters);
    }

    public VKRequest edit(VKParameters vKParameters) {
        return this.prepareRequest("edit", vKParameters);
    }

    public VKRequest editList(VKParameters vKParameters) {
        return this.prepareRequest("editList", vKParameters);
    }

    public VKRequest get(VKParameters vKParameters) {
        if (vKParameters.get("fields") != null) {
            return this.prepareRequest("get", vKParameters, VKUsersArray.class);
        }
        return this.prepareRequest("get", vKParameters);
    }

    public VKRequest getAppUsers(VKParameters vKParameters) {
        return this.prepareRequest("getAppUsers", vKParameters);
    }

    public VKRequest getByPhones(VKParameters vKParameters) {
        return this.prepareRequest("getByPhones", vKParameters, VKUsersArray.class);
    }

    public VKRequest getLists(VKParameters vKParameters) {
        return this.prepareRequest("getLists", vKParameters);
    }

    @Override
    public String getMethodsGroup() {
        return "friends";
    }

    public VKRequest getMutual(VKParameters vKParameters) {
        return this.prepareRequest("getMutual", vKParameters);
    }

    public VKRequest getOnline(VKParameters vKParameters) {
        return this.prepareRequest("getOnline", vKParameters);
    }

    public VKRequest getRecent(VKParameters vKParameters) {
        return this.prepareRequest("getRecent", vKParameters);
    }

    public VKRequest getRequests(VKParameters vKParameters) {
        return this.prepareRequest("getRequests", vKParameters);
    }

    public VKRequest getSuggestions(VKParameters vKParameters) {
        return this.prepareRequest("getSuggestions", vKParameters);
    }
}

