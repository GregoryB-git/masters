/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.media.session.PlaybackState
 *  android.media.session.PlaybackState$Builder
 *  android.media.session.PlaybackState$CustomAction
 *  android.media.session.PlaybackState$CustomAction$Builder
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SuppressLint(value={"BanParcelableUsage"})
public final class PlaybackStateCompat
implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator(){

        public PlaybackStateCompat a(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] b(int n8) {
            return new PlaybackStateCompat[n8];
        }
    };
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

    public PlaybackStateCompat(int n8, long l8, long l9, float f8, long l10, int n9, CharSequence charSequence, long l11, List list, long l12, Bundle bundle) {
        this.o = n8;
        this.p = l8;
        this.q = l9;
        this.r = f8;
        this.s = l10;
        this.t = n9;
        this.u = charSequence;
        this.v = l11;
        this.w = new ArrayList((Collection)list);
        this.x = l12;
        this.y = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.o = parcel.readInt();
        this.p = parcel.readLong();
        this.r = parcel.readFloat();
        this.v = parcel.readLong();
        this.q = parcel.readLong();
        this.s = parcel.readLong();
        this.u = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.w = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.x = parcel.readLong();
        this.y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.t = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object object) {
        Object object2 = null;
        Iterator iterator = null;
        if (object != null) {
            PlaybackState playbackState = (PlaybackState)object;
            List<PlaybackState.CustomAction> list = b.j(playbackState);
            object = iterator;
            if (list != null) {
                object2 = new ArrayList(list.size());
                iterator = list.iterator();
                do {
                    object = object2;
                    if (!iterator.hasNext()) break;
                    object2.add((Object)CustomAction.a(iterator.next()));
                } while (true);
            }
            object2 = c.a(playbackState);
            MediaSessionCompat.a((Bundle)object2);
            object2 = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), (List)object, b.h(playbackState), (Bundle)object2);
            object2.z = playbackState;
        }
        return object2;
    }

    public static int h(long l8) {
        if (l8 == 4L) {
            return 126;
        }
        if (l8 == 2L) {
            return 127;
        }
        if (l8 == 32L) {
            return 87;
        }
        if (l8 == 16L) {
            return 88;
        }
        if (l8 == 1L) {
            return 86;
        }
        if (l8 == 64L) {
            return 90;
        }
        if (l8 == 8L) {
            return 89;
        }
        if (l8 == 512L) {
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
            PlaybackState.Builder builder = b.d();
            b.x(builder, this.o, this.p, this.r, this.v);
            b.u(builder, this.q);
            b.s(builder, this.s);
            b.v(builder, this.u);
            Iterator iterator = this.w.iterator();
            while (iterator.hasNext()) {
                b.a(builder, (PlaybackState.CustomAction)((CustomAction)iterator.next()).b());
            }
            b.t(builder, this.x);
            c.b(builder, this.y);
            this.z = b.c(builder);
        }
        return this.z;
    }

    public long f() {
        return this.p;
    }

    public int g() {
        return this.o;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.o);
        stringBuilder.append(", position=");
        stringBuilder.append(this.p);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.q);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.r);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.v);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.s);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.t);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.u);
        stringBuilder.append(", custom actions=");
        stringBuilder.append((Object)this.w);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.x);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.o);
        parcel.writeLong(this.p);
        parcel.writeFloat(this.r);
        parcel.writeLong(this.v);
        parcel.writeLong(this.q);
        parcel.writeLong(this.s);
        TextUtils.writeToParcel((CharSequence)this.u, (Parcel)parcel, (int)n8);
        parcel.writeTypedList(this.w);
        parcel.writeLong(this.x);
        parcel.writeBundle(this.y);
        parcel.writeInt(this.t);
    }

    public static final class CustomAction
    implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator(){

            public CustomAction a(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] b(int n8) {
                return new CustomAction[n8];
            }
        };
        public final String o;
        public final CharSequence p;
        public final int q;
        public final Bundle r;
        public PlaybackState.CustomAction s;

        public CustomAction(Parcel parcel) {
            this.o = parcel.readString();
            this.p = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.q = parcel.readInt();
            this.r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String string2, CharSequence charSequence, int n8, Bundle bundle) {
            this.o = string2;
            this.p = charSequence;
            this.q = n8;
            this.r = bundle;
        }

        public static CustomAction a(Object object) {
            if (object != null) {
                object = (PlaybackState.CustomAction)object;
                Object object2 = android.support.v4.media.session.PlaybackStateCompat$b.l((PlaybackState.CustomAction)object);
                MediaSessionCompat.a((Bundle)object2);
                object2 = new CustomAction(android.support.v4.media.session.PlaybackStateCompat$b.f((PlaybackState.CustomAction)object), android.support.v4.media.session.PlaybackStateCompat$b.o((PlaybackState.CustomAction)object), android.support.v4.media.session.PlaybackStateCompat$b.m((PlaybackState.CustomAction)object), (Bundle)object2);
                object2.s = object;
                return object2;
            }
            return null;
        }

        public Object b() {
            PlaybackState.CustomAction customAction;
            PlaybackState.CustomAction customAction2 = customAction = this.s;
            if (customAction == null) {
                customAction2 = android.support.v4.media.session.PlaybackStateCompat$b.e(this.o, this.p, this.q);
                android.support.v4.media.session.PlaybackStateCompat$b.w((PlaybackState.CustomAction.Builder)customAction2, this.r);
                customAction2 = android.support.v4.media.session.PlaybackStateCompat$b.b((PlaybackState.CustomAction.Builder)customAction2);
            }
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Action:mName='");
            stringBuilder.append((Object)this.p);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.q);
            stringBuilder.append(", mExtras=");
            stringBuilder.append((Object)this.r);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeString(this.o);
            TextUtils.writeToParcel((CharSequence)this.p, (Parcel)parcel, (int)n8);
            parcel.writeInt(this.q);
            parcel.writeBundle(this.r);
        }

        public static final class b {
            public final String a;
            public final CharSequence b;
            public final int c;
            public Bundle d;

            public b(String string2, CharSequence charSequence, int n8) {
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                        if (n8 != 0) {
                            this.a = string2;
                            this.b = charSequence;
                            this.c = n8;
                            return;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
            }

            public CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }

            public b b(Bundle bundle) {
                this.d = bundle;
                return this;
            }
        }

    }

    public static abstract class b {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState.CustomAction.Builder e(String string2, CharSequence charSequence, int n8) {
            return new PlaybackState.CustomAction.Builder(string2, charSequence, n8);
        }

        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static void s(PlaybackState.Builder builder, long l8) {
            builder.setActions(l8);
        }

        public static void t(PlaybackState.Builder builder, long l8) {
            builder.setActiveQueueItemId(l8);
        }

        public static void u(PlaybackState.Builder builder, long l8) {
            builder.setBufferedPosition(l8);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int n8, long l8, float f8, long l9) {
            builder.setState(n8, l8, f8, l9);
        }
    }

    public static abstract class c {
        public static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public static final class d {
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

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.j = -1L;
            this.b = playbackStateCompat.o;
            this.c = playbackStateCompat.p;
            this.e = playbackStateCompat.r;
            this.i = playbackStateCompat.v;
            this.d = playbackStateCompat.q;
            this.f = playbackStateCompat.s;
            this.g = playbackStateCompat.t;
            this.h = playbackStateCompat.u;
            List list = playbackStateCompat.w;
            if (list != null) {
                arrayList.addAll((Collection)list);
            }
            this.j = playbackStateCompat.x;
            this.k = playbackStateCompat.y;
        }

        public d a(CustomAction customAction) {
            if (customAction != null) {
                this.a.add((Object)customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }

        public PlaybackStateCompat b() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public d c(long l8) {
            this.f = l8;
            return this;
        }

        public d d(long l8) {
            this.j = l8;
            return this;
        }

        public d e(long l8) {
            this.d = l8;
            return this;
        }

        public d f(int n8, CharSequence charSequence) {
            this.g = n8;
            this.h = charSequence;
            return this;
        }

        public d g(Bundle bundle) {
            this.k = bundle;
            return this;
        }

        public d h(int n8, long l8, float f8, long l9) {
            this.b = n8;
            this.c = l8;
            this.i = l9;
            this.e = f8;
            return this;
        }
    }

}

