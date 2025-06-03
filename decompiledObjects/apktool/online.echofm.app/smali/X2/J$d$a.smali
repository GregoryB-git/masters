.class public LX2/J$d$a;
.super LX2/J$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX2/J$d;->b(I)LX2/J$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX2/J$d;


# direct methods
.method public constructor <init>(LX2/J$d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LX2/J$d$a;->b:LX2/J$d;

    .line 2
    .line 3
    iput p2, p0, LX2/J$d$a;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, LX2/J$c;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c()LX2/D;
    .locals 3

    .line 1
    iget-object v0, p0, LX2/J$d$a;->b:LX2/J$d;

    .line 2
    .line 3
    invoke-virtual {v0}, LX2/J$d;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LX2/J$b;

    .line 8
    .line 9
    iget v2, p0, LX2/J$d$a;->a:I

    .line 10
    .line 11
    invoke-direct {v1, v2}, LX2/J$b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, LX2/K;->b(Ljava/util/Map;LW2/s;)LX2/D;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method
