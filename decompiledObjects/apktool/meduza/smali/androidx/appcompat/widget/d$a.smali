.class public final Landroidx/appcompat/widget/d$a;
.super Le0/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/d;->o(IJ)Le0/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:Z

.field public final synthetic c:I

.field public final synthetic d:Landroidx/appcompat/widget/d;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/d;I)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/d$a;->d:Landroidx/appcompat/widget/d;

    iput p2, p0, Landroidx/appcompat/widget/d$a;->c:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le0/q0;-><init>(I)V

    iput-boolean p1, p0, Landroidx/appcompat/widget/d$a;->b:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/d$a;->b:Z

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/d$a;->d:Landroidx/appcompat/widget/d;

    iget-object v0, v0, Landroidx/appcompat/widget/d;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/d$a;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/d$a;->d:Landroidx/appcompat/widget/d;

    iget-object v0, v0, Landroidx/appcompat/widget/d;->a:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, Landroidx/appcompat/widget/d$a;->c:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
