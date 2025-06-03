/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Parcel
 *  android.os.RemoteException
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.TimeUnit
 */
package com.twitter.sdk.android.core.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.AdvertisingInfo;
import com.twitter.sdk.android.core.internal.AdvertisingInfoStrategy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class AdvertisingInfoServiceStrategy
implements AdvertisingInfoStrategy {
    private static final String GOOGLE_PLAY_SERVICES_INTENT = "com.google.android.gms.ads.identifier.service.START";
    private static final String GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME = "com.google.android.gms";
    private static final String GOOGLE_PLAY_SERVICE_PACKAGE_NAME = "com.android.vending";
    private final Context context;

    public AdvertisingInfoServiceStrategy(Context context) {
        this.context = context.getApplicationContext();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AdvertisingInfo getAdvertisingInfo() {
        block12: {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Twitter.getLogger().d("Twitter", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
                return null;
            }
            this.context.getPackageManager().getPackageInfo("com.android.vending", 0);
            var2_1 = new ServiceConnection(null){
                private static final int QUEUE_TIMEOUT_IN_MS = 200;
                private final LinkedBlockingQueue<IBinder> queue = new LinkedBlockingQueue(1);
                private boolean retrieved;
                {
                    this();
                }

                public IBinder getBinder() {
                    if (this.retrieved) {
                        Twitter.getLogger().e("Twitter", "getBinder already called");
                    }
                    this.retrieved = true;
                    try {
                        IBinder iBinder = (IBinder)this.queue.poll(200L, TimeUnit.MILLISECONDS);
                        return iBinder;
                    }
                    catch (InterruptedException interruptedException) {
                        return null;
                    }
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    try {
                        this.queue.put((Object)iBinder);
                        return;
                    }
                    catch (InterruptedException interruptedException) {
                        return;
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    this.queue.clear();
                }
            };
            var3_5 /* !! */  = new Intent("com.google.android.gms.ads.identifier.service.START");
            var3_5 /* !! */ .setPackage("com.google.android.gms");
            ** try [egrp 1[TRYBLOCK] [2 : 63->74)] { 
lbl12:
            // 1 sources

            break block12;
lbl-1000:
            // 1 sources

            {
                catch (Throwable var2_2) {
                    Twitter.getLogger().d("Twitter", "Could not bind to Google Play Service to capture AdvertisingId", var2_2);
                }
            }
            return null;
            catch (Exception var2_3) {
                Twitter.getLogger().d("Twitter", "Unable to determine if Google Play Services is available", var2_3);
                return null;
            }
            catch (PackageManager.NameNotFoundException var2_4) {
                Twitter.getLogger().d("Twitter", "Unable to find Google Play Services package name");
                return null;
            }
        }
        var1_8 = this.context.bindService(var3_5 /* !! */ , var2_1, 1);
        if (!var1_8) ** GOTO lbl-1000
        {
            var4_9 = new IInterface(var2_1.getBinder(), null){
                private static final String ADVERTISING_ID_SERVICE_INTERFACE_TOKEN = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
                private static final int AD_TRANSACTION_CODE_ID = 1;
                private static final int AD_TRANSACTION_CODE_LIMIT_AD_TRACKING = 2;
                private static final int FLAGS_NONE = 0;
                private final IBinder binder;
                {
                    this.binder = iBinder;
                }
                {
                    this(iBinder);
                }

                public static /* synthetic */ boolean access$200(AdvertisingInterface advertisingInterface) throws RemoteException {
                    return advertisingInterface.isLimitAdTrackingEnabled();
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                private boolean isLimitAdTrackingEnabled() throws RemoteException {
                    Throwable throwable2;
                    Parcel parcel;
                    Parcel parcel2;
                    block6: {
                        parcel2 = Parcel.obtain();
                        parcel = Parcel.obtain();
                        boolean bl = false;
                        try {
                            try {
                                parcel2.writeInterfaceToken(ADVERTISING_ID_SERVICE_INTERFACE_TOKEN);
                                parcel2.writeInt(1);
                                this.binder.transact(2, parcel2, parcel, 0);
                                parcel.readException();
                                int n = parcel.readInt();
                                if (n != 0) {
                                    bl = true;
                                }
                            }
                            catch (Exception exception) {
                                Twitter.getLogger().d("Twitter", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
                            }
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        parcel.recycle();
                        parcel2.recycle();
                        return bl;
                    }
                    parcel.recycle();
                    parcel2.recycle();
                    throw throwable2;
                }

                public IBinder asBinder() {
                    return this.binder;
                }

                /*
                 * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                 * Loose catch block
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public String getId() throws RemoteException {
                    Throwable throwable2222222;
                    Parcel parcel;
                    Parcel parcel2;
                    block4: {
                        parcel2 = Parcel.obtain();
                        parcel = Parcel.obtain();
                        parcel2.writeInterfaceToken(ADVERTISING_ID_SERVICE_INTERFACE_TOKEN);
                        this.binder.transact(1, parcel2, parcel, 0);
                        parcel.readException();
                        String string2 = parcel.readString();
                        {
                            catch (Throwable throwable2222222) {
                                break block4;
                            }
                            catch (Exception exception) {}
                            {
                                Twitter.getLogger().d("Twitter", "Could not get parcel from Google Play Service to capture AdvertisingId");
                            }
                            parcel.recycle();
                            parcel2.recycle();
                            return null;
                        }
                        parcel.recycle();
                        parcel2.recycle();
                        return string2;
                    }
                    parcel.recycle();
                    parcel2.recycle();
                    throw throwable2222222;
                }
            };
            var3_5 /* !! */  = new AdvertisingInfo(var4_9.getId(), AdvertisingInterface.access$200(var4_9));
        }
        {
            this.context.unbindService(var2_1);
            return var3_5 /* !! */ ;
        }
lbl-1000:
        // 1 sources

        {
            Twitter.getLogger().d("Twitter", "Could not bind to Google Play Service to capture AdvertisingId");
            return null;
        }
    }
}

