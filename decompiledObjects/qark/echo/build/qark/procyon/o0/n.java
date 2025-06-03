// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public final class n
{
    public final List a;
    public final List b;
    public final List c;
    
    public n(final List a, final List b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static n b(final String s) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        c(s, list, list2, list3);
        return new n(list, list2, list3);
    }
    
    public static void c(final String str, final List list, final List list2, final List list3) {
        list.add("");
        int i = 0;
        while (i < str.length()) {
            final int index = str.indexOf("$", i);
            final int n = -1;
            if (index == -1) {
                final int size = list2.size();
                final StringBuilder sb = new StringBuilder();
                sb.append(list.get(list2.size()));
                sb.append(str.substring(i));
                list.set(size, sb.toString());
                i = str.length();
            }
            else if (index != i) {
                final int size2 = list2.size();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(list.get(list2.size()));
                sb2.append(str.substring(i, index));
                list.set(size2, sb2.toString());
                i = index;
            }
            else if (str.startsWith("$$", i)) {
                final int size3 = list2.size();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(list.get(list2.size()));
                sb3.append("$");
                list.set(size3, sb3.toString());
                i += 2;
            }
            else {
                list3.add("");
                final int n2 = i + 1;
                final int index2 = str.indexOf("$", n2);
                String s = str.substring(n2, index2);
                if (s.equals("RepresentationID")) {
                    list2.add(1);
                }
                else {
                    final int index3 = s.indexOf("%0");
                    String s2;
                    if (index3 != -1) {
                        final String str2 = s2 = s.substring(index3);
                        if (!str2.endsWith("d")) {
                            s2 = str2;
                            if (!str2.endsWith("x")) {
                                s2 = str2;
                                if (!str2.endsWith("X")) {
                                    final StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str2);
                                    sb4.append("d");
                                    s2 = sb4.toString();
                                }
                            }
                        }
                        s = s.substring(0, index3);
                    }
                    else {
                        s2 = "%01d";
                    }
                    s.hashCode();
                    int n3 = 0;
                    switch (s.hashCode()) {
                        default: {
                            n3 = n;
                            break;
                        }
                        case 38199441: {
                            if (!s.equals("Bandwidth")) {
                                n3 = n;
                                break;
                            }
                            n3 = 2;
                            break;
                        }
                        case 2606829: {
                            if (!s.equals("Time")) {
                                n3 = n;
                                break;
                            }
                            n3 = 1;
                            break;
                        }
                        case -1950496919: {
                            if (!s.equals("Number")) {
                                n3 = n;
                                break;
                            }
                            n3 = 0;
                            break;
                        }
                    }
                    Integer n4 = null;
                    Label_0635: {
                        int j = 0;
                        switch (n3) {
                            default: {
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("Invalid template: ");
                                sb5.append(str);
                                throw new IllegalArgumentException(sb5.toString());
                            }
                            case 2: {
                                j = 3;
                                break;
                            }
                            case 1: {
                                j = 4;
                                break;
                            }
                            case 0: {
                                n4 = 2;
                                break Label_0635;
                            }
                        }
                        n4 = j;
                    }
                    list2.add(n4);
                    list3.set(list2.size() - 1, s2);
                }
                list.add("");
                i = index2 + 1;
            }
        }
    }
    
    public String a(final String str, final long l, final int i, final long j) {
        final StringBuilder sb = new StringBuilder();
        for (int k = 0; k < this.b.size(); ++k) {
            sb.append((String)this.a.get(k));
            if ((int)this.b.get(k) == 1) {
                sb.append(str);
            }
            else {
                String str2;
                if ((int)this.b.get(k) == 2) {
                    str2 = String.format(Locale.US, this.c.get(k), l);
                }
                else if ((int)this.b.get(k) == 3) {
                    str2 = String.format(Locale.US, this.c.get(k), i);
                }
                else {
                    if ((int)this.b.get(k) != 4) {
                        continue;
                    }
                    str2 = String.format(Locale.US, this.c.get(k), j);
                }
                sb.append(str2);
            }
        }
        sb.append(this.a.get(this.b.size()));
        return sb.toString();
    }
}
