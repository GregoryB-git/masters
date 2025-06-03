package v2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class a extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, a3.b bVar) {
        super(context, bVar);
        ec.i.e(bVar, "taskExecutor");
    }

    @Override // v2.g
    public final Object a() {
        Intent registerReceiver = this.f15217b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            o2.j.d().b(b.f15212a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // v2.e
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // v2.e
    public final void f(Intent intent) {
        Boolean bool;
        ec.i.e(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
        }
        o2.j.d().a(b.f15212a, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                }
                bool = Boolean.FALSE;
                b(bool);
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                }
                bool = Boolean.FALSE;
                b(bool);
                break;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                }
                bool = Boolean.TRUE;
                b(bool);
                break;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                }
                bool = Boolean.TRUE;
                b(bool);
                break;
        }
    }
}
