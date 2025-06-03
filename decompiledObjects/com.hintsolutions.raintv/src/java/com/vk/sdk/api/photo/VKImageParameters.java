/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.vk.sdk.api.photo;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.VKObject;
import com.vk.sdk.api.photo.VKImageParameters;

public class VKImageParameters
extends VKObject
implements Parcelable {
    public static final Parcelable.Creator<VKImageParameters> CREATOR = new Parcelable.Creator<VKImageParameters>(){

        public VKImageParameters createFromParcel(Parcel parcel) {
            return new VKImageParameters(parcel, null);
        }

        public VKImageParameters[] newArray(int n) {
            return new VKImageParameters[n];
        }
    };
    public VKImageType mImageType = VKImageType.Png;
    public float mJpegQuality;

    public VKImageParameters() {
    }

    private VKImageParameters(Parcel parcel) {
        int n = parcel.readInt();
        VKImageType vKImageType = n == -1 ? null : VKImageType.values()[n];
        this.mImageType = vKImageType;
        this.mJpegQuality = parcel.readFloat();
    }

    public /* synthetic */ VKImageParameters(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public static VKImageParameters jpgImage(float f) {
        VKImageParameters vKImageParameters = new VKImageParameters();
        vKImageParameters.mImageType = VKImageType.Jpg;
        vKImageParameters.mJpegQuality = f;
        return vKImageParameters;
    }

    public static VKImageParameters pngImage() {
        VKImageParameters vKImageParameters = new VKImageParameters();
        vKImageParameters.mImageType = VKImageType.Png;
        return vKImageParameters;
    }

    public int describeContents() {
        return 0;
    }

    public String fileExtension() {
        int n = 2.$SwitchMap$com$vk$sdk$api$photo$VKImageParameters$VKImageType[this.mImageType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                return "file";
            }
            return "png";
        }
        return "jpg";
    }

    public String mimeType() {
        int n = 2.$SwitchMap$com$vk$sdk$api$photo$VKImageParameters$VKImageType[this.mImageType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                return "application/octet-stream";
            }
            return "image/png";
        }
        return "image/jpeg";
    }

    public void writeToParcel(Parcel parcel, int n) {
        VKImageType vKImageType = this.mImageType;
        n = vKImageType == null ? -1 : vKImageType.ordinal();
        parcel.writeInt(n);
        parcel.writeFloat(this.mJpegQuality);
    }
}

