.class public LX2/k$a;
.super LX2/k$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX2/k;->H()Ljava/util/Iterator;
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
    iput-object p1, p0, LX2/k$a;->s:LX2/k;

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
.method public d(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX2/k$a;->s:LX2/k;

    .line 2
    .line 3
    invoke-static {v0, p1}, LX2/k;->b(LX2/k;I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
