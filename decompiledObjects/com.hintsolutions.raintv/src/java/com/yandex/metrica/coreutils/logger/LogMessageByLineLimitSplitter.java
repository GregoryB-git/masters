/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.logger.ILogMessageSplitter;
import com.yandex.metrica.coreutils.logger.WordBreakFinder;
import java.util.ArrayList;
import java.util.List;

class LogMessageByLineLimitSplitter
implements ILogMessageSplitter {
    public static final int DEFAULT_SINGLE_LOG_LIMIT = 3800;
    public static final int LOG_CLASS_AND_METHOD_TAG_RESERVE = 200;
    public static final int SINGLE_LOG_ANDROID_LIMIT = 4000;
    private final int lineLimit;
    @NonNull
    private final WordBreakFinder wordBreakFinder;

    public LogMessageByLineLimitSplitter() {
        this(new WordBreakFinder(), 3800);
    }

    @VisibleForTesting
    public LogMessageByLineLimitSplitter(@NonNull WordBreakFinder wordBreakFinder, int n4) {
        this.wordBreakFinder = wordBreakFinder;
        this.lineLimit = n4;
    }

    @Override
    public List<String> split(@NonNull String string) {
        ArrayList arrayList = new ArrayList();
        int n4 = 0;
        while (string.length() > n4) {
            int n5 = string.length();
            int n6 = Math.min((int)n5, (int)(this.lineLimit + n4));
            int n7 = n5;
            if (n5 > this.lineLimit + n4) {
                n7 = this.wordBreakFinder.find(string, n4, n6);
                n7 = n7 == -1 ? n6 : ++n7;
            }
            arrayList.add((Object)string.substring(n4, n7));
            n4 = n7;
        }
        return arrayList;
    }
}

