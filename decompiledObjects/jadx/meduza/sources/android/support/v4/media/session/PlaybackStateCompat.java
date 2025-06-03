package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f520a;

    /* renamed from: b, reason: collision with root package name */
    public final long f521b;

    /* renamed from: c, reason: collision with root package name */
    public final long f522c;

    /* renamed from: d, reason: collision with root package name */
    public final float f523d;

    /* renamed from: e, reason: collision with root package name */
    public final long f524e;
    public final int f;

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f525o;

    /* renamed from: p, reason: collision with root package name */
    public final long f526p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f527q;

    /* renamed from: r, reason: collision with root package name */
    public final long f528r;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f529s;
    public PlaybackState t;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f530a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f531b;

        /* renamed from: c, reason: collision with root package name */
        public final int f532c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f533d;

        /* renamed from: e, reason: collision with root package name */
        public PlaybackState.CustomAction f534e;

        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f530a = parcel.readString();
            this.f531b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f532c = parcel.readInt();
            this.f533d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f530a = str;
            this.f531b = charSequence;
            this.f532c = i10;
            this.f533d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder l10 = f.l("Action:mName='");
            l10.append((Object) this.f531b);
            l10.append(", mIcon=");
            l10.append(this.f532c);
            l10.append(", mExtras=");
            l10.append(this.f533d);
            return l10.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f530a);
            TextUtils.writeToParcel(this.f531b, parcel, i10);
            parcel.writeInt(this.f532c);
            parcel.writeBundle(this.f533d);
        }
    }

    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
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

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
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

        public static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        public static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        public static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i10, long j10, float f, long j11) {
            builder.setState(i10, j10, f, j11);
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

        /* renamed from: b, reason: collision with root package name */
        public long f536b;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f535a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public long f537c = -1;
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f520a = i10;
        this.f521b = j10;
        this.f522c = j11;
        this.f523d = f;
        this.f524e = j12;
        this.f = i11;
        this.f525o = charSequence;
        this.f526p = j13;
        this.f527q = new ArrayList(arrayList);
        this.f528r = j14;
        this.f529s = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f520a = parcel.readInt();
        this.f521b = parcel.readLong();
        this.f523d = parcel.readFloat();
        this.f526p = parcel.readLong();
        this.f522c = parcel.readLong();
        this.f524e = parcel.readLong();
        this.f525o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f527q = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f528r = parcel.readLong();
        this.f529s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction customAction2 : j10) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l10 = b.l(customAction3);
                    MediaSessionCompat.a(l10);
                    customAction = new CustomAction(b.f(customAction3), b.o(customAction3), b.m(customAction3), l10);
                    customAction.f534e = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle a10 = c.a(playbackState);
        MediaSessionCompat.a(a10);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), a10);
        playbackStateCompat.t = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f520a + ", position=" + this.f521b + ", buffered position=" + this.f522c + ", speed=" + this.f523d + ", updated=" + this.f526p + ", actions=" + this.f524e + ", error code=" + this.f + ", error message=" + this.f525o + ", custom actions=" + this.f527q + ", active item id=" + this.f528r + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f520a);
        parcel.writeLong(this.f521b);
        parcel.writeFloat(this.f523d);
        parcel.writeLong(this.f526p);
        parcel.writeLong(this.f522c);
        parcel.writeLong(this.f524e);
        TextUtils.writeToParcel(this.f525o, parcel, i10);
        parcel.writeTypedList(this.f527q);
        parcel.writeLong(this.f528r);
        parcel.writeBundle(this.f529s);
        parcel.writeInt(this.f);
    }
}
