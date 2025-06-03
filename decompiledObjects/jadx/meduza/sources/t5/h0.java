package t5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h0 extends f {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f14503e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f14504g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f14505h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f14506i;

    /* renamed from: j, reason: collision with root package name */
    public long f14507j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14508k;

    public static class a extends l {
        public a(int i10, String str, Exception exc) {
            super(i10, str, exc);
        }
    }

    public h0(Context context) {
        super(false);
        this.f14503e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1.matches("\\d+") != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    @Override // t5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(t5.n r15) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.h0.a(t5.n):long");
    }

    @Override // t5.k
    public final void close() {
        this.f14504g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14506i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14506i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14505h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(2000, null, e10);
                    }
                } finally {
                    this.f14505h = null;
                    if (this.f14508k) {
                        this.f14508k = false;
                        p();
                    }
                }
            } catch (Throwable th) {
                this.f14506i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14505h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14505h = null;
                        if (this.f14508k) {
                            this.f14508k = false;
                            p();
                        }
                        throw th;
                    } finally {
                        this.f14505h = null;
                        if (this.f14508k) {
                            this.f14508k = false;
                            p();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(2000, null, e11);
                }
            }
        } catch (IOException e12) {
            throw new a(2000, null, e12);
        }
    }

    @Override // t5.k
    public final Uri l() {
        return this.f14504g;
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14507j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(2000, null, e10);
            }
        }
        FileInputStream fileInputStream = this.f14506i;
        int i12 = v5.e0.f15881a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f14507j == -1) {
                return -1;
            }
            throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j11 = this.f14507j;
        if (j11 != -1) {
            this.f14507j = j11 - read;
        }
        o(read);
        return read;
    }
}
