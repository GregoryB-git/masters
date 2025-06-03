/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Map
 */
package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.Map;

public class BindingValues {
    private final Map<String, Object> bindingValues;

    public BindingValues() {
        this((Map<String, Object>)Collections.EMPTY_MAP);
    }

    public BindingValues(Map<String, Object> map) {
        this.bindingValues = Collections.unmodifiableMap(map);
    }

    public boolean containsKey(String string2) {
        return this.bindingValues.containsKey((Object)string2);
    }

    public <T> T get(String object) {
        try {
            object = this.bindingValues.get(object);
        }
        catch (ClassCastException classCastException) {
            return null;
        }
        return (T)object;
    }
}

