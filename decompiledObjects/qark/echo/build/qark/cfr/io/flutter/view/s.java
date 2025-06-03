/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  android.os.Handler
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 *  android.view.Display
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Objects
 */
package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Display;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

public class s {
    public static s e;
    public static b f;
    public long a = -1L;
    public FlutterJNI b;
    public c c;
    public final FlutterJNI.b d;

    public s(FlutterJNI flutterJNI) {
        this.c = new c(0L);
        this.d = new FlutterJNI.b(){

            @Override
            public void a(long l8) {
                Choreographer.getInstance().postFrameCallback(this.b(l8));
            }

            public final Choreographer.FrameCallback b(long l8) {
                if (s.this.c != null) {
                    s.this.c.o = l8;
                    c c8 = s.this.c;
                    s.this.c = null;
                    return c8;
                }
                return new c(l8);
            }
        };
        this.b = flutterJNI;
    }

    public static s f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (e == null) {
            e = new s(flutterJNI);
        }
        if (f == null) {
            Object object = e;
            Objects.requireNonNull((Object)object);
            f = object = (s)object.new b(displayManager);
            object.a();
        }
        if (s.e.a == -1L) {
            float f8 = displayManager.getDisplay(0).getRefreshRate();
            s.e.a = (long)(1.0E9 / (double)f8);
            flutterJNI.setRefreshRateFPS(f8);
        }
        return e;
    }

    public void g() {
        this.b.setAsyncWaitForVsyncDelegate(this.d);
    }

    public class b
    implements DisplayManager.DisplayListener {
        public DisplayManager a;

        public b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public void a() {
            this.a.registerDisplayListener((DisplayManager.DisplayListener)this, null);
        }

        public void onDisplayAdded(int n8) {
        }

        public void onDisplayChanged(int n8) {
            if (n8 == 0) {
                float f8 = this.a.getDisplay(0).getRefreshRate();
                s.this.a = (long)(1.0E9 / (double)f8);
                s.this.b.setRefreshRateFPS(f8);
            }
        }

        public void onDisplayRemoved(int n8) {
        }
    }

    public class c
    implements Choreographer.FrameCallback {
        public long o;

        public c(long l8) {
            this.o = l8;
        }

        public void doFrame(long l8) {
            l8 = System.nanoTime() - l8;
            if (l8 < 0L) {
                l8 = 0L;
            }
            s.this.b.onVsync(l8, s.this.a, this.o);
            s.this.c = this;
        }
    }

}

