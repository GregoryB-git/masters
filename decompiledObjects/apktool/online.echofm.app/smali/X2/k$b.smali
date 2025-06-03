.class public LX2/k$b;
.super LX2/k$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX2/k;->y()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic s:LX2/k;


# direct methods
.method public constructor <init>(LX2/k;)V
    .locals 1

    .line 1
    iput-object p1, p0, LX2/k$b;->s:LX2/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, LX2/k$e;-><init>(LX2/k;LX2/k$a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic d(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX2/k$b;->f(I)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public f(I)Ljava/util/Map$Entry;
    .locals 2

    .line 1
    new-instance v0, LX2/k$g;

    .line 2
    .line 3
    iget-object v1, p0, LX2/k$b;->s:LX2/k;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LX2/k$g;-><init>(LX2/k;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
