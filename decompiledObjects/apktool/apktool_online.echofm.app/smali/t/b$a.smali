.class public Lt/b$a;
.super Lt/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic r:Lt/b;


# direct methods
.method public constructor <init>(Lt/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/b$a;->r:Lt/b;

    .line 2
    .line 3
    iget p1, p1, Lt/b;->q:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lt/e;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt/b$a;->r:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/b;->s(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt/b$a;->r:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/b;->q(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
