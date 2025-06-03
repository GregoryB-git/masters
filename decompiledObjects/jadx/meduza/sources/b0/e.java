package b0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1670a = new d(0);

    public interface a {
        Cursor a(Uri uri, String[] strArr, String[] strArr2);

        void close();
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f1671a;

        public b(Context context, Uri uri) {
            this.f1671a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // b0.e.a
        public final Cursor a(Uri uri, String[] strArr, String[] strArr2) {
            ContentProviderClient contentProviderClient = this.f1671a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // b0.e.a
        public final void close() {
            ContentProviderClient contentProviderClient = this.f1671a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f1672a;

        public c(Context context, Uri uri) {
            this.f1672a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // b0.e.a
        public final Cursor a(Uri uri, String[] strArr, String[] strArr2) {
            ContentProviderClient contentProviderClient = this.f1672a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // b0.e.a
        public final void close() {
            ContentProviderClient contentProviderClient = this.f1672a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[LOOP:1: B:13:0x004d->B:27:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[EDGE_INSN: B:28:0x0096->B:29:0x0096 BREAK  A[LOOP:1: B:13:0x004d->B:27:0x0092], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b0.m a(android.content.Context r21, b0.g r22) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e.a(android.content.Context, b0.g):b0.m");
    }
}
