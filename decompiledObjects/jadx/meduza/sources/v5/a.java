package v5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f15861a;

    /* renamed from: b, reason: collision with root package name */
    public final File f15862b;

    /* renamed from: v5.a$a, reason: collision with other inner class name */
    public static final class C0250a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final FileOutputStream f15863a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15864b = false;

        public C0250a(File file) {
            this.f15863a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15864b) {
                return;
            }
            this.f15864b = true;
            flush();
            try {
                this.f15863a.getFD().sync();
            } catch (IOException e10) {
                m.g("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f15863a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f15863a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            this.f15863a.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f15863a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            this.f15863a.write(bArr, i10, i11);
        }
    }

    public a(File file) {
        this.f15861a = file;
        this.f15862b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f15862b.exists()) {
            this.f15861a.delete();
            this.f15862b.renameTo(this.f15861a);
        }
        return new FileInputStream(this.f15861a);
    }

    public final C0250a b() {
        if (this.f15861a.exists()) {
            if (this.f15862b.exists()) {
                this.f15861a.delete();
            } else if (!this.f15861a.renameTo(this.f15862b)) {
                StringBuilder l10 = defpackage.f.l("Couldn't rename file ");
                l10.append(this.f15861a);
                l10.append(" to backup file ");
                l10.append(this.f15862b);
                m.f("AtomicFile", l10.toString());
            }
        }
        try {
            return new C0250a(this.f15861a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f15861a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder l11 = defpackage.f.l("Couldn't create ");
                l11.append(this.f15861a);
                throw new IOException(l11.toString(), e10);
            }
            try {
                return new C0250a(this.f15861a);
            } catch (FileNotFoundException e11) {
                StringBuilder l12 = defpackage.f.l("Couldn't create ");
                l12.append(this.f15861a);
                throw new IOException(l12.toString(), e11);
            }
        }
    }
}
