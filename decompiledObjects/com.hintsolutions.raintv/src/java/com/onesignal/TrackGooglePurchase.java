/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  com.onesignal.TrackGooglePurchase$3
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.math.BigDecimal
 *  java.util.ArrayList
 *  java.util.HashMap
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRestClient;
import com.onesignal.TrackGooglePurchase;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TrackGooglePurchase {
    private static Class<?> IInAppBillingServiceClass;
    private static int iapEnabled = -99;
    private Context appContext;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting;
    private ArrayList<String> purchaseTokens;

    public TrackGooglePurchase(Context context) {
        block8: {
            boolean bl;
            block7: {
                this.newAsExisting = true;
                bl = false;
                this.isWaitingForPurchasesRequest = false;
                this.appContext = context;
                this.purchaseTokens = new ArrayList();
                String string2 = OneSignalPrefs.getString("GTPlayerPurchases", "purchaseTokens", "[]");
                super(string2);
                int n = 0;
                while (true) {
                    if (n >= context.length()) break;
                    this.purchaseTokens.add((Object)context.get(n).toString());
                    ++n;
                    continue;
                    break;
                }
                if (context.length() != 0) break block7;
                bl = true;
            }
            this.newAsExisting = bl;
            if (!bl) break block8;
            try {
                this.newAsExisting = OneSignalPrefs.getBool("GTPlayerPurchases", "ExistingPurchases", true);
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        this.trackIAP();
    }

    public static boolean CanTrack(Context context) {
        if (iapEnabled == -99) {
            iapEnabled = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        boolean bl = false;
        try {
            if (iapEnabled == 0) {
                IInAppBillingServiceClass = Class.forName((String)"com.android.vending.billing.IInAppBillingService");
            }
            if (iapEnabled == 0) {
                bl = true;
            }
            return bl;
        }
        catch (Throwable throwable) {
            iapEnabled = 0;
            return false;
        }
    }

    private void QueryBoughtItems() {
        if (this.isWaitingForPurchasesRequest) {
            return;
        }
        new Thread(new Runnable(this){
            public final TrackGooglePurchase this$0;
            {
                this.this$0 = trackGooglePurchase;
            }

            public void run() {
                block10: {
                    Bundle bundle;
                    TrackGooglePurchase.access$402(this.this$0, true);
                    if (this.this$0.getPurchasesMethod == null) {
                        TrackGooglePurchase.access$502(this.this$0, TrackGooglePurchase.getGetPurchasesMethod(IInAppBillingServiceClass));
                        this.this$0.getPurchasesMethod.setAccessible(true);
                    }
                    if ((bundle = (Bundle)this.this$0.getPurchasesMethod.invoke(this.this$0.mIInAppBillingService, new Object[]{3, this.this$0.appContext.getPackageName(), "inapp", null})).getInt("RESPONSE_CODE") != 0) break block10;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    bundle = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    int n = 0;
                    while (true) {
                        if (n >= bundle.size()) break;
                        String string2 = (String)bundle.get(n);
                        String string3 = (String)arrayList3.get(n);
                        Object object = new JSONObject(string2);
                        object = object.getString("purchaseToken");
                        if (!this.this$0.purchaseTokens.contains(object) && !arrayList2.contains(object)) {
                            arrayList2.add(object);
                            arrayList.add((Object)string3);
                        }
                        ++n;
                        continue;
                        break;
                    }
                    try {
                        if (arrayList.size() > 0) {
                            this.this$0.sendPurchases((ArrayList<String>)arrayList, (ArrayList<String>)arrayList2);
                        } else if (bundle.size() == 0) {
                            TrackGooglePurchase.access$1102(this.this$0, false);
                            OneSignalPrefs.saveBool("GTPlayerPurchases", "ExistingPurchases", false);
                        }
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }
                TrackGooglePurchase.access$402(this.this$0, false);
            }
        }).start();
    }

    public static /* synthetic */ int access$002(int n) {
        iapEnabled = n;
        return n;
    }

    public static /* synthetic */ Object access$102(TrackGooglePurchase trackGooglePurchase, Object object) {
        trackGooglePurchase.mIInAppBillingService = object;
        return object;
    }

    public static /* synthetic */ boolean access$1102(TrackGooglePurchase trackGooglePurchase, boolean bl) {
        trackGooglePurchase.newAsExisting = bl;
        return bl;
    }

    public static /* synthetic */ boolean access$402(TrackGooglePurchase trackGooglePurchase, boolean bl) {
        trackGooglePurchase.isWaitingForPurchasesRequest = bl;
        return bl;
    }

    public static /* synthetic */ Method access$502(TrackGooglePurchase trackGooglePurchase, Method method) {
        trackGooglePurchase.getPurchasesMethod = method;
        return method;
    }

    private static Method getAsInterfaceMethod(Class classArray) {
        for (Method method : classArray.getMethods()) {
            classArray = method.getParameterTypes();
            if (classArray.length != 1 || classArray[0] != IBinder.class) continue;
            return method;
        }
        return null;
    }

    private static Method getGetPurchasesMethod(Class methodArray) {
        for (Method method : methodArray.getMethods()) {
            Class[] classArray = method.getParameterTypes();
            if (classArray.length != 4 || classArray[0] != Integer.TYPE || classArray[1] != String.class || classArray[2] != String.class || classArray[3] != String.class) continue;
            return method;
        }
        return null;
    }

    private static Method getGetSkuDetailsMethod(Class clazz2) {
        for (Method method : clazz2.getMethods()) {
            Class[] classArray = method.getParameterTypes();
            Class clazz = method.getReturnType();
            if (classArray.length != 4 || classArray[0] != Integer.TYPE || classArray[1] != String.class || classArray[2] != String.class || classArray[3] != Bundle.class || clazz != Bundle.class) continue;
            return method;
        }
        return null;
    }

    private void sendPurchases(ArrayList<String> iterator, ArrayList<String> arrayList) {
        try {
            Bundle bundle;
            if (this.getSkuDetailsMethod == null) {
                bundle = TrackGooglePurchase.getGetSkuDetailsMethod(IInAppBillingServiceClass);
                this.getSkuDetailsMethod = bundle;
                bundle.setAccessible(true);
            }
            bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", iterator);
            bundle = (Bundle)this.getSkuDetailsMethod.invoke(this.mIInAppBillingService, new Object[]{3, this.appContext.getPackageName(), "inapp", bundle});
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList2 = bundle.getStringArrayList("DETAILS_LIST");
                bundle = new HashMap();
                for (String string2 : arrayList2) {
                    Object object = new JSONObject(string2);
                    string2 = object.getString("productId");
                    BigDecimal bigDecimal = new BigDecimal(object.getString("price_amount_micros"));
                    BigDecimal bigDecimal2 = new BigDecimal(1000000);
                    bigDecimal2 = bigDecimal.divide(bigDecimal2);
                    bigDecimal = new JSONObject();
                    bigDecimal.put("sku", (Object)string2);
                    bigDecimal.put("iso", (Object)object.getString("price_currency_code"));
                    bigDecimal.put("amount", (Object)bigDecimal2.toString());
                    bundle.put((Object)string2, (Object)bigDecimal);
                }
                arrayList2 = new JSONArray();
                for (Object object : iterator) {
                    if (!bundle.containsKey(object)) continue;
                    arrayList2.put(bundle.get(object));
                }
                if (arrayList2.length() > 0) {
                    iterator = new 3(this, arrayList);
                    OneSignal.sendPurchases((JSONArray)arrayList2, this.newAsExisting, (OneSignalRestClient.ResponseHandler)iterator);
                }
            }
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Failed to track IAP purchases", throwable);
        }
    }

    public void trackIAP() {
        if (this.mServiceConn == null) {
            this.mServiceConn = new ServiceConnection(this){
                public final TrackGooglePurchase this$0;
                {
                    this.this$0 = trackGooglePurchase;
                }

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    try {
                        componentName = TrackGooglePurchase.getAsInterfaceMethod(Class.forName((String)"com.android.vending.billing.IInAppBillingService$Stub"));
                        componentName.setAccessible(true);
                        TrackGooglePurchase.access$102(this.this$0, componentName.invoke(null, new Object[]{iBinder}));
                        this.this$0.QueryBoughtItems();
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    TrackGooglePurchase.access$002(-99);
                    TrackGooglePurchase.access$102(this.this$0, null);
                }
            };
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.appContext.bindService(intent, this.mServiceConn, 1);
        } else if (this.mIInAppBillingService != null) {
            this.QueryBoughtItems();
        }
    }
}

