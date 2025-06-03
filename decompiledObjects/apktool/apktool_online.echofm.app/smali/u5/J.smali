.class public final synthetic Lu5/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lu5/K;

.field public final synthetic p:Lu5/M$c;

.field public final synthetic q:Landroid/view/KeyEvent;


# direct methods
.method public synthetic constructor <init>(Lu5/K;Lu5/M$c;Landroid/view/KeyEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu5/J;->o:Lu5/K;

    .line 5
    .line 6
    iput-object p2, p0, Lu5/J;->p:Lu5/M$c;

    .line 7
    .line 8
    iput-object p3, p0, Lu5/J;->q:Landroid/view/KeyEvent;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu5/J;->o:Lu5/K;

    .line 2
    .line 3
    iget-object v1, p0, Lu5/J;->p:Lu5/M$c;

    .line 4
    .line 5
    iget-object v2, p0, Lu5/J;->q:Landroid/view/KeyEvent;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lu5/K;->b(Lu5/K;Lu5/M$c;Landroid/view/KeyEvent;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
