/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.RemoteException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package O1;

import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.B;

public final class y {
    public static final y a = new y();

    public static final void d(a a8) {
        Intrinsics.checkNotNullParameter(a8, "callback");
        y y8 = a;
        if (!y8.b()) {
            y8.c(a8);
        }
    }

    public final boolean b() {
        return B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    public final void c(a object) {
        final InstallReferrerClient installReferrerClient = InstallReferrerClient.newBuilder(B.l()).build();
        object = new InstallReferrerStateListener((a)object){
            public final /* synthetic */ a b;
            {
                this.b = a8;
            }

            @Override
            public void onInstallReferrerServiceDisconnected() {
            }

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void onInstallReferrerSetupFinished(int n8) {
                Throwable throwable222;
                block12 : {
                    Object object;
                    if (T1.a.d(this)) {
                        return;
                    }
                    if (n8 != 0) {
                        if (n8 == 2) {
                            try {
                                object = y.a;
                                break block11;
                            }
                            catch (Throwable throwable222) {
                                break block12;
                            }
                        }
                    } else {
                        block11 : {
                            object = installReferrerClient.getInstallReferrer();
                            Intrinsics.checkNotNullExpressionValue(object, "{\n                      referrerClient.installReferrer\n                    }");
                            object = object.getInstallReferrer();
                            if (object != null && (i.v((CharSequence)object, "fb", false, 2, null) || i.v((CharSequence)object, "facebook", false, 2, null))) {
                                this.b.a((String)object);
                            }
                            object = y.a;
                        }
                        ((y)object).e();
                    }
                    try {
                        installReferrerClient.endConnection();
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                T1.a.b(throwable222, this);
                return;
                catch (RemoteException remoteException) {
                    return;
                }
            }
        };
        try {
            installReferrerClient.startConnection((InstallReferrerStateListener)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void e() {
        B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    public static interface a {
        public void a(String var1);
    }

}

