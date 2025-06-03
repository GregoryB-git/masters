package c4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4.a;
import v5.e0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2305c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f2306a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2307b = -1;

    public final boolean a(String str) {
        Matcher matcher = f2305c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i10 = e0.f15881a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f2306a = parseInt;
            this.f2307b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(p4.a aVar) {
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f12996a;
            if (i10 >= bVarArr.length) {
                return;
            }
            a.b bVar = bVarArr[i10];
            if (bVar instanceof u4.e) {
                u4.e eVar = (u4.e) bVar;
                if ("iTunSMPB".equals(eVar.f14952c) && a(eVar.f14953d)) {
                    return;
                }
            } else if (bVar instanceof u4.i) {
                u4.i iVar = (u4.i) bVar;
                if ("com.apple.iTunes".equals(iVar.f14964b) && "iTunSMPB".equals(iVar.f14965c) && a(iVar.f14966d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
