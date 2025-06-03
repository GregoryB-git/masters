/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.ViewConfiguration
 *  java.lang.Enum
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

abstract class SwipeDirectionDetector {
    private boolean isDetected;
    private float startX;
    private float startY;
    private int touchSlop;

    public SwipeDirectionDetector(Context context) {
        this.touchSlop = ViewConfiguration.get((Context)context).getScaledTouchSlop();
    }

    private float getDistance(MotionEvent motionEvent) {
        float f = motionEvent.getX(0) - this.startX;
        float f2 = motionEvent.getY(0) - this.startY;
        double d = 0.0f;
        return (float)(Math.sqrt((double)(f2 * f2 + f * f)) + d);
    }

    public double getAngle(float f, float f2, float f3, float f4) {
        return ((Math.atan2((double)(f2 - f4), (double)(f3 - f)) + Math.PI) * 180.0 / Math.PI + 180.0) % 360.0;
    }

    public Direction getDirection(float f, float f2, float f3, float f4) {
        return Direction.get(this.getAngle(f, f2, f3, f4));
    }

    public abstract void onDirectionDetected(Direction var1);

    public boolean onTouchEvent(MotionEvent motionEvent) {
        block5: {
            block2: {
                block3: {
                    block4: {
                        int n = motionEvent.getAction();
                        if (n == 0) break block2;
                        if (n == 1) break block3;
                        if (n == 2) break block4;
                        if (n == 3) break block3;
                        break block5;
                    }
                    if (!this.isDetected && this.getDistance(motionEvent) > (float)this.touchSlop) {
                        this.isDetected = true;
                        float f = motionEvent.getX();
                        float f2 = motionEvent.getY();
                        this.onDirectionDetected(this.getDirection(this.startX, this.startY, f, f2));
                    }
                    break block5;
                }
                if (!this.isDetected) {
                    this.onDirectionDetected(Direction.NOT_DETECTED);
                }
                this.startY = 0.0f;
                this.startX = 0.0f;
                this.isDetected = false;
                break block5;
            }
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
        }
        return false;
    }

    public static final class Direction
    extends Enum<Direction> {
        private static final Direction[] $VALUES;
        public static final /* enum */ Direction DOWN;
        public static final /* enum */ Direction LEFT;
        public static final /* enum */ Direction NOT_DETECTED;
        public static final /* enum */ Direction RIGHT;
        public static final /* enum */ Direction UP;

        static {
            Direction direction;
            Direction direction2;
            Direction direction3;
            Direction direction4;
            Direction direction5;
            NOT_DETECTED = direction5 = new Direction();
            UP = direction4 = new Direction();
            DOWN = direction3 = new Direction();
            LEFT = direction2 = new Direction();
            RIGHT = direction = new Direction();
            $VALUES = new Direction[]{direction5, direction4, direction3, direction2, direction};
        }

        public static Direction get(double d) {
            if (Direction.inRange(d, 45.0f, 135.0f)) {
                return UP;
            }
            if (!Direction.inRange(d, 0.0f, 45.0f) && !Direction.inRange(d, 315.0f, 360.0f)) {
                if (Direction.inRange(d, 225.0f, 315.0f)) {
                    return DOWN;
                }
                return LEFT;
            }
            return RIGHT;
        }

        private static boolean inRange(double d, float f, float f2) {
            boolean bl = d >= (double)f && d < (double)f2;
            return bl;
        }

        public static Direction valueOf(String string2) {
            return (Direction)Enum.valueOf(Direction.class, (String)string2);
        }

        public static Direction[] values() {
            return (Direction[])$VALUES.clone();
        }
    }
}

