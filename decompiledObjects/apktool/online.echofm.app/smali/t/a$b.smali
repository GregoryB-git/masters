.class public final Lt/a$b;
.super Lt/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic r:Lt/a;


# direct methods
.method public constructor <init>(Lt/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/a$b;->r:Lt/a;

    .line 2
    .line 3
    iget p1, p1, Lt/h;->q:I

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
    iget-object v0, p0, Lt/a$b;->r:Lt/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/h;->i(I)Ljava/lang/Object;

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
    iget-object v0, p0, Lt/a$b;->r:Lt/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/h;->j(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
