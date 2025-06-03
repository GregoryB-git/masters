/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vk.sdk.api.VKRequest
 *  com.vk.sdk.api.methods.VKApiAudio
 *  com.vk.sdk.api.methods.VKApiDocs
 *  com.vk.sdk.api.methods.VKApiFriends
 *  com.vk.sdk.api.methods.VKApiGroups
 *  com.vk.sdk.api.methods.VKApiMessages
 *  com.vk.sdk.api.methods.VKApiPhotos
 *  com.vk.sdk.api.methods.VKApiUsers
 *  com.vk.sdk.api.methods.VKApiVideo
 *  com.vk.sdk.api.methods.VKApiWall
 *  com.vk.sdk.api.photo.VKUploadAlbumPhotoRequest
 *  com.vk.sdk.api.photo.VKUploadImage
 *  com.vk.sdk.api.photo.VKUploadMessagesPhotoRequest
 *  com.vk.sdk.api.photo.VKUploadWallPhotoRequest
 *  java.io.File
 *  java.lang.Object
 */
package com.vk.sdk.api;

import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiAudio;
import com.vk.sdk.api.methods.VKApiDocs;
import com.vk.sdk.api.methods.VKApiFriends;
import com.vk.sdk.api.methods.VKApiGroups;
import com.vk.sdk.api.methods.VKApiMessages;
import com.vk.sdk.api.methods.VKApiPhotos;
import com.vk.sdk.api.methods.VKApiUsers;
import com.vk.sdk.api.methods.VKApiVideo;
import com.vk.sdk.api.methods.VKApiWall;
import com.vk.sdk.api.photo.VKUploadAlbumPhotoRequest;
import com.vk.sdk.api.photo.VKUploadImage;
import com.vk.sdk.api.photo.VKUploadMessagesPhotoRequest;
import com.vk.sdk.api.photo.VKUploadWallPhotoRequest;
import java.io.File;

public class VKApi {
    public static VKApiAudio audio() {
        return new VKApiAudio();
    }

    public static VKApiDocs docs() {
        return new VKApiDocs();
    }

    public static VKApiFriends friends() {
        return new VKApiFriends();
    }

    public static VKApiGroups groups() {
        return new VKApiGroups();
    }

    public static VKApiMessages messages() {
        return new VKApiMessages();
    }

    public static VKApiPhotos photos() {
        return new VKApiPhotos();
    }

    public static VKRequest uploadAlbumPhotoRequest(VKUploadImage vKUploadImage, long l2, int n) {
        return new VKUploadAlbumPhotoRequest(vKUploadImage, l2, (long)n);
    }

    public static VKRequest uploadAlbumPhotoRequest(File file, long l2, int n) {
        return new VKUploadAlbumPhotoRequest(file, l2, (long)n);
    }

    public static VKRequest uploadMessagesPhotoRequest(VKUploadImage vKUploadImage) {
        return new VKUploadMessagesPhotoRequest(vKUploadImage);
    }

    public static VKRequest uploadMessagesPhotoRequest(File file) {
        return new VKUploadMessagesPhotoRequest(file);
    }

    public static VKRequest uploadWallPhotoRequest(VKUploadImage vKUploadImage, long l2, int n) {
        return new VKUploadWallPhotoRequest(vKUploadImage, l2, n);
    }

    public static VKRequest uploadWallPhotoRequest(File file, long l2, int n) {
        return new VKUploadWallPhotoRequest(file, l2, n);
    }

    public static VKApiUsers users() {
        return new VKApiUsers();
    }

    public static VKApiVideo video() {
        return new VKApiVideo();
    }

    public static VKApiWall wall() {
        return new VKApiWall();
    }
}

