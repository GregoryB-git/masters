.class public final LX2/n$b;
.super LX2/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LX2/n;-><init>(LX2/n$a;)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, LX2/n$b;->d:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public d(II)LX2/n;
    .locals 0

    .line 1
    return-object p0
.end method

.method public e(JJ)LX2/n;
    .locals 0

    .line 1
    return-object p0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)LX2/n;
    .locals 0

    .line 1
    return-object p0
.end method

.method public g(ZZ)LX2/n;
    .locals 0

    .line 1
    return-object p0
.end method

.method public h(ZZ)LX2/n;
    .locals 0

    .line 1
    return-object p0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, LX2/n$b;->d:I

    .line 2
    .line 3
    return v0
.end method
