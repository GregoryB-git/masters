/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URLEncoder
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.IVideo
 *  ru.tvrain.core.data.ScheduleProgram
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.utils;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.ScheduleProgram;
import tvrain.managers.UserManager;

public class DFPHelper {
    private static final String ARTICLE_ID = "article_id";
    private static final String IS_PAID = "dfp_is_paid";
    private static final String PAGETYPE = "pagetype";
    private static final String PPID = "ppid";
    private static final String SUBSCRIBER = "subscriber";
    private static final String TELESHOW_ID = "teleshow_id";
    private static final String VIDEO_ID = "video_id";

    public static String addCustomAdTargetingForVideo(UserManager map, Article article, IVideo iVideo) {
        map = DFPHelper.addMainAdTargeting((UserManager)map);
        map.put((Object)ARTICLE_ID, (Object)String.valueOf((int)article.id));
        map.put((Object)TELESHOW_ID, (Object)String.valueOf((int)article.program_id));
        map.put((Object)VIDEO_ID, (Object)String.valueOf((int)iVideo.getVideoId()));
        map.put((Object)PAGETYPE, (Object)"vod");
        return DFPHelper.paramsToString(map);
    }

    public static String addCustomAdTargetingOnAir(UserManager map, ScheduleProgram scheduleProgram) {
        map = DFPHelper.addMainAdTargeting((UserManager)map);
        map.put((Object)PAGETYPE, (Object)"live");
        if (scheduleProgram != null) {
            map.put((Object)TELESHOW_ID, (Object)String.valueOf((int)scheduleProgram.program_id));
        }
        return DFPHelper.paramsToString(map);
    }

    public static Map<String, String> addMainAdTargeting(UserManager object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)SUBSCRIBER, (Object)"0");
        object = DFPHelper.getPPID(object);
        if (object != null) {
            hashMap.put((Object)PPID, object);
        }
        return hashMap;
    }

    public static String addMainAdTargetingString(UserManager userManager) {
        return DFPHelper.paramsToString(DFPHelper.addMainAdTargeting(userManager));
    }

    private static String getPPID(UserManager userManager) {
        if (userManager.isAuthorized() && userManager.getCreateTime() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(userManager.getUserId());
            stringBuilder.append(userManager.getCreateTime().split(" ")[0]);
            return DFPHelper.md5(stringBuilder.toString());
        }
        return null;
    }

    private static String md5(String string2) {
        MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
        messageDigest.update(string2.getBytes());
        byte[] byArray = messageDigest.digest();
        messageDigest = new StringBuilder();
        int n = byArray.length;
        for (int j = 0; j < n; ++j) {
            string2 = Integer.toHexString((int)(byArray[j] & 0xFF));
            while (string2.length() < 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0");
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
            messageDigest.append(string2);
            continue;
        }
        try {
            string2 = messageDigest.toString();
            return string2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return "";
        }
    }

    private static String paramsToString(Map<String, String> iterator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : iterator.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("%26");
            }
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append("%3D");
            stringBuilder.append(URLEncoder.encode((String)((String)entry.getValue())));
        }
        return stringBuilder.toString();
    }
}

