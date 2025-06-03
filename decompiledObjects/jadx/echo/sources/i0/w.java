package i0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import g0.M;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class w extends b {

    /* renamed from: e, reason: collision with root package name */
    public final Context f14728e;

    /* renamed from: f, reason: collision with root package name */
    public k f14729f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f14730g;

    /* renamed from: h, reason: collision with root package name */
    public InputStream f14731h;

    /* renamed from: i, reason: collision with root package name */
    public long f14732i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14733j;

    public static class a extends h {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th, int i7) {
            super(str, th, i7);
        }
    }

    public w(Context context) {
        super(false);
        this.f14728e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.AssetFileDescriptor u(android.content.Context r5, i0.k r6) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.w.u(android.content.Context, i0.k):android.content.res.AssetFileDescriptor");
    }

    public static int v(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // i0.g
    public void close() {
        this.f14729f = null;
        try {
            try {
                InputStream inputStream = this.f14731h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f14731h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14730g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new a(null, e7, 2000);
                    }
                } finally {
                    this.f14730g = null;
                    if (this.f14733j) {
                        this.f14733j = false;
                        r();
                    }
                }
            } catch (Throwable th) {
                this.f14731h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14730g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14730g = null;
                        if (this.f14733j) {
                            this.f14733j = false;
                            r();
                        }
                        throw th;
                    } finally {
                        this.f14730g = null;
                        if (this.f14733j) {
                            this.f14733j = false;
                            r();
                        }
                    }
                } catch (IOException e8) {
                    throw new a(null, e8, 2000);
                }
            }
        } catch (IOException e9) {
            throw new a(null, e9, 2000);
        }
    }

    @Override // i0.g
    public long e(k kVar) {
        this.f14729f = kVar;
        s(kVar);
        AssetFileDescriptor u7 = u(this.f14728e, kVar);
        this.f14730g = u7;
        long length = u7.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f14730g.getFileDescriptor());
        this.f14731h = fileInputStream;
        if (length != -1) {
            try {
                if (kVar.f14658g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e7) {
                throw e7;
            } catch (IOException e8) {
                throw new a(null, e8, 2000);
            }
        }
        long startOffset = this.f14730g.getStartOffset();
        long skip = fileInputStream.skip(kVar.f14658g + startOffset) - startOffset;
        if (skip != kVar.f14658g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f14732i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f14732i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j7 = length - skip;
            this.f14732i = j7;
            if (j7 < 0) {
                throw new h(2008);
            }
        }
        long j8 = kVar.f14659h;
        if (j8 != -1) {
            long j9 = this.f14732i;
            if (j9 != -1) {
                j8 = Math.min(j9, j8);
            }
            this.f14732i = j8;
        }
        this.f14733j = true;
        t(kVar);
        long j10 = kVar.f14659h;
        return j10 != -1 ? j10 : this.f14732i;
    }

    @Override // i0.g
    public Uri k() {
        k kVar = this.f14729f;
        if (kVar != null) {
            return kVar.f14652a;
        }
        return null;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f14732i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(null, e7, 2000);
            }
        }
        int read = ((InputStream) M.i(this.f14731h)).read(bArr, i7, i8);
        if (read == -1) {
            if (this.f14732i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j8 = this.f14732i;
        if (j8 != -1) {
            this.f14732i = j8 - read;
        }
        q(read);
        return read;
    }
}
