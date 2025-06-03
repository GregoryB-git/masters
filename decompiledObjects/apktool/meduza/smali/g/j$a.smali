.class public final Lg/j$a;
.super Le0/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg/j;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lg/j;


# direct methods
.method public constructor <init>(Lg/j;)V
    .locals 0

    iput-object p1, p0, Lg/j$a;->b:Lg/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le0/q0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lg/j$a;->b:Lg/j;

    iget-object v0, v0, Lg/j;->a:Lg/g;

    iget-object v0, v0, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lg/j$a;->b:Lg/j;

    iget-object v0, v0, Lg/j;->a:Lg/g;

    iget-object v0, v0, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lg/j$a;->b:Lg/j;

    iget-object v0, v0, Lg/j;->a:Lg/g;

    iget-object v0, v0, Lg/g;->G:Le0/o0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le0/o0;->d(Le0/p0;)V

    iget-object v0, p0, Lg/j$a;->b:Lg/j;

    iget-object v0, v0, Lg/j;->a:Lg/g;

    iput-object v1, v0, Lg/g;->G:Le0/o0;

    return-void
.end method
