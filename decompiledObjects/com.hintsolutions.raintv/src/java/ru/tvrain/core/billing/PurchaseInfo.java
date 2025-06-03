/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Date
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package ru.tvrain.core.billing;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class PurchaseInfo
implements Parcelable {
    public static final Parcelable.Creator<PurchaseInfo> CREATOR = new Parcelable.Creator<PurchaseInfo>(){

        public PurchaseInfo createFromParcel(Parcel parcel) {
            return new PurchaseInfo(parcel);
        }

        public PurchaseInfo[] newArray(int n3) {
            return new PurchaseInfo[n3];
        }
    };
    private static final String LOG_TAG = "iabv3.purchaseInfo";
    public final String responseData;
    public final String signature;

    public PurchaseInfo(Parcel parcel) {
        this.responseData = parcel.readString();
        this.signature = parcel.readString();
    }

    public PurchaseInfo(String string2, String string3) {
        this.responseData = string2;
        this.signature = string3;
    }

    public static PurchaseState getPurchaseState(int n3) {
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        return PurchaseState.Canceled;
                    }
                    return PurchaseState.SubscriptionExpired;
                }
                return PurchaseState.Refunded;
            }
            return PurchaseState.Canceled;
        }
        return PurchaseState.PurchasedSuccessfully;
    }

    public int describeContents() {
        return 0;
    }

    public ResponseData parseResponseData() {
        Date date;
        ResponseData responseData;
        JSONObject jSONObject;
        block5: {
            block4: {
                long l4;
                try {
                    jSONObject = new JSONObject(this.responseData);
                    responseData = new ResponseData();
                    responseData.orderId = jSONObject.optString("orderId");
                    responseData.packageName = jSONObject.optString("packageName");
                    responseData.productId = jSONObject.optString("productId");
                    l4 = jSONObject.optLong("purchaseTime", 0L);
                    if (l4 == 0L) break block4;
                }
                catch (JSONException jSONException) {
                    Log.e((String)LOG_TAG, (String)"Failed to parse response data", (Throwable)jSONException);
                    return null;
                }
                date = new Date(l4);
                break block5;
            }
            date = null;
        }
        responseData.purchaseTime = date;
        responseData.purchaseState = PurchaseInfo.getPurchaseState(jSONObject.optInt("purchaseState", 1));
        responseData.developerPayload = jSONObject.optString("developerPayload");
        responseData.purchaseToken = jSONObject.getString("purchaseToken");
        responseData.autoRenewing = jSONObject.optBoolean("autoRenewing");
        return responseData;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        parcel.writeString(this.responseData);
        parcel.writeString(this.signature);
    }

    public static final class PurchaseState
    extends Enum<PurchaseState> {
        private static final PurchaseState[] $VALUES;
        public static final /* enum */ PurchaseState Canceled;
        public static final /* enum */ PurchaseState PurchasedSuccessfully;
        public static final /* enum */ PurchaseState Refunded;
        public static final /* enum */ PurchaseState SubscriptionExpired;

        static {
            PurchaseState purchaseState;
            PurchaseState purchaseState2;
            PurchaseState purchaseState3;
            PurchaseState purchaseState4;
            PurchasedSuccessfully = purchaseState4 = new PurchaseState();
            Canceled = purchaseState3 = new PurchaseState();
            Refunded = purchaseState2 = new PurchaseState();
            SubscriptionExpired = purchaseState = new PurchaseState();
            $VALUES = new PurchaseState[]{purchaseState4, purchaseState3, purchaseState2, purchaseState};
        }

        public static PurchaseState valueOf(String string2) {
            return (PurchaseState)Enum.valueOf(PurchaseState.class, (String)string2);
        }

        public static PurchaseState[] values() {
            return (PurchaseState[])$VALUES.clone();
        }
    }

    public static class ResponseData
    implements Parcelable {
        public static final Parcelable.Creator<ResponseData> CREATOR = new Parcelable.Creator<ResponseData>(){

            public ResponseData createFromParcel(Parcel parcel) {
                return new ResponseData(parcel);
            }

            public ResponseData[] newArray(int n3) {
                return new ResponseData[n3];
            }
        };
        public boolean autoRenewing;
        public String developerPayload;
        public String orderId;
        public String packageName;
        public String productId;
        public PurchaseState purchaseState;
        public Date purchaseTime;
        public String purchaseToken;

        public ResponseData() {
        }

        public ResponseData(Parcel parcel) {
            this.orderId = parcel.readString();
            this.packageName = parcel.readString();
            this.productId = parcel.readString();
            long l4 = parcel.readLong();
            Object var7_3 = null;
            Object object = l4 == -1L ? null : new Date(l4);
            this.purchaseTime = object;
            int n3 = parcel.readInt();
            object = n3 == -1 ? var7_3 : PurchaseState.values()[n3];
            this.purchaseState = object;
            this.developerPayload = parcel.readString();
            this.purchaseToken = parcel.readString();
            boolean bl = parcel.readByte() != 0;
            this.autoRenewing = bl;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n3) {
            parcel.writeString(this.orderId);
            parcel.writeString(this.packageName);
            parcel.writeString(this.productId);
            Object object = this.purchaseTime;
            long l4 = object != null ? object.getTime() : -1L;
            parcel.writeLong(l4);
            object = this.purchaseState;
            n3 = object == null ? -1 : object.ordinal();
            parcel.writeInt(n3);
            parcel.writeString(this.developerPayload);
            parcel.writeString(this.purchaseToken);
            parcel.writeByte((byte)(this.autoRenewing ? 1 : 0));
        }
    }
}

