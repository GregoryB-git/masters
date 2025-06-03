/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 */
package k0;

import D0.E;
import D0.k;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import g0.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import k0.Y0;
import k0.c1;
import m0.N;
import m0.b0;
import m0.x;
import s0.c;
import s0.e;
import s0.g;
import t0.m;
import t0.z;
import u0.b;
import z0.h;
import z0.i;

public class t
implements c1 {
    public final Context a;
    public final t0.k b;
    public int c;
    public long d;
    public boolean e;
    public z f;
    public boolean g;
    public boolean h;

    public t(Context context) {
        this.a = context;
        this.b = new t0.k(context);
        this.c = 0;
        this.d = 5000L;
        this.f = z.a;
    }

    @Override
    public Y0[] a(Handler handler, E object, x x8, h h8, b b8) {
        ArrayList arrayList = new ArrayList();
        this.i(this.a, this.c, this.f, this.e, handler, (E)object, this.d, arrayList);
        object = this.c(this.a, this.g, this.h);
        if (object != null) {
            this.b(this.a, this.c, this.f, this.e, (m0.z)object, handler, x8, arrayList);
        }
        this.h(this.a, h8, handler.getLooper(), this.c, arrayList);
        this.f(this.a, b8, handler.getLooper(), this.c, arrayList);
        this.d(this.a, this.c, arrayList);
        this.e(arrayList);
        this.g(this.a, handler, this.c, arrayList);
        return (Y0[])arrayList.toArray((Object[])new Y0[0]);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b(Context object, int n8, z z8, boolean bl, m0.z z9, Handler handler, x x8, ArrayList arrayList) {
        block26 : {
            int n9;
            block25 : {
                block23 : {
                    block24 : {
                        int n10;
                        arrayList.add((Object)new b0((Context)object, this.j(), z8, bl, handler, x8, z9));
                        if (n8 == 0) {
                            return;
                        }
                        n9 = n10 = arrayList.size();
                        if (n8 == 2) {
                            n9 = n10 - 1;
                        }
                        object = (Y0)Class.forName((String)"androidx.media3.decoder.midi.MidiRenderer").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{object});
                        n8 = n9 + 1;
                        try {
                            arrayList.add(n9, object);
                            o.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                        }
                        catch (Exception exception) {
                            throw new RuntimeException("Error instantiating MIDI extension", (Throwable)exception);
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            break block23;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            break block24;
                        }
                        catch (ClassNotFoundException classNotFoundException) {}
                    }
                    n9 = n8;
                }
                n8 = n9;
                object = (Y0)Class.forName((String)"androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(new Class[]{Handler.class, x.class, m0.z.class}).newInstance(new Object[]{handler, x8, z9});
                n9 = n8 + 1;
                try {
                    arrayList.add(n8, object);
                    o.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    n8 = n9;
                    break block25;
                }
                catch (Exception exception) {
                    throw new RuntimeException("Error instantiating Opus extension", (Throwable)exception);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    break block25;
                }
                catch (ClassNotFoundException classNotFoundException) {}
                n8 = n9;
            }
            object = (Y0)Class.forName((String)"androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(new Class[]{Handler.class, x.class, m0.z.class}).newInstance(new Object[]{handler, x8, z9});
            n9 = n8 + 1;
            try {
                arrayList.add(n8, object);
                o.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                n8 = n9;
                break block26;
            }
            catch (Exception exception) {
                throw new RuntimeException("Error instantiating FLAC extension", (Throwable)exception);
            }
            catch (ClassNotFoundException classNotFoundException) {
                break block26;
            }
            catch (ClassNotFoundException classNotFoundException) {}
            n8 = n9;
        }
        try {
            arrayList.add(n8, (Object)((Y0)Class.forName((String)"androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[]{Handler.class, x.class, m0.z.class}).newInstance(new Object[]{handler, x8, z9})));
            o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            return;
        }
        catch (Exception exception) {
            throw new RuntimeException("Error instantiating FFmpeg extension", (Throwable)exception);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }

    public m0.z c(Context context, boolean bl, boolean bl2) {
        return new N.f(context).k(bl).j(bl2).i();
    }

    public void d(Context context, int n8, ArrayList arrayList) {
        arrayList.add((Object)new E0.b());
    }

    public void e(ArrayList arrayList) {
        arrayList.add((Object)new g(c.a.a, null));
    }

    public void f(Context context, b b8, Looper looper, int n8, ArrayList arrayList) {
        arrayList.add((Object)new u0.c(b8, looper));
    }

    public void g(Context context, Handler handler, int n8, ArrayList arrayList) {
    }

    public void h(Context context, h h8, Looper looper, int n8, ArrayList arrayList) {
        arrayList.add((Object)new i(h8, looper));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void i(Context object, int n8, z z8, boolean bl, Handler handler, E e8, long l8, ArrayList arrayList) {
        block17 : {
            int n9;
            block15 : {
                block16 : {
                    int n10;
                    arrayList.add((Object)new k((Context)object, this.j(), z8, l8, bl, handler, e8, 50));
                    if (n8 == 0) {
                        return;
                    }
                    n9 = n10 = arrayList.size();
                    if (n8 == 2) {
                        n9 = n10 - 1;
                    }
                    object = (Y0)Class.forName((String)"androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Long.TYPE, Handler.class, E.class, Integer.TYPE}).newInstance(new Object[]{l8, handler, e8, 50});
                    n8 = n9 + 1;
                    try {
                        arrayList.add(n9, object);
                        o.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                        break block15;
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Error instantiating VP9 extension", (Throwable)exception);
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        break block16;
                    }
                    catch (ClassNotFoundException classNotFoundException) {}
                    n9 = n8;
                }
                n8 = n9;
            }
            object = (Y0)Class.forName((String)"androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(new Class[]{Long.TYPE, Handler.class, E.class, Integer.TYPE}).newInstance(new Object[]{l8, handler, e8, 50});
            n9 = n8 + 1;
            try {
                arrayList.add(n8, object);
                o.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                n8 = n9;
                break block17;
            }
            catch (Exception exception) {
                throw new RuntimeException("Error instantiating AV1 extension", (Throwable)exception);
            }
            catch (ClassNotFoundException classNotFoundException) {
                break block17;
            }
            catch (ClassNotFoundException classNotFoundException) {}
            n8 = n9;
        }
        try {
            arrayList.add(n8, (Object)((Y0)Class.forName((String)"androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(new Class[]{Long.TYPE, Handler.class, E.class, Integer.TYPE}).newInstance(new Object[]{l8, handler, e8, 50})));
            o.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            return;
        }
        catch (Exception exception) {
            throw new RuntimeException("Error instantiating FFmpeg extension", (Throwable)exception);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }

    public m.b j() {
        return this.b;
    }
}

