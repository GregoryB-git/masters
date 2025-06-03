/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.vk.sdk.api.model.VKAttachments
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.vk.sdk.util;

import android.net.Uri;
import android.text.TextUtils;
import com.vk.sdk.api.model.VKAttachments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class VKStringJoiner {
    public static String join(Collection<?> collection, String string2) {
        return TextUtils.join((CharSequence)string2, collection);
    }

    public static String join(String[] stringArray, String string2) {
        return VKStringJoiner.join(Arrays.asList((Object[])stringArray), string2);
    }

    public static String joinParams(Map<String, ?> map) {
        return VKStringJoiner.joinParams(map, false);
    }

    public static String joinParams(Map<String, ?> object, boolean bl) {
        ArrayList arrayList = new ArrayList(object.size());
        for (Map.Entry entry : object.entrySet()) {
            Object object2 = entry.getValue();
            object = object2;
            if (object2 instanceof VKAttachments) {
                object = ((VKAttachments)object2).toAttachmentsString();
            }
            object2 = entry.getKey();
            object = bl ? Uri.encode((String)String.valueOf(object)) : String.valueOf(object);
            arrayList.add((Object)String.format((String)"%s=%s", (Object[])new Object[]{object2, object}));
        }
        return VKStringJoiner.join(arrayList, "&");
    }

    public static String joinUriParams(Map<String, ?> map) {
        return VKStringJoiner.joinParams(map, true);
    }
}

