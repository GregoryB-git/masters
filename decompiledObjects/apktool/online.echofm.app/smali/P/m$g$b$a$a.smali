.class public final LP/m$g$b$a$a;
.super LZ5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/m$g$b$a;->emit(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public synthetic o:Ljava/lang/Object;

.field public p:I

.field public final synthetic q:LP/m$g$b$a;


# direct methods
.method public constructor <init>(LP/m$g$b$a;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/m$g$b$a$a;->q:LP/m$g$b$a;

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
    iput-object p1, p0, LP/m$g$b$a$a;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LP/m$g$b$a$a;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LP/m$g$b$a$a;->p:I

    .line 9
    .line 10
    iget-object p1, p0, LP/m$g$b$a$a;->q:LP/m$g$b$a;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LP/m$g$b$a;->emit(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
