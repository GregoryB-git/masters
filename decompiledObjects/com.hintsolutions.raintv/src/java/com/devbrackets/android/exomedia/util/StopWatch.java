/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  androidx.annotation.FloatRange
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package com.devbrackets.android.exomedia.util;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

public class StopWatch {
    public static final int DEFAULT_TICK_DELAY = 33;
    public static final String HANDLER_THREAD_NAME = "ExoMedia_StopWatch_HandlerThread";
    public long currentTime = 0L;
    public Handler delayedHandler;
    public HandlerThread handlerThread;
    public volatile boolean isRunning = false;
    public TickListener listener;
    @FloatRange(from=0.0)
    public float speedMultiplier = 1.0f;
    public long startTime = 0L;
    public long storedTime = 0L;
    public int tickDelay = 33;
    public TickRunnable tickRunnable = new TickRunnable(this);
    public boolean useHandlerThread = false;

    public StopWatch() {
        this(true);
    }

    public StopWatch(Handler handler) {
        this.delayedHandler = handler;
    }

    public StopWatch(boolean bl) {
        if (bl) {
            this.delayedHandler = new Handler();
            return;
        }
        this.useHandlerThread = true;
    }

    @FloatRange(from=0.0)
    public float getSpeedMultiplier() {
        return this.speedMultiplier;
    }

    public int getTickDelay() {
        return this.tickDelay;
    }

    public long getTime() {
        return this.currentTime + this.storedTime;
    }

    public int getTimeInt() {
        long l = this.currentTime + this.storedTime;
        int n = l < Integer.MAX_VALUE ? (int)l : Integer.MAX_VALUE;
        return n;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public void overrideCurrentTime(long l) {
        long l2;
        this.startTime = l2 = System.currentTimeMillis();
        this.tickRunnable.lastTickTimestamp = l2;
        this.currentTime = 0L;
        this.storedTime = l;
    }

    public void reset() {
        long l;
        this.currentTime = 0L;
        this.storedTime = 0L;
        this.startTime = l = System.currentTimeMillis();
        this.tickRunnable.lastTickTimestamp = l;
    }

    public void setSpeedMultiplier(@FloatRange(from=0.0) float f2) {
        this.speedMultiplier = f2;
    }

    public void setTickDelay(int n) {
        this.tickDelay = n;
    }

    public void setTickListener(@Nullable TickListener tickListener) {
        this.listener = tickListener;
    }

    public void start() {
        long l;
        if (this.isRunning()) {
            return;
        }
        this.isRunning = true;
        this.startTime = l = System.currentTimeMillis();
        this.tickRunnable.lastTickTimestamp = l;
        if (this.useHandlerThread) {
            HandlerThread handlerThread;
            this.handlerThread = handlerThread = new HandlerThread(HANDLER_THREAD_NAME);
            handlerThread.start();
            this.delayedHandler = new Handler(this.handlerThread.getLooper());
        }
        this.tickRunnable.performTick();
    }

    public void stop() {
        if (!this.isRunning()) {
            return;
        }
        this.delayedHandler.removeCallbacksAndMessages(null);
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.storedTime = this.currentTime + this.storedTime;
        this.isRunning = false;
        this.currentTime = 0L;
    }

    public static interface TickListener {
        public void onStopWatchTick(long var1);
    }

    public class TickRunnable
    implements Runnable {
        public long lastTickTimestamp;
        public long tempNow;
        public final StopWatch this$0;

        public TickRunnable(StopWatch stopWatch) {
            this.this$0 = stopWatch;
            this.tempNow = 0L;
            this.lastTickTimestamp = -1L;
        }

        public void performTick() {
            StopWatch stopWatch = this.this$0;
            stopWatch.delayedHandler.postDelayed((Runnable)stopWatch.tickRunnable, (long)stopWatch.tickDelay);
        }

        public void run() {
            long l;
            if (this.lastTickTimestamp == -1L) {
                this.lastTickTimestamp = this.this$0.startTime;
            }
            this.tempNow = l = System.currentTimeMillis();
            StopWatch stopWatch = this.this$0;
            float f2 = stopWatch.currentTime;
            stopWatch.currentTime = (long)((float)(l - this.lastTickTimestamp) * stopWatch.speedMultiplier + f2);
            this.lastTickTimestamp = l;
            if (stopWatch.isRunning) {
                this.performTick();
            }
            stopWatch = this.this$0;
            TickListener tickListener = stopWatch.listener;
            if (tickListener != null) {
                tickListener.onStopWatchTick(stopWatch.currentTime + stopWatch.storedTime);
            }
        }
    }
}

