/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.model.VKCommentArray
 *  com.vk.sdk.api.model.VKPostArray
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VKCommentArray;
import com.vk.sdk.api.model.VKPostArray;
import com.vk.sdk.api.model.VKWallPostResult;

public class VKApiWall
extends VKApiBase {
    public static final String EXTENDED = "extended";

    public VKRequest addComment(VKParameters vKParameters) {
        return this.prepareRequest("addComment", vKParameters);
    }

    public VKRequest delete(VKParameters vKParameters) {
        return this.prepareRequest("delete", vKParameters);
    }

    public VKRequest deleteComment(VKParameters vKParameters) {
        return this.prepareRequest("deleteComment", vKParameters);
    }

    public VKRequest edit(VKParameters vKParameters) {
        return this.prepareRequest("edit", vKParameters);
    }

    public VKRequest editComment(VKParameters vKParameters) {
        return this.prepareRequest("editComment", vKParameters);
    }

    public VKRequest get(VKParameters vKParameters) {
        if (vKParameters.containsKey(EXTENDED) && (Integer)vKParameters.get(EXTENDED) == 1) {
            return this.prepareRequest("get", vKParameters, VKPostArray.class);
        }
        return this.prepareRequest("get", vKParameters);
    }

    public VKRequest getById(VKParameters vKParameters) {
        return this.prepareRequest("getById", vKParameters, VKPostArray.class);
    }

    public VKRequest getComments(VKParameters vKParameters) {
        return this.prepareRequest("getComments", vKParameters, VKCommentArray.class);
    }

    @Override
    public String getMethodsGroup() {
        return "wall";
    }

    public VKRequest getReposts(VKParameters vKParameters) {
        return this.prepareRequest("getReposts", vKParameters);
    }

    public VKRequest post(VKParameters vKParameters) {
        return this.prepareRequest("post", vKParameters, VKWallPostResult.class);
    }

    public VKRequest reportComment(VKParameters vKParameters) {
        return this.prepareRequest("reportComment", vKParameters);
    }

    public VKRequest reportPost(VKParameters vKParameters) {
        return this.prepareRequest("reportPost", vKParameters);
    }

    public VKRequest repost(VKParameters vKParameters) {
        return this.prepareRequest("repost", vKParameters);
    }

    public VKRequest restore(VKParameters vKParameters) {
        return this.prepareRequest("restore", vKParameters);
    }

    public VKRequest restoreComment(VKParameters vKParameters) {
        return this.prepareRequest("restoreComment", vKParameters);
    }

    public VKRequest savePost(VKParameters vKParameters) {
        return this.prepareRequest("savePost", vKParameters);
    }
}

