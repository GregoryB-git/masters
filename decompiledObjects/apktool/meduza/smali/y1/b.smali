.class public final Ly1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Ly1/d$a;

.field public final synthetic b:Ly1/d;


# direct methods
.method public constructor <init>(Ly1/d;Ly1/d$a;)V
    .locals 0

    iput-object p1, p0, Ly1/b;->b:Ly1/d;

    iput-object p2, p0, Ly1/b;->a:Ly1/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Ly1/b;->b:Ly1/d;

    iget-object v1, p0, Ly1/b;->a:Ly1/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, Ly1/d;->c(FLy1/d$a;)V

    iget-object v0, p0, Ly1/b;->b:Ly1/d;

    iget-object v1, p0, Ly1/b;->a:Ly1/d$a;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Ly1/d;->a(FLy1/d$a;Z)V

    iget-object p1, p0, Ly1/b;->b:Ly1/d;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
