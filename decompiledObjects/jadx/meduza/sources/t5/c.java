package t5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f14451e;
    public Uri f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f14452g;

    /* renamed from: h, reason: collision with root package name */
    public long f14453h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14454i;

    public static final class a extends l {
        public a(int i10, IOException iOException) {
            super(i10, iOException);
        }
    }

    public c(Context context) {
        super(false);
        this.f14451e = context.getAssets();
    }

    @Override // t5.k
    public final long a(n nVar) {
        try {
            Uri uri = nVar.f14547a;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                path = path.substring(1);
            }
            q(nVar);
            InputStream open = this.f14451e.open(path, 1);
            this.f14452g = open;
            if (open.skip(nVar.f) < nVar.f) {
                throw new a(2008, null);
            }
            long j10 = nVar.f14552g;
            if (j10 != -1) {
                this.f14453h = j10;
            } else {
                long available = this.f14452g.available();
                this.f14453h = available;
                if (available == 2147483647L) {
                    this.f14453h = -1L;
                }
            }
            this.f14454i = true;
            r(nVar);
            return this.f14453h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11 instanceof FileNotFoundException ? 2005 : 2000, e11);
        }
    }

    @Override // t5.k
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.f14452g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(2000, e10);
            }
        } finally {
            this.f14452g = null;
            if (this.f14454i) {
                this.f14454i = false;
                p();
            }
        }
    }

    @Override // t5.k
    public final Uri l() {
        return this.f;
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14453h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(2000, e10);
            }
        }
        InputStream inputStream = this.f14452g;
        int i12 = v5.e0.f15881a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f14453h;
        if (j11 != -1) {
            this.f14453h = j11 - read;
        }
        o(read);
        return read;
    }
}
