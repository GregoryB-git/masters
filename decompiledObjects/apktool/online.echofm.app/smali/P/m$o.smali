.class public final LP/m$o;
.super LZ5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/m;->y(LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LP/m;

.field public s:I


# direct methods
.method public constructor <init>(LP/m;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/m$o;->r:LP/m;

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
    iput-object p1, p0, LP/m$o;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LP/m$o;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LP/m$o;->s:I

    .line 9
    .line 10
    iget-object p1, p0, LP/m$o;->r:LP/m;

    .line 11
    .line 12
    invoke-static {p1, p0}, LP/m;->o(LP/m;LX5/d;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
