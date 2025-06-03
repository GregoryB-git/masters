/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.model.VkVideoArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VkVideoArray;

public class VKApiVideo
extends VKApiBase {
    public VKRequest add(VKParameters vKParameters) {
        return this.prepareRequest("add", vKParameters);
    }

    public VKRequest addAlbum(VKParameters vKParameters) {
        return this.prepareRequest("addAlbum", vKParameters);
    }

    public VKRequest addToAlbum(VKParameters vKParameters) {
        return this.prepareRequest("addToAlbum", vKParameters);
    }

    public VKRequest createComment(VKParameters vKParameters) {
        return this.prepareRequest("createComment", vKParameters);
    }

    public VKRequest delete(VKParameters vKParameters) {
        return this.prepareRequest("delete", vKParameters);
    }

    public VKRequest deleteAlbum(VKParameters vKParameters) {
        return this.prepareRequest("deleteAlbum", vKParameters);
    }

    public VKRequest deleteComment(VKParameters vKParameters) {
        return this.prepareRequest("deleteComment", vKParameters);
    }

    public VKRequest edit(VKParameters vKParameters) {
        return this.prepareRequest("edit", vKParameters);
    }

    public VKRequest editAlbum(VKParameters vKParameters) {
        return this.prepareRequest("editAlbum", vKParameters);
    }

    public VKRequest editComment(VKParameters vKParameters) {
        return this.prepareRequest("editComment", vKParameters);
    }

    public VKRequest get() {
        return this.get(null);
    }

    public VKRequest get(VKParameters vKParameters) {
        return this.prepareRequest("get", vKParameters, VkVideoArray.class);
    }

    public VKRequest getAlbumById(VKParameters vKParameters) {
        return this.prepareRequest("getAlbumById", vKParameters);
    }

    public VKRequest getAlbums() {
        return this.getAlbums(null);
    }

    public VKRequest getAlbums(VKParameters vKParameters) {
        return this.prepareRequest("getAlbums", vKParameters);
    }

    public VKRequest getAlbumsByVideo(VKParameters vKParameters) {
        return this.prepareRequest("getAlbumsByVideo", vKParameters);
    }

    public VKRequest getComments(VKParameters vKParameters) {
        return this.prepareRequest("getComments", vKParameters);
    }

    @Override
    public String getMethodsGroup() {
        return "video";
    }

    public VKRequest getNewTags(VKParameters vKParameters) {
        return this.prepareRequest("getNewTags", vKParameters);
    }

    public VKRequest getTags(VKParameters vKParameters) {
        return this.prepareRequest("getTags", vKParameters);
    }

    public VKRequest getUserVideos(VKParameters vKParameters) {
        return this.prepareRequest("getUserVideos", vKParameters, VkVideoArray.class);
    }

    public VKRequest putTag(VKParameters vKParameters) {
        return this.prepareRequest("putTag", vKParameters);
    }

    public VKRequest removeFromAlbum(VKParameters vKParameters) {
        return this.prepareRequest("removeFromAlbum", vKParameters);
    }

    public VKRequest removeTag(VKParameters vKParameters) {
        return this.prepareRequest("removeTag", vKParameters);
    }

    public VKRequest reorderAlbums(VKParameters vKParameters) {
        return this.prepareRequest("getAlbumById", vKParameters);
    }

    public VKRequest reorderVideos(VKParameters vKParameters) {
        return this.prepareRequest("getAlbumById", vKParameters);
    }

    public VKRequest report(VKParameters vKParameters) {
        return this.prepareRequest("report", vKParameters);
    }

    public VKRequest reportComment(VKParameters vKParameters) {
        return this.prepareRequest("reportComment", vKParameters);
    }

    public VKRequest restore(VKParameters vKParameters) {
        return this.prepareRequest("restore", vKParameters);
    }

    public VKRequest restoreComment(VKParameters vKParameters) {
        return this.prepareRequest("restoreComment", vKParameters);
    }

    public VKRequest save(VKParameters vKParameters) {
        return this.prepareRequest("save", vKParameters);
    }

    public VKRequest search(VKParameters vKParameters) {
        return this.prepareRequest("search", vKParameters, VkVideoArray.class);
    }
}

