package o2;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11752a = j.f("WorkerFactory");

    public final androidx.work.d a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        androidx.work.d dVar = null;
        try {
            cls = Class.forName(str).asSubclass(androidx.work.d.class);
        } catch (Throwable th) {
            j.d().c(f11752a, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                dVar = (androidx.work.d) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                j.d().c(f11752a, "Could not instantiate " + str, th2);
            }
        }
        if (dVar == null || !dVar.f1460d) {
            return dVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
