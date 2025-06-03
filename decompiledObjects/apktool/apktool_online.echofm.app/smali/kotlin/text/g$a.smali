.class public final Lkotlin/text/g$a;
.super LW5/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/text/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/g;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Lkotlin/text/g;


# direct methods
.method public constructor <init>(Lkotlin/text/g;)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/g$a;->o:Lkotlin/text/g;

    invoke-direct {p0}, LW5/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/text/g$a;->o:Lkotlin/text/g;

    invoke-static {v0}, Lkotlin/text/g;->b(Lkotlin/text/g;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lkotlin/text/d;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    check-cast p1, Lkotlin/text/d;

    invoke-virtual {p0, p1}, Lkotlin/text/g$a;->d(Lkotlin/text/d;)Z

    move-result p1

    return p1
.end method

.method public bridge d(Lkotlin/text/d;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, LW5/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Lkotlin/text/d;
    .locals 3

    iget-object v0, p0, Lkotlin/text/g$a;->o:Lkotlin/text/g;

    invoke-static {v0}, Lkotlin/text/g;->b(Lkotlin/text/g;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/text/h;->b(Ljava/util/regex/MatchResult;I)Ll6/c;

    move-result-object v0

    invoke-virtual {v0}, Ll6/c;->q()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    new-instance v1, Lkotlin/text/d;

    iget-object v2, p0, Lkotlin/text/g$a;->o:Lkotlin/text/g;

    invoke-static {v2}, Lkotlin/text/g;->b(Lkotlin/text/g;)Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "group(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, Lkotlin/text/d;-><init>(Ljava/lang/String;Ll6/c;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    invoke-static {p0}, LW5/m;->g(Ljava/util/Collection;)Ll6/c;

    move-result-object v0

    invoke-static {v0}, LW5/m;->n(Ljava/lang/Iterable;)Ln6/b;

    move-result-object v0

    new-instance v1, Lkotlin/text/g$a$a;

    invoke-direct {v1, p0}, Lkotlin/text/g$a$a;-><init>(Lkotlin/text/g$a;)V

    invoke-static {v0, v1}, Ln6/c;->d(Ln6/b;Lg6/l;)Ln6/b;

    move-result-object v0

    invoke-interface {v0}, Ln6/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
