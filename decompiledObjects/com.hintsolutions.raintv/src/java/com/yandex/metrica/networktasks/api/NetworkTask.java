/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.concurrent.Executor
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import com.yandex.metrica.networktasks.api.NetworkTask$ShouldTryNextHostCondition;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import com.yandex.metrica.networktasks.api.d;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

public class NetworkTask {
    private d a = com.yandex.metrica.networktasks.api.d.a;
    private final Executor b;
    private final IExecutionPolicy c;
    private final ExponentialBackoffPolicy d;
    private final UnderlyingNetworkTask e;
    private final List f;
    private final String g;

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List list, String string) {
        this.b = executor;
        this.c = iExecutionPolicy;
        this.d = exponentialBackoffPolicy;
        this.e = underlyingNetworkTask;
        this.f = list;
        this.g = string;
    }

    private boolean a(d d4) {
        NetworkTask networkTask = this;
        synchronized (networkTask) {
            if (this.a(new d[]{d4})) {
                this.a = d4;
                return true;
            }
            return false;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(d ... var1_1) {
        var9_2 = this;
        synchronized (var9_2) {
            var7_3 = Boolean.TRUE;
            var8_4 = this.a;
            var3_5 = ((Boolean)var1_1).length;
            var2_6 = 0;
            while (true) {
                block17: {
                    block16: {
                        var6_9 = var7_3;
                        if (var2_6 >= var3_5) break;
                        var4_7 = var1_1[var2_6].ordinal();
                        var5_8 = true;
                        switch (var4_7) {
                            default: {
                                break block16;
                            }
                            case 8: {
                                if (var8_4 == com.yandex.metrica.networktasks.api.d.a) break;
                                if (var8_4 == com.yandex.metrica.networktasks.api.d.i) {
                                    var5_8 = false;
                                }
                                ** GOTO lbl41
                            }
                            case 7: {
                                if (var8_4 == com.yandex.metrica.networktasks.api.d.e || var8_4 == com.yandex.metrica.networktasks.api.d.f || var8_4 == com.yandex.metrica.networktasks.api.d.g || var8_4 == com.yandex.metrica.networktasks.api.d.b || var8_4 == com.yandex.metrica.networktasks.api.d.c || var8_4 == com.yandex.metrica.networktasks.api.d.d) ** GOTO lbl34
                                if (var8_4 != com.yandex.metrica.networktasks.api.d.i) break;
                                break block16;
                            }
                            case 4: 
                            case 5: {
                                if (var8_4 == com.yandex.metrica.networktasks.api.d.d) ** GOTO lbl34
                                if (var8_4 != com.yandex.metrica.networktasks.api.d.i) break;
                                break block16;
                            }
                            case 3: {
                                if (var8_4 == com.yandex.metrica.networktasks.api.d.c || var8_4 == com.yandex.metrica.networktasks.api.d.e || var8_4 == com.yandex.metrica.networktasks.api.d.f) ** GOTO lbl34
                                if (var8_4 != com.yandex.metrica.networktasks.api.d.i) break;
                                break block16;
                            }
                            case 2: 
                            case 6: {
                                if (var8_4 != com.yandex.metrica.networktasks.api.d.b) ** GOTO lbl36
lbl34:
                                // 4 sources

                                var6_9 = Boolean.TRUE;
                                break block17;
lbl36:
                                // 1 sources

                                if (var8_4 != com.yandex.metrica.networktasks.api.d.i) break;
                                break block16;
                            }
                            case 1: {
                                if (var8_4 != com.yandex.metrica.networktasks.api.d.a) {
                                    var5_8 = false;
                                }
lbl41:
                                // 4 sources

                                var6_9 = var5_8;
                                break block17;
                            }
                            case 0: 
                        }
                        var6_9 = null;
                        break block17;
                    }
                    var6_9 = Boolean.FALSE;
                }
                if (!Boolean.TRUE.equals((Object)var6_9)) break;
                ++var2_6;
            }
            var1_1 = Boolean.TRUE;
            var1_1.equals((Object)var6_9);
            return var1_1.equals((Object)var6_9);
        }
    }

    public String description() {
        return this.e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.c;
    }

    public Executor getExecutor() {
        return this.b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.e;
    }

    public String getUrl() {
        return this.e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.g;
    }

    public boolean onCreateNetworkTask() {
        if (this.a(com.yandex.metrica.networktasks.api.d.c)) {
            return this.e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean bl = this.a(com.yandex.metrica.networktasks.api.d.d);
        if (bl) {
            this.e.getFullUrlFormer().incrementAttemptNumber();
            this.e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.e.onPerformRequest();
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean onRequestComplete() {
        boolean bl;
        NetworkTask networkTask = this;
        // MONITORENTER : networkTask
        d d4 = com.yandex.metrica.networktasks.api.d.e;
        boolean bl2 = false;
        d d5 = com.yandex.metrica.networktasks.api.d.f;
        if (this.a(d4, d5)) {
            bl = this.e.onRequestComplete();
            this.a = bl ? d4 : d5;
            bl2 = true;
        } else {
            bl = false;
        }
        // MONITOREXIT : networkTask
        if (!bl2) return bl;
        this.e.onPostRequestComplete(bl);
        return bl;
    }

    public void onRequestError(Throwable throwable) {
        if (this.a(com.yandex.metrica.networktasks.api.d.f)) {
            this.e.onRequestError(throwable);
        }
    }

    public void onShouldNotExecute() {
        if (this.a(com.yandex.metrica.networktasks.api.d.g)) {
            this.e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean bl = this.a(com.yandex.metrica.networktasks.api.d.b);
        if (bl) {
            this.e.onTaskAdded();
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onTaskFinished() {
        boolean bl;
        d d4;
        NetworkTask networkTask = this;
        synchronized (networkTask) {
            d4 = this.a;
            bl = this.a(com.yandex.metrica.networktasks.api.d.h);
        }
        if (!bl) return;
        this.e.onTaskFinished();
        if (d4 == com.yandex.metrica.networktasks.api.d.e) {
            this.e.onSuccessfulTaskFinished();
            return;
        }
        if (d4 != com.yandex.metrica.networktasks.api.d.f) {
            if (d4 != com.yandex.metrica.networktasks.api.d.g) return;
        }
        this.e.onUnsuccessfulTaskFinished();
    }

    public void onTaskRemoved() {
        if (this.a(com.yandex.metrica.networktasks.api.d.i)) {
            this.e.onTaskRemoved();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean shouldTryNextHost() {
        NetworkTask networkTask = this;
        synchronized (networkTask) {
            boolean bl;
            boolean bl2;
            Object object;
            int n7;
            boolean bl3;
            block4: {
                block3: {
                    bl3 = this.e.getFullUrlFormer().hasMoreHosts();
                    n7 = this.e.getResponseDataHolder().getResponseCode();
                    object = this.f.iterator();
                    do {
                        bl2 = object.hasNext();
                        bl = false;
                        if (!bl2) break block3;
                    } while (((NetworkTask$ShouldTryNextHostCondition)object.next()).shouldTryNextHost(n7));
                    n7 = 0;
                    break block4;
                }
                n7 = 1;
            }
            d d4 = this.a;
            bl2 = bl;
            if (d4 == com.yandex.metrica.networktasks.api.d.i) return bl2;
            object = com.yandex.metrica.networktasks.api.d.h;
            bl2 = bl;
            if (d4 == object) return bl2;
            bl2 = bl;
            if (!bl3) return bl2;
            bl2 = bl;
            if (n7 == 0) return bl2;
            return true;
        }
    }
}

