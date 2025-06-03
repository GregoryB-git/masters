/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.vk.sdk.api.VKError
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.ExecutorService
 */
package com.vk.sdk.api.httpClient;

import androidx.annotation.Nullable;
import com.vk.sdk.api.VKError;
import java.util.concurrent.ExecutorService;

public abstract class VKAbstractOperation {
    private boolean mCanceled = false;
    private VKOperationCompleteListener mCompleteListener;
    @Nullable
    private ExecutorService mResponseQueue;
    private VKOperationState mState = VKOperationState.Created;

    public VKAbstractOperation() {
        this.setState(VKOperationState.Ready);
    }

    private boolean isStateTransitionInvalid(VKOperationState vKOperationState, VKOperationState vKOperationState2, boolean bl) {
        int[] nArray = 2.$SwitchMap$com$vk$sdk$api$httpClient$VKAbstractOperation$VKOperationState;
        int n = nArray[vKOperationState.ordinal()];
        boolean bl2 = false;
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    if (n != 5) {
                        return false;
                    }
                    n = nArray[vKOperationState2.ordinal()];
                    if (n != 1 && n != 2 && n != 3) {
                        if (n != 4) {
                            return true;
                        }
                        return bl ^ true;
                    }
                    return false;
                }
                return true;
            }
            n = nArray[vKOperationState2.ordinal()];
            return n != 1 && n != 3 && n != 4;
        }
        bl = bl2;
        if (nArray[vKOperationState2.ordinal()] != 3) {
            bl = bl2;
            if (vKOperationState2 != VKOperationState.Ready) {
                bl = true;
            }
        }
        return bl;
    }

    public void cancel() {
        this.mCanceled = true;
        this.setState(VKOperationState.Canceled);
    }

    public void finish() {
        Runnable runnable = new Runnable(this){
            public final VKAbstractOperation this$0;
            {
                this.this$0 = vKAbstractOperation;
            }

            public void run() {
                if (this.this$0.mCompleteListener != null) {
                    this.this$0.mCompleteListener.onComplete();
                }
            }
        };
        ExecutorService executorService = this.mResponseQueue;
        if (executorService != null) {
            executorService.submit(runnable);
        } else {
            runnable.run();
        }
    }

    public abstract Object getResultObject();

    public void setCompleteListener(VKOperationCompleteListener vKOperationCompleteListener) {
        this.mCompleteListener = vKOperationCompleteListener;
    }

    public void setState(VKOperationState vKOperationState) {
        if (this.isStateTransitionInvalid(this.mState, vKOperationState, this.mCanceled)) {
            return;
        }
        this.mState = vKOperationState;
        if (vKOperationState == VKOperationState.Finished || vKOperationState == VKOperationState.Canceled) {
            this.finish();
        }
    }

    public void start(ExecutorService executorService) {
        this.mResponseQueue = executorService;
    }

    public VKOperationState state() {
        return this.mState;
    }

    public static abstract class VKAbstractCompleteListener<OperationType extends VKAbstractOperation, ResponseType> {
        public abstract void onComplete(OperationType var1, ResponseType var2);

        public abstract void onError(OperationType var1, VKError var2);
    }

    public static interface VKOperationCompleteListener {
        public void onComplete();
    }

    public static final class VKOperationState
    extends Enum<VKOperationState> {
        private static final VKOperationState[] $VALUES;
        public static final /* enum */ VKOperationState Canceled;
        public static final /* enum */ VKOperationState Created;
        public static final /* enum */ VKOperationState Executing;
        public static final /* enum */ VKOperationState Finished;
        public static final /* enum */ VKOperationState Paused;
        public static final /* enum */ VKOperationState Ready;

        static {
            VKOperationState vKOperationState;
            VKOperationState vKOperationState2;
            VKOperationState vKOperationState3;
            VKOperationState vKOperationState4;
            VKOperationState vKOperationState5;
            VKOperationState vKOperationState6;
            Created = vKOperationState6 = new VKOperationState();
            Ready = vKOperationState5 = new VKOperationState();
            Executing = vKOperationState4 = new VKOperationState();
            Paused = vKOperationState3 = new VKOperationState();
            Finished = vKOperationState2 = new VKOperationState();
            Canceled = vKOperationState = new VKOperationState();
            $VALUES = new VKOperationState[]{vKOperationState6, vKOperationState5, vKOperationState4, vKOperationState3, vKOperationState2, vKOperationState};
        }

        public static VKOperationState valueOf(String string2) {
            return (VKOperationState)Enum.valueOf(VKOperationState.class, (String)string2);
        }

        public static VKOperationState[] values() {
            return (VKOperationState[])$VALUES.clone();
        }
    }
}

