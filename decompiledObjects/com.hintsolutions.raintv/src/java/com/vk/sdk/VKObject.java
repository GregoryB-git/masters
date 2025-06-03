/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Random
 */
package com.vk.sdk;

import java.util.HashMap;
import java.util.Random;

public class VKObject {
    private static final HashMap<Long, VKObject> sRegisteredObjects = new HashMap();
    private long mRegisteredObjectId = 0L;

    public static VKObject getRegisteredObject(long l2) {
        return (VKObject)sRegisteredObjects.get((Object)l2);
    }

    public long registerObject() {
        long l2;
        HashMap<Long, VKObject> hashMap;
        if (sRegisteredObjects.containsKey((Object)this.mRegisteredObjectId)) {
            return this.mRegisteredObjectId;
        }
        Random random = new Random();
        while ((hashMap = sRegisteredObjects).containsKey((Object)(l2 = random.nextLong())) || l2 == 0L) {
        }
        hashMap.put((Object)l2, (Object)this);
        this.mRegisteredObjectId = l2;
        return l2;
    }

    public void unregisterObject() {
        sRegisteredObjects.remove((Object)this.mRegisteredObjectId);
        this.mRegisteredObjectId = 0L;
    }
}

