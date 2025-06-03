.class public final Le2/e$b;
.super Le2/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Le2/k$b;

.field public b:Le2/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le2/k$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Le2/k;
    .locals 4

    .line 1
    new-instance v0, Le2/e;

    .line 2
    .line 3
    iget-object v1, p0, Le2/e$b;->a:Le2/k$b;

    .line 4
    .line 5
    iget-object v2, p0, Le2/e$b;->b:Le2/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Le2/e;-><init>(Le2/k$b;Le2/a;Le2/e$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b(Le2/a;)Le2/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Le2/e$b;->b:Le2/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Le2/k$b;)Le2/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Le2/e$b;->a:Le2/k$b;

    .line 2
    .line 3
    return-object p0
.end method
