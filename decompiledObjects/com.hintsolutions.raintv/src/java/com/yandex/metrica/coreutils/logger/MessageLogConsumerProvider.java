/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.coreutils.logger.JsonObjectLogDumper
 *  com.yandex.metrica.coreutils.logger.LogMessageByLineBreakSplitter
 *  com.yandex.metrica.coreutils.logger.LogMessageByLineLimitSplitter
 *  com.yandex.metrica.coreutils.logger.MultilineMessageLogConsumer
 *  com.yandex.metrica.coreutils.logger.ObjectLogConsumer
 *  com.yandex.metrica.coreutils.logger.SingleInfoMessageLogConsumer
 *  com.yandex.metrica.coreutils.logger.SingleWarningMessageLogConsumer
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.coreutils.logger.ILogMessageSplitter;
import com.yandex.metrica.coreutils.logger.IMessageLogConsumer;
import com.yandex.metrica.coreutils.logger.IObjectLogDumper;
import com.yandex.metrica.coreutils.logger.JsonObjectLogDumper;
import com.yandex.metrica.coreutils.logger.LogMessageByLineBreakSplitter;
import com.yandex.metrica.coreutils.logger.LogMessageByLineLimitSplitter;
import com.yandex.metrica.coreutils.logger.MultilineMessageLogConsumer;
import com.yandex.metrica.coreutils.logger.ObjectLogConsumer;
import com.yandex.metrica.coreutils.logger.SingleInfoMessageLogConsumer;
import com.yandex.metrica.coreutils.logger.SingleWarningMessageLogConsumer;
import org.json.JSONObject;

class MessageLogConsumerProvider {
    @NonNull
    private final IMessageLogConsumer<String> infoMessageLogConsumer;
    @NonNull
    private final IMessageLogConsumer<JSONObject> jsonInfoLogConsumer;
    @NonNull
    private final IMessageLogConsumer<String> warningMessageLogConsumer;

    public MessageLogConsumerProvider(@NonNull BaseLogger baseLogger) {
        SingleInfoMessageLogConsumer singleInfoMessageLogConsumer = new SingleInfoMessageLogConsumer(baseLogger);
        baseLogger = new SingleWarningMessageLogConsumer(baseLogger);
        LogMessageByLineLimitSplitter logMessageByLineLimitSplitter = new LogMessageByLineLimitSplitter();
        this.infoMessageLogConsumer = new MultilineMessageLogConsumer((IMessageLogConsumer)singleInfoMessageLogConsumer, (ILogMessageSplitter)logMessageByLineLimitSplitter);
        this.warningMessageLogConsumer = new MultilineMessageLogConsumer((IMessageLogConsumer)((Object)baseLogger), (ILogMessageSplitter)logMessageByLineLimitSplitter);
        this.jsonInfoLogConsumer = new ObjectLogConsumer(new MultilineMessageLogConsumer((IMessageLogConsumer)singleInfoMessageLogConsumer, (ILogMessageSplitter)new LogMessageByLineBreakSplitter()), (IObjectLogDumper)new JsonObjectLogDumper());
    }

    @NonNull
    public IMessageLogConsumer<String> getDebugLogConsumer() {
        return this.infoMessageLogConsumer;
    }

    @NonNull
    public IMessageLogConsumer<String> getInfoLogConsumer() {
        return this.infoMessageLogConsumer;
    }

    @NonNull
    public IMessageLogConsumer<JSONObject> getJsonInfoLogConsumer() {
        return this.jsonInfoLogConsumer;
    }

    @NonNull
    public IMessageLogConsumer<String> getWarningMessageLogConsumer() {
        return this.warningMessageLogConsumer;
    }
}

