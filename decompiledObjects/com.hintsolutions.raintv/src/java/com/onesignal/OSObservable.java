/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.onesignal;

import com.onesignal.CallbackThreadManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class OSObservable<ObserverType, StateType> {
    private boolean fireOnMainThread;
    private String methodName;
    private List<Object> observers;

    public OSObservable(String string2, boolean bl) {
        this.methodName = string2;
        this.fireOnMainThread = bl;
        this.observers = new ArrayList();
    }

    public void addObserver(ObserverType ObserverType) {
        this.observers.add((Object)new WeakReference(ObserverType));
    }

    public void addObserverStrong(ObserverType ObserverType) {
        this.observers.add(ObserverType);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean notifyChange(StateType StateType) {
        Iterator iterator = this.observers.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            Runnable runnable;
            Runnable runnable2 = runnable = iterator.next();
            if (runnable instanceof WeakReference) {
                runnable2 = ((WeakReference)runnable).get();
            }
            if (runnable2 == null) continue;
            runnable = runnable2.getClass();
            try {
                Method method = runnable.getDeclaredMethod(this.methodName, new Class[]{StateType.getClass()});
                method.setAccessible(true);
                if (this.fireOnMainThread) {
                    CallbackThreadManager.Companion companion = CallbackThreadManager.Companion;
                    runnable = new Runnable(this, method, runnable2, StateType){
                        public final OSObservable this$0;
                        public final Method val$method;
                        public final Object val$state;
                        public final Object val$strongRefObserver;
                        {
                            this.this$0 = oSObservable;
                            this.val$method = method;
                            this.val$strongRefObserver = object;
                            this.val$state = object2;
                        }

                        public void run() {
                            try {
                                this.val$method.invoke(this.val$strongRefObserver, new Object[]{this.val$state});
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                invocationTargetException.printStackTrace();
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                illegalAccessException.printStackTrace();
                            }
                        }
                    };
                    companion.runOnPreferred(runnable);
                } else {
                    try {
                        method.invoke((Object)runnable2, new Object[]{StateType});
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        invocationTargetException.printStackTrace();
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        illegalAccessException.printStackTrace();
                    }
                }
                bl = true;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                noSuchMethodException.printStackTrace();
                continue;
            }
            break;
        }
        return bl;
    }

    public void removeObserver(ObserverType ObserverType) {
        for (int i = 0; i < this.observers.size(); ++i) {
            Object object = ((WeakReference)this.observers.get(i)).get();
            if (object == null || !object.equals(ObserverType)) continue;
            this.observers.remove(i);
            break;
        }
    }
}

