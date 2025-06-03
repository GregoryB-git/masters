/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKApiPhotoSize;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiPhotoSize
extends VKApiModel
implements Comparable<VKApiPhotoSize>,
Identifiable {
    public static Parcelable.Creator<VKApiPhotoSize> CREATOR = new Parcelable.Creator<VKApiPhotoSize>(){

        public VKApiPhotoSize createFromParcel(Parcel parcel) {
            return new VKApiPhotoSize(parcel, null);
        }

        public VKApiPhotoSize[] newArray(int n) {
            return new VKApiPhotoSize[n];
        }
    };
    public static final char M = 'm';
    public static final char O = 'o';
    public static final char P = 'p';
    public static final char Q = 'q';
    public static final char S = 's';
    public static final char W = 'w';
    public static final char X = 'x';
    public static final char Y = 'y';
    public static final char Z = 'z';
    public int height;
    public String src;
    public char type;
    public int width;

    private VKApiPhotoSize() {
    }

    private VKApiPhotoSize(Parcel parcel) {
        this.src = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.type = (char)parcel.readInt();
    }

    public /* synthetic */ VKApiPhotoSize(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public VKApiPhotoSize(JSONObject jSONObject) throws JSONException {
        VKApiPhotoSize.parse(jSONObject, 0, 0);
    }

    public static VKApiPhotoSize create(String string2, char c, int n, int n2) {
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.src = string2;
        vKApiPhotoSize.type = c;
        VKApiPhotoSize.fillDimensions(vKApiPhotoSize, n, n2);
        return vKApiPhotoSize;
    }

    public static VKApiPhotoSize create(String string2, int n) {
        return VKApiPhotoSize.create(string2, n, n);
    }

    public static VKApiPhotoSize create(String string2, int n, int n2) {
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.src = string2;
        vKApiPhotoSize.width = n;
        vKApiPhotoSize.height = n2;
        float f = (float)n / (float)n2;
        if (n <= 75) {
            vKApiPhotoSize.type = (char)115;
        } else if (n <= 130) {
            int n3 = f <= 1.5f ? 111 : 109;
            vKApiPhotoSize.type = (char)n3;
        } else if (n <= 200 && f <= 1.5f) {
            vKApiPhotoSize.type = (char)112;
        } else if (n <= 320 && f <= 1.5f) {
            vKApiPhotoSize.type = (char)113;
        } else if (n <= 604) {
            vKApiPhotoSize.type = (char)120;
        } else if (n <= 807) {
            vKApiPhotoSize.type = (char)121;
        } else if (n <= 1280 && n2 <= 1024) {
            vKApiPhotoSize.type = (char)122;
        } else if (n <= 2560 && n2 <= 2048) {
            vKApiPhotoSize.type = (char)119;
        }
        return vKApiPhotoSize;
    }

    private static void fillDimensionOPQ(VKApiPhotoSize vKApiPhotoSize, float f, int n) {
        VKApiPhotoSize.fillDimensionSMXY(vKApiPhotoSize, Math.min((float)1.5f, (float)f), n);
    }

    private static void fillDimensionSMXY(VKApiPhotoSize vKApiPhotoSize, float f, int n) {
        vKApiPhotoSize.width = n;
        vKApiPhotoSize.height = (int)Math.ceil((double)((float)n / f));
    }

    private static void fillDimensionZW(VKApiPhotoSize vKApiPhotoSize, float f, int n, int n2) {
        if (f > 1.0f) {
            vKApiPhotoSize.width = n;
            vKApiPhotoSize.height = (int)((float)n / f);
        } else {
            vKApiPhotoSize.height = n2;
            vKApiPhotoSize.width = (int)((float)n2 * f);
        }
    }

    private static void fillDimensions(VKApiPhotoSize vKApiPhotoSize, int n, int n2) {
        float f = (float)n / (float)n2;
        switch (vKApiPhotoSize.type) {
            default: {
                break;
            }
            case 'z': {
                VKApiPhotoSize.fillDimensionZW(vKApiPhotoSize, f, Math.min((int)n, (int)1280), Math.min((int)n2, (int)1024));
                break;
            }
            case 'y': {
                VKApiPhotoSize.fillDimensionSMXY(vKApiPhotoSize, f, Math.min((int)n, (int)807));
                break;
            }
            case 'x': {
                VKApiPhotoSize.fillDimensionSMXY(vKApiPhotoSize, f, Math.min((int)n, (int)604));
                break;
            }
            case 'w': {
                VKApiPhotoSize.fillDimensionZW(vKApiPhotoSize, f, Math.min((int)n, (int)2560), Math.min((int)n2, (int)2048));
                break;
            }
            case 's': {
                VKApiPhotoSize.fillDimensionSMXY(vKApiPhotoSize, f, Math.min((int)n, (int)75));
                break;
            }
            case 'q': {
                VKApiPhotoSize.fillDimensionOPQ(vKApiPhotoSize, f, Math.min((int)n, (int)320));
                break;
            }
            case 'p': {
                VKApiPhotoSize.fillDimensionOPQ(vKApiPhotoSize, f, Math.min((int)n, (int)200));
                break;
            }
            case 'o': {
                VKApiPhotoSize.fillDimensionOPQ(vKApiPhotoSize, f, Math.min((int)n, (int)130));
                break;
            }
            case 'm': {
                VKApiPhotoSize.fillDimensionSMXY(vKApiPhotoSize, f, Math.min((int)n, (int)130));
            }
        }
    }

    public static VKApiPhotoSize parse(JSONObject object, int n, int n2) {
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.src = object.optString("src");
        vKApiPhotoSize.width = object.optInt("width");
        vKApiPhotoSize.height = object.optInt("height");
        if (!TextUtils.isEmpty((CharSequence)(object = object.optString("type")))) {
            vKApiPhotoSize.type = object.charAt(0);
        }
        if (vKApiPhotoSize.width == 0 || vKApiPhotoSize.height == 0) {
            VKApiPhotoSize.fillDimensions(vKApiPhotoSize, n, n2);
        }
        return vKApiPhotoSize;
    }

    public int compareTo(VKApiPhotoSize vKApiPhotoSize) {
        int n = this.width;
        int n2 = vKApiPhotoSize.width;
        n = n < n2 ? -1 : (n == n2 ? 0 : 1);
        return n;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeString(this.src);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt((int)this.type);
    }
}

