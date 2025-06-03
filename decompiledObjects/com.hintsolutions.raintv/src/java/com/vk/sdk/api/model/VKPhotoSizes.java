/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKApiPhotoSize;
import com.vk.sdk.api.model.VKList;
import com.vk.sdk.api.model.VKPhotoSizes;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class VKPhotoSizes
extends VKList<VKApiPhotoSize> {
    public static Parcelable.Creator<VKPhotoSizes> CREATOR = new Parcelable.Creator<VKPhotoSizes>(){

        public VKPhotoSizes createFromParcel(Parcel parcel) {
            return new VKPhotoSizes(parcel, null);
        }

        public VKPhotoSizes[] newArray(int n4) {
            return new VKPhotoSizes[n4];
        }
    };
    private static float sQuality = 1.0f;
    private String mHeightThumb;
    private int mLastHeight;
    private int mLastWidth;
    private int mOriginalHeight = 1;
    private int mOriginalWidth = 1;
    private String mWidthThumb;
    private final VKList.Parser<VKApiPhotoSize> parser = new VKList.Parser<VKApiPhotoSize>(this){
        public final VKPhotoSizes this$0;
        {
            this.this$0 = vKPhotoSizes;
        }

        public VKApiPhotoSize parseObject(JSONObject jSONObject) throws Exception {
            return VKApiPhotoSize.parse(jSONObject, VKPhotoSizes.access$000(this.this$0), VKPhotoSizes.access$100(this.this$0));
        }
    };

    public VKPhotoSizes() {
    }

    private VKPhotoSizes(Parcel parcel) {
        super(parcel);
        this.mOriginalWidth = parcel.readInt();
        this.mOriginalHeight = parcel.readInt();
        this.mWidthThumb = parcel.readString();
        this.mLastWidth = parcel.readInt();
    }

    public /* synthetic */ VKPhotoSizes(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public VKPhotoSizes(JSONArray jSONArray) {
        this.fill(jSONArray);
    }

    public static /* synthetic */ int access$000(VKPhotoSizes vKPhotoSizes) {
        return vKPhotoSizes.mOriginalWidth;
    }

    public static /* synthetic */ int access$100(VKPhotoSizes vKPhotoSizes) {
        return vKPhotoSizes.mOriginalHeight;
    }

    private String getImageForHeight(int n4) {
        if (this.mHeightThumb != null && this.mLastHeight != n4 || this.isEmpty()) {
            return this.mHeightThumb;
        }
        this.mLastHeight = n4;
        this.mHeightThumb = null;
        n4 = (int)((float)n4 * sQuality);
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            VKApiPhotoSize vKApiPhotoSize = (VKApiPhotoSize)iterator.next();
            if (vKApiPhotoSize.height < n4) continue;
            this.mHeightThumb = vKApiPhotoSize.src;
            break;
        }
        return this.mHeightThumb;
    }

    private String getImageForWidth(int n4) {
        if (this.mWidthThumb != null && this.mLastWidth != n4 || this.isEmpty()) {
            return this.mWidthThumb;
        }
        this.mLastWidth = n4;
        this.mWidthThumb = null;
        n4 = (int)((float)n4 * sQuality);
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            VKApiPhotoSize vKApiPhotoSize = (VKApiPhotoSize)iterator.next();
            if (vKApiPhotoSize.width < n4) continue;
            this.mWidthThumb = vKApiPhotoSize.src;
            break;
        }
        return this.mWidthThumb;
    }

    public static void setQuality(float f) {
        sQuality = f;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void fill(JSONArray jSONArray) {
        this.fill(jSONArray, this.parser);
        this.sort();
    }

    public void fill(JSONArray jSONArray, int n4, int n5) {
        this.setOriginalDimension(n4, n5);
        this.fill(jSONArray);
    }

    public String getByType(char c3) {
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            VKApiPhotoSize vKApiPhotoSize = (VKApiPhotoSize)iterator.next();
            if (vKApiPhotoSize.type != c3) continue;
            return vKApiPhotoSize.src;
        }
        return null;
    }

    public String getImageForDimension(int n4, int n5) {
        String string = n4 >= n5 ? this.getImageForWidth(n4) : this.getImageForHeight(n5);
        return string;
    }

    public void setOriginalDimension(int n4, int n5) {
        if (n4 != 0) {
            this.mOriginalWidth = n4;
        }
        if (n5 != 0) {
            this.mOriginalHeight = n5;
        }
    }

    public void sort() {
        Collections.sort((List)this);
    }

    @Override
    public void writeToParcel(Parcel parcel, int n4) {
        super.writeToParcel(parcel, n4);
        parcel.writeInt(this.mOriginalWidth);
        parcel.writeInt(this.mOriginalHeight);
        parcel.writeString(this.mWidthThumb);
        parcel.writeInt(this.mLastWidth);
    }
}

