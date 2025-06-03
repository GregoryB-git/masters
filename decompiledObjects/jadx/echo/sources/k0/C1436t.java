package k0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import m0.InterfaceC1657x;
import m0.InterfaceC1659z;
import m0.N;
import s0.InterfaceC1935c;
import t0.C1982k;
import t0.InterfaceC1984m;
import u0.C2001c;
import u0.InterfaceC2000b;
import z0.C2290i;
import z0.InterfaceC2289h;

/* renamed from: k0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1436t implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15928a;

    /* renamed from: b, reason: collision with root package name */
    public final C1982k f15929b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15932e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15934g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15935h;

    /* renamed from: c, reason: collision with root package name */
    public int f15930c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f15931d = 5000;

    /* renamed from: f, reason: collision with root package name */
    public t0.z f15933f = t0.z.f19573a;

    public C1436t(Context context) {
        this.f15928a = context;
        this.f15929b = new C1982k(context);
    }

    @Override // k0.c1
    public Y0[] a(Handler handler, D0.E e7, InterfaceC1657x interfaceC1657x, InterfaceC2289h interfaceC2289h, InterfaceC2000b interfaceC2000b) {
        ArrayList arrayList = new ArrayList();
        i(this.f15928a, this.f15930c, this.f15933f, this.f15932e, handler, e7, this.f15931d, arrayList);
        InterfaceC1659z c7 = c(this.f15928a, this.f15934g, this.f15935h);
        if (c7 != null) {
            b(this.f15928a, this.f15930c, this.f15933f, this.f15932e, c7, handler, interfaceC1657x, arrayList);
        }
        h(this.f15928a, interfaceC2289h, handler.getLooper(), this.f15930c, arrayList);
        f(this.f15928a, interfaceC2000b, handler.getLooper(), this.f15930c, arrayList);
        d(this.f15928a, this.f15930c, arrayList);
        e(arrayList);
        g(this.f15928a, handler, this.f15930c, arrayList);
        return (Y0[]) arrayList.toArray(new Y0[0]);
    }

    public void b(Context context, int i7, t0.z zVar, boolean z7, InterfaceC1659z interfaceC1659z, Handler handler, InterfaceC1657x interfaceC1657x, ArrayList arrayList) {
        String str;
        int i8;
        int i9;
        int i10;
        arrayList.add(new m0.b0(context, j(), zVar, z7, handler, interfaceC1657x, interfaceC1659z));
        if (i7 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i7 == 2) {
            size--;
        }
        try {
            try {
                i8 = size + 1;
                try {
                    arrayList.add(size, (Y0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    str = "DefaultRenderersFactory";
                } catch (ClassNotFoundException unused) {
                    str = "DefaultRenderersFactory";
                }
                try {
                    g0.o.f(str, "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i8;
                    i8 = size;
                    try {
                        i9 = i8 + 1;
                        try {
                            try {
                                arrayList.add(i8, (Y0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                                g0.o.f(str, "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused3) {
                                i8 = i9;
                                i9 = i8;
                                i10 = i9 + 1;
                                arrayList.add(i9, (Y0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                                g0.o.f(str, "Loaded LibflacAudioRenderer.");
                                arrayList.add(i10, (Y0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                                g0.o.f(str, "Loaded FfmpegAudioRenderer.");
                            }
                            i10 = i9 + 1;
                            arrayList.add(i9, (Y0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                            g0.o.f(str, "Loaded LibflacAudioRenderer.");
                            arrayList.add(i10, (Y0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                            g0.o.f(str, "Loaded FfmpegAudioRenderer.");
                        } catch (Exception e7) {
                            throw new RuntimeException("Error instantiating FLAC extension", e7);
                        }
                    } catch (Exception e8) {
                        throw new RuntimeException("Error instantiating Opus extension", e8);
                    }
                }
            } catch (ClassNotFoundException unused4) {
                str = "DefaultRenderersFactory";
            }
            try {
                i9 = i8 + 1;
                arrayList.add(i8, (Y0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                g0.o.f(str, "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            }
            try {
                i10 = i9 + 1;
            } catch (ClassNotFoundException unused6) {
            }
            try {
                try {
                    arrayList.add(i9, (Y0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                    g0.o.f(str, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                    i9 = i10;
                    i10 = i9;
                    arrayList.add(i10, (Y0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                    g0.o.f(str, "Loaded FfmpegAudioRenderer.");
                }
                arrayList.add(i10, (Y0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1657x.class, InterfaceC1659z.class).newInstance(handler, interfaceC1657x, interfaceC1659z));
                g0.o.f(str, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused8) {
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e9);
            }
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating MIDI extension", e10);
        }
    }

    public InterfaceC1659z c(Context context, boolean z7, boolean z8) {
        return new N.f(context).k(z7).j(z8).i();
    }

    public void d(Context context, int i7, ArrayList arrayList) {
        arrayList.add(new E0.b());
    }

    public void e(ArrayList arrayList) {
        arrayList.add(new s0.g(InterfaceC1935c.a.f19150a, null));
    }

    public void f(Context context, InterfaceC2000b interfaceC2000b, Looper looper, int i7, ArrayList arrayList) {
        arrayList.add(new C2001c(interfaceC2000b, looper));
    }

    public void h(Context context, InterfaceC2289h interfaceC2289h, Looper looper, int i7, ArrayList arrayList) {
        arrayList.add(new C2290i(interfaceC2289h, looper));
    }

    public void i(Context context, int i7, t0.z zVar, boolean z7, Handler handler, D0.E e7, long j7, ArrayList arrayList) {
        int i8;
        arrayList.add(new D0.k(context, j(), zVar, j7, z7, handler, e7, 50));
        if (i7 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i7 == 2) {
            size--;
        }
        try {
            try {
                i8 = size + 1;
            } catch (Exception e8) {
                throw new RuntimeException("Error instantiating VP9 extension", e8);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            try {
                arrayList.add(size, (Y0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, D0.E.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, e7, 50));
                g0.o.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i8;
                i8 = size;
                try {
                    int i9 = i8 + 1;
                    try {
                        arrayList.add(i8, (Y0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, D0.E.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, e7, 50));
                        g0.o.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i8 = i9;
                        i9 = i8;
                        arrayList.add(i9, (Y0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, D0.E.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, e7, 50));
                        g0.o.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                        return;
                    }
                    arrayList.add(i9, (Y0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, D0.E.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, e7, 50));
                    g0.o.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                    return;
                } catch (Exception e9) {
                    throw new RuntimeException("Error instantiating AV1 extension", e9);
                }
            }
            arrayList.add(i9, (Y0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, D0.E.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, e7, 50));
            g0.o.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            return;
        } catch (ClassNotFoundException unused4) {
            return;
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e10);
        }
        try {
            int i92 = i8 + 1;
            arrayList.add(i8, (Y0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, D0.E.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler, e7, 50));
            g0.o.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused5) {
        }
    }

    public InterfaceC1984m.b j() {
        return this.f15929b;
    }

    public void g(Context context, Handler handler, int i7, ArrayList arrayList) {
    }
}
