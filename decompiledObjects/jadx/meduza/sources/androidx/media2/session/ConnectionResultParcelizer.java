package androidx.media2.session;

import android.app.PendingIntent;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.media2.session.IMediaSession;
import b2.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ConnectionResultParcelizer {
    public static ConnectionResult read(c cVar) {
        ConnectionResult connectionResult = new ConnectionResult();
        connectionResult.f1054a = cVar.o(connectionResult.f1054a, 0);
        IBinder iBinder = connectionResult.f1056c;
        if (cVar.l(1)) {
            iBinder = cVar.v();
        }
        connectionResult.f1056c = iBinder;
        connectionResult.f1065m = cVar.o(connectionResult.f1065m, 10);
        connectionResult.f1066n = cVar.o(connectionResult.f1066n, 11);
        connectionResult.f1067o = (ParcelImplListSlice) cVar.s(connectionResult.f1067o, 12);
        connectionResult.f1068p = (SessionCommandGroup) cVar.x(connectionResult.f1068p, 13);
        connectionResult.f1069q = cVar.o(connectionResult.f1069q, 14);
        connectionResult.f1070r = cVar.o(connectionResult.f1070r, 15);
        connectionResult.f1071s = cVar.o(connectionResult.f1071s, 16);
        connectionResult.t = cVar.h(17, connectionResult.t);
        connectionResult.f1072u = (VideoSize) cVar.x(connectionResult.f1072u, 18);
        List<SessionPlayer$TrackInfo> list = connectionResult.f1073v;
        if (cVar.l(19)) {
            list = (List) cVar.k(new ArrayList());
        }
        connectionResult.f1073v = list;
        connectionResult.f1057d = (PendingIntent) cVar.s(connectionResult.f1057d, 2);
        connectionResult.f1074w = (SessionPlayer$TrackInfo) cVar.x(connectionResult.f1074w, 20);
        connectionResult.f1075x = (SessionPlayer$TrackInfo) cVar.x(connectionResult.f1075x, 21);
        connectionResult.f1076y = (SessionPlayer$TrackInfo) cVar.x(connectionResult.f1076y, 23);
        connectionResult.f1077z = (SessionPlayer$TrackInfo) cVar.x(connectionResult.f1077z, 24);
        connectionResult.A = (MediaMetadata) cVar.x(connectionResult.A, 25);
        connectionResult.B = cVar.o(connectionResult.B, 26);
        connectionResult.f1058e = cVar.o(connectionResult.f1058e, 3);
        connectionResult.f1059g = (MediaItem) cVar.x(connectionResult.f1059g, 4);
        connectionResult.f1060h = cVar.q(5, connectionResult.f1060h);
        connectionResult.f1061i = cVar.q(6, connectionResult.f1061i);
        float f = connectionResult.f1062j;
        if (cVar.l(7)) {
            f = cVar.m();
        }
        connectionResult.f1062j = f;
        connectionResult.f1063k = cVar.q(8, connectionResult.f1063k);
        connectionResult.f1064l = (MediaController$PlaybackInfo) cVar.x(connectionResult.f1064l, 9);
        connectionResult.f1055b = IMediaSession.Stub.asInterface(connectionResult.f1056c);
        connectionResult.f = connectionResult.f1059g;
        return connectionResult;
    }

    public static void write(ConnectionResult connectionResult, c cVar) {
        cVar.getClass();
        synchronized (connectionResult.f1055b) {
            if (connectionResult.f1056c == null) {
                connectionResult.f1056c = (IBinder) connectionResult.f1055b;
                connectionResult.f1059g = a.a(connectionResult.f);
            }
        }
        cVar.I(connectionResult.f1054a, 0);
        IBinder iBinder = connectionResult.f1056c;
        cVar.y(1);
        cVar.P(iBinder);
        cVar.I(connectionResult.f1065m, 10);
        cVar.I(connectionResult.f1066n, 11);
        cVar.M(connectionResult.f1067o, 12);
        cVar.R(connectionResult.f1068p, 13);
        cVar.I(connectionResult.f1069q, 14);
        cVar.I(connectionResult.f1070r, 15);
        cVar.I(connectionResult.f1071s, 16);
        cVar.B(17, connectionResult.t);
        cVar.R(connectionResult.f1072u, 18);
        cVar.F(19, connectionResult.f1073v);
        cVar.M(connectionResult.f1057d, 2);
        cVar.R(connectionResult.f1074w, 20);
        cVar.R(connectionResult.f1075x, 21);
        cVar.R(connectionResult.f1076y, 23);
        cVar.R(connectionResult.f1077z, 24);
        cVar.R(connectionResult.A, 25);
        cVar.I(connectionResult.B, 26);
        cVar.I(connectionResult.f1058e, 3);
        cVar.R(connectionResult.f1059g, 4);
        cVar.J(5, connectionResult.f1060h);
        cVar.J(6, connectionResult.f1061i);
        float f = connectionResult.f1062j;
        cVar.y(7);
        cVar.G(f);
        cVar.J(8, connectionResult.f1063k);
        cVar.R(connectionResult.f1064l, 9);
    }
}
