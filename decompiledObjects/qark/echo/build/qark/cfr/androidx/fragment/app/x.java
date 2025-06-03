/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 *  android.transition.Transition$TransitionListener
 *  android.transition.TransitionManager
 *  android.transition.TransitionSet
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package androidx.fragment.app;

import E.c;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class x
extends y {
    public static boolean C(Transition transition) {
        if (y.l(transition.getTargetIds()) && y.l(transition.getTargetNames()) && y.l(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override
    public void A(Object object, ArrayList arrayList, ArrayList arrayList2) {
        if ((object = (TransitionSet)object) != null) {
            object.getTargets().clear();
            object.getTargets().addAll((Collection)arrayList2);
            this.q(object, arrayList, arrayList2);
        }
    }

    @Override
    public Object B(Object object) {
        if (object == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition)object);
        return transitionSet;
    }

    @Override
    public void a(Object object, View view) {
        if (object != null) {
            ((Transition)object).addTarget(view);
        }
    }

    @Override
    public void b(Object object, ArrayList arrayList) {
        block4 : {
            int n8;
            block3 : {
                if ((object = (Transition)object) == null) {
                    return;
                }
                boolean bl = object instanceof TransitionSet;
                int n9 = 0;
                if (!bl) break block3;
                object = (TransitionSet)object;
                n9 = object.getTransitionCount();
                for (n8 = 0; n8 < n9; ++n8) {
                    this.b((Object)object.getTransitionAt(n8), arrayList);
                }
                break block4;
            }
            if (x.C((Transition)object) || !y.l(object.getTargets())) break block4;
            int n10 = arrayList.size();
            for (n8 = n9; n8 < n10; ++n8) {
                object.addTarget((View)arrayList.get(n8));
            }
        }
    }

    @Override
    public void c(ViewGroup viewGroup, Object object) {
        TransitionManager.beginDelayedTransition((ViewGroup)viewGroup, (Transition)((Transition)object));
    }

    @Override
    public boolean e(Object object) {
        return object instanceof Transition;
    }

    @Override
    public Object g(Object object) {
        if (object != null) {
            return ((Transition)object).clone();
        }
        return null;
    }

    @Override
    public Object m(Object object, Object object2, Object object3) {
        object = (Transition)object;
        object2 = (Transition)object2;
        object3 = (Transition)object3;
        if (object != null && object2 != null) {
            object = new TransitionSet().addTransition((Transition)object).addTransition((Transition)object2).setOrdering(1);
        } else if (object == null) {
            object = object2 != null ? object2 : null;
        }
        if (object3 != null) {
            object2 = new TransitionSet();
            if (object != null) {
                object2.addTransition((Transition)object);
            }
            object2.addTransition((Transition)object3);
            return object2;
        }
        return object;
    }

    @Override
    public Object n(Object object, Object object2, Object object3) {
        TransitionSet transitionSet = new TransitionSet();
        if (object != null) {
            transitionSet.addTransition((Transition)object);
        }
        if (object2 != null) {
            transitionSet.addTransition((Transition)object2);
        }
        if (object3 != null) {
            transitionSet.addTransition((Transition)object3);
        }
        return transitionSet;
    }

    @Override
    public void p(Object object, View view) {
        if (object != null) {
            ((Transition)object).removeTarget(view);
        }
    }

    @Override
    public void q(Object object, ArrayList arrayList, ArrayList arrayList2) {
        block4 : {
            int n8;
            int n9;
            List list;
            block3 : {
                object = (Transition)object;
                boolean bl = object instanceof TransitionSet;
                if (!bl) break block3;
                object = (TransitionSet)object;
                n8 = object.getTransitionCount();
                for (n9 = 0; n9 < n8; ++n9) {
                    this.q((Object)object.getTransitionAt(n9), arrayList, arrayList2);
                }
                break block4;
            }
            if (x.C((Transition)object) || (list = object.getTargets()) == null || list.size() != arrayList.size() || !list.containsAll((Collection)arrayList)) break block4;
            n9 = arrayList2 == null ? 0 : arrayList2.size();
            for (n8 = 0; n8 < n9; ++n8) {
                object.addTarget((View)arrayList2.get(n8));
            }
            for (n9 = arrayList.size() - 1; n9 >= 0; --n9) {
                object.removeTarget((View)arrayList.get(n9));
            }
        }
    }

    @Override
    public void r(Object object, final View view, final ArrayList arrayList) {
        ((Transition)object).addListener(new Transition.TransitionListener(){

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener((Transition.TransitionListener)this);
                view.setVisibility(8);
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    ((View)arrayList.get(i8)).setVisibility(0);
                }
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                transition.removeListener((Transition.TransitionListener)this);
                transition.addListener((Transition.TransitionListener)this);
            }
        });
    }

    @Override
    public void t(Object object, final Object object2, final ArrayList arrayList, final Object object3, final ArrayList arrayList2, final Object object4, final ArrayList arrayList3) {
        ((Transition)object).addListener(new Transition.TransitionListener(){

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener((Transition.TransitionListener)this);
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition object) {
                object = object2;
                if (object != null) {
                    x.this.q(object, arrayList, null);
                }
                if ((object = object3) != null) {
                    x.this.q(object, arrayList2, null);
                }
                if ((object = object4) != null) {
                    x.this.q(object, arrayList3, null);
                }
            }
        });
    }

    @Override
    public void u(Object object, final Rect rect) {
        if (object != null) {
            ((Transition)object).setEpicenterCallback(new Transition.EpicenterCallback(){

                public Rect onGetEpicenter(Transition transition) {
                    transition = rect;
                    if (transition != null && !transition.isEmpty()) {
                        return rect;
                    }
                    return null;
                }
            });
        }
    }

    @Override
    public void v(Object object, View view) {
        if (view != null) {
            object = (Transition)object;
            final Rect rect = new Rect();
            this.k(view, rect);
            object.setEpicenterCallback(new Transition.EpicenterCallback(){

                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override
    public void w(Fragment fragment, Object object, c c8, final Runnable runnable) {
        ((Transition)object).addListener(new Transition.TransitionListener(){

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                runnable.run();
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }
        });
    }

    @Override
    public void z(Object object, View view, ArrayList arrayList) {
        object = (TransitionSet)object;
        List list = object.getTargets();
        list.clear();
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            y.d(list, (View)arrayList.get(i8));
        }
        list.add((Object)view);
        arrayList.add((Object)view);
        this.b(object, arrayList);
    }

}

