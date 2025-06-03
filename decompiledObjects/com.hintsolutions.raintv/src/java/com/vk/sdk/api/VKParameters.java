/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.Map
 */
package com.vk.sdk.api;

import com.vk.sdk.util.VKUtil;
import java.util.LinkedHashMap;
import java.util.Map;

public class VKParameters
extends LinkedHashMap<String, Object> {
    private static final long serialVersionUID = -7183150344504033644L;

    public VKParameters() {
    }

    public VKParameters(Map<String, Object> map) {
        super(map);
    }

    public static VKParameters from(Object ... objectArray) {
        return VKUtil.paramsFrom(objectArray);
    }
}

