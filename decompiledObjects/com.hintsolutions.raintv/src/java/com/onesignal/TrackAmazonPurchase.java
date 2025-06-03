/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.iap.PurchasingListener
 *  com.amazon.device.iap.PurchasingService
 *  com.amazon.device.iap.model.Product
 *  com.amazon.device.iap.model.ProductDataResponse
 *  com.amazon.device.iap.model.PurchaseResponse
 *  com.amazon.device.iap.model.PurchaseResponse$RequestStatus
 *  com.amazon.device.iap.model.PurchaseUpdatesResponse
 *  com.amazon.device.iap.model.RequestId
 *  com.amazon.device.iap.model.UserDataResponse
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TrackAmazonPurchase {
    private boolean canTrack = false;
    private Context context;
    private Field listenerHandlerField;
    private Object listenerHandlerObject;
    private OSPurchasingListener osPurchasingListener;
    private boolean registerListenerOnMainThread = false;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TrackAmazonPurchase(Context object) {
        this.context = object;
        try {
            OSPurchasingListener oSPurchasingListener;
            Field field;
            Class clazz = Class.forName((String)"com.amazon.device.iap.internal.d");
            try {
                this.listenerHandlerObject = clazz.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            }
            catch (NullPointerException nullPointerException) {
                this.listenerHandlerObject = clazz.getMethod("e", new Class[0]).invoke(null, new Object[0]);
                this.registerListenerOnMainThread = true;
            }
            this.listenerHandlerField = field = clazz.getDeclaredField("f");
            field.setAccessible(true);
            this.osPurchasingListener = oSPurchasingListener = new OSPurchasingListener(this, null);
            oSPurchasingListener.orgPurchasingListener = (PurchasingListener)this.listenerHandlerField.get(this.listenerHandlerObject);
            this.canTrack = true;
            this.setListener();
            return;
        }
        catch (ClassCastException classCastException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)classCastException);
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)noSuchFieldException);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)noSuchMethodException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)invocationTargetException);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)illegalAccessException);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)classNotFoundException);
        }
    }

    private static void logAmazonIAPListenerError(Exception exception) {
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error adding Amazon IAP listener.", (Throwable)exception);
        exception.printStackTrace();
    }

    private void setListener() {
        if (this.registerListenerOnMainThread) {
            OSUtils.runOnMainUIThread(new Runnable(this){
                public final TrackAmazonPurchase this$0;
                {
                    this.this$0 = trackAmazonPurchase;
                }

                public void run() {
                    PurchasingService.registerListener((Context)this.this$0.context, (PurchasingListener)this.this$0.osPurchasingListener);
                }
            });
        } else {
            PurchasingService.registerListener((Context)this.context, (PurchasingListener)this.osPurchasingListener);
        }
    }

    public void checkListener() {
        block4: {
            if (!this.canTrack) {
                return;
            }
            PurchasingListener purchasingListener = (PurchasingListener)this.listenerHandlerField.get(this.listenerHandlerObject);
            OSPurchasingListener oSPurchasingListener = this.osPurchasingListener;
            if (purchasingListener == oSPurchasingListener) break block4;
            try {
                oSPurchasingListener.orgPurchasingListener = purchasingListener;
                this.setListener();
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
    }

    public class OSPurchasingListener
    implements PurchasingListener {
        private String currentMarket;
        private RequestId lastRequestId;
        public PurchasingListener orgPurchasingListener;
        public final TrackAmazonPurchase this$0;

        private OSPurchasingListener(TrackAmazonPurchase trackAmazonPurchase) {
            this.this$0 = trackAmazonPurchase;
        }

        public /* synthetic */ OSPurchasingListener(TrackAmazonPurchase trackAmazonPurchase, 1 var2_2) {
            this(trackAmazonPurchase);
        }

        private String marketToCurrencyCode(String string2) {
            string2.getClass();
            int n = string2.hashCode();
            int n2 = -1;
            switch (n) {
                default: {
                    break;
                }
                case 2718: {
                    if (!string2.equals((Object)"US")) break;
                    n2 = 9;
                    break;
                }
                case 2374: {
                    if (!string2.equals((Object)"JP")) break;
                    n2 = 8;
                    break;
                }
                case 2347: {
                    if (!string2.equals((Object)"IT")) break;
                    n2 = 7;
                    break;
                }
                case 2267: {
                    if (!string2.equals((Object)"GB")) break;
                    n2 = 6;
                    break;
                }
                case 2252: {
                    if (!string2.equals((Object)"FR")) break;
                    n2 = 5;
                    break;
                }
                case 2222: {
                    if (!string2.equals((Object)"ES")) break;
                    n2 = 4;
                    break;
                }
                case 2177: {
                    if (!string2.equals((Object)"DE")) break;
                    n2 = 3;
                    break;
                }
                case 2142: {
                    if (!string2.equals((Object)"CA")) break;
                    n2 = 2;
                    break;
                }
                case 2128: {
                    if (!string2.equals((Object)"BR")) break;
                    n2 = 1;
                    break;
                }
                case 2100: {
                    if (!string2.equals((Object)"AU")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    return "";
                }
                case 9: {
                    return "USD";
                }
                case 8: {
                    return "JPY";
                }
                case 6: {
                    return "GBP";
                }
                case 3: 
                case 4: 
                case 5: 
                case 7: {
                    return "EUR";
                }
                case 2: {
                    return "CDN";
                }
                case 1: {
                    return "BRL";
                }
                case 0: 
            }
            return "AUD";
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onProductDataResponse(ProductDataResponse object) {
            Object object2 = this.lastRequestId;
            if (object2 != null && object2.toString().equals((Object)object.getRequestId().toString())) {
                try {
                    if (2.$SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[object.getRequestStatus().ordinal()] != 1) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    Map map = object.getProductData();
                    Iterator iterator = map.keySet().iterator();
                    while (true) {
                        if (!iterator.hasNext()) {
                            OneSignal.sendPurchases(jSONArray, false, null);
                            return;
                        }
                        object = (Product)map.get((Object)((String)iterator.next()));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sku", (Object)object.getSku());
                        jSONObject.put("iso", (Object)this.marketToCurrencyCode(this.currentMarket));
                        object2 = object.getPrice();
                        object = object2;
                        if (!object2.matches("^[0-9]")) {
                            object = object2.substring(1);
                        }
                        jSONObject.put("amount", object);
                        jSONArray.put((Object)jSONObject);
                    }
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                    return;
                }
            }
            object2 = this.orgPurchasingListener;
            if (object2 == null) return;
            object2.onProductDataResponse(object);
        }

        public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
            PurchasingListener purchasingListener;
            if (purchaseResponse.getRequestStatus() == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                this.currentMarket = purchaseResponse.getUserData().getMarketplace();
                purchasingListener = new HashSet();
                purchasingListener.add((Object)purchaseResponse.getReceipt().getSku());
                this.lastRequestId = PurchasingService.getProductData((Set)purchasingListener);
            }
            if ((purchasingListener = this.orgPurchasingListener) != null) {
                purchasingListener.onPurchaseResponse(purchaseResponse);
            }
        }

        public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
            }
        }

        public void onUserDataResponse(UserDataResponse userDataResponse) {
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                purchasingListener.onUserDataResponse(userDataResponse);
            }
        }
    }
}

