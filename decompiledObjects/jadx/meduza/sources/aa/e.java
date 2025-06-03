package aa;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f280a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final u.q f281a;

        /* renamed from: b, reason: collision with root package name */
        public final String f282b;

        public a(u.q qVar, String str) {
            this.f281a = qVar;
            this.f282b = str;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(69:0|1|(3:2|3|(1:5))|195|7|(3:171|172|(68:174|(62:176|(1:178)|10|(1:12)|13|(1:15)|16|(51:18|(1:155)|22|(1:24)|25|(1:27)(2:145|(1:150)(1:149))|28|(1:30)|31|(1:33)(2:139|(1:141)(2:142|(1:144)))|34|(1:36)(6:117|(5:120|(1:133)(1:126)|(3:128|129|130)(1:132)|131|118)|134|135|(1:137)|138)|37|(1:39)(1:116)|(1:41)|42|(33:112|113|(1:48)|49|(1:51)|52|(27:54|(1:106)|(1:59)|60|(23:62|(1:104)|(1:67)|68|(19:70|(1:72)|(1:74)|75|(1:77)|78|(1:80)|81|(3:83|(1:86)|87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(1:99)|100|101)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)|44|(33:108|109|(0)|49|(0)|52|(0)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)|46|(0)|49|(0)|52|(0)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)|156|(53:165|166|167|(1:164)|22|(0)|25|(0)(0)|28|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)|160|(1:162)|164|22|(0)|25|(0)(0)|28|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)|179|(64:181|(1:183)|10|(0)|13|(0)|16|(0)|156|(1:158)|165|166|167|(0)|164|22|(0)|25|(0)(0)|28|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101)(1:191)|184|(3:186|(1:188)(1:190)|189)|10|(0)|13|(0)|16|(0)|156|(0)|165|166|167|(0)|164|22|(0)|25|(0)(0)|28|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101))|9|10|(0)|13|(0)|16|(0)|156|(0)|165|166|167|(0)|164|22|(0)|25|(0)(0)|28|(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|(0)|42|(0)|44|(0)|46|(0)|49|(0)|52|(0)|107|(0)|60|(0)|105|(0)|68|(0)|103|(0)|75|(0)|78|(0)|81|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0162, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0163, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0307 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0453  */
    /* JADX WARN: Type inference failed for: r14v29, types: [int] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r14v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static aa.e.a a(android.content.Context r14, aa.s r15) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.e.a(android.content.Context, aa.s):aa.e$a");
    }

    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
