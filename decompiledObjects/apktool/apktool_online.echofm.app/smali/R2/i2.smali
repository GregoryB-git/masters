.class public final LR2/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final o:LR2/e2;

.field public final p:I

.field public final q:Ljava/lang/Throwable;

.field public final r:[B

.field public final s:Ljava/lang/String;

.field public final t:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, LR2/i2;->o:LR2/e2;

    iput p3, p0, LR2/i2;->p:I

    iput-object p4, p0, LR2/i2;->q:Ljava/lang/Throwable;

    iput-object p5, p0, LR2/i2;->r:[B

    iput-object p1, p0, LR2/i2;->s:Ljava/lang/String;

    iput-object p6, p0, LR2/i2;->t:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;LR2/g2;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p6}, LR2/i2;-><init>(Ljava/lang/String;LR2/e2;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, LR2/i2;->o:LR2/e2;

    .line 2
    .line 3
    iget-object v1, p0, LR2/i2;->s:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, LR2/i2;->p:I

    .line 6
    .line 7
    iget-object v3, p0, LR2/i2;->q:Ljava/lang/Throwable;

    .line 8
    .line 9
    iget-object v4, p0, LR2/i2;->r:[B

    .line 10
    .line 11
    iget-object v5, p0, LR2/i2;->t:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface/range {v0 .. v5}, LR2/e2;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
