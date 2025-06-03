.class public final LX2/v$a;
.super LX2/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    invoke-direct {p0, v0}, LX2/v$a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LX2/t$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LX2/t$b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/v$a;->h(Ljava/lang/Object;)LX2/v$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public h(Ljava/lang/Object;)LX2/v$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LX2/t$a;->d(Ljava/lang/Object;)LX2/t$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public varargs i([Ljava/lang/Object;)LX2/v$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LX2/t$a;->e([Ljava/lang/Object;)LX2/t$b;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public j(Ljava/lang/Iterable;)LX2/v$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LX2/t$a;->b(Ljava/lang/Iterable;)LX2/t$b;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public k()LX2/v;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LX2/t$a;->c:Z

    .line 3
    .line 4
    iget-object v0, p0, LX2/t$a;->a:[Ljava/lang/Object;

    .line 5
    .line 6
    iget v1, p0, LX2/t$a;->b:I

    .line 7
    .line 8
    invoke-static {v0, v1}, LX2/v;->D([Ljava/lang/Object;I)LX2/v;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method
