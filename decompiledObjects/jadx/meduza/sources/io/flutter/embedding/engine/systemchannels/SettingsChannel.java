package io.flutter.embedding.engine.systemchannels;

import android.os.Build;
import android.util.DisplayMetrics;
import defpackage.f;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class SettingsChannel {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
    private static final String BRIEFLY_SHOW_PASSWORD = "brieflyShowPassword";
    public static final String CHANNEL_NAME = "flutter/settings";
    private static final String CONFIGURATION_ID = "configurationId";
    private static final ConfigurationQueue CONFIGURATION_QUEUE = new ConfigurationQueue();
    private static final String NATIVE_SPELL_CHECK_SERVICE_DEFINED = "nativeSpellCheckServiceDefined";
    private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
    private static final String TAG = "SettingsChannel";
    private static final String TEXT_SCALE_FACTOR = "textScaleFactor";
    public final BasicMessageChannel<Object> channel;

    public static class ConfigurationQueue {
        private SentConfiguration currentConfiguration;
        private SentConfiguration previousEnqueuedConfiguration;
        private final ConcurrentLinkedQueue<SentConfiguration> sentQueue = new ConcurrentLinkedQueue<>();

        public static class SentConfiguration {
            private static int nextConfigGeneration = Integer.MIN_VALUE;
            private final DisplayMetrics displayMetrics;
            public final int generationNumber;

            public SentConfiguration(DisplayMetrics displayMetrics) {
                int i10 = nextConfigGeneration;
                nextConfigGeneration = i10 + 1;
                this.generationNumber = i10;
                this.displayMetrics = displayMetrics;
            }
        }

        public BasicMessageChannel.Reply enqueueConfiguration(SentConfiguration sentConfiguration) {
            this.sentQueue.add(sentConfiguration);
            final SentConfiguration sentConfiguration2 = this.previousEnqueuedConfiguration;
            this.previousEnqueuedConfiguration = sentConfiguration;
            if (sentConfiguration2 == null) {
                return null;
            }
            return new BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public void reply(Object obj) {
                    ConfigurationQueue.this.sentQueue.remove(sentConfiguration2);
                    if (ConfigurationQueue.this.sentQueue.isEmpty()) {
                        return;
                    }
                    StringBuilder l10 = f.l("The queue becomes empty after removing config generation ");
                    l10.append(String.valueOf(sentConfiguration2.generationNumber));
                    Log.e(SettingsChannel.TAG, l10.toString());
                }
            };
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x000d -> B:4:0x000f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration getConfiguration(int r7) {
            /*
                r6 = this;
                io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue$SentConfiguration r0 = r6.currentConfiguration
                if (r0 != 0) goto L6
                r0 = r6
                goto Lf
            L6:
                r0 = r6
            L7:
                io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue$SentConfiguration r1 = r0.currentConfiguration
                if (r1 == 0) goto L1a
                int r2 = r1.generationNumber
                if (r2 >= r7) goto L1a
            Lf:
                java.util.concurrent.ConcurrentLinkedQueue<io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue$SentConfiguration> r1 = r0.sentQueue
                java.lang.Object r1 = r1.poll()
                io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue$SentConfiguration r1 = (io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration) r1
                r0.currentConfiguration = r1
                goto L7
            L1a:
                r2 = 0
                java.lang.String r3 = "Cannot find config with generation: "
                java.lang.String r4 = "SettingsChannel"
                if (r1 != 0) goto L2f
                java.lang.StringBuilder r0 = defpackage.f.l(r3)
                java.lang.String r7 = java.lang.String.valueOf(r7)
                r0.append(r7)
                java.lang.String r7 = ", after exhausting the queue."
                goto L4c
            L2f:
                int r5 = r1.generationNumber
                if (r5 == r7) goto L57
                java.lang.StringBuilder r1 = defpackage.f.l(r3)
                java.lang.String r7 = java.lang.String.valueOf(r7)
                r1.append(r7)
                java.lang.String r7 = ", the oldest config is now: "
                r1.append(r7)
                io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue$SentConfiguration r7 = r0.currentConfiguration
                int r7 = r7.generationNumber
                java.lang.String r7 = java.lang.String.valueOf(r7)
                r0 = r1
            L4c:
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                io.flutter.Log.e(r4, r7)
                return r2
            L57:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.getConfiguration(int):io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue$SentConfiguration");
        }
    }

    public static class MessageBuilder {
        private final BasicMessageChannel<Object> channel;
        private DisplayMetrics displayMetrics;
        private Map<String, Object> message = new HashMap();

        public MessageBuilder(BasicMessageChannel<Object> basicMessageChannel) {
            this.channel = basicMessageChannel;
        }

        public void send() {
            StringBuilder l10 = f.l("Sending message: \ntextScaleFactor: ");
            l10.append(this.message.get(SettingsChannel.TEXT_SCALE_FACTOR));
            l10.append("\nalwaysUse24HourFormat: ");
            l10.append(this.message.get(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT));
            l10.append("\nplatformBrightness: ");
            l10.append(this.message.get(SettingsChannel.PLATFORM_BRIGHTNESS));
            Log.v(SettingsChannel.TAG, l10.toString());
            DisplayMetrics displayMetrics = this.displayMetrics;
            if (!SettingsChannel.hasNonlinearTextScalingSupport() || displayMetrics == null) {
                this.channel.send(this.message);
                return;
            }
            ConfigurationQueue.SentConfiguration sentConfiguration = new ConfigurationQueue.SentConfiguration(displayMetrics);
            BasicMessageChannel.Reply<Object> enqueueConfiguration = SettingsChannel.CONFIGURATION_QUEUE.enqueueConfiguration(sentConfiguration);
            this.message.put(SettingsChannel.CONFIGURATION_ID, Integer.valueOf(sentConfiguration.generationNumber));
            this.channel.send(this.message, enqueueConfiguration);
        }

        public MessageBuilder setBrieflyShowPassword(boolean z10) {
            this.message.put(SettingsChannel.BRIEFLY_SHOW_PASSWORD, Boolean.valueOf(z10));
            return this;
        }

        public MessageBuilder setDisplayMetrics(DisplayMetrics displayMetrics) {
            this.displayMetrics = displayMetrics;
            return this;
        }

        public MessageBuilder setNativeSpellCheckServiceDefined(boolean z10) {
            this.message.put(SettingsChannel.NATIVE_SPELL_CHECK_SERVICE_DEFINED, Boolean.valueOf(z10));
            return this;
        }

        public MessageBuilder setPlatformBrightness(PlatformBrightness platformBrightness) {
            this.message.put(SettingsChannel.PLATFORM_BRIGHTNESS, platformBrightness.name);
            return this;
        }

        public MessageBuilder setTextScaleFactor(float f) {
            this.message.put(SettingsChannel.TEXT_SCALE_FACTOR, Float.valueOf(f));
            return this;
        }

        public MessageBuilder setUse24HourFormat(boolean z10) {
            this.message.put(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, Boolean.valueOf(z10));
            return this;
        }
    }

    public enum PlatformBrightness {
        light("light"),
        dark("dark");

        public String name;

        PlatformBrightness(String str) {
            this.name = str;
        }
    }

    public SettingsChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, CHANNEL_NAME, JSONMessageCodec.INSTANCE);
    }

    public static DisplayMetrics getPastDisplayMetrics(int i10) {
        ConfigurationQueue.SentConfiguration configuration = CONFIGURATION_QUEUE.getConfiguration(i10);
        if (configuration == null) {
            return null;
        }
        return configuration.displayMetrics;
    }

    public static boolean hasNonlinearTextScalingSupport() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public MessageBuilder startMessage() {
        return new MessageBuilder(this.channel);
    }
}
