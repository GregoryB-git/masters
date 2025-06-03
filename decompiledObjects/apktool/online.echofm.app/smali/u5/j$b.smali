.class public Lu5/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu5/j;->j(Lu5/D;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lu5/D;

.field public final synthetic p:Lu5/j;


# direct methods
.method public constructor <init>(Lu5/j;Lu5/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu5/j$b;->p:Lu5/j;

    .line 2
    .line 3
    iput-object p2, p0, Lu5/j$b;->o:Lu5/D;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/j$b;->p:Lu5/j;

    .line 2
    .line 3
    invoke-static {v0}, Lu5/j;->b(Lu5/j;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lu5/j$b;->p:Lu5/j;

    .line 10
    .line 11
    iget-object v0, v0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lu5/j$b;->o:Lu5/D;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lu5/j$b;->p:Lu5/j;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, v0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lu5/j$b;->p:Lu5/j;

    .line 30
    .line 31
    invoke-static {v0}, Lu5/j;->b(Lu5/j;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    return v0
.end method
