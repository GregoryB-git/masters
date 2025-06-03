.class public Lio/flutter/view/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/view/i;


# direct methods
.method public constructor <init>(Lio/flutter/view/i;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccessibilityStateChanged(Z)V
    .locals 2

    iget-object v0, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v0}, Lio/flutter/view/i;->k(Lio/flutter/view/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    if-eqz p1, :cond_1

    invoke-static {v0}, Lio/flutter/view/i;->m(Lio/flutter/view/i;)LD5/a;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v1}, Lio/flutter/view/i;->l(Lio/flutter/view/i;)LD5/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, LD5/a;->g(LD5/a$b;)V

    iget-object v0, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v0}, Lio/flutter/view/i;->m(Lio/flutter/view/i;)LD5/a;

    move-result-object v0

    invoke-virtual {v0}, LD5/a;->e()V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/flutter/view/i;->n(Lio/flutter/view/i;Z)V

    iget-object v0, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v0}, Lio/flutter/view/i;->m(Lio/flutter/view/i;)LD5/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LD5/a;->g(LD5/a$b;)V

    iget-object v0, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v0}, Lio/flutter/view/i;->m(Lio/flutter/view/i;)LD5/a;

    move-result-object v0

    invoke-virtual {v0}, LD5/a;->d()V

    :goto_0
    iget-object v0, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v0}, Lio/flutter/view/i;->s(Lio/flutter/view/i;)Lio/flutter/view/i$k;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v0}, Lio/flutter/view/i;->s(Lio/flutter/view/i;)Lio/flutter/view/i$k;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/i$b;->a:Lio/flutter/view/i;

    invoke-static {v1}, Lio/flutter/view/i;->t(Lio/flutter/view/i;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v1

    invoke-interface {v0, p1, v1}, Lio/flutter/view/i$k;->a(ZZ)V

    :cond_2
    return-void
.end method
