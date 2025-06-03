.class public final synthetic LB1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LB1/l;

.field public final synthetic p:Ljava/util/TimerTask;


# direct methods
.method public synthetic constructor <init>(LB1/l;Ljava/util/TimerTask;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB1/i;->o:LB1/l;

    .line 5
    .line 6
    iput-object p2, p0, LB1/i;->p:Ljava/util/TimerTask;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/i;->o:LB1/l;

    .line 2
    .line 3
    iget-object v1, p0, LB1/i;->p:Ljava/util/TimerTask;

    .line 4
    .line 5
    invoke-static {v0, v1}, LB1/l;->b(LB1/l;Ljava/util/TimerTask;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
