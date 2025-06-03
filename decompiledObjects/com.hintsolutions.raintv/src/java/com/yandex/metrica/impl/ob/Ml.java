/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.NonNull
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Gl;

public class ml
implements Parcelable {
    public static final Parcelable.Creator<ml> CREATOR = new Parcelable.Creator<ml>(){

        public Object createFromParcel(Parcel parcel) {
            return new ml(parcel);
        }

        public Object[] newArray(int n4) {
            return new ml[n4];
        }
    };
    @NonNull
    public final b a;
    @NonNull
    public final String b;

    public ml(Parcel parcel) {
        this.a = com.yandex.metrica.impl.ob.ml$b.a(parcel.readInt());
        this.b = Gl.a(parcel.readString(), "");
    }

    public ml(@NonNull b b2, @NonNull String string) {
        this.a = b2;
        this.b = string;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && ml.class == object.getClass()) {
            object = (ml)object;
            if (this.a != ((ml)object).a) {
                return false;
            }
            return this.b.equals((Object)((ml)object).b);
        }
        return false;
    }

    public int hashCode() {
        int n4 = this.a.hashCode();
        return this.b.hashCode() + n4 * 31;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("UiParsingFilter{type=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", value='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.a.a);
        parcel.writeString(this.b);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        public static final /* enum */ b d;
        public static final /* enum */ b e;
        private static final b[] f;
        public final int a;

        static {
            b b2;
            b b3;
            b b4;
            b b5;
            b = b5 = new b(0);
            c = b4 = new b(1);
            d = b3 = new b(2);
            e = b2 = new b(3);
            f = new b[]{b5, b4, b3, b2};
        }

        private b(int n5) {
            this.a = n5;
        }

        @NonNull
        public static b a(int n4) {
            b[] bArray = com.yandex.metrica.impl.ob.ml$b.values();
            for (int i3 = 0; i3 < 4; ++i3) {
                b b2 = bArray[i3];
                if (b2.a != n4) continue;
                return b2;
            }
            return b;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])f.clone();
        }
    }
}

