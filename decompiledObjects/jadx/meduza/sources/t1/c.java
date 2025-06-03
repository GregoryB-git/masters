package t1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import ec.i;
import java.io.Closeable;
import java.io.File;
import lc.h;

/* loaded from: classes.dex */
public interface c extends Closeable {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14406a;

        public a(int i10) {
            this.f14406a = i10;
        }

        public static void a(String str) {
            if (h.k0(str, ":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = i.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public abstract void b(u1.c cVar);

        public abstract void c(u1.c cVar);

        public abstract void d(u1.c cVar, int i10, int i11);

        public abstract void e(u1.c cVar);

        public abstract void f(u1.c cVar, int i10, int i11);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14407a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14408b;

        /* renamed from: c, reason: collision with root package name */
        public final a f14409c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14410d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f14411e;

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            i.e(context, "context");
            this.f14407a = context;
            this.f14408b = str;
            this.f14409c = aVar;
            this.f14410d = z10;
            this.f14411e = z11;
        }
    }

    /* renamed from: t1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0226c {
        c c(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    t1.b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
