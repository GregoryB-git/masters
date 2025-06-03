.class public final Lh/a$b;
.super Lh/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public I:Lr/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/e<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public J:Lr/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/i<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/a$b;Lh/a;Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh/d$a;-><init>(Lh/d$a;Lh/d;Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    iget-object p2, p1, Lh/a$b;->I:Lr/e;

    iput-object p2, p0, Lh/a$b;->I:Lr/e;

    iget-object p1, p1, Lh/a$b;->J:Lr/i;

    goto :goto_0

    :cond_0
    new-instance p1, Lr/e;

    invoke-direct {p1}, Lr/e;-><init>()V

    iput-object p1, p0, Lh/a$b;->I:Lr/e;

    new-instance p1, Lr/i;

    invoke-direct {p1}, Lr/i;-><init>()V

    :goto_0
    iput-object p1, p0, Lh/a$b;->J:Lr/i;

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 1

    iget-object v0, p0, Lh/a$b;->I:Lr/e;

    invoke-virtual {v0}, Lr/e;->b()Lr/e;

    move-result-object v0

    iput-object v0, p0, Lh/a$b;->I:Lr/e;

    iget-object v0, p0, Lh/a$b;->J:Lr/i;

    invoke-virtual {v0}, Lr/i;->b()Lr/i;

    move-result-object v0

    iput-object v0, p0, Lh/a$b;->J:Lr/i;

    return-void
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lh/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lh/a;-><init>(Lh/a$b;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lh/a;

    invoke-direct {v0, p0, p1}, Lh/a;-><init>(Lh/a$b;Landroid/content/res/Resources;)V

    return-object v0
.end method
