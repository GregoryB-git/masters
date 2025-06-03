/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.view.Surface
 *  java.lang.Error
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package D0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import g0.a;
import g0.i;
import g0.j;

public final class o
extends Surface {
    public static int r;
    public static boolean s;
    public final boolean o;
    public final b p;
    public boolean q;

    public o(b b8, SurfaceTexture surfaceTexture, boolean bl) {
        super(surfaceTexture);
        this.p = b8;
        this.o = bl;
    }

    public /* synthetic */ o(b b8, SurfaceTexture surfaceTexture, boolean bl,  a8) {
        this(b8, surfaceTexture, bl);
    }

    public static int a(Context context) {
        if (j.d(context)) {
            if (j.e()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Context context) {
        synchronized (o.class) {
            boolean bl;
            try {
                int n8;
                boolean bl2 = s;
                bl = true;
                if (!bl2) {
                    r = o.a(context);
                    s = true;
                }
                if ((n8 = r) == 0) return false;
            }
            catch (Throwable throwable) {}
            return bl;
            throw throwable;
        }
    }

    public static o c(Context object, boolean bl) {
        int n8 = 0;
        boolean bl2 = !bl || o.b((Context)object);
        a.f(bl2);
        object = new b();
        if (bl) {
            n8 = r;
        }
        return object.a(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void release() {
        super.release();
        b b8 = this.p;
        synchronized (b8) {
            try {
                if (!this.q) {
                    this.p.c();
                    this.q = true;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static class b
    extends HandlerThread
    implements Handler.Callback {
        public i o;
        public Handler p;
        public Error q;
        public RuntimeException r;
        public o s;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public o a(int n8) {
            this.start();
            this.p = new Handler(this.getLooper(), (Handler.Callback)this);
            this.o = new i(this.p);
            // MONITORENTER : this
            Handler handler = this.p;
            int n9 = 0;
            handler.obtainMessage(1, n8, 0).sendToTarget();
            n8 = n9;
            do {
                if (this.s == null && this.r == null && (handler = this.q) == null) {
                    this.wait();
                    continue;
                }
                // MONITOREXIT : this
                if (n8 != 0) {
                    Thread.currentThread().interrupt();
                }
                if ((handler = this.r) != null) throw handler;
                handler = this.q;
                if (handler != null) throw handler;
                return (o)((Object)a.e((Object)this.s));
                catch (InterruptedException interruptedException) {}
                n8 = 1;
            } while (true);
        }

        public final void b(int n8) {
            a.e(this.o);
            this.o.h(n8);
            SurfaceTexture surfaceTexture = this.o.g();
            boolean bl = n8 != 0;
            this.s = new o(this, surfaceTexture, bl, null);
        }

        public void c() {
            a.e((Object)this.p);
            this.p.sendEmptyMessage(2);
        }

        public final void d() {
            a.e(this.o);
            this.o.i();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public boolean handleMessage(Message var1_1) {
            block26 : {
                var2_8 = var1_1.what;
                if (var2_8 != 1) {
                    if (var2_8 != 2) {
                        return true;
                    }
                    try {
                        this.d();
                        return true;
                    }
                    catch (Throwable var1_2) {
                        try {
                            g0.o.d("PlaceholderSurface", "Failed to release placeholder surface", var1_2);
                            return true;
                        }
                        finally {
                            this.quit();
                        }
                    }
                }
                try {
                    this.b(var1_1.arg1);
                }
                catch (Throwable var1_4) {
                    break block26;
                }
                catch (Error var1_5) {
                }
                catch (j.a var1_6) {
                    ** GOTO lbl-1000
                }
                catch (RuntimeException var1_7) {
                    ** GOTO lbl-1000
                }
                // MONITORENTER : this
                this.notify();
                // MONITOREXIT : this
                return true;
                {
                    g0.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", (Throwable)var1_5);
                    this.q = var1_5;
                }
                // MONITORENTER : this
                this.notify();
                // MONITOREXIT : this
                return true;
lbl-1000: // 1 sources:
                {
                    g0.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", (Throwable)var1_6);
                    this.r = new IllegalStateException((Throwable)var1_6);
                }
                // MONITORENTER : this
                this.notify();
                // MONITOREXIT : this
                return true;
lbl-1000: // 1 sources:
                {
                    g0.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", (Throwable)var1_7);
                    this.r = var1_7;
                }
                // MONITORENTER : this
                this.notify();
                // MONITOREXIT : this
                return true;
            }
            // MONITORENTER : this
            this.notify();
            // MONITOREXIT : this
            throw var1_4;
        }
    }

}

