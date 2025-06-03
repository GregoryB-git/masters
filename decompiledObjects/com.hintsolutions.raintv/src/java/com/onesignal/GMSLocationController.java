/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  com.google.android.gms.common.api.GoogleApiClient
 *  com.google.android.gms.common.api.GoogleApiClient$Builder
 *  com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
 *  com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
 *  com.google.android.gms.location.LocationListener
 *  com.google.android.gms.location.LocationRequest
 *  com.google.android.gms.location.LocationServices
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package com.onesignal;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.onesignal.GoogleApiClientCompatProxy;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;

class GMSLocationController
extends LocationController {
    public static final int API_FALLBACK_TIME = 30000;
    private static GoogleApiClientCompatProxy googleApiClient;
    public static LocationUpdateListener locationUpdateListener;

    public static /* synthetic */ int access$100() {
        return GMSLocationController.getApiFallbackWait();
    }

    public static /* synthetic */ GoogleApiClientCompatProxy access$200() {
        return googleApiClient;
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
            GoogleApiClientCompatProxy googleApiClientCompatProxy = googleApiClient;
            if (googleApiClientCompatProxy != null) {
                googleApiClientCompatProxy.disconnect();
            }
            googleApiClient = null;
            return;
        }
    }

    private static int getApiFallbackWait() {
        return 30000;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void initGoogleLocation() {
        Object object;
        if (LocationController.fallbackFailThread != null) {
            return;
        }
        Object object2 = object = LocationController.syncLock;
        synchronized (object2) {
            Location location;
            GMSLocationController.startFallBackThread();
            if (googleApiClient != null && (location = LocationController.lastLocation) != null) {
                LocationController.fireCompleteForLocation(location);
            } else {
                location = new /* Unavailable Anonymous Inner Class!! */;
                Object object3 = new GoogleApiClient.Builder(LocationController.classContext);
                location = object3.addApi(LocationServices.API).addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)location).addOnConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)location).setHandler(LocationController.getLocationHandlerThread().mHandler).build();
                object3 = new GoogleApiClientCompatProxy((GoogleApiClient)location);
                googleApiClient = object3;
                ((GoogleApiClientCompatProxy)object3).connect();
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
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController onFocusChange!");
            Object object3 = googleApiClient;
            if (object3 != null && ((GoogleApiClientCompatProxy)object3).realInstance().isConnected()) {
                object3 = googleApiClient;
                if (object3 != null) {
                    GoogleApiClient googleApiClient = ((GoogleApiClientCompatProxy)object3).realInstance();
                    if (locationUpdateListener != null) {
                        LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, (LocationListener)locationUpdateListener);
                    }
                    locationUpdateListener = object3 = new LocationUpdateListener(googleApiClient);
                }
                return;
            }
            return;
        }
    }

    private static void startFallBackThread() {
        Thread thread;
        LocationController.fallbackFailThread = thread = new Thread(new Runnable(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public void run() {
                try {
                    Thread.sleep((long)GMSLocationController.access$100());
                    OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                    LocationController.fireFailedComplete();
                    LocationController.scheduleUpdate(LocationController.classContext);
                    return;
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
        }, "OS_GMS_LOCATION_FALLBACK");
        thread.start();
    }

    public static void startGetLocation() {
        GMSLocationController.initGoogleLocation();
    }

    public static class LocationUpdateListener
    implements LocationListener {
        private GoogleApiClient googleApiClient;

        public LocationUpdateListener(GoogleApiClient googleApiClient) {
            this.googleApiClient = googleApiClient;
            this.init();
        }

        private void init() {
            long l = OneSignal.isInForeground() ? 270000L : 570000L;
            if (this.googleApiClient != null) {
                LocationRequest locationRequest = LocationRequest.create().setFastestInterval(l).setInterval(l).setMaxWaitTime((long)((double)l * 1.5)).setPriority(102);
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                FusedLocationApiWrapper.requestLocationUpdates(this.googleApiClient, locationRequest, this);
            }
        }

        public void onLocationChanged(Location location) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GMSLocationController onLocationChanged: ");
            stringBuilder.append((Object)location);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            LocationController.lastLocation = location;
        }
    }
}

