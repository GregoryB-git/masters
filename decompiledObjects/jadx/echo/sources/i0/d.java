package i0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import g0.M;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f14635e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f14636f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f14637g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f14638h;

    /* renamed from: i, reason: collision with root package name */
    public long f14639i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14640j;

    public static class a extends h {
        public a(IOException iOException, int i7) {
            super(iOException, i7);
        }
    }

    public d(Context context) {
        super(false);
        this.f14635e = context.getContentResolver();
    }

    @Override // i0.g
    public void close() {
        this.f14636f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14638h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14638h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14637g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new a(e7, 2000);
                    }
                } finally {
                    this.f14637g = null;
                    if (this.f14640j) {
                        this.f14640j = false;
                        r();
                    }
                }
            } catch (Throwable th) {
                this.f14638h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14637g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14637g = null;
                        if (this.f14640j) {
                            this.f14640j = false;
                            r();
                        }
                        throw th;
                    } finally {
                        this.f14637g = null;
                        if (this.f14640j) {
                            this.f14640j = false;
                            r();
                        }
                    }
                } catch (IOException e8) {
                    throw new a(e8, 2000);
                }
            }
        } catch (IOException e9) {
            throw new a(e9, 2000);
        }
    }

    @Override // i0.g
    public long e(k kVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = kVar.f14652a.normalizeScheme();
            this.f14636f = normalizeScheme;
            s(kVar);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f14635e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f14635e.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f14637g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f14638h = fileInputStream;
            if (length != -1 && kVar.f14658g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(kVar.f14658g + startOffset) - startOffset;
            if (skip != kVar.f14658g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f14639i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f14639i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j7 = length - skip;
                this.f14639i = j7;
                if (j7 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j8 = kVar.f14659h;
            if (j8 != -1) {
                long j9 = this.f14639i;
                if (j9 != -1) {
                    j8 = Math.min(j9, j8);
                }
                this.f14639i = j8;
            }
            this.f14640j = true;
            t(kVar);
            long j10 = kVar.f14659h;
            return j10 != -1 ? j10 : this.f14639i;
        } catch (a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // i0.g
    public Uri k() {
        return this.f14636f;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f14639i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        }
        int read = ((FileInputStream) M.i(this.f14638h)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f14639i;
        if (j8 != -1) {
            this.f14639i = j8 - read;
        }
        q(read);
        return read;
    }
}
