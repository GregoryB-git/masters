/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.logger.IMessageLogConsumer;
import com.yandex.metrica.coreutils.logger.IObjectLogDumper;
import com.yandex.metrica.coreutils.logger.MultilineMessageLogConsumer;

class ObjectLogConsumer<T>
implements IMessageLogConsumer<T> {
    @NonNull
    private final MultilineMessageLogConsumer messageLogConsumer;
    @NonNull
    private final IObjectLogDumper<T> objectLogDumper;

    public ObjectLogConsumer(@NonNull MultilineMessageLogConsumer multilineMessageLogConsumer, @NonNull IObjectLogDumper<T> iObjectLogDumper) {
        this.messageLogConsumer = multilineMessageLogConsumer;
        this.objectLogDumper = iObjectLogDumper;
    }

    @Override
    public void consume(@NonNull T t4, Object ... objectArray) {
        this.messageLogConsumer.consume(this.objectLogDumper.dumpObject(t4), objectArray);
    }

    @Override
    public void consumeWithTag(@NonNull String string, @NonNull T t4, Object ... objectArray) {
        this.messageLogConsumer.consumeWithTag(string, this.objectLogDumper.dumpObject(t4), objectArray);
    }

    @NonNull
    @VisibleForTesting
    public MultilineMessageLogConsumer getMessageLogConsumer() {
        return this.messageLogConsumer;
    }

    @NonNull
    @VisibleForTesting
    public IObjectLogDumper<T> getObjectLogDumper() {
        return this.objectLogDumper;
    }
}

