/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Parcel
 *  android.util.Base64
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFd1vSDK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
public final class AFa1hSDK
implements AFa1bSDK {
    private final AFb1bSDK values;

    public AFa1hSDK() {
    }

    public AFa1hSDK(AFb1bSDK aFb1bSDK) {
        this.values = aFb1bSDK;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AFa1ySDK AFInAppEventType(Context context) {
        Throwable throwable2;
        AFa1wSDK aFa1wSDK;
        block7 : {
            block4 : {
                block5 : {
                    block6 : {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            throw new IllegalStateException("Cannot be called from the main thread");
                        }
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        aFa1wSDK = new AFa1wSDK(0);
                        Object object = new Intent("com.google.android.gms.ads.identifier.service.START");
                        object.setPackage("com.google.android.gms");
                        try {
                            if (!context.bindService((Intent)object, (ServiceConnection)aFa1wSDK, 1)) break block4;
                            if (aFa1wSDK.AFKeystoreWrapper) break block5;
                            aFa1wSDK.AFKeystoreWrapper = true;
                            object = (IBinder)aFa1wSDK.AFInAppEventType.poll(10L, TimeUnit.SECONDS);
                            if (object == null) break block6;
                            object = new AFa1xSDK((IBinder)object);
                            object = new AFa1ySDK(object.AFInAppEventParameterName(), object.values());
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        context.unbindService((ServiceConnection)aFa1wSDK);
                        return object;
                    }
                    throw new TimeoutException("Timed out waiting for the service connection");
                }
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            context.unbindService((ServiceConnection)aFa1wSDK);
            throw new IOException("Google Play connection failed");
        }
        context.unbindService((ServiceConnection)aFa1wSDK);
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static AFa1rSDK valueOf(File file) {
        Throwable throwable;
        block13 : {
            InputStreamReader inputStreamReader;
            block14 : {
                throwable = null;
                inputStreamReader = new InputStreamReader((InputStream)new FileInputStream(file), Charset.defaultCharset());
                throwable = inputStreamReader;
                Object object = new char[(int)file.length()];
                throwable = inputStreamReader;
                inputStreamReader.read((char[])object);
                throwable = inputStreamReader;
                object = new AFa1rSDK((char[])object);
                throwable = inputStreamReader;
                object.AFInAppEventParameterName = file.getName();
                try {
                    inputStreamReader.close();
                    return object;
                }
                catch (IOException iOException) {
                    AFLogger.afErrorLogForExcManagerOnly("could not close load reader", (Throwable)iOException);
                    return object;
                }
                catch (Throwable throwable2) {
                    file = throwable;
                    throwable = throwable2;
                    break block13;
                }
                catch (Exception exception) {
                    file = null;
                    break block14;
                }
                catch (Throwable throwable3) {
                    file = throwable;
                    throwable = throwable3;
                    break block13;
                }
                catch (Exception exception) {
                    file = inputStreamReader;
                    inputStreamReader = exception;
                }
            }
            throwable = file;
            {
                AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", (Throwable)inputStreamReader);
                if (file == null) return null;
            }
            try {
                file.close();
                return null;
            }
            catch (IOException iOException) {
                AFLogger.afErrorLogForExcManagerOnly("could not close load reader", (Throwable)iOException);
            }
            return null;
        }
        if (file == null) throw throwable;
        try {
            file.close();
            throw throwable;
        }
        catch (IOException iOException) {
            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", (Throwable)iOException);
        }
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void AFInAppEventType() {
        File[] arrfile;
        int n8;
        int n9;
        try {
            arrfile = new File[](this.values.AFInAppEventType.getFilesDir(), "AFRequestCache");
            if (!arrfile.exists()) {
                arrfile.mkdir();
                return;
            }
            if ((arrfile = arrfile.listFiles()) == null) {
                return;
            }
            n8 = arrfile.length;
            n9 = 0;
        }
        catch (Exception exception) {}
        while (n9 < n8) {
            File file = arrfile[n9];
            StringBuilder stringBuilder = new StringBuilder("CACHE: Found cached request");
            stringBuilder.append(file.getName());
            AFLogger.afInfoLog(stringBuilder.toString());
            stringBuilder = new StringBuilder("CACHE: Deleting ");
            stringBuilder.append(file.getName());
            stringBuilder.append(" from cache");
            AFLogger.afInfoLog(stringBuilder.toString());
            file.delete();
            ++n9;
        }
        return;
        AFLogger.afErrorLog("CACHE: Could not cache request", (Throwable)exception);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final String valueOf(AFa1rSDK var1_1) {
        var2_5 = null;
        var3_7 = new StringBuilder(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache");
        if (!var3_7.exists()) {
            var3_7.mkdir();
            return null;
        }
        if ((var3_7 = var3_7.listFiles()) != null && var3_7.length > 40) {
            AFLogger.afInfoLog("CACHE: reached cache limit, not caching request");
            return null;
        }
        var3_7 = new StringBuilder("CACHE: caching request with URL: ");
        var3_7.append(var1_1.valueOf);
        AFLogger.afInfoLog(var3_7.toString());
        var4_11 = Long.toString((long)System.currentTimeMillis());
        var3_7 = new File(new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache"), var4_11);
        var3_7.createNewFile();
        var3_7 = new OutputStreamWriter((OutputStream)new FileOutputStream(var3_7.getPath(), true), Charset.defaultCharset());
        var2_5 = var3_7;
        var3_7.write("version=");
        var2_5 = var3_7;
        var3_7.write(var1_1.AFKeystoreWrapper);
        var2_5 = var3_7;
        var3_7.write(10);
        var2_5 = var3_7;
        var3_7.write("url=");
        var2_5 = var3_7;
        var3_7.write(var1_1.valueOf);
        var2_5 = var3_7;
        var3_7.write(10);
        var2_5 = var3_7;
        var3_7.write("data=");
        var2_5 = var3_7;
        var3_7.write(Base64.encodeToString((byte[])var1_1.AFInAppEventType(), (int)2));
        var2_5 = var3_7;
        var3_7.write(10);
        var2_5 = var3_7;
        var1_1 = var1_1.AFInAppEventType;
        if (var1_1 != null) {
            var2_5 = var3_7;
            var3_7.write("type=");
            var2_5 = var3_7;
            var3_7.write(var1_1.name());
            var2_5 = var3_7;
            var3_7.write(10);
        }
        var2_5 = var3_7;
        var3_7.flush();
        var2_5 = var3_7;
        AFLogger.afInfoLog("CACHE: done, cacheKey: ".concat(String.valueOf((Object)var4_11)));
        try {
            var3_7.close();
            return var4_11;
        }
        catch (IOException var1_2) {
            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", (Throwable)var1_2);
            return var4_11;
        }
        catch (Throwable var3_8) {
            var1_1 = var2_5;
            var2_5 = var3_8;
            ** GOTO lbl75
        }
        catch (Exception var3_9) {
            var1_1 = null;
        }
lbl61: // 2 sources:
        do {
            var2_5 = var1_1;
            AFLogger.afErrorLog("CACHE: Could not cache request", (Throwable)var3_7);
            if (var1_1 == null) return null;
            try {
                var1_1.close();
                return null;
            }
            catch (IOException var1_3) {
                AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", (Throwable)var1_3);
            }
            return null;
            catch (Throwable var3_10) {
                var1_1 = var2_5;
                var2_5 = var3_10;
            }
lbl75: // 2 sources:
            if (var1_1 == null) throw var2_5;
            try {
                var1_1.close();
                throw var2_5;
            }
            catch (IOException var1_4) {
                AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", (Throwable)var1_4);
            }
            throw var2_5;
            break;
        } while (true);
        catch (Exception var2_6) {
            var1_1 = var3_7;
            var3_7 = var2_6;
            ** continue;
        }
    }

    @Override
    public final void valueOf() {
        Exception exception2;
        block3 : {
            try {
                if (!new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache").exists()) {
                    new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache").mkdir();
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            return;
        }
        AFLogger.afErrorLog("CACHE: Could not create cache directory", (Throwable)exception2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final List<AFa1rSDK> values() {
        int n8;
        File[] arrfile;
        int n9;
        ArrayList arrayList = new ArrayList();
        try {
            arrfile = new File[](this.values.AFInAppEventType.getFilesDir(), "AFRequestCache");
            if (!arrfile.exists()) {
                arrfile.mkdir();
            }
            if ((arrfile = arrfile.listFiles()) == null) {
                return arrayList;
            }
            n8 = arrfile.length;
            n9 = 0;
        }
        catch (Exception exception) {}
        while (n9 < n8) {
            File file = arrfile[n9];
            StringBuilder stringBuilder = new StringBuilder("CACHE: Found cached request");
            stringBuilder.append(file.getName());
            AFLogger.afInfoLog(stringBuilder.toString());
            arrayList.add((Object)AFa1hSDK.valueOf(file));
            ++n9;
        }
        return arrayList;
        AFLogger.afErrorLog("CACHE: Could not get cached requests", (Throwable)exception);
        return arrayList;
    }

    @Override
    public final boolean values(String string2) {
        File file = new File(new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache"), string2);
        StringBuilder stringBuilder = new StringBuilder("CACHE: Deleting ");
        stringBuilder.append(string2);
        stringBuilder.append(" from cache");
        AFLogger.afInfoLog(stringBuilder.toString());
        if (file.exists()) {
            try {
                boolean bl = file.delete();
                return bl;
            }
            catch (Exception exception) {
                stringBuilder = new StringBuilder("CACHE: Could not delete ");
                stringBuilder.append(string2);
                stringBuilder.append(" from cache");
                AFLogger.afErrorLog(stringBuilder.toString(), (Throwable)exception);
                return false;
            }
        }
        return true;
    }

    public static final class AFa1wSDK
    implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFInAppEventType = new LinkedBlockingQueue(1);
        boolean AFKeystoreWrapper = false;

        private AFa1wSDK() {
        }

        public /* synthetic */ AFa1wSDK(byte by) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventType.put((Object)iBinder);
                return;
            }
            catch (InterruptedException interruptedException) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", (Throwable)interruptedException);
                return;
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class AFa1xSDK
    implements IInterface {
        private final IBinder valueOf;

        public AFa1xSDK(IBinder iBinder) {
            this.valueOf = iBinder;
        }

        public final String AFInAppEventParameterName() {
            Parcel parcel = Parcel.obtain();
            Parcel parcel2 = Parcel.obtain();
            try {
                parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.valueOf.transact(1, parcel, parcel2, 0);
                parcel2.readException();
                String string2 = parcel2.readString();
                return string2;
            }
            finally {
                parcel2.recycle();
                parcel.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.valueOf;
        }

        public final boolean values() {
            Parcel parcel;
            boolean bl;
            Parcel parcel2;
            block3 : {
                parcel = Parcel.obtain();
                parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    bl = true;
                }
                catch (Throwable throwable) {
                    parcel2.recycle();
                    parcel.recycle();
                    throw throwable;
                }
                parcel.writeInt(1);
                this.valueOf.transact(2, parcel, parcel2, 0);
                parcel2.readException();
                int n8 = parcel2.readInt();
                if (n8 != 0) break block3;
                bl = false;
            }
            parcel2.recycle();
            parcel.recycle();
            return bl;
        }
    }

    public static final class AFa1ySDK {
        final String valueOf;
        private final boolean values;

        public AFa1ySDK(String string2, boolean bl) {
            this.valueOf = string2;
            this.values = bl;
        }

        public final boolean AFInAppEventType() {
            return this.values;
        }
    }

}

