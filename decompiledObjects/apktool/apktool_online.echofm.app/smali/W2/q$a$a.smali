.class public LW2/q$a$a;
.super LW2/q$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW2/q$a;->b(LW2/q;Ljava/lang/CharSequence;)LW2/q$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic v:LW2/q$a;


# direct methods
.method public constructor <init>(LW2/q$a;LW2/q;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW2/q$a$a;->v:LW2/q$a;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, LW2/q$b;-><init>(LW2/q;Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public g(I)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    return p1
.end method

.method public h(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LW2/q$a$a;->v:LW2/q$a;

    .line 2
    .line 3
    iget-object v0, v0, LW2/q$a;->a:LW2/d;

    .line 4
    .line 5
    iget-object v1, p0, LW2/q$b;->q:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, LW2/d;->c(Ljava/lang/CharSequence;I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
