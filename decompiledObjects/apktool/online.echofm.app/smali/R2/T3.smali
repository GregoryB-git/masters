.class public final LR2/T3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:J

.field public final synthetic s:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/T3;->s:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/T3;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LR2/T3;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LR2/T3;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p5, p0, LR2/T3;->r:J

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, LR2/T3;->s:LR2/C3;

    .line 2
    .line 3
    iget-object v1, p0, LR2/T3;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LR2/T3;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, LR2/T3;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iget-wide v4, p0, LR2/T3;->r:J

    .line 10
    .line 11
    invoke-virtual/range {v0 .. v5}, LR2/C3;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
