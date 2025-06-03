/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.i7
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.i7;
import java.io.File;
import java.io.FilenameFilter;

class h7
implements FilenameFilter {
    public h7(i7 i72) {
    }

    public boolean accept(File file, String string) {
        return string.endsWith(".dmp");
    }
}

