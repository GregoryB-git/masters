/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import java.util.List;

interface ILogMessageSplitter {
    public List<String> split(@NonNull String var1);
}

