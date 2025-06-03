/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  androidx.fragment.app.Fragment
 *  com.google.android.gms.measurement.internal.zzge
 *  com.google.firebase.encoders.FieldDescriptor
 *  com.google.firebase.encoders.FieldDescriptor$Builder
 *  com.google.firebase.encoders.proto.AtProtobuf
 *  java.io.File
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  kotlin.KotlinNothingValueException
 *  kotlin.UInt
 *  kotlin.collections.IntIterator
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.InlineMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.IntRange
 *  kotlinx.coroutines.flow.FlowKt
 */
import android.graphics.Canvas;
import androidx.fragment.app.Fragment;
import com.google.android.gms.measurement.internal.zzge;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UInt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.FlowKt;

public final class a {
    public static void A(zzge zzge2, String string2) {
        zzge2.zzaA().zzd().zza(string2);
    }

    public static void B(StringBuilder stringBuilder, String string2, char c2, String string3) {
        stringBuilder.append(string2);
        stringBuilder.append(c2);
        stringBuilder.append(string3);
    }

    public static void C(StringBuilder stringBuilder, String string2, String string3, String string4, String string5) {
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
    }

    public static void D(zzge zzge2, String string2) {
        zzge2.zzaA().zzk().zza(string2);
    }

    public static float a(float f2, float f4, float f5, float f6) {
        return (f2 - f4) * f5 + f6;
    }

    public static int b(String string2, int n) {
        return String.valueOf((Object)string2).length() + n;
    }

    public static int c(UInt uInt, int n) {
        return UInt.constructor-impl((int)(uInt.unbox-impl() + n));
    }

    public static int d(IntRange intRange, int n) {
        return intRange.getEndInclusive() + n;
    }

    public static FieldDescriptor e(int n, FieldDescriptor.Builder builder) {
        return builder.withProperty((Annotation)AtProtobuf.builder().tag(n).build()).build();
    }

    public static String f(String string2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(n);
        return stringBuilder.toString();
    }

    public static String g(String string2, int n, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(n);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static String h(String string2, long l) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(l);
        return stringBuilder.toString();
    }

    public static String i(String string2, long l, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(l);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static String j(String string2, Fragment fragment, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append((Object)fragment);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static String k(String string2, File file, String string3) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string2);
        stringBuffer.append((Object)file);
        stringBuffer.append(string3);
        return stringBuffer.toString();
    }

    public static String l(String string2, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(object);
        return stringBuilder.toString().toString();
    }

    public static String m(String string2, String string3, String string4, String string5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        return stringBuilder.toString();
    }

    public static String n(StringBuilder stringBuilder, int n, char c2) {
        stringBuilder.append(n);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    public static String o(StringBuilder stringBuilder, long l, char c2) {
        stringBuilder.append(l);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    public static String p(StringBuilder stringBuilder, String string2, String string3, String string4) {
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public static StringBuilder q(int n, String string2, String string3, String string4, String string5) {
        StringBuilder stringBuilder = new StringBuilder(n);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        return stringBuilder;
    }

    public static StringBuilder r(String string2, int n, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(n);
        stringBuilder.append(string3);
        return stringBuilder;
    }

    public static StringBuilder s(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder;
    }

    public static StringBuilder t(String string2, String string3, String string4, String string5, String string6) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        stringBuilder.append(string6);
        return stringBuilder;
    }

    public static ArrayList u(LinkedHashMap linkedHashMap, Object object) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(object, (Object)arrayList);
        return arrayList;
    }

    public static ArrayList v(Map map, Object object) {
        ArrayList arrayList = new ArrayList();
        map.put(object, (Object)arrayList);
        return arrayList;
    }

    public static Iterator w(Iterable iterable, String string2, Function1 function1, String string3) {
        Intrinsics.checkNotNullParameter((Object)iterable, (String)string2);
        Intrinsics.checkNotNullParameter((Object)function1, (String)string3);
        return iterable.iterator();
    }

    public static KotlinNothingValueException x() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    public static IntIterator y(int n, int n2) {
        return new IntRange(n, n2).iterator();
    }

    public static void z(int n, Canvas canvas, int n2, int n3) {
        InlineMarker.finallyStart((int)n);
        canvas.restoreToCount(n2);
        InlineMarker.finallyEnd((int)n3);
    }
}

