package t5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class g extends f {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f14497e;
    public Uri f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f14498g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f14499h;

    /* renamed from: i, reason: collision with root package name */
    public long f14500i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14501j;

    public static class a extends l {
        public a(IOException iOException, int i10) {
            super(i10, iOException);
        }
    }

    public g(Context context) {
        super(false);
        this.f14497e = context.getContentResolver();
    }

    @Override // t5.k
    public final long a(n nVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = nVar.f14547a;
            this.f = uri;
            q(nVar);
            if ("content".equals(nVar.f14547a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f14497e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f14497e.openAssetFileDescriptor(uri, "r");
            }
            this.f14498g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f14499h = fileInputStream;
            if (length != -1 && nVar.f > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(nVar.f + startOffset) - startOffset;
            if (skip != nVar.f) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f14500i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f14500i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f14500i = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j11 = nVar.f14552g;
            if (j11 != -1) {
                long j12 = this.f14500i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f14500i = j11;
            }
            this.f14501j = true;
            r(nVar);
            long j13 = nVar.f14552g;
            return j13 != -1 ? j13 : this.f14500i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // t5.k
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14499h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14499h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14498g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f14498g = null;
                    if (this.f14501j) {
                        this.f14501j = false;
                        p();
                    }
                }
            } catch (Throwable th) {
                this.f14499h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14498g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14498g = null;
                        if (this.f14501j) {
                            this.f14501j = false;
                            p();
                        }
                        throw th;
                    } finally {
                        this.f14498g = null;
                        if (this.f14501j) {
                            this.f14501j = false;
                            p();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(e12, 2000);
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
        long j10 = this.f14500i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f14499h;
        int i12 = v5.e0.f15881a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f14500i;
        if (j11 != -1) {
            this.f14500i = j11 - read;
        }
        o(read);
        return read;
    }
}
