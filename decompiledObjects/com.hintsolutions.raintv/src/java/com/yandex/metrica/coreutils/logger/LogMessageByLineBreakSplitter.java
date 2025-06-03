/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.logger.ILogMessageSplitter;
import java.util.Arrays;
import java.util.List;

class LogMessageByLineBreakSplitter
implements ILogMessageSplitter {
    public static final String DEFAULT_REGEX = "\\n";
    @NonNull
    private final String regex;

    public LogMessageByLineBreakSplitter() {
        this(DEFAULT_REGEX);
    }

    @VisibleForTesting
    public LogMessageByLineBreakSplitter(@NonNull String string) {
        this.regex = string;
    }

    @Override
    public List<String> split(@NonNull String string) {
        return Arrays.asList((Object[])string.split(this.regex));
    }
}

