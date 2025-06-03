/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  com.huawei.hmf.tasks.OnFailureListener
 *  com.huawei.hmf.tasks.OnSuccessListener
 *  com.huawei.hms.location.FusedLocationProviderClient
 *  com.huawei.hms.location.LocationCallback
 *  com.huawei.hms.location.LocationRequest
 *  com.huawei.hms.location.LocationResult
 *  com.huawei.hms.location.LocationServices
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.content.Context;
import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;

class HMSLocationController
extends LocationController {
    private static FusedLocationProviderClient hmsFusedLocationClient;
    public static LocationUpdateListener locationUpdateListener;

    public static /* synthetic */ FusedLocationProviderClient access$000() {
        return hmsFusedLocationClient;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void fireFailedComplete() {
        Object object;
        Object object2 = object = LocationController.syncLock;
        synchronized (object2) {
            hmsFusedLocationClient = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void initHuaweiLocation() {
        Object object;
        Object object2 = object = LocationController.syncLock;
        synchronized (object2) {
            Object object3 = hmsFusedLocationClient;
            if (object3 == null) {
                try {
                    hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient((Context)LocationController.classContext);
                }
                catch (Exception exception) {
                    object3 = OneSignal.LOG_LEVEL.ERROR;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Huawei LocationServices getFusedLocationProviderClient failed! ");
                    stringBuilder.append((Object)exception);
                    OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object3), stringBuilder.toString());
                    HMSLocationController.fireFailedComplete();
                    return;
                }
            }
            if ((object3 = LocationController.lastLocation) != null) {
                LocationController.fireCompleteForLocation((Location)object3);
            } else {
                object3 = hmsFusedLocationClient.getLastLocation();
                OnFailureListener onFailureListener = new OnSuccessListener<Location>(){

                    public void onSuccess(Location location) {
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.WARN;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Huawei LocationServices getLastLocation returned location: ");
                        stringBuilder.append((Object)location);
                        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                        if (location == null) {
                            HMSLocationController.fireFailedComplete();
                            return;
                        }
                        LocationController.lastLocation = location;
                        LocationController.fireCompleteForLocation(location);
                        locationUpdateListener = new LocationCallback(HMSLocationController.access$000()){
                            private FusedLocationProviderClient huaweiFusedLocationProviderClient;
                            {
                                this.huaweiFusedLocationProviderClient = fusedLocationProviderClient;
                                this.init();
                            }

                            private void init() {
                                long l = OneSignal.isInForeground() ? 270000L : 570000L;
                                LocationRequest locationRequest = LocationRequest.create().setFastestInterval(l).setInterval(l).setMaxWaitTime((long)((double)l * 1.5)).setPriority(102);
                                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
                                this.huaweiFusedLocationProviderClient.requestLocationUpdates(locationRequest, (LocationCallback)this, LocationController.getLocationHandlerThread().getLooper());
                            }

                            public void onLocationResult(LocationResult locationResult) {
                                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("HMSLocationController onLocationResult: ");
                                stringBuilder.append((Object)locationResult);
                                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                                if (locationResult != null) {
                                    LocationController.lastLocation = locationResult.getLastLocation();
                                }
                            }
                        };
                    }
                };
                object3 = object3.addOnSuccessListener((OnSuccessListener)onFailureListener);
                onFailureListener = new OnFailureListener(){

                    public void onFailure(Exception exception) {
                        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Huawei LocationServices getLastLocation failed!", exception);
                        HMSLocationController.fireFailedComplete();
                    }
                };
                object3.addOnFailureListener(onFailureListener);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void onFocusChange() {
        Object object;
        Object object2 = object = LocationController.syncLock;
        synchronized (object2) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "HMSLocationController onFocusChange!");
            if (LocationController.isHMSAvailable() && hmsFusedLocationClient == null) {
                return;
            }
            Object object3 = hmsFusedLocationClient;
            if (object3 != null) {
                LocationUpdateListener locationUpdateListener = HMSLocationController.locationUpdateListener;
                if (locationUpdateListener != null) {
                    object3.removeLocationUpdates((LocationCallback)locationUpdateListener);
                }
                object3 = new /* invalid duplicate definition of identical inner class */;
                HMSLocationController.locationUpdateListener = object3;
            }
            return;
        }
    }

    public static void startGetLocation() {
        HMSLocationController.initHuaweiLocation();
    }
}

