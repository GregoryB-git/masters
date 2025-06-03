.class public LV2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV2/K;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LV2/K;

    .line 5
    .line 6
    invoke-direct {v0}, LV2/K;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LV2/k;->a:LV2/K;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()LV2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LV2/k;->a:LV2/K;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, LV2/k;->a:LV2/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV2/K;->q(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LV2/k;->a:LV2/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV2/K;->r(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LV2/k;->a:LV2/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV2/K;->t(Ljava/lang/Exception;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LV2/k;->a:LV2/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV2/K;->u(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
