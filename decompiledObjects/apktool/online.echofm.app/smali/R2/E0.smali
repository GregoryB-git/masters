.class public final LR2/E0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:J

.field public final synthetic q:LR2/B;


# direct methods
.method public constructor <init>(LR2/B;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/E0;->q:LR2/B;

    .line 2
    .line 3
    iput-object p2, p0, LR2/E0;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, LR2/E0;->p:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/E0;->q:LR2/B;

    .line 2
    .line 3
    iget-object v1, p0, LR2/E0;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, LR2/E0;->p:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, LR2/B;->C(LR2/B;Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
