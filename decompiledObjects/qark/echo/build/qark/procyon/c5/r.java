// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

public abstract class r extends p
{
    public static final int[] f;
    public static final int[][] g;
    
    static {
        f = new int[] { 1, 1, 1, 1, 1, 1 };
        g = new int[][] { { 56, 52, 50, 49, 44, 38, 35, 42, 41, 37 }, { 7, 11, 13, 14, 19, 25, 28, 21, 22, 26 } };
    }
    
    public static String c(final String s) {
        final char[] str = new char[6];
        s.getChars(1, 7, str, 0);
        final StringBuilder sb = new StringBuilder(12);
        sb.append(s.charAt(0));
        final char c = str[5];
        switch (c) {
            default: {
                sb.append(str, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
            }
            case 52: {
                sb.append(str, 0, 4);
                sb.append("00000");
                sb.append(str[4]);
                break;
            }
            case 51: {
                sb.append(str, 0, 3);
                sb.append("00000");
                sb.append(str, 3, 2);
                break;
            }
            case 48:
            case 49:
            case 50: {
                sb.append(str, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(str, 2, 3);
                break;
            }
        }
        if (s.length() >= 8) {
            sb.append(s.charAt(7));
        }
        return sb.toString();
    }
}
