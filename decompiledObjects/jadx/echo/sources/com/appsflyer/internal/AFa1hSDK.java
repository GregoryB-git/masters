package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes.dex */
public final class AFa1hSDK implements AFa1bSDK {
    private final AFb1bSDK values;

    public static final class AFa1wSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFInAppEventType;
        boolean AFKeystoreWrapper;

        private AFa1wSDK() {
            this.AFInAppEventType = new LinkedBlockingQueue<>(1);
            this.AFKeystoreWrapper = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventType.put(iBinder);
            } catch (InterruptedException e7) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e7);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ AFa1wSDK(byte b7) {
            this();
        }
    }

    public static final class AFa1xSDK implements IInterface {
        private final IBinder valueOf;

        public AFa1xSDK(IBinder iBinder) {
            this.valueOf = iBinder;
        }

        public final String AFInAppEventParameterName() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.valueOf.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.valueOf;
        }

        public final boolean values() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.valueOf.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static final class AFa1ySDK {
        final String valueOf;
        private final boolean values;

        public AFa1ySDK(String str, boolean z7) {
            this.valueOf = str;
            this.values = z7;
        }

        public final boolean AFInAppEventType() {
            return this.values;
        }
    }

    public AFa1hSDK() {
    }

    public AFa1hSDK(AFb1bSDK aFb1bSDK) {
        this.values = aFb1bSDK;
    }

    public static AFa1ySDK AFInAppEventType(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1wSDK aFa1wSDK = new AFa1wSDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1wSDK, 1)) {
                context.unbindService(aFa1wSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1wSDK.AFKeystoreWrapper) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1wSDK.AFKeystoreWrapper = true;
            IBinder poll = aFa1wSDK.AFInAppEventType.poll(10L, TimeUnit.SECONDS);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1xSDK aFa1xSDK = new AFa1xSDK(poll);
            return new AFa1ySDK(aFa1xSDK.AFInAppEventParameterName(), aFa1xSDK.values());
        } finally {
            context.unbindService(aFa1wSDK);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.appsflyer.internal.AFa1rSDK valueOf(java.io.File r5) {
        /*
            java.lang.String r0 = "could not close load reader"
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            long r3 = r5.length()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.read(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            com.appsflyer.internal.AFa1rSDK r4 = new com.appsflyer.internal.AFa1rSDK     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r4.AFInAppEventParameterName = r5     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L2e:
            return r4
        L2f:
            r5 = move-exception
            r1 = r2
            goto L48
        L32:
            r5 = move-exception
            goto L38
        L34:
            r5 = move-exception
            goto L48
        L36:
            r5 = move-exception
            r2 = r1
        L38:
            java.lang.String r3 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.io.IOException -> L43
            goto L47
        L43:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L47:
            return r1
        L48:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L52:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1hSDK.valueOf(java.io.File):com.appsflyer.internal.AFa1rSDK");
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    @NonNull
    public final List<AFa1rSDK> values() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e7) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e7);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            StringBuilder sb = new StringBuilder("CACHE: Found cached request");
            sb.append(file2.getName());
            AFLogger.afInfoLog(sb.toString());
            arrayList.add(valueOf(file2));
        }
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    public final void AFInAppEventType() {
        try {
            File file = new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                sb.append(file2.getName());
                AFLogger.afInfoLog(sb.toString());
                StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                AFLogger.afInfoLog(sb2.toString());
                file2.delete();
            }
        } catch (Exception e7) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFa1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String valueOf(com.appsflyer.internal.AFa1rSDK r8) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1hSDK.valueOf(com.appsflyer.internal.AFa1rSDK):java.lang.String");
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    public final boolean values(String str) {
        File file = new File(new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("CACHE: Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.afInfoLog(sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e7) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e7);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFa1bSDK
    public final void valueOf() {
        try {
            if (new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e7) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e7);
        }
    }
}
