// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import android.os.Message;
import android.os.Handler$Callback;
import android.media.AudioFocusRequest$Builder;
import H.c;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Looper;
import android.os.Build$VERSION;
import android.os.Handler;
import android.media.AudioManager$OnAudioFocusChangeListener;

public class a
{
    public static final AudioAttributesCompat g;
    public final int a;
    public final AudioManager$OnAudioFocusChangeListener b;
    public final Handler c;
    public final AudioAttributesCompat d;
    public final boolean e;
    public final Object f;
    
    static {
        g = new AudioAttributesCompat.a().d(1).a();
    }
    
    public a(final int a, final AudioManager$OnAudioFocusChangeListener b, final Handler c, final AudioAttributesCompat d, final boolean e) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26 && c.getLooper() != Looper.getMainLooper()) {
            this.b = (AudioManager$OnAudioFocusChangeListener)new c(b, c);
        }
        else {
            this.b = b;
        }
        AudioFocusRequest a2;
        if (sdk_INT >= 26) {
            a2 = androidx.media.a.a.a(a, this.a(), e, this.b, c);
        }
        else {
            a2 = null;
        }
        this.f = a2;
    }
    
    public AudioAttributes a() {
        final AudioAttributesCompat d = this.d;
        if (d != null) {
            return (AudioAttributes)d.d();
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
    
    public AudioManager$OnAudioFocusChangeListener e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.a == a.a && this.e == a.e && H.c.a(this.b, a.b) && H.c.a(this.c, a.c) && H.c.a(this.d, a.d);
    }
    
    @Override
    public int hashCode() {
        return H.c.b(this.a, this.b, this.c, this.d, this.e);
    }
    
    public abstract static class a
    {
        public static AudioFocusRequest a(final int n, final AudioAttributes audioAttributes, final boolean willPauseWhenDucked, final AudioManager$OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener, final Handler handler) {
            return new AudioFocusRequest$Builder(n).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(willPauseWhenDucked).setOnAudioFocusChangeListener(audioManager$OnAudioFocusChangeListener, handler).build();
        }
    }
    
    public static final class b
    {
        public int a;
        public AudioManager$OnAudioFocusChangeListener b;
        public Handler c;
        public AudioAttributesCompat d;
        public boolean e;
        
        public b(final int n) {
            this.d = a.g;
            this.d(n);
        }
        
        public static boolean b(final int n) {
            return n == 1 || n == 2 || n == 3 || n == 4;
        }
        
        public a a() {
            if (this.b != null) {
                return new a(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        
        public b c(final AudioAttributesCompat d) {
            if (d != null) {
                this.d = d;
                return this;
            }
            throw new NullPointerException("Illegal null AudioAttributes");
        }
        
        public b d(final int n) {
            if (b(n)) {
                this.a = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Illegal audio focus gain type ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public b e(final AudioManager$OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener) {
            return this.f(audioManager$OnAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }
        
        public b f(final AudioManager$OnAudioFocusChangeListener b, final Handler c) {
            if (b == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (c != null) {
                this.b = b;
                this.c = c;
                return this;
            }
            throw new IllegalArgumentException("Handler must not be null");
        }
        
        public b g(final boolean e) {
            this.e = e;
            return this;
        }
    }
    
    public static class c implements Handler$Callback, AudioManager$OnAudioFocusChangeListener
    {
        public final Handler o;
        public final AudioManager$OnAudioFocusChangeListener p;
        
        public c(final AudioManager$OnAudioFocusChangeListener p2, final Handler handler) {
            this.p = p2;
            this.o = new Handler(handler.getLooper(), (Handler$Callback)this);
        }
        
        public boolean handleMessage(final Message message) {
            if (message.what == 2782386) {
                this.p.onAudioFocusChange(message.arg1);
                return true;
            }
            return false;
        }
        
        public void onAudioFocusChange(final int n) {
            final Handler o = this.o;
            o.sendMessage(Message.obtain(o, 2782386, n, 0));
        }
    }
}
