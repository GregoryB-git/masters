.class public final LR2/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:J

.field public final synthetic p:LR2/B;


# direct methods
.method public constructor <init>(LR2/B;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/d0;->p:LR2/B;

    .line 2
    .line 3
    iput-wide p2, p0, LR2/d0;->o:J

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
    iget-object v0, p0, LR2/d0;->p:LR2/B;

    .line 2
    .line 3
    iget-wide v1, p0, LR2/d0;->o:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, LR2/B;->x(LR2/B;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
