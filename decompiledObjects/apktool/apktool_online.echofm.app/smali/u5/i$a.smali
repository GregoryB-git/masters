.class public Lu5/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu5/i;->K()Landroid/window/OnBackInvokedCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu5/i;


# direct methods
.method public constructor <init>(Lu5/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu5/i$a;->a:Lu5/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/i$a;->a:Lu5/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu5/i;->F()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/i$a;->a:Lu5/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu5/i;->G()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/i$a;->a:Lu5/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu5/i;->V(Landroid/window/BackEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/i$a;->a:Lu5/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu5/i;->R(Landroid/window/BackEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
