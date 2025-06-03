package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final int f8253o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8254p;

    /* renamed from: q, reason: collision with root package name */
    public final long f8255q;

    /* renamed from: r, reason: collision with root package name */
    public final float f8256r;

    /* renamed from: s, reason: collision with root package name */
    public final long f8257s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8258t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f8259u;

    /* renamed from: v, reason: collision with root package name */
    public final long f8260v;

    /* renamed from: w, reason: collision with root package name */
    public List f8261w;

    /* renamed from: x, reason: collision with root package name */
    public final long f8262x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f8263y;

    /* renamed from: z, reason: collision with root package name */
    public PlaybackState f8264z;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public final String f8265o;

        /* renamed from: p, reason: collision with root package name */
        public final CharSequence f8266p;

        /* renamed from: q, reason: collision with root package name */
        public final int f8267q;

        /* renamed from: r, reason: collision with root package name */
        public final Bundle f8268r;

        /* renamed from: s, reason: collision with root package name */
        public PlaybackState.CustomAction f8269s;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i7) {
                return new CustomAction[i7];
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f8270a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f8271b;

            /* renamed from: c, reason: collision with root package name */
            public final int f8272c;

            /* renamed from: d, reason: collision with root package name */
            public Bundle f8273d;

            public b(String str, CharSequence charSequence, int i7) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i7 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f8270a = str;
                this.f8271b = charSequence;
                this.f8272c = i7;
            }

            public CustomAction a() {
                return new CustomAction(this.f8270a, this.f8271b, this.f8272c, this.f8273d);
            }

            public b b(Bundle bundle) {
                this.f8273d = bundle;
                return this;
            }
        }

        public CustomAction(Parcel parcel) {
            this.f8265o = parcel.readString();
            this.f8266p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8267q = parcel.readInt();
            this.f8268r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l7 = b.l(customAction);
            MediaSessionCompat.a(l7);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l7);
            customAction2.f8269s = customAction;
            return customAction2;
        }

        public Object b() {
            PlaybackState.CustomAction customAction = this.f8269s;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e7 = b.e(this.f8265o, this.f8266p, this.f8267q);
            b.w(e7, this.f8268r);
            return b.b(e7);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f8266p) + ", mIcon=" + this.f8267q + ", mExtras=" + this.f8268r;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f8265o);
            TextUtils.writeToParcel(this.f8266p, parcel, i7);
            parcel.writeInt(this.f8267q);
            parcel.writeBundle(this.f8268r);
        }

        public CustomAction(String str, CharSequence charSequence, int i7, Bundle bundle) {
            this.f8265o = str;
            this.f8266p = charSequence;
            this.f8267q = i7;
            this.f8268r = bundle;
        }
    }

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i7) {
            return new PlaybackStateCompat[i7];
        }
    }

    public static class b {
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

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i7) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i7);
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

        public static void s(PlaybackState.Builder builder, long j7) {
            builder.setActions(j7);
        }

        public static void t(PlaybackState.Builder builder, long j7) {
            builder.setActiveQueueItemId(j7);
        }

        public static void u(PlaybackState.Builder builder, long j7) {
            builder.setBufferedPosition(j7);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i7, long j7, float f7, long j8) {
            builder.setState(i7, j7, f7, j8);
        }
    }

    public static class c {
        public static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final List f8274a;

        /* renamed from: b, reason: collision with root package name */
        public int f8275b;

        /* renamed from: c, reason: collision with root package name */
        public long f8276c;

        /* renamed from: d, reason: collision with root package name */
        public long f8277d;

        /* renamed from: e, reason: collision with root package name */
        public float f8278e;

        /* renamed from: f, reason: collision with root package name */
        public long f8279f;

        /* renamed from: g, reason: collision with root package name */
        public int f8280g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f8281h;

        /* renamed from: i, reason: collision with root package name */
        public long f8282i;

        /* renamed from: j, reason: collision with root package name */
        public long f8283j;

        /* renamed from: k, reason: collision with root package name */
        public Bundle f8284k;

        public d() {
            this.f8274a = new ArrayList();
            this.f8283j = -1L;
        }

        public d a(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.f8274a.add(customAction);
            return this;
        }

        public PlaybackStateCompat b() {
            return new PlaybackStateCompat(this.f8275b, this.f8276c, this.f8277d, this.f8278e, this.f8279f, this.f8280g, this.f8281h, this.f8282i, this.f8274a, this.f8283j, this.f8284k);
        }

        public d c(long j7) {
            this.f8279f = j7;
            return this;
        }

        public d d(long j7) {
            this.f8283j = j7;
            return this;
        }

        public d e(long j7) {
            this.f8277d = j7;
            return this;
        }

        public d f(int i7, CharSequence charSequence) {
            this.f8280g = i7;
            this.f8281h = charSequence;
            return this;
        }

        public d g(Bundle bundle) {
            this.f8284k = bundle;
            return this;
        }

        public d h(int i7, long j7, float f7, long j8) {
            this.f8275b = i7;
            this.f8276c = j7;
            this.f8282i = j8;
            this.f8278e = f7;
            return this;
        }

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f8274a = arrayList;
            this.f8283j = -1L;
            this.f8275b = playbackStateCompat.f8253o;
            this.f8276c = playbackStateCompat.f8254p;
            this.f8278e = playbackStateCompat.f8256r;
            this.f8282i = playbackStateCompat.f8260v;
            this.f8277d = playbackStateCompat.f8255q;
            this.f8279f = playbackStateCompat.f8257s;
            this.f8280g = playbackStateCompat.f8258t;
            this.f8281h = playbackStateCompat.f8259u;
            List list = playbackStateCompat.f8261w;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f8283j = playbackStateCompat.f8262x;
            this.f8284k = playbackStateCompat.f8263y;
        }
    }

    public PlaybackStateCompat(int i7, long j7, long j8, float f7, long j9, int i8, CharSequence charSequence, long j10, List list, long j11, Bundle bundle) {
        this.f8253o = i7;
        this.f8254p = j7;
        this.f8255q = j8;
        this.f8256r = f7;
        this.f8257s = j9;
        this.f8258t = i8;
        this.f8259u = charSequence;
        this.f8260v = j10;
        this.f8261w = new ArrayList(list);
        this.f8262x = j11;
        this.f8263y = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j7 = b.j(playbackState);
        if (j7 != null) {
            arrayList = new ArrayList(j7.size());
            Iterator<PlaybackState.CustomAction> it = j7.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle a7 = c.a(playbackState);
        MediaSessionCompat.a(a7);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), a7);
        playbackStateCompat.f8264z = playbackState;
        return playbackStateCompat;
    }

    public static int h(long j7) {
        if (j7 == 4) {
            return 126;
        }
        if (j7 == 2) {
            return 127;
        }
        if (j7 == 32) {
            return 87;
        }
        if (j7 == 16) {
            return 88;
        }
        if (j7 == 1) {
            return 86;
        }
        if (j7 == 64) {
            return 90;
        }
        if (j7 == 8) {
            return 89;
        }
        return j7 == 512 ? 85 : 0;
    }

    public long b() {
        return this.f8257s;
    }

    public long c() {
        return this.f8260v;
    }

    public float d() {
        return this.f8256r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object e() {
        if (this.f8264z == null) {
            PlaybackState.Builder d7 = b.d();
            b.x(d7, this.f8253o, this.f8254p, this.f8256r, this.f8260v);
            b.u(d7, this.f8255q);
            b.s(d7, this.f8257s);
            b.v(d7, this.f8259u);
            Iterator it = this.f8261w.iterator();
            while (it.hasNext()) {
                b.a(d7, (PlaybackState.CustomAction) ((CustomAction) it.next()).b());
            }
            b.t(d7, this.f8262x);
            c.b(d7, this.f8263y);
            this.f8264z = b.c(d7);
        }
        return this.f8264z;
    }

    public long f() {
        return this.f8254p;
    }

    public int g() {
        return this.f8253o;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f8253o + ", position=" + this.f8254p + ", buffered position=" + this.f8255q + ", speed=" + this.f8256r + ", updated=" + this.f8260v + ", actions=" + this.f8257s + ", error code=" + this.f8258t + ", error message=" + this.f8259u + ", custom actions=" + this.f8261w + ", active item id=" + this.f8262x + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8253o);
        parcel.writeLong(this.f8254p);
        parcel.writeFloat(this.f8256r);
        parcel.writeLong(this.f8260v);
        parcel.writeLong(this.f8255q);
        parcel.writeLong(this.f8257s);
        TextUtils.writeToParcel(this.f8259u, parcel, i7);
        parcel.writeTypedList(this.f8261w);
        parcel.writeLong(this.f8262x);
        parcel.writeBundle(this.f8263y);
        parcel.writeInt(this.f8258t);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f8253o = parcel.readInt();
        this.f8254p = parcel.readLong();
        this.f8256r = parcel.readFloat();
        this.f8260v = parcel.readLong();
        this.f8255q = parcel.readLong();
        this.f8257s = parcel.readLong();
        this.f8259u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8261w = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f8262x = parcel.readLong();
        this.f8263y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f8258t = parcel.readInt();
    }
}
