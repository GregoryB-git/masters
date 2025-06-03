.class public Lio/flutter/plugin/editing/C$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD5/w$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/editing/C;-><init>(Landroid/view/View;LD5/w;Lio/flutter/plugin/platform/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/plugin/editing/C;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/editing/C;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {v0}, Lio/flutter/plugin/editing/C;->b(Lio/flutter/plugin/editing/C;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugin/editing/C;->D(Landroid/view/View;)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/C;->k()V

    return-void
.end method

.method public c(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugin/editing/C;->z(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public d(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {v0, p1, p2}, Lio/flutter/plugin/editing/C;->h(Lio/flutter/plugin/editing/C;IZ)V

    return-void
.end method

.method public e(DD[D)V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lio/flutter/plugin/editing/C;->i(Lio/flutter/plugin/editing/C;DD[D)V

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {v0}, Lio/flutter/plugin/editing/C;->f(Lio/flutter/plugin/editing/C;)V

    return-void
.end method

.method public g(ILD5/w$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/flutter/plugin/editing/C;->B(ILD5/w$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(LD5/w$e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    .line 2
    .line 3
    invoke-static {v0}, Lio/flutter/plugin/editing/C;->b(Lio/flutter/plugin/editing/C;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1, p1}, Lio/flutter/plugin/editing/C;->C(Landroid/view/View;LD5/w$e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {v0}, Lio/flutter/plugin/editing/C;->g(Lio/flutter/plugin/editing/C;)Landroid/view/autofill/AutofillManager;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {p1}, Lio/flutter/plugin/editing/C;->g(Lio/flutter/plugin/editing/C;)Landroid/view/autofill/AutofillManager;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugin/editing/A;->a(Landroid/view/autofill/AutofillManager;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {p1}, Lio/flutter/plugin/editing/C;->g(Lio/flutter/plugin/editing/C;)Landroid/view/autofill/AutofillManager;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugin/editing/B;->a(Landroid/view/autofill/AutofillManager;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {v0}, Lio/flutter/plugin/editing/C;->c(Lio/flutter/plugin/editing/C;)Lio/flutter/plugin/editing/C$c;

    move-result-object v0

    iget-object v0, v0, Lio/flutter/plugin/editing/C$c;->a:Lio/flutter/plugin/editing/C$c$a;

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->r:Lio/flutter/plugin/editing/C$c$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {v0}, Lio/flutter/plugin/editing/C;->d(Lio/flutter/plugin/editing/C;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/C$a;->a:Lio/flutter/plugin/editing/C;

    invoke-static {v0}, Lio/flutter/plugin/editing/C;->b(Lio/flutter/plugin/editing/C;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lio/flutter/plugin/editing/C;->e(Lio/flutter/plugin/editing/C;Landroid/view/View;)V

    :goto_0
    return-void
.end method
