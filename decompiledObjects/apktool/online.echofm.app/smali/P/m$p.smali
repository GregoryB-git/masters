.class public final LP/m$p;
.super LZ5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/m;->z(Lg6/p;LX5/g;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LP/m;

.field public t:I


# direct methods
.method public constructor <init>(LP/m;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/m$p;->s:LP/m;

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
    iput-object p1, p0, LP/m$p;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LP/m$p;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LP/m$p;->t:I

    .line 9
    .line 10
    iget-object p1, p0, LP/m$p;->s:LP/m;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, v0, p0}, LP/m;->p(LP/m;Lg6/p;LX5/g;LX5/d;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
