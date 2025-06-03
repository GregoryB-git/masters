.class public final Le0/n0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le0/p0;


# direct methods
.method public constructor <init>(Le0/p0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Le0/n0;->a:Le0/p0;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Le0/n0;->a:Le0/p0;

    invoke-interface {p1}, Le0/p0;->a()V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Le0/n0;->a:Le0/p0;

    invoke-interface {p1}, Le0/p0;->c()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Le0/n0;->a:Le0/p0;

    invoke-interface {p1}, Le0/p0;->b()V

    return-void
.end method
