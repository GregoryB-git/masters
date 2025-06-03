// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H;

public abstract class b
{
    public static void a(final Object o, final StringBuilder sb) {
        String hexString;
        if (o == null) {
            hexString = "null";
        }
        else {
            String str;
            if ((str = o.getClass().getSimpleName()).length() <= 0) {
                final String name = o.getClass().getName();
                final int lastIndex = name.lastIndexOf(46);
                str = name;
                if (lastIndex > 0) {
                    str = name.substring(lastIndex + 1);
                }
            }
            sb.append(str);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(o));
        }
        sb.append(hexString);
    }
}
