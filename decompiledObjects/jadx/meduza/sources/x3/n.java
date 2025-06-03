package x3;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import v5.e0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final a f16994a;

    /* renamed from: b, reason: collision with root package name */
    public int f16995b;

    /* renamed from: c, reason: collision with root package name */
    public long f16996c;

    /* renamed from: d, reason: collision with root package name */
    public long f16997d;

    /* renamed from: e, reason: collision with root package name */
    public long f16998e;
    public long f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f16999a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f17000b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f17001c;

        /* renamed from: d, reason: collision with root package name */
        public long f17002d;

        /* renamed from: e, reason: collision with root package name */
        public long f17003e;

        public a(AudioTrack audioTrack) {
            this.f16999a = audioTrack;
        }
    }

    public n(AudioTrack audioTrack) {
        if (e0.f15881a >= 19) {
            this.f16994a = new a(audioTrack);
            a();
        } else {
            this.f16994a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f16994a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f16995b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f16998e = 0L;
            this.f = -1L;
            this.f16996c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                j10 = 500000;
            }
        }
        this.f16997d = j10;
    }
}
