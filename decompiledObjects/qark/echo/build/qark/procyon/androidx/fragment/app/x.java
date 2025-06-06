// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import E.c;
import android.transition.Transition$EpicenterCallback;
import android.graphics.Rect;
import android.transition.Transition$TransitionListener;
import java.util.List;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;
import java.util.Collection;
import android.transition.TransitionSet;
import java.util.ArrayList;
import android.transition.Transition;

public class x extends y
{
    public static boolean C(final Transition transition) {
        return !y.l(transition.getTargetIds()) || !y.l(transition.getTargetNames()) || !y.l(transition.getTargetTypes());
    }
    
    @Override
    public void A(final Object o, final ArrayList list, final ArrayList list2) {
        final TransitionSet set = (TransitionSet)o;
        if (set != null) {
            ((Transition)set).getTargets().clear();
            ((Transition)set).getTargets().addAll(list2);
            this.q(set, list, list2);
        }
    }
    
    @Override
    public Object B(final Object o) {
        if (o == null) {
            return null;
        }
        final TransitionSet set = new TransitionSet();
        set.addTransition((Transition)o);
        return set;
    }
    
    @Override
    public void a(final Object o, final View view) {
        if (o != null) {
            ((Transition)o).addTarget(view);
        }
    }
    
    @Override
    public void b(final Object o, final ArrayList list) {
        final Transition transition = (Transition)o;
        if (transition == null) {
            return;
        }
        final boolean b = transition instanceof TransitionSet;
        final int n = 0;
        int i = 0;
        if (b) {
            for (TransitionSet set = (TransitionSet)transition; i < set.getTransitionCount(); ++i) {
                this.b(set.getTransitionAt(i), list);
            }
        }
        else if (!C(transition) && y.l(transition.getTargets())) {
            for (int size = list.size(), j = n; j < size; ++j) {
                transition.addTarget((View)list.get(j));
            }
        }
    }
    
    @Override
    public void c(final ViewGroup viewGroup, final Object o) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition)o);
    }
    
    @Override
    public boolean e(final Object o) {
        return o instanceof Transition;
    }
    
    @Override
    public Object g(final Object o) {
        if (o != null) {
            return ((Transition)o).clone();
        }
        return null;
    }
    
    @Override
    public Object m(final Object o, Object o2, final Object o3) {
        Object setOrdering = o;
        final Transition transition = (Transition)o2;
        final Transition transition2 = (Transition)o3;
        if (setOrdering != null && transition != null) {
            setOrdering = new TransitionSet().addTransition((Transition)setOrdering).addTransition(transition).setOrdering(1);
        }
        else if (setOrdering == null) {
            if (transition != null) {
                setOrdering = transition;
            }
            else {
                setOrdering = null;
            }
        }
        if (transition2 != null) {
            o2 = new TransitionSet();
            if (setOrdering != null) {
                ((TransitionSet)o2).addTransition((Transition)setOrdering);
            }
            ((TransitionSet)o2).addTransition(transition2);
            return o2;
        }
        return setOrdering;
    }
    
    @Override
    public Object n(final Object o, final Object o2, final Object o3) {
        final TransitionSet set = new TransitionSet();
        if (o != null) {
            set.addTransition((Transition)o);
        }
        if (o2 != null) {
            set.addTransition((Transition)o2);
        }
        if (o3 != null) {
            set.addTransition((Transition)o3);
        }
        return set;
    }
    
    @Override
    public void p(final Object o, final View view) {
        if (o != null) {
            ((Transition)o).removeTarget(view);
        }
    }
    
    @Override
    public void q(final Object o, final ArrayList list, final ArrayList list2) {
        final Transition transition = (Transition)o;
        final boolean b = transition instanceof TransitionSet;
        int i = 0;
        int j = 0;
        if (b) {
            for (TransitionSet set = (TransitionSet)transition; j < set.getTransitionCount(); ++j) {
                this.q(set.getTransitionAt(j), list, list2);
            }
        }
        else if (!C(transition)) {
            final List targets = transition.getTargets();
            if (targets != null && targets.size() == list.size() && targets.containsAll(list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    transition.addTarget((View)list2.get(i));
                    ++i;
                }
                for (int k = list.size() - 1; k >= 0; --k) {
                    transition.removeTarget((View)list.get(k));
                }
            }
        }
    }
    
    @Override
    public void r(final Object o, final View view, final ArrayList list) {
        ((Transition)o).addListener((Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(final Transition transition) {
            }
            
            public void onTransitionEnd(final Transition transition) {
                transition.removeListener((Transition$TransitionListener)this);
                view.setVisibility(8);
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((View)list.get(i)).setVisibility(0);
                }
            }
            
            public void onTransitionPause(final Transition transition) {
            }
            
            public void onTransitionResume(final Transition transition) {
            }
            
            public void onTransitionStart(final Transition transition) {
                transition.removeListener((Transition$TransitionListener)this);
                transition.addListener((Transition$TransitionListener)this);
            }
        });
    }
    
    @Override
    public void t(final Object o, final Object o2, final ArrayList list, final Object o3, final ArrayList list2, final Object o4, final ArrayList list3) {
        ((Transition)o).addListener((Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(final Transition transition) {
            }
            
            public void onTransitionEnd(final Transition transition) {
                transition.removeListener((Transition$TransitionListener)this);
            }
            
            public void onTransitionPause(final Transition transition) {
            }
            
            public void onTransitionResume(final Transition transition) {
            }
            
            public void onTransitionStart(final Transition transition) {
                final Object a = o2;
                if (a != null) {
                    x.this.q(a, list, null);
                }
                final Object c = o3;
                if (c != null) {
                    x.this.q(c, list2, null);
                }
                final Object e = o4;
                if (e != null) {
                    x.this.q(e, list3, null);
                }
            }
        });
    }
    
    @Override
    public void u(final Object o, final Rect rect) {
        if (o != null) {
            ((Transition)o).setEpicenterCallback((Transition$EpicenterCallback)new Transition$EpicenterCallback() {
                public Rect onGetEpicenter(final Transition transition) {
                    final Rect a = rect;
                    if (a != null && !a.isEmpty()) {
                        return rect;
                    }
                    return null;
                }
            });
        }
    }
    
    @Override
    public void v(final Object o, final View view) {
        if (view != null) {
            final Transition transition = (Transition)o;
            final Rect rect = new Rect();
            this.k(view, rect);
            transition.setEpicenterCallback((Transition$EpicenterCallback)new Transition$EpicenterCallback() {
                public Rect onGetEpicenter(final Transition transition) {
                    return rect;
                }
            });
        }
    }
    
    @Override
    public void w(final Fragment fragment, final Object o, final c c, final Runnable runnable) {
        ((Transition)o).addListener((Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(final Transition transition) {
            }
            
            public void onTransitionEnd(final Transition transition) {
                runnable.run();
            }
            
            public void onTransitionPause(final Transition transition) {
            }
            
            public void onTransitionResume(final Transition transition) {
            }
            
            public void onTransitionStart(final Transition transition) {
            }
        });
    }
    
    @Override
    public void z(final Object o, final View e, final ArrayList list) {
        final TransitionSet set = (TransitionSet)o;
        final List targets = ((Transition)set).getTargets();
        targets.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            y.d(targets, list.get(i));
        }
        targets.add(e);
        list.add(e);
        this.b(set, list);
    }
}
