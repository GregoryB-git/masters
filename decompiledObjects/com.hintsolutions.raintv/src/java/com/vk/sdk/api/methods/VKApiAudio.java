/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.model.VkAudioArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VkAudioArray;

public class VKApiAudio
extends VKApiBase {
    public VKRequest add(VKParameters vKParameters) {
        return this.prepareRequest("add", vKParameters);
    }

    public VKRequest addAlbum(VKParameters vKParameters) {
        return this.prepareRequest("addAlbum", vKParameters);
    }

    public VKRequest delete(VKParameters vKParameters) {
        return this.prepareRequest("delete", vKParameters);
    }

    public VKRequest deleteAlbum(VKParameters vKParameters) {
        return this.prepareRequest("deleteAlbum", vKParameters);
    }

    public VKRequest edit(VKParameters vKParameters) {
        return this.prepareRequest("edit", vKParameters);
    }

    public VKRequest editAlbum(VKParameters vKParameters) {
        return this.prepareRequest("editAlbum", vKParameters);
    }

    public VKRequest get() {
        return this.get(null);
    }

    public VKRequest get(VKParameters vKParameters) {
        return this.prepareRequest("get", vKParameters, VkAudioArray.class);
    }

    public VKRequest getAlbums() {
        return this.getAlbums(null);
    }

    public VKRequest getAlbums(VKParameters vKParameters) {
        return this.prepareRequest("getAlbums", vKParameters);
    }

    public VKRequest getBroadcastList() {
        return this.getBroadcastList(null);
    }

    public VKRequest getBroadcastList(VKParameters vKParameters) {
        return this.prepareRequest("getBroadcastList", vKParameters);
    }

    public VKRequest getById(VKParameters vKParameters) {
        return this.prepareRequest("getById", vKParameters);
    }

    public VKRequest getCount(VKParameters vKParameters) {
        return this.prepareRequest("getCount", vKParameters);
    }

    public VKRequest getLyrics(VKParameters vKParameters) {
        return this.prepareRequest("getLyrics", vKParameters);
    }

    @Override
    public String getMethodsGroup() {
        return "audio";
    }

    public VKRequest getPopular() {
        return this.getPopular(null);
    }

    public VKRequest getPopular(VKParameters vKParameters) {
        return this.prepareRequest("getPopular", vKParameters, VkAudioArray.class);
    }

    public VKRequest getRecommendations() {
        return this.getRecommendations(null);
    }

    public VKRequest getRecommendations(VKParameters vKParameters) {
        return this.prepareRequest("getRecommendations", vKParameters, VkAudioArray.class);
    }

    public VKRequest getUploadServer() {
        return this.getUploadServer(null);
    }

    public VKRequest getUploadServer(VKParameters vKParameters) {
        return this.prepareRequest("getUploadServer", vKParameters);
    }

    public VKRequest moveToAlbum(VKParameters vKParameters) {
        return this.prepareRequest("moveToAlbum", vKParameters);
    }

    public VKRequest reorder(VKParameters vKParameters) {
        return this.prepareRequest("reorder", vKParameters);
    }

    public VKRequest restore(VKParameters vKParameters) {
        return this.prepareRequest("restore", vKParameters);
    }

    public VKRequest save(VKParameters vKParameters) {
        return this.prepareRequest("save", vKParameters);
    }

    public VKRequest search(VKParameters vKParameters) {
        return this.prepareRequest("search", vKParameters, VkAudioArray.class);
    }

    public VKRequest setBroadcast(VKParameters vKParameters) {
        return this.prepareRequest("setBroadcast", vKParameters);
    }
}

