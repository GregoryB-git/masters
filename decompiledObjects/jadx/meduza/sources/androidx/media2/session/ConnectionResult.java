package androidx.media2.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

/* loaded from: classes.dex */
class ConnectionResult extends CustomVersionedParcelable {
    public MediaMetadata A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public int f1054a;

    /* renamed from: b, reason: collision with root package name */
    public IMediaSession f1055b;

    /* renamed from: c, reason: collision with root package name */
    public IBinder f1056c;

    /* renamed from: d, reason: collision with root package name */
    public PendingIntent f1057d;

    /* renamed from: e, reason: collision with root package name */
    public int f1058e;
    public MediaItem f;

    /* renamed from: g, reason: collision with root package name */
    public MediaItem f1059g;

    /* renamed from: h, reason: collision with root package name */
    public long f1060h;

    /* renamed from: i, reason: collision with root package name */
    public long f1061i;

    /* renamed from: j, reason: collision with root package name */
    public float f1062j;

    /* renamed from: k, reason: collision with root package name */
    public long f1063k;

    /* renamed from: l, reason: collision with root package name */
    public MediaController$PlaybackInfo f1064l;

    /* renamed from: m, reason: collision with root package name */
    public int f1065m;

    /* renamed from: n, reason: collision with root package name */
    public int f1066n;

    /* renamed from: o, reason: collision with root package name */
    public ParcelImplListSlice f1067o;

    /* renamed from: p, reason: collision with root package name */
    public SessionCommandGroup f1068p;

    /* renamed from: q, reason: collision with root package name */
    public int f1069q;

    /* renamed from: r, reason: collision with root package name */
    public int f1070r;

    /* renamed from: s, reason: collision with root package name */
    public int f1071s;
    public Bundle t;

    /* renamed from: u, reason: collision with root package name */
    public VideoSize f1072u;

    /* renamed from: v, reason: collision with root package name */
    public List<SessionPlayer$TrackInfo> f1073v;

    /* renamed from: w, reason: collision with root package name */
    public SessionPlayer$TrackInfo f1074w;

    /* renamed from: x, reason: collision with root package name */
    public SessionPlayer$TrackInfo f1075x;

    /* renamed from: y, reason: collision with root package name */
    public SessionPlayer$TrackInfo f1076y;

    /* renamed from: z, reason: collision with root package name */
    public SessionPlayer$TrackInfo f1077z;
}
