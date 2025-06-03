package androidx.media;

import a0.AbstractC0718a;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f9741g = new AudioAttributesCompat.a().d(1).a();

    /* renamed from: a, reason: collision with root package name */
    public final int f9742a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f9743b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f9744c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f9745d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9746e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9747f;

    /* renamed from: androidx.media.a$a, reason: collision with other inner class name */
    public static class C0162a {
        public static AudioFocusRequest a(int i7, AudioAttributes audioAttributes, boolean z7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i7).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z7).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f9748a;

        /* renamed from: b, reason: collision with root package name */
        public AudioManager.OnAudioFocusChangeListener f9749b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f9750c;

        /* renamed from: d, reason: collision with root package name */
        public AudioAttributesCompat f9751d = a.f9741g;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9752e;

        public b(int i7) {
            d(i7);
        }

        public static boolean b(int i7) {
            return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4;
        }

        public a a() {
            if (this.f9749b != null) {
                return new a(this.f9748a, this.f9749b, this.f9750c, this.f9751d, this.f9752e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.f9751d = audioAttributesCompat;
            return this;
        }

        public b d(int i7) {
            if (b(i7)) {
                this.f9748a = i7;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i7);
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f9749b = onAudioFocusChangeListener;
            this.f9750c = handler;
            return this;
        }

        public b g(boolean z7) {
            this.f9752e = z7;
            return this;
        }
    }

    public static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: o, reason: collision with root package name */
        public final Handler f9753o;

        /* renamed from: p, reason: collision with root package name */
        public final AudioManager.OnAudioFocusChangeListener f9754p;

        public c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f9754p = onAudioFocusChangeListener;
            this.f9753o = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f9754p.onAudioFocusChange(message.arg1);
            return true;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i7) {
            Handler handler = this.f9753o;
            handler.sendMessage(Message.obtain(handler, 2782386, i7, 0));
        }
    }

    public a(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z7) {
        this.f9742a = i7;
        this.f9744c = handler;
        this.f9745d = audioAttributesCompat;
        this.f9746e = z7;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f9743b = onAudioFocusChangeListener;
        } else {
            this.f9743b = new c(onAudioFocusChangeListener, handler);
        }
        this.f9747f = i8 >= 26 ? C0162a.a(i7, a(), z7, this.f9743b, handler) : null;
    }

    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f9745d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.d();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.f9745d;
    }

    public AudioFocusRequest c() {
        return AbstractC0718a.a(this.f9747f);
    }

    public int d() {
        return this.f9742a;
    }

    public AudioManager.OnAudioFocusChangeListener e() {
        return this.f9743b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9742a == aVar.f9742a && this.f9746e == aVar.f9746e && H.c.a(this.f9743b, aVar.f9743b) && H.c.a(this.f9744c, aVar.f9744c) && H.c.a(this.f9745d, aVar.f9745d);
    }

    public int hashCode() {
        return H.c.b(Integer.valueOf(this.f9742a), this.f9743b, this.f9744c, this.f9745d, Boolean.valueOf(this.f9746e));
    }
}
