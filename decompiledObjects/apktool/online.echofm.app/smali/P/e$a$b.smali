.class public final LP/e$a$b;
.super LZ5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/e$a;->c(Ljava/util/List;LP/i;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LP/e$a;

.field public s:I


# direct methods
.method public constructor <init>(LP/e$a;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/e$a$b;->r:LP/e$a;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LZ5/d;-><init>(LX5/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LP/e$a$b;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LP/e$a$b;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LP/e$a$b;->s:I

    .line 9
    .line 10
    iget-object p1, p0, LP/e$a$b;->r:LP/e$a;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, v0, p0}, LP/e$a;->a(LP/e$a;Ljava/util/List;LP/i;LX5/d;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
