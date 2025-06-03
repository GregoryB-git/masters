package g1;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f5705g;

    /* renamed from: a, reason: collision with root package name */
    public final int f5706a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f5707b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f5708c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f5709d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5710e;
    public final Object f;

    /* renamed from: g1.a$a, reason: collision with other inner class name */
    public static class C0090a {
        public static AudioFocusRequest a(int i10, AudioAttributes audioAttributes, boolean z10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i10).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static class b implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f5711a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioManager.OnAudioFocusChangeListener f5712b;

        public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f5712b = onAudioFocusChangeListener;
            this.f5711a = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f5712b.onAudioFocusChange(message.arg1);
            return true;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            Handler handler = this.f5711a;
            handler.sendMessage(Message.obtain(handler, 2782386, i10, 0));
        }
    }

    static {
        int i10 = AudioAttributesCompat.f1018b;
        AudioAttributesImpl.a aVar = Build.VERSION.SDK_INT >= 26 ? new AudioAttributesImplApi26.a() : new AudioAttributesImplApi21.a();
        aVar.a(1);
        f5705g = new AudioAttributesCompat(aVar.build());
    }

    public a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z10) {
        this.f5706a = i10;
        this.f5708c = handler;
        this.f5709d = audioAttributesCompat;
        this.f5710e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f5707b = onAudioFocusChangeListener;
        } else {
            this.f5707b = new b(onAudioFocusChangeListener, handler);
        }
        if (i11 >= 26) {
            this.f = C0090a.a(i10, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f1019a.b() : null, z10, this.f5707b, handler);
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5706a == aVar.f5706a && this.f5710e == aVar.f5710e && Objects.equals(this.f5707b, aVar.f5707b) && Objects.equals(this.f5708c, aVar.f5708c) && Objects.equals(this.f5709d, aVar.f5709d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5706a), this.f5707b, this.f5708c, this.f5709d, Boolean.valueOf(this.f5710e));
    }
}
