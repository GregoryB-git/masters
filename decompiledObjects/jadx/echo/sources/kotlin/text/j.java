package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j {
    public static void a(Appendable appendable, Object obj, g6.l lVar) {
        CharSequence valueOf;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (lVar != null) {
            obj = lVar.invoke(obj);
        } else if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
                return;
            } else {
                valueOf = String.valueOf(obj);
                appendable.append(valueOf);
            }
        }
        valueOf = (CharSequence) obj;
        appendable.append(valueOf);
    }
}
