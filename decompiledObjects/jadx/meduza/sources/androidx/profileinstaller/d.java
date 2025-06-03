package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import s.e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final e<c> f1145a = new e<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1146b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f1147c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1148a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1149b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1150c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1151d;

        public b(int i10, int i11, long j10, long j11) {
            this.f1148a = i10;
            this.f1149b = i11;
            this.f1150c = j10;
            this.f1151d = j11;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f1148a);
                dataOutputStream.writeInt(this.f1149b);
                dataOutputStream.writeLong(this.f1150c);
                dataOutputStream.writeLong(this.f1151d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1149b == bVar.f1149b && this.f1150c == bVar.f1150c && this.f1148a == bVar.f1148a && this.f1151d == bVar.f1151d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f1149b), Long.valueOf(this.f1150c), Integer.valueOf(this.f1148a), Long.valueOf(this.f1151d));
        }
    }

    public static class c {
    }

    public static c a(int i10, boolean z10, boolean z11) {
        c cVar = new c();
        f1147c = cVar;
        f1145a.p(cVar);
        return f1147c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:14|(1:81)(1:18)|19|(1:80)(1:23)|24|25|(1:27)(1:73)|28|29|(2:65|66)|31|(8:38|(1:42)|(1:49)|50|(2:57|58)|54|55|56)|(1:64)|(1:42)|(3:44|47|49)|50|(1:52)|57|58|54|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e7, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b7, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.d.b(android.content.Context, boolean):void");
    }
}
