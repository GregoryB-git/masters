.class public final synthetic Lu5/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lu5/K;

.field public final synthetic p:Lu5/M$c;

.field public final synthetic q:J

.field public final synthetic r:Landroid/view/KeyEvent;


# direct methods
.method public synthetic constructor <init>(Lu5/K;Lu5/M$c;JLandroid/view/KeyEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu5/I;->o:Lu5/K;

    .line 5
    .line 6
    iput-object p2, p0, Lu5/I;->p:Lu5/M$c;

    .line 7
    .line 8
    iput-wide p3, p0, Lu5/I;->q:J

    .line 9
    .line 10
    iput-object p5, p0, Lu5/I;->r:Landroid/view/KeyEvent;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lu5/I;->o:Lu5/K;

    .line 2
    .line 3
    iget-object v1, p0, Lu5/I;->p:Lu5/M$c;

    .line 4
    .line 5
    iget-wide v2, p0, Lu5/I;->q:J

    .line 6
    .line 7
    iget-object v4, p0, Lu5/I;->r:Landroid/view/KeyEvent;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Lu5/K;->c(Lu5/K;Lu5/M$c;JLandroid/view/KeyEvent;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
