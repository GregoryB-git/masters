.class public final Ly1/e$d;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly1/e;->startAlphaAnimation(II)Landroid/view/animation/Animation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ly1/e;


# direct methods
.method public constructor <init>(Ly1/e;II)V
    .locals 0

    iput-object p1, p0, Ly1/e$d;->c:Ly1/e;

    iput p2, p0, Ly1/e$d;->a:I

    iput p3, p0, Ly1/e$d;->b:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    iget-object p2, p0, Ly1/e$d;->c:Ly1/e;

    iget-object p2, p2, Ly1/e;->mProgress:Ly1/d;

    iget v0, p0, Ly1/e$d;->a:I

    int-to-float v1, v0

    iget v2, p0, Ly1/e$d;->b:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    float-to-int p1, v0

    invoke-virtual {p2, p1}, Ly1/d;->setAlpha(I)V

    return-void
.end method
