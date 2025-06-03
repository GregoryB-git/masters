package t5;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class v extends f {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f14612e;
    public Uri f;

    /* renamed from: g, reason: collision with root package name */
    public long f14613g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14614h;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static class b extends l {
        public b(int i10, Exception exc) {
            super(i10, exc);
        }

        public b(int i10, String str, FileNotFoundException fileNotFoundException) {
            super(i10, str, fileNotFoundException);
        }
    }

    public v() {
        super(false);
    }

    @Override // t5.k
    public final long a(n nVar) {
        Uri uri = nVar.f14547a;
        this.f = uri;
        q(nVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f14612e = randomAccessFile;
            try {
                randomAccessFile.seek(nVar.f);
                long j10 = nVar.f14552g;
                if (j10 == -1) {
                    j10 = this.f14612e.length() - nVar.f;
                }
                this.f14613g = j10;
                if (j10 < 0) {
                    throw new b(2008, null, null);
                }
                this.f14614h = true;
                r(nVar);
                return this.f14613g;
            } catch (IOException e10) {
                throw new b(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b((v5.e0.f15881a < 21 || !a.b(e11.getCause())) ? 2005 : 2006, e11);
            }
            throw new b(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11);
        } catch (SecurityException e12) {
            throw new b(2006, e12);
        } catch (RuntimeException e13) {
            throw new b(2000, e13);
        }
    }

    @Override // t5.k
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14612e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(2000, e10);
            }
        } finally {
            this.f14612e = null;
            if (this.f14614h) {
                this.f14614h = false;
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
        long j10 = this.f14613g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14612e;
            int i12 = v5.e0.f15881a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f14613g -= read;
                o(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(2000, e10);
        }
    }
}
