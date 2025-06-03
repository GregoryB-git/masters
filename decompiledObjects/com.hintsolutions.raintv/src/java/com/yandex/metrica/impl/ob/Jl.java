/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.ml;
import java.util.ArrayList;
import java.util.List;

public class jl
implements Parcelable {
    public static final Parcelable.Creator<jl> CREATOR = new Parcelable.Creator<jl>(){

        public Object createFromParcel(Parcel parcel) {
            return new jl(parcel);
        }

        public Object[] newArray(int n4) {
            return new jl[n4];
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    @NonNull
    public final List<ml> h;

    public jl(int n4, int n5, int n7, long l5, boolean bl, boolean bl2, boolean bl3, @NonNull List<ml> list) {
        this.a = n4;
        this.b = n5;
        this.c = n7;
        this.d = l5;
        this.e = bl;
        this.f = bl2;
        this.g = bl3;
        this.h = list;
    }

    public jl(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.e = bl2;
        bl2 = parcel.readByte() != 0;
        this.f = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.g = bl2;
        ArrayList arrayList = new ArrayList();
        parcel.readList((List)arrayList, ml.class.getClassLoader());
        this.h = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && jl.class == object.getClass()) {
            object = (jl)object;
            if (this.a != ((jl)object).a) {
                return false;
            }
            if (this.b != ((jl)object).b) {
                return false;
            }
            if (this.c != ((jl)object).c) {
                return false;
            }
            if (this.d != ((jl)object).d) {
                return false;
            }
            if (this.e != ((jl)object).e) {
                return false;
            }
            if (this.f != ((jl)object).f) {
                return false;
            }
            if (this.g != ((jl)object).g) {
                return false;
            }
            return this.h.equals(((jl)object).h);
        }
        return false;
    }

    public int hashCode() {
        int n4 = this.a;
        int n5 = this.b;
        int n7 = this.c;
        long l5 = this.d;
        int n8 = (int)(l5 ^ l5 >>> 32);
        int n9 = this.e;
        int n10 = this.f;
        int n11 = this.g;
        return this.h.hashCode() + ((((((n4 * 31 + n5) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + n10) * 31 + n11) * 31;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("UiParsingConfig{tooLongTextBound=");
        stringBuilder.append(this.a);
        stringBuilder.append(", truncatedTextBound=");
        stringBuilder.append(this.b);
        stringBuilder.append(", maxVisitedChildrenInLevel=");
        stringBuilder.append(this.c);
        stringBuilder.append(", afterCreateTimeout=");
        stringBuilder.append(this.d);
        stringBuilder.append(", relativeTextSizeCalculation=");
        stringBuilder.append(this.e);
        stringBuilder.append(", errorReporting=");
        stringBuilder.append(this.f);
        stringBuilder.append(", parsingAllowedByDefault=");
        stringBuilder.append(this.g);
        stringBuilder.append(", filters=");
        stringBuilder.append(this.h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeByte((byte)(this.e ? 1 : 0));
        parcel.writeByte((byte)(this.f ? 1 : 0));
        parcel.writeByte((byte)(this.g ? 1 : 0));
        parcel.writeList(this.h);
    }
}

