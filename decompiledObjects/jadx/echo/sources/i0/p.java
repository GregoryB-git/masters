package i0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import g0.AbstractC1297a;
import g0.M;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class p extends i0.b {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f14713e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f14714f;

    /* renamed from: g, reason: collision with root package name */
    public long f14715g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14716h;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class b extends h {
        public b(String str, Throwable th, int i7) {
            super(str, th, i7);
        }

        public b(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public p() {
        super(false);
    }

    public static RandomAccessFile u(Uri uri) {
        try {
            return new RandomAccessFile((String) AbstractC1297a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e7, (M.f14261a < 21 || !a.b(e7.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e7, 1004);
        } catch (SecurityException e8) {
            throw new b(e8, 2006);
        } catch (RuntimeException e9) {
            throw new b(e9, 2000);
        }
    }

    @Override // i0.g
    public void close() {
        this.f14714f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14713e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new b(e7, 2000);
            }
        } finally {
            this.f14713e = null;
            if (this.f14716h) {
                this.f14716h = false;
                r();
            }
        }
    }

    @Override // i0.g
    public long e(k kVar) {
        Uri uri = kVar.f14652a;
        this.f14714f = uri;
        s(kVar);
        RandomAccessFile u7 = u(uri);
        this.f14713e = u7;
        try {
            u7.seek(kVar.f14658g);
            long j7 = kVar.f14659h;
            if (j7 == -1) {
                j7 = this.f14713e.length() - kVar.f14658g;
            }
            this.f14715g = j7;
            if (j7 < 0) {
                throw new b(null, null, 2008);
            }
            this.f14716h = true;
            t(kVar);
            return this.f14715g;
        } catch (IOException e7) {
            throw new b(e7, 2000);
        }
    }

    @Override // i0.g
    public Uri k() {
        return this.f14714f;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f14715g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) M.i(this.f14713e)).read(bArr, i7, (int) Math.min(this.f14715g, i8));
            if (read > 0) {
                this.f14715g -= read;
                q(read);
            }
            return read;
        } catch (IOException e7) {
            throw new b(e7, 2000);
        }
    }
}
