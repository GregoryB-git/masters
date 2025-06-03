.class public final Ly1/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly1/e;


# direct methods
.method public constructor <init>(Ly1/e;)V
    .locals 0

    iput-object p1, p0, Ly1/e$a;->a:Ly1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Ly1/e$a;->a:Ly1/e;

    iget-boolean v0, p1, Ly1/e;->mRefreshing:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Ly1/e;->mProgress:Ly1/d;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Ly1/d;->setAlpha(I)V

    iget-object p1, p0, Ly1/e$a;->a:Ly1/e;

    iget-object p1, p1, Ly1/e;->mProgress:Ly1/d;

    invoke-virtual {p1}, Ly1/d;->start()V

    iget-object p1, p0, Ly1/e$a;->a:Ly1/e;

    iget-boolean v0, p1, Ly1/e;->mNotify:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Ly1/e;->mListener:Ly1/e$j;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ly1/e$j;->onRefresh()V

    :cond_0
    iget-object p1, p0, Ly1/e$a;->a:Ly1/e;

    iget-object v0, p1, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p1, Ly1/e;->mCurrentTargetOffsetTop:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ly1/e;->reset()V

    :goto_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
