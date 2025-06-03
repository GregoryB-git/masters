.class public final LR2/o5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:J

.field public final synthetic p:LR2/l5;


# direct methods
.method public constructor <init>(LR2/l5;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/o5;->p:LR2/l5;

    .line 2
    .line 3
    iput-wide p2, p0, LR2/o5;->o:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/o5;->p:LR2/l5;

    .line 2
    .line 3
    iget-wide v1, p0, LR2/o5;->o:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, LR2/l5;->I(LR2/l5;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
