// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.view;

import android.os.Handler;
import android.hardware.display.DisplayManager$DisplayListener;
import java.util.Objects;
import android.hardware.display.DisplayManager;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

public class s
{
    public static s e;
    public static b f;
    public long a;
    public FlutterJNI b;
    public c c;
    public final FlutterJNI.b d;
    
    public s(final FlutterJNI b) {
        this.a = -1L;
        this.c = new c(0L);
        this.d = new FlutterJNI.b() {
            @Override
            public void a(final long n) {
                Choreographer.getInstance().postFrameCallback(this.b(n));
            }
            
            public final Choreographer$FrameCallback b(final long n) {
                if (s.d(s.this) != null) {
                    s.c.a(s.d(s.this), n);
                    final s.c d = s.d(s.this);
                    s.e(s.this, null);
                    return (Choreographer$FrameCallback)d;
                }
                return (Choreographer$FrameCallback)new s.c(n);
            }
        };
        this.b = b;
    }
    
    public static /* synthetic */ long a(final s s) {
        return s.a;
    }
    
    public static /* synthetic */ long b(final s s, final long a) {
        return s.a = a;
    }
    
    public static /* synthetic */ FlutterJNI c(final s s) {
        return s.b;
    }
    
    public static /* synthetic */ c d(final s s) {
        return s.c;
    }
    
    public static /* synthetic */ c e(final s s, final c c) {
        return s.c = c;
    }
    
    public static s f(final DisplayManager displayManager, final FlutterJNI flutterJNI) {
        if (s.e == null) {
            s.e = new s(flutterJNI);
        }
        if (s.f == null) {
            final s e = s.e;
            Objects.requireNonNull(e);
            (s.f = e.new b(displayManager)).a();
        }
        if (s.e.a == -1L) {
            final float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            s.e.a = (long)(1.0E9 / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return s.e;
    }
    
    public void g() {
        this.b.setAsyncWaitForVsyncDelegate(this.d);
    }
    
    public class b implements DisplayManager$DisplayListener
    {
        public DisplayManager a;
        
        public b(final DisplayManager a) {
            this.a = a;
        }
        
        public void a() {
            this.a.registerDisplayListener((DisplayManager$DisplayListener)this, (Handler)null);
        }
        
        public void onDisplayAdded(final int n) {
        }
        
        public void onDisplayChanged(final int n) {
            if (n == 0) {
                final float refreshRate = this.a.getDisplay(0).getRefreshRate();
                s.b(s.this, (long)(1.0E9 / refreshRate));
                s.c(s.this).setRefreshRateFPS(refreshRate);
            }
        }
        
        public void onDisplayRemoved(final int n) {
        }
    }
    
    public class c implements Choreographer$FrameCallback
    {
        public long o;
        
        public c(final long o) {
            this.o = o;
        }
        
        public static /* synthetic */ long a(final c c, final long o) {
            return c.o = o;
        }
        
        public void doFrame(long n) {
            n = System.nanoTime() - n;
            if (n < 0L) {
                n = 0L;
            }
            s.c(s.this).onVsync(n, s.a(s.this), this.o);
            s.e(s.this, this);
        }
    }
}
