package androidx.recyclerview.widget;

import a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2;

public class DefaultItemAnimator
  extends SimpleItemAnimator
{
  private static final boolean DEBUG = false;
  private static TimeInterpolator sDefaultInterpolator;
  public ArrayList<RecyclerView.ViewHolder> mAddAnimations = new ArrayList();
  public ArrayList<ArrayList<RecyclerView.ViewHolder>> mAdditionsList = new ArrayList();
  public ArrayList<RecyclerView.ViewHolder> mChangeAnimations = new ArrayList();
  public ArrayList<ArrayList<ChangeInfo>> mChangesList = new ArrayList();
  public ArrayList<RecyclerView.ViewHolder> mMoveAnimations = new ArrayList();
  public ArrayList<ArrayList<MoveInfo>> mMovesList = new ArrayList();
  private ArrayList<RecyclerView.ViewHolder> mPendingAdditions = new ArrayList();
  private ArrayList<ChangeInfo> mPendingChanges = new ArrayList();
  private ArrayList<MoveInfo> mPendingMoves = new ArrayList();
  private ArrayList<RecyclerView.ViewHolder> mPendingRemovals = new ArrayList();
  public ArrayList<RecyclerView.ViewHolder> mRemoveAnimations = new ArrayList();
  
  private void animateRemoveImpl(final RecyclerView.ViewHolder paramViewHolder)
  {
    final View localView = itemView;
    final ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    mRemoveAnimations.add(paramViewHolder);
    localViewPropertyAnimator.setDuration(getRemoveDuration()).alpha(0.0F).setListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        localViewPropertyAnimator.setListener(null);
        localView.setAlpha(1.0F);
        dispatchRemoveFinished(paramViewHolder);
        mRemoveAnimations.remove(paramViewHolder);
        dispatchFinishedWhenDone();
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        dispatchRemoveStarting(paramViewHolder);
      }
    }).start();
  }
  
  private void endChangeAnimation(List<ChangeInfo> paramList, RecyclerView.ViewHolder paramViewHolder)
  {
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      ChangeInfo localChangeInfo = (ChangeInfo)paramList.get(i);
      if ((endChangeAnimationIfNecessary(localChangeInfo, paramViewHolder)) && (oldHolder == null) && (newHolder == null)) {
        paramList.remove(localChangeInfo);
      }
    }
  }
  
  private void endChangeAnimationIfNecessary(ChangeInfo paramChangeInfo)
  {
    RecyclerView.ViewHolder localViewHolder = oldHolder;
    if (localViewHolder != null) {
      endChangeAnimationIfNecessary(paramChangeInfo, localViewHolder);
    }
    localViewHolder = newHolder;
    if (localViewHolder != null) {
      endChangeAnimationIfNecessary(paramChangeInfo, localViewHolder);
    }
  }
  
  private boolean endChangeAnimationIfNecessary(ChangeInfo paramChangeInfo, RecyclerView.ViewHolder paramViewHolder)
  {
    RecyclerView.ViewHolder localViewHolder = newHolder;
    boolean bool = false;
    if (localViewHolder == paramViewHolder)
    {
      newHolder = null;
    }
    else
    {
      if (oldHolder != paramViewHolder) {
        break label70;
      }
      oldHolder = null;
      bool = true;
    }
    itemView.setAlpha(1.0F);
    itemView.setTranslationX(0.0F);
    itemView.setTranslationY(0.0F);
    dispatchChangeFinished(paramViewHolder, bool);
    return true;
    label70:
    return false;
  }
  
  private void resetAnimation(RecyclerView.ViewHolder paramViewHolder)
  {
    if (sDefaultInterpolator == null) {
      sDefaultInterpolator = new ValueAnimator().getInterpolator();
    }
    itemView.animate().setInterpolator(sDefaultInterpolator);
    endAnimation(paramViewHolder);
  }
  
  public boolean animateAdd(RecyclerView.ViewHolder paramViewHolder)
  {
    resetAnimation(paramViewHolder);
    itemView.setAlpha(0.0F);
    mPendingAdditions.add(paramViewHolder);
    return true;
  }
  
  public void animateAddImpl(final RecyclerView.ViewHolder paramViewHolder)
  {
    final View localView = itemView;
    final ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    mAddAnimations.add(paramViewHolder);
    localViewPropertyAnimator.alpha(1.0F).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        localView.setAlpha(1.0F);
      }
      
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        localViewPropertyAnimator.setListener(null);
        dispatchAddFinished(paramViewHolder);
        mAddAnimations.remove(paramViewHolder);
        dispatchFinishedWhenDone();
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        dispatchAddStarting(paramViewHolder);
      }
    }).start();
  }
  
  public boolean animateChange(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramViewHolder1 == paramViewHolder2) {
      return animateMove(paramViewHolder1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = itemView.getTranslationX();
    float f2 = itemView.getTranslationY();
    float f3 = itemView.getAlpha();
    resetAnimation(paramViewHolder1);
    int i = (int)(paramInt3 - paramInt1 - f1);
    int j = (int)(paramInt4 - paramInt2 - f2);
    itemView.setTranslationX(f1);
    itemView.setTranslationY(f2);
    itemView.setAlpha(f3);
    if (paramViewHolder2 != null)
    {
      resetAnimation(paramViewHolder2);
      itemView.setTranslationX(-i);
      itemView.setTranslationY(-j);
      itemView.setAlpha(0.0F);
    }
    mPendingChanges.add(new ChangeInfo(paramViewHolder1, paramViewHolder2, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public void animateChangeImpl(final ChangeInfo paramChangeInfo)
  {
    final Object localObject1 = oldHolder;
    final View localView = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = itemView;
    }
    final Object localObject2 = newHolder;
    if (localObject2 != null) {
      localView = itemView;
    }
    if (localObject1 != null)
    {
      localObject2 = ((View)localObject1).animate().setDuration(getChangeDuration());
      mChangeAnimations.add(oldHolder);
      ((ViewPropertyAnimator)localObject2).translationX(toX - fromX);
      ((ViewPropertyAnimator)localObject2).translationY(toY - fromY);
      ((ViewPropertyAnimator)localObject2).alpha(0.0F).setListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          localObject2.setListener(null);
          localObject1.setAlpha(1.0F);
          localObject1.setTranslationX(0.0F);
          localObject1.setTranslationY(0.0F);
          dispatchChangeFinished(paramChangeInfooldHolder, true);
          mChangeAnimations.remove(paramChangeInfooldHolder);
          dispatchFinishedWhenDone();
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          dispatchChangeStarting(paramChangeInfooldHolder, true);
        }
      }).start();
    }
    if (localView != null)
    {
      localObject1 = localView.animate();
      mChangeAnimations.add(newHolder);
      ((ViewPropertyAnimator)localObject1).translationX(0.0F).translationY(0.0F).setDuration(getChangeDuration()).alpha(1.0F).setListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          localObject1.setListener(null);
          localView.setAlpha(1.0F);
          localView.setTranslationX(0.0F);
          localView.setTranslationY(0.0F);
          dispatchChangeFinished(paramChangeInfonewHolder, false);
          mChangeAnimations.remove(paramChangeInfonewHolder);
          dispatchFinishedWhenDone();
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          dispatchChangeStarting(paramChangeInfonewHolder, false);
        }
      }).start();
    }
  }
  
  public boolean animateMove(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = itemView;
    paramInt1 += (int)localView.getTranslationX();
    int i = paramInt2 + (int)itemView.getTranslationY();
    resetAnimation(paramViewHolder);
    paramInt2 = paramInt3 - paramInt1;
    int j = paramInt4 - i;
    if ((paramInt2 == 0) && (j == 0))
    {
      dispatchMoveFinished(paramViewHolder);
      return false;
    }
    if (paramInt2 != 0) {
      localView.setTranslationX(-paramInt2);
    }
    if (j != 0) {
      localView.setTranslationY(-j);
    }
    mPendingMoves.add(new MoveInfo(paramViewHolder, paramInt1, i, paramInt3, paramInt4));
    return true;
  }
  
  public void animateMoveImpl(final RecyclerView.ViewHolder paramViewHolder, final int paramInt1, final int paramInt2, int paramInt3, int paramInt4)
  {
    final View localView = itemView;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0) {
      localView.animate().translationX(0.0F);
    }
    if (paramInt2 != 0) {
      localView.animate().translationY(0.0F);
    }
    final ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    mMoveAnimations.add(paramViewHolder);
    localViewPropertyAnimator.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        if (paramInt1 != 0) {
          localView.setTranslationX(0.0F);
        }
        if (paramInt2 != 0) {
          localView.setTranslationY(0.0F);
        }
      }
      
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        localViewPropertyAnimator.setListener(null);
        dispatchMoveFinished(paramViewHolder);
        mMoveAnimations.remove(paramViewHolder);
        dispatchFinishedWhenDone();
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        dispatchMoveStarting(paramViewHolder);
      }
    }).start();
  }
  
  public boolean animateRemove(RecyclerView.ViewHolder paramViewHolder)
  {
    resetAnimation(paramViewHolder);
    mPendingRemovals.add(paramViewHolder);
    return true;
  }
  
  public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull List<Object> paramList)
  {
    boolean bool;
    if ((paramList.isEmpty()) && (!super.canReuseUpdatedViewHolder(paramViewHolder, paramList))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void cancelAll(List<RecyclerView.ViewHolder> paramList)
  {
    for (int i = paramList.size() - 1; i >= 0; i--) {
      getitemView.animate().cancel();
    }
  }
  
  public void dispatchFinishedWhenDone()
  {
    if (!isRunning()) {
      dispatchAnimationsFinished();
    }
  }
  
  public void endAnimation(RecyclerView.ViewHolder paramViewHolder)
  {
    View localView = itemView;
    localView.animate().cancel();
    for (int i = mPendingMoves.size() - 1; i >= 0; i--) {
      if (mPendingMoves.get(i)).holder == paramViewHolder)
      {
        localView.setTranslationY(0.0F);
        localView.setTranslationX(0.0F);
        dispatchMoveFinished(paramViewHolder);
        mPendingMoves.remove(i);
      }
    }
    endChangeAnimation(mPendingChanges, paramViewHolder);
    if (mPendingRemovals.remove(paramViewHolder))
    {
      localView.setAlpha(1.0F);
      dispatchRemoveFinished(paramViewHolder);
    }
    if (mPendingAdditions.remove(paramViewHolder))
    {
      localView.setAlpha(1.0F);
      dispatchAddFinished(paramViewHolder);
    }
    ArrayList localArrayList;
    for (i = mChangesList.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)mChangesList.get(i);
      endChangeAnimation(localArrayList, paramViewHolder);
      if (localArrayList.isEmpty()) {
        mChangesList.remove(i);
      }
    }
    for (i = mMovesList.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)mMovesList.get(i);
      for (int j = localArrayList.size() - 1; j >= 0; j--) {
        if (getholder == paramViewHolder)
        {
          localView.setTranslationY(0.0F);
          localView.setTranslationX(0.0F);
          dispatchMoveFinished(paramViewHolder);
          localArrayList.remove(j);
          if (!localArrayList.isEmpty()) {
            break;
          }
          mMovesList.remove(i);
          break;
        }
      }
    }
    for (i = mAdditionsList.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)mAdditionsList.get(i);
      if (localArrayList.remove(paramViewHolder))
      {
        localView.setAlpha(1.0F);
        dispatchAddFinished(paramViewHolder);
        if (localArrayList.isEmpty()) {
          mAdditionsList.remove(i);
        }
      }
    }
    mRemoveAnimations.remove(paramViewHolder);
    mAddAnimations.remove(paramViewHolder);
    mChangeAnimations.remove(paramViewHolder);
    mMoveAnimations.remove(paramViewHolder);
    dispatchFinishedWhenDone();
  }
  
  public void endAnimations()
  {
    Object localObject1;
    Object localObject2;
    for (int i = mPendingMoves.size() - 1; i >= 0; i--)
    {
      localObject1 = (MoveInfo)mPendingMoves.get(i);
      localObject2 = holder.itemView;
      ((View)localObject2).setTranslationY(0.0F);
      ((View)localObject2).setTranslationX(0.0F);
      dispatchMoveFinished(holder);
      mPendingMoves.remove(i);
    }
    for (i = mPendingRemovals.size() - 1; i >= 0; i--)
    {
      dispatchRemoveFinished((RecyclerView.ViewHolder)mPendingRemovals.get(i));
      mPendingRemovals.remove(i);
    }
    for (i = mPendingAdditions.size() - 1; i >= 0; i--)
    {
      localObject1 = (RecyclerView.ViewHolder)mPendingAdditions.get(i);
      itemView.setAlpha(1.0F);
      dispatchAddFinished((RecyclerView.ViewHolder)localObject1);
      mPendingAdditions.remove(i);
    }
    for (i = mPendingChanges.size() - 1; i >= 0; i--) {
      endChangeAnimationIfNecessary((ChangeInfo)mPendingChanges.get(i));
    }
    mPendingChanges.clear();
    if (!isRunning()) {
      return;
    }
    int j;
    for (i = mMovesList.size() - 1; i >= 0; i--)
    {
      localObject2 = (ArrayList)mMovesList.get(i);
      for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--)
      {
        MoveInfo localMoveInfo = (MoveInfo)((ArrayList)localObject2).get(j);
        localObject1 = holder.itemView;
        ((View)localObject1).setTranslationY(0.0F);
        ((View)localObject1).setTranslationX(0.0F);
        dispatchMoveFinished(holder);
        ((ArrayList)localObject2).remove(j);
        if (((ArrayList)localObject2).isEmpty()) {
          mMovesList.remove(localObject2);
        }
      }
    }
    for (i = mAdditionsList.size() - 1; i >= 0; i--)
    {
      localObject2 = (ArrayList)mAdditionsList.get(i);
      for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--)
      {
        localObject1 = (RecyclerView.ViewHolder)((ArrayList)localObject2).get(j);
        itemView.setAlpha(1.0F);
        dispatchAddFinished((RecyclerView.ViewHolder)localObject1);
        ((ArrayList)localObject2).remove(j);
        if (((ArrayList)localObject2).isEmpty()) {
          mAdditionsList.remove(localObject2);
        }
      }
    }
    for (i = mChangesList.size() - 1; i >= 0; i--)
    {
      localObject1 = (ArrayList)mChangesList.get(i);
      for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
      {
        endChangeAnimationIfNecessary((ChangeInfo)((ArrayList)localObject1).get(j));
        if (((ArrayList)localObject1).isEmpty()) {
          mChangesList.remove(localObject1);
        }
      }
    }
    cancelAll(mRemoveAnimations);
    cancelAll(mMoveAnimations);
    cancelAll(mAddAnimations);
    cancelAll(mChangeAnimations);
    dispatchAnimationsFinished();
  }
  
  public boolean isRunning()
  {
    boolean bool;
    if ((mPendingAdditions.isEmpty()) && (mPendingChanges.isEmpty()) && (mPendingMoves.isEmpty()) && (mPendingRemovals.isEmpty()) && (mMoveAnimations.isEmpty()) && (mRemoveAnimations.isEmpty()) && (mAddAnimations.isEmpty()) && (mChangeAnimations.isEmpty()) && (mMovesList.isEmpty()) && (mAdditionsList.isEmpty()) && (mChangesList.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void runPendingAnimations()
  {
    boolean bool1 = mPendingRemovals.isEmpty() ^ true;
    boolean bool2 = mPendingMoves.isEmpty() ^ true;
    boolean bool3 = mPendingChanges.isEmpty() ^ true;
    boolean bool4 = mPendingAdditions.isEmpty() ^ true;
    if ((!bool1) && (!bool2) && (!bool4) && (!bool3)) {
      return;
    }
    final Object localObject1 = mPendingRemovals.iterator();
    while (((Iterator)localObject1).hasNext()) {
      animateRemoveImpl((RecyclerView.ViewHolder)((Iterator)localObject1).next());
    }
    mPendingRemovals.clear();
    final Object localObject2;
    if (bool2)
    {
      localObject2 = new ArrayList();
      ((ArrayList)localObject2).addAll(mPendingMoves);
      mMovesList.add(localObject2);
      mPendingMoves.clear();
      localObject1 = new Runnable()
      {
        public void run()
        {
          Iterator localIterator = localObject2.iterator();
          while (localIterator.hasNext())
          {
            DefaultItemAnimator.MoveInfo localMoveInfo = (DefaultItemAnimator.MoveInfo)localIterator.next();
            animateMoveImpl(holder, fromX, fromY, toX, toY);
          }
          localObject2.clear();
          mMovesList.remove(localObject2);
        }
      };
      if (bool1) {
        ViewCompat.postOnAnimationDelayed(get0holder.itemView, (Runnable)localObject1, getRemoveDuration());
      } else {
        ((Runnable)localObject1).run();
      }
    }
    if (bool3)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(mPendingChanges);
      mChangesList.add(localObject1);
      mPendingChanges.clear();
      localObject2 = new Runnable()
      {
        public void run()
        {
          Iterator localIterator = localObject1.iterator();
          while (localIterator.hasNext())
          {
            DefaultItemAnimator.ChangeInfo localChangeInfo = (DefaultItemAnimator.ChangeInfo)localIterator.next();
            animateChangeImpl(localChangeInfo);
          }
          localObject1.clear();
          mChangesList.remove(localObject1);
        }
      };
      if (bool1) {
        ViewCompat.postOnAnimationDelayed(get0oldHolder.itemView, (Runnable)localObject2, getRemoveDuration());
      } else {
        ((Runnable)localObject2).run();
      }
    }
    if (bool4)
    {
      localObject2 = new ArrayList();
      ((ArrayList)localObject2).addAll(mPendingAdditions);
      mAdditionsList.add(localObject2);
      mPendingAdditions.clear();
      localObject1 = new Runnable()
      {
        public void run()
        {
          Iterator localIterator = localObject2.iterator();
          while (localIterator.hasNext())
          {
            RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)localIterator.next();
            animateAddImpl(localViewHolder);
          }
          localObject2.clear();
          mAdditionsList.remove(localObject2);
        }
      };
      if ((!bool1) && (!bool2) && (!bool3))
      {
        ((Runnable)localObject1).run();
      }
      else
      {
        long l1 = 0L;
        long l2;
        if (bool1) {
          l2 = getRemoveDuration();
        } else {
          l2 = 0L;
        }
        if (bool2) {
          l3 = getMoveDuration();
        } else {
          l3 = 0L;
        }
        if (bool3) {
          l1 = getChangeDuration();
        }
        long l3 = Math.max(l3, l1);
        ViewCompat.postOnAnimationDelayed(get0itemView, (Runnable)localObject1, l3 + l2);
      }
    }
  }
  
  public static class ChangeInfo
  {
    public int fromX;
    public int fromY;
    public RecyclerView.ViewHolder newHolder;
    public RecyclerView.ViewHolder oldHolder;
    public int toX;
    public int toY;
    
    private ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
    {
      oldHolder = paramViewHolder1;
      newHolder = paramViewHolder2;
    }
    
    public ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this(paramViewHolder1, paramViewHolder2);
      fromX = paramInt1;
      fromY = paramInt2;
      toX = paramInt3;
      toY = paramInt4;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("ChangeInfo{oldHolder=");
      localStringBuilder.append(oldHolder);
      localStringBuilder.append(", newHolder=");
      localStringBuilder.append(newHolder);
      localStringBuilder.append(", fromX=");
      localStringBuilder.append(fromX);
      localStringBuilder.append(", fromY=");
      localStringBuilder.append(fromY);
      localStringBuilder.append(", toX=");
      localStringBuilder.append(toX);
      localStringBuilder.append(", toY=");
      return a.n(localStringBuilder, toY, '}');
    }
  }
  
  public static class MoveInfo
  {
    public int fromX;
    public int fromY;
    public RecyclerView.ViewHolder holder;
    public int toX;
    public int toY;
    
    public MoveInfo(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      holder = paramViewHolder;
      fromX = paramInt1;
      fromY = paramInt2;
      toX = paramInt3;
      toY = paramInt4;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */