/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InstantiationException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 */
package com.scottyab.rootbeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

final class Const {
    public static final String BINARY_BUSYBOX = "busybox";
    public static final String BINARY_SU = "su";
    public static final String[] knownDangerousAppsPackages;
    public static final String[] knownRootAppsPackages;
    public static final String[] knownRootCloakingPackages;
    public static final String[] pathsThatShouldNotBeWritable;
    private static final String[] suPaths;

    static {
        knownRootAppsPackages = new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
        knownDangerousAppsPackages = new String[]{"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};
        knownRootCloakingPackages = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"};
        suPaths = new String[]{"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};
        pathsThatShouldNotBeWritable = new String[]{"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    }

    private Const() throws InstantiationException {
        throw new InstantiationException("This class is not for instantiation");
    }

    public static String[] getPaths() {
        ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])suPaths));
        String string2 = System.getenv((String)"PATH");
        if (string2 != null && !"".equals((Object)string2)) {
            String[] stringArray = string2.split(":");
            int n = stringArray.length;
            for (int i = 0; i < n; ++i) {
                String string3;
                string2 = string3 = stringArray[i];
                if (!string3.endsWith("/")) {
                    string2 = new StringBuilder();
                    string2.append(string3);
                    string2.append('/');
                    string2 = string2.toString();
                }
                if (arrayList.contains((Object)string2)) continue;
                arrayList.add((Object)string2);
            }
            return (String[])arrayList.toArray((Object[])new String[0]);
        }
        return (String[])arrayList.toArray((Object[])new String[0]);
    }
}

