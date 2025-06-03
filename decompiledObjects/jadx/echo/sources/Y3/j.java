package Y3;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Random f7555a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public static long f7556b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7557c = new int[12];

    public static final String a(String str) {
        n.g(str);
        Integer k7 = m.k(str);
        if (k7 != null) {
            return k7.intValue() == Integer.MIN_VALUE ? "[MIN_NAME]" : String.valueOf(k7.intValue() - 1);
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(sb.length() - 1) == '-') {
            return sb.length() == 1 ? String.valueOf(Integer.MAX_VALUE) : sb.substring(0, sb.length() - 1);
        }
        sb.setCharAt(sb.length() - 1, "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(sb.length() - 1)) - 1));
        sb.append(new String(new char[786 - sb.length()]).replace("\u0000", "z"));
        return sb.toString();
    }

    public static final String b(String str) {
        n.g(str);
        Integer k7 = m.k(str);
        if (k7 != null) {
            return k7.intValue() == Integer.MAX_VALUE ? String.valueOf('-') : String.valueOf(k7.intValue() + 1);
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() < 786) {
            sb.append('-');
            return sb.toString();
        }
        int length = sb.length() - 1;
        while (length >= 0 && sb.charAt(length) == 'z') {
            length--;
        }
        if (length == -1) {
            return "[MAX_KEY]";
        }
        int i7 = length + 1;
        sb.replace(length, i7, String.valueOf("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(length)) + 1)));
        return sb.substring(0, i7);
    }
}
