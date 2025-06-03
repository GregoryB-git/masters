package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.constraintlayout.widget.R.styleable;
import org.xmlpull.v1.XmlPullParser;
import z2;

public class MotionScene$Transition$TransitionOnClick
  implements View.OnClickListener
{
  public static final int ANIM_TOGGLE = 17;
  public static final int ANIM_TO_END = 1;
  public static final int ANIM_TO_START = 16;
  public static final int JUMP_TO_END = 256;
  public static final int JUMP_TO_START = 4096;
  public int mMode;
  public int mTargetId;
  private final MotionScene.Transition mTransition;
  
  public MotionScene$Transition$TransitionOnClick(Context paramContext, MotionScene.Transition paramTransition, XmlPullParser paramXmlPullParser)
  {
    mTargetId = -1;
    mMode = 17;
    mTransition = paramTransition;
    paramContext = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.OnClick);
    int i = paramContext.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramContext.getIndex(j);
      if (k == R.styleable.OnClick_targetId) {
        mTargetId = paramContext.getResourceId(k, mTargetId);
      } else if (k == R.styleable.OnClick_clickAction) {
        mMode = paramContext.getInt(k, mMode);
      }
    }
    paramContext.recycle();
  }
  
  public MotionScene$Transition$TransitionOnClick(MotionScene.Transition paramTransition, int paramInt1, int paramInt2)
  {
    mTransition = paramTransition;
    mTargetId = paramInt1;
    mMode = paramInt2;
  }
  
  public void addOnClickListeners(MotionLayout paramMotionLayout, int paramInt, MotionScene.Transition paramTransition)
  {
    int i = mTargetId;
    if (i != -1) {
      paramMotionLayout = paramMotionLayout.findViewById(i);
    }
    if (paramMotionLayout == null)
    {
      paramMotionLayout = z2.t("OnClick could not find id ");
      paramMotionLayout.append(mTargetId);
      Log.e("MotionScene", paramMotionLayout.toString());
      return;
    }
    int j = MotionScene.Transition.access$100(paramTransition);
    int k = MotionScene.Transition.access$000(paramTransition);
    if (j == -1)
    {
      paramMotionLayout.setOnClickListener(this);
      return;
    }
    int m = mMode;
    int n = 0;
    if (((m & 0x1) != 0) && (paramInt == j)) {
      i = 1;
    } else {
      i = 0;
    }
    int i1;
    if (((m & 0x100) != 0) && (paramInt == j)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (((m & 0x1) != 0) && (paramInt == j)) {
      j = 1;
    } else {
      j = 0;
    }
    int i2;
    if (((m & 0x10) != 0) && (paramInt == k)) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3 = n;
    if ((m & 0x1000) != 0)
    {
      i3 = n;
      if (paramInt == k) {
        i3 = 1;
      }
    }
    if ((j | i | i1 | i2 | i3) != 0) {
      paramMotionLayout.setOnClickListener(this);
    }
  }
  
  public boolean isTransitionViable(MotionScene.Transition paramTransition, MotionLayout paramMotionLayout)
  {
    MotionScene.Transition localTransition = mTransition;
    boolean bool1 = true;
    boolean bool2 = true;
    if (localTransition == paramTransition) {
      return true;
    }
    int i = MotionScene.Transition.access$000(localTransition);
    int j = MotionScene.Transition.access$100(mTransition);
    if (j == -1)
    {
      if (mCurrentState == i) {
        bool2 = false;
      }
      return bool2;
    }
    int k = mCurrentState;
    bool2 = bool1;
    if (k != j) {
      if (k == i) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public void onClick(View paramView)
  {
    paramView = MotionScene.access$700(MotionScene.Transition.access$800(mTransition));
    if (!paramView.isInteractionEnabled()) {
      return;
    }
    MotionScene.Transition localTransition1;
    if (MotionScene.Transition.access$100(mTransition) == -1)
    {
      i = paramView.getCurrentState();
      if (i == -1)
      {
        paramView.transitionToState(MotionScene.Transition.access$000(mTransition));
        return;
      }
      localTransition1 = new MotionScene.Transition(MotionScene.Transition.access$800(mTransition), mTransition);
      MotionScene.Transition.access$102(localTransition1, i);
      MotionScene.Transition.access$002(localTransition1, MotionScene.Transition.access$000(mTransition));
      paramView.setTransition(localTransition1);
      paramView.transitionToEnd();
      return;
    }
    MotionScene.Transition localTransition2 = access$800mTransition).mCurrentTransition;
    int i = mMode;
    int j = 0;
    int k;
    if (((i & 0x1) == 0) && ((i & 0x100) == 0)) {
      k = 0;
    } else {
      k = 1;
    }
    if (((i & 0x10) == 0) && ((i & 0x1000) == 0)) {
      i = 0;
    } else {
      i = 1;
    }
    int m;
    if ((k != 0) && (i != 0)) {
      m = 1;
    } else {
      m = 0;
    }
    int n = i;
    if (m != 0)
    {
      MotionScene.Transition localTransition3 = access$800mTransition).mCurrentTransition;
      localTransition1 = mTransition;
      if (localTransition3 != localTransition1) {
        paramView.setTransition(localTransition1);
      }
      n = i;
      m = j;
      if (paramView.getCurrentState() != paramView.getEndState()) {
        if (paramView.getProgress() > 0.5F)
        {
          n = i;
          m = j;
        }
        else
        {
          n = 0;
        }
      }
    }
    else
    {
      m = k;
    }
    if (isTransitionViable(localTransition2, paramView)) {
      if ((m != 0) && ((mMode & 0x1) != 0))
      {
        paramView.setTransition(mTransition);
        paramView.transitionToEnd();
      }
      else if ((n != 0) && ((mMode & 0x10) != 0))
      {
        paramView.setTransition(mTransition);
        paramView.transitionToStart();
      }
      else if ((m != 0) && ((mMode & 0x100) != 0))
      {
        paramView.setTransition(mTransition);
        paramView.setProgress(1.0F);
      }
      else if ((n != 0) && ((mMode & 0x1000) != 0))
      {
        paramView.setTransition(mTransition);
        paramView.setProgress(0.0F);
      }
    }
  }
  
  public void removeOnClickListeners(MotionLayout paramMotionLayout)
  {
    int i = mTargetId;
    if (i == -1) {
      return;
    }
    paramMotionLayout = paramMotionLayout.findViewById(i);
    if (paramMotionLayout == null)
    {
      paramMotionLayout = z2.t(" (*)  could not find id ");
      paramMotionLayout.append(mTargetId);
      Log.e("MotionScene", paramMotionLayout.toString());
      return;
    }
    paramMotionLayout.setOnClickListener(null);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */