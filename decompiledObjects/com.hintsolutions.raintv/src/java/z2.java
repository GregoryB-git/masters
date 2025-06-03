/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  androidx.recyclerview.widget.RecyclerView
 *  com.google.android.exoplayer2.util.Log
 *  com.google.android.gms.internal.measurement.zzbl
 *  com.google.android.gms.internal.measurement.zzh
 *  com.google.android.gms.measurement.internal.zzge
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  kotlin.UByte
 *  kotlin.UByteArray
 *  kotlin.UInt
 *  kotlin.UIntArray
 *  kotlin.ULong
 *  kotlin.ULongArray
 *  kotlin.UShort
 *  kotlin.UShortArray
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.sequences.Sequence
 */
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.measurement.internal.zzge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class z2 {
    public static void A(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        android.util.Log.w((String)string4, (String)stringBuilder.toString());
    }

    public static int a(int n, int n2, int n3, int n4) {
        return n * n2 / n3 + n4;
    }

    public static int b(CharSequence charSequence, String string2, Function1 function1, String string3) {
        Intrinsics.checkNotNullParameter((Object)charSequence, (String)string2);
        Intrinsics.checkNotNullParameter((Object)function1, (String)string3);
        return charSequence.length();
    }

    public static int c(String string2, int n, int n2) {
        return (string2.hashCode() + n) * n2;
    }

    public static Bundle d(String string2, String string3) {
        Bundle bundle = new Bundle();
        bundle.putString(string2, string3);
        return bundle;
    }

    public static Object e(zzbl zzbl2, int n, List list, int n2) {
        zzh.zzh((String)zzbl2.name(), (int)n, (List)list);
        return list.get(n2);
    }

    public static Object f(CharSequence charSequence, int n, Function1 function1) {
        return function1.invoke((Object)Character.valueOf((char)charSequence.charAt(n)));
    }

    public static Object g(byte[] byArray, int n, Function1 function1) {
        return function1.invoke((Object)UByte.box-impl((byte)UByteArray.get-w2LRezQ((byte[])byArray, (int)n)));
    }

    public static Object h(int[] nArray, int n, Function1 function1) {
        return function1.invoke((Object)UInt.box-impl((int)UIntArray.get-pVg5ArA((int[])nArray, (int)n)));
    }

    public static Object i(long[] lArray, int n, Function1 function1) {
        return function1.invoke((Object)ULong.box-impl((long)ULongArray.get-s-VKNKU((long[])lArray, (int)n)));
    }

    public static Object j(short[] sArray, int n, Function1 function1) {
        return function1.invoke((Object)UShort.box-impl((short)UShortArray.get-Mh2AYeg((short[])sArray, (int)n)));
    }

    public static String k(int n, String string2, int n2) {
        StringBuilder stringBuilder = new StringBuilder(n);
        stringBuilder.append(string2);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public static String l(int n, String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder(n);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public static String m(RecyclerView recyclerView, StringBuilder stringBuilder) {
        stringBuilder.append(recyclerView.exceptionLabel());
        return stringBuilder.toString();
    }

    public static String n(String string2, int n, String string3, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(n);
        stringBuilder.append(string3);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public static String o(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static String p(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public static String q(StringBuilder stringBuilder, int n, String string2) {
        stringBuilder.append(n);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String r(StringBuilder stringBuilder, long l, String string2) {
        stringBuilder.append(l);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String s(StringBuilder stringBuilder, String string2, String string3) {
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static StringBuilder t(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        return stringBuilder;
    }

    public static StringBuilder u(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        return stringBuilder;
    }

    public static Iterator v(Sequence sequence, String string2, Function1 function1, String string3) {
        Intrinsics.checkNotNullParameter((Object)sequence, (String)string2);
        Intrinsics.checkNotNullParameter((Object)function1, (String)string3);
        return sequence.iterator();
    }

    public static void w(int n, HashMap hashMap, String string2, int n2, String string3, int n3, String string4, int n4, String string5) {
        hashMap.put((Object)string2, (Object)n);
        hashMap.put((Object)string3, (Object)n2);
        hashMap.put((Object)string4, (Object)n3);
        hashMap.put((Object)string5, (Object)n4);
    }

    public static void x(zzge zzge2, String string2) {
        zzge2.zzaA().zzj().zza(string2);
    }

    public static void y(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        Log.w((String)string4, (String)stringBuilder.toString());
    }

    public static void z(int n, HashMap hashMap, String string2, int n2, String string3, int n3, String string4, int n4, String string5) {
        hashMap.put((Object)string2, (Object)n);
        hashMap.put((Object)string3, (Object)n2);
        hashMap.put((Object)string4, (Object)n3);
        hashMap.put((Object)string5, (Object)n4);
    }
}

