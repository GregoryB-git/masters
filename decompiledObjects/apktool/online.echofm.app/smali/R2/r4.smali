.class public final synthetic LR2/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic o:LR2/s4;

.field public synthetic p:I

.field public synthetic q:Ljava/lang/Exception;

.field public synthetic r:[B

.field public synthetic s:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(LR2/s4;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/r4;->o:LR2/s4;

    .line 5
    .line 6
    iput p2, p0, LR2/r4;->p:I

    .line 7
    .line 8
    iput-object p3, p0, LR2/r4;->q:Ljava/lang/Exception;

    .line 9
    .line 10
    iput-object p4, p0, LR2/r4;->r:[B

    .line 11
    .line 12
    iput-object p5, p0, LR2/r4;->s:Ljava/util/Map;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LR2/r4;->o:LR2/s4;

    .line 2
    .line 3
    iget v1, p0, LR2/r4;->p:I

    .line 4
    .line 5
    iget-object v2, p0, LR2/r4;->q:Ljava/lang/Exception;

    .line 6
    .line 7
    iget-object v3, p0, LR2/r4;->r:[B

    .line 8
    .line 9
    iget-object v4, p0, LR2/r4;->s:Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, LR2/s4;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
