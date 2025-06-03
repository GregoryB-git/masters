/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.coreutils.logger.MultilineMessageLogConsumer
 *  com.yandex.metrica.coreutils.logger.ObjectLogConsumer
 *  com.yandex.metrica.coreutils.logger.SingleInfoMessageLogConsumer
 *  com.yandex.metrica.coreutils.logger.SingleWarningMessageLogConsumer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.List
 *  org.json.JSONObject
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.coreutils.logger.IMessageLogConsumer;
import com.yandex.metrica.coreutils.logger.MessageLogConsumerProvider;
import com.yandex.metrica.coreutils.logger.MultilineMessageLogConsumer;
import com.yandex.metrica.coreutils.logger.ObjectLogConsumer;
import com.yandex.metrica.coreutils.logger.SingleInfoMessageLogConsumer;
import com.yandex.metrica.coreutils.logger.SingleWarningMessageLogConsumer;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

class YLoggerImpl {
    public static final List<String> REGISTERED_LOGGER_CLASSES = Arrays.asList((Object[])new String[]{YLoggerImpl.class.getName(), MessageLogConsumerProvider.class.getName(), SingleWarningMessageLogConsumer.class.getName(), MultilineMessageLogConsumer.class.getName(), SingleInfoMessageLogConsumer.class.getName(), ObjectLogConsumer.class.getName(), IMessageLogConsumer.class.getName()});
    @NonNull
    private final BaseLogger baseLogConsumer;
    @NonNull
    private final IMessageLogConsumer<String> debugMessageLogConsumer;
    private final boolean enabled;
    @NonNull
    private final IMessageLogConsumer<String> infoMessageLogConsumer;
    @NonNull
    private final IMessageLogConsumer<JSONObject> jsonInfoMessageLogConsumer;
    @NonNull
    private final IMessageLogConsumer<String> warningMessageLogConsumer;

    public YLoggerImpl(@NonNull BaseLogger baseLogger, boolean bl) {
        this(baseLogger, bl, new MessageLogConsumerProvider(baseLogger));
    }

    @VisibleForTesting
    public YLoggerImpl(@NonNull BaseLogger baseLogger, boolean bl, @NonNull MessageLogConsumerProvider messageLogConsumerProvider) {
        this.baseLogConsumer = baseLogger;
        this.enabled = bl;
        this.infoMessageLogConsumer = messageLogConsumerProvider.getInfoLogConsumer();
        this.debugMessageLogConsumer = messageLogConsumerProvider.getDebugLogConsumer();
        this.warningMessageLogConsumer = messageLogConsumerProvider.getWarningMessageLogConsumer();
        this.jsonInfoMessageLogConsumer = messageLogConsumerProvider.getJsonInfoLogConsumer();
    }

    public void d(@NonNull String string2, Object ... objectArray) {
        if (this.enabled) {
            this.debugMessageLogConsumer.consume(string2, objectArray);
        }
    }

    public void debug(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
        if (this.enabled) {
            this.debugMessageLogConsumer.consumeWithTag(string2, string3, objectArray);
        }
    }

    public void dumpJson(@NonNull String string2, @NonNull JSONObject jSONObject) {
        if (this.enabled) {
            this.jsonInfoMessageLogConsumer.consumeWithTag(string2, jSONObject, new Object[0]);
        }
    }

    public void e(@NonNull String string2, Object ... objectArray) {
        if (this.enabled) {
            this.baseLogConsumer.fe(string2, objectArray);
        }
    }

    public void e(@NonNull Throwable throwable, @Nullable String string2, Object ... objectArray) {
        if (this.enabled) {
            this.baseLogConsumer.fe(throwable, string2, objectArray);
        }
    }

    public void error(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
        if (this.enabled) {
            BaseLogger baseLogger = this.baseLogConsumer;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            baseLogger.fe(stringBuilder.toString(), objectArray);
        }
    }

    public void error(@NonNull String string2, @Nullable Throwable throwable, @Nullable String string3, Object ... objectArray) {
        if (this.enabled) {
            BaseLogger baseLogger = this.baseLogConsumer;
            StringBuilder stringBuilder = z2.t(string2);
            string2 = string3;
            if (string3 == null) {
                string2 = "";
            }
            stringBuilder.append(string2);
            baseLogger.fe(throwable, stringBuilder.toString(), objectArray);
        }
    }

    public void i(@NonNull String string2, Object ... objectArray) {
        if (this.enabled) {
            this.infoMessageLogConsumer.consume(string2, objectArray);
        }
    }

    public void info(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
        if (this.enabled) {
            this.infoMessageLogConsumer.consumeWithTag(string2, string3, objectArray);
        }
    }

    public void w(@NonNull String string2, Object ... objectArray) {
        if (this.enabled) {
            this.warningMessageLogConsumer.consume(string2, objectArray);
        }
    }

    public void warning(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
        if (this.enabled) {
            this.warningMessageLogConsumer.consumeWithTag(string2, string3, objectArray);
        }
    }
}

