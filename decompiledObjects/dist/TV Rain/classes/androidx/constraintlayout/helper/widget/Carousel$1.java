package androidx.constraintlayout.helper.widget;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

class Carousel$1
  implements Runnable
{
  public Carousel$1(Carousel paramCarousel) {}
  
  public void run()
  {
    Carousel.access$000(this$0).setProgress(0.0F);
    Carousel.access$100(this$0);
    Carousel.access$300(this$0).onNewItem(Carousel.access$200(this$0));
    float f1 = Carousel.access$000(this$0).getVelocity();
    if ((Carousel.access$400(this$0) == 2) && (f1 > Carousel.access$500(this$0)) && (Carousel.access$200(this$0) < Carousel.access$300(this$0).count() - 1))
    {
      float f2 = Carousel.access$600(this$0);
      if ((Carousel.access$200(this$0) == 0) && (Carousel.access$700(this$0) > Carousel.access$200(this$0))) {
        return;
      }
      if ((Carousel.access$200(this$0) == Carousel.access$300(this$0).count() - 1) && (Carousel.access$700(this$0) < Carousel.access$200(this$0))) {
        return;
      }
      Carousel.access$000(this$0).post(new Runnable()
      {
        public void run()
        {
          Carousel.access$000(this$0).touchAnimateTo(5, 1.0F, val$v);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.helper.widget.Carousel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */