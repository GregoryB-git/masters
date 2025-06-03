package androidx.fragment.app;

class FragmentAnim$2$1
  implements Runnable
{
  public FragmentAnim$2$1(FragmentAnim.2 param2) {}
  
  public void run()
  {
    if (this$0.val$fragment.getAnimatingAway() != null)
    {
      this$0.val$fragment.setAnimatingAway(null);
      FragmentAnim.2 local2 = this$0;
      val$callback.onComplete(val$fragment, val$signal);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentAnim.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */