package o0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f18168a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18169b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18170c;

    public n(List list, List list2, List list3) {
        this.f18168a = list;
        this.f18169b = list2;
        this.f18170c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    public static void c(String str, List list, List list2, List list3) {
        String str2;
        int i7;
        int i8;
        list.add("");
        int i9 = 0;
        while (i9 < str.length()) {
            int indexOf = str.indexOf("$", i9);
            if (indexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i9));
                i9 = str.length();
            } else if (indexOf != i9) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i9, indexOf));
                i9 = indexOf;
            } else if (str.startsWith("$$", i9)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                i9 += 2;
            } else {
                list3.add("");
                int i10 = i9 + 1;
                int indexOf2 = str.indexOf("$", i10);
                String substring = str.substring(i10, indexOf2);
                if (substring.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring) {
                        case "Number":
                            i7 = 2;
                            list2.add(i7);
                            list3.set(list2.size() - 1, str2);
                            break;
                        case "Time":
                            i8 = 4;
                            i7 = Integer.valueOf(i8);
                            list2.add(i7);
                            list3.set(list2.size() - 1, str2);
                            break;
                        case "Bandwidth":
                            i8 = 3;
                            i7 = Integer.valueOf(i8);
                            list2.add(i7);
                            list3.set(list2.size() - 1, str2);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                }
                list.add("");
                i9 = indexOf2 + 1;
            }
        }
    }

    public String a(String str, long j7, int i7, long j8) {
        String format;
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < this.f18169b.size(); i8++) {
            sb.append((String) this.f18168a.get(i8));
            if (((Integer) this.f18169b.get(i8)).intValue() == 1) {
                sb.append(str);
            } else {
                if (((Integer) this.f18169b.get(i8)).intValue() == 2) {
                    format = String.format(Locale.US, (String) this.f18170c.get(i8), Long.valueOf(j7));
                } else if (((Integer) this.f18169b.get(i8)).intValue() == 3) {
                    format = String.format(Locale.US, (String) this.f18170c.get(i8), Integer.valueOf(i7));
                } else if (((Integer) this.f18169b.get(i8)).intValue() == 4) {
                    format = String.format(Locale.US, (String) this.f18170c.get(i8), Long.valueOf(j8));
                }
                sb.append(format);
            }
        }
        sb.append((String) this.f18168a.get(this.f18169b.size()));
        return sb.toString();
    }
}
