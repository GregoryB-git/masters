package Y3;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public Map f7564a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Object f7565b;

    public String a(String str) {
        String str2 = str + "<value>: " + this.f7565b + "\n";
        if (this.f7564a.isEmpty()) {
            return str2 + str + "<empty>";
        }
        for (Map.Entry entry : this.f7564a.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(entry.getKey());
            sb.append(":\n");
            sb.append(((l) entry.getValue()).a(str + "\t"));
            sb.append("\n");
            str2 = sb.toString();
        }
        return str2;
    }
}
