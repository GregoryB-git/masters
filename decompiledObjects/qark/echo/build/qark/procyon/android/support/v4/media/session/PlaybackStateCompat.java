// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media.session;

import android.media.session.PlaybackState$CustomAction$Builder;
import android.media.session.PlaybackState$Builder;
import java.util.Iterator;
import android.media.session.PlaybackState$CustomAction;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Parcel;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class PlaybackStateCompat implements Parcelable
{
    public static final Parcelable$Creator<PlaybackStateCompat> CREATOR;
    public final int o;
    public final long p;
    public final long q;
    public final float r;
    public final long s;
    public final int t;
    public final CharSequence u;
    public final long v;
    public List w;
    public final long x;
    public final Bundle y;
    public PlaybackState z;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public PlaybackStateCompat a(final Parcel parcel) {
                return new PlaybackStateCompat(parcel);
            }
            
            public PlaybackStateCompat[] b(final int n) {
                return new PlaybackStateCompat[n];
            }
        };
    }
    
    public PlaybackStateCompat(final int o, final long p11, final long q, final float r, final long s, final int t, final CharSequence u, final long v, final List c, final long x, final Bundle y) {
        this.o = o;
        this.p = p11;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = new ArrayList(c);
        this.x = x;
        this.y = y;
    }
    
    public PlaybackStateCompat(final Parcel parcel) {
        this.o = parcel.readInt();
        this.p = parcel.readLong();
        this.r = parcel.readFloat();
        this.v = parcel.readLong();
        this.q = parcel.readLong();
        this.s = parcel.readLong();
        this.u = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.w = parcel.createTypedArrayList((Parcelable$Creator)CustomAction.CREATOR);
        this.x = parcel.readLong();
        this.y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.t = parcel.readInt();
    }
    
    public static PlaybackStateCompat a(final Object o) {
        PlaybackStateCompat playbackStateCompat = null;
        final List<CustomAction> list = null;
        if (o != null) {
            final PlaybackState z = (PlaybackState)o;
            final List<PlaybackState$CustomAction> j = b.j(z);
            List<CustomAction> list2 = list;
            if (j != null) {
                final ArrayList list3 = new ArrayList<CustomAction>(j.size());
                final Iterator<PlaybackState$CustomAction> iterator = j.iterator();
                while (true) {
                    list2 = (List<CustomAction>)list3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    list3.add(CustomAction.a(iterator.next()));
                }
            }
            final Bundle a = c.a(z);
            MediaSessionCompat.a(a);
            playbackStateCompat = new PlaybackStateCompat(b.r(z), b.q(z), b.i(z), b.p(z), b.g(z), 0, b.k(z), b.n(z), list2, b.h(z), a);
            playbackStateCompat.z = z;
        }
        return playbackStateCompat;
    }
    
    public static int h(final long n) {
        if (n == 4L) {
            return 126;
        }
        if (n == 2L) {
            return 127;
        }
        if (n == 32L) {
            return 87;
        }
        if (n == 16L) {
            return 88;
        }
        if (n == 1L) {
            return 86;
        }
        if (n == 64L) {
            return 90;
        }
        if (n == 8L) {
            return 89;
        }
        if (n == 512L) {
            return 85;
        }
        return 0;
    }
    
    public long b() {
        return this.s;
    }
    
    public long c() {
        return this.v;
    }
    
    public float d() {
        return this.r;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public Object e() {
        if (this.z == null) {
            final PlaybackState$Builder d = b.d();
            b.x(d, this.o, this.p, this.r, this.v);
            b.u(d, this.q);
            b.s(d, this.s);
            b.v(d, this.u);
            final Iterator<CustomAction> iterator = this.w.iterator();
            while (iterator.hasNext()) {
                b.a(d, (PlaybackState$CustomAction)iterator.next().b());
            }
            b.t(d, this.x);
            c.b(d, this.y);
            this.z = b.c(d);
        }
        return this.z;
    }
    
    public long f() {
        return this.p;
    }
    
    public int g() {
        return this.o;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.o);
        sb.append(", position=");
        sb.append(this.p);
        sb.append(", buffered position=");
        sb.append(this.q);
        sb.append(", speed=");
        sb.append(this.r);
        sb.append(", updated=");
        sb.append(this.v);
        sb.append(", actions=");
        sb.append(this.s);
        sb.append(", error code=");
        sb.append(this.t);
        sb.append(", error message=");
        sb.append(this.u);
        sb.append(", custom actions=");
        sb.append(this.w);
        sb.append(", active item id=");
        sb.append(this.x);
        sb.append("}");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.o);
        parcel.writeLong(this.p);
        parcel.writeFloat(this.r);
        parcel.writeLong(this.v);
        parcel.writeLong(this.q);
        parcel.writeLong(this.s);
        TextUtils.writeToParcel(this.u, parcel, n);
        parcel.writeTypedList(this.w);
        parcel.writeLong(this.x);
        parcel.writeBundle(this.y);
        parcel.writeInt(this.t);
    }
    
    public static final class CustomAction implements Parcelable
    {
        public static final Parcelable$Creator<CustomAction> CREATOR;
        public final String o;
        public final CharSequence p;
        public final int q;
        public final Bundle r;
        public PlaybackState$CustomAction s;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public CustomAction a(final Parcel parcel) {
                    return new CustomAction(parcel);
                }
                
                public CustomAction[] b(final int n) {
                    return new CustomAction[n];
                }
            };
        }
        
        public CustomAction(final Parcel parcel) {
            this.o = parcel.readString();
            this.p = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.q = parcel.readInt();
            this.r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
        
        public CustomAction(final String o, final CharSequence p4, final int q, final Bundle r) {
            this.o = o;
            this.p = p4;
            this.q = q;
            this.r = r;
        }
        
        public static CustomAction a(final Object o) {
            if (o != null) {
                final PlaybackState$CustomAction s = (PlaybackState$CustomAction)o;
                final Bundle l = PlaybackStateCompat.b.l(s);
                MediaSessionCompat.a(l);
                final CustomAction customAction = new CustomAction(PlaybackStateCompat.b.f(s), PlaybackStateCompat.b.o(s), PlaybackStateCompat.b.m(s), l);
                customAction.s = s;
                return customAction;
            }
            return null;
        }
        
        public Object b() {
            PlaybackState$CustomAction playbackState$CustomAction;
            if ((playbackState$CustomAction = this.s) == null) {
                final PlaybackState$CustomAction$Builder e = PlaybackStateCompat.b.e(this.o, this.p, this.q);
                PlaybackStateCompat.b.w(e, this.r);
                playbackState$CustomAction = PlaybackStateCompat.b.b(e);
            }
            return playbackState$CustomAction;
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append((Object)this.p);
            sb.append(", mIcon=");
            sb.append(this.q);
            sb.append(", mExtras=");
            sb.append(this.r);
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.o);
            TextUtils.writeToParcel(this.p, parcel, n);
            parcel.writeInt(this.q);
            parcel.writeBundle(this.r);
        }
        
        public static final class b
        {
            public final String a;
            public final CharSequence b;
            public final int c;
            public Bundle d;
            
            public b(final String a, final CharSequence b, final int c) {
                if (TextUtils.isEmpty((CharSequence)a)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(b)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (c != 0) {
                    this.a = a;
                    this.b = b;
                    this.c = c;
                    return;
                }
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
            
            public CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }
            
            public b b(final Bundle d) {
                this.d = d;
                return this;
            }
        }
    }
    
    public abstract static class b
    {
        public static void a(final PlaybackState$Builder playbackState$Builder, final PlaybackState$CustomAction playbackState$CustomAction) {
            playbackState$Builder.addCustomAction(playbackState$CustomAction);
        }
        
        public static PlaybackState$CustomAction b(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder) {
            return playbackState$CustomAction$Builder.build();
        }
        
        public static PlaybackState c(final PlaybackState$Builder playbackState$Builder) {
            return playbackState$Builder.build();
        }
        
        public static PlaybackState$Builder d() {
            return new PlaybackState$Builder();
        }
        
        public static PlaybackState$CustomAction$Builder e(final String s, final CharSequence charSequence, final int n) {
            return new PlaybackState$CustomAction$Builder(s, charSequence, n);
        }
        
        public static String f(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getAction();
        }
        
        public static long g(final PlaybackState playbackState) {
            return playbackState.getActions();
        }
        
        public static long h(final PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }
        
        public static long i(final PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }
        
        public static List<PlaybackState$CustomAction> j(final PlaybackState playbackState) {
            return (List<PlaybackState$CustomAction>)playbackState.getCustomActions();
        }
        
        public static CharSequence k(final PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }
        
        public static Bundle l(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getExtras();
        }
        
        public static int m(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getIcon();
        }
        
        public static long n(final PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }
        
        public static CharSequence o(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getName();
        }
        
        public static float p(final PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }
        
        public static long q(final PlaybackState playbackState) {
            return playbackState.getPosition();
        }
        
        public static int r(final PlaybackState playbackState) {
            return playbackState.getState();
        }
        
        public static void s(final PlaybackState$Builder playbackState$Builder, final long actions) {
            playbackState$Builder.setActions(actions);
        }
        
        public static void t(final PlaybackState$Builder playbackState$Builder, final long activeQueueItemId) {
            playbackState$Builder.setActiveQueueItemId(activeQueueItemId);
        }
        
        public static void u(final PlaybackState$Builder playbackState$Builder, final long bufferedPosition) {
            playbackState$Builder.setBufferedPosition(bufferedPosition);
        }
        
        public static void v(final PlaybackState$Builder playbackState$Builder, final CharSequence errorMessage) {
            playbackState$Builder.setErrorMessage(errorMessage);
        }
        
        public static void w(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder, final Bundle extras) {
            playbackState$CustomAction$Builder.setExtras(extras);
        }
        
        public static void x(final PlaybackState$Builder playbackState$Builder, final int n, final long n2, final float n3, final long n4) {
            playbackState$Builder.setState(n, n2, n3, n4);
        }
    }
    
    public abstract static class c
    {
        public static Bundle a(final PlaybackState playbackState) {
            return playbackState.getExtras();
        }
        
        public static void b(final PlaybackState$Builder playbackState$Builder, final Bundle extras) {
            playbackState$Builder.setExtras(extras);
        }
    }
    
    public static final class d
    {
        public final List a;
        public int b;
        public long c;
        public long d;
        public float e;
        public long f;
        public int g;
        public CharSequence h;
        public long i;
        public long j;
        public Bundle k;
        
        public d() {
            this.a = new ArrayList();
            this.j = -1L;
        }
        
        public d(final PlaybackStateCompat playbackStateCompat) {
            final ArrayList a = new ArrayList();
            this.a = a;
            this.j = -1L;
            this.b = playbackStateCompat.o;
            this.c = playbackStateCompat.p;
            this.e = playbackStateCompat.r;
            this.i = playbackStateCompat.v;
            this.d = playbackStateCompat.q;
            this.f = playbackStateCompat.s;
            this.g = playbackStateCompat.t;
            this.h = playbackStateCompat.u;
            final List w = playbackStateCompat.w;
            if (w != null) {
                a.addAll(w);
            }
            this.j = playbackStateCompat.x;
            this.k = playbackStateCompat.y;
        }
        
        public d a(final CustomAction customAction) {
            if (customAction != null) {
                this.a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }
        
        public PlaybackStateCompat b() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }
        
        public d c(final long f) {
            this.f = f;
            return this;
        }
        
        public d d(final long j) {
            this.j = j;
            return this;
        }
        
        public d e(final long d) {
            this.d = d;
            return this;
        }
        
        public d f(final int g, final CharSequence h) {
            this.g = g;
            this.h = h;
            return this;
        }
        
        public d g(final Bundle k) {
            this.k = k;
            return this;
        }
        
        public d h(final int b, final long c, final float e, final long i) {
            this.b = b;
            this.c = c;
            this.i = i;
            this.e = e;
            return this;
        }
    }
}
