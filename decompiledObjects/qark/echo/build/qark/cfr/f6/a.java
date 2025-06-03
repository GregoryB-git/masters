/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.Void
 */
package f6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.v;
import m6.c;

public abstract class a {
    public static final Class a(c class_) {
        Intrinsics.checkNotNullParameter(class_, "<this>");
        class_ = ((d)((Object)class_)).b();
        if (!class_.isPrimitive()) {
            Intrinsics.c(class_, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return class_;
        }
        String string2 = class_.getName();
        switch (string2.hashCode()) {
            default: {
                break;
            }
            case 109413500: {
                if (!string2.equals((Object)"short")) break;
                class_ = Short.class;
                break;
            }
            case 97526364: {
                if (!string2.equals((Object)"float")) break;
                class_ = Float.class;
                break;
            }
            case 64711720: {
                if (!string2.equals((Object)"boolean")) break;
                class_ = Boolean.class;
                break;
            }
            case 3625364: {
                if (!string2.equals((Object)"void")) break;
                class_ = Void.class;
                break;
            }
            case 3327612: {
                if (!string2.equals((Object)"long")) break;
                class_ = Long.class;
                break;
            }
            case 3052374: {
                if (!string2.equals((Object)"char")) break;
                class_ = Character.class;
                break;
            }
            case 3039496: {
                if (!string2.equals((Object)"byte")) break;
                class_ = Byte.class;
                break;
            }
            case 104431: {
                if (!string2.equals((Object)"int")) break;
                class_ = Integer.class;
                break;
            }
            case -1325958191: {
                if (!string2.equals((Object)"double")) break;
                class_ = Double.class;
            }
        }
        Intrinsics.c(class_, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return class_;
    }

    public static final c b(Class class_) {
        Intrinsics.checkNotNullParameter((Object)class_, "<this>");
        return v.b(class_);
    }
}

