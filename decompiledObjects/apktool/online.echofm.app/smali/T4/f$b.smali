.class public final LT4/f$b;
.super LZ5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT4/f;->g(LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:Ljava/lang/Object;

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:LT4/f;

.field public r:I


# direct methods
.method public constructor <init>(LT4/f;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT4/f$b;->q:LT4/f;

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
    iput-object p1, p0, LT4/f$b;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LT4/f$b;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LT4/f$b;->r:I

    .line 9
    .line 10
    iget-object p1, p0, LT4/f$b;->q:LT4/f;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LT4/f;->g(LX5/d;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
