package j8;

import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final h f8583d = new FilenameFilter() { // from class: j8.h
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final q5.i f8584e = new q5.i(3);

    /* renamed from: a, reason: collision with root package name */
    public final p8.e f8585a;

    /* renamed from: b, reason: collision with root package name */
    public String f8586b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f8587c = null;

    public i(p8.e eVar) {
        this.f8585a = eVar;
    }

    public static void a(p8.e eVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            eVar.b(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
