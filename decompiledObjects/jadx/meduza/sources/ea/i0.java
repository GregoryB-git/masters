package ea;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@wb.e(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends wb.i implements dc.p<nc.d0, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f4940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f4941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Message> f4942c;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t10) {
            return p2.m0.s(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t10).getWhen()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, List<Message> list, ub.e<? super i0> eVar) {
        super(2, eVar);
        this.f4941b = h0Var;
        this.f4942c = list;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new i0(this.f4941b, this.f4942c, eVar);
    }

    @Override // dc.p
    public final Object invoke(nc.d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((i0) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        List<Message> j10;
        StringBuilder l10;
        String str;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f4940a;
        if (i10 == 0) {
            rb.f.b(obj);
            fa.a aVar2 = fa.a.f5511a;
            this.f4940a = 1;
            obj = aVar2.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb.f.b(obj);
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            str = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
        } else {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((fa.b) it.next()).b()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                ArrayList m10 = sb.q.m(new ArrayList(new sb.h(new Message[]{h0.a(this.f4941b, this.f4942c, 2), h0.a(this.f4941b, this.f4942c, 1)}, true)));
                a aVar3 = new a();
                if (m10.size() <= 1) {
                    j10 = sb.q.u(m10);
                } else {
                    Object[] array = m10.toArray(new Object[0]);
                    ec.i.e(array, "<this>");
                    if (array.length > 1) {
                        Arrays.sort(array, aVar3);
                    }
                    j10 = sb.j.j(array);
                }
                h0 h0Var = this.f4941b;
                for (Message message : j10) {
                    if (h0Var.f4930b != null) {
                        try {
                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                            Messenger messenger = h0Var.f4930b;
                            if (messenger != null) {
                                messenger.send(message);
                            }
                        } catch (RemoteException e10) {
                            StringBuilder l11 = defpackage.f.l("Unable to deliver message: ");
                            l11.append(message.what);
                            Log.w("SessionLifecycleClient", l11.toString(), e10);
                        }
                    }
                    if (h0Var.f4931c.offer(message)) {
                        l10 = defpackage.f.l("Queued message ");
                        l10.append(message.what);
                        l10.append(". Queue size ");
                        l10.append(h0Var.f4931c.size());
                    } else {
                        l10 = defpackage.f.l("Failed to enqueue message ");
                        l10.append(message.what);
                        l10.append(". Dropping.");
                    }
                    Log.d("SessionLifecycleClient", l10.toString());
                }
                return rb.h.f13851a;
            }
            str = "Data Collection is disabled for all subscribers. Skipping this Event";
        }
        Log.d("SessionLifecycleClient", str);
        return rb.h.f13851a;
    }
}
