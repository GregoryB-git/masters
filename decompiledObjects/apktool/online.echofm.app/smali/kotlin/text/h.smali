.class public abstract Lkotlin/text/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/text/h;->c(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/util/regex/MatchResult;I)Ll6/c;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/text/h;->d(Ljava/util/regex/MatchResult;I)Ll6/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/text/g;

    invoke-direct {v0, p0, p1}, Lkotlin/text/g;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final d(Ljava/util/regex/MatchResult;I)Ll6/c;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->start(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->end(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0, p0}, Ll6/d;->g(II)Ll6/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
