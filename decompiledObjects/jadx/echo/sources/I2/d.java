package I2;

import android.os.Looper;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ClassLoader f2510a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Thread f2511b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (d.class) {
            try {
                if (f2510a == null) {
                    f2510a = b();
                }
                classLoader = f2510a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return classLoader;
    }

    public static synchronized ClassLoader b() {
        synchronized (d.class) {
            ClassLoader classLoader = null;
            if (f2511b == null) {
                f2511b = c();
                if (f2511b == null) {
                    return null;
                }
            }
            synchronized (f2511b) {
                try {
                    classLoader = f2511b.getContextClassLoader();
                } catch (SecurityException e7) {
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e7.getMessage());
                }
            }
            return classLoader;
        }
    }

    public static synchronized Thread c() {
        SecurityException e7;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (d.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    try {
                        int activeGroupCount = threadGroup2.activeGroupCount();
                        ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                        threadGroup2.enumerate(threadGroupArr);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= activeGroupCount) {
                                threadGroup = null;
                                break;
                            }
                            threadGroup = threadGroupArr[i8];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i8++;
                        }
                        if (threadGroup == null) {
                            threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                        }
                        int activeCount = threadGroup.activeCount();
                        Thread[] threadArr = new Thread[activeCount];
                        threadGroup.enumerate(threadArr);
                        while (true) {
                            if (i7 >= activeCount) {
                                thread2 = null;
                                break;
                            }
                            thread2 = threadArr[i7];
                            if ("GmsDynamite".equals(thread2.getName())) {
                                break;
                            }
                            i7++;
                        }
                    } catch (SecurityException e8) {
                        e7 = e8;
                        thread = null;
                    }
                    if (thread2 == null) {
                        try {
                            thread = new c(threadGroup, "GmsDynamite");
                        } catch (SecurityException e9) {
                            e7 = e9;
                            thread = thread2;
                        }
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e10) {
                            e7 = e10;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e7.getMessage());
                            thread2 = thread;
                            return thread2;
                        }
                        thread2 = thread;
                    }
                } finally {
                }
            }
            return thread2;
        }
    }
}
