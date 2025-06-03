package i0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import g0.AbstractC1297a;
import g0.M;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f14626e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f14627f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f14628g;

    /* renamed from: h, reason: collision with root package name */
    public long f14629h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14630i;

    /* renamed from: i0.a$a, reason: collision with other inner class name */
    public static final class C0215a extends h {
        public C0215a(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public C1341a(Context context) {
        super(false);
        this.f14626e = context.getAssets();
    }

    @Override // i0.g
    public void close() {
        this.f14627f = null;
        try {
            try {
                InputStream inputStream = this.f14628g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new C0215a(e7, 2000);
            }
        } finally {
            this.f14628g = null;
            if (this.f14630i) {
                this.f14630i = false;
                r();
            }
        }
    }

    @Override // i0.g
    public long e(k kVar) {
        try {
            Uri uri = kVar.f14652a;
            this.f14627f = uri;
            String str = (String) AbstractC1297a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            s(kVar);
            InputStream open = this.f14626e.open(str, 1);
            this.f14628g = open;
            if (open.skip(kVar.f14658g) < kVar.f14658g) {
                throw new C0215a(null, 2008);
            }
            long j7 = kVar.f14659h;
            if (j7 != -1) {
                this.f14629h = j7;
            } else {
                long available = this.f14628g.available();
                this.f14629h = available;
                if (available == 2147483647L) {
                    this.f14629h = -1L;
                }
            }
            this.f14630i = true;
            t(kVar);
            return this.f14629h;
        } catch (C0215a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new C0215a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // i0.g
    public Uri k() {
        return this.f14627f;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f14629h;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new C0215a(e7, 2000);
            }
        }
        int read = ((InputStream) M.i(this.f14628g)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f14629h;
        if (j8 != -1) {
            this.f14629h = j8 - read;
        }
        q(read);
        return read;
    }
}
