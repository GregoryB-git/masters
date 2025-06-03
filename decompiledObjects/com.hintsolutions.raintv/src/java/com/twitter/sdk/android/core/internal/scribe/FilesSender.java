/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.util.List
 */
package com.twitter.sdk.android.core.internal.scribe;

import java.io.File;
import java.util.List;

public interface FilesSender {
    public boolean send(List<File> var1);
}

