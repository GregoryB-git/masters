.class public final Ly1/e$b;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly1/e;->startScaleUpAnimation(Landroid/view/animation/Animation$AnimationListener;)V
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

    iput-object p1, p0, Ly1/e$b;->a:Ly1/e;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 0

    iget-object p2, p0, Ly1/e$b;->a:Ly1/e;

    invoke-virtual {p2, p1}, Ly1/e;->setAnimationProgress(F)V

    return-void
.end method
