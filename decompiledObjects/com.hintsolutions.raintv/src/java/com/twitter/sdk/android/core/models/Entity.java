/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Entity
implements Serializable {
    private static final int END_INDEX = 1;
    private static final int START_INDEX = 0;
    @SerializedName(value="indices")
    public final List<Integer> indices;

    public Entity(int n, int n2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(0, (Object)n);
        arrayList.add(1, (Object)n2);
        this.indices = Collections.unmodifiableList((List)arrayList);
    }

    public int getEnd() {
        return (Integer)this.indices.get(1);
    }

    public int getStart() {
        return (Integer)this.indices.get(0);
    }
}

