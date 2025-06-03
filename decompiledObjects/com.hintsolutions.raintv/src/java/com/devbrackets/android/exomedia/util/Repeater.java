/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.devbrackets.android.exomedia.util;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;

public class Repeater {
    public static final int DEFAULT_REPEAT_DELAY = 33;
    public static final String HANDLER_THREAD_NAME = "ExoMedia_Repeater_HandlerThread";
    public Handler delayedHandler;
    public HandlerThread handlerThread;
    public RepeatListener listener;
    public PollRunnable pollRunnable = new PollRunnable(this);
    public int repeatDelay = 33;
    public volatile boolean repeaterRunning = false;
    public boolean useHandlerThread = false;

    public Repeater() {
        this(true);
    }

    public Repeater(Handler handler) {
        this.delayedHandler = handler;
    }

    public Repeater(boolean bl) {
        if (bl) {
            this.delayedHandler = new Handler();
            return;
        }
        this.useHandlerThread = true;
    }

    public int getRepeaterDelay() {
        return this.repeatDelay;
    }

    public boolean isRunning() {
        return this.repeaterRunning;
    }

    public void setRepeatListener(@Nullable RepeatListener repeatListener) {
        this.listener = repeatListener;
    }

    public void setRepeaterDelay(int n) {
        this.repeatDelay = n;
    }

    public void start() {
        if (!this.repeaterRunning) {
            this.repeaterRunning = true;
            if (this.useHandlerThread) {
                HandlerThread handlerThread;
                this.handlerThread = handlerThread = new HandlerThread(HANDLER_THREAD_NAME);
                handlerThread.start();
                this.delayedHandler = new Handler(this.handlerThread.getLooper());
            }
            this.pollRunnable.performPoll();
        }
    }

    public void stop() {
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.repeaterRunning = false;
    }

    public class PollRunnable
    implements Runnable {
        public final Repeater this$0;

        public PollRunnable(Repeater repeater) {
            this.this$0 = repeater;
        }

        public void performPoll() {
            Repeater repeater = this.this$0;
            repeater.delayedHandler.postDelayed((Runnable)repeater.pollRunnable, (long)repeater.repeatDelay);
        }

        public void run() {
            RepeatListener repeatListener = this.this$0.listener;
            if (repeatListener != null) {
                repeatListener.onRepeat();
            }
            if (this.this$0.repeaterRunning) {
                this.performPoll();
            }
        }
    }

    public static interface RepeatListener {
        public void onRepeat();
    }
}

