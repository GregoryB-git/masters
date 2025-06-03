/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package ru.tvrain.core.billing;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import ru.tvrain.core.billing.PurchaseInfo;

public class TransactionDetails
implements Parcelable {
    public static final Parcelable.Creator<TransactionDetails> CREATOR = new Parcelable.Creator<TransactionDetails>(){

        public TransactionDetails createFromParcel(Parcel parcel) {
            return new TransactionDetails(parcel);
        }

        public TransactionDetails[] newArray(int n3) {
            return new TransactionDetails[n3];
        }
    };
    public final String orderId;
    public final String productId;
    public final PurchaseInfo purchaseInfo;
    public final Date purchaseTime;
    public final String purchaseToken;

    public TransactionDetails(Parcel parcel) {
        this.productId = parcel.readString();
        this.orderId = parcel.readString();
        this.purchaseToken = parcel.readString();
        long l4 = parcel.readLong();
        Date date = l4 == -1L ? null : new Date(l4);
        this.purchaseTime = date;
        this.purchaseInfo = (PurchaseInfo)parcel.readParcelable(PurchaseInfo.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl;
            block6: {
                block7: {
                    Object object2;
                    block5: {
                        bl = true;
                        if (this == object) {
                            return true;
                        }
                        if (object == null || this.getClass() != object.getClass()) break block4;
                        object2 = (TransactionDetails)object;
                        object = this.orderId;
                        object2 = ((TransactionDetails)object2).orderId;
                        if (object == null) break block5;
                        if (object.equals(object2)) break block6;
                        break block7;
                    }
                    if (object2 == null) break block6;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.orderId;
        int n3 = string2 != null ? string2.hashCode() : 0;
        return n3;
    }

    public String toString() {
        return String.format((String)"%s purchased at %s(%s). Token: %s, Signature: %s", (Object[])new Object[]{this.productId, this.purchaseTime, this.orderId, this.purchaseToken, this.purchaseInfo.signature});
    }

    public void writeToParcel(Parcel parcel, int n3) {
        parcel.writeString(this.productId);
        parcel.writeString(this.orderId);
        parcel.writeString(this.purchaseToken);
        Date date = this.purchaseTime;
        long l4 = date != null ? date.getTime() : -1L;
        parcel.writeLong(l4);
        parcel.writeParcelable((Parcelable)this.purchaseInfo, n3);
    }
}

