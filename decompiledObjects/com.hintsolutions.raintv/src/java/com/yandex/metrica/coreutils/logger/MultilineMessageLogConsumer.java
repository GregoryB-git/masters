/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Locale
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.logger.ILogMessageSplitter;
import com.yandex.metrica.coreutils.logger.IMessageLogConsumer;
import java.util.Locale;

public class MultilineMessageLogConsumer
implements IMessageLogConsumer<String> {
    private static final String TAG = "[MultilineMessageLogConsumer]";
    @NonNull
    private final ILogMessageSplitter logMessageSplitter;
    @NonNull
    private final IMessageLogConsumer<String> singleLineLogConsumer;

    public MultilineMessageLogConsumer(@NonNull IMessageLogConsumer<String> iMessageLogConsumer, @NonNull ILogMessageSplitter iLogMessageSplitter) {
        this.singleLineLogConsumer = iMessageLogConsumer;
        this.logMessageSplitter = iLogMessageSplitter;
    }

    private String prepareMessage(@NonNull String string, Object ... objectArray) {
        try {
            string = String.format((Locale)Locale.US, (String)string, (Object[])objectArray);
        }
        catch (Throwable throwable) {
            string = "Attention!!!  Invalid log format. See exception details above.";
        }
        return string;
    }

    @Override
    public void consume(@NonNull String string2, Object ... iterator) {
        for (String string2 : this.logMessageSplitter.split(this.prepareMessage(string2, (Object[])iterator))) {
            this.singleLineLogConsumer.consume(string2, new Object[0]);
        }
    }

    @Override
    public void consumeWithTag(@NonNull String string, @NonNull String string2, Object ... object2) {
        for (Object object2 : this.logMessageSplitter.split(this.prepareMessage(string2, object2))) {
            this.singleLineLogConsumer.consumeWithTag(string, (String)object2, new Object[0]);
        }
    }

    @NonNull
    @VisibleForTesting
    public ILogMessageSplitter getLogMessageSplitter() {
        return this.logMessageSplitter;
    }

    @NonNull
    @VisibleForTesting
    public IMessageLogConsumer<String> getSingleLineLogConsumer() {
        return this.singleLineLogConsumer;
    }
}

