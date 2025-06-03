/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFocusRequest
 *  android.media.AudioFocusRequest$Builder
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;

public class a {
    public static final AudioAttributesCompat g = new AudioAttributesCompat.a().d(1).a();
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final AudioAttributesCompat d;
    public final boolean e;
    public final Object f;

    /*
     * Enabled aggressive block sorting
     */
    public a(int n8, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean bl) {
        this.a = n8;
        this.c = handler;
        this.d = audioAttributesCompat;
        this.e = bl;
        int n9 = Build.VERSION.SDK_INT;
        this.b = n9 < 26 && handler.getLooper() != Looper.getMainLooper() ? new c(onAudioFocusChangeListener, handler) : onAudioFocusChangeListener;
        onAudioFocusChangeListener = n9 >= 26 ? a.a(n8, this.a(), bl, this.b, handler) : null;
        this.f = onAudioFocusChangeListener;
    }

    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes)audioAttributesCompat.d();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.d;
    }

    public AudioFocusRequest c() {
        return a0.a.a(this.f);
    }

    public int d() {
        return this.a;
    }

    public AudioManager.OnAudioFocusChangeListener e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (this.a == object.a && this.e == object.e && H.c.a((Object)this.b, (Object)object.b) && H.c.a((Object)this.c, (Object)object.c) && H.c.a(this.d, object.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return H.c.b(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public static abstract class a {
        public static AudioFocusRequest a(int n8, AudioAttributes audioAttributes, boolean bl, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(n8).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(bl).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static final class b {
        public int a;
        public AudioManager.OnAudioFocusChangeListener b;
        public Handler c;
        public AudioAttributesCompat d = a.g;
        public boolean e;

        public b(int n8) {
            this.d(n8);
        }

        public static boolean b(int n8) {
            if (n8 != 1 && n8 != 2 && n8 != 3 && n8 != 4) {
                return false;
            }
            return true;
        }

        public a a() {
            if (this.b != null) {
                return new a(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat != null) {
                this.d = audioAttributesCompat;
                return this;
            }
            throw new NullPointerException("Illegal null AudioAttributes");
        }

        public b d(int n8) {
            if (b.b(n8)) {
                this.a = n8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal audio focus gain type ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return this.f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener != null) {
                if (handler != null) {
                    this.b = onAudioFocusChangeListener;
                    this.c = handler;
                    return this;
                }
                throw new IllegalArgumentException("Handler must not be null");
            }
            throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
        }

        public b g(boolean bl) {
            this.e = bl;
            return this;
        }
    }

    public static class c
    implements Handler.Callback,
    AudioManager.OnAudioFocusChangeListener {
        public final Handler o;
        public final AudioManager.OnAudioFocusChangeListener p;

        public c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.p = onAudioFocusChangeListener;
            this.o = new Handler(handler.getLooper(), (Handler.Callback)this);
        }

        public boolean handleMessage(Message message) {
            if (message.what == 2782386) {
                this.p.onAudioFocusChange(message.arg1);
                return true;
            }
            return false;
        }

        public void onAudioFocusChange(int n8) {
            Handler handler = this.o;
            handler.sendMessage(Message.obtain((Handler)handler, (int)2782386, (int)n8, (int)0));
        }
    }

}

