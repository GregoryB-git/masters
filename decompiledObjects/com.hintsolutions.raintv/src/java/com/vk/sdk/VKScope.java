/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.vk.sdk;

import java.util.ArrayList;

public class VKScope {
    public static final String ADS = "ads";
    public static final String AUDIO = "audio";
    public static final String DIRECT = "direct";
    public static final String DOCS = "docs";
    public static final String EMAIL = "email";
    public static final String FRIENDS = "friends";
    public static final String GROUPS = "groups";
    public static final String MESSAGES = "messages";
    public static final String NOHTTPS = "nohttps";
    public static final String NOTES = "notes";
    public static final String NOTIFICATIONS = "notifications";
    public static final String NOTIFY = "notify";
    public static final String OFFLINE = "offline";
    public static final String PAGES = "pages";
    public static final String PHOTOS = "photos";
    public static final String STATS = "stats";
    public static final String STATUS = "status";
    public static final String VIDEO = "video";
    public static final String WALL = "wall";

    public static ArrayList<String> parseVkPermissionsFromInteger(int n) {
        ArrayList arrayList = new ArrayList();
        if ((n & 1) > 0) {
            arrayList.add((Object)NOTIFY);
        }
        if ((n & 2) > 0) {
            arrayList.add((Object)FRIENDS);
        }
        if ((n & 4) > 0) {
            arrayList.add((Object)PHOTOS);
        }
        if ((n & 8) > 0) {
            arrayList.add((Object)AUDIO);
        }
        if ((n & 0x10) > 0) {
            arrayList.add((Object)VIDEO);
        }
        if ((n & 0x80) > 0) {
            arrayList.add((Object)PAGES);
        }
        if ((n & 0x400) > 0) {
            arrayList.add((Object)STATUS);
        }
        if ((n & 0x800) > 0) {
            arrayList.add((Object)NOTES);
        }
        if ((n & 0x1000) > 0) {
            arrayList.add((Object)MESSAGES);
        }
        if ((n & 0x2000) > 0) {
            arrayList.add((Object)WALL);
        }
        if ((0x8000 & n) > 0) {
            arrayList.add((Object)ADS);
        }
        if ((0x10000 & n) > 0) {
            arrayList.add((Object)OFFLINE);
        }
        if ((0x20000 & n) > 0) {
            arrayList.add((Object)DOCS);
        }
        if ((0x40000 & n) > 0) {
            arrayList.add((Object)GROUPS);
        }
        if ((0x80000 & n) > 0) {
            arrayList.add((Object)NOTIFICATIONS);
        }
        if ((n & 0x100000) > 0) {
            arrayList.add((Object)STATS);
        }
        return arrayList;
    }
}

