/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.coreutils.logger.IMessageLogConsumer;

public class SingleInfoMessageLogConsumer
implements IMessageLogConsumer<String> {
    @NonNull
    private final BaseLogger logger;

    public SingleInfoMessageLogConsumer(@NonNull BaseLogger baseLogger) {
        this.logger = baseLogger;
    }

    @Override
    public void consume(@NonNull String string, Object ... objectArray) {
        this.logger.fi(string, objectArray);
    }

    @Override
    public void consumeWithTag(@NonNull String string, @NonNull String string2, Object ... objectArray) {
        BaseLogger baseLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        baseLogger.fi(stringBuilder.toString(), objectArray);
    }

    @NonNull
    @VisibleForTesting
    public BaseLogger getLogger() {
        return this.logger;
    }
}

