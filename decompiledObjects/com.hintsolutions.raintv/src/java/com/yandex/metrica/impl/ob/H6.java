/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.io.File
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;
import java.io.File;

public class h6 {
    public boolean a(@Nullable File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            if (file.delete()) {
                return file.mkdir();
            }
            return false;
        }
        return file.mkdir();
    }
}

