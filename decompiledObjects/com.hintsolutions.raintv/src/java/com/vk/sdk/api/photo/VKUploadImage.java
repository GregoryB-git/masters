/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 */
package com.vk.sdk.api.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.VKObject;
import com.vk.sdk.VKUIHelper;
import com.vk.sdk.api.photo.VKImageParameters;
import com.vk.sdk.api.photo.VKUploadImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class VKUploadImage
extends VKObject
implements Parcelable {
    public static final Parcelable.Creator<VKUploadImage> CREATOR = new Parcelable.Creator<VKUploadImage>(){

        public VKUploadImage createFromParcel(Parcel parcel) {
            return new VKUploadImage(parcel, null);
        }

        public VKUploadImage[] newArray(int n) {
            return new VKUploadImage[n];
        }
    };
    public final Bitmap mImageData;
    public final VKImageParameters mParameters;

    public VKUploadImage(Bitmap bitmap, VKImageParameters vKImageParameters) {
        this.mImageData = bitmap;
        this.mParameters = vKImageParameters;
    }

    private VKUploadImage(Parcel parcel) {
        this.mImageData = (Bitmap)parcel.readParcelable(Bitmap.class.getClassLoader());
        this.mParameters = (VKImageParameters)parcel.readParcelable(VKImageParameters.class.getClassLoader());
    }

    public /* synthetic */ VKUploadImage(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public File getTmpFile() {
        File file;
        File file2;
        Context context;
        block13: {
            VKImageParameters vKImageParameters;
            block12: {
                block16: {
                    block14: {
                        block15: {
                            context = VKUIHelper.getApplicationContext();
                            file2 = null;
                            if (context == null) break block14;
                            File file3 = context.getExternalCacheDir();
                            if (file3 == null) break block15;
                            file = file3;
                            if (file3.canWrite()) break block16;
                        }
                        file = context.getCacheDir();
                        break block16;
                    }
                    file = null;
                }
                try {
                    file2 = file = File.createTempFile((String)"tmpImg", (String)String.format((String)".%s", (Object[])new Object[]{this.mParameters.fileExtension()}), (File)file);
                    file2 = file;
                }
                catch (IOException iOException) {
                    return file2;
                }
                context = new FileOutputStream(file);
                file2 = file;
                vKImageParameters = this.mParameters;
                file2 = file;
                if (vKImageParameters.mImageType != VKImageParameters.VKImageType.Png) break block12;
                file2 = file;
                this.mImageData.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)context);
                break block13;
            }
            file2 = file;
            this.mImageData.compress(Bitmap.CompressFormat.JPEG, (int)(vKImageParameters.mJpegQuality * 100.0f), (OutputStream)context);
        }
        file2 = file;
        context.close();
        return file;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeParcelable((Parcelable)this.mImageData, 0);
        parcel.writeParcelable((Parcelable)this.mParameters, 0);
    }
}

